package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcy {
    public static final zzcy zza = new zzcy(zzfuv.zzo());
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcv
    };
    public final zzfuv a;

    public zzcy(List list) {
        this.a = zzfuv.zzm(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzcy.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((zzcy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final zzfuv zza() {
        return this.a;
    }

    public final boolean zzb(int i) {
        int i2 = 0;
        while (true) {
            zzfuv zzfuvVar = this.a;
            if (i2 >= zzfuvVar.size()) {
                return false;
            }
            zzcx zzcxVar = (zzcx) zzfuvVar.get(i2);
            if (zzcxVar.zzc() && zzcxVar.zza() == i) {
                return true;
            }
            i2++;
        }
    }
}
