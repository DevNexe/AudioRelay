package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzey extends zzdd {
    public final OnPaidEventListener w;

    public zzey(OnPaidEventListener onPaidEventListener) {
        this.w = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzde
    public final void zze(zzs zzsVar) {
        OnPaidEventListener onPaidEventListener = this.w;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zzsVar.zzb, zzsVar.zzc, zzsVar.zzd));
        }
    }
}
