package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgcz {
    public static final Logger a = Logger.getLogger(zzgcz.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static boolean zzb() {
        return b.get();
    }
}
