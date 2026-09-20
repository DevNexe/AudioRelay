package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbof {
    public final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener a;
    public final NativeCustomTemplateAd.OnCustomClickListener b;
    public zzbmv c;

    public zzbof(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.a = onCustomTemplateAdLoadedListener;
        this.b = onCustomClickListener;
    }

    public final zzbne zzd() {
        if (this.b == null) {
            return null;
        }
        return new zzboc(this);
    }

    public final zzbnh zze() {
        return new zzboe(this);
    }
}
