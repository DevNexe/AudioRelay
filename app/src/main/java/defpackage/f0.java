package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements eo1<wXc, G_W, QsF6> {
    public final wc3 a;
    public final un2 b;
    public final lKy3 c;

    public f0(wc3 wc3Var, un2 un2Var, lKy3 lky3) {
        this.a = wc3Var;
        this.b = un2Var;
        this.c = lky3;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        wXc wxc = (wXc) obj;
        if (wxc instanceof wXc.F1) {
            go1Var.p("initialize", new WjT(null, this));
        } else {
            boolean z = wxc instanceof wXc.YKK;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            if (z) {
                sd5 sd5VarS = go1Var.s(new a0(wxc));
                return sd5VarS == va0Var ? sd5VarS : sd5.a;
            }
            boolean z2 = wxc instanceof wXc.CQf;
            un2 un2Var = this.b;
            lKy3 lky3 = this.c;
            if (z2) {
                wXc.CQf cQf = (wXc.CQf) wxc;
                a62 a62Var = a62.a;
                a62Var.j("compression", cQf.a.w);
                String str = cQf.a.w;
                ckh_ ckh_Var = new ckh_(this, cQf);
                a62Var.h("settings", "changed_audio_quality", str);
                ckh_Var.invoke(lky3);
                un2Var.a();
                go1Var.q();
            } else {
                if (!(wxc instanceof wXc.QnHx)) {
                    if (!(wxc instanceof wXc.NUlFixed)) {
                        if (!(wxc instanceof wXc.LPt8Fixed)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sd5 sd5VarS2 = go1Var.s(new b0(wxc));
                        return sd5VarS2 == va0Var ? sd5VarS2 : sd5.a;
                    }
                    a62.a.h("settings", "clicked_on_premium_from_audio_quality", ((wXc.NUlFixed) wxc).a);
                    Object objO = go1Var.o(G_W.QnHx.a, z80Var);
                    if (objO != va0Var) {
                        objO = sd5.a;
                    }
                    return objO == va0Var ? objO : sd5.a;
                }
                wXc.QnHx qnHx = (wXc.QnHx) wxc;
                a62 a62Var2 = a62.a;
                a62Var2.j("opus_bitrate", String.valueOf(qnHx.a.a));
                String strValueOf = String.valueOf(qnHx.a.a);
                c43l c43lVar = new c43l(this, qnHx);
                a62Var2.h("settings", "changed_bitrate", strValueOf);
                c43lVar.invoke(lky3);
                un2Var.a();
                go1Var.q();
            }
        }
        return sd5.a;
    }
}
