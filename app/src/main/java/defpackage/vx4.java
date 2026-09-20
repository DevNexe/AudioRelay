package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vx4 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ x81<l93, z80<? super sd5>, Object> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vx4(Object obj, Object obj2, x81<? super l93, ? super z80<? super sd5>, ? extends Object> x81Var) {
        super(3);
        this.w = obj;
        this.x = obj2;
        this.y = x81Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(1175567217);
        ij0 ij0Var = (ij0) g30Var2.E(r40.e);
        ti5 ti5Var = (ti5) g30Var2.E(r40.o);
        g30Var2.e(1157296644);
        boolean zI = g30Var2.I(ij0Var);
        Object objF = g30Var2.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new qx4(ti5Var, ij0Var);
            g30Var2.B(objF);
        }
        g30Var2.G();
        qx4 qx4Var = (qx4) objF;
        wq0.f(qx4Var, this.w, this.x, new ux4(qx4Var, this.y, null), g30Var2);
        g30Var2.G();
        return qx4Var;
    }
}
