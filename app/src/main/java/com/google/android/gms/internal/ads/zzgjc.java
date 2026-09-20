package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjc extends zzgoj implements zzgpy {
    public zzgjc() {
        super(zzgjd.zzb);
    }

    public final zzgjc zza(zzgix zzgixVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgjd.o((zzgjd) this.x, zzgixVar);
        return this;
    }

    public final zzgjc zzb(zzgnf zzgnfVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        ((zzgjd) this.x).zzg = zzgnfVar;
        return this;
    }

    public final zzgjc zzc(int i) {
        if (this.y) {
            c();
            this.y = false;
        }
        ((zzgjd) this.x).zze = 0;
        return this;
    }

    public /* synthetic */ zzgjc(int i) {
        super(zzgjd.zzb);
    }
}
