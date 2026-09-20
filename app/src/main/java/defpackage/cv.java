package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cv extends cx1 implements j81<w70, sd5> {
    public final /* synthetic */ av A;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ np3 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ bj1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(boolean z, np3 np3Var, boolean z2, bj1 bj1Var, av avVar) {
        super(1);
        this.w = z;
        this.x = np3Var;
        this.y = z2;
        this.z = bj1Var;
        this.A = avVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    @Override // defpackage.j81
    public final sd5 invoke(w70 w70Var) {
        w70 w70Var2 = w70Var;
        w70Var2.B0();
        np3 np3Var = np3.Rtl;
        np3 np3Var2 = np3.Ltr;
        boolean z = false;
        np3 np3Var3 = this.x;
        boolean z2 = this.y;
        if (!this.w) {
            if (!((np3Var3 == np3Var2 && !z2) || (np3Var3 == np3Var && z2))) {
                z = true;
            }
        } else if ((np3Var3 == np3Var2 && !z2) || (np3Var3 == np3Var && z2)) {
            z = true;
        }
        av avVar = this.A;
        bj1 bj1Var = this.z;
        if (z) {
            long jT0 = w70Var2.t0();
            en.CQf cQfE0 = w70Var2.e0();
            long jD = cQfE0.d();
            cQfE0.b().e();
            cQfE0.a.e(jT0);
            qo0.d(w70Var2, bj1Var, avVar);
            cQfE0.b().r();
            cQfE0.a(jD);
        } else {
            qo0.d(w70Var2, bj1Var, avVar);
        }
        return sd5.a;
    }
}
