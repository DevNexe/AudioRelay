package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgn;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzcb {
    @Deprecated
    public static Object zza(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            zzcgn.zzh("Unexpected exception.", th);
            zzcad.zza(context).zzd(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
