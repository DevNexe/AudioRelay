package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class az1 extends cx1 implements x81<sd5, pg2.CQf, sd5> {
    public final /* synthetic */ yy1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az1(yy1 yy1Var) {
        super(2);
        this.w = yy1Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(sd5 sd5Var, pg2.CQf cQf) {
        og2 og2Var;
        pg2.CQf cQf2 = cQf;
        ui2<og2> ui2Var = this.w.F;
        int i = ui2Var.y;
        if (i <= 0) {
            og2Var = null;
            break;
        }
        int i2 = i - 1;
        og2[] og2VarArr = ui2Var.w;
        while (true) {
            og2Var = og2VarArr[i2];
            og2 og2Var2 = og2Var;
            if (og2Var2.Y == cQf2 && !og2Var2.Z) {
                break;
            }
            i2--;
            if (i2 < 0) {
                og2Var = null;
                break;
            }
        }
        og2 og2Var3 = og2Var;
        if (og2Var3 != null) {
            og2Var3.Z = true;
        }
        return sd5.a;
    }
}
