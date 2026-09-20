package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jw2 extends cx1 implements j81<w70, sd5> {
    public final /* synthetic */ long w;
    public final /* synthetic */ ay2 x;

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jy1.values().length];
            iArr[1] = 1;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw2(long j, ay2 ay2Var) {
        super(1);
        this.w = j;
        this.x = ay2Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(w70 w70Var) {
        float fE;
        w70 w70Var2 = w70Var;
        long j = this.w;
        float fE2 = cm4.e(j);
        if (fE2 > 0.0f) {
            float fB0 = w70Var2.b0(iw2.a);
            float fB1 = w70Var2.b0(this.x.b(w70Var2.getLayoutDirection())) - fB0;
            float f = 2;
            float fE3 = (fB0 * f) + fE2 + fB1;
            jy1 layoutDirection = w70Var2.getLayoutDirection();
            int[] iArr = QnHx.a;
            if (iArr[layoutDirection.ordinal()] == 1) {
                fE = cm4.e(w70Var2.d()) - fE3;
            } else {
                fE = fB1 < 0.0f ? 0.0f : fB1;
            }
            if (iArr[w70Var2.getLayoutDirection().ordinal()] == 1) {
                fE3 = cm4.e(w70Var2.d()) - (fB1 >= 0.0f ? fB1 : 0.0f);
            }
            float fC = cm4.c(j);
            float f2 = (-fC) / f;
            float f3 = fC / f;
            en.CQf cQfE0 = w70Var2.e0();
            long jD = cQfE0.d();
            cQfE0.b().e();
            cQfE0.a.b(fE, f2, fE3, f3, 0);
            w70Var2.B0();
            cQfE0.b().r();
            cQfE0.a(jD);
        } else {
            w70Var2.B0();
        }
        return sd5.a;
    }
}
