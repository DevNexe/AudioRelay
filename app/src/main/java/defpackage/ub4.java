package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ub4 implements if4 {
    public final in2 a;
    public final cd4 b;

    public ub4(in2 in2Var, cd4 cd4Var) {
        this.a = in2Var;
        this.b = cd4Var;
    }

    @Override // defpackage.if4
    public final qw a(dc4 dc4Var) {
        a62.a.k("Starting to broadcast...");
        gq0.QnHx qnHx = gq0.x;
        kq0 kq0Var = kq0.MINUTES;
        c2 c2Var = new c2(ps0.o0(60, kq0Var));
        c2 c2Var2 = new c2(ps0.o0(1, kq0Var));
        rx rxVarC = new ey(new ma(this, 1), new hMT(this, dc4Var, c2Var, c2Var2, 1), new sn2(5)).c(new nm3(6, c2Var, c2Var2));
        kq0 kq0Var2 = kq0.SECONDS;
        long jO0 = ps0.o0(1, kq0Var2);
        long jO1 = ps0.o0(15, kq0Var2);
        long jO2 = ps0.o0(30, kq0Var2);
        c54 c54Var = j54.b;
        return Th.h(rxVarC, jO0, jO1, jO2, c54Var).i(c54Var);
    }
}
