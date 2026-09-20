package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.od6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfaj {
    public static zzfah a(Context context, zzfeu zzfeuVar, zzffm zzffmVar) {
        zzcfq zzcfqVarZzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfr)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh() : com.google.android.gms.ads.internal.zzt.zzp().zzh().zzi();
        boolean z = false;
        if (zzcfqVarZzh != null && zzcfqVarZzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfH)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfq)).booleanValue() || z) {
                zzffl zzfflVarZza = zzffmVar.zza(zzffc.AppOpen, context, zzfeuVar, new od6(new zzezi(), 5));
                zzezx zzezxVar = new zzezx(new zzezw());
                zzfey zzfeyVar = zzfflVarZza.zza;
                zzfyy zzfyyVar = zzcha.zza;
                return new zzezn(zzezxVar, new zzezt(zzfeyVar, zzfyyVar), zzfflVarZza.zzb, zzfflVarZza.zza.zza().zzf, zzfyyVar);
            }
        }
        return new zzezw();
    }
}
