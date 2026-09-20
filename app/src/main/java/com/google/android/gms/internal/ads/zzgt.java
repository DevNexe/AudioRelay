package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgt {
    public final long a;
    public final long b;
    public long c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public float j = 0.97f;
    public float i = 1.03f;
    public float k = 1.0f;
    public long l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long m = -9223372036854775807L;
    public long n = -9223372036854775807L;

    public /* synthetic */ zzgt(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final void a() {
        long j = this.c;
        if (j != -9223372036854775807L) {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.g;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.e == j) {
            return;
        }
        this.e = j;
        this.h = j;
        this.m = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.l = -9223372036854775807L;
    }

    public final float zza(long j, long j2) {
        if (this.c == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.m;
        if (j4 == -9223372036854775807L) {
            this.m = j3;
            this.n = 0L;
        } else {
            long jMax = Math.max(j3, (long) ((j3 * 9.999871E-4f) + (j4 * 0.999f)));
            this.m = jMax;
            this.n = (long) ((Math.abs(j3 - jMax) * 9.999871E-4f) + (this.n * 0.999f));
        }
        if (this.l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.l < 1000) {
            return this.k;
        }
        this.l = SystemClock.elapsedRealtime();
        long jZzr = (this.n * 3) + this.m;
        if (this.h > jZzr) {
            float fZzv = zzel.zzv(1000L);
            long[] jArr = {jZzr, this.e, this.h - (((long) ((this.k - 1.0f) * fZzv)) + ((long) ((this.i - 1.0f) * fZzv)))};
            for (int i = 1; i < 3; i++) {
                long j5 = jArr[i];
                if (j5 > jZzr) {
                    jZzr = j5;
                }
            }
            this.h = jZzr;
        } else {
            jZzr = zzel.zzr(j - ((long) (Math.max(0.0f, this.k - 1.0f) / 1.0E-7f)), this.h, jZzr);
            this.h = jZzr;
            long j6 = this.g;
            if (j6 != -9223372036854775807L && jZzr > j6) {
                this.h = j6;
                jZzr = j6;
            }
        }
        long j7 = j - jZzr;
        if (Math.abs(j7) < this.a) {
            this.k = 1.0f;
            return 1.0f;
        }
        float fZza = zzel.zza((j7 * 1.0E-7f) + 1.0f, this.j, this.i);
        this.k = fZza;
        return fZza;
    }

    public final long zzb() {
        return this.h;
    }

    public final void zzc() {
        long j = this.h;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.b;
        this.h = j2;
        long j3 = this.g;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.h = j3;
        }
        this.l = -9223372036854775807L;
    }

    public final void zzd(zzaw zzawVar) {
        long j = zzawVar.zzc;
        this.c = zzel.zzv(-9223372036854775807L);
        this.f = zzel.zzv(-9223372036854775807L);
        this.g = zzel.zzv(-9223372036854775807L);
        this.j = 0.97f;
        this.i = 1.03f;
        a();
    }

    public final void zze(long j) {
        this.d = j;
        a();
    }
}
