package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbh {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized String zza() {
        return b;
    }

    public static synchronized void zzb(String str) {
        if (a.add(str)) {
            b = b + ", " + str;
        }
    }
}
