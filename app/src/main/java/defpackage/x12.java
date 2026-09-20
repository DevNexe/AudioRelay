package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x12 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ j81<Integer, Boolean> A;
    public final /* synthetic */ bu B;
    public final /* synthetic */ j81<Object, Integer> w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ w54 y;
    public final /* synthetic */ x81<Float, Float, Boolean> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x12(a22 a22Var, boolean z, w54 w54Var, c22 c22Var, e22 e22Var, bu buVar) {
        super(1);
        this.w = a22Var;
        this.x = z;
        this.y = w54Var;
        this.z = c22Var;
        this.A = e22Var;
        this.B = buVar;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        o94 o94Var2 = o94Var;
        qv1<Object>[] qv1VarArr = l94.a;
        o94Var2.a(i94.A, this.w);
        boolean z = this.x;
        w54 w54Var = this.y;
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
        x81<Float, Float, Boolean> x81Var = this.z;
        if (x81Var != null) {
            o94Var2.a(w84.d, new FA4(null, x81Var));
        }
        j81<Integer, Boolean> j81Var = this.A;
        if (j81Var != null) {
            o94Var2.a(w84.e, new FA4(null, j81Var));
        }
        qv1<Object> qv1Var3 = l94.a[13];
        n94 n94Var3 = l94.m;
        n94Var3.getClass();
        o94Var2.a(n94Var3, this.B);
        return sd5.a;
    }
}
