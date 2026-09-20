package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwj extends zzbvt {
    public final UnifiedNativeAdMapper w;

    public zzbwj(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.w = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzA() {
        return this.w.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzB() {
        return this.w.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final double zze() {
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.w;
        if (unifiedNativeAdMapper.getStarRating() != null) {
            return unifiedNativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final float zzf() {
        return this.w.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final float zzg() {
        return this.w.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final float zzh() {
        return this.w.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final Bundle zzi() {
        return this.w.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final com.google.android.gms.ads.internal.client.zzdk zzj() {
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.w;
        if (unifiedNativeAdMapper.zzb() != null) {
            return unifiedNativeAdMapper.zzb().zza();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbls zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbma zzl() {
        NativeAd.Image icon = this.w.getIcon();
        if (icon != null) {
            return new zzblm(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final IObjectWrapper zzm() {
        View adChoicesContent = this.w.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return new ObjectWrapper(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final IObjectWrapper zzn() {
        View viewZza = this.w.zza();
        if (viewZza == null) {
            return null;
        }
        return new ObjectWrapper(viewZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final IObjectWrapper zzo() {
        Object objZzc = this.w.zzc();
        if (objZzc == null) {
            return null;
        }
        return new ObjectWrapper(objZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzp() {
        return this.w.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzq() {
        return this.w.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzr() {
        return this.w.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzs() {
        return this.w.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzt() {
        return this.w.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzu() {
        return this.w.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final List zzv() {
        List<NativeAd.Image> images = this.w.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzblm(image.getDrawable(), image.getUri(), image.getScale(), image.zzb(), image.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.w.handleClick((View) ObjectWrapper.M0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzx() {
        this.w.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        HashMap map = (HashMap) ObjectWrapper.M0(iObjectWrapper2);
        HashMap map2 = (HashMap) ObjectWrapper.M0(iObjectWrapper3);
        this.w.trackViews((View) ObjectWrapper.M0(iObjectWrapper), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzz(IObjectWrapper iObjectWrapper) {
        this.w.untrackView((View) ObjectWrapper.M0(iObjectWrapper));
    }
}
