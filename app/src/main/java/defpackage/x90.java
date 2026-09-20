package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x90 extends cx1 implements y81<Integer, Integer, Boolean, Boolean> {
    public final /* synthetic */ u45 A;
    public final /* synthetic */ mt2 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ x45 y;
    public final /* synthetic */ j45 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(mt2 mt2Var, boolean z, x45 x45Var, j45 j45Var, u45 u45Var) {
        super(3);
        this.w = mt2Var;
        this.x = z;
        this.y = x45Var;
        this.z = j45Var;
        this.A = u45Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    @Override // defpackage.y81
    public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
        u45 u45Var;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        boolean zBooleanValue = bool.booleanValue();
        mt2 mt2Var = this.w;
        if (!zBooleanValue) {
            iIntValue = mt2Var.a(iIntValue);
        }
        if (!zBooleanValue) {
            iIntValue2 = mt2Var.a(iIntValue2);
        }
        boolean z = false;
        if (this.x) {
            x45 x45Var = this.y;
            long j = x45Var.b;
            int i = s55.c;
            if (iIntValue != ((int) (j >> 32)) || iIntValue2 != s55.c(j)) {
                int i2 = iIntValue > iIntValue2 ? iIntValue2 : iIntValue;
                hb1 hb1Var = hb1.None;
                j45 j45Var = this.z;
                if (i2 < 0) {
                    u45Var = j45Var.d;
                    if (u45Var != null) {
                        u45Var.i = false;
                    }
                    j45Var.m(hb1Var);
                } else {
                    int i3 = iIntValue < iIntValue2 ? iIntValue2 : iIntValue;
                    Z7jl z7jl = x45Var.a;
                    if (i3 <= z7jl.length()) {
                        if (zBooleanValue || iIntValue == iIntValue2) {
                            u45 u45Var2 = j45Var.d;
                            if (u45Var2 != null) {
                                u45Var2.i = false;
                            }
                            j45Var.m(hb1Var);
                        } else {
                            j45Var.h();
                        }
                        this.A.o.invoke(new x45(z7jl, Cz.a(iIntValue, iIntValue2), (s55) null));
                        z = true;
                    } else {
                        u45Var = j45Var.d;
                        if (u45Var != null) {
                            u45Var.i = false;
                        }
                        j45Var.m(hb1Var);
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
