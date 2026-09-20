package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdqh {
    public final zzduw a;
    public final zzdtl b;
    public zzdqc c = null;

    public zzdqh(zzduw zzduwVar, zzdtl zzdtlVar) {
        this.a = zzduwVar;
        this.b = zzdtlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza(final View view, final WindowManager windowManager) {
        zzcmn zzcmnVarZza = this.a.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zzcmnVarZza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zzcmnVarZza.zzaf("/sendMessageToSdk", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdqd
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                this.zza.b.zzg("sendMessageToNativeJs", map);
            }
        });
        zzcmnVarZza.zzaf("/hideValidatorOverlay", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdqe
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                zzdqh zzdqhVar = this.zza;
                WindowManager windowManager2 = windowManager;
                View view3 = view;
                zzcmn zzcmnVar = (zzcmn) obj;
                zzdqhVar.getClass();
                zzcgn.zze("Hide native ad policy validator overlay.");
                zzcmnVar.zzH().setVisibility(8);
                if (zzcmnVar.zzH().getWindowToken() != null) {
                    windowManager2.removeView(zzcmnVar.zzH());
                }
                zzcmnVar.destroy();
                ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
                if (zzdqhVar.c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(zzdqhVar.c);
            }
        });
        zzcmnVarZza.zzaf("/open", new zzbqb(null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzcmnVarZza);
        zzbpq zzbpqVar = new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdqf
            /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.ads.zzdqc] */
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, final Map map) {
                int i;
                final zzdqh zzdqhVar = this.zza;
                final View view3 = view;
                final WindowManager windowManager2 = windowManager;
                final zzcmn zzcmnVar = (zzcmn) obj;
                zzdqhVar.getClass();
                zzcmnVar.zzP().zzz(new zzcny() { // from class: com.google.android.gms.internal.ads.zzdqb
                    @Override // com.google.android.gms.internal.ads.zzcny
                    public final void zza(boolean z) {
                        zzdqh zzdqhVar2 = zzdqhVar;
                        Map map2 = map;
                        zzdqhVar2.getClass();
                        HashMap map3 = new HashMap();
                        map3.put("messageType", "validatorHtmlLoaded");
                        map3.put(FacebookAdapter.KEY_ID, (String) map2.get(FacebookAdapter.KEY_ID));
                        zzdqhVar2.b.zzg("sendMessageToNativeJs", map3);
                    }
                });
                if (map == null) {
                    return;
                }
                Context context = view3.getContext();
                String str = (String) map.get("validator_width");
                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgP)).intValue();
                try {
                    iIntValue = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                }
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                int iZzw = zzcgg.zzw(context, iIntValue);
                String str2 = (String) map.get("validator_height");
                int iIntValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgQ)).intValue();
                try {
                    iIntValue2 = Integer.parseInt(str2);
                } catch (NumberFormatException unused2) {
                }
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                int iZzw2 = zzcgg.zzw(context, iIntValue2);
                int i2 = 0;
                try {
                    i = Integer.parseInt((String) map.get("validator_x"));
                } catch (NumberFormatException unused3) {
                    i = 0;
                }
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                int iZzw3 = zzcgg.zzw(context, i);
                try {
                    i2 = Integer.parseInt((String) map.get("validator_y"));
                } catch (NumberFormatException unused4) {
                }
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                int iZzw4 = zzcgg.zzw(context, i2);
                zzcmnVar.zzai(zzcoc.zzb(iZzw, iZzw2));
                try {
                    zzcmnVar.zzI().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgR)).booleanValue());
                    zzcmnVar.zzI().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgS)).booleanValue());
                } catch (NullPointerException unused5) {
                }
                final WindowManager.LayoutParams layoutParamsZzb = com.google.android.gms.ads.internal.util.zzbx.zzb();
                layoutParamsZzb.x = iZzw3;
                layoutParamsZzb.y = iZzw4;
                windowManager2.updateViewLayout(zzcmnVar.zzH(), layoutParamsZzb);
                final String str3 = (String) map.get(AdUnitActivity.EXTRA_ORIENTATION);
                Rect rect = new Rect();
                if (view3.getGlobalVisibleRect(rect)) {
                    final int i3 = (("1".equals(str3) || "2".equals(str3)) ? rect.bottom : rect.top) - iZzw4;
                    zzdqhVar.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdqc
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            View view4 = view3;
                            zzcmn zzcmnVar2 = zzcmnVar;
                            String str4 = str3;
                            WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                            int i4 = i3;
                            WindowManager windowManager3 = windowManager2;
                            Rect rect2 = new Rect();
                            if (!view4.getGlobalVisibleRect(rect2) || zzcmnVar2.zzH().getWindowToken() == null) {
                                return;
                            }
                            if ("1".equals(str4) || "2".equals(str4)) {
                                layoutParams.y = rect2.bottom - i4;
                            } else {
                                layoutParams.y = rect2.top - i4;
                            }
                            windowManager3.updateViewLayout(zzcmnVar2.zzH(), layoutParams);
                        }
                    };
                    ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
                    if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnScrollChangedListener(zzdqhVar.c);
                    }
                }
                String str4 = (String) map.get("overlay_url");
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                zzcmnVar.loadUrl(str4);
            }
        };
        zzdtl zzdtlVar = this.b;
        zzdtlVar.zzj(weakReference, "/loadNativeAdPolicyViolations", zzbpqVar);
        zzdtlVar.zzj(new WeakReference(zzcmnVarZza), "/showValidatorOverlay", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdqg
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                zzcgn.zze("Show native ad policy validator overlay.");
                ((zzcmn) obj).zzH().setVisibility(0);
            }
        });
        return (View) zzcmnVarZza;
    }
}
