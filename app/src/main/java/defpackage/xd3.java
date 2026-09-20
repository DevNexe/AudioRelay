package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xd3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ Object[] w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd3(String str, String str2, Object[] objArr) {
        super(2);
        this.w = objArr;
        this.x = str;
        this.y = str2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            g30Var2.e(-492369756);
            Object objF = g30Var2.f();
            if (objF == g30.QnHx.a) {
                objF = ps0.R(0);
                g30Var2.B(objF);
            }
            g30Var2.G();
            ri2 ri2Var = (ri2) objF;
            Object[] objArr = this.w;
            i34.a(null, null, null, null, null, X.m(g30Var2, 2137630662, new vd3(ri2Var, objArr)), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, X.m(g30Var2, -1578412612, new wd3(this.x, this.y, objArr, ri2Var)), g30Var2, 196608, 12582912, 131039);
        }
        return sd5.a;
    }
}
