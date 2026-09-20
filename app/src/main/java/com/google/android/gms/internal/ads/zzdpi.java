package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzdpi extends zzbmj implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdqj {

    @GuardedBy("this")
    public zzdoj A;
    public final zzbbn B;
    public final WeakReference w;
    public final HashMap x = new HashMap();
    public final HashMap y = new HashMap();
    public final HashMap z = new HashMap();

    public zzdpi(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzt.zzy();
        zzchn.zza(view, this);
        com.google.android.gms.ads.internal.zzt.zzy();
        zzchn.zzb(view, this);
        this.w = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.x.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.z.putAll(this.x);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.y.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.z.putAll(this.y);
        this.B = new zzbbn(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdoj zzdojVar = this.A;
        if (zzdojVar != null) {
            zzdojVar.zzx(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdoj zzdojVar = this.A;
        if (zzdojVar != null) {
            zzdojVar.zzv(zzf(), zzl(), zzm(), zzdoj.zzP(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdoj zzdojVar = this.A;
        if (zzdojVar != null) {
            zzdojVar.zzv(zzf(), zzl(), zzm(), zzdoj.zzP(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdoj zzdojVar = this.A;
        if (zzdojVar != null) {
            zzdojVar.zzD(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) {
        if (this.A != null) {
            Object objM0 = ObjectWrapper.M0(iObjectWrapper);
            if (!(objM0 instanceof View)) {
                zzcgn.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.A.zzF((View) objM0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final synchronized void zzc(IObjectWrapper iObjectWrapper) {
        Object objM0 = ObjectWrapper.M0(iObjectWrapper);
        if (!(objM0 instanceof zzdoj)) {
            zzcgn.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdoj zzdojVar = this.A;
        if (zzdojVar != null) {
            zzdojVar.zzL(this);
        }
        zzdoj zzdojVar2 = (zzdoj) objM0;
        if (!zzdojVar2.zzM()) {
            zzcgn.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.A = zzdojVar2;
        zzdojVar2.zzK(this);
        this.A.zzC(zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final synchronized void zzd() {
        zzdoj zzdojVar = this.A;
        if (zzdojVar != null) {
            zzdojVar.zzL(this);
            this.A = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final View zzf() {
        return (View) this.w.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.z.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final zzbbn zzi() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized IObjectWrapper zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized Map zzl() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized Map zzm() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized Map zzn() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized JSONObject zzp() {
        zzdoj zzdojVar = this.A;
        if (zzdojVar == null) {
            return null;
        }
        return zzdojVar.zzg(zzf(), zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized void zzq(String str, View view, boolean z) {
        this.z.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.x.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
