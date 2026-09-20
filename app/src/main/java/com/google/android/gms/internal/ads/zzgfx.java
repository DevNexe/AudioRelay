package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfx extends zzgoj implements zzgpy {
    public zzgfx() {
        super(zzgfy.zzb);
    }

    public final zzgfx zza(int i) {
        if (this.y) {
            c();
            this.y = false;
        }
        ((zzgfy) this.x).zzf = i;
        return this;
    }

    public final zzgfx zzb(zzggb zzggbVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgfy.n((zzgfy) this.x, zzggbVar);
        return this;
    }

    public /* synthetic */ zzgfx(int i) {
        super(zzgfy.zzb);
    }
}
