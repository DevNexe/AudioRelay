package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbmb extends NativeAd.Image {
    public final zzbma a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    public zzbmb(zzbma zzbmaVar) {
        Drawable drawable;
        double dZzb;
        int iZzd;
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
        int iZzc = -1;
        try {
            iZzd = this.a.zzd();
        } catch (RemoteException e4) {
            zzcgn.zzh("", e4);
            iZzd = -1;
        }
        this.e = iZzd;
        try {
            iZzc = this.a.zzc();
        } catch (RemoteException e5) {
            zzcgn.zzh("", e5);
        }
        this.f = iZzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.e;
    }
}
