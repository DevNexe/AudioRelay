package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpt {
    public boolean a = false;
    public boolean b = false;
    public float c = 0.0f;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public final synchronized float zza() {
        return this.c;
    }

    public final synchronized void zzb(boolean z, float f) {
        this.b = z;
        this.c = f;
    }

    public final synchronized void zzc(boolean z) {
        this.a = z;
        this.d.set(true);
    }

    public final synchronized boolean zzd() {
        return this.b;
    }

    public final synchronized boolean zze(boolean z) {
        if (!this.d.get()) {
            return z;
        }
        return this.a;
    }
}
