package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wj implements oj, fk, nk {
    public static final /* synthetic */ AtomicLongFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    private volatile /* synthetic */ int _availableForRead;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _lastReadView;
    private volatile /* synthetic */ long _totalBytesRead;
    private volatile /* synthetic */ long _totalBytesWritten;
    private volatile /* synthetic */ int channelSize;
    private volatile /* synthetic */ int lastReadAvailable$delegate;
    private volatile /* synthetic */ Object lastReadView$delegate;

    @if0(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {527}, m = "readAvailable$suspendImpl")
    public static final class CQf extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public wj z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return wj.u(wj.this, null, 0, 0, this);
        }
    }

    @if0(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {483}, m = "readAvailable$ktor_io")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public wj z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return wj.this.t(null, this);
        }
    }

    static {
        AtomicLongFieldUpdater.newUpdater(wj.class, "_totalBytesRead");
        b = AtomicLongFieldUpdater.newUpdater(wj.class, "_totalBytesWritten");
        AtomicIntegerFieldUpdater.newUpdater(wj.class, "_availableForRead");
        c = AtomicIntegerFieldUpdater.newUpdater(wj.class, "channelSize");
        d = AtomicReferenceFieldUpdater.newUpdater(wj.class, Object.class, "_closed");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object u(wj wjVar, byte[] bArr, int i, int i2, z80 z80Var) throws Throwable {
        CQf cQf;
        if (z80Var instanceof CQf) {
            cQf = (CQf) z80Var;
            int i3 = cQf.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cQf.C = i3 - Integer.MIN_VALUE;
            } else {
                cQf = wjVar.new CQf(z80Var);
            }
        } else {
            cQf = wjVar.new CQf(z80Var);
        }
        Object obj = cQf.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i4 = cQf.C;
        if (i4 == 0) {
            C0239D.H(obj);
            Throwable thN = wjVar.n();
            if (thN != null) {
                throw thN;
            }
            if (wjVar.s() && wjVar._availableForRead == 0) {
                return new Integer(-1);
            }
            if (i2 == 0) {
                return new Integer(0);
            }
            if (wjVar._availableForRead == 0) {
                cQf.z = wjVar;
                cQf.getClass();
                cQf.C = 1;
                wjVar.j(1, cQf);
                return va0Var;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wjVar = cQf.z;
            C0239D.H(obj);
        }
        wjVar.getClass();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object v(wj wjVar, oq oqVar, z80 z80Var) {
        xj xjVar;
        fg fgVar;
        if (z80Var instanceof xj) {
            xjVar = (xj) z80Var;
            int i = xjVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                xjVar.D = i - Integer.MIN_VALUE;
            } else {
                xjVar = new xj(wjVar, z80Var);
            }
        } else {
            xjVar = new xj(wjVar, z80Var);
        }
        Object obj = xjVar.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = xjVar.D;
        if (i2 == 0) {
            C0239D.H(obj);
            xjVar.z = wjVar;
            xjVar.A = oqVar;
            xjVar.D = 1;
            if (wjVar.i(1, xjVar) == va0Var) {
                fgVar = oqVar;
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fg fgVar2 = xjVar.A;
            wjVar = xjVar.z;
            C0239D.H(obj);
            fgVar = fgVar2;
        }
        fgVar = oqVar;
        int i3 = fgVar.c;
        wjVar.getClass();
        Th.C(fgVar, fgVar.c - fgVar.b);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object w(defpackage.wj r6, byte[] r7, int r8, defpackage.z80 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.yj
            if (r0 == 0) goto L13
            r0 = r9
            yj r0 = (defpackage.yj) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            yj r0 = new yj
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.D
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r6 = r0.C
            int r7 = r0.B
            byte[] r8 = r0.A
            wj r2 = r0.z
            defpackage.C0239D.H(r9)
            r9 = r7
            r7 = r2
            goto L55
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            defpackage.C0239D.H(r9)
            r9 = 0
            int r8 = r8 + r9
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L42:
            if (r9 >= r6) goto L68
            r0.z = r7
            r0.A = r8
            r0.B = r9
            r0.C = r6
            r0.F = r3
            sd5 r2 = r7.i(r3, r0)
            if (r2 != r1) goto L55
            return r1
        L55:
            int r2 = r7.k()
            int r4 = r6 - r9
            int r2 = java.lang.Math.min(r2, r4)
            r4 = 0
            defpackage.Th.D(r4, r8, r9, r2)
            int r9 = r9 + r2
            r7.g(r2)
            goto L42
        L68:
            sd5 r6 = defpackage.sd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.w(wj, byte[], int, z80):java.lang.Object");
    }

    @Override // defpackage.nk
    public final boolean a(Throwable th) {
        boolean z;
        jt jtVar = th == null ? qe0.x : new jt(th);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, jtVar)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != null) {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        if (th != null) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.nk
    public final Object c(oq oqVar, gk.QnHx qnHx) {
        v(this, oqVar, qnHx);
        return va0.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.nk
    public final Object d(byte[] bArr, int i, px4 px4Var) {
        return w(this, bArr, i, px4Var);
    }

    @Override // defpackage.nk
    public final boolean f() {
        return false;
    }

    @Override // defpackage.nk
    public final void flush() {
        throw null;
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(GM.a("Can't write negative amount of bytes: ", i).toString());
        }
        c.getAndAdd(this, i);
        b.addAndGet(this, i);
        if (this.channelSize >= 0) {
            if (s() || k() == 0) {
                throw null;
            }
        } else {
            throw new IllegalStateException(("Readable bytes count is negative: " + this.channelSize + ", " + i + " in " + this).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final sd5 h(int i, z80 z80Var) throws Throwable {
        pj pjVar;
        wj wjVar;
        if (z80Var instanceof pj) {
            pjVar = (pj) z80Var;
            int i2 = pjVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pjVar.D = i2 - Integer.MIN_VALUE;
            } else {
                pjVar = new pj(this, z80Var);
            }
        } else {
            pjVar = new pj(this, z80Var);
        }
        Object obj = pjVar.B;
        int i3 = pjVar.D;
        if (i3 == 0) {
            C0239D.H(obj);
            wjVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = pjVar.A;
            wjVar = pjVar.z;
            C0239D.H(obj);
        }
        if (wjVar._availableForRead >= i || wjVar.r()) {
            return sd5.a;
        }
        new tj(wjVar, i);
        pjVar.z = wjVar;
        pjVar.A = i;
        pjVar.D = 1;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final sd5 i(int i, z80 z80Var) throws Throwable {
        uj ujVar;
        wj wjVar;
        if (z80Var instanceof uj) {
            ujVar = (uj) z80Var;
            int i2 = ujVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ujVar.B = i2 - Integer.MIN_VALUE;
            } else {
                ujVar = new uj(this, z80Var);
            }
        } else {
            ujVar = new uj(this, z80Var);
        }
        Object obj = ujVar.z;
        int i3 = ujVar.B;
        if (i3 == 0) {
            C0239D.H(obj);
            wjVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
            i = 0;
            wjVar = null;
        }
        if (wjVar.k() >= i || wjVar.s()) {
            return sd5.a;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void j(int i, z80 z80Var) {
        vj vjVar;
        wj wjVar;
        if (z80Var instanceof vj) {
            vjVar = (vj) z80Var;
            int i2 = vjVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vjVar.C = i2 - Integer.MIN_VALUE;
            } else {
                vjVar = new vj(this, z80Var);
            }
        } else {
            vjVar = new vj(this, z80Var);
        }
        Object obj = vjVar.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i3 = vjVar.C;
        if (i3 == 0) {
            C0239D.H(obj);
            if (!(i >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            vjVar.z = this;
            vjVar.C = 1;
            if (h(i, vjVar) == va0Var) {
                return;
            } else {
                wjVar = this;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wjVar = vjVar.z;
            C0239D.H(obj);
        }
        wjVar.getClass();
        throw null;
    }

    public final int k() {
        return Math.max(0, 4088 - this.channelSize);
    }

    @Override // defpackage.fk
    public final boolean l(Throwable th) {
        if (n() == null && !s()) {
            if (th == null) {
                th = new CancellationException("Channel cancelled");
            }
            a(th);
        }
        return false;
    }

    @Override // defpackage.fk
    public final Object m(oq oqVar, z80<? super Integer> z80Var) {
        return t(oqVar, z80Var);
    }

    @Override // defpackage.fk
    public final Throwable n() {
        jt jtVar = (jt) this._closed;
        if (jtVar != null) {
            return jtVar.a;
        }
        return null;
    }

    @Override // defpackage.fk
    public final int o() {
        return this._availableForRead;
    }

    @Override // defpackage.fk
    public final Object p(long j, z80<? super hk> z80Var) throws Throwable {
        Throwable thN = n();
        if (thN != null) {
            throw thN;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oq.i;
        ByteBuffer byteBuffer = oc2.a;
        throw null;
    }

    @Override // defpackage.fk
    public final Object q(byte[] bArr, int i, int i2, b90 b90Var) {
        return u(this, bArr, i, i2, b90Var);
    }

    @Override // defpackage.fk
    public final boolean r() {
        jt jtVar = (jt) this._closed;
        if ((jtVar != null ? jtVar.a : null) != null) {
            return true;
        }
        return s() && this.channelSize == 0;
    }

    public final boolean s() {
        return this._closed != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(fg fgVar, z80<? super Integer> z80Var) throws Throwable {
        QnHx qnHx;
        wj wjVar;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.C = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 == 0) {
            C0239D.H(obj);
            Throwable thN = n();
            if (thN != null) {
                throw thN;
            }
            if (s() && this._availableForRead == 0) {
                return new Integer(-1);
            }
            if (fgVar.e - fgVar.c == 0) {
                return new Integer(0);
            }
            if (this._availableForRead == 0) {
                qnHx.z = this;
                qnHx.getClass();
                qnHx.C = 1;
                j(1, qnHx);
                return va0Var;
            }
            wjVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wjVar = qnHx.z;
            C0239D.H(obj);
        }
        wjVar.getClass();
        throw null;
    }
}
