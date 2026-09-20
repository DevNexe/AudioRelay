package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s74 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ pg2 w;
    public final /* synthetic */ b84 x;
    public final /* synthetic */ x81<g30, Integer, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s74(pg2 pg2Var, b84 b84Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
        super(2);
        this.w = pg2Var;
        this.x = b84Var;
        this.y = x81Var;
        this.z = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            b84 b84Var = this.x;
            b84Var.getClass();
            pg2 pg2VarA = pg2.QnHx.w;
            pg2 pg2VarA2 = cw1.a(y31.a(f30.a(d31.a(fp1.p0(b84Var.c() ? tx4.a(pg2VarA, sd5.a, new i84(b84Var, new e84(b84Var), null)) : pg2VarA, new f84(b84Var)), b84Var.g), wo1.a, new c21(new g84(b84Var)))), new h84(b84Var));
            if ((((eb1) b84Var.o.getValue()) != null) && e72.h.a()) {
                pg2VarA = f30.a(pg2VarA, wo1.a, new o84(b84Var));
            }
            sk4.a(this.w.y(pg2VarA2.y(pg2VarA)), X.m(g30Var2, 1375295262, new r74(this.z, b84Var, this.y)), g30Var2, 48, 0);
        }
        return sd5.a;
    }
}
