package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class qic implements eo1<FEQ, IPxR, Bv> {
    public final un2 a;
    public final lKy3 b;
    public final s23 c;

    public qic(un2 un2Var, lKy3 lky3, s23 s23Var) {
        this.a = un2Var;
        this.b = lky3;
        this.c = s23Var;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        String str;
        FEQ feq = (FEQ) obj;
        if (feq instanceof FEQ.F1) {
            go1Var.p("initialize", new iCta(null, this));
        } else {
            boolean z = feq instanceof FEQ.LPt8Fixed;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            if (z) {
                sd5 sd5VarS = go1Var.s(new Ab(feq));
                return sd5VarS == va0Var ? sd5VarS : sd5.a;
            }
            boolean z2 = feq instanceof FEQ.QnHx;
            un2 un2Var = this.a;
            if (z2) {
                FEQ.QnHx qnHx = (FEQ.QnHx) feq;
                int iOrdinal = qnHx.a.ordinal();
                if (iOrdinal == 0) {
                    str = "respect";
                } else if (iOrdinal == 1) {
                    str = "ignore";
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "restart_on_phone_call";
                }
                a62 a62Var = a62.a;
                a62Var.j("audio_focus_strategy", str);
                E e = new E(this, qnHx);
                a62Var.h("settings", "changed_audio_focus_strategy", str);
                e.invoke(this.b);
                un2Var.a();
                go1Var.q();
            } else {
                if (!ur1.a(feq, FEQ.NUlFixed.a)) {
                    if (!(feq instanceof FEQ.CQf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a62 a62Var2 = a62.a;
                    a62.a.d(((FEQ.CQf) feq).a, true);
                    Object objO = go1Var.o(IPxR.QnHx.a, z80Var);
                    if (objO != va0Var) {
                        objO = sd5.a;
                    }
                    return objO == va0Var ? objO : sd5.a;
                }
                this.c.c.g(Boolean.TRUE);
                un2Var.a();
                go1Var.q();
            }
        }
        return sd5.a;
    }
}
