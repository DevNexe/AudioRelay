package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r30 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
    public final /* synthetic */ hl3 w;
    public final /* synthetic */ Z1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(hl3 hl3Var, Z1 z1) {
        super(3);
        this.w = hl3Var;
        this.x = z1;
    }

    @Override // defpackage.y81
    public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
        int i;
        jE<?> jEVar2 = jEVar;
        mn4 mn4Var2 = mn4Var;
        int iC = mn4Var2.c(this.x);
        e40.f(mn4Var2.r < iC);
        j30.a0(mn4Var2, jEVar2, iC);
        int i2 = mn4Var2.r;
        int iY = mn4Var2.s;
        while (iY >= 0 && !mn4Var2.s(iY)) {
            iY = mn4Var2.y(iY);
        }
        int iO = iY + 1;
        int iF = 0;
        while (iO < i2) {
            if (mn4Var2.p(i2, iO)) {
                if (mn4Var2.s(iO)) {
                    iF = 0;
                }
                iO++;
            } else {
                iF += mn4Var2.s(iO) ? 1 : fp1.x(mn4Var2.b, mn4Var2.n(iO));
                iO += mn4Var2.o(iO);
            }
        }
        while (true) {
            i = mn4Var2.r;
            if (i >= iC) {
                break;
            }
            if (mn4Var2.p(iC, i)) {
                int i3 = mn4Var2.r;
                if (i3 < mn4Var2.g && fp1.u(mn4Var2.b, mn4Var2.n(i3))) {
                    jEVar2.c(mn4Var2.x(mn4Var2.r));
                    iF = 0;
                }
                mn4Var2.J();
            } else {
                iF += mn4Var2.F();
            }
        }
        e40.f(i == iC);
        this.w.w = iF;
        return sd5.a;
    }
}
