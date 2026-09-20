package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zx<T> extends vq2<T> {
    public final tx w;

    public static final class QnHx extends g9<Void> implements nx {
        public final ht2<?> w;
        public vl0 x;

        public QnHx(ht2<?> ht2Var) {
            this.w = ht2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.x.a();
        }

        @Override // defpackage.nx
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.nx
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.x, vl0Var)) {
                this.x = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.uk4
        public final void clear() {
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.x.e();
        }

        @Override // defpackage.uk4
        public final boolean isEmpty() {
            return true;
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            return i & 2;
        }

        @Override // defpackage.nx
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // defpackage.uk4
        public final /* bridge */ /* synthetic */ Object poll() {
            return null;
        }
    }

    public zx(fx fxVar) {
        this.w = fxVar;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.b(new QnHx(ht2Var));
    }
}
