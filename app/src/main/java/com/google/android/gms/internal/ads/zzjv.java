package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjv {
    public final zzju a;
    public final zzjt b;
    public final zzde c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public zzjv(zzjt zzjtVar, zzju zzjuVar, zzcn zzcnVar, int i, zzde zzdeVar, Looper looper) {
        this.b = zzjtVar;
        this.a = zzjuVar;
        this.f = looper;
        this.c = zzdeVar;
    }

    public final int zza() {
        return this.d;
    }

    public final Looper zzb() {
        return this.f;
    }

    public final zzju zzc() {
        return this.a;
    }

    public final zzjv zzd() {
        zzdd.zzf(!this.g);
        this.g = true;
        this.b.zzm(this);
        return this;
    }

    public final zzjv zze(Object obj) {
        zzdd.zzf(!this.g);
        this.e = obj;
        return this;
    }

    public final zzjv zzf(int i) {
        zzdd.zzf(!this.g);
        this.d = i;
        return this;
    }

    public final Object zzg() {
        return this.e;
    }

    public final synchronized void zzh(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j) {
        zzdd.zzf(this.g);
        zzdd.zzf(this.f.getThread() != Thread.currentThread());
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.i) {
            if (j <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j);
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.h;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
