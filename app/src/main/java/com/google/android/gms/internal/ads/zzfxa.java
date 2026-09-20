package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfxa {
    public static int zza(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalArgumentException(zzfsu.zzb("Out of range: %s", Long.valueOf(j)));
    }

    public static int zzb(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), 1073741823);
    }
}
