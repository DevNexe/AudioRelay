package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class CYL extends cx1 implements j81<C1444h2, C> {
    public final /* synthetic */ iq4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CYL(iq4 iq4Var) {
        super(1);
        this.w = iq4Var;
    }

    @Override // defpackage.j81
    public final C invoke(C1444h2 c1444h2) {
        ln1 ln1Var = ln1.b;
        if (ln1Var != null) {
            return (C) ((j81) ln1Var.a.a().z).invoke(new f_Jd(this.w));
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
