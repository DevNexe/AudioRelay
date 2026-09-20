package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class ps2<T, R> extends Z<T, R> {
    public final ba<R, ? super T, R> x;
    public final Callable<R> y;

    public static final class QnHx<T, R> implements ht2<T>, vl0 {
        public boolean A;
        public final ht2<? super R> w;
        public final ba<R, ? super T, R> x;
        public R y;
        public vl0 z;

        public QnHx(ht2<? super R> ht2Var, ba<R, ? super T, R> baVar, R r) {
            this.w = ht2Var;
            this.x = baVar;
            this.y = r;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.z.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.A) {
                return;
            }
            this.A = true;
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.z, vl0Var)) {
                this.z = vl0Var;
                ht2<? super R> ht2Var = this.w;
                ht2Var.c(this);
                ht2Var.g(this.y);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.z.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.A) {
                return;
            }
            try {
                R rApply = this.x.apply(this.y, t);
                mq2.b(rApply, "The accumulator returned a null value");
                this.y = rApply;
                this.w.g(rApply);
            } catch (Throwable th) {
                XTd3.w(th);
                this.z.a();
                onError(th);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.A) {
                m14.b(th);
            } else {
                this.A = true;
                this.w.onError(th);
            }
        }
    }

    public ps2(cs2 cs2Var, m91.PRnFixed pRn, i83 i83Var) {
        super(cs2Var);
        this.x = i83Var;
        this.y = pRn;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super R> ht2Var) {
        try {
            R rCall = this.y.call();
            mq2.b(rCall, "The seed supplied is null");
            this.w.a(new QnHx(ht2Var, this.x, rCall));
        } catch (Throwable th) {
            XTd3.w(th);
            ht2Var.c(yr0.INSTANCE);
            ht2Var.onError(th);
        }
    }
}
