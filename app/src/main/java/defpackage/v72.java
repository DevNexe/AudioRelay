package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class v72 implements eo1<h72, g72, i72> {
    public final lKy3 a;

    public v72(lKy3 lky3) {
        this.a = lky3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eo1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(go1 go1Var, h72 h72Var, z80 z80Var) throws Throwable {
        s72 s72Var;
        String str;
        fo1 fo1Var;
        if (z80Var instanceof s72) {
            s72Var = (s72) z80Var;
            int i = s72Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                s72Var.C = i - Integer.MIN_VALUE;
            } else {
                s72Var = new s72(this, z80Var);
            }
        } else {
            s72Var = new s72(this, z80Var);
        }
        Object objP = s72Var.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = s72Var.C;
        if (i2 == 0) {
            C0239D.H(objP);
            boolean z = h72Var instanceof h72.CQf;
            lKy3 lky3 = this.a;
            if (z) {
                p72 p72Var = ((h72.CQf) h72Var).a;
                if (p72Var == null) {
                    cs2 cs2Var = new cs2(new zs2(lky3.f.a(null)), new Acr(5));
                    s72Var.z = go1Var;
                    s72Var.C = 1;
                    xm xmVar = new xm(1, ps0.L(s72Var));
                    xmVar.r();
                    cs2Var.a(new t04(xmVar, null));
                    objP = xmVar.p();
                    if (objP == va0Var) {
                        fo1Var = go1Var;
                        return va0Var;
                    }
                    fo1Var = go1Var;
                    h72.QnHx qnHx = new h72.QnHx((p72) objP);
                    fo1Var.p(qnHx.toString(), new u72(qnHx, null));
                } else {
                    h72.QnHx qnHx2 = new h72.QnHx(p72Var);
                    go1Var.p(qnHx2.toString(), new r72(qnHx2, null));
                }
            } else {
                if (!(h72Var instanceof h72.F1)) {
                    if (!(h72Var instanceof h72.QnHx)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t72 t72Var = new t72(h72Var);
                    s72Var.C = 2;
                    if (go1Var.s(t72Var) == va0Var) {
                        return va0Var;
                    }
                    return sd5.a;
                }
                p72 p72VarA = l72.a(((h72.F1) h72Var).a);
                a62 a62Var = a62.a;
                int iOrdinal = p72VarA.ordinal();
                if (iOrdinal == 0) {
                    str = "PLAYER";
                } else if (iOrdinal == 1) {
                    str = "SERVER";
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "SETTINGS";
                }
                ac.b.b.f(str);
                lky3.f.setValue(Integer.valueOf(p72VarA.w));
                go1Var.q();
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objP);
                return sd5.a;
            }
            fo1 fo1Var2 = s72Var.z;
            C0239D.H(objP);
            fo1Var = fo1Var2;
            fo1Var = go1Var;
            h72.QnHx qnHx3 = new h72.QnHx((p72) objP);
            fo1Var.p(qnHx3.toString(), new u72(qnHx3, null));
        }
        return sd5.a;
    }
}
