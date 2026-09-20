package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfej {

    @GuardedBy("this")
    public final LinkedBlockingDeque a = new LinkedBlockingDeque();
    public final Callable b;
    public final zzfyy c;

    public zzfej(Callable callable, zzfyy zzfyyVar) {
        this.b = callable;
        this.c = zzfyyVar;
    }

    public final synchronized zzfyx zza() {
        zzc(1);
        return (zzfyx) this.a.poll();
    }

    public final synchronized void zzb(zzfyx zzfyxVar) {
        this.a.addFirst(zzfyxVar);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.add(this.c.zzb(this.b));
        }
    }
}
