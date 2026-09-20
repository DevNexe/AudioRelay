package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdsw implements zzbpq {
    public final zzbne a;
    public final zzdtl b;
    public final zzgul c;

    public zzdsw(zzdoz zzdozVar, zzdoo zzdooVar, zzdtl zzdtlVar, zzgul zzgulVar) {
        this.a = zzdozVar.zzc(zzdooVar.zzy());
        this.b = zzdtlVar;
        this.c = zzgulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.a.zze((zzbmu) this.c.zzb(), str);
        } catch (RemoteException e) {
            zzcgn.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.a == null) {
            return;
        }
        this.b.zzi("/nativeAdCustomClick", this);
    }
}
