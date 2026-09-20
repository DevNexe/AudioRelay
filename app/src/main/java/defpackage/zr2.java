package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zr2<T> extends qw implements p91<T> {
    public final us2<T> w;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public final nx w;
        public vl0 x;

        public QnHx(nx nxVar) {
            this.w = nxVar;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.x.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            this.x = vl0Var;
            this.w.c(this);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.x.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.w.onError(th);
        }
    }

    public zr2(vq2 vq2Var) {
        this.w = vq2Var;
    }

    @Override // defpackage.p91
    public final vq2<T> a() {
        return new yr2(this.w);
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        this.w.a(new QnHx(nxVar));
    }
}
