package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyl implements NativeCustomFormatAd {
    public final zzbmu a;
    public final MediaView b;
    public final VideoController c = new VideoController();
    public zzbyd d;

    public zzbyl(zzbmu zzbmuVar) {
        Context context;
        this.a = zzbmuVar;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.M0(zzbmuVar.zzg());
        } catch (RemoteException | NullPointerException e) {
            zzcgn.zzh("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.a.zzq(new ObjectWrapper(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzcgn.zzh("", e2);
            }
        }
        this.b = mediaView;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.a.zzk();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.a.zzj();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.a.zzh();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        zzbmu zzbmuVar = this.a;
        try {
            if (this.d == null && zzbmuVar.zzp()) {
                this.d = new zzbyd(zzbmuVar);
            }
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
        return this.d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeAd.Image getImage(String str) {
        try {
            zzbma zzbmaVarZzf = this.a.zzf(str);
            if (zzbmaVarZzf != null) {
                return new zzbye(zzbmaVarZzf);
            }
            return null;
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String str) {
        try {
            return this.a.zzi(str);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final VideoController getVideoController() {
        VideoController videoController = this.c;
        try {
            com.google.android.gms.ads.internal.client.zzdk zzdkVarZze = this.a.zze();
            if (zzdkVarZze != null) {
                videoController.zzb(zzdkVarZze);
            }
        } catch (RemoteException e) {
            zzcgn.zzh("Exception occurred while getting video controller", e);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaView getVideoMediaView() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.a.zzm(str);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.a.zzn();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }
}
