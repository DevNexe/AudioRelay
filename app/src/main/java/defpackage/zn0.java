package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zn0 implements yl0 {
    public final /* synthetic */ ri2 a;
    public final /* synthetic */ ci2 b;

    public zn0(ri2 ri2Var, ci2 ci2Var) {
        this.a = ri2Var;
        this.b = ci2Var;
    }

    @Override // defpackage.yl0
    public final void a() {
        ri2 ri2Var = this.a;
        nn0 nn0Var = (nn0) ri2Var.getValue();
        if (nn0Var != null) {
            ci2 ci2Var = this.b;
            if (ci2Var != null) {
                ci2Var.b(new mn0(nn0Var));
            }
            ri2Var.setValue(null);
        }
    }
}
