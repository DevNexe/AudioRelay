package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y90 extends cx1 implements h81<Boolean> {
    public final /* synthetic */ u45 w;
    public final /* synthetic */ b31 x;
    public final /* synthetic */ boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y90(u45 u45Var, b31 b31Var, boolean z) {
        super(0);
        this.w = u45Var;
        this.x = b31Var;
        this.y = z;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        i55 i55Var;
        boolean z = !this.y;
        u45 u45Var = this.w;
        if (!u45Var.b()) {
            this.x.a();
        } else if (z && (i55Var = u45Var.d) != null && ur1.a(i55Var.a.b.get(), i55Var)) {
            i55Var.b.a();
        }
        return Boolean.TRUE;
    }
}
