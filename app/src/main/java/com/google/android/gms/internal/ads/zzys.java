package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class zzys {
    public static void zza(long j, zzed zzedVar, zzaam[] zzaamVarArr) {
        int i;
        int iZze;
        int iZzk;
        while (true) {
            if (zzedVar.zza() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (zzedVar.zza() == 0) {
                    i = -1;
                    break;
                }
                int iZzk2 = zzedVar.zzk();
                i2 += iZzk2;
                if (iZzk2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (zzedVar.zza() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iZzk = zzedVar.zzk();
                    i3 += iZzk;
                }
            } while (iZzk == 255);
            int iZzc = zzedVar.zzc() + i3;
            if (i3 == -1 || i3 > zzedVar.zza()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzc = zzedVar.zzd();
            } else if (i == 4 && i3 >= 8) {
                int iZzk3 = zzedVar.zzk();
                int iZzo = zzedVar.zzo();
                if (iZzo == 49) {
                    iZze = zzedVar.zze();
                    iZzo = 49;
                } else {
                    iZze = 0;
                }
                int iZzk4 = zzedVar.zzk();
                if (iZzo == 47) {
                    zzedVar.zzG(1);
                    iZzo = 47;
                }
                boolean z = iZzk3 == 181 && (iZzo == 49 || iZzo == 47) && iZzk4 == 3;
                if (iZzo == 49) {
                    z &= iZze == 1195456820;
                }
                if (z) {
                    zzb(j, zzedVar, zzaamVarArr);
                }
            }
            zzedVar.zzF(iZzc);
        }
    }

    public static void zzb(long j, zzed zzedVar, zzaam[] zzaamVarArr) {
        int iZzk = zzedVar.zzk();
        if ((iZzk & 64) != 0) {
            zzedVar.zzG(1);
            int i = (iZzk & 31) * 3;
            int iZzc = zzedVar.zzc();
            for (zzaam zzaamVar : zzaamVarArr) {
                zzedVar.zzF(iZzc);
                zzaamVar.zzq(zzedVar, i);
                if (j != -9223372036854775807L) {
                    zzaamVar.zzs(j, 1, i, 0, null);
                }
            }
        }
    }
}
