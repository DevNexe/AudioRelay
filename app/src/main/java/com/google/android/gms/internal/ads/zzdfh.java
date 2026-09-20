package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdfh extends zzdih implements zzdds, zzdex {
    public final zzfcs x;
    public final AtomicBoolean y;

    public zzdfh(Set set, zzfcs zzfcsVar) {
        super(set);
        this.y = new AtomicBoolean();
        this.x = zzfcsVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgE)).booleanValue() && this.y.compareAndSet(false, true) && (zzsVar = this.x.zzag) != null && zzsVar.zza == 3) {
            a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdfg
                @Override // com.google.android.gms.internal.ads.zzdig
                public final void zza(Object obj) {
                    ((zzdfj) obj).zzg(this.zza.x.zzag);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzh() {
        if (this.x.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzl() {
        int i = this.x.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
