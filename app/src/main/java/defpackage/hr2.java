package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hr2<T, K> extends Z<T, T> {
    public final i91<? super T, K> x;
    public final ca<? super K, ? super K> y;

    public static final class QnHx<T, K> extends b9<T, T> {
        public final i91<? super T, K> B;
        public final ca<? super K, ? super K> C;
        public K D;
        public boolean E;

        public QnHx(ht2<? super T> ht2Var, i91<? super T, K> i91Var, ca<? super K, ? super K> caVar) {
            super(ht2Var);
            this.B = i91Var;
            this.C = caVar;
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
                ht2Var.g((Object) t);
                return;
            }
            try {
                K kApply = this.B.apply(t);
                if (this.E) {
                    ca<? super K, ? super K> caVar = this.C;
                    K k = this.D;
                    ((mq2.QnHx) caVar).getClass();
                    boolean zA = mq2.a(k, kApply);
                    this.D = kApply;
                    if (zA) {
                        return;
                    }
                } else {
                    this.E = true;
                    this.D = kApply;
                }
                ht2Var.g((Object) t);
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
        public final T poll() {
            while (true) {
                T tPoll = this.y.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.B.apply(tPoll);
                if (!this.E) {
                    this.E = true;
                    this.D = kApply;
                    return tPoll;
                }
                K k = this.D;
                ((mq2.QnHx) this.C).getClass();
                if (!mq2.a(k, kApply)) {
                    this.D = kApply;
                    return tPoll;
                }
                this.D = kApply;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr2(us2 us2Var) {
        super(us2Var);
        m91.FJCM fjcm = m91.a;
        mq2.QnHx qnHx = mq2.a;
        this.x = fjcm;
        this.y = qnHx;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x, this.y));
    }
}
