package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpk extends zzbmd implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdqj {
    public static final zzfuv zza = zzfuv.zzr("2011", "1009", "3010");
    public final zzfyy A;
    public View B;

    @GuardedBy("this")
    public zzdoj D;
    public zzbbn E;
    public zzblx G;
    public boolean H;
    public final String w;
    public FrameLayout y;
    public FrameLayout z;

    @GuardedBy("this")
    public HashMap x = new HashMap();
    public IObjectWrapper F = null;
    public boolean I = false;
    public final int C = ModuleDescriptor.MODULE_VERSION;

    public zzdpk(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.y = frameLayout;
        this.z = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.w = str;
        com.google.android.gms.ads.internal.zzt.zzy();
        zzchn.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzy();
        zzchn.zzb(frameLayout, this);
        this.A = zzcha.zze;
        this.E = new zzbbn(this.y.getContext(), this.y);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    public final synchronized void L0(String str) {
        DisplayMetrics displayMetrics;
        View frameLayout = new FrameLayout(this.z.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.z.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    zzcgn.zzk("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.z.addView(frameLayout);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdoj zzdojVar = this.D;
        if (zzdojVar != null) {
            zzdojVar.zzk();
            this.D.zzx(view, this.y, zzl(), zzm(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdoj zzdojVar = this.D;
        if (zzdojVar != null) {
            FrameLayout frameLayout = this.y;
            zzdojVar.zzv(frameLayout, zzl(), zzm(), zzdoj.zzP(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdoj zzdojVar = this.D;
        if (zzdojVar != null) {
            FrameLayout frameLayout = this.y;
            zzdojVar.zzv(frameLayout, zzl(), zzm(), zzdoj.zzP(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdoj zzdojVar = this.D;
        if (zzdojVar != null) {
            zzdojVar.zzD(view, motionEvent, this.y);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final synchronized IObjectWrapper zzb(String str) {
        return new ObjectWrapper(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final synchronized void zzbA(IObjectWrapper iObjectWrapper) {
        if (this.I) {
            return;
        }
        Object objM0 = ObjectWrapper.M0(iObjectWrapper);
        if (!(objM0 instanceof zzdoj)) {
            zzcgn.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdoj zzdojVar = this.D;
        if (zzdojVar != null) {
            zzdojVar.zzL(this);
        }
        synchronized (this) {
            this.A.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpj
                @Override // java.lang.Runnable
                public final void run() {
                    zzdpk zzdpkVar = this.zza;
                    if (zzdpkVar.B == null) {
                        View view = new View(zzdpkVar.y.getContext());
                        zzdpkVar.B = view;
                        view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    }
                    if (zzdpkVar.y != zzdpkVar.B.getParent()) {
                        zzdpkVar.y.addView(zzdpkVar.B);
                    }
                }
            });
            zzdoj zzdojVar2 = (zzdoj) objM0;
            this.D = zzdojVar2;
            zzdojVar2.zzK(this);
            this.D.zzC(this.y);
            this.D.zzi(this.z);
            if (this.H) {
                this.D.zza().zzb(this.G);
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcZ)).booleanValue() || TextUtils.isEmpty(this.D.zzd())) {
                return;
            }
            L0(this.D.zzd());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final synchronized void zzbw(String str, IObjectWrapper iObjectWrapper) {
        zzq(str, (View) ObjectWrapper.M0(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final synchronized void zzbx(IObjectWrapper iObjectWrapper) {
        this.D.zzF((View) ObjectWrapper.M0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final synchronized void zzby(zzblx zzblxVar) {
        if (this.I) {
            return;
        }
        this.H = true;
        this.G = zzblxVar;
        zzdoj zzdojVar = this.D;
        if (zzdojVar != null) {
            zzdojVar.zza().zzb(zzblxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final synchronized void zzbz(IObjectWrapper iObjectWrapper) {
        if (this.I) {
            return;
        }
        this.F = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final synchronized void zzc() {
        if (this.I) {
            return;
        }
        zzdoj zzdojVar = this.D;
        if (zzdojVar != null) {
            zzdojVar.zzL(this);
            this.D = null;
        }
        this.x.clear();
        this.y.removeAllViews();
        this.z.removeAllViews();
        this.x = null;
        this.y = null;
        this.z = null;
        this.B = null;
        this.E = null;
        this.I = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzd(IObjectWrapper iObjectWrapper) {
        onTouch(this.y, (MotionEvent) ObjectWrapper.M0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final /* synthetic */ View zzf() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized View zzg(String str) {
        if (this.I) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.x.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final FrameLayout zzh() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final zzbbn zzi() {
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final IObjectWrapper zzj() {
        return this.F;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized String zzk() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized Map zzl() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized Map zzm() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized JSONObject zzo() {
        zzdoj zzdojVar = this.D;
        if (zzdojVar == null) {
            return null;
        }
        return zzdojVar.zzf(this.y, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized JSONObject zzp() {
        zzdoj zzdojVar = this.D;
        if (zzdojVar == null) {
            return null;
        }
        return zzdojVar.zzg(this.y, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final synchronized void zzq(String str, View view, boolean z) {
        if (this.I) {
            return;
        }
        if (view == null) {
            this.x.remove(str);
            return;
        }
        this.x.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (com.google.android.gms.ads.internal.util.zzbx.zzi(this.C)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }
}
