package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfu extends zzgoj implements zzgpy {
    public zzgfu() {
        super(zzgfv.zzb);
    }

    public final zzgfu zza(zzgnf zzgnfVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        ((zzgfv) this.x).zzg = zzgnfVar;
        return this;
    }

    public final zzgfu zzb(zzggb zzggbVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgfv.o((zzgfv) this.x, zzggbVar);
        return this;
    }

    public final zzgfu zzc(int i) {
        if (this.y) {
            c();
            this.y = false;
        }
        ((zzgfv) this.x).zze = 0;
        return this;
    }

    public /* synthetic */ zzgfu(int i) {
        super(zzgfv.zzb);
    }
}
