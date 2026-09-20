package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemb implements zzf {

    @GuardedBy("this")
    public zzf w;

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        zzf zzfVar = this.w;
        if (zzfVar != null) {
            zzfVar.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    /* JADX INFO: renamed from: zzb */
    public final synchronized void mo44zzb() {
        zzf zzfVar = this.w;
        if (zzfVar != null) {
            zzfVar.mo44zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzc() {
        zzf zzfVar = this.w;
        if (zzfVar != null) {
            zzfVar.zzc();
        }
    }

    public final synchronized void zzd(zzf zzfVar) {
        this.w = zzfVar;
    }
}
