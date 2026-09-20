package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t11<T> extends xa2<T> implements n91<T> {
    public final a11<T> w;

    public static final class QnHx<T> implements v11<T>, vl0 {
        public final gb2<? super T> w;
        public mw4 x;
        public boolean y;
        public T z;

        public QnHx(gb2<? super T> gb2Var) {
            this.w = gb2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.x.cancel();
            this.x = qw4.CANCELLED;
        }

        @Override // defpackage.gw4
        public final void b() {
            if (this.y) {
                return;
            }
            this.y = true;
            this.x = qw4.CANCELLED;
            T t = this.z;
            this.z = null;
            gb2<? super T> gb2Var = this.w;
            if (t == null) {
                gb2Var.b();
            } else {
                gb2Var.onSuccess(t);
            }
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
            if (this.y) {
                return;
            }
            if (this.z == null) {
                this.z = t;
                return;
            }
            this.y = true;
            this.x.cancel();
            this.x = qw4.CANCELLED;
            this.w.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            if (this.y) {
                m14.b(th);
                return;
            }
            this.y = true;
            this.x = qw4.CANCELLED;
            this.w.onError(th);
        }
    }

    public t11(q11 q11Var) {
        this.w = q11Var;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super T> gb2Var) {
        this.w.e(new QnHx(gb2Var));
    }

    @Override // defpackage.n91
    public final s11 d() {
        return new s11(this.w, null, false);
    }
}
