package io.ktor.utils.io.jvm.javaio;

import com.unity3d.services.core.request.metrics.AdOperationMetric;
import defpackage.C0239D;
import defpackage.am0;
import defpackage.be5;
import defpackage.cx1;
import defpackage.f75;
import defpackage.fq3;
import defpackage.gu0;
import defpackage.ib;
import defpackage.if0;
import defpackage.j81;
import defpackage.jf3;
import defpackage.la0;
import defpackage.ms1;
import defpackage.o93;
import defpackage.px4;
import defpackage.sb5;
import defpackage.sd5;
import defpackage.t52;
import defpackage.ur1;
import defpackage.va0;
import defpackage.z80;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QnHx {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(QnHx.class, Object.class, AdOperationMetric.INIT_STATE);
    public final ms1 a;
    public final F1 b;
    public final am0 c;
    public int d;
    public int e;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    public static final class CQf extends cx1 implements j81<Throwable, sd5> {
        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            Throwable th2 = th;
            if (th2 != null) {
                QnHx.this.b.x(new fq3.QnHx(th2));
            }
            return sd5.a;
        }
    }

    public static final class F1 implements z80<sd5> {
        public final la0 w;

        public F1() {
            la0 la0VarA;
            ms1 ms1Var = QnHx.this.a;
            if (ms1Var != null) {
                be5 be5Var = be5.y;
                be5Var.getClass();
                la0VarA = la0.QnHx.a(be5Var, ms1Var);
            } else {
                la0VarA = be5.y;
            }
            this.w = la0VarA;
        }

        @Override // defpackage.z80
        public final la0 getContext() {
            return this.w;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.z80
        public final void x(Object obj) {
            Object obj2;
            boolean z;
            boolean z2;
            Throwable thA;
            ms1 ms1Var;
            Object objA = fq3.a(obj);
            if (objA == null) {
                objA = sd5.a;
            }
            QnHx qnHx = QnHx.this;
            do {
                obj2 = qnHx.state;
                z = obj2 instanceof Thread;
                z2 = true;
                if (!(z ? true : obj2 instanceof z80 ? true : ur1.a(obj2, this))) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.f;
                while (!atomicReferenceFieldUpdater.compareAndSet(qnHx, obj2, objA)) {
                    if (atomicReferenceFieldUpdater.get(qnHx) != obj2) {
                        z2 = false;
                        break;
                    }
                }
            } while (!z2);
            if (z) {
                o93.a().b(obj2);
            } else if ((obj2 instanceof z80) && (thA = fq3.a(obj)) != null) {
                ((z80) obj2).x(new fq3.QnHx(thA));
            }
            if ((obj instanceof fq3.QnHx) && !(fq3.a(obj) instanceof CancellationException) && (ms1Var = QnHx.this.a) != null) {
                ms1Var.m(null);
            }
            am0 am0Var = QnHx.this.c;
            if (am0Var != null) {
                am0Var.a();
            }
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.QnHx$QnHx, reason: collision with other inner class name */
    @if0(c = "io.ktor.utils.io.jvm.javaio.BlockingAdapter$block$1", f = "Blocking.kt", l = {186}, m = "invokeSuspend")
    public static final class C0147QnHx extends px4 implements j81<z80<? super sd5>, Object> {
        public int A;

        public C0147QnHx(z80<? super C0147QnHx> z80Var) {
            super(1, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                this.A = 1;
                if (QnHx.this.a(this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.j81
        public final Object invoke(z80<? super sd5> z80Var) {
            return QnHx.this.new C0147QnHx(z80Var).i(sd5.a);
        }
    }

    public QnHx() {
        this(null);
    }

    public abstract Object a(z80<? super sd5> z80Var);

    public final int b(byte[] bArr, int i, int i2) throws Throwable {
        Object noWhenBranchMatchedException;
        boolean z;
        this.d = i;
        this.e = i2;
        Object objCurrentThread = Thread.currentThread();
        z80 z80Var = null;
        do {
            Object obj = this.state;
            if (obj instanceof z80) {
                z80Var = (z80) obj;
                noWhenBranchMatchedException = objCurrentThread;
            } else {
                if (obj instanceof sd5) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (ur1.a(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, noWhenBranchMatchedException)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        z80Var.x(bArr);
        if (this.state == objCurrentThread) {
            if (!(o93.a() != jf3.a)) {
                ((t52) ib.a.getValue()).a("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
            }
            while (true) {
                gu0 gu0Var = f75.a.get();
                long jI0 = gu0Var != null ? gu0Var.i0() : Long.MAX_VALUE;
                if (this.state != objCurrentThread) {
                    break;
                }
                if (jI0 > 0) {
                    o93.a().a(jI0);
                }
            }
        }
        Object obj2 = this.state;
        if (obj2 instanceof Throwable) {
            throw ((Throwable) obj2);
        }
        return this.result;
    }

    public QnHx(ms1 ms1Var) {
        this.a = ms1Var;
        F1 f1 = new F1();
        this.b = f1;
        this.state = this;
        this.result = 0;
        this.c = ms1Var != null ? ms1Var.r0(new CQf()) : null;
        C0147QnHx c0147QnHx = new C0147QnHx(null);
        sb5.d(1, c0147QnHx);
        c0147QnHx.invoke(f1);
        if (!(this.state != this)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
