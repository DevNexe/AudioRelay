package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zw extends qw {
    public final tx w;
    public final TimeUnit y;
    public final c54 z;
    public final long x = 50;
    public final boolean A = false;

    public static final class QnHx extends AtomicReference<vl0> implements nx, Runnable, vl0 {
        public final boolean A;
        public Throwable B;
        public final nx w;
        public final long x;
        public final TimeUnit y;
        public final c54 z;

        public QnHx(nx nxVar, long j, TimeUnit timeUnit, c54 c54Var, boolean z) {
            this.w = nxVar;
            this.x = j;
            this.y = timeUnit;
            this.z = c54Var;
            this.A = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.nx
        public final void b() {
            bm0.g(this, this.z.c(this, this.x, this.y));
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            if (bm0.n(this, vl0Var)) {
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            this.B = th;
            bm0.g(this, this.z.c(this, this.A ? this.x : 0L, this.y));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.B;
            this.B = null;
            nx nxVar = this.w;
            if (th != null) {
                nxVar.onError(th);
            } else {
                nxVar.b();
            }
        }
    }

    public zw(fx fxVar, TimeUnit timeUnit, c54 c54Var) {
        this.w = fxVar;
        this.y = timeUnit;
        this.z = c54Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        this.w.b(new QnHx(nxVar, this.x, this.y, this.z, this.A));
    }
}
