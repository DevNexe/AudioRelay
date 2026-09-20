package com.google.android.gms.internal.ads;

import defpackage.b70;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd {
    public final zzc[] a;
    public static final zzd zza = new zzd(new zzc[0]);
    public static final zzc b = new zzc(0).zzb(0);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zza
    };
    public final long zzd = 0;
    public final int zzc = 0;

    public zzd(zzc[] zzcVarArr) {
        this.a = zzcVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzd.class == obj.getClass()) {
            zzd zzdVar = (zzd) obj;
            if (zzel.zzT(null, null) && Arrays.equals(this.a, zzdVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return b70.a("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public final zzc zza(int i) {
        return i < 0 ? b : this.a[i];
    }
}
