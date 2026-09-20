package com.google.android.gms.internal.ads;

import defpackage.qa0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzy {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i2;
        this.zzb = zzzz.a[3 - i3];
        int i6 = zzzz.b[i5];
        this.zzd = i6;
        if (i2 == 2) {
            i6 /= 2;
            this.zzd = i6;
        } else if (i2 == 0) {
            i6 /= 4;
            this.zzd = i6;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.zzg = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? zzzz.c[i4 - 1] : zzzz.d[i4 - 1];
            this.zzf = i9;
            this.zzc = (((i9 * 12) / i6) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? zzzz.e[i4 - 1] : zzzz.f[i4 - 1];
                this.zzf = i10;
                this.zzc = qa0.a(i10, 144, i6, i7);
            } else {
                int i11 = zzzz.g[i4 - 1];
                this.zzf = i11;
                this.zzc = qa0.a(i3 == 1 ? 72 : 144, i11, i6, i7);
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
