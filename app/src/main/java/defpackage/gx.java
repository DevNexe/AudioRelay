package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gx<T> extends qw {
    public final sg3<T> w;

    public static final class QnHx<T> implements v11<T>, vl0 {
        public final nx w;
        public mw4 x;

        public QnHx(nx nxVar) {
            this.w = nxVar;
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
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            this.w.onError(th);
        }
    }

    public gx(q11 q11Var) {
        this.w = q11Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        this.w.a(new QnHx(nxVar));
    }
}
