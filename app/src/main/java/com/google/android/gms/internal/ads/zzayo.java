package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzayo {
    public final zzass[] a;
    public int b;
    public final int zza = 1;

    public zzayo(zzass... zzassVarArr) {
        this.a = zzassVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzayo.class == obj.getClass() && Arrays.equals(this.a, ((zzayo) obj).a);
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.a) + 527;
        this.b = iHashCode;
        return iHashCode;
    }

    public final int zza(zzass zzassVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzassVar == this.a[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzass zzb(int i) {
        return this.a[i];
    }
}
