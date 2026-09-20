package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class n73 implements eo1<f73, e73, g73> {
    public final lKy3 a;

    public n73(lKy3 lky3) {
        this.a = lky3;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        f73 f73Var = (f73) obj;
        if (f73Var instanceof f73.QnHx) {
            go1Var.p("initialize", new i73(null, this));
        } else {
            boolean zA = ur1.a(f73Var, f73.CQf.a);
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            if (zA) {
                a62.a.e("clicked_on_audio_focus");
                Object objO = go1Var.o(e73.QnHx.a, z80Var);
                if (objO != va0Var) {
                    objO = sd5.a;
                }
                return objO == va0Var ? objO : sd5.a;
            }
            if (ur1.a(f73Var, f73.F1.a)) {
                a62.a.e("clicked_on_audio_output");
                Object objO2 = go1Var.o(e73.CQf.a, z80Var);
                if (objO2 != va0Var) {
                    objO2 = sd5.a;
                }
                return objO2 == va0Var ? objO2 : sd5.a;
            }
            if (ur1.a(f73Var, f73.LPt8Fixed.a)) {
                a62.a.e("clicked_on_audio_quality");
                Object objO3 = go1Var.o(e73.F1.a, z80Var);
                if (objO3 != va0Var) {
                    objO3 = sd5.a;
                }
                return objO3 == va0Var ? objO3 : sd5.a;
            }
            if (ur1.a(f73Var, f73.NUlFixed.a)) {
                a62.a.e("clicked_on_buffer_size");
                Object objO4 = go1Var.o(e73.LPt8Fixed.a, z80Var);
                if (objO4 != va0Var) {
                    objO4 = sd5.a;
                }
                return objO4 == va0Var ? objO4 : sd5.a;
            }
            boolean z = f73Var instanceof f73.auxFixed;
            lKy3 lky3 = this.a;
            if (z) {
                f73.auxFixed auxVar = (f73.auxFixed) f73Var;
                String strValueOf = String.valueOf(auxVar.a);
                l73 l73Var = new l73(this, auxVar);
                a62.a.h("settings", "clicked_on_noisy_event", strValueOf);
                l73Var.invoke(lky3);
                go1Var.q();
                go1Var.q();
            } else {
                if (!(f73Var instanceof f73.T23)) {
                    if (!(f73Var instanceof f73.YKK)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sd5 sd5VarS = go1Var.s(new j73(f73Var));
                    return sd5VarS == va0Var ? sd5VarS : sd5.a;
                }
                f73.T23 t23 = (f73.T23) f73Var;
                String strValueOf2 = String.valueOf(t23.a);
                m73 m73Var = new m73(this, t23);
                a62.a.h("settings", "clicked_on_media_style_notification", strValueOf2);
                m73Var.invoke(lky3);
                go1Var.q();
                go1Var.q();
            }
        }
        return sd5.a;
    }
}
