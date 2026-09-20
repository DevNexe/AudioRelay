package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class oh4 implements eo1<tg4, sg4, vg4> {
    public final Context a;
    public final lKy3 b;
    public final wc3 c;

    public oh4(Context context, lKy3 lky3, wc3 wc3Var) {
        this.a = context;
        this.b = lky3;
        this.c = wc3Var;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        tg4 tg4Var = (tg4) obj;
        if (tg4Var instanceof tg4.LPt8Fixed) {
            go1Var.p("initialize", new bh4(this, null));
            return sd5.a;
        }
        boolean z = tg4Var instanceof tg4.YKK;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (z) {
            sd5 sd5VarS = go1Var.s(new ch4(tg4Var));
            return sd5VarS == va0Var ? sd5VarS : sd5.a;
        }
        if (tg4Var instanceof tg4.ta) {
            sd5 sd5VarS2 = go1Var.s(new dh4(tg4Var));
            return sd5VarS2 == va0Var ? sd5VarS2 : sd5.a;
        }
        if (tg4Var instanceof tg4.NUlFixed) {
            sd5 sd5VarS3 = go1Var.s(new eh4(tg4Var));
            return sd5VarS3 == va0Var ? sd5VarS3 : sd5.a;
        }
        if (tg4Var instanceof tg4.FJCM) {
            tg4.FJCM fjcm = (tg4.FJCM) tg4Var;
            a62 a62Var = a62.a;
            a62.a.g(fjcm.b, null);
            Object objO = go1Var.o(new sg4.YKK(fjcm.a), z80Var);
            if (objO != va0Var) {
                objO = sd5.a;
            }
            return objO == va0Var ? objO : sd5.a;
        }
        if (ur1.a(tg4Var, tg4.MZ.a)) {
            a62 a62Var2 = a62.a;
            a62.a.g("clicked_on_translators", null);
            sd5 sd5VarS4 = go1Var.s(lh4.w);
            if (sd5VarS4 != va0Var) {
                sd5VarS4 = sd5.a;
            }
            return sd5VarS4 == va0Var ? sd5VarS4 : sd5.a;
        }
        if (ur1.a(tg4Var, tg4.F1.a)) {
            sd5 sd5VarS5 = go1Var.s(fh4.w);
            return sd5VarS5 == va0Var ? sd5VarS5 : sd5.a;
        }
        if (ur1.a(tg4Var, tg4.RBi.a)) {
            a62.a.e("clicked on open source licences");
            sd5 sd5VarS6 = go1Var.s(kh4.w);
            if (sd5VarS6 != va0Var) {
                sd5VarS6 = sd5.a;
            }
            return sd5VarS6 == va0Var ? sd5VarS6 : sd5.a;
        }
        if (ur1.a(tg4Var, tg4.CQf.a)) {
            sd5 sd5VarS7 = go1Var.s(gh4.w);
            return sd5VarS7 == va0Var ? sd5VarS7 : sd5.a;
        }
        if (ur1.a(tg4Var, tg4.auxFixed.a)) {
            a62.a.e("clicked_on_language");
            Object objO2 = go1Var.o(sg4.CQf.a, z80Var);
            if (objO2 != va0Var) {
                objO2 = sd5.a;
            }
            return objO2 == va0Var ? objO2 : sd5.a;
        }
        if (ur1.a(tg4Var, tg4.T23.a)) {
            a62.a.e("clicked_on_name_editor");
            Object objO3 = go1Var.o(sg4.F1.a, z80Var);
            if (objO3 != va0Var) {
                objO3 = sd5.a;
            }
            return objO3 == va0Var ? objO3 : sd5.a;
        }
        if (tg4Var instanceof tg4.byN) {
            a62 a62Var3 = a62.a;
            a62.a.g("clicked_on_premium_from_" + ((tg4.byN) tg4Var).a, null);
            Object objO4 = go1Var.o(sg4.LPt8Fixed.a, z80Var);
            if (objO4 != va0Var) {
                objO4 = sd5.a;
            }
            return objO4 == va0Var ? objO4 : sd5.a;
        }
        if (ur1.a(tg4Var, tg4.EQ.a)) {
            a62.a.e("clicked_on_theme");
            Object objO5 = go1Var.o(sg4.NUlFixed.a, z80Var);
            if (objO5 != va0Var) {
                objO5 = sd5.a;
            }
            return objO5 == va0Var ? objO5 : sd5.a;
        }
        if (ur1.a(tg4Var, tg4.y.a)) {
            Object objO6 = go1Var.o(sg4.T23.a, z80Var);
            return objO6 == va0Var ? objO6 : sd5.a;
        }
        if (tg4Var instanceof tg4.LPt6Fixed) {
            tg4.LPt6Fixed lPt6 = (tg4.LPt6Fixed) tg4Var;
            Object objB = b(go1Var, "clicked_on_analytics", String.valueOf(lPt6.a), true, new mh4(this, lPt6), z80Var);
            if (objB != va0Var) {
                objB = sd5.a;
            }
            return objB == va0Var ? objB : sd5.a;
        }
        if (tg4Var instanceof tg4.Xn1) {
            tg4.Xn1 xn1 = (tg4.Xn1) tg4Var;
            Object objB2 = b(go1Var, "clicked_on_usb_card", String.valueOf(xn1.a), false, new nh4(this, xn1), z80Var);
            if (objB2 != va0Var) {
                objB2 = sd5.a;
            }
            return objB2 == va0Var ? objB2 : sd5.a;
        }
        if (ur1.a(tg4Var, tg4.QnHx.a)) {
            Object objO7 = go1Var.o(sg4.QnHx.a, z80Var);
            return objO7 == va0Var ? objO7 : sd5.a;
        }
        if (ur1.a(tg4Var, tg4.PRnFixed.a)) {
            Object objO8 = go1Var.o(sg4.auxFixed.a, z80Var);
            return objO8 == va0Var ? objO8 : sd5.a;
        }
        if (!ur1.a(tg4Var, tg4.LPt9Fixed.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objO9 = go1Var.o(sg4.byN.a, z80Var);
        return objO9 == va0Var ? objO9 : sd5.a;
    }

    @SuppressLint({"CheckResult"})
    public final Object b(go1 go1Var, String str, String str2, boolean z, j81 j81Var, z80 z80Var) {
        a62.a.h("settings", str, str2);
        j81Var.invoke(this.b);
        if (z) {
            Object objO = go1Var.o(sg4.EQ.a, z80Var);
            return objO == va0.COROUTINE_SUSPENDED ? objO : sd5.a;
        }
        go1Var.q();
        return sd5.a;
    }
}
