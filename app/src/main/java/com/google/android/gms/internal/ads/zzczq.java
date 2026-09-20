package com.google.android.gms.internal.ads;

import defpackage.cq4;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzczq {
    public final Executor a;
    public final ScheduledExecutorService b;
    public final zzfyx c;
    public volatile boolean d = true;

    public zzczq(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfyx zzfyxVar) {
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = zzfyxVar;
    }

    public final void zze(zzfyk zzfykVar) {
        zzfyo.zzr(this.c, new cq4(this, zzfykVar, 19), this.a);
    }

    public final boolean zzf() {
        return this.d;
    }
}
