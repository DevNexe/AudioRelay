package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public final class zzej implements MediaContent {
    public final zzblx a;
    public final VideoController b = new VideoController();

    public zzej(zzblx zzblxVar) {
        this.a = zzblxVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.a.zze();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.a.zzf();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.a.zzg();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            IObjectWrapper iObjectWrapperZzi = this.a.zzi();
            if (iObjectWrapperZzi != null) {
                return (Drawable) ObjectWrapper.M0(iObjectWrapperZzi);
            }
            return null;
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        VideoController videoController = this.b;
        zzblx zzblxVar = this.a;
        try {
            if (zzblxVar.zzh() != null) {
                videoController.zzb(zzblxVar.zzh());
            }
        } catch (RemoteException e) {
            zzcgn.zzh("Exception occurred while getting video controller", e);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.a.zzk();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.a.zzj(new ObjectWrapper(drawable));
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    public final zzblx zza() {
        return this.a;
    }
}
