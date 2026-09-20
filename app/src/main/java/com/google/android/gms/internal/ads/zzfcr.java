package com.google.android.gms.internal.ads;

import defpackage.ft;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfcr {
    public final ft a;
    public final Object b = new Object();

    @GuardedBy("lock")
    public volatile int d = 1;
    public volatile long c = 0;

    public zzfcr(ft ftVar) {
        this.a = ftVar;
    }

    public final void a() {
        long jB = this.a.b();
        synchronized (this.b) {
            if (this.d == 3) {
                if (this.c + ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeX)).longValue() <= jB) {
                    this.d = 1;
                }
            }
        }
    }

    public final void b(int i, int i2) {
        a();
        long jB = this.a.b();
        synchronized (this.b) {
            if (this.d != i) {
                return;
            }
            this.d = i2;
            if (this.d == 3) {
                this.c = jB;
            }
        }
    }

    public final void zza() {
        b(2, 3);
    }

    public final void zzb(boolean z) {
        if (z) {
            b(1, 2);
        } else {
            b(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.b) {
            a();
            z = this.d == 3;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.b) {
            a();
            z = this.d == 2;
        }
        return z;
    }
}
