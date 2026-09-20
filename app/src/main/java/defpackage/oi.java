package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oi {
    public static final by2 a;
    public static final float b = 64;
    public static final float c = 36;
    public static final float d = 1;
    public static final by2 e;

    static {
        float f = 16;
        float f2 = 8;
        a = new by2(f, f2, f, f2);
        e = new by2(f2, f2, f2, f2);
    }

    public static cg0 a(long j, g30 g30Var, int i) {
        g30Var.e(182742216);
        long j2 = (i & 1) != 0 ? yu.g : 0L;
        cg0 cg0Var = new cg0(j2, (i & 2) != 0 ? ((rv) g30Var.E(sv.a)).g() : j, j2, (i & 4) != 0 ? yu.b(((rv) g30Var.E(sv.a)).f(), AY.z(g30Var)) : 0L);
        g30Var.G();
        return cg0Var;
    }
}
