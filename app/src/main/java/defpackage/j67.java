package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j67 implements i67 {
    public static final px6 a;
    public static final px6 b;

    static {
        tx6 tx6Var = new tx6(lx6.a(), true, true);
        tx6Var.c("measurement.collection.event_safelist", true);
        a = tx6Var.c("measurement.service.store_null_safelist", true);
        b = tx6Var.c("measurement.service.store_safelist", true);
    }

    @Override // defpackage.i67
    public final void zza() {
    }

    @Override // defpackage.i67
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.i67
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }
}
