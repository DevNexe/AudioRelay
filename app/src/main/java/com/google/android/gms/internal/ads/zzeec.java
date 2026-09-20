package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeec implements zzfgs {
    public static final Pattern d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public final String a;
    public final zzfir b;
    public final zzfjc c;

    public zzeec(String str, zzfjc zzfjcVar, zzfir zzfirVar) {
        this.a = str;
        this.c = zzfjcVar;
        this.b = zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgs
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws zzeas {
        String strConcat;
        zzeeb zzeebVar = (zzeeb) obj;
        int iOptInt = zzeebVar.a.optInt("http_timeout_millis", 60000);
        zzcbd zzcbdVar = zzeebVar.b;
        int iZza = zzcbdVar.zza();
        zzfir zzfirVar = this.b;
        zzfjc zzfjcVar = this.c;
        String strJoin = "";
        if (iZza != -2) {
            zzfirVar.zze(false);
            zzfjcVar.zza(zzfirVar);
            if (zzcbdVar.zza() != 1) {
                throw new zzeas(1);
            }
            if (zzcbdVar.zzf() != null) {
                strJoin = TextUtils.join(", ", zzcbdVar.zzf());
                zzcgn.zzg(strJoin);
            }
            throw new zzeas(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
        }
        HashMap map = new HashMap();
        if (zzcbdVar.zzh()) {
            String str = this.a;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaI)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = d.matcher(str);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str);
                }
            }
        }
        if (zzcbdVar.zzi()) {
            JSONObject jSONObjectOptJSONObject = zzeebVar.a.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        if (zzcbdVar != null && !TextUtils.isEmpty(zzcbdVar.zzd())) {
            strJoin = zzcbdVar.zzd();
        }
        zzfirVar.zze(true);
        zzfjcVar.zza(zzfirVar);
        return new zzedx(zzcbdVar.zze(), iOptInt, map, strJoin.getBytes(zzfrs.zzc), "");
    }
}
