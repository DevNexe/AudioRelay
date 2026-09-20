package com.google.android.gms.internal.ads;

import defpackage.i5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyt implements zzaai {
    public final long a;
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;

    public zzyt(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.a = 0L;
        } else {
            int i = length - 1;
            this.a = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        int i = this.zza;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(this.zzc);
        String string3 = Arrays.toString(this.zze);
        String string4 = Arrays.toString(this.zzd);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        return i5.b(sb, string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        int iZzd = zzel.zzd(this.zze, j, true, true);
        zzaaj zzaajVar = new zzaaj(this.zze[iZzd], this.zzc[iZzd]);
        if (zzaajVar.zzb >= j || iZzd == this.zza - 1) {
            return new zzaag(zzaajVar, zzaajVar);
        }
        int i = iZzd + 1;
        return new zzaag(zzaajVar, new zzaaj(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return true;
    }
}
