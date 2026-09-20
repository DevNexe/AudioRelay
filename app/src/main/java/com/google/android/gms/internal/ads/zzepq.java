package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepq {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public final void zza(boolean z) {
        this.a.set(true);
    }

    public final boolean zzb() {
        return this.a.get();
    }
}
