package com.google.android.gms.internal.ads;

import defpackage.v07;

/* JADX INFO: loaded from: classes3.dex */
public final class zziz {
    public boolean a;
    public v07 zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;

    public zziz(v07 v07Var) {
        this.zza = v07Var;
    }

    public final void zza(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(int i) {
        this.a = true;
        this.zze = true;
        this.zzf = i;
    }

    public final void zzc(v07 v07Var) {
        this.a |= this.zza != v07Var;
        this.zza = v07Var;
    }

    public final void zzd(int i) {
        if (this.zzc && this.zzd != 5) {
            zzdd.zzd(i == 5);
            return;
        }
        this.a = true;
        this.zzc = true;
        this.zzd = i;
    }
}
