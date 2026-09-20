package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgc;
import com.google.android.gms.internal.ads.zzcgn;
import defpackage.oa3;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {

    @NotOnlyInitialized
    public final zzdu w;

    public BaseAdView(Context context) {
        super(context);
        this.w = new zzdu(this, 0);
    }

    public void destroy() {
        zzbiy.zzc(getContext());
        if (((Boolean) zzbkm.zze.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zziD)).booleanValue()) {
                zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.w.zzk();
                        } catch (IllegalStateException e) {
                            zzcad.zza(baseAdView.getContext()).zzd(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.w.zzk();
    }

    public AdListener getAdListener() {
        return this.w.zza();
    }

    public AdSize getAdSize() {
        return this.w.zzb();
    }

    public String getAdUnitId() {
        return this.w.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.w.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.w.zzd();
    }

    public boolean isLoading() {
        return this.w.zzA();
    }

    public void loadAd(final AdRequest adRequest) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzbiy.zzc(getContext());
        if (((Boolean) zzbkm.zzf.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.w.zzm(adRequest.zza());
                        } catch (IllegalStateException e) {
                            zzcad.zza(baseAdView.getContext()).zzd(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.w.zzm(adRequest.zza());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzcgn.zzh("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        zzbiy.zzc(getContext());
        if (((Boolean) zzbkm.zzg.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zziE)).booleanValue()) {
                zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.w.zzn();
                        } catch (IllegalStateException e) {
                            zzcad.zza(baseAdView.getContext()).zzd(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.w.zzn();
    }

    public void resume() {
        zzbiy.zzc(getContext());
        if (((Boolean) zzbkm.zzh.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zziC)).booleanValue()) {
                zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.w.zzp();
                        } catch (IllegalStateException e) {
                            zzcad.zza(baseAdView.getContext()).zzd(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.w.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AdListener adListener) {
        zzdu zzduVar = this.w;
        zzduVar.zzr(adListener);
        if (adListener == 0) {
            zzduVar.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            zzduVar.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            zzduVar.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.w.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.w.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.w.zzx(onPaidEventListener);
    }

    public BaseAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new zzdu(this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.w = new zzdu(this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, Object obj) {
        super(context, attributeSet, i);
        this.w = new zzdu(this, attributeSet, true, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.w = new zzdu(this, attributeSet, true);
    }
}
