package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcyr implements zzdem, zzbbm {
    public final zzfcs w;
    public final zzddq x;
    public final zzdev y;
    public final AtomicBoolean z = new AtomicBoolean();
    public final AtomicBoolean A = new AtomicBoolean();

    public zzcyr(zzfcs zzfcsVar, zzddq zzddqVar, zzdev zzdevVar) {
        this.w = zzfcsVar;
        this.x = zzddqVar;
        this.y = zzdevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbm
    public final void zzc(zzbbl zzbblVar) {
        if (this.w.zzf == 1 && zzbblVar.zzj && this.z.compareAndSet(false, true)) {
            this.x.zza();
        }
        if (zzbblVar.zzj && this.A.compareAndSet(false, true)) {
            this.y.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final synchronized void zzn() {
        if (this.w.zzf != 1) {
            if (this.z.compareAndSet(false, true)) {
                this.x.zza();
            }
        }
    }
}
