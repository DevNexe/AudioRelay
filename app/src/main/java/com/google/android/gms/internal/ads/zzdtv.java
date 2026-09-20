package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdtv extends VideoController.VideoLifecycleCallbacks {
    public final zzdoo a;

    public zzdtv(zzdoo zzdooVar) {
        this.a = zzdooVar;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzj = this.a.zzj();
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzi = null;
        if (zzdkVarZzj != null) {
            try {
                zzdnVarZzi = zzdkVarZzj.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzdnVarZzi == null) {
            return;
        }
        try {
            zzdnVarZzi.zze();
        } catch (RemoteException e) {
            zzcgn.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzj = this.a.zzj();
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzi = null;
        if (zzdkVarZzj != null) {
            try {
                zzdnVarZzi = zzdkVarZzj.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzdnVarZzi == null) {
            return;
        }
        try {
            zzdnVarZzi.zzg();
        } catch (RemoteException e) {
            zzcgn.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzj = this.a.zzj();
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzi = null;
        if (zzdkVarZzj != null) {
            try {
                zzdnVarZzi = zzdkVarZzj.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzdnVarZzi == null) {
            return;
        }
        try {
            zzdnVarZzi.zzi();
        } catch (RemoteException e) {
            zzcgn.zzk("Unable to call onVideoEnd()", e);
        }
    }
}
