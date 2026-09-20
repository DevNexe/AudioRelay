package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzb
    };
    public final long zzb;
    public final int zzc;
    public final Uri[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;

    public zzc(long j) {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzc.class == obj.getClass()) {
            zzc zzcVar = (zzc) obj;
            if (this.zzc == zzcVar.zzc && Arrays.equals(this.zzd, zzcVar.zzd) && Arrays.equals(this.zze, zzcVar.zze) && Arrays.equals(this.zzf, zzcVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzf) + ((Arrays.hashCode(this.zze) + (((this.zzc * 961) + Arrays.hashCode(this.zzd)) * 31)) * 31)) * 961;
    }

    public final int zza(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final zzc zzb(int i) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new zzc(0, iArrCopyOf, (Uri[]) Arrays.copyOf(this.zzd, 0), jArrCopyOf);
    }

    public zzc(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
        zzdd.zzd(iArr.length == uriArr.length);
        this.zzb = 0L;
        this.zzc = i;
        this.zze = iArr;
        this.zzd = uriArr;
        this.zzf = jArr;
        this.zzg = 0L;
        this.zzh = false;
    }
}
