package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x77 implements w77 {
    public static final px6 a;
    public static final qx6 b;
    public static final ox6 c;
    public static final ox6 d;
    public static final rx6 e;

    static {
        tx6 tx6Var = new tx6(lx6.a(), false, true);
        a = tx6Var.c("measurement.test.boolean_flag", false);
        b = new qx6(tx6Var, Double.valueOf(-3.0d));
        c = tx6Var.a("measurement.test.int_flag", -2L);
        d = tx6Var.a("measurement.test.long_flag", -1L);
        e = new rx6(tx6Var, "measurement.test.string_flag", "---");
    }

    @Override // defpackage.w77
    public final double zza() {
        return ((Double) b.b()).doubleValue();
    }

    @Override // defpackage.w77
    public final long zzb() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.w77
    public final long zzc() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.w77
    public final String zzd() {
        return (String) e.b();
    }

    @Override // defpackage.w77
    public final boolean zze() {
        return ((Boolean) a.b()).booleanValue();
    }
}
