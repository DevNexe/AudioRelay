package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyd implements NativeCustomFormatAd.DisplayOpenMeasurement {
    public final zzbmu a;

    public zzbyd(zzbmu zzbmuVar) {
        this.a = zzbmuVar;
        try {
            zzbmuVar.zzl();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.a.zzo(new ObjectWrapper(view));
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.a.zzr();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return false;
        }
    }
}
