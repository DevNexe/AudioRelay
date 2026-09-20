package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbaa {
    public boolean a;

    public final synchronized void zza() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized boolean zzb() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public final synchronized boolean zzc() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}
