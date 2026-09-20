package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v67 implements q67 {
    public static final px6 a;
    public static final px6 b;
    public static final px6 c;

    static {
        tx6 tx6Var = new tx6(lx6.a(), false, true);
        tx6Var.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = tx6Var.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = tx6Var.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = tx6Var.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // defpackage.q67
    public final void zza() {
    }

    @Override // defpackage.q67
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.q67
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.q67
    public final boolean zzd() {
        return ((Boolean) c.b()).booleanValue();
    }
}
