package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kp0 extends cx1 implements h81<Boolean> {
    public final /* synthetic */ xp0 w;
    public final /* synthetic */ ua0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(xp0 xp0Var, ua0 ua0Var) {
        super(0);
        this.w = xp0Var;
        this.x = ua0Var;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        xp0 xp0Var = this.w;
        if (xp0Var.a.b.invoke(yp0.Closed).booleanValue()) {
            fp1.k0(this.x, null, 0, new jp0(xp0Var, null), 3);
        }
        return Boolean.TRUE;
    }
}
