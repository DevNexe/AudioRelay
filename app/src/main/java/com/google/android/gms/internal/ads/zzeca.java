package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeca {
    public final zzcok a;
    public final Context b;
    public final zzcgt c;
    public final zzfdn d;
    public final Executor e;
    public final String f;
    public final zzfjc g;
    public final zzdxj h;

    public zzeca(zzcok zzcokVar, Context context, zzcgt zzcgtVar, zzfdn zzfdnVar, Executor executor, String str, zzfjc zzfjcVar, zzdxj zzdxjVar) {
        this.a = zzcokVar;
        this.b = context;
        this.c = zzcgtVar;
        this.d = zzfdnVar;
        this.e = executor;
        this.f = str;
        this.g = zzfjcVar;
        zzcokVar.zzv();
        this.h = zzdxjVar;
    }

    public final zzfyx a(final String str, final String str2) {
        Context context = this.b;
        zzfir zzfirVarZza = zzfiq.zza(context, 11);
        zzfirVarZza.zzf();
        zzbuf zzbufVarZza = com.google.android.gms.ads.internal.zzt.zzf().zza(context, this.c, this.a.zzy());
        zzbtz zzbtzVar = zzbuc.zza;
        final zzbtv zzbtvVarZza = zzbufVarZza.zza("google.afma.response.normalize", zzbtzVar, zzbtzVar);
        zzfyx zzfyxVarZzi = zzfyo.zzi("");
        zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzebx
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) throws JSONException {
                String str3 = str;
                String str4 = str2;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfyo.zzi(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getMessage())));
                }
            }
        };
        Executor executor = this.e;
        zzfyx zzfyxVarZzn = zzfyo.zzn(zzfyo.zzn(zzfyo.zzn(zzfyxVarZzi, zzfxvVar, executor), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzeby
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzbtvVarZza.zzb((JSONObject) obj);
            }
        }, executor), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzebz
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzfyo.zzi(new zzfde(new zzfdb(this.zza.d), zzfdd.zza(new StringReader(((JSONObject) obj).toString()))));
            }
        }, executor);
        zzfjb.zza(zzfyxVarZzn, this.g, zzfirVarZza);
        return zzfyxVarZzn;
    }

    public final String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzcgn.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    public final zzfyx zza() {
        String strOptString;
        String strSubstring;
        Boolean bool;
        zzfdn zzfdnVar = this.d;
        String strZzb = zzfdnVar.zzd.zzx;
        boolean zIsEmpty = TextUtils.isEmpty(strZzb);
        String strOptString2 = "";
        zzcok zzcokVar = this.a;
        zzdxj zzdxjVar = this.h;
        if (!zIsEmpty) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfX)).booleanValue()) {
                try {
                    strSubstring = new JSONObject(strZzb).optString("request_id", "");
                } catch (JSONException unused) {
                    strSubstring = "";
                }
                zzbiq zzbiqVar = zzbiy.zzgj;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).booleanValue() && strSubstring.isEmpty()) {
                    int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                    strSubstring = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(strSubstring)) {
                    return zzfyo.zzh(new zzeka(15, "Invalid ad string."));
                }
                String strZzb2 = zzcokVar.zzm().zzb(strSubstring, zzdxjVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).booleanValue() && !TextUtils.isEmpty(strZzb2)) {
                    try {
                        bool = new JSONObject(strZzb2).optString("is_gbid").equals("true") ? Boolean.TRUE : Boolean.FALSE;
                    } catch (JSONException unused2) {
                    }
                    if (bool.booleanValue()) {
                        try {
                            int iLastIndexOf2 = strZzb.lastIndexOf("&");
                            String string = null;
                            byte[] bArrDecode = Base64.decode(iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null, 11);
                            byte[] bytes = strSubstring.getBytes("UTF-8");
                            try {
                                string = new JSONObject(strZzb2).getString("arek");
                            } catch (JSONException e) {
                                com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "CryptoUtils.getKeyFromQueryJsonMap");
                            }
                            strZzb = zzfdz.zzb(bArrDecode, bytes, string, zzdxjVar);
                        } catch (UnsupportedEncodingException e2) {
                            com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                            com.google.android.gms.ads.internal.zzt.zzp().zzt(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                        }
                    }
                }
                if (!TextUtils.isEmpty(strZzb2)) {
                    return a(strZzb, b(strZzb2));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzfdnVar.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfV)).booleanValue()) {
                try {
                    strOptString = new JSONObject(zzcVar.zza).optString("request_id", "");
                } catch (JSONException unused3) {
                    strOptString = "";
                }
                try {
                    strOptString2 = new JSONObject(zzcVar.zzb).optString("request_id", "");
                } catch (JSONException unused4) {
                }
                if (TextUtils.isEmpty(strOptString2) || !strOptString.equals(strOptString2)) {
                    zzdxjVar.zza().put("ridmm", "true");
                } else {
                    zzcokVar.zzm().zzf(strOptString);
                    zzdxjVar.zza().put("rid", strOptString);
                }
            }
            return a(zzcVar.zza, b(zzcVar.zzb));
        }
        return zzfyo.zzh(new zzeka(14, "Mismatch request IDs."));
    }
}
