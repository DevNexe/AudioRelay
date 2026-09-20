package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdoa extends zzblw {
    public final zzdoo w;
    public IObjectWrapper x;

    public zzdoa(zzdoo zzdooVar) {
        this.w = zzdooVar;
    }

    public static float L0(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.M0(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final float zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfm)).booleanValue()) {
            return 0.0f;
        }
        zzdoo zzdooVar = this.w;
        if (zzdooVar.zzb() != 0.0f) {
            return zzdooVar.zzb();
        }
        if (zzdooVar.zzj() != null) {
            try {
                return zzdooVar.zzj().zze();
            } catch (RemoteException e) {
                zzcgn.zzh("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.x;
        if (iObjectWrapper != null) {
            return L0(iObjectWrapper);
        }
        zzbma zzbmaVarZzm = zzdooVar.zzm();
        if (zzbmaVarZzm == null) {
            return 0.0f;
        }
        float fZzd = (zzbmaVarZzm.zzd() == -1 || zzbmaVarZzm.zzc() == -1) ? 0.0f : zzbmaVarZzm.zzd() / zzbmaVarZzm.zzc();
        return fZzd == 0.0f ? L0(zzbmaVarZzm.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final float zzf() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfn)).booleanValue()) {
            return 0.0f;
        }
        zzdoo zzdooVar = this.w;
        if (zzdooVar.zzj() != null) {
            return zzdooVar.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final float zzg() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfn)).booleanValue()) {
            return 0.0f;
        }
        zzdoo zzdooVar = this.w;
        if (zzdooVar.zzj() != null) {
            return zzdooVar.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfn)).booleanValue()) {
            return this.w.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final IObjectWrapper zzi() {
        IObjectWrapper iObjectWrapper = this.x;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbma zzbmaVarZzm = this.w.zzm();
        if (zzbmaVarZzm == null) {
            return null;
        }
        return zzbmaVarZzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.x = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final boolean zzk() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfn)).booleanValue() && this.w.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzl(zzbni zzbniVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfn)).booleanValue()) {
            zzdoo zzdooVar = this.w;
            if (zzdooVar.zzj() instanceof zzcnj) {
                ((zzcnj) zzdooVar.zzj()).zzv(zzbniVar);
            }
        }
    }
}
