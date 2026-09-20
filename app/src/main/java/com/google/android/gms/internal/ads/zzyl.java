package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyl implements zzaai {
    public final zzyo a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public zzyl(zzyo zzyoVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = zzyoVar;
        this.b = j;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.b;
    }

    public final long zzf(long j) {
        return this.a.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        zzaaj zzaajVar = new zzaaj(j, zzyn.a(this.a.zza(j), 0L, this.c, this.d, this.e, this.f));
        return new zzaag(zzaajVar, zzaajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return true;
    }
}
