package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kp4 extends cx1 implements j81<gp4, Object> {
    public final /* synthetic */ j81<gp4, Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kp4(j81<? super gp4, Object> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final Object invoke(gp4 gp4Var) {
        cp4 cp4Var = (cp4) this.w.invoke(gp4Var);
        synchronized (ip4.c) {
            ip4.d = ip4.d.f(cp4Var.d());
            sd5 sd5Var = sd5.a;
        }
        return cp4Var;
    }
}
