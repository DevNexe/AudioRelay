package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g67 implements f67 {
    public static final ox6 a;

    static {
        tx6 tx6Var = new tx6(lx6.a(), false, true);
        tx6Var.c("measurement.client.consent_state_v1", true);
        tx6Var.c("measurement.client.3p_consent_state_v1", true);
        tx6Var.c("measurement.service.consent_state_v1_W36", true);
        a = tx6Var.a("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // defpackage.f67
    public final long zza() {
        return ((Long) a.b()).longValue();
    }
}
