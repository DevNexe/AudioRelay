package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelq implements zzf {
    public final zzcvi A;
    public final AtomicBoolean B = new AtomicBoolean(false);
    public final zzdcw w;
    public final zzddq x;
    public final zzdkn y;
    public final zzdkg z;

    public zzelq(zzdcw zzdcwVar, zzddq zzddqVar, zzdkn zzdknVar, zzdkg zzdkgVar, zzcvi zzcviVar) {
        this.w = zzdcwVar;
        this.x = zzddqVar;
        this.y = zzdknVar;
        this.z = zzdkgVar;
        this.A = zzcviVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.B.compareAndSet(false, true)) {
            this.A.zzl();
            this.z.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    /* JADX INFO: renamed from: zzb */
    public final void mo44zzb() {
        if (this.B.get()) {
            this.w.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.B.get()) {
            this.x.zza();
            this.y.zza();
        }
    }
}
