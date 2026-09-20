package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzciv {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final long zzp;
    public final long zzq;

    public zzciv(String str) {
        JSONObject jSONObject;
        String string;
        long jLongValue;
        long jLongValue2;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        this.zza = a(jSONObject, "aggressive_media_codec_release", zzbiy.zzG);
        this.zzb = b(jSONObject, "byte_buffer_precache_limit", zzbiy.zzj);
        this.zzc = b(jSONObject, "exo_cache_buffer_size", zzbiy.zzu);
        this.zzd = b(jSONObject, "exo_connect_timeout_millis", zzbiy.zzf);
        zzbiq zzbiqVar = zzbiy.zze;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
                string = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar);
            }
        } else {
            string = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar);
        }
        this.zze = string;
        this.zzf = b(jSONObject, "exo_read_timeout_millis", zzbiy.zzg);
        this.zzg = b(jSONObject, "load_check_interval_bytes", zzbiy.zzh);
        this.zzh = b(jSONObject, "player_precache_limit", zzbiy.zzi);
        this.zzi = b(jSONObject, "socket_receive_buffer_size", zzbiy.zzk);
        this.zzj = a(jSONObject, "use_cache_data_source", zzbiy.zzdq);
        this.zzk = b(jSONObject, "min_retry_count", zzbiy.zzl);
        this.zzl = a(jSONObject, "treat_load_exception_as_non_fatal", zzbiy.zzo);
        this.zzm = a(jSONObject, "using_official_simple_exo_player", zzbiy.zzbC);
        this.zzn = a(jSONObject, "enable_multiple_video_playback", zzbiy.zzbD);
        this.zzo = a(jSONObject, "use_range_http_data_source", zzbiy.zzbF);
        zzbiq zzbiqVar2 = zzbiy.zzbG;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar2)).longValue();
            }
        } else {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar2)).longValue();
        }
        this.zzp = jLongValue;
        zzbiq zzbiqVar3 = zzbiy.zzbH;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
                jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar3)).longValue();
            }
        } else {
            jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar3)).longValue();
        }
        this.zzq = jLongValue2;
    }

    public static final boolean a(JSONObject jSONObject, String str, zzbiq zzbiqVar) {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).booleanValue();
        if (jSONObject == null) {
            return zBooleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return zBooleanValue;
        }
    }

    public static final int b(JSONObject jSONObject, String str, zzbiq zzbiqVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).intValue();
    }
}
