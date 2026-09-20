package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bt2<T> extends Z<T, T> {
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
            if (this.z) {
                return;
            }
            this.z = true;
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
            if (this.z) {
                return;
            }
            try {
                boolean zTest = this.x.test(t);
                ht2<? super T> ht2Var = this.w;
                if (zTest) {
                    ht2Var.g(t);
                    return;
                }
                this.z = true;
                this.y.a();
                ht2Var.b();
            } catch (Throwable th) {
                XTd3.w(th);
                this.y.a();
                onError(th);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.z) {
                m14.b(th);
            } else {
                this.z = true;
                this.w.onError(th);
            }
        }
    }

    public bt2(vq2 vq2Var, tz4 tz4Var) {
        super(vq2Var);
        this.x = tz4Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x));
    }
}
