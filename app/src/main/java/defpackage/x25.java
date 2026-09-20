package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x25 extends cx1 implements j81<cm4, sd5> {
    public final /* synthetic */ float w;
    public final /* synthetic */ ri2<cm4> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x25(float f, ri2<cm4> ri2Var) {
        super(1);
        this.w = f;
        this.x = ri2Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    @Override // defpackage.j81
    public final sd5 invoke(cm4 cm4Var) {
        long j = cm4Var.a;
        float fE = cm4.e(j);
        float f = this.w;
        float f2 = fE * f;
        float fC = cm4.c(j) * f;
        ri2<cm4> ri2Var = this.x;
        if (cm4.e(ri2Var.getValue().a) == f2) {
            if (!(cm4.c(ri2Var.getValue().a) == fC)) {
                ri2Var.setValue(new cm4(ps0.e(f2, fC)));
            }
        } else {
            ri2Var.setValue(new cm4(ps0.e(f2, fC)));
        }
        return sd5.a;
    }
}
