package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ma0 {

    public static final class CQf extends cx1 implements x81<la0, la0.CQf, la0> {
        public final /* synthetic */ jl3<la0> w;
        public final /* synthetic */ boolean x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(jl3<la0> jl3Var, boolean z) {
            super(2);
            this.w = jl3Var;
            this.x = z;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [T, la0] */
        @Override // defpackage.x81
        public final la0 invoke(la0 la0Var, la0.CQf cQf) {
            la0 la0Var2 = la0Var;
            la0.CQf cQf2 = cQf;
            if (!(cQf2 instanceof k90)) {
                return la0Var2.g0(cQf2);
            }
            jl3<la0> jl3Var = this.w;
            if (jl3Var.w.j(cQf2.getKey()) != null) {
                jl3Var.w = jl3Var.w.e(cQf2.getKey());
                return la0Var2.g0(((k90) cQf2).t0());
            }
            k90 k90VarB0 = (k90) cQf2;
            if (this.x) {
                k90VarB0 = k90VarB0.b0();
            }
            return la0Var2.g0(k90VarB0);
        }
    }

    public static final class QnHx extends cx1 implements x81<la0, la0.CQf, la0> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final la0 invoke(la0 la0Var, la0.CQf cQf) {
            la0 la0Var2 = la0Var;
            la0.CQf cQf2 = cQf;
            return cQf2 instanceof k90 ? la0Var2.g0(((k90) cQf2).b0()) : la0Var2.g0(cQf2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final la0 a(la0 la0Var, la0 la0Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        na0 na0Var = na0.w;
        boolean zBooleanValue = ((Boolean) la0Var.i(bool, na0Var)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) la0Var2.i(bool, na0Var)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return la0Var.g0(la0Var2);
        }
        jl3 jl3Var = new jl3();
        jl3Var.w = la0Var2;
        xr0 xr0Var = xr0.w;
        la0 la0Var3 = (la0) la0Var.i(xr0Var, new CQf(jl3Var, z));
        if (zBooleanValue2) {
            jl3Var.w = ((la0) jl3Var.w).i(xr0Var, QnHx.w);
        }
        return la0Var3.g0((la0) jl3Var.w);
    }

    public static final la0 b(ua0 ua0Var, la0 la0Var) {
        la0 la0VarA = a(ua0Var.g(), la0Var, true);
        qh0 qh0Var = rl0.a;
        return (la0VarA == qh0Var || la0VarA.j(c90.QnHx.w) != null) ? la0VarA : la0VarA.g0(qh0Var);
    }

    public static final od5<?> c(z80<?> z80Var, la0 la0Var, Object obj) {
        od5<?> od5Var = null;
        if (!(z80Var instanceof wa0)) {
            return null;
        }
        if (!(la0Var.j(pd5.w) != null)) {
            return null;
        }
        wa0 wa0VarK = (wa0) z80Var;
        while (!(wa0VarK instanceof jl0) && (wa0VarK = wa0VarK.k()) != null) {
            if (wa0VarK instanceof od5) {
                od5Var = (od5) wa0VarK;
                break;
            }
        }
        if (od5Var != null) {
            od5Var.z.set(new uy2<>(la0Var, obj));
        }
        return od5Var;
    }
}
