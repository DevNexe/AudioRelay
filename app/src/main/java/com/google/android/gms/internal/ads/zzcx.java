package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcx {
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcw
    };
    public final zzcp a;
    public final int[] b;
    public final boolean[] c;
    public final int zzb;

    public zzcx(zzcp zzcpVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzcpVar.zzb;
        this.zzb = 1;
        this.a = zzcpVar;
        this.b = (int[]) iArr.clone();
        this.c = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcx.class == obj.getClass()) {
            zzcx zzcxVar = (zzcx) obj;
            if (this.a.equals(zzcxVar.a) && Arrays.equals(this.b, zzcxVar.b) && Arrays.equals(this.c, zzcxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 961)) * 31);
    }

    public final int zza() {
        return this.a.zzd;
    }

    public final zzaf zzb(int i) {
        return this.a.zzb(i);
    }

    public final boolean zzc() {
        for (boolean z : this.c) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.c[i];
    }
}
