package com.google.android.gms.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    public static int zza(AdSize adSize) {
        return adSize.f;
    }

    public static int zzb(AdSize adSize) {
        return adSize.h;
    }

    public static AdSize zzc(int i, int i2, String str) {
        return new AdSize(i, i2, str);
    }

    public static AdSize zzd(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.e = true;
        adSize.f = i2;
        return adSize;
    }

    public static AdSize zze(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.g = true;
        adSize.h = i2;
        return adSize;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.d;
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.e;
    }

    public static boolean zzh(AdSize adSize) {
        return adSize.g;
    }
}
