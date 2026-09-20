package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class du0<Inputs, Events, State> implements cu0<Inputs, Events, State> {
    public final m7 a;
    public final x81<Inputs, z80<? super sd5>, Object> b;

    public du0(m7 m7Var, y7.QnHx qnHx) {
        this.a = m7Var;
        this.b = qnHx;
    }

    @Override // defpackage.cu0
    public final Object n(Inputs inputs, z80<? super sd5> z80Var) {
        Object objInvoke = this.b.invoke(inputs, z80Var);
        return objInvoke == va0.COROUTINE_SUSPENDED ? objInvoke : sd5.a;
    }
}
