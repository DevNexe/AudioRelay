package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzase extends Exception {
    public zzase(Throwable th) {
        super(null, th);
    }

    public static zzase a(RuntimeException runtimeException) {
        return new zzase(runtimeException);
    }

    public static zzase zza(Exception exc, int i) {
        return new zzase(exc);
    }

    public static zzase zzb(IOException iOException) {
        return new zzase(iOException);
    }
}
