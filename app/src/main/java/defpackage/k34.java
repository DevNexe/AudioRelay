package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k34 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ x81<g30, Integer, sd5> A;
    public final /* synthetic */ x81<g30, Integer, sd5> B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ y81<co4, g30, Integer, sd5> E;
    public final /* synthetic */ r34 F;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ x81<g30, Integer, sd5> y;
    public final /* synthetic */ y81<ay2, g30, Integer, sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k34(boolean z, int i, x81<? super g30, ? super Integer, sd5> x81Var, y81<? super ay2, ? super g30, ? super Integer, sd5> y81Var, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3, int i2, int i3, y81<? super co4, ? super g30, ? super Integer, sd5> y81Var2, r34 r34Var) {
        super(2);
        this.w = z;
        this.x = i;
        this.y = x81Var;
        this.z = y81Var;
        this.A = x81Var2;
        this.B = x81Var3;
        this.C = i2;
        this.D = i3;
        this.E = y81Var2;
        this.F = r34Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            boolean z = this.w;
            int i = this.x;
            x81<g30, Integer, sd5> x81Var = this.y;
            y81<ay2, g30, Integer, sd5> y81Var = this.z;
            y81<co4, g30, Integer, sd5> y81Var2 = this.E;
            r34 r34Var = this.F;
            int i2 = this.C;
            i34.b(z, i, x81Var, y81Var, X.m(g30Var2, 533782017, new j34(y81Var2, r34Var, i2)), this.A, this.B, g30Var2, ((i2 >> 21) & 14) | 24576 | ((i2 >> 15) & 112) | (i2 & 896) | ((this.D >> 12) & 7168) | (458752 & i2) | ((i2 << 9) & 3670016));
        }
        return sd5.a;
    }
}
