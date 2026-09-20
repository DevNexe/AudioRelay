package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzens implements com.google.android.gms.ads.internal.client.zza, zzdkl {

    @GuardedBy("this")
    public com.google.android.gms.ads.internal.client.zzbc w;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbc zzbcVar = this.w;
        if (zzbcVar != null) {
            try {
                zzbcVar.zzb();
            } catch (RemoteException e) {
                zzcgn.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        this.w = zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final synchronized void zzq() {
        com.google.android.gms.ads.internal.client.zzbc zzbcVar = this.w;
        if (zzbcVar != null) {
            try {
                zzbcVar.zzb();
            } catch (RemoteException e) {
                zzcgn.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
