package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class gf2 {
    public final hw a;

    public gf2(hw hwVar) {
        this.a = hwVar;
    }

    public final v01 a() {
        hw hwVar = this.a;
        return new v01(new mz0[]{hwVar.g("mic_noise_removal_enabled"), hwVar.g("mic_voice_detecion_cutoff_enabled"), hwVar.c(RCHTTPStatusCodes.ERROR, "mic_voice_detecion_cutoff_duration"), hwVar.b(0.95f, "mic_voice_detecion_cutoff_threshold"), hwVar.b(0.0f, "mic_wet_factor")}, new ff2(null));
    }
}
