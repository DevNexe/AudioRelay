package com.google.android.gms.internal.ads;

import defpackage.a42;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq {
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzp
    };
    public int a;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;

    public zzq(int i, int i2, int i3, byte[] bArr) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = bArr;
    }

    @Pure
    public static int zza(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzb(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzq.class == obj.getClass()) {
            zzq zzqVar = (zzq) obj;
            if (this.zzb == zzqVar.zzb && this.zzc == zzqVar.zzc && this.zzd == zzqVar.zzd && Arrays.equals(this.zze, zzqVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31);
        this.a = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i = this.zzb;
        int i2 = this.zzc;
        int i3 = this.zzd;
        boolean z = this.zze != null;
        StringBuilder sbA = a42.a("ColorInfo(", i, ", ", i2, ", ");
        sbA.append(i3);
        sbA.append(", ");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }
}
