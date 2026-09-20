package com.google.android.gms.ads.internal.util;

import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class zzbz {
    public long a;

    @GuardedBy("lock")
    public long b = Long.MIN_VALUE;
    public final Object c = new Object();

    public zzbz(long j) {
        this.a = j;
    }

    public final void zza(long j) {
        synchronized (this.c) {
            this.a = j;
        }
    }

    public final boolean zzb() {
        synchronized (this.c) {
            long jC = com.google.android.gms.ads.internal.zzt.zzB().c();
            if (this.b + this.a > jC) {
                return false;
            }
            this.b = jC;
            return true;
        }
    }
}
