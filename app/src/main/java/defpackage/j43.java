package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j43 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ y81<t95.CQf<Boolean>, g30, Integer, lx0<Float>> A;
    public final /* synthetic */ y81<t95.CQf<Boolean>, g30, Integer, lx0<Float>> B;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ long x;
    public final /* synthetic */ dj4 y;
    public final /* synthetic */ g43 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j43(long j, dj4 dj4Var, g43 g43Var, y81 y81Var, y81 y81Var2, boolean z) {
        super(3);
        this.w = z;
        this.x = j;
        this.y = dj4Var;
        this.z = g43Var;
        this.A = y81Var;
        this.B = y81Var2;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        long j;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-1205707943);
        e40.CQf cQf = e40.a;
        boolean z = this.w;
        g30Var2.e(-199242674);
        long j2 = yu.h;
        long j3 = this.x;
        if (j3 != j2) {
            j = j3;
        } else {
            ry4 ry4Var = f43.a;
            g30Var2.e(1968040714);
            long jK = ((rv) g30Var2.E(sv.a)).k();
            long jL = hH.l(yu.b(sv.b(jK, g30Var2), 0.1f), jK);
            g30Var2.G();
            j = jL;
        }
        g30Var2.G();
        dj4 dj4Var = this.y;
        if (dj4Var == null) {
            dj4Var = ((jj4) g30Var2.E(kj4.a)).a;
        }
        c30 c30Var = new c30(wo1.a, new l43(j, dj4Var, this.z, this.A, this.B, z));
        g30Var2.G();
        return c30Var;
    }
}
