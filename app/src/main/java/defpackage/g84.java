package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g84 extends cx1 implements j81<f31, sd5> {
    public final /* synthetic */ b84 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g84(b84 b84Var) {
        super(1);
        this.w = b84Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(f31 f31Var) {
        f31 f31Var2 = f31Var;
        boolean zC = f31Var2.c();
        b84 b84Var = this.w;
        if (!zC && b84Var.c()) {
            b84Var.f();
        }
        b84Var.h.setValue(Boolean.valueOf(f31Var2.c()));
        return sd5.a;
    }
}
