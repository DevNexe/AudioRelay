package defpackage;

import com.google.android.gms.internal.ads.zzaag;
import com.google.android.gms.internal.ads.zzaaj;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class ru5 implements pu5 {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public ru5(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.pu5
    public final long zzb() {
        return this.e;
    }

    @Override // defpackage.pu5
    public final long zzc(long j) {
        long j2 = j - this.a;
        if (!zzh() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) zzdd.zzb(this.f);
        double d = (j2 * 256.0d) / this.d;
        int iZzd = zzel.zzd(jArr, (long) d, true, true);
        long j3 = this.c;
        long j4 = (((long) iZzd) * j3) / 100;
        long j5 = jArr[iZzd];
        int i = iZzd + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iZzd == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        double d;
        boolean zZzh = zzh();
        int i = this.b;
        long j2 = this.a;
        if (!zZzh) {
            zzaaj zzaajVar = new zzaaj(0L, j2 + ((long) i));
            return new zzaag(zzaajVar, zzaajVar);
        }
        long jZzr = zzel.zzr(j, 0L, this.c);
        double d2 = (jZzr * 100.0d) / this.c;
        double d3 = 0.0d;
        if (d2 <= 0.0d) {
            d = 256.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
            d3 = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = (long[]) zzdd.zzb(this.f);
            double d4 = jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - ((double) i2))) + d4;
            d = 256.0d;
        }
        double d5 = d3 / d;
        long j3 = this.d;
        zzaaj zzaajVar2 = new zzaaj(jZzr, j2 + zzel.zzr(Math.round(d5 * j3), i, j3 - 1));
        return new zzaag(zzaajVar2, zzaajVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return this.f != null;
    }
}
