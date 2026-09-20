package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class os2<T> extends Z<T, T> {
    public final ba<T, T, T> x;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public boolean A;
        public final ht2<? super T> w;
        public final ba<T, T, T> x;
        public vl0 y;
        public T z;

        public QnHx(ht2<? super T> ht2Var, ba<T, T, T> baVar) {
            this.w = ht2Var;
            this.x = baVar;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.a();
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
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y.e();
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.A) {
                return;
            }
            T t2 = this.z;
            ht2<? super T> ht2Var = this.w;
            if (t2 == null) {
                this.z = t;
                ht2Var.g(t);
                return;
            }
            try {
                T tApply = this.x.apply(t2, t);
                mq2.b(tApply, "The value returned by the accumulator is null");
                this.z = tApply;
                ht2Var.g(tApply);
            } catch (Throwable th) {
                XTd3.w(th);
                this.y.a();
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

    public os2(vq2 vq2Var, a83 a83Var) {
        super(vq2Var);
        this.x = a83Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x));
    }
}
