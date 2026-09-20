package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j31 implements yl0 {
    public final /* synthetic */ ri2 a;
    public final /* synthetic */ ci2 b;

    public j31(ri2 ri2Var, ci2 ci2Var) {
        this.a = ri2Var;
        this.b = ci2Var;
    }

    @Override // defpackage.yl0
    public final void a() {
        ri2 ri2Var = this.a;
        j21 j21Var = (j21) ri2Var.getValue();
        if (j21Var != null) {
            k21 k21Var = new k21(j21Var);
            ci2 ci2Var = this.b;
            if (ci2Var != null) {
                ci2Var.b(k21Var);
            }
            ri2Var.setValue(null);
        }
    }
}
