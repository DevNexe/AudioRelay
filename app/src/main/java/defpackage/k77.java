package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k77 implements j77 {
    public static final px6 a;

    static {
        tx6 tx6Var = new tx6(lx6.a(), true, true);
        tx6Var.c("measurement.client.global_params", true);
        tx6Var.c("measurement.service.global_params_in_payload", true);
        a = tx6Var.c("measurement.service.clear_global_params_on_uninstall", true);
        tx6Var.c("measurement.service.global_params", true);
        tx6Var.a("measurement.id.service.global_params", 0L);
    }

    @Override // defpackage.j77
    public final void zza() {
    }

    @Override // defpackage.j77
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }
}
