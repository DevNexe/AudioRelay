package defpackage;

import com.azefsw.audioconnect.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ii1 implements eo1<bi1, ai1, ci1> {
    public final I8O a;
    public final zh1 b;
    public final s23 c;

    public ii1(I8O i8o, zh1 zh1Var, s23 s23Var) {
        this.a = i8o;
        this.b = zh1Var;
        this.c = s23Var;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        bi1 bi1Var = (bi1) obj;
        if (bi1Var instanceof bi1.NUlFixed) {
            go1Var.p("initialize", new fi1(null, this));
        } else {
            boolean z = bi1Var instanceof bi1.YKK;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            if (z) {
                sd5 sd5VarS = go1Var.s(new gi1(bi1Var));
                return sd5VarS == va0Var ? sd5VarS : sd5.a;
            }
            if (ur1.a(bi1Var, bi1.QnHx.a)) {
                a62.a.e("clicked on 'dismiss'");
                lKy3 lky3 = this.a.a;
                lky3.g(lky3.d(R.string.pref_show_setup_card_key), false);
                go1Var.q();
            } else {
                if (bi1Var instanceof bi1.CQf) {
                    a62 a62Var = a62.a;
                    a62.a.d(((bi1.CQf) bi1Var).a, true);
                    Object objO = go1Var.o(ai1.QnHx.a, z80Var);
                    if (objO != va0Var) {
                        objO = sd5.a;
                    }
                    return objO == va0Var ? objO : sd5.a;
                }
                if (bi1Var instanceof bi1.F1) {
                    bi1.F1 f1 = (bi1.F1) bi1Var;
                    a62 a62Var2 = a62.a;
                    a62.a.d(f1.a, true);
                    a62Var2.h("usb", "failed_to_show_tethering_options", f1.a.getMessage());
                    Object objO2 = go1Var.o(ai1.LPt8Fixed.a, z80Var);
                    if (objO2 != va0Var) {
                        objO2 = sd5.a;
                    }
                    return objO2 == va0Var ? objO2 : sd5.a;
                }
                if (!ur1.a(bi1Var, bi1.LPt8Fixed.a)) {
                    if (ur1.a(bi1Var, bi1.auxFixed.a)) {
                        a62.a.e("clicked_on_show_usb_tethering_help");
                        Object objO3 = go1Var.o(ai1.CQf.a, z80Var);
                        return objO3 == va0Var ? objO3 : sd5.a;
                    }
                    if (!ur1.a(bi1Var, bi1.T23.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a62.a.e("clicked_on_enable_usb_tethering");
                    Object objO4 = go1Var.o(ai1.F1.a, z80Var);
                    return objO4 == va0Var ? objO4 : sd5.a;
                }
                this.c.c.g(Boolean.TRUE);
                go1Var.q();
            }
        }
        return sd5.a;
    }
}
