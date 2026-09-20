package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cl5 {
    public final hw a;

    public cl5(hw hwVar) {
        this.a = hwVar;
    }

    public final u01 a() {
        hw hwVar = this.a;
        return kd.f(hwVar.g("volume_shaper_enabled"), new al5(hwVar.e("capture_volume_shaper_strategy", "normalize_volume"), this), hwVar.c(0, "gain_volume_amount_db"), new bl5(null));
    }
}
