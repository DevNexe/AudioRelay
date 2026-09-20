package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzfiq {
    public static zzfir zza(Context context, int i) {
        boolean zBooleanValue;
        if (zzfje.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbkh.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbkh.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbkh.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbkh.zze.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfit(context, i);
            }
        }
        return new zzfjn();
    }

    public static zzfir zzb(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfir zzfirVarZza = zza(context, i);
        if (!(zzfirVarZza instanceof zzfit)) {
            return zzfirVarZza;
        }
        zzfirVarZza.zzf();
        zzfirVarZza.zzk(i2);
        if (zzfjb.zze(zzlVar.zzp)) {
            zzfirVarZza.zzd(zzlVar.zzp);
        }
        return zzfirVarZza;
    }
}
