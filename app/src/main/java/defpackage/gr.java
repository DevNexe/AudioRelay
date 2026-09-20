package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gr implements yl0 {
    public final /* synthetic */ ri2 a;
    public final /* synthetic */ ci2 b;

    public gr(ri2 ri2Var, ci2 ci2Var) {
        this.a = ri2Var;
        this.b = ci2Var;
    }

    @Override // defpackage.yl0
    public final void a() {
        ri2 ri2Var = this.a;
        qd3 qd3Var = (qd3) ri2Var.getValue();
        if (qd3Var != null) {
            this.b.b(new pd3(qd3Var));
            ri2Var.setValue(null);
        }
    }
}
