package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdg {
    public final zzde a;
    public boolean b;

    public zzdg() {
        throw null;
    }

    public zzdg(zzde zzdeVar) {
        this.a = zzdeVar;
    }

    public final synchronized void zza() {
        while (!this.b) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public final synchronized boolean zzd() {
        return this.b;
    }

    public final synchronized boolean zze() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }
}
