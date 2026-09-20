package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblu implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    public final zzbmu a;

    public zzblu(zzbmu zzbmuVar) {
        this.a = zzbmuVar;
        try {
            zzbmuVar.zzl();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.a.zzo(new ObjectWrapper(view));
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.a.zzr();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return false;
        }
    }
}
