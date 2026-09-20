package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z14<T> extends b90 implements nz0<T> {
    public final la0 A;
    public final int B;
    public la0 C;
    public z80<? super sd5> D;
    public final nz0<T> z;

    public static final class QnHx extends cx1 implements x81<Integer, la0.CQf, Integer> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final Integer invoke(Integer num, la0.CQf cQf) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z14(nz0<? super T> nz0Var, la0 la0Var) {
        super(oo2.w, xr0.w);
        this.z = nz0Var;
        this.A = la0Var;
        this.B = ((Number) la0Var.i(0, QnHx.w)).intValue();
    }

    @Override // defpackage.nz0
    public final Object f(T t, z80<? super sd5> z80Var) {
        try {
            Object objM = m(z80Var, t);
            return objM == va0.COROUTINE_SUSPENDED ? objM : sd5.a;
        } catch (Throwable th) {
            this.C = new vm0(z80Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.b90, defpackage.z80
    public final la0 getContext() {
        la0 la0Var = this.C;
        return la0Var == null ? xr0.w : la0Var;
    }

    @Override // defpackage.m8
    public final StackTraceElement h() {
        return null;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        Throwable thA = fq3.a(obj);
        if (thA != null) {
            this.C = new vm0(getContext(), thA);
        }
        z80<? super sd5> z80Var = this.D;
        if (z80Var != null) {
            z80Var.x(obj);
        }
        return va0.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.b90, defpackage.m8
    public final void j() {
        super.j();
    }

    @Override // defpackage.m8, defpackage.wa0
    public final wa0 k() {
        z80<? super sd5> z80Var = this.D;
        if (z80Var instanceof wa0) {
            return (wa0) z80Var;
        }
        return null;
    }

    public final Object m(z80<? super sd5> z80Var, T t) {
        la0 context = z80Var.getContext();
        AY.v(context);
        la0 la0Var = this.C;
        if (la0Var != context) {
            if (la0Var instanceof vm0) {
                throw new IllegalStateException(ev4.l("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((vm0) la0Var).w + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.i(0, new b24(this))).intValue() != this.B) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.A + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.C = context;
        }
        this.D = z80Var;
        Object objInvoke = a24.a.invoke(this.z, t, this);
        if (!ur1.a(objInvoke, va0.COROUTINE_SUSPENDED)) {
            this.D = null;
        }
        return objInvoke;
    }
}
