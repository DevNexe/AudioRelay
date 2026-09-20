package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbad {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }

    public static boolean zza(String str) {
        return "audio".equals(a(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(a(str));
    }
}
