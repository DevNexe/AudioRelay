package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbif extends zzgoj implements zzgpy {
    public zzbif() {
        super(zzbig.zzb);
    }

    public final zzbif zza(boolean z) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzbig.n((zzbig) this.x, z);
        return this;
    }

    public final zzbif zzb(int i) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzbig.o((zzbig) this.x, i);
        return this;
    }

    public final boolean zzc() {
        return ((zzbig) this.x).zzf();
    }

    public /* synthetic */ zzbif(int i) {
        super(zzbig.zzb);
    }
}
