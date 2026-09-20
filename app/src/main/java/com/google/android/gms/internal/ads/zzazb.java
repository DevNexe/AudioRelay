package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazb {
    public int a;
    public final zzayt[] b;

    public zzazb(zzayt[] zzaytVarArr, byte... bArr) {
        this.b = zzaytVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzazb.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((zzazb) obj).b);
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.b) + 527;
        this.a = iHashCode;
        return iHashCode;
    }

    public final zzayt zza(int i) {
        return this.b[i];
    }

    public final zzayt[] zzb() {
        return (zzayt[]) this.b.clone();
    }
}
