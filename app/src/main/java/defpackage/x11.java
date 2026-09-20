package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x11<T> extends MZ<T, T> {
    public final pa3<? super T> y;

    public static final class QnHx<T> implements v11<T>, mw4 {
        public final gw4<? super T> w;
        public final pa3<? super T> x;
        public mw4 y;
        public boolean z;

        public QnHx(gw4<? super T> gw4Var, pa3<? super T> pa3Var) {
            this.w = gw4Var;
            this.x = pa3Var;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            this.y.a(j);
        }

        @Override // defpackage.gw4
        public final void b() {
            if (this.z) {
                return;
            }
            this.z = true;
            this.w.b();
        }

        @Override // defpackage.mw4
        public final void cancel() {
            this.y.cancel();
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            if (qw4.m(this.y, mw4Var)) {
                this.y = mw4Var;
                this.w.d(this);
            }
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            if (this.z) {
                return;
            }
            try {
                boolean zTest = this.x.test(t);
                gw4<? super T> gw4Var = this.w;
                if (zTest) {
                    gw4Var.g(t);
                    return;
                }
                this.z = true;
                this.y.cancel();
                gw4Var.b();
            } catch (Throwable th) {
                XTd3.w(th);
                this.y.cancel();
                onError(th);
            }
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            if (this.z) {
                m14.b(th);
            } else {
                this.z = true;
                this.w.onError(th);
            }
        }
    }

    public x11(a11 a11Var, k14 k14Var) {
        super(a11Var);
        this.y = k14Var;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.e(new QnHx(gw4Var, this.y));
    }
}
