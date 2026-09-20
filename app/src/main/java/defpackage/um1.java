package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class um1 extends cx1 implements h81<uc4> {
    public final /* synthetic */ pm1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um1(pm1 pm1Var) {
        super(0);
        this.w = pm1Var;
    }

    @Override // defpackage.h81
    public final uc4 invoke() {
        pm1 pm1Var = this.w;
        HSY hsyB = pm1Var.b.b();
        ef4 ef4Var = (ef4) pm1Var.f.a("ef4", rm1.w);
        fw0 fw0VarP = pm1Var.p();
        fw0 fw0VarP2 = pm1Var.p();
        nl3.a(bk3.class);
        lj4 lj4Var = pm1Var.a;
        j40 j40Var = new j40(new ym1(pm1Var, lj4Var), new xj3(fw0VarP2.a(), pm1Var));
        fw0 fw0VarP3 = pm1Var.p();
        nl3.a(ak3.class);
        j40 j40Var2 = new j40(new xm1(lj4Var, pm1Var.b, pm1Var), new xj3(fw0VarP3.c(), pm1Var));
        ew0 ew0Var = pm1Var.b;
        lj4 lj4Var2 = pm1Var.a;
        nl3.a(dk3.class);
        return new uc4(hsyB, ef4Var, new nd4(new j40(new an1(pm1Var, lj4Var2, ew0Var, j40Var, j40Var2), new xj3(fw0VarP.b(), pm1Var))));
    }
}
