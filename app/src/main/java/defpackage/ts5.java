package defpackage;

import com.google.android.gms.internal.ads.zzyo;
import com.google.android.gms.internal.ads.zzyr;
import com.google.android.gms.internal.ads.zzzs;

/* JADX INFO: loaded from: classes3.dex */
public final class ts5 extends zzyr {
    public ts5(final zzzs zzzsVar, int i, long j, long j2) {
        long j3;
        long j4;
        zzyo zzyoVar = new zzyo() { // from class: com.google.android.gms.internal.ads.zzabg
            @Override // com.google.android.gms.internal.ads.zzyo
            public final long zza(long j5) {
                return zzzsVar.zzb(j5);
            }
        };
        ss5 ss5Var = new ss5(zzzsVar, i);
        long jZza = zzzsVar.zza();
        long j5 = zzzsVar.zzj;
        int i2 = zzzsVar.zzd;
        if (i2 > 0) {
            j3 = (((long) i2) + ((long) zzzsVar.zzc)) / 2;
            j4 = 1;
        } else {
            int i3 = zzzsVar.zza;
            j3 = ((((i3 != zzzsVar.zzb || i3 <= 0) ? 4096L : i3) * ((long) zzzsVar.zzg)) * ((long) zzzsVar.zzh)) / 8;
            j4 = 64;
        }
        super(zzyoVar, ss5Var, jZza, j5, j, j2, j3 + j4, Math.max(6, zzzsVar.zzc));
    }
}
