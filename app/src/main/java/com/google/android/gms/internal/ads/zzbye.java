package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbye extends NativeAd.Image {
    public final zzbma a;
    public final Drawable b;
    public final Uri c;
    public final double d;

    public zzbye(zzbma zzbmaVar) {
        Drawable drawable;
        double dZzb;
        this.a = zzbmaVar;
        Uri uriZze = null;
        try {
            IObjectWrapper iObjectWrapperZzf = zzbmaVar.zzf();
            drawable = iObjectWrapperZzf != null ? (Drawable) ObjectWrapper.M0(iObjectWrapperZzf) : null;
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
        this.b = drawable;
        try {
            uriZze = this.a.zze();
        } catch (RemoteException e2) {
            zzcgn.zzh("", e2);
        }
        this.c = uriZze;
        try {
            dZzb = this.a.zzb();
        } catch (RemoteException e3) {
            zzcgn.zzh("", e3);
            dZzb = 1.0d;
        }
        this.d = dZzb;
        try {
            this.a.zzd();
        } catch (RemoteException e4) {
            zzcgn.zzh("", e4);
        }
        try {
            this.a.zzc();
        } catch (RemoteException e5) {
            zzcgn.zzh("", e5);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.c;
    }
}
