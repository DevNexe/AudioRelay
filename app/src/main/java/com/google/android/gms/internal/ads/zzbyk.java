package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyk {
    public final NativeCustomFormatAd.OnCustomFormatAdLoadedListener a;
    public final NativeCustomFormatAd.OnCustomClickListener b;
    public zzbyl c;

    public zzbyk(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.a = onCustomFormatAdLoadedListener;
        this.b = onCustomClickListener;
    }

    public final zzbne zza() {
        if (this.b == null) {
            return null;
        }
        return new zzbyh(this);
    }

    public final zzbnh zzb() {
        return new zzbyj(this);
    }
}
