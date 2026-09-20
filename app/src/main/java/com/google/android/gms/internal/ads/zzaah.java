package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzaah implements zzaai {
    public final long a;
    public final zzaag b;

    public zzaah(long j, long j2) {
        this.a = j;
        zzaaj zzaajVar = j2 == 0 ? zzaaj.zza : new zzaaj(0L, j2);
        this.b = new zzaag(zzaajVar, zzaajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return false;
    }
}
