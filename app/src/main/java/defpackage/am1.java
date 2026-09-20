package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class am1 extends cx1 implements h81<kb3> {
    public final /* synthetic */ dm1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am1(dm1 dm1Var) {
        super(0);
        this.w = dm1Var;
    }

    @Override // defpackage.h81
    public final kb3 invoke() {
        return new kb3(this.w.d());
    }
}
