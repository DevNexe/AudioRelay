package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzcgn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdViewHolder {
    public static WeakHashMap zza = new WeakHashMap();

    @NotOnlyInitialized
    public final zzbmk a;
    public final WeakReference b;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        if (view == null) {
            throw new NullPointerException("ContainerView must not be null");
        }
        if (view instanceof NativeAdView) {
            zzcgn.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else {
            if (zza.get(view) != null) {
                zzcgn.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
                return;
            }
            zza.put(view, this);
            this.b = new WeakReference(view);
            this.a = zzaw.zza().zzh(view, map == null ? new HashMap() : new HashMap(map), map2 == null ? new HashMap() : new HashMap(map2));
        }
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.a.zzb(new ObjectWrapper(view));
        } catch (RemoteException e) {
            zzcgn.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        IObjectWrapper iObjectWrapperA = nativeAd.a();
        WeakReference weakReference = this.b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzcgn.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zza.containsKey(view)) {
            zza.put(view, this);
        }
        zzbmk zzbmkVar = this.a;
        if (zzbmkVar != null) {
            try {
                zzbmkVar.zzc(iObjectWrapperA);
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public void unregisterNativeAd() {
        zzbmk zzbmkVar = this.a;
        if (zzbmkVar != null) {
            try {
                zzbmkVar.zzd();
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference weakReference = this.b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
