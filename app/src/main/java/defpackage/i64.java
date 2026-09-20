package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i64 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ ua0 A;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ m64 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i64(boolean z, boolean z2, boolean z3, m64 m64Var, ua0 ua0Var) {
        super(1);
        this.w = z;
        this.x = z2;
        this.y = z3;
        this.z = m64Var;
        this.A = ua0Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        o94 o94Var2 = o94Var;
        m64 m64Var = this.z;
        w54 w54Var = new w54(new g64(m64Var), new h64(m64Var), this.w);
        boolean z = this.x;
        if (z) {
            qv1<Object> qv1Var = l94.a[6];
            n94 n94Var = l94.g;
            n94Var.getClass();
            o94Var2.a(n94Var, w54Var);
        } else {
            qv1<Object> qv1Var2 = l94.a[5];
            n94 n94Var2 = l94.f;
            n94Var2.getClass();
            o94Var2.a(n94Var2, w54Var);
        }
        if (this.y) {
            o94Var2.a(w84.d, new FA4(null, new f64(this.A, z, m64Var)));
        }
        return sd5.a;
    }
}
