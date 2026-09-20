package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ki2 extends cx1 implements j81<Boolean, sd5> {
    public final /* synthetic */ hi2 w;
    public final /* synthetic */ j81<Boolean, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ki2(hi2 hi2Var, j81<? super Boolean, sd5> j81Var) {
        super(1);
        this.w = hi2Var;
        this.x = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        hi2 hi2Var = this.w;
        hi2Var.d.setValue(hi2Var.c());
        this.x.invoke(Boolean.valueOf(zBooleanValue));
        return sd5.a;
    }
}
