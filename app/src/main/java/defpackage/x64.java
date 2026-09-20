package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x64 extends cx1 implements j81<Float, Float> {
    public final /* synthetic */ is4<j81<Float, Float>> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x64(ri2 ri2Var) {
        super(1);
        this.w = ri2Var;
    }

    @Override // defpackage.j81
    public final Float invoke(Float f) {
        return this.w.getValue().invoke(Float.valueOf(f.floatValue()));
    }
}
