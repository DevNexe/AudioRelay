package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e50 implements uw4 {
    public final /* synthetic */ f50 w;
    public final /* synthetic */ boolean x = true;
    public final /* synthetic */ g50 y;

    public /* synthetic */ e50(f50 f50Var, g50 g50Var) {
        this.w = f50Var;
        this.y = g50Var;
    }

    @Override // defpackage.uw4
    public final w05 e(Object obj) {
        f50 f50Var = this.w;
        boolean z = this.x;
        g50 g50Var = this.y;
        if (z) {
            synchronized (f50Var) {
                f50Var.c = k15.e(g50Var);
            }
        } else {
            f50Var.getClass();
        }
        return k15.e(g50Var);
    }
}
