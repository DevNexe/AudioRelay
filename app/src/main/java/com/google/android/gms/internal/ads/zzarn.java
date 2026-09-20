package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarn {
    public final HashMap a = new HashMap();

    public final AtomicReference zza(String str) {
        synchronized (this) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.a.get(str);
    }
}
