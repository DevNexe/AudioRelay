package com.google.android.gms.internal.ads;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakx {
    public static long zza(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzakm.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzakm.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzajj zzb(zzajw zzajwVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzajwVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long jZza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            j4 = jCurrentTimeMillis + (j * 1000);
            if (z) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (jZza <= 0 || jZza2 < jZza) {
                j4 = 0;
            } else {
                j4 = jCurrentTimeMillis + (jZza2 - jZza);
                j3 = j4;
            }
        }
        zzajj zzajjVar = new zzajj();
        zzajjVar.zza = zzajwVar.zzb;
        zzajjVar.zzb = str5;
        zzajjVar.zzf = j4;
        zzajjVar.zze = j3;
        zzajjVar.zzc = jZza;
        zzajjVar.zzd = jZza3;
        zzajjVar.zzg = map;
        zzajjVar.zzh = zzajwVar.zzd;
        return zzajjVar;
    }
}
