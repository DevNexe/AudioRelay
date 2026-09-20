package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzx implements zzaai {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public zzzx(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdd.zzd(length == length2);
        boolean z = length2 > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.c = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        if (!this.d) {
            zzaaj zzaajVar = zzaaj.zza;
            return new zzaag(zzaajVar, zzaajVar);
        }
        long[] jArr = this.b;
        int iZzd = zzel.zzd(jArr, j, true, true);
        long j2 = jArr[iZzd];
        long[] jArr2 = this.a;
        zzaaj zzaajVar2 = new zzaaj(j2, jArr2[iZzd]);
        if (zzaajVar2.zzb == j || iZzd == jArr.length - 1) {
            return new zzaag(zzaajVar2, zzaajVar2);
        }
        int i = iZzd + 1;
        return new zzaag(zzaajVar2, new zzaaj(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return this.d;
    }
}
