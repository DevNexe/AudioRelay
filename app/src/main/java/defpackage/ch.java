package defpackage;

import com.azefsw.audioconnect.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ch implements eo1<sg, qg, ug> {
    public final dh a;

    public ch(dh dhVar) {
        this.a = dhVar;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        sg sgVar = (sg) obj;
        if (sgVar instanceof sg.CQf) {
            go1Var.p("initialize", new wg(null, this));
        } else {
            boolean z = sgVar instanceof sg.QnHx;
            dh dhVar = this.a;
            if (z) {
                dhVar.c.t(((sg.QnHx) sgVar).a);
                dhVar.b.a();
                go1Var.q();
            } else {
                boolean z2 = sgVar instanceof sg.YKK;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                if (z2) {
                    sd5 sd5VarS = go1Var.s(new zg(sgVar));
                    return sd5VarS == va0Var ? sd5VarS : sd5.a;
                }
                if (ur1.a(sgVar, sg.LPt8Fixed.a)) {
                    Object objO = go1Var.o(qg.QnHx.a, z80Var);
                    return objO == va0Var ? objO : sd5.a;
                }
                if (!ur1.a(sgVar, sg.F1.a)) {
                    if (!ur1.a(sgVar, sg.NUlFixed.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objO2 = go1Var.o(qg.CQf.a, z80Var);
                    return objO2 == va0Var ? objO2 : sd5.a;
                }
                lKy3 lky3 = dhVar.c;
                String strD = lky3.d(R.string.pref_custom_buffer_mode_key);
                nt1 nt1Var = new nt1(0, 100);
                ws1 ws1Var = (ws1) lky3.d.x;
                lky3.i(strD, ws1Var.b(ib4.serializer(ws1Var.b, nl3.c(nt1.class)), nt1Var));
                dhVar.b.a();
                go1Var.q();
            }
        }
        return sd5.a;
    }
}
