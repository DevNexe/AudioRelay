package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zy1 extends cx1 implements x81<pg2.CQf, Boolean, Boolean> {
    public final /* synthetic */ ui2<uy2<kz1, ou2>> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy1(ui2<uy2<kz1, ou2>> ui2Var) {
        super(2);
        this.w = ui2Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    @Override // defpackage.x81
    public final Boolean invoke(pg2.CQf cQf, Boolean bool) {
        boolean z;
        pg2.CQf cQf2 = cQf;
        if (bool.booleanValue()) {
            z = true;
        } else {
            z = false;
            if (cQf2 instanceof ou2) {
                uy2<kz1, ou2> uy2Var = null;
                ui2<uy2<kz1, ou2>> ui2Var = this.w;
                if (ui2Var != null) {
                    int i = ui2Var.y;
                    if (i > 0) {
                        uy2<kz1, ou2>[] uy2VarArr = ui2Var.w;
                        int i2 = 0;
                        do {
                            uy2<kz1, ou2> uy2Var2 = uy2VarArr[i2];
                            if (ur1.a(cQf2, uy2Var2.x)) {
                                uy2Var = uy2Var2;
                                break;
                            }
                            i2++;
                        } while (i2 < i);
                    }
                    uy2Var = uy2Var;
                }
                if (uy2Var == null) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
