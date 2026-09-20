package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdu {
    @Pure
    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                }
                if (cause instanceof UnknownHostException) {
                    strReplace = "UnknownHostException (no network)";
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + "\n";
    }

    @Pure
    public static void zza(String str, String str2, Throwable th) {
        Log.e(str, a(str2, th));
    }

    @Pure
    public static void zzb(String str, String str2, Throwable th) {
        Log.w(str, a(str2, th));
    }
}
