package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class up0 extends cx1 implements h81<xp0> {
    public final /* synthetic */ yp0 w = yp0.Closed;
    public final /* synthetic */ j81<yp0, Boolean> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up0(j81 j81Var) {
        super(0);
        this.x = j81Var;
    }

    @Override // defpackage.h81
    public final xp0 invoke() {
        return new xp0(this.w, this.x);
    }
}
