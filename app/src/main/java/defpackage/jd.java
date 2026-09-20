package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jd extends cx1 implements j81<w70, sd5> {
    public final /* synthetic */ float A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ qv4 D;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ cg x;
    public final /* synthetic */ long y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(boolean z, cg cgVar, long j, float f, float f2, long j2, long j3, qv4 qv4Var) {
        super(1);
        this.w = z;
        this.x = cgVar;
        this.y = j;
        this.z = f;
        this.A = f2;
        this.B = j2;
        this.C = j3;
        this.D = qv4Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(w70 w70Var) {
        w70 w70Var2 = w70Var;
        w70Var2.B0();
        if (this.w) {
            qo0.j(w70Var2, this.x, 0L, 0L, this.y, null, 246);
        } else {
            long j = this.y;
            float fB = ha0.b(j);
            float f = this.z;
            if (fB < f) {
                float f2 = this.A;
                float fE = cm4.e(w70Var2.d());
                float f3 = this.A;
                float f4 = fE - f3;
                float fC = cm4.c(w70Var2.d()) - f3;
                cg cgVar = this.x;
                long j2 = this.y;
                en.CQf cQfE0 = w70Var2.e0();
                long jD = cQfE0.d();
                cQfE0.b().e();
                cQfE0.a.b(f2, f2, f4, fC, 0);
                qo0.j(w70Var2, cgVar, 0L, 0L, j2, null, 246);
                cQfE0.b().r();
                cQfE0.a(jD);
            } else {
                qo0.j(w70Var2, this.x, this.B, this.C, ko6.c(j, f), this.D, 208);
            }
        }
        return sd5.a;
    }
}
