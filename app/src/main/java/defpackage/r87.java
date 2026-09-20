package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r87 implements q87 {
    public static final px6 a;
    public static final px6 b;

    static {
        tx6 tx6Var = new tx6(lx6.a(), true, true);
        a = tx6Var.c("measurement.collection.enable_session_stitching_token.client.dev", false);
        b = tx6Var.c("measurement.collection.enable_session_stitching_token.service", false);
    }

    @Override // defpackage.q87
    public final void zza() {
    }

    @Override // defpackage.q87
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.q87
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }
}
