package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ss2<T, U> extends Z<T, T> {
    public final us2<U> x;

    public static final class CQf<T> implements ht2<T> {
        public boolean A;
        public final ht2<? super T> w;
        public final KG4Z x;
        public vl0 y;
        public volatile boolean z;

        public CQf(eb4 eb4Var, KG4Z kg4z) {
            this.w = eb4Var;
            this.x = kg4z;
        }

        @Override // defpackage.ht2
        public final void b() {
            this.x.a();
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            KG4Z kg4z;
            vl0 vl0Var2;
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                do {
                    kg4z = this.x;
                    vl0Var2 = kg4z.get(0);
                    if (vl0Var2 == bm0.DISPOSED) {
                        vl0Var.a();
                        return;
                    }
                } while (!kg4z.compareAndSet(0, vl0Var2, vl0Var));
                if (vl0Var2 != null) {
                    vl0Var2.a();
                }
            }
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.A) {
                this.w.g(t);
            } else if (this.z) {
                this.A = true;
                this.w.g(t);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.x.a();
            this.w.onError(th);
        }
    }

    public final class QnHx implements ht2<U> {
        public final KG4Z w;
        public final CQf<T> x;
        public final eb4<T> y;
        public vl0 z;

        public QnHx(KG4Z kg4z, CQf cQf, eb4 eb4Var) {
            this.w = kg4z;
            this.x = cQf;
            this.y = eb4Var;
        }

        @Override // defpackage.ht2
        public final void b() {
            this.x.z = true;
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            KG4Z kg4z;
            vl0 vl0Var2;
            if (bm0.p(this.z, vl0Var)) {
                this.z = vl0Var;
                do {
                    kg4z = this.w;
                    vl0Var2 = kg4z.get(1);
                    if (vl0Var2 == bm0.DISPOSED) {
                        vl0Var.a();
                        return;
                    }
                } while (!kg4z.compareAndSet(1, vl0Var2, vl0Var));
                if (vl0Var2 != null) {
                    vl0Var2.a();
                }
            }
        }

        @Override // defpackage.ht2
        public final void g(U u) {
            this.z.a();
            this.x.z = true;
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.w.a();
            this.y.onError(th);
        }
    }

    public ss2(vq2 vq2Var, et2 et2Var) {
        super(vq2Var);
        this.x = et2Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        eb4 eb4Var = new eb4(ht2Var);
        KG4Z kg4z = new KG4Z();
        eb4Var.c(kg4z);
        CQf cQf = new CQf(eb4Var, kg4z);
        this.x.a(new QnHx(kg4z, cQf, eb4Var));
        this.w.a(cQf);
    }
}
