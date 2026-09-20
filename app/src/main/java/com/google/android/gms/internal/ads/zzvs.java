package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzvs {
    public final int[] a;
    public final zzue[] b;
    public final int[] c;
    public final int[][][] d;
    public final zzue e;

    public zzvs(int[] iArr, zzue[] zzueVarArr, int[] iArr2, int[][][] iArr3, zzue zzueVar) {
        this.a = iArr;
        this.b = zzueVarArr;
        this.d = iArr3;
        this.c = iArr2;
        this.e = zzueVar;
    }

    public final int zza(int i, int i2, boolean z) {
        int[][][] iArr;
        zzue[] zzueVarArr = this.b;
        int i3 = zzueVarArr[i].zzb(i2).zzb;
        int[] iArr2 = new int[1];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            iArr = this.d;
            if (i5 > 0) {
                break;
            }
            if ((iArr[i][i2][i5] & 7) == 4) {
                iArr2[i6] = i5;
                i6++;
            }
            i5++;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr2, i6);
        String str = null;
        boolean z2 = false;
        int i7 = 0;
        int iMin = 16;
        while (i4 < iArrCopyOf.length) {
            String str2 = zzueVarArr[i].zzb(i2).zzb(iArrCopyOf[i4]).zzm;
            int i8 = i7 + 1;
            if (i7 != 0) {
                z2 |= !zzel.zzT(str, str2);
            } else {
                str = str2;
            }
            iMin = Math.min(iMin, iArr[i][i2][i4] & 24);
            i4++;
            i7 = i8;
        }
        return z2 ? Math.min(iMin, this.c[i]) : iMin;
    }

    public final int zzb(int i, int i2, int i3) {
        return this.d[i][i2][i3];
    }

    public final int zzc(int i) {
        return this.a[i];
    }

    public final zzue zzd(int i) {
        return this.b[i];
    }

    public final zzue zze() {
        return this.e;
    }
}
