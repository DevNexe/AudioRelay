package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjv extends zzgoj implements zzgpy {
    public zzgjv() {
        super(zzgjy.zzb);
    }

    public final zzgjv zza(zzgjx zzgjxVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgjy.o((zzgjy) this.x, zzgjxVar);
        return this;
    }

    public final zzgjv zzb(int i) {
        if (this.y) {
            c();
            this.y = false;
        }
        ((zzgjy) this.x).zze = i;
        return this;
    }

    public /* synthetic */ zzgjv(int i) {
        super(zzgjy.zzb);
    }
}
