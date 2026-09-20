package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf3 extends cx1 implements j81<ro0, sd5> {
    public final /* synthetic */ is4<Float> A;
    public final /* synthetic */ is4<Float> B;
    public final /* synthetic */ is4<Float> C;
    public final /* synthetic */ float w;
    public final /* synthetic */ long x;
    public final /* synthetic */ qv4 y;
    public final /* synthetic */ is4<Integer> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf3(float f, long j, qv4 qv4Var, bk1.QnHx qnHx, bk1.QnHx qnHx2, bk1.QnHx qnHx3, bk1.QnHx qnHx4) {
        super(1);
        this.w = f;
        this.x = j;
        this.y = qv4Var;
        this.z = qnHx;
        this.A = qnHx2;
        this.B = qnHx3;
        this.C = qnHx4;
    }

    @Override // defpackage.j81
    public final sd5 invoke(ro0 ro0Var) {
        ro0 ro0Var2 = ro0Var;
        float fIntValue = (this.z.getValue().intValue() * 216.0f) % 360.0f;
        float fFloatValue = this.A.getValue().floatValue();
        is4<Float> is4Var = this.B;
        float fAbs = Math.abs(fFloatValue - is4Var.getValue().floatValue());
        float fFloatValue2 = is4Var.getValue().floatValue() + this.C.getValue().floatValue() + (fIntValue - 90.0f);
        long j = this.x;
        float f = 2;
        float f2 = (((this.w / (ff3.c / f)) * 57.29578f) / 2.0f) + fFloatValue2;
        float fMax = Math.max(fAbs, 0.1f);
        qv4 qv4Var = this.y;
        float f3 = qv4Var.w / f;
        float fE = cm4.e(ro0Var2.d()) - (f * f3);
        long jA = X.a(f3, f3);
        long jE = ps0.e(fE, fE);
        int i = qo0.a;
        ro0Var2.w(j, f2, fMax, jA, jE, 1.0f, qv4Var, null, 3);
        return sd5.a;
    }
}
