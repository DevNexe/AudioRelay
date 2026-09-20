package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzcyg implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = (Runnable) this.zza.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
