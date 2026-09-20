package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ta extends RBi {
    public final AtomicReferenceFieldUpdater<WE, Thread> a;
    public final AtomicReferenceFieldUpdater<WE, WE> b;
    public final AtomicReferenceFieldUpdater<zzfxf, WE> c;
    public final AtomicReferenceFieldUpdater<zzfxf, Xn1> d;
    public final AtomicReferenceFieldUpdater<zzfxf, Object> e;

    public ta(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final Xn1 a(zzfxf zzfxfVar, Xn1 xn1) {
        return this.d.getAndSet(zzfxfVar, xn1);
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final WE b(zzfxf zzfxfVar) {
        return this.c.getAndSet(zzfxfVar, WE.c);
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final void c(WE we, @CheckForNull WE we2) {
        this.b.lazySet(we, we2);
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final void d(WE we, Thread thread) {
        this.a.lazySet(we, thread);
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final boolean e(zzfxf zzfxfVar, @CheckForNull Xn1 xn1, Xn1 xn2) {
        return zzfxg.zza(this.d, zzfxfVar, xn1, xn2);
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final boolean f(zzfxf zzfxfVar, @CheckForNull Object obj, Object obj2) {
        return zzfxg.zza(this.e, zzfxfVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final boolean g(zzfxf zzfxfVar, @CheckForNull WE we, @CheckForNull WE we2) {
        return zzfxg.zza(this.c, zzfxfVar, we, we2);
    }
}
