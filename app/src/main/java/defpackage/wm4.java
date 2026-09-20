package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wm4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ float A;
    public final /* synthetic */ int B;
    public final /* synthetic */ j81<Float, Float> w;
    public final /* synthetic */ rt<Float> x;
    public final /* synthetic */ rt<Float> y;
    public final /* synthetic */ ri2<Float> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wm4(j81<? super Float, Float> j81Var, rt<Float> rtVar, rt<Float> rtVar2, ri2<Float> ri2Var, float f, int i) {
        super(2);
        this.w = j81Var;
        this.x = rtVar;
        this.y = rtVar2;
        this.z = ri2Var;
        this.A = f;
        this.B = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        cn4.d(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1);
        return sd5.a;
    }
}
