package defpackage;

import com.azefsw.audioconnect.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class vz3 extends cx1 implements y81<wv, g30, Integer, sd5> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ vp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz3(int i, vp vpVar, boolean z) {
        super(3);
        this.w = z;
        this.x = vpVar;
    }

    @Override // defpackage.y81
    public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 81) == 16 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            float f = 16;
            pg2 pg2VarW = ps0.W(qnHx, f, f, f, 0);
            boolean z = this.w;
            Uff4.a(R.string.player_stats_network_latency, xj4.c(pg2VarW, z), g30Var2, 0, 0);
            hH.i(gm4.g(qnHx, 8), g30Var2, 6);
            if (z) {
                g30Var2.e(-1093922414);
                float f2 = RCHTTPStatusCodes.SUCCESS;
                xj4.a(gm4.f(gm4.j(qnHx, 0.0f, f2, 0.0f, f2, 5)), g30Var2, 6, 0);
                g30Var2.G();
            } else {
                g30Var2.e(-1093922218);
                float f3 = RCHTTPStatusCodes.SUCCESS;
                pg2 pg2VarF = gm4.f(gm4.j(qnHx, 0.0f, f3, 0.0f, f3, 5));
                g30Var2.e(1157296644);
                vp vpVar = this.x;
                boolean zI = g30Var2.I(vpVar);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objF == c0132QnHx) {
                    objF = new tz3(vpVar);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                j81 j81Var = (j81) objF;
                g30Var2.e(1157296644);
                boolean zI2 = g30Var2.I(vpVar);
                Object objF2 = g30Var2.f();
                if (zI2 || objF2 == c0132QnHx) {
                    objF2 = new uz3(vpVar);
                    g30Var2.B(objF2);
                }
                g30Var2.G();
                rG.a(j81Var, pg2VarF, (j81) objF2, g30Var2, 48, 0);
                g30Var2.G();
            }
        }
        return sd5.a;
    }
}
