package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rr extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ h81<sd5> B;
    public final /* synthetic */ zs3 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ h81<sd5> y = null;
    public final /* synthetic */ String z = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(zs3 zs3Var, String str, boolean z, h81 h81Var) {
        super(1);
        this.w = zs3Var;
        this.x = str;
        this.A = z;
        this.B = h81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        o94 o94Var2 = o94Var;
        zs3 zs3Var = this.w;
        if (zs3Var != null) {
            l94.a(o94Var2, zs3Var.a);
        }
        nr nrVar = new nr(this.B);
        qv1<Object>[] qv1VarArr = l94.a;
        o94Var2.a(w84.b, new FA4(this.x, nrVar));
        h81<sd5> h81Var = this.y;
        if (h81Var != null) {
            o94Var2.a(w84.c, new FA4(this.z, new or(h81Var)));
        }
        if (!this.A) {
            o94Var2.a(i94.i, sd5.a);
        }
        return sd5.a;
    }
}
