package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyp {
    public static final zzyp zza = new zzyp(-3, -9223372036854775807L, -1);
    public final int a;
    public final long b;
    public final long c;

    public zzyp(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public static zzyp zzd(long j, long j2) {
        return new zzyp(-1, j, j2);
    }

    public static zzyp zze(long j) {
        return new zzyp(0, -9223372036854775807L, j);
    }

    public static zzyp zzf(long j, long j2) {
        return new zzyp(-2, j, j2);
    }
}
