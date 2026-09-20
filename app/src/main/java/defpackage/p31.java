package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p31 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ ri2<Boolean> w;
    public final /* synthetic */ b31 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p31(ri2<Boolean> ri2Var, b31 b31Var) {
        super(1);
        this.w = ri2Var;
        this.x = b31Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        o94 o94Var2 = o94Var;
        ri2<Boolean> ri2Var = this.w;
        boolean zA = v31.a(ri2Var);
        qv1<Object> qv1Var = l94.a[4];
        Boolean boolValueOf = Boolean.valueOf(zA);
        n94 n94Var = l94.e;
        n94Var.getClass();
        o94Var2.a(n94Var, boolValueOf);
        o94Var2.a(w84.o, new FA4(null, new o31(ri2Var, this.x)));
        return sd5.a;
    }
}
