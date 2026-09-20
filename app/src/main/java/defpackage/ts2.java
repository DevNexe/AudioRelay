package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ts2<T> extends Z<T, T> {
    public final pa3<? super T> x;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public final ht2<? super T> w;
        public final pa3<? super T> x;
        public vl0 y;
        public boolean z;

        public QnHx(ht2<? super T> ht2Var, pa3<? super T> pa3Var) {
            this.w = ht2Var;
            this.x = pa3Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.ht2
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

        @Override // defpackage.ht2
        public final void g(T t) {
            boolean z = this.z;
            ht2<? super T> ht2Var = this.w;
            if (z) {
                ht2Var.g(t);
                return;
            }
            try {
                if (this.x.test(t)) {
                    return;
                }
                this.z = true;
                ht2Var.g(t);
            } catch (Throwable th) {
                XTd3.w(th);
                this.y.a();
                ht2Var.onError(th);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.w.onError(th);
        }
    }

    public ts2(hr2 hr2Var, tn2 tn2Var) {
        super(hr2Var);
        this.x = tn2Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x));
    }
}
