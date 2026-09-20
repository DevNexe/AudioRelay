package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbuf;
import com.google.android.gms.internal.ads.zzcfq;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfxv;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import com.google.android.gms.internal.ads.zzfyy;
import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.so5;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zze {
    public Context a;
    public long b = 0;

    public final void a(Context context, zzcgt zzcgtVar, boolean z, zzcfq zzcfqVar, String str, String str2, Runnable runnable, final zzfje zzfjeVar) {
        PackageInfo packageInfoB;
        if (zzt.zzB().c() - this.b < 5000) {
            zzcgn.zzj("Not retrying to fetch app settings");
            return;
        }
        this.b = zzt.zzB().c();
        if (zzcfqVar != null) {
            if (zzt.zzB().b() - zzcfqVar.zza() <= ((Long) zzay.zzc().zzb(zzbiy.zzdf)).longValue() && zzcfqVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzcgn.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzcgn.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.a = applicationContext;
        final zzfir zzfirVarZza = zzfiq.zza(context, 4);
        zzfirVarZza.zzf();
        zzbuf zzbufVarZza = zzt.zzf().zza(this.a, zzcgtVar, zzfjeVar);
        zzbtz zzbtzVar = zzbuc.zza;
        zzbtv zzbtvVarZza = zzbufVarZza.zza("google.afma.config.fetchAppSettings", zzbtzVar, zzbtzVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            jSONObject.put("experiment_ids", TextUtils.join(",", zzbiy.zza()));
            try {
                ApplicationInfo applicationInfo = this.a.getApplicationInfo();
                if (applicationInfo != null && (packageInfoB = so5.a(context).b(0, applicationInfo.packageName)) != null) {
                    jSONObject.put(MediationMetaData.KEY_VERSION, packageInfoB.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            zzfyx zzfyxVarZzb = zzbtvVarZza.zzb(jSONObject);
            zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) throws JSONException {
                    zzfje zzfjeVar2 = zzfjeVar;
                    zzfir zzfirVar = zzfirVarZza;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        zzt.zzp().zzh().zzu(jSONObject2.getString("appSettingsJson"));
                    }
                    zzfirVar.zze(zOptBoolean);
                    zzfjeVar2.zzb(zzfirVar.zzj());
                    return zzfyo.zzi(null);
                }
            };
            zzfyy zzfyyVar = zzcha.zzf;
            zzfyx zzfyxVarZzn = zzfyo.zzn(zzfyxVarZzb, zzfxvVar, zzfyyVar);
            if (runnable != null) {
                zzfyxVarZzb.zzc(runnable, zzfyyVar);
            }
            zzchd.zza(zzfyxVarZzn, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            zzcgn.zzh("Error requesting application settings", e);
            zzfirVarZza.zze(false);
            zzfjeVar.zzb(zzfirVarZza.zzj());
        }
    }

    public final void zza(Context context, zzcgt zzcgtVar, String str, Runnable runnable, zzfje zzfjeVar) {
        a(context, zzcgtVar, true, null, str, null, runnable, zzfjeVar);
    }

    public final void zzc(Context context, zzcgt zzcgtVar, String str, zzcfq zzcfqVar, zzfje zzfjeVar) {
        a(context, zzcgtVar, false, zzcfqVar, zzcfqVar != null ? zzcfqVar.zzb() : null, str, null, zzfjeVar);
    }
}
