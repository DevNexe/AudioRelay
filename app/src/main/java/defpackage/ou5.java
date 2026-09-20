package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzaag;
import com.google.android.gms.internal.ads.zzaaj;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class ou5 implements pu5 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public ou5(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? zzel.zzv(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long[] jArr, long[] jArr2, long j) {
        int iZzd = zzel.zzd(jArr, j, true, true);
        long j2 = jArr[iZzd];
        long j3 = jArr2[iZzd];
        int i = iZzd + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.pu5
    public final long zzb() {
        return -1L;
    }

    @Override // defpackage.pu5
    public final long zzc(long j) {
        return zzel.zzv(((Long) a(this.a, this.b, j).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        Pair pairA = a(this.b, this.a, zzel.zzz(zzel.zzr(j, 0L, this.c)));
        long jLongValue = ((Long) pairA.first).longValue();
        zzaaj zzaajVar = new zzaaj(zzel.zzv(jLongValue), ((Long) pairA.second).longValue());
        return new zzaag(zzaajVar, zzaajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return true;
    }
}
