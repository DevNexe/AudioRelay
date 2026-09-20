package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class oq extends fg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ AtomicIntegerFieldUpdater j;
    public static final CQf k = new CQf();
    public static final QnHx l;
    public static final oq m;
    public final nq2<oq> g;
    public oq h;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    public static final class CQf implements nq2<oq> {
        @Override // defpackage.nq2
        public final oq B() {
            return jg.a.B();
        }

        public final void b() {
            jg.a.e();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            b();
        }

        @Override // defpackage.nq2
        public final void p0(oq oqVar) {
            jg.a.p0(oqVar);
        }
    }

    public static final class QnHx implements nq2<oq> {
        @Override // defpackage.nq2
        public final oq B() {
            return oq.m;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // defpackage.nq2
        public final void p0(oq oqVar) {
            if (!(oqVar == oq.m)) {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.".toString());
            }
        }
    }

    static {
        QnHx qnHx = new QnHx();
        l = qnHx;
        m = new oq(oc2.a, qnHx);
        i = AtomicReferenceFieldUpdater.newUpdater(oq.class, Object.class, "nextRef");
        j = AtomicIntegerFieldUpdater.newUpdater(oq.class, "refCount");
    }

    public oq() {
        throw null;
    }

    public oq(ByteBuffer byteBuffer, nq2 nq2Var) {
        super(byteBuffer);
        this.g = nq2Var;
        this.nextRef = null;
        this.refCount = 1;
        this.h = null;
    }

    public final oq f() {
        return (oq) i.getAndSet(this, null);
    }

    public final oq g() {
        return (oq) this.nextRef;
    }

    public final int h() {
        return this.refCount;
    }

    public final void i(nq2<oq> nq2Var) {
        int i2;
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            i2 = this.refCount;
            if (i2 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i3 = i2 - 1;
            atomicIntegerFieldUpdater = j;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
        if (i3 == 0) {
            oq oqVar = this.h;
            if (oqVar == null) {
                nq2<oq> nq2Var2 = this.g;
                if (nq2Var2 != null) {
                    nq2Var = nq2Var2;
                }
                nq2Var.p0(this);
                return;
            }
            if (!atomicIntegerFieldUpdater.compareAndSet(this, 0, -1)) {
                throw new IllegalStateException("Unable to unlink: buffer is in use.");
            }
            f();
            this.h = null;
            oqVar.i(nq2Var);
        }
    }

    public final void j() {
        if (!(this.h == null)) {
            throw new IllegalArgumentException("Unable to reset buffer with origin".toString());
        }
        d(0);
        int i2 = this.f;
        int i3 = this.d;
        this.b = i3;
        this.c = i3;
        this.e = i2 - i3;
        this.nextRef = null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public final void k(oq oqVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        if (oqVar == null) {
            f();
            return;
        }
        do {
            atomicReferenceFieldUpdater = i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, oqVar)) {
                z = true;
            }
            if (z) {
                throw new IllegalStateException("This chunk has already a next chunk.");
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        z = false;
        if (z) {
            throw new IllegalStateException("This chunk has already a next chunk.");
        }
    }

    public final void l() {
        int i2;
        do {
            i2 = this.refCount;
            if (i2 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i2 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!j.compareAndSet(this, i2, 1));
    }
}
