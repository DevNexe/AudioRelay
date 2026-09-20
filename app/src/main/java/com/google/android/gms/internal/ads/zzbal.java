package com.google.android.gms.internal.ads;

import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbal {
    public static void zza(String str) {
        if (zzban.zza >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void zzb() {
        if (zzban.zza >= 18) {
            Trace.endSection();
        }
    }
}
