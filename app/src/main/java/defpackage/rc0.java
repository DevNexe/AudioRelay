package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rc0 extends cx1 implements j81<ta1, sd5> {
    public final /* synthetic */ is4<Float> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc0(t95.LPt8Fixed lPt8) {
        super(1);
        this.w = lPt8;
    }

    @Override // defpackage.j81
    public final sd5 invoke(ta1 ta1Var) {
        ta1Var.b(this.w.getValue().floatValue());
        return sd5.a;
    }
}
