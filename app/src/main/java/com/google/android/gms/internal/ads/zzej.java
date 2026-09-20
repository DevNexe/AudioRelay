package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzej {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public zzej(long j) {
        zzf(0L);
    }

    public final synchronized long zza(long j) {
        if (this.b == -9223372036854775807L) {
            long jLongValue = this.a;
            if (jLongValue == 9223372036854775806L) {
                Long l = (Long) this.d.get();
                l.getClass();
                jLongValue = l.longValue();
            }
            this.b = jLongValue - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public final synchronized long zzb(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = (((-1) + j4) * 8589934592L) + j;
            long j6 = (j4 * 8589934592L) + j;
            j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
        }
        return zza((j * 1000000) / 90000);
    }

    public final synchronized long zzc() {
        long j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long zzd() {
        long j;
        j = this.c;
        return j != -9223372036854775807L ? j + this.b : zzc();
    }

    public final synchronized long zze() {
        return this.b;
    }

    public final synchronized void zzf(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }
}
