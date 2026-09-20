package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qj2 extends cx1 implements a91<sz1, Integer, g30, Integer, sd5> {
    public final /* synthetic */ List w;
    public final /* synthetic */ j81 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj2(kj1 kj1Var, j81 j81Var, int i) {
        super(4);
        this.w = kj1Var;
        this.x = j81Var;
    }

    @Override // defpackage.a91
    public final sd5 I(sz1 sz1Var, Integer num, g30 g30Var, Integer num2) {
        int i;
        sz1 sz1Var2 = sz1Var;
        int iIntValue = num.intValue();
        g30 g30Var2 = g30Var;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            i = (g30Var2.I(sz1Var2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i |= g30Var2.i(iIntValue) ? 32 : 16;
        }
        if ((i & 731) == 146 && g30Var2.t()) {
            g30Var2.x();
        } else {
            int i2 = i & 14;
            uj2 uj2Var = (uj2) this.w.get(iIntValue);
            if ((i2 & 112) == 0) {
                i2 |= g30Var2.I(uj2Var) ? 32 : 16;
            }
            if ((i2 & 721) == 144 && g30Var2.t()) {
                g30Var2.x();
            } else {
                hx0 hx0Var = gm4.a;
                g30Var2.e(511388516);
                j81 j81Var = this.x;
                boolean zI = g30Var2.I(j81Var) | g30Var2.I(uj2Var);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new nj2(j81Var, uj2Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                j55.b(uj2Var.a, ps0.T(hr.c(hx0Var, false, (h81) objF, 7), 16), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, 0, 0, 65532);
            }
        }
        return sd5.a;
    }
}
