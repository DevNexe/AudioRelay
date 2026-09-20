package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r74 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ x81<g30, Integer, sd5> w;
    public final /* synthetic */ int x;
    public final /* synthetic */ b84 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r74(int i, b84 b84Var, x81 x81Var) {
        super(2);
        this.w = x81Var;
        this.x = i;
        this.y = b84Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        n74 n74VarD;
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            this.w.invoke(g30Var2, Integer.valueOf((this.x >> 9) & 14));
            b84 b84Var = this.y;
            if (b84Var.c() && (n74VarD = b84Var.d()) != null) {
                List listM = ps0.M(Boolean.TRUE, Boolean.FALSE);
                int size = listM.size();
                for (int i = 0; i < size; i++) {
                    boolean zBooleanValue = ((Boolean) listM.get(i)).booleanValue();
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    g30Var2.e(1157296644);
                    boolean zI = g30Var2.I(boolValueOf);
                    Object objF = g30Var2.f();
                    if (zI || objF == g30.QnHx.a) {
                        objF = new d84(b84Var, zBooleanValue);
                        g30Var2.B(objF);
                    }
                    g30Var2.G();
                    g25 g25Var = (g25) objF;
                    kt2 kt2Var = zBooleanValue ? (kt2) b84Var.m.getValue() : (kt2) b84Var.n.getValue();
                    np3 np3Var = zBooleanValue ? n74VarD.a.a : n74VarD.b.a;
                    if (kt2Var != null) {
                        ukJW.c(kt2Var.a, zBooleanValue, np3Var, n74VarD.c, tx4.a(pg2.QnHx.w, g25Var, new q74(g25Var, null)), null, g30Var2, 196608);
                    }
                }
            }
        }
        return sd5.a;
    }
}
