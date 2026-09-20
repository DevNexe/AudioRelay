package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class yf2 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ le2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf2(le2 le2Var) {
        super(2);
        this.w = le2Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        ej1 ej1VarE;
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            int iH = O.h(this.w.a);
            if (iH == 0) {
                ej1VarE = m57.e();
            } else if (iH == 1) {
                ej1VarE = OW8.w;
                if (ej1VarE == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Hearing");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(17.0f, 20.0f);
                    le3Var.d(-0.29f, 0.0f, -0.56f, -0.06f, -0.76f, -0.15f);
                    le3Var.d(-0.71f, -0.37f, -1.21f, -0.88f, -1.71f, -2.38f);
                    le3Var.d(-0.51f, -1.56f, -1.47f, -2.29f, -2.39f, -3.0f);
                    le3Var.d(-0.79f, -0.61f, -1.61f, -1.24f, -2.32f, -2.53f);
                    le3Var.c(9.29f, 10.98f, 9.0f, 9.93f, 9.0f, 9.0f);
                    le3Var.d(0.0f, -2.8f, 2.2f, -5.0f, 5.0f, -5.0f);
                    le3Var.k(5.0f, 2.2f, 5.0f, 5.0f);
                    le3Var.f(2.0f);
                    le3Var.d(0.0f, -3.93f, -3.07f, -7.0f, -7.0f, -7.0f);
                    le3Var.j(7.0f, 5.07f, 7.0f, 9.0f);
                    le3Var.d(0.0f, 1.26f, 0.38f, 2.65f, 1.07f, 3.9f);
                    le3Var.d(0.91f, 1.65f, 1.98f, 2.48f, 2.85f, 3.15f);
                    le3Var.d(0.81f, 0.62f, 1.39f, 1.07f, 1.71f, 2.05f);
                    le3Var.d(0.6f, 1.82f, 1.37f, 2.84f, 2.73f, 3.55f);
                    le3Var.d(0.51f, 0.23f, 1.07f, 0.35f, 1.64f, 0.35f);
                    le3Var.d(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
                    le3Var.f(-2.0f);
                    le3Var.d(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
                    le3Var.b();
                    le3Var.i(7.64f, 2.64f);
                    le3Var.g(6.22f, 1.22f);
                    le3Var.c(4.23f, 3.21f, 3.0f, 5.96f, 3.0f, 9.0f);
                    le3Var.k(1.23f, 5.79f, 3.22f, 7.78f);
                    le3Var.h(1.41f, -1.41f);
                    le3Var.c(6.01f, 13.74f, 5.0f, 11.49f, 5.0f, 9.0f);
                    le3Var.k(1.01f, -4.74f, 2.64f, -6.36f);
                    le3Var.b();
                    le3Var.i(11.5f, 9.0f);
                    le3Var.d(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
                    le3Var.k(2.5f, -1.12f, 2.5f, -2.5f);
                    le3Var.k(-1.12f, -2.5f, -2.5f, -2.5f);
                    le3Var.k(-2.5f, 1.12f, -2.5f, 2.5f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarE = qnHx.d();
                    OW8.w = ej1VarE;
                }
            } else {
                if (iH != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ej1VarE = FWT.y();
            }
            rh1.a(ej1VarE, null, null, 0L, g30Var2, 48, 12);
        }
        return sd5.a;
    }
}
