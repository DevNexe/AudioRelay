package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ci3<T> implements gw4<T> {
    public final long w;
    public mw4 x;
    public final NUlFixed y;

    @if0(c = "kotlinx.coroutines.reactive.ReactiveSubscriber", f = "ReactiveFlow.kt", l = {129}, m = "takeNextOrNull")
    public static final class QnHx extends b90 {
        public final /* synthetic */ ci3<T> A;
        public int B;
        public /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ci3<T> ci3Var, z80<? super QnHx> z80Var) {
            super(z80Var);
            this.A = ci3Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return this.A.a(this);
        }
    }

    public ci3(int i, lg lgVar, long j) {
        this.w = j;
        this.y = AY.a(i == 0 ? 1 : i, lgVar, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(z80<? super T> z80Var) throws Throwable {
        QnHx qnHx;
        Object objD;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.B = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(this, z80Var);
            }
        } else {
            qnHx = new QnHx(this, z80Var);
        }
        Object obj = qnHx.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.B;
        if (i2 == 0) {
            C0239D.H(obj);
            qnHx.B = 1;
            objD = this.y.d(qnHx);
            if (objD == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
            objD = ((ap) obj).a;
        }
        Throwable thA = ap.a(objD);
        if (thA != null) {
            throw thA;
        }
        if (!(objD instanceof ap.CQf)) {
            return objD;
        }
        ap.a(objD);
        return null;
    }

    @Override // defpackage.gw4
    public final void b() {
        this.y.a(null);
    }

    @Override // defpackage.gw4
    public final void d(mw4 mw4Var) {
        this.x = mw4Var;
        if (mw4Var != null) {
            mw4Var.a(this.w);
        } else {
            ur1.e("subscription");
            throw null;
        }
    }

    @Override // defpackage.gw4
    public final void g(T t) {
        NUlFixed nUl = this.y;
        if (!(nUl.H(t) instanceof ap.CQf)) {
            return;
        }
        throw new IllegalArgumentException(("Element " + t + " was not added to channel because it was full, " + nUl).toString());
    }

    @Override // defpackage.gw4
    public final void onError(Throwable th) {
        this.y.a(th);
    }
}
