package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g77 implements e77 {
    public static final px6 a;

    static {
        tx6 tx6Var = new tx6(lx6.a(), false, true);
        a = tx6Var.c("measurement.client.sessions.check_on_reset_and_enable2", true);
        tx6Var.c("measurement.client.sessions.check_on_startup", true);
        tx6Var.c("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // defpackage.e77
    public final void zza() {
    }

    @Override // defpackage.e77
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }
}
