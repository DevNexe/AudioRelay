package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lu1 implements rv1<ku1> {
    public static final lu1 a = new lu1();
    public static final ge3 b = FWT.p("ku1", ee3.byN.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        vt1 vt1VarY = qe0.c(pf0Var).y();
        if (vt1VarY instanceof ku1) {
            return (ku1) vt1VarY;
        }
        throw AY.h("Unexpected JSON element, expected JsonLiteral, had " + nl3.a(vt1VarY.getClass()), vt1VarY.toString(), -1);
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        Double dValueOf;
        ku1 ku1Var = (ku1) obj;
        qe0.b(ls0Var);
        String str = ku1Var.x;
        if (ku1Var.w) {
            ls0Var.r0(str);
            return;
        }
        Long lP = hv4.p(str);
        if (lP != null) {
            ls0Var.h0(lP.longValue());
            return;
        }
        xc5 xc5VarU = AY.U(str);
        if (xc5VarU != null) {
            ls0Var.r(ii.serializer(xc5.x).a()).h0(xc5VarU.w);
            return;
        }
        String str2 = ku1Var.x;
        try {
            dValueOf = v54.a.w.matcher(str2).matches() ? Double.valueOf(Double.parseDouble(str2)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            ls0Var.l(dValueOf.doubleValue());
            return;
        }
        Boolean boolH = ddf.h(ku1Var);
        if (boolH != null) {
            ls0Var.q(boolH.booleanValue());
        } else {
            ls0Var.r0(str);
        }
    }
}
