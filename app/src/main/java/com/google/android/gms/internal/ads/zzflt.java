package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflt {
    public final ArrayDeque b = new ArrayDeque();
    public zzfls c = null;
    public final ThreadPoolExecutor a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void zza(zzfls zzflsVar) {
        this.c = null;
        zzfls zzflsVar2 = (zzfls) this.b.poll();
        this.c = zzflsVar2;
        if (zzflsVar2 != null) {
            zzflsVar2.executeOnExecutor(this.a, new Object[0]);
        }
    }

    public final void zzb(zzfls zzflsVar) {
        zzflsVar.zzb(this);
        ArrayDeque arrayDeque = this.b;
        arrayDeque.add(zzflsVar);
        if (this.c == null) {
            zzfls zzflsVar2 = (zzfls) arrayDeque.poll();
            this.c = zzflsVar2;
            if (zzflsVar2 != null) {
                zzflsVar2.executeOnExecutor(this.a, new Object[0]);
            }
        }
    }
}
