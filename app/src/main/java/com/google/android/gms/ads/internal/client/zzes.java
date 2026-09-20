package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgn;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzes extends zzcl {
    public zzbrs w;

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() {
        zzcgn.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzcgg.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzer
            @Override // java.lang.Runnable
            public final void run() {
                zzbrs zzbrsVar = this.zza.w;
                if (zzbrsVar != null) {
                    try {
                        zzbrsVar.zzb(Collections.emptyList());
                    } catch (RemoteException e) {
                        zzcgn.zzk("Could not notify onComplete event.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbvf zzbvfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbrs zzbrsVar) {
        this.w = zzbrsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzez zzezVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() {
        return false;
    }
}
