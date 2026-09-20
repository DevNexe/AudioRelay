package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class db2<T> extends xa2<T> {
    public final rl4<T> w;
    public final pa3<? super T> x;

    public static final class QnHx<T> implements ml4<T>, vl0 {
        public final gb2<? super T> w;
        public final pa3<? super T> x;
        public vl0 y;

        public QnHx(gb2<? super T> gb2Var, pa3<? super T> pa3Var) {
            this.w = gb2Var;
            this.x = pa3Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            vl0 vl0Var = this.y;
            this.y = bm0.DISPOSED;
            vl0Var.a();
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y.e();
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            gb2<? super T> gb2Var = this.w;
            try {
                if (this.x.test(t)) {
                    gb2Var.onSuccess(t);
                } else {
                    gb2Var.b();
                }
            } catch (Throwable th) {
                XTd3.w(th);
                gb2Var.onError(th);
            }
        }
    }

    public db2(il4 il4Var, n71 n71Var) {
        this.w = il4Var;
        this.x = n71Var;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super T> gb2Var) {
        this.w.b(new QnHx(gb2Var, this.x));
    }
}
