package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o77 implements n77 {
    public static final px6 a;

    static {
        tx6 tx6Var = new tx6(lx6.a(), false, true);
        tx6Var.c("measurement.sdk.collection.enable_extend_user_property_size", true);
        tx6Var.c("measurement.sdk.collection.last_deep_link_referrer2", true);
        a = tx6Var.c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        tx6Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // defpackage.n77
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }
}
