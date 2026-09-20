package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ro1<Inputs, Events, State> implements qo1<Inputs, Events, State> {
    public final y81<ph3<Inputs, Events, State>, po1.QnHx, z80<? super sd5>, Object> a;

    public ro1(f8.QnHx qnHx) {
        this.a = qnHx;
    }

    @Override // defpackage.qo1
    public final Object a(ph3 ph3Var, yg0 yg0Var, z80 z80Var) {
        Object objInvoke = this.a.invoke(ph3Var, yg0Var, z80Var);
        return objInvoke == va0.COROUTINE_SUSPENDED ? objInvoke : sd5.a;
    }
}
