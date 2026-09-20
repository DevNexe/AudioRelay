package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakm {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable("Volley", 2);
    public static final String a = zzakm.class.getName();

    public static String a(String str, Object... objArr) {
        String strA;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(a)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                strA = defpackage.LPt6Fixed.a(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".", stackTrace[i].getMethodName());
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), strA, str2);
            }
        }
        strA = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), strA, str2);
    }

    public static void zza(String str, Object... objArr) {
        Log.d(zza, a(str, objArr));
    }

    public static void zzb(String str, Object... objArr) {
        Log.e(zza, a(str, objArr));
    }

    public static void zzc(Throwable th, String str, Object... objArr) {
        Log.e(zza, a(str, objArr), th);
    }

    public static void zzd(String str, Object... objArr) {
        if (zzb) {
            Log.v(zza, a(str, objArr));
        }
    }
}
