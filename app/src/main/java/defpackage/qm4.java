package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class qm4 extends cx1 implements j81<ts0, mp1> {
    public final /* synthetic */ rm4 w;
    public final /* synthetic */ long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm4(rm4 rm4Var, long j) {
        super(1);
        this.w = rm4Var;
        this.x = j;
    }

    @Override // defpackage.j81
    public final mp1 invoke(ts0 ts0Var) {
        j81<sp1, mp1> j81Var;
        j81<sp1, mp1> j81Var2;
        ts0 ts0Var2 = ts0Var;
        rm4 rm4Var = this.w;
        pm4 value = rm4Var.x.getValue();
        long j = this.x;
        long j2 = (value == null || (j81Var2 = value.a) == null) ? mp1.b : j81Var2.invoke(new sp1(j)).a;
        pm4 value2 = rm4Var.y.getValue();
        long j3 = (value2 == null || (j81Var = value2.a) == null) ? mp1.b : j81Var.invoke(new sp1(j)).a;
        int iOrdinal = ts0Var2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                j2 = mp1.b;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j2 = j3;
            }
        }
        return new mp1(j2);
    }
}
