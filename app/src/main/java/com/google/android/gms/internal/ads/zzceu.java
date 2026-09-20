package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zzceu {
    public static Uri a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String b(Context context, String str) {
        String strZze = com.google.android.gms.ads.internal.zzt.zzo().zze(context);
        String strZzc = com.google.android.gms.ads.internal.zzt.zzo().zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZze)) {
            str = a(str, "gmp_app_id", strZze).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzc)) ? str : a(str, "fbs_aiid", strZzc).toString();
    }

    public static String zzb(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzt.zzo().zzu(context)) {
            return uri.toString();
        }
        String strZza = com.google.android.gms.ads.internal.zzt.zzo().zza(context);
        if (strZza == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzac);
        String string = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzab)).booleanValue() && string.contains(str)) {
            com.google.android.gms.ads.internal.zzt.zzo().zzm(context, strZza);
            return b(context, string).replace(str, strZza);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        String string2 = a(b(context, string), "fbs_aeid", strZza).toString();
        com.google.android.gms.ads.internal.zzt.zzo().zzm(context, strZza);
        return string2;
    }

    public static String zzc(String str, Context context, boolean z) {
        String strZza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaj)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzt.zzo().zzu(context) || TextUtils.isEmpty(str) || (strZza = com.google.android.gms.ads.internal.zzt.zzo().zza(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzac);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzab)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzq().zzg(str)) {
                com.google.android.gms.ads.internal.zzt.zzo().zzm(context, strZza);
                return b(context, str).replace(str2, strZza);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzq().zzh(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzt.zzo().zzn(context, strZza);
            return b(context, str).replace(str2, strZza);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzq().zzg(str)) {
            com.google.android.gms.ads.internal.zzt.zzo().zzm(context, strZza);
            return a(b(context, str), "fbs_aeid", strZza).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzq().zzh(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzn(context, strZza);
        return a(b(context, str), "fbs_aeid", strZza).toString();
    }
}
