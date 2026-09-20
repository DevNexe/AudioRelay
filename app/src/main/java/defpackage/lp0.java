package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lp0 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ String w;
    public final /* synthetic */ xp0 x;
    public final /* synthetic */ ua0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(String str, xp0 xp0Var, ua0 ua0Var) {
        super(1);
        this.w = str;
        this.x = xp0Var;
        this.y = ua0Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        o94 o94Var2 = o94Var;
        qv1<Object> qv1Var = l94.a[2];
        n94 n94Var = l94.c;
        n94Var.getClass();
        o94Var2.a(n94Var, this.w);
        xp0 xp0Var = this.x;
        if (xp0Var.a.b() == yp0.Open) {
            o94Var2.a(w84.n, new FA4(null, new kp0(xp0Var, this.y)));
        }
        return sd5.a;
    }
}
