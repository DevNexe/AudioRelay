package defpackage;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class w71 implements eo1<d71, c71, e71> {
    public final Context a;
    public final Dz b;

    public w71(Context context, Dz dz) {
        this.a = context;
        this.b = dz;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        d71 d71Var = (d71) obj;
        if (d71Var instanceof d71.LPt8Fixed) {
            go1Var.p("initialize", new p71(null, this));
            return sd5.a;
        }
        boolean z = d71Var instanceof d71.CQf;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (z) {
            Object objO = go1Var.o(c71.CQf.a, z80Var);
            return objO == va0Var ? objO : sd5.a;
        }
        if (d71Var instanceof d71.F1) {
            Object objO2 = go1Var.o(c71.QnHx.a, z80Var);
            return objO2 == va0Var ? objO2 : sd5.a;
        }
        if (d71Var instanceof d71.QnHx) {
            sd5 sd5VarS = go1Var.s(q71.w);
            return sd5VarS == va0Var ? sd5VarS : sd5.a;
        }
        if (d71Var instanceof d71.NUlFixed) {
            sd5 sd5VarS2 = go1Var.s(new r71(d71Var));
            return sd5VarS2 == va0Var ? sd5VarS2 : sd5.a;
        }
        if (!ur1.a(d71Var, d71.YKK.a)) {
            throw new NoWhenBranchMatchedException();
        }
        sd5 sd5VarS3 = go1Var.s(s71.w);
        return sd5VarS3 == va0Var ? sd5VarS3 : sd5.a;
    }
}
