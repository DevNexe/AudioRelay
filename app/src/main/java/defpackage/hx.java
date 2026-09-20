package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hx<T> extends qw {
    public final rl4<T> w;

    public static final class QnHx<T> implements ml4<T> {
        public final nx w;

        public QnHx(nx nxVar) {
            this.w = nxVar;
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            this.w.c(vl0Var);
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            this.w.b();
        }
    }

    public hx(bl4 bl4Var) {
        this.w = bl4Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        this.w.b(new QnHx(nxVar));
    }
}
