package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjk extends zzgoj implements zzgpy {
    public zzgjk() {
        super(zzgjl.zzb);
    }

    public final zzgjk zza(String str) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgjl.n((zzgjl) this.x, str);
        return this;
    }

    public final zzgjk zzb(zzgnf zzgnfVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        ((zzgjl) this.x).zzf = zzgnfVar;
        return this;
    }

    public final zzgjk zzc(int i) {
        if (this.y) {
            c();
            this.y = false;
        }
        ((zzgjl) this.x).zzg = zzgkm.zza(i);
        return this;
    }

    public /* synthetic */ zzgjk(int i) {
        super(zzgjl.zzb);
    }
}
