package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzcgn;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    @NotOnlyInitialized
    public final FrameLayout w;

    @NotOnlyInitialized
    public final zzbme x;

    public NativeAdView(Context context) {
        super(context);
        this.w = c(context);
        this.x = d();
    }

    public final View a(String str) {
        zzbme zzbmeVar = this.x;
        if (zzbmeVar == null) {
            return null;
        }
        try {
            IObjectWrapper iObjectWrapperZzb = zzbmeVar.zzb(str);
            if (iObjectWrapperZzb != null) {
                return (View) ObjectWrapper.M0(iObjectWrapperZzb);
            }
            return null;
        } catch (RemoteException e) {
            zzcgn.zzh("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.w);
    }

    public final /* synthetic */ void b(MediaContent mediaContent) {
        zzbme zzbmeVar = this.x;
        if (zzbmeVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzej) {
                zzbmeVar.zzby(((zzej) mediaContent).zza());
            } else if (mediaContent == null) {
                zzbmeVar.zzby(null);
            } else {
                zzcgn.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzcgn.zzh("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.w;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final FrameLayout c(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @RequiresNonNull({"overlayFrame"})
    public final zzbme d() {
        if (isInEditMode()) {
            return null;
        }
        zzau zzauVarZza = zzaw.zza();
        FrameLayout frameLayout = this.w;
        return zzauVarZza.zzg(frameLayout.getContext(), this, frameLayout);
    }

    public void destroy() {
        zzbme zzbmeVar = this.x;
        if (zzbmeVar != null) {
            try {
                zzbmeVar.zzc();
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to destroy native ad view", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbme zzbmeVar;
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzcD)).booleanValue() && (zzbmeVar = this.x) != null) {
            try {
                zzbmeVar.zzd(new ObjectWrapper(motionEvent));
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(View view, String str) {
        zzbme zzbmeVar = this.x;
        if (zzbmeVar != null) {
            try {
                zzbmeVar.zzbw(str, new ObjectWrapper(view));
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call setAssetView on delegate", e);
            }
        }
    }

    public AdChoicesView getAdChoicesView() {
        View viewA = a("3011");
        if (viewA instanceof AdChoicesView) {
            return (AdChoicesView) viewA;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof MediaView) {
            return (MediaView) viewA;
        }
        if (viewA == null) {
            return null;
        }
        zzcgn.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbme zzbmeVar = this.x;
        if (zzbmeVar != null) {
            try {
                zzbmeVar.zze(new ObjectWrapper(view), i);
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.w);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.w == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        e(adChoicesView, "3011");
    }

    public final void setAdvertiserView(View view) {
        e(view, "3005");
    }

    public final void setBodyView(View view) {
        e(view, "3004");
    }

    public final void setCallToActionView(View view) {
        e(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        zzbme zzbmeVar = this.x;
        if (zzbmeVar != null) {
            try {
                zzbmeVar.zzbx(new ObjectWrapper(view));
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(View view) {
        e(view, "3001");
    }

    public final void setIconView(View view) {
        e(view, "3003");
    }

    public final void setImageView(View view) {
        e(view, "3008");
    }

    public final void setMediaView(MediaView mediaView) {
        e(mediaView, "3010");
        if (mediaView == null) {
            return;
        }
        zzb zzbVar = new zzb(this);
        synchronized (mediaView) {
            mediaView.A = zzbVar;
            if (mediaView.x) {
                zzbVar.zza.b(mediaView.w);
            }
        }
        zzc zzcVar = new zzc(this);
        synchronized (mediaView) {
            mediaView.B = zzcVar;
            if (mediaView.z) {
                ImageView.ScaleType scaleType = mediaView.y;
                zzbme zzbmeVar = zzcVar.zza.x;
                if (zzbmeVar != null && scaleType != null) {
                    try {
                        zzbmeVar.zzbz(new ObjectWrapper(scaleType));
                    } catch (RemoteException e) {
                        zzcgn.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
                    }
                }
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbme zzbmeVar = this.x;
        if (zzbmeVar != null) {
            try {
                zzbmeVar.zzbA(nativeAd.a());
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(View view) {
        e(view, "3007");
    }

    public final void setStarRatingView(View view) {
        e(view, "3009");
    }

    public final void setStoreView(View view) {
        e(view, "3006");
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = c(context);
        this.x = d();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = c(context);
        this.x = d();
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.w = c(context);
        this.x = d();
    }
}
