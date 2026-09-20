package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgu implements zzjf {
    public final zzwf a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public int g;
    public boolean h;

    public zzgu() {
        zzwf zzwfVar = new zzwf(true, 65536);
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = zzwfVar;
        this.b = zzel.zzv(50000L);
        this.c = zzel.zzv(50000L);
        this.d = zzel.zzv(2500L);
        this.e = zzel.zzv(5000L);
        this.g = 13107200;
        this.f = zzel.zzv(0L);
    }

    public static void a(int i, int i2, String str, String str2) {
        zzdd.zze(i >= i2, str + " cannot be less than " + str2);
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final long zza() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final void zzb() {
        this.g = 13107200;
        this.h = false;
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final void zzc() {
        this.g = 13107200;
        this.h = false;
        this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final void zzd() {
        this.g = 13107200;
        this.h = false;
        this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final void zze(zzjy[] zzjyVarArr, zzue zzueVar, zzvq[] zzvqVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzjyVarArr.length;
            if (i >= 2) {
                int iMax = Math.max(13107200, i2);
                this.g = iMax;
                this.a.zzf(iMax);
                return;
            } else {
                if (zzvqVarArr[i] != null) {
                    i2 += zzjyVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final boolean zzg(long j, long j2, float f) {
        int iZza = this.a.zza();
        int i = this.g;
        long j3 = this.c;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(zzel.zzs(jMin, f), j3);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = iZza < i;
            this.h = z;
            if (!z && j2 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j3 || iZza >= i) {
            this.h = false;
        }
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final boolean zzh(long j, float f, boolean z, long j2) {
        long jZzu = zzel.zzu(j, f);
        long jMin = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jZzu >= jMin || this.a.zza() >= this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzjf
    public final zzwf zzi() {
        return this.a;
    }
}
