package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cu1 implements rv1<vt1> {
    public static final cu1 a = new cu1();
    public static final ra4 b = FWT.r("vt1", q93.CQf.a, new pa4[0], QnHx.w);

    public static final class QnHx extends cx1 implements j81<br, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(br brVar) {
            br brVar2 = brVar;
            br.a(brVar2, "JsonPrimitive", new du1(xt1.w));
            br.a(brVar2, "JsonNull", new du1(yt1.w));
            br.a(brVar2, "JsonLiteral", new du1(zt1.w));
            br.a(brVar2, "JsonObject", new du1(au1.w));
            br.a(brVar2, "JsonArray", new du1(bu1.w));
            return sd5.a;
        }
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return qe0.c(pf0Var).y();
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        vt1 vt1Var = (vt1) obj;
        qe0.b(ls0Var);
        if (vt1Var instanceof su1) {
            ls0Var.F(tu1.a, vt1Var);
        } else if (vt1Var instanceof pu1) {
            ls0Var.F(qu1.a, vt1Var);
        } else if (vt1Var instanceof dt1) {
            ls0Var.F(et1.a, vt1Var);
        }
    }
}
