package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class o9<Inputs, Events, State> implements s7<Inputs, Events, State> {
    public final v7<Inputs, Events, State> a;
    public final bu0<Inputs, Events, State> b;
    public final String c;

    public o9(gi0 gi0Var, bu0 bu0Var, ua0 ua0Var) {
        v7<Inputs, Events, State> v7Var = new v7<>(gi0Var);
        this.a = v7Var;
        this.b = bu0Var;
        this.c = "BasicViewModel";
        v7Var.p(ua0Var, new m9(this));
        fp1.k0(v7Var.n(), null, 0, new n9(this, null), 3);
    }

    @Override // defpackage.s7
    public final String getName() {
        return this.a.getName();
    }

    @Override // defpackage.s7
    public final String getType() {
        return this.c;
    }
}
