package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzayp {
    public static final zzayp zza = new zzayp(new zzayo[0]);
    public final zzayo[] a;
    public int b;
    public final int zzb;

    public zzayp(zzayo... zzayoVarArr) {
        this.a = zzayoVarArr;
        this.zzb = zzayoVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzayp.class == obj.getClass()) {
            zzayp zzaypVar = (zzayp) obj;
            if (this.zzb == zzaypVar.zzb && Arrays.equals(this.a, zzaypVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.a);
        this.b = iHashCode;
        return iHashCode;
    }

    public final int zza(zzayo zzayoVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.a[i] == zzayoVar) {
                return i;
            }
        }
        return -1;
    }

    public final zzayo zzb(int i) {
        return this.a[i];
    }
}
