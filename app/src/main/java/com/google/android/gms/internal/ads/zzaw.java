package com.google.android.gms.internal.ads;

import defpackage.ry0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaw {
    public static final zzaw zza;
    public static final zzn zzb;
    public final long zzc = -9223372036854775807L;
    public final long zzd = -9223372036854775807L;
    public final long zze = -9223372036854775807L;
    public final float zzf = -3.4028235E38f;
    public final float zzg = -3.4028235E38f;

    static {
        new zzau();
        zza = new zzaw();
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzat
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        long j = ((zzaw) obj).zzc;
        return true;
    }

    public final int hashCode() {
        int i = (int) (-9223372034707292159L);
        return Float.floatToIntBits(-3.4028235E38f) + ry0.b(-3.4028235E38f, ((((i * 31) + i) * 31) + i) * 31, 31);
    }
}
