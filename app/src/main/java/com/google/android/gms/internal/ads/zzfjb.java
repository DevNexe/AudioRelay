package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import defpackage.dl6;
import defpackage.pd6;
import defpackage.ss3;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjb {
    public static void a(zzfyx zzfyxVar, zzfjc zzfjcVar, zzfir zzfirVar, boolean z) {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            zzfyo.zzr(zzfyf.zzv(zzfyxVar), new dl6(zzfjcVar, zzfirVar, z), zzcha.zzf);
        }
    }

    public static void zza(zzfyx zzfyxVar, zzfjc zzfjcVar, zzfir zzfirVar) {
        a(zzfyxVar, zzfjcVar, zzfirVar, false);
    }

    public static void zzb(zzfyx zzfyxVar, zzfjc zzfjcVar, zzfir zzfirVar) {
        a(zzfyxVar, zzfjcVar, zzfirVar, true);
    }

    public static void zzc(zzfyx zzfyxVar, zzfjc zzfjcVar, zzfir zzfirVar) {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            zzfyo.zzr(zzfyf.zzv(zzfyxVar), new ss3(14, zzfjcVar, zzfirVar), zzcha.zzf);
        }
    }

    public static void zzd(zzfyx zzfyxVar, zzfir zzfirVar) {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            zzfyo.zzr(zzfyf.zzv(zzfyxVar), new pd6(zzfirVar, 13), zzcha.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhv), str);
    }

    public static int zzf(zzfdn zzfdnVar) {
        int iZzd = zzf.zzd(zzfdnVar) - 1;
        return (iZzd == 0 || iZzd == 1) ? 7 : 23;
    }
}
