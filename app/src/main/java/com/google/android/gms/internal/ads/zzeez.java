package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeez {
    public long a = 0;
    public int b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public final Object f = new Object();
    public final Object g = new Object();
    public final Object h = new Object();
    public final Object i = new Object();
    public final Object j = new Object();

    public final int zza() {
        int i;
        synchronized (this.g) {
            i = this.b;
        }
        return i;
    }

    public final synchronized long zzb() {
        long j;
        synchronized (this.j) {
            j = this.e;
        }
        return j;
    }

    public final synchronized long zzc() {
        long j;
        synchronized (this.i) {
            j = this.d;
        }
        return j;
    }

    public final synchronized long zzd() {
        long j;
        synchronized (this.f) {
            j = this.a;
        }
        return j;
    }

    public final long zze() {
        long j;
        synchronized (this.h) {
            j = this.c;
        }
        return j;
    }

    public final synchronized void zzf(long j) {
        synchronized (this.j) {
            this.e = j;
        }
    }

    public final synchronized void zzg(long j) {
        synchronized (this.i) {
            this.d = j;
        }
    }

    public final synchronized void zzh(long j) {
        synchronized (this.f) {
            this.a = j;
        }
    }

    public final void zzi(int i) {
        synchronized (this.g) {
            this.b = i;
        }
    }

    public final void zzj(long j) {
        synchronized (this.h) {
            this.c = j;
        }
    }
}
