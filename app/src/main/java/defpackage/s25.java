package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s25 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ float A;
    public final /* synthetic */ float B;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ wp1 y;
    public final /* synthetic */ k25 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s25(boolean z, boolean z2, ci2 ci2Var, k25 k25Var, float f, float f2) {
        super(3);
        this.w = z;
        this.x = z2;
        this.y = ci2Var;
        this.z = k25Var;
        this.A = f;
        this.B = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(1398930845);
        nd ndVar = (nd) hH.j(this.w, this.x, this.y, this.z, this.A, this.B, g30Var2, 0).getValue();
        float f = s35.a;
        t35 t35Var = new t35(ndVar.a, ndVar);
        wo1.QnHx qnHx = wo1.a;
        so0 so0Var = new so0(t35Var);
        g30Var2.G();
        return so0Var;
    }
}
