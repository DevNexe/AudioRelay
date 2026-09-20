package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class vx extends qw {
    public final tx w;
    public final TimeUnit y;
    public final c54 z;
    public final long x = 500;
    public final tx A = null;

    public static final class CQf implements nx {
        public final h40 w;
        public final AtomicBoolean x;
        public final nx y;

        public CQf(h40 h40Var, AtomicBoolean atomicBoolean, nx nxVar) {
            this.w = h40Var;
            this.x = atomicBoolean;
            this.y = nxVar;
        }

        @Override // defpackage.nx
        public final void b() {
            if (this.x.compareAndSet(false, true)) {
                this.w.a();
                this.y.b();
            }
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            this.w.b(vl0Var);
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            if (!this.x.compareAndSet(false, true)) {
                m14.b(th);
            } else {
                this.w.a();
                this.y.onError(th);
            }
        }
    }

    public final class QnHx implements Runnable {
        public final AtomicBoolean w;
        public final h40 x;
        public final nx y;

        /* JADX INFO: renamed from: vx$QnHx$QnHx, reason: collision with other inner class name */
        public final class C0217QnHx implements nx {
            public C0217QnHx() {
            }

            @Override // defpackage.nx
            public final void b() {
                QnHx qnHx = QnHx.this;
                qnHx.x.a();
                qnHx.y.b();
            }

            @Override // defpackage.nx
            public final void c(vl0 vl0Var) {
                QnHx.this.x.b(vl0Var);
            }

            @Override // defpackage.nx
            public final void onError(Throwable th) {
                QnHx qnHx = QnHx.this;
                qnHx.x.a();
                qnHx.y.onError(th);
            }
        }

        public QnHx(AtomicBoolean atomicBoolean, h40 h40Var, nx nxVar) {
            this.w = atomicBoolean;
            this.x = h40Var;
            this.y = nxVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.w.compareAndSet(false, true)) {
                this.x.f();
                vx vxVar = vx.this;
                tx txVar = vxVar.A;
                if (txVar != null) {
                    txVar.b(new C0217QnHx());
                } else {
                    this.y.onError(new TimeoutException(uu0.c(vxVar.x, vxVar.y)));
                }
            }
        }
    }

    public vx(zw zwVar, TimeUnit timeUnit, c54 c54Var) {
        this.w = zwVar;
        this.y = timeUnit;
        this.z = c54Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        h40 h40Var = new h40();
        nxVar.c(h40Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        h40Var.b(this.z.c(new QnHx(atomicBoolean, h40Var, nxVar), this.x, this.y));
        this.w.b(new CQf(h40Var, atomicBoolean, nxVar));
    }
}
