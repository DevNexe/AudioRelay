package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class wk4 implements vf {
    @Override // defpackage.vf
    public final boolean a(ou3 ou3Var) {
        if (ou3Var instanceof ou3.byN) {
            return true;
        }
        if (!(ou3Var instanceof ou3.FJCM) && !(ou3Var instanceof ou3.auxFixed)) {
            if ((ou3Var instanceof ou3.EQ) || (ou3Var instanceof ou3.LPt8Fixed)) {
                return true;
            }
            if (!(ou3Var instanceof ou3.YKK)) {
                if ((ou3Var instanceof ou3.CQf) || (ou3Var instanceof ou3.F1) || (ou3Var instanceof ou3.QnHx) || (ou3Var instanceof ou3.T23) || (ou3Var instanceof ou3.PRnFixed)) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}
