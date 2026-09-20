package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import defpackage.ft;
import defpackage.oa3;
import defpackage.pe6;
import defpackage.qe6;
import defpackage.sa6;
import defpackage.x53;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzdno implements zzdow {
    public com.google.android.gms.ads.internal.client.zzcq A;
    public final Context a;
    public final zzdoz b;
    public final JSONObject c;
    public final zzdtl d;
    public final zzdoo e;
    public final zzapb f;
    public final zzddq g;
    public final zzdcw h;
    public final zzdkj i;
    public final zzfcs j;
    public final zzcgt k;
    public final zzfdn l;
    public final zzcvi m;
    public final zzdpr n;
    public final ft o;
    public final zzdkg p;
    public final zzfju q;
    public final zzfjc r;
    public boolean t;
    public boolean s = false;
    public boolean u = false;
    public boolean v = false;
    public Point w = new Point();
    public Point x = new Point();
    public long y = 0;
    public long z = 0;

    public zzdno(Context context, zzdoz zzdozVar, JSONObject jSONObject, zzdtl zzdtlVar, zzdoo zzdooVar, zzapb zzapbVar, zzddq zzddqVar, zzdcw zzdcwVar, zzdkj zzdkjVar, zzfcs zzfcsVar, zzcgt zzcgtVar, zzfdn zzfdnVar, zzcvi zzcviVar, zzdpr zzdprVar, ft ftVar, zzdkg zzdkgVar, zzfju zzfjuVar, zzfjc zzfjcVar) {
        this.a = context;
        this.b = zzdozVar;
        this.c = jSONObject;
        this.d = zzdtlVar;
        this.e = zzdooVar;
        this.f = zzapbVar;
        this.g = zzddqVar;
        this.h = zzdcwVar;
        this.i = zzdkjVar;
        this.j = zzfcsVar;
        this.k = zzcgtVar;
        this.l = zzfdnVar;
        this.m = zzcviVar;
        this.n = zzdprVar;
        this.o = ftVar;
        this.p = zzdkgVar;
        this.q = zzfjuVar;
        this.r = zzfjcVar;
    }

    public final String a(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzc = this.e.zzc();
        if (iZzc == 1) {
            return "1099";
        }
        if (iZzc == 2) {
            return "2099";
        }
        if (iZzc != 6) {
            return null;
        }
        return "3099";
    }

    public final boolean b(String str) {
        JSONObject jSONObjectOptJSONObject = this.c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    public final boolean c(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        Context context = this.a;
        oa3.d("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcF)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzt.zzq();
            DisplayMetrics displayMetricsZzr = com.google.android.gms.ads.internal.util.zzs.zzr((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, displayMetricsZzr.widthPixels));
                jSONObject7.put("height", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, displayMetricsZzr.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhh)).booleanValue();
            zzdtl zzdtlVar = this.d;
            if (zBooleanValue) {
                zzdtlVar.zzi("/clickRecorded", new pe6(this));
            } else {
                zzdtlVar.zzi("/logScionEvent", new sa6(this));
            }
            zzdtlVar.zzi("/nativeImpression", new qe6(this));
            zzchd.zza(zzdtlVar.zzd("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.s) {
                return true;
            }
            this.s = com.google.android.gms.ads.internal.zzt.zzt().zzn(context, this.k.zza, this.j.zzD.toString(), this.l.zzf);
            return true;
        } catch (JSONException e) {
            zzcgn.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    public final void d(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String strZze;
        ft ftVar = this.o;
        zzdoz zzdozVar = this.b;
        JSONObject jSONObject7 = this.c;
        zzdoo zzdooVar = this.e;
        oa3.d("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            jSONObject8.put("has_custom_click_handler", zzdozVar.zzc(zzdooVar.zzy()) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdooVar.zzc());
            jSONObject9.put("view_aware_api_used", z);
            zzblo zzbloVar = this.l.zzi;
            jSONObject9.put("custom_mute_requested", zzbloVar != null && zzbloVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdooVar.zzF().isEmpty() || zzdooVar.zzk() == null) ? false : true);
            if (this.n.zza() != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", ftVar.b());
            if (this.v && jSONObject7.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdozVar.zzc(zzdooVar.zzy()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZze = this.f.zzc().zze(this.a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                zzcgn.zzh("Exception obtaining click signals", e);
                strZze = null;
            }
            jSONObject9.put("click_signals", strZze);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdH)).booleanValue()) {
                jSONObject9.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhl)).booleanValue() && x53.b()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhm)).booleanValue() && x53.b()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long jB = ftVar.b();
            jSONObject10.put("time_from_last_touch_down", jB - this.y);
            jSONObject10.put("time_from_last_touch", jB - this.z);
            jSONObject8.put("touch_signal", jSONObject10);
            zzchd.zza(this.d.zzd("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick");
        } catch (JSONException e2) {
            zzcgn.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final boolean zzA(Bundle bundle) {
        if (b("impression_reporting")) {
            return c(null, null, null, null, null, com.google.android.gms.ads.internal.client.zzaw.zzb().zzj(bundle, null), false);
        }
        zzcgn.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final JSONObject zzd(View view, Map map, Map map2) {
        Context context = this.a;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbx.zzd(context, map, map2, view);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbx.zzg(context, view);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbx.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzg);
            jSONObject.put("scroll_view_signal", jSONObjectZzf);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (JSONException e) {
            zzcgn.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final JSONObject zze(View view, Map map, Map map2) {
        JSONObject jSONObjectZzd = zzd(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.v && this.c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZzd != null) {
                jSONObject.put("nas", jSONObjectZzd);
            }
        } catch (JSONException e) {
            zzcgn.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzf() {
        try {
            com.google.android.gms.ads.internal.client.zzcq zzcqVar = this.A;
            if (zzcqVar != null) {
                zzcqVar.zze();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzg() {
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.n.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzh() {
        this.d.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzi(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        try {
            if (this.u) {
                return;
            }
            zzfjc zzfjcVar = this.r;
            zzfju zzfjuVar = this.q;
            if (zzcuVar == null) {
                zzdoo zzdooVar = this.e;
                if (zzdooVar.zzk() != null) {
                    this.u = true;
                    zzfjuVar.zzc(zzdooVar.zzk().zzf(), zzfjcVar);
                    zzf();
                    return;
                }
            }
            this.u = true;
            zzfjuVar.zzc(zzcuVar.zzf(), zzfjcVar);
            zzf();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzj(View view, View view2, Map map, Map map2, boolean z) {
        Context context = this.a;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbx.zzd(context, map, map2, view2);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbx.zzg(context, view2);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view2);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbx.zze(context, view2);
        String strA = a(view, map);
        d(true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcH)).booleanValue() ? view2 : view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strA, com.google.android.gms.ads.internal.util.zzbx.zzc(strA, context, this.x, this.w), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzk(String str) {
        d(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzl(Bundle bundle) {
        if (bundle == null) {
            zzcgn.zze("Click data is null. No click is reported.");
        } else if (!b("click_reporting")) {
            zzcgn.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            d(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzaw.zzb().zzj(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzn(View view, Map map, Map map2, boolean z) {
        if (!this.v) {
            zzcgn.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
            return;
        }
        if (!this.c.optBoolean("allow_custom_click_gesture", false)) {
            zzcgn.zze("Custom click reporting failed. Ad unit id not in the allow list.");
            return;
        }
        Context context = this.a;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbx.zzd(context, map, map2, view);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbx.zzg(context, view);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbx.zze(context, view);
        String strA = a(null, map);
        d(view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strA, com.google.android.gms.ads.internal.util.zzbx.zzc(strA, context, this.x, this.w), null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzo() {
        oa3.d("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            zzchd.zza(this.d.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzp(View view, Map map, Map map2) {
        String strZzh;
        Context context = this.a;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbx.zzd(context, map, map2, view);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbx.zzg(context, view);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbx.zze(context, view);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcF)).booleanValue()) {
            try {
                strZzh = this.f.zzc().zzh(context, view, null);
            } catch (Exception unused) {
                zzcgn.zzg("Exception getting data.");
                strZzh = null;
            }
        } else {
            strZzh = null;
        }
        c(jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzh, null, com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.j));
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzq() {
        c(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzr(View view, MotionEvent motionEvent, View view2) {
        this.w = com.google.android.gms.ads.internal.util.zzbx.zza(motionEvent, view2);
        long jB = this.o.b();
        this.z = jB;
        if (motionEvent.getAction() == 0) {
            this.y = jB;
            this.x = this.w;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.w;
        motionEventObtain.setLocation(point.x, point.y);
        this.f.zzd(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzs(Bundle bundle) {
        if (bundle == null) {
            zzcgn.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!b("touch_reporting")) {
            zzcgn.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        float f = bundle.getFloat("x");
        float f2 = bundle.getFloat("y");
        this.f.zzc().zzl((int) f, (int) f2, bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzt(View view) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcgn.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            zzdpr zzdprVar = this.n;
            view.setOnClickListener(zzdprVar);
            view.setClickable(true);
            zzdprVar.C = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzu() {
        this.v = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzv(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.A = zzcqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzw(zzbnu zzbnuVar) {
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.n.zzc(zzbnuVar);
        } else {
            zzcgn.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzx(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.w = new Point();
        this.x = new Point();
        if (!this.t) {
            this.p.zza(view);
            this.t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.m.zzi(this);
        boolean zZzi = com.google.android.gms.ads.internal.util.zzbx.zzi(this.k.zzc);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final void zzy(View view, Map map) {
        this.w = new Point();
        this.x = new Point();
        if (view != null) {
            this.p.zzb(view);
        }
        this.t = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final boolean zzz() {
        return this.c.optBoolean("allow_custom_click_gesture", false);
    }
}
