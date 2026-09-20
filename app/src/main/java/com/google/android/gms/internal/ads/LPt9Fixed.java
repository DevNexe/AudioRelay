package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LPt9Fixed<V> implements Runnable {
    public final zzfxf<V> w;
    public final zzfyx<? extends V> x;

    public LPt9Fixed(zzfxf zzfxfVar, zzfyx zzfyxVar) {
        this.w = zzfxfVar;
        this.x = zzfyxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.w.w != this) {
            return;
        }
        if (zzfxf.B.f(this.w, this, zzfxf.f(this.x))) {
            zzfxf.l(this.w);
        }
    }
}
