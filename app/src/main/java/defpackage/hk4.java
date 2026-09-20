package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hk4<Inputs, Events, State> implements gk4<Inputs, Events, State>, ua0 {
    public final ua0 A;
    public final m7 w;
    public final x81<Inputs, z80<? super sd5>, Object> x;
    public final x81<Events, z80<? super sd5>, Object> y;
    public final State z;

    /* JADX WARN: Multi-variable type inference failed */
    public hk4(m7 m7Var, b8.QnHx.C0046QnHx c0046QnHx, b8.QnHx.CQf cQf, Object obj, ua0 ua0Var) {
        this.w = m7Var;
        this.x = c0046QnHx;
        this.y = cQf;
        this.z = obj;
        this.A = ua0Var;
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.A.g();
    }

    @Override // defpackage.gk4
    public final Object n(Inputs inputs, z80<? super sd5> z80Var) {
        Object objInvoke = this.x.invoke(inputs, z80Var);
        return objInvoke == va0.COROUTINE_SUSPENDED ? objInvoke : sd5.a;
    }

    @Override // defpackage.gk4
    public final Object o(Events events, z80<? super sd5> z80Var) {
        Object objInvoke = this.y.invoke(events, z80Var);
        return objInvoke == va0.COROUTINE_SUSPENDED ? objInvoke : sd5.a;
    }
}
