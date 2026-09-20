package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbja {
    public static Object zza(zzfsv zzfsvVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfsvVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
