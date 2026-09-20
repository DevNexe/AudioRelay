package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import defpackage.a56;
import defpackage.c56;
import defpackage.d56;
import defpackage.sd6;
import defpackage.z46;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpp {
    public static final zzbpq zzd;
    public static final zzbpq zze;
    public static final zzbpq zzh;
    public static final zzbpq zzj;
    public static final zzbpq zzk;
    public static final zzbpq zzp;
    public static final zzbpq zzr;
    public static final zzbpq zzs;
    public static final zzbpq zzt;
    public static final zzbpq zzu;
    public static final zzbpq zzv;
    public static final zzbpq zzw;
    public static final zzbpq zzx;
    public static final zzbpq zzy;
    public static final zzbpq zza = new zzbpq() { // from class: com.google.android.gms.internal.ads.zzbow
        @Override // com.google.android.gms.internal.ads.zzbpq
        public final void zza(Object obj, Map map) {
            zzcno zzcnoVar = (zzcno) obj;
            zzbpq zzbpqVar = zzbpp.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzcgn.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzcnoVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                map2.put(str2, boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((zzbsi) zzcnoVar).zzd("openableURLs", map2);
        }
    };
    public static final zzbpq zzb = new zzbpq() { // from class: com.google.android.gms.internal.ads.zzbox
        @Override // com.google.android.gms.internal.ads.zzbpq
        public final void zza(Object obj, Map map) {
            zzcno zzcnoVar = (zzcno) obj;
            zzbpq zzbpqVar = zzbpp.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgX)).booleanValue()) {
                zzcgn.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                zzcgn.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzcnoVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((zzbsi) zzcnoVar).zzd("openableApp", map2);
        }
    };
    public static final zzbpq zzc = new zzbpq() { // from class: com.google.android.gms.internal.ads.zzbop
        @Override // com.google.android.gms.internal.ads.zzbpq
        public final void zza(Object obj, Map map) {
            Intent uri;
            ResolveInfo resolveInfoResolveActivity;
            zzcno zzcnoVar = (zzcno) obj;
            zzbpq zzbpqVar = zzbpp.zza;
            PackageManager packageManager = zzcnoVar.getContext().getPackageManager();
            try {
                try {
                    JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String strOptString = jSONObject2.optString(FacebookAdapter.KEY_ID);
                            String strOptString2 = jSONObject2.optString("u");
                            String strOptString3 = jSONObject2.optString("i");
                            String strOptString4 = jSONObject2.optString("m");
                            String strOptString5 = jSONObject2.optString("p");
                            String strOptString6 = jSONObject2.optString("c");
                            String strOptString7 = jSONObject2.optString("intent_url");
                            if (TextUtils.isEmpty(strOptString7)) {
                                uri = null;
                            } else {
                                try {
                                    uri = Intent.parseUri(strOptString7, 0);
                                } catch (URISyntaxException e) {
                                    zzcgn.zzh("Error parsing the url: ".concat(String.valueOf(strOptString7)), e);
                                    uri = null;
                                }
                            }
                            if (uri == null) {
                                uri = new Intent();
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    uri.setData(Uri.parse(strOptString2));
                                }
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    uri.setAction(strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    uri.setType(strOptString4);
                                }
                                if (!TextUtils.isEmpty(strOptString5)) {
                                    uri.setPackage(strOptString5);
                                }
                                if (!TextUtils.isEmpty(strOptString6)) {
                                    String[] strArrSplit = strOptString6.split("/", 2);
                                    if (strArrSplit.length == 2) {
                                        uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                    }
                                }
                            }
                            Intent intent = uri;
                            try {
                                resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                            } catch (NullPointerException e2) {
                                com.google.android.gms.ads.internal.zzt.zzp().zzt(e2, intent.toString());
                                resolveInfoResolveActivity = null;
                            }
                            try {
                                jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                            } catch (JSONException e3) {
                                zzcgn.zzh("Error constructing openable urls response.", e3);
                            }
                        } catch (JSONException e4) {
                            zzcgn.zzh("Error parsing the intent data.", e4);
                        }
                    }
                    ((zzbsi) zzcnoVar).zze("openableIntents", jSONObject);
                } catch (JSONException unused) {
                    ((zzbsi) zzcnoVar).zze("openableIntents", new JSONObject());
                }
            } catch (JSONException unused2) {
                ((zzbsi) zzcnoVar).zze("openableIntents", new JSONObject());
            }
        }
    };
    public static final zzbpq zzf = new zzbpq() { // from class: com.google.android.gms.internal.ads.zzbov
        @Override // com.google.android.gms.internal.ads.zzbpq
        public final void zza(Object obj, Map map) {
            zzcno zzcnoVar = (zzcno) obj;
            zzbpq zzbpqVar = zzbpp.zza;
            String str = (String) map.get("u");
            if (str == null) {
                zzcgn.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzby(zzcnoVar.getContext(), ((zzcnw) zzcnoVar).zzp().zza, str).zzb();
            }
        }
    };
    public static final zzbpq zzg = new d56();
    public static final zzbpq zzi = new zzbpq() { // from class: com.google.android.gms.internal.ads.zzbou
        @Override // com.google.android.gms.internal.ads.zzbpq
        public final void zza(Object obj, Map map) {
            zzcnv zzcnvVar = (zzcnv) obj;
            zzbpq zzbpqVar = zzbpp.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i = Integer.parseInt(str);
                int i2 = Integer.parseInt(str2);
                int i3 = Integer.parseInt(str3);
                zzapb zzapbVarZzK = zzcnvVar.zzK();
                if (zzapbVarZzK != null) {
                    zzapbVarZzK.zzc().zzl(i, i2, i3);
                }
            } catch (NumberFormatException unused) {
                zzcgn.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbpq zzl = new zzckn();
    public static final zzbpq zzm = new zzcko();
    public static final zzbpq zzn = new zzboo();
    public static final zzbqe zzo = new zzbqe();
    public static final zzbpq zzq = new z46(5);

    static {
        int i = 3;
        zzd = new z46(i);
        zze = new a56(i);
        int i2 = 2;
        zzh = new c56(i2);
        int i3 = 4;
        zzj = new z46(i3);
        zzk = new a56(i3);
        zzp = new c56(i);
        int i4 = 0;
        zzr = new z46(i4);
        zzs = new a56(i4);
        zzt = new c56(i4);
        int i5 = 1;
        zzu = new z46(i5);
        zzv = new a56(i5);
        zzw = new c56(i5);
        zzx = new z46(i2);
        zzy = new a56(i2);
    }

    public static zzbpq zza(final zzdkl zzdklVar) {
        return new zzbpq() { // from class: com.google.android.gms.internal.ads.zzbot
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                zzcmn zzcmnVar = (zzcmn) obj;
                zzbpp.zzd(map, zzdklVar);
                String str = (String) map.get("u");
                if (str == null) {
                    zzcgn.zzj("URL missing from click GMSG.");
                } else {
                    zzfyo.zzr(zzbpp.zzb(zzcmnVar, str), new sd6(zzcmnVar, 4), zzcha.zza);
                }
            }
        };
    }

    public static zzfyx zzb(zzcmn zzcmnVar, String str) {
        Uri uriZza = Uri.parse(str);
        try {
            zzapb zzapbVarZzK = zzcmnVar.zzK();
            if (zzapbVarZzK != null && zzapbVarZzK.zzf(uriZza)) {
                uriZza = zzapbVarZzK.zza(uriZza, zzcmnVar.getContext(), zzcmnVar.zzH(), zzcmnVar.zzk());
            }
        } catch (zzapc unused) {
            zzcgn.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String strZzb = zzceu.zzb(uriZza, zzcmnVar.getContext());
        long jLongValue = ((Long) zzbkn.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 222508000) {
            return zzfyo.zzi(strZzb);
        }
        zzfyf zzfyfVarZzv = zzfyf.zzv(zzcmnVar.zzT());
        zzboq zzboqVar = new zzfru() { // from class: com.google.android.gms.internal.ads.zzboq
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbpq zzbpqVar = zzbpp.zza;
                if (!((Boolean) zzbkn.zzk.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        zzfyy zzfyyVar = zzcha.zzf;
        return zzfyo.zzf(zzfyo.zzm(zzfyo.zzf(zzfyfVarZzv, Throwable.class, zzboqVar, zzfyyVar), new zzfru() { // from class: com.google.android.gms.internal.ads.zzbor
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String strReplace = strZzb;
                String str4 = (String) obj;
                zzbpq zzbpqVar = zzbpp.zza;
                if (str4 != null) {
                    if (((Boolean) zzbkn.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (host.endsWith(strArr[i])) {
                                str2 = (String) zzbkn.zza.zze();
                                str3 = (String) zzbkn.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) zzbkn.zza.zze();
                        str3 = (String) zzbkn.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzfyyVar), Throwable.class, new zzfru() { // from class: com.google.android.gms.internal.ads.zzbos
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                String str2 = strZzb;
                Throwable th = (Throwable) obj;
                zzbpq zzbpqVar = zzbpp.zza;
                if (((Boolean) zzbkn.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, zzfyyVar);
    }

    public static void zzd(Map map, zzdkl zzdklVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzip)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdklVar != null) {
            zzdklVar.zzq();
        }
    }
}
