package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mb0 implements uw4<Boolean, Void> {
    public final /* synthetic */ w05 w;
    public final /* synthetic */ rb0 x;

    public mb0(rb0 rb0Var, kc7 kc7Var) {
        this.x = rb0Var;
        this.w = kc7Var;
    }

    @Override // defpackage.uw4
    public final w05<Void> e(Boolean bool) {
        w05 w05VarI;
        db0 db0Var = this.x.e;
        lb0 lb0Var = new lb0(this, bool);
        synchronized (db0Var.c) {
            w05VarI = db0Var.b.i(db0Var.a, new fb0(lb0Var));
            db0Var.b = w05VarI.f(db0Var.a, new qe0());
        }
        return w05VarI;
    }
}
