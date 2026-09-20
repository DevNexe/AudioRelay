package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbny extends UnifiedNativeAd {
    public final zzbnx a;
    public final zzbmb c;
    public final zzblt e;
    public final ArrayList b = new ArrayList();
    public final VideoController d = new VideoController();
    public final ArrayList f = new ArrayList();

    public zzbny(zzbnx zzbnxVar) {
        zzbmb zzbmbVar;
        zzbma zzblyVar;
        IBinder iBinder;
        this.a = zzbnxVar;
        zzblt zzbltVar = null;
        try {
            List listZzu = zzbnxVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzblyVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzblyVar = iInterfaceQueryLocalInterface instanceof zzbma ? (zzbma) iInterfaceQueryLocalInterface : new zzbly(iBinder);
                    }
                    if (zzblyVar != null) {
                        this.b.add(new zzbmb(zzblyVar));
                    }
                }
            }
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
        try {
            List listZzv = this.a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    com.google.android.gms.ads.internal.client.zzcu zzcuVarZzb = obj2 instanceof IBinder ? com.google.android.gms.ads.internal.client.zzct.zzb((IBinder) obj2) : null;
                    if (zzcuVarZzb != null) {
                        this.f.add(new com.google.android.gms.ads.internal.client.zzcv(zzcuVarZzb));
                    }
                }
            }
        } catch (RemoteException e2) {
            zzcgn.zzh("", e2);
        }
        try {
            zzbma zzbmaVarZzk = this.a.zzk();
            zzbmbVar = zzbmaVarZzk != null ? new zzbmb(zzbmaVarZzk) : null;
        } catch (RemoteException e3) {
            zzcgn.zzh("", e3);
        }
        this.c = zzbmbVar;
        try {
            if (this.a.zzi() != null) {
                zzbltVar = new zzblt(this.a.zzi());
            }
        } catch (RemoteException e4) {
            zzcgn.zzh("", e4);
        }
        this.e = zzbltVar;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.zzw();
        } catch (RemoteException e) {
            zzcgn.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.a.zzx();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.zzC();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.a.zzn();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.a.zzo();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.a.zzp();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle bundleZzf = this.a.zzf();
            if (bundleZzf != null) {
                return bundleZzf;
            }
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.a.zzq();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final MediaContent getMediaContent() {
        zzbnx zzbnxVar = this.a;
        try {
            if (zzbnxVar.zzj() != null) {
                return new com.google.android.gms.ads.internal.client.zzej(zzbnxVar.zzj());
            }
            return null;
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.a.zzr();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.a.zzs();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVarZzg;
        try {
            zzdhVarZzg = this.a.zzg();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            zzdhVarZzg = null;
        }
        return ResponseInfo.zza(zzdhVarZzg);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double dZze = this.a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.a.zzt();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        VideoController videoController = this.d;
        zzbnx zzbnxVar = this.a;
        try {
            if (zzbnxVar.zzh() != null) {
                videoController.zzb(zzbnxVar.zzh());
            }
        } catch (RemoteException e) {
            zzcgn.zzh("Exception occurred while getting video controller", e);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.a.zzG();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.zzH();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        zzbnx zzbnxVar = this.a;
        try {
            try {
                if (zzbnxVar.zzH()) {
                    if (muteThisAdReason == null) {
                        zzbnxVar.zzy(null);
                        return;
                    } else if (muteThisAdReason instanceof com.google.android.gms.ads.internal.client.zzcv) {
                        zzbnxVar.zzy(((com.google.android.gms.ads.internal.client.zzcv) muteThisAdReason).zza());
                        return;
                    } else {
                        zzcgn.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                zzcgn.zzh("", e);
            }
            zzcgn.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e2) {
            zzcgn.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.a.zzz(bundle);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.zzA();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.zzI(bundle);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.zzB(bundle);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.zzD(new com.google.android.gms.ads.internal.client.zzcr(muteThisAdListener));
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.a.zzE(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
        } catch (RemoteException e) {
            zzcgn.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.zzF(new zzboj(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzcgn.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zza() {
        try {
            IObjectWrapper iObjectWrapperZzl = this.a.zzl();
            if (iObjectWrapperZzl != null) {
                return ObjectWrapper.M0(iObjectWrapperZzl);
            }
            return null;
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            return null;
        }
    }
}
