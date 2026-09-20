package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzz zzzVar, zzx zzxVar, boolean z) {
        int iZzk;
        if (z) {
            try {
                iZzk = com.google.android.gms.ads.internal.zzt.zzq().zzk(context, intent.getData());
                if (zzzVar != null) {
                    zzzVar.zzg();
                }
            } catch (ActivityNotFoundException e) {
                zzcgn.zzj(e.getMessage());
                iZzk = 6;
            }
            if (zzxVar != null) {
                zzxVar.zzb(iZzk);
            }
            return iZzk == 5;
        }
        try {
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + intent.toURI());
            com.google.android.gms.ads.internal.zzt.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzJ(context, intent);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
            if (zzxVar != null) {
                zzxVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            zzcgn.zzj(e2.getMessage());
            if (zzxVar != null) {
                zzxVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzz zzzVar, zzx zzxVar) {
        int i = 0;
        if (zzcVar == null) {
            zzcgn.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbiy.zzc(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzzVar, zzxVar, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            zzcgn.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(zzcVar.zzc)) {
            intent2.setData(Uri.parse(zzcVar.zzb));
        } else {
            intent2.setDataAndType(Uri.parse(zzcVar.zzb), zzcVar.zzc);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] strArrSplit = zzcVar.zze.split("/", 2);
            if (strArrSplit.length < 2) {
                zzcgn.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str = zzcVar.zzf;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzcgn.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzdD)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zzdC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, intent2);
            }
        }
        return zza(context, intent2, zzzVar, zzxVar, zzcVar.zzj);
    }
}
