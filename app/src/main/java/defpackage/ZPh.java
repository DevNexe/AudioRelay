package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ZPh extends cx1 implements j81<w70, sd5> {
    public final /* synthetic */ float w;
    public final /* synthetic */ bj1 x;
    public final /* synthetic */ av y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZPh(float f, bj1 bj1Var, av avVar) {
        super(1);
        this.w = f;
        this.x = bj1Var;
        this.y = avVar;
    }

    @Override // defpackage.j81
    public final sd5 invoke(w70 w70Var) {
        w70 w70Var2 = w70Var;
        w70Var2.B0();
        en.CQf cQfE0 = w70Var2.e0();
        long jD = cQfE0.d();
        cQfE0.b().e();
        float f = this.w;
        fn fnVar = cQfE0.a;
        fnVar.g(f, 0.0f);
        fnVar.d(kt2.b);
        qo0.d(w70Var2, this.x, this.y);
        cQfE0.b().r();
        cQfE0.a(jD);
        return sd5.a;
    }
}
