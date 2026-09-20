package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfki {
    public final String a;
    public final String b;

    public zzfki(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static zzfki zza(String str, String str2) {
        zzflg.zza(str, "Name is null or empty");
        zzflg.zza(str2, "Version is null or empty");
        return new zzfki(str, str2);
    }

    public final String zzb() {
        return this.a;
    }

    public final String zzc() {
        return this.b;
    }
}
