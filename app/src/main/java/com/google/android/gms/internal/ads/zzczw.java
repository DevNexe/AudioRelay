package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzczw implements com.google.android.gms.ads.internal.overlay.zzo {
    public final zzdef w;
    public final AtomicBoolean x = new AtomicBoolean(false);
    public final AtomicBoolean y = new AtomicBoolean(false);

    public zzczw(zzdef zzdefVar) {
        this.w = zzdefVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        this.w.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        AtomicBoolean atomicBoolean = this.y;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.w.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        this.x.set(true);
        AtomicBoolean atomicBoolean = this.y;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.w.zza();
    }

    public final boolean zzg() {
        return this.x.get();
    }
}
