package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class og0 implements ar0 {
    public static final og0 a = new og0();

    @Override // defpackage.ar0
    public final long a(long j, float f, g30 g30Var, int i) {
        rv rvVar = (rv) g30Var.E(sv.a);
        if (Float.compare(f, 0) <= 0 || rvVar.l()) {
            return j;
        }
        jt4 jt4Var = br0.a;
        return hH.l(yu.b(sv.b(j, g30Var), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), j);
    }
}
