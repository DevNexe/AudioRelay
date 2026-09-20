package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f45 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ g45 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ ci2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f45(ci2 ci2Var, g45 g45Var, boolean z) {
        super(3);
        this.w = g45Var;
        this.x = z;
        this.y = ci2Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        boolean z;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(805428266);
        boolean z2 = g30Var2.E(r40.k) == jy1.Rtl;
        g45 g45Var = this.w;
        boolean z3 = ((aw2) g45Var.e.getValue()) == aw2.Vertical || !z2;
        e45 e45Var = new e45(g45Var);
        g30Var2.e(-180460798);
        ri2 ri2VarF0 = ps0.f0(e45Var, g30Var2);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        if (objF == g30.QnHx.a) {
            th0 th0Var = new th0(new x64(ri2VarF0));
            g30Var2.B(th0Var);
            objF = th0Var;
        }
        g30Var2.G();
        w64 w64Var = (w64) objF;
        g30Var2.G();
        pg2.QnHx qnHx = pg2.QnHx.w;
        aw2 aw2Var = (aw2) g45Var.e.getValue();
        if (this.x) {
            if (((Number) g45Var.b.getValue()).floatValue() == 0.0f) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        pg2 pg2VarB = o64.b(qnHx, w64Var, aw2Var, null, z, z3, null, this.y);
        g30Var2.G();
        return pg2VarB;
    }
}
