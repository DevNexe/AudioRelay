package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class nyd implements eo1<If$, Object, T9r> {
    public final lKy3 a;

    public nyd(lKy3 lky3) {
        this.a = lky3;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        If$ if$ = (If$) obj;
        if (if$ instanceof If$.F1) {
            go1Var.p("initialize", new EbvR(null, this));
        } else {
            if (if$ instanceof If$.LPt8Fixed) {
                sd5 sd5VarS = go1Var.s(new pWg((If$.LPt8Fixed) if$));
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                if (sd5VarS != va0Var) {
                    sd5VarS = sd5.a;
                }
                return sd5VarS == va0Var ? sd5VarS : sd5.a;
            }
            boolean z = if$ instanceof If$.QnHx;
            lKy3 lky3 = this.a;
            if (z) {
                If$.QnHx qnHx = (If$.QnHx) if$;
                String str = qnHx.a.x;
                v6uO v6uo = new v6uO(this, qnHx);
                a62.a.h("settings", "change_opensl_performance_mode", str);
                v6uo.invoke(lky3);
                go1Var.q();
            } else if (if$ instanceof If$.CQf) {
                If$.CQf cQf = (If$.CQf) if$;
                String str2 = cQf.a.w;
                c0 c0Var = new c0(this, cQf);
                a62.a.h("settings", "change_audio_output_type", str2);
                c0Var.invoke(lky3);
                go1Var.q();
            } else {
                if (!(if$ instanceof If$.NUlFixed)) {
                    throw new NoWhenBranchMatchedException();
                }
                If$.NUlFixed nUl = (If$.NUlFixed) if$;
                String strValueOf = String.valueOf(nUl.a);
                fJOa fjoa = new fJOa(this, nUl);
                a62.a.h("settings", "change_audio_track_low_latency", strValueOf);
                fjoa.invoke(lky3);
                go1Var.q();
            }
        }
        return sd5.a;
    }
}
