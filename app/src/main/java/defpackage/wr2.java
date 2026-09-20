package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wr2<T> extends vq2<T> {
    public final sg3<? extends T> w;

    public static final class QnHx<T> implements v11<T>, vl0 {
        public final ht2<? super T> w;
        public mw4 x;

        public QnHx(ht2<? super T> ht2Var) {
            this.w = ht2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.x.cancel();
            this.x = qw4.CANCELLED;
        }

        @Override // defpackage.gw4
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            if (qw4.m(this.x, mw4Var)) {
                this.x = mw4Var;
                this.w.c(this);
                mw4Var.a(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.x == qw4.CANCELLED;
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            this.w.g(t);
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            this.w.onError(th);
        }
    }

    public wr2(sg3<? extends T> sg3Var) {
        this.w = sg3Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var));
    }
}
