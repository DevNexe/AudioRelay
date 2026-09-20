package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o85 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ zs3 w;
    public final /* synthetic */ q85 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ h81<sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o85(zs3 zs3Var, q85 q85Var, boolean z, h81<sd5> h81Var) {
        super(1);
        this.w = zs3Var;
        this.x = q85Var;
        this.y = z;
        this.z = h81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        o94 o94Var2 = o94Var;
        zs3 zs3Var = this.w;
        if (zs3Var != null) {
            l94.a(o94Var2, zs3Var.a);
        }
        qv1<Object> qv1Var = l94.a[15];
        n94 n94Var = l94.n;
        n94Var.getClass();
        o94Var2.a(n94Var, this.x);
        o94Var2.a(w84.b, new FA4(null, new n85(this.z)));
        if (!this.y) {
            o94Var2.a(i94.i, sd5.a);
        }
        return sd5.a;
    }
}
