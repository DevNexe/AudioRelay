package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzyu implements zzaai {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;

    public zzyu(long j, long j2, int i, int i2, boolean z) {
        long jMax;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            jMax = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
        this.f = jMax;
    }

    public final long zza(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        long j2 = this.b;
        long j3 = this.d;
        if (j3 == -1) {
            zzaaj zzaajVar = new zzaaj(0L, j2);
            return new zzaag(zzaajVar, zzaajVar);
        }
        int i = this.c;
        long j4 = i;
        long jMin = (((((long) this.e) * j) / 8000000) / j4) * j4;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j4);
        }
        long jMax = j2 + Math.max(jMin, 0L);
        long jZza = zza(jMax);
        zzaaj zzaajVar2 = new zzaaj(jZza, jMax);
        if (j3 != -1 && jZza < j) {
            long j5 = jMax + ((long) i);
            if (j5 < this.a) {
                return new zzaag(zzaajVar2, new zzaaj(zza(j5), j5));
            }
        }
        return new zzaag(zzaajVar2, zzaajVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return this.d != -1;
    }
}
