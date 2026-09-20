package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gp0 extends cx1 implements h81<sd5> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ xp0 x;
    public final /* synthetic */ ua0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp0(boolean z, xp0 xp0Var, ua0 ua0Var) {
        super(0);
        this.w = z;
        this.x = xp0Var;
        this.y = ua0Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        if (this.w) {
            xp0 xp0Var = this.x;
            if (xp0Var.a.b.invoke(yp0.Closed).booleanValue()) {
                fp1.k0(this.y, null, 0, new fp0(xp0Var, null), 3);
            }
        }
        return sd5.a;
    }
}
