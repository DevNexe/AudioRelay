package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaut implements zzavc {
    public final long a;
    public final int[] zza;
    public final long[] zzb;
    public final long[] zzc;
    public final long[] zzd;

    public zzaut(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = iArr;
        this.zzb = jArr;
        this.zzc = jArr2;
        this.zzd = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.a = 0L;
        } else {
            int i = length - 1;
            this.a = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavc
    public final long zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzavc
    public final long zzb(long j) {
        return this.zzb[zzban.zzc(this.zzd, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzavc
    public final boolean zzc() {
        return true;
    }
}
