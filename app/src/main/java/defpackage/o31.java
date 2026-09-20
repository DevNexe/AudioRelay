package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o31 extends cx1 implements h81<Boolean> {
    public final /* synthetic */ b31 w;
    public final /* synthetic */ ri2<Boolean> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(ri2 ri2Var, b31 b31Var) {
        super(0);
        this.w = b31Var;
        this.x = ri2Var;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        this.w.a();
        return Boolean.valueOf(v31.a(this.x));
    }
}
