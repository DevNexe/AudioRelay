package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jn4 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ ri2<Float> B;
    public final /* synthetic */ is4<Float> C;
    public final /* synthetic */ is4<j81<Float, sd5>> D;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ eo0 x;
    public final /* synthetic */ ci2 y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn4(float f, tm4 tm4Var, ci2 ci2Var, ri2 ri2Var, ri2 ri2Var2, ri2 ri2Var3, boolean z, boolean z2) {
        super(3);
        this.w = z;
        this.x = tm4Var;
        this.y = ci2Var;
        this.z = f;
        this.A = z2;
        this.B = ri2Var;
        this.C = ri2Var2;
        this.D = ri2Var3;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2VarA = pg2Var;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(1945228890);
        if (this.w) {
            g30Var2.e(773894976);
            g30Var2.e(-492369756);
            Object objF = g30Var2.f();
            if (objF == g30.QnHx.a) {
                s40 s40Var = new s40(wq0.i(g30Var2));
                g30Var2.B(s40Var);
                objF = s40Var;
            }
            g30Var2.G();
            ua0 ua0Var = ((s40) objF).w;
            g30Var2.G();
            Object[] objArr = {this.x, this.y, Float.valueOf(this.z), Boolean.valueOf(this.A)};
            hn4 hn4Var = new hn4(this.A, this.z, this.B, this.C, ua0Var, this.x, this.D, null);
            y83 y83Var = tx4.a;
            pg2VarA = f30.a(pg2VarA, wo1.a, new xx4(objArr, hn4Var));
        }
        g30Var2.G();
        return pg2VarA;
    }
}
