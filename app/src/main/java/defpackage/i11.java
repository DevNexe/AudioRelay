package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i11<T, U> extends MZ<T, U> {
    public final i91<? super T, ? extends U> y;

    public static final class CQf<T, U> extends c9<T, U> {
        public final i91<? super T, ? extends U> B;

        public CQf(gw4<? super U> gw4Var, i91<? super T, ? extends U> i91Var) {
            super(gw4Var);
            this.B = i91Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.gw4
        public final void g(T t) {
            if (this.z) {
                return;
            }
            int i = this.A;
            gw4<? super R> gw4Var = this.w;
            if (i != 0) {
                gw4Var.g(null);
                return;
            }
            try {
                U uApply = this.B.apply(t);
                mq2.b(uApply, "The mapper function returned a null value.");
                gw4Var.g((Object) uApply);
            } catch (Throwable th) {
                XTd3.w(th);
                this.x.cancel();
                onError(th);
            }
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            oh3<T> oh3Var = this.y;
            if (oh3Var == null || (i & 4) != 0) {
                return 0;
            }
            int iL = oh3Var.l(i);
            if (iL == 0) {
                return iL;
            }
            this.A = iL;
            return iL;
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

    public static final class QnHx<T, U> extends a9<T, U> {
        public final i91<? super T, ? extends U> B;

        public QnHx(d50<? super U> d50Var, i91<? super T, ? extends U> i91Var) {
            super(d50Var);
            this.B = i91Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.gw4
        public final void g(T t) {
            if (this.z) {
                return;
            }
            int i = this.A;
            d50<? super R> d50Var = this.w;
            if (i != 0) {
                d50Var.g(null);
                return;
            }
            try {
                U uApply = this.B.apply(t);
                mq2.b(uApply, "The mapper function returned a null value.");
                d50Var.g((Object) uApply);
            } catch (Throwable th) {
                XTd3.w(th);
                this.x.cancel();
                onError(th);
            }
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            oh3<T> oh3Var = this.y;
            if (oh3Var == null || (i & 4) != 0) {
                return 0;
            }
            int iL = oh3Var.l(i);
            if (iL == 0) {
                return iL;
            }
            this.A = iL;
            return iL;
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

    public i11(b11 b11Var, i71 i71Var) {
        super(b11Var);
        this.y = i71Var;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super U> gw4Var) {
        boolean z = gw4Var instanceof d50;
        i91<? super T, ? extends U> i91Var = this.y;
        a11<T> a11Var = this.x;
        if (z) {
            a11Var.e(new QnHx((d50) gw4Var, i91Var));
        } else {
            a11Var.e(new CQf(gw4Var, i91Var));
        }
    }
}
