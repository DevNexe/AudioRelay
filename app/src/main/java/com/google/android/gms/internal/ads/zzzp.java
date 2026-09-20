package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzp {
    public static zzbq zza(zzzg zzzgVar, boolean z) {
        zzbq zzbqVarZza = new zzzw().zza(zzzgVar, z ? null : zzacz.zza);
        if (zzbqVarZza == null || zzbqVarZza.zza() == 0) {
            return null;
        }
        return zzbqVarZza;
    }

    public static zzzr zzb(zzed zzedVar) {
        zzedVar.zzG(1);
        int iZzm = zzedVar.zzm();
        long jZzc = ((long) zzedVar.zzc()) + ((long) iZzm);
        int i = iZzm / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jZzr = zzedVar.zzr();
            if (jZzr == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jZzr;
            jArrCopyOf2[i2] = zzedVar.zzr();
            zzedVar.zzG(2);
        }
        zzedVar.zzG((int) (jZzc - ((long) zzedVar.zzc())));
        return new zzzr(jArrCopyOf, jArrCopyOf2);
    }
}
