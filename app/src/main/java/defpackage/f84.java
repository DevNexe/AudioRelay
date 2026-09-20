package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f84 extends cx1 implements j81<iy1, sd5> {
    public final /* synthetic */ b84 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f84(b84 b84Var) {
        super(1);
        this.w = b84Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(iy1 iy1Var) {
        iy1 iy1Var2 = iy1Var;
        b84 b84Var = this.w;
        b84Var.j = iy1Var2;
        if (b84Var.c() && b84Var.d() != null) {
            kt2 kt2Var = new kt2(iy1Var2.l(kt2.b));
            if (!ur1.a(b84Var.i, kt2Var)) {
                b84Var.i = kt2Var;
                b84Var.k();
                if (b84Var.c()) {
                    x55 x55Var = b84Var.f;
                    if ((x55Var != null ? x55Var.c() : 0) == 1) {
                        b84Var.j();
                    }
                }
            }
        }
        return sd5.a;
    }
}
