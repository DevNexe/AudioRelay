package com.google.android.gms.internal.ads;

import defpackage.cq4;
import defpackage.od6;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class zzchm {
    public final zzchf a;
    public final AtomicInteger b;

    public zzchm() {
        zzchf zzchfVar = new zzchf();
        this.a = zzchfVar;
        this.b = new AtomicInteger(0);
        zzfyo.zzr(zzchfVar, new od6(this, 2), zzcha.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.b.get();
    }

    @Deprecated
    public final void zzg() {
        this.a.zze(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.a.zzd(obj);
    }

    @Deprecated
    public final void zzi(zzchj zzchjVar, zzchh zzchhVar) {
        zzfyo.zzr(this.a, new cq4(zzchjVar, zzchhVar, 18, 0), zzcha.zzf);
    }
}
