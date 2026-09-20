package com.google.android.gms.internal.ads;

import defpackage.o26;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class zzayt {
    public final zzayo a;
    public final int[] b;
    public final zzass[] c;
    public int d;

    public zzayt(zzayo zzayoVar, int... iArr) {
        zzayoVar.getClass();
        this.a = zzayoVar;
        this.c = new zzass[1];
        int i = 0;
        for (int i2 = 0; i2 <= 0; i2++) {
            this.c[i2] = zzayoVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.c, new o26(i));
        this.b = new int[1];
        while (i <= 0) {
            this.b[i] = zzayoVar.zza(this.c[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzayt zzaytVar = (zzayt) obj;
            if (this.a == zzaytVar.a && Arrays.equals(this.b, zzaytVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.b) + (System.identityHashCode(this.a) * 31);
        this.d = iHashCode;
        return iHashCode;
    }

    public final int zza(int i) {
        return this.b[0];
    }

    public final int zzb() {
        int length = this.b.length;
        return 1;
    }

    public final zzass zzc(int i) {
        return this.c[i];
    }

    public final zzayo zzd() {
        return this.a;
    }
}
