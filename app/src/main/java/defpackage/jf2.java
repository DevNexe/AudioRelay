package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jf2 extends cx1 implements j81<Float, sd5> {
    public final /* synthetic */ ri2<Float> w;
    public final /* synthetic */ j81<ev3, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jf2(ri2<Float> ri2Var, j81<? super ev3, sd5> j81Var) {
        super(1);
        this.w = ri2Var;
        this.x = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Float f) {
        float fFloatValue = f.floatValue();
        this.w.setValue(Float.valueOf(fFloatValue));
        this.x.invoke(new ev3.ck32((int) fFloatValue));
        return sd5.a;
    }
}
