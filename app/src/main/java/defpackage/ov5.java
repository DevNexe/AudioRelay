package defpackage;

import com.google.android.gms.internal.ads.zzafs;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class ov5 {
    public final zzafs a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public ov5(zzafs zzafsVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzdd.zzd(length == length2);
        int length3 = jArr.length;
        zzdd.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzdd.zzd(length4 == length2);
        this.a = zzafsVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int iZzb = zzel.zzb(jArr, j, true, false); iZzb < jArr.length; iZzb++) {
            if ((this.g[iZzb] & 1) != 0) {
                return iZzb;
            }
        }
        return -1;
    }
}
