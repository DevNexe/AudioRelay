package com.google.android.gms.internal.ads;

import defpackage.bl2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcp {
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzco
    };
    public final zzaf[] a;
    public int b;
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;

    public zzcp(String str, zzaf... zzafVarArr) {
        this.zzc = str;
        this.a = zzafVarArr;
        int iZzb = zzbt.zzb(zzafVarArr[0].zzm);
        this.zzd = iZzb == -1 ? zzbt.zzb(zzafVarArr[0].zzl) : iZzb;
        String str2 = zzafVarArr[0].zzd;
        if (str2 != null) {
            str2.equals("und");
        }
        int i = zzafVarArr[0].zzf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcp.class == obj.getClass()) {
            zzcp zzcpVar = (zzcp) obj;
            if (this.zzc.equals(zzcpVar.zzc) && Arrays.equals(this.a, zzcpVar.a)) {
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
        int iHashCode = Arrays.hashCode(this.a) + bl2.a(this.zzc, 527, 31);
        this.b = iHashCode;
        return iHashCode;
    }

    public final int zza(zzaf zzafVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzafVar == this.a[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzaf zzb(int i) {
        return this.a[i];
    }

    public final zzcp zzc(String str) {
        return new zzcp(str, this.a);
    }
}
