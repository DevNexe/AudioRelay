package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbk extends zzcbl {
    public final Object a = new Object();
    public final Context b;
    public SharedPreferences c;
    public final zzbtv d;

    public zzcbk(Context context, zzbtv zzbtvVar) {
        this.b = context.getApplicationContext();
        this.d = zzbtvVar;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcgt.zza().zza);
            jSONObject.put("mf", zzbko.zza.zze());
            jSONObject.put("cl", "470884269");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final zzfyx zza() {
        synchronized (this.a) {
            if (this.c == null) {
                this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.zzt.zzB().b() - this.c.getLong("js_last_update", 0L) < ((Long) zzbko.zzb.zze()).longValue()) {
            return zzfyo.zzi(null);
        }
        return zzfyo.zzm(this.d.zzb(zzc(this.b)), new zzfru() { // from class: com.google.android.gms.internal.ads.zzcbj
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                zzcbk zzcbkVar = this.zza;
                zzbiy.zzd(zzcbkVar.b, 1, (JSONObject) obj);
                zzcbkVar.c.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzB().b()).apply();
                return null;
            }
        }, zzcha.zzf);
    }
}
