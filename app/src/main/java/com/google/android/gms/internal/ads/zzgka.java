package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgka extends zzgoj implements zzgpy {
    public zzgka() {
        super(zzgkb.zzb);
    }

    public final zzgka zza(zzgke zzgkeVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgkb.o((zzgkb) this.x, zzgkeVar);
        return this;
    }

    public final zzgka zzb(int i) {
        if (this.y) {
            c();
            this.y = false;
        }
        ((zzgkb) this.x).zze = 0;
        return this;
    }

    public /* synthetic */ zzgka(int i) {
        super(zzgkb.zzb);
    }
}
