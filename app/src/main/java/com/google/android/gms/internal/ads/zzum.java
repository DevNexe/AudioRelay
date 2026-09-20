package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class zzum implements zzvq {
    public final zzcp a;
    public final int b;
    public final int[] c;
    public final zzaf[] d;
    public int e;

    public zzum(zzcp zzcpVar, int[] iArr, int i) {
        int length = iArr.length;
        zzdd.zzf(length > 0);
        zzcpVar.getClass();
        this.a = zzcpVar;
        this.b = length;
        this.d = new zzaf[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = zzcpVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.d, new Comparator() { // from class: com.google.android.gms.internal.ads.zzul
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzaf) obj2).zzi - ((zzaf) obj).zzi;
            }
        });
        this.c = new int[this.b];
        for (int i3 = 0; i3 < this.b; i3++) {
            this.c[i3] = zzcpVar.zza(this.d[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzum zzumVar = (zzum) obj;
            if (this.a == zzumVar.a && Arrays.equals(this.c, zzumVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final int zza(int i) {
        return this.c[0];
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final int zzc() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzaf zzd(int i) {
        return this.d[i];
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final zzcp zze() {
        return this.a;
    }
}
