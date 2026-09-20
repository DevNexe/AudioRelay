package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbd {
    public static final zzbd zza;
    public static final zzn zzb;
    public final Uri zzc = null;
    public final String zzd = null;

    static {
        new zzbc();
        zza = new zzbd();
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbb
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbd)) {
            return false;
        }
        Uri uri = ((zzbd) obj).zzc;
        return zzel.zzT(null, null) && zzel.zzT(null, null);
    }

    public final int hashCode() {
        return 0;
    }
}
