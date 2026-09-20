package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l7<Inputs, Events, State> implements k7<Inputs, Events, State>, ua0 {
    public final m7 w;
    public final ua0 x;
    public final x81<ph3<Inputs, Events, State>, z80<? super sd5>, Object> y;

    public l7(m7 m7Var, String str, w80 w80Var, h8 h8Var) {
        this.w = m7Var;
        this.x = w80Var;
        this.y = h8Var;
    }

    @Override // defpackage.k7
    public final Object Z(ph3<Inputs, Events, State> ph3Var, z80<? super sd5> z80Var) {
        Object objInvoke = this.y.invoke(ph3Var, z80Var);
        return objInvoke == va0.COROUTINE_SUSPENDED ? objInvoke : sd5.a;
    }

    @Override // defpackage.k7
    public final m7 b() {
        return this.w;
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.x.g();
    }
}
