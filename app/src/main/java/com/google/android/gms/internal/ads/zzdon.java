package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdon extends com.google.android.gms.ads.internal.client.zzdj {
    public final Object w = new Object();

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdk x;

    @Nullable
    public final zzbvu y;

    public zzdon(@Nullable com.google.android.gms.ads.internal.client.zzdk zzdkVar, @Nullable zzbvu zzbvuVar) {
        this.x = zzdkVar;
        this.y = zzbvuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        zzbvu zzbvuVar = this.y;
        if (zzbvuVar != null) {
            return zzbvuVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        zzbvu zzbvuVar = this.y;
        if (zzbvuVar != null) {
            return zzbvuVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdn zzi() {
        synchronized (this.w) {
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.x;
            if (zzdkVar == null) {
                return null;
            }
            return zzdkVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(@Nullable com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        synchronized (this.w) {
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.x;
            if (zzdkVar != null) {
                zzdkVar.zzm(zzdnVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
