package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cs2<T, U> extends Z<T, U> {
    public final i91<? super T, ? extends U> x;

    public static final class QnHx<T, U> extends b9<T, U> {
        public final i91<? super T, ? extends U> B;

        public QnHx(ht2<? super U> ht2Var, i91<? super T, ? extends U> i91Var) {
            super(ht2Var);
            this.B = i91Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.z) {
                return;
            }
            int i = this.A;
            ht2<? super R> ht2Var = this.w;
            if (i != 0) {
                ht2Var.g(null);
                return;
            }
            try {
                U uApply = this.B.apply(t);
                mq2.b(uApply, "The mapper function returned a null value.");
                ht2Var.g((Object) uApply);
            } catch (Throwable th) {
                XTd3.w(th);
                this.x.a();
                onError(th);
            }
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            return d(i);
        }

        @Override // defpackage.uk4
        public final U poll() {
            T tPoll = this.y.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.B.apply(tPoll);
            mq2.b(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public cs2(us2<T> us2Var, i91<? super T, ? extends U> i91Var) {
        super(us2Var);
        this.x = i91Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super U> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x));
    }
}
