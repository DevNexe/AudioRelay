package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class re4 implements if4 {
    public final ss3 a;
    public final ac4 b;
    public final B8C c;
    public final ta2 d;
    public final as e;
    public final qs f;
    public final c2 g;
    public final c2 h;
    public final c2 i;
    public final c2 j;

    public re4(ss3 ss3Var, ac4 ac4Var, B8C b8c, ta2 ta2Var, as asVar, qs qsVar) {
        this.a = ss3Var;
        this.b = ac4Var;
        this.c = b8c;
        this.d = ta2Var;
        this.e = asVar;
        this.f = qsVar;
        gq0.QnHx qnHx = gq0.x;
        kq0 kq0Var = kq0.MINUTES;
        this.g = new c2(ps0.o0(30, kq0Var));
        kq0 kq0Var2 = kq0.SECONDS;
        this.h = new c2(ps0.o0(30, kq0Var2));
        this.i = new c2(ps0.o0(30, kq0Var2));
        this.j = new c2(ps0.o0(1, kq0Var));
    }

    @Override // defpackage.if4
    public final qw a(dc4 dc4Var) {
        ss3 ss3Var = this.a;
        ss3Var.getClass();
        tx sr2Var = new sr2(new jr2(new ft2(new r23(ss3Var, 3), new NFo7(ss3Var, 24), new CY(12), false), m91.d, new J(this, 14), m91.c), new j71(6, this, dc4Var));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c54 c54Var = j54.c;
        e14 e14Var = new e14(0, 5L, c54Var, timeUnit);
        a11 a11VarD = sr2Var instanceof n91 ? ((n91) sr2Var).d() : new yx(sr2Var);
        a11VarD.getClass();
        return new ax(new gx(new q11(a11VarD, e14Var)).i(c54Var), new xW8n(this, 7));
    }
}
