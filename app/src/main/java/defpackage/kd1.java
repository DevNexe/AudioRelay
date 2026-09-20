package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kd1 implements yl0 {
    public final /* synthetic */ ri2 a;
    public final /* synthetic */ ci2 b;

    public kd1(ri2 ri2Var, ci2 ci2Var) {
        this.a = ri2Var;
        this.b = ci2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yl0
    public final void a() {
        ri2 ri2Var = this.a;
        hd1 hd1Var = (hd1) ri2Var.getValue();
        if (hd1Var != null) {
            this.b.b(new id1(hd1Var));
            ri2Var.setValue(null);
        }
    }
}
