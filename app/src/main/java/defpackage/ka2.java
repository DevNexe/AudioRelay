package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ka2 implements ws3 {
    public static final ka2 a = new ka2();

    @Override // defpackage.ws3
    public final ms3 a(g30 g30Var) {
        ms3 ms3Var;
        g30Var.e(-1419762518);
        long j = ((yu) g30Var.E(r70.a)).a;
        if (((rv) g30Var.E(sv.a)).l()) {
            ms3Var = ((double) hH.s(j)) > 0.5d ? xs3.b : xs3.c;
        } else {
            ms3Var = xs3.d;
        }
        g30Var.G();
        return ms3Var;
    }

    @Override // defpackage.ws3
    public final long b(g30 g30Var) {
        g30Var.e(550536719);
        long j = ((yu) g30Var.E(r70.a)).a;
        boolean zL = ((rv) g30Var.E(sv.a)).l();
        float fS = hH.s(j);
        if (!zL && fS < 0.5d) {
            j = yu.d;
        }
        g30Var.G();
        return j;
    }
}
