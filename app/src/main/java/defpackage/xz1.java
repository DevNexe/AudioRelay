package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xz1 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ yz1 w;
    public final /* synthetic */ yz1.QnHx x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz1(yz1 yz1Var, yz1.QnHx qnHx) {
        super(2);
        this.w = yz1Var;
        this.x = qnHx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        int iIntValue;
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            yz1 yz1Var = this.w;
            zz1 zz1VarInvoke = yz1Var.b.invoke();
            Map<Object, Integer> mapF = zz1VarInvoke.f();
            yz1.QnHx qnHx = this.x;
            Integer num2 = mapF.get(qnHx.a);
            kz2 kz2Var = qnHx.c;
            if (num2 != null) {
                kz2Var.setValue(Integer.valueOf(num2.intValue()));
                iIntValue = num2.intValue();
            } else {
                iIntValue = ((Number) kz2Var.getValue()).intValue();
            }
            g30Var2.e(-715769699);
            int iG = zz1VarInvoke.g();
            Object obj = qnHx.a;
            if (iIntValue < iG) {
                Object objA = zz1VarInvoke.a(iIntValue);
                if (ur1.a(objA, obj)) {
                    yz1Var.a.b(objA, X.m(g30Var2, -1238863364, new uz1(zz1VarInvoke, iIntValue)), g30Var2, 568);
                }
            }
            g30Var2.G();
            wq0.a(obj, new wz1(qnHx), g30Var2);
        }
        return sd5.a;
    }
}
