package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcwj extends zzczc {
    public final View i;
    public final zzcmn j;
    public final zzfct k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final zzcwb o;
    public zzbdj p;

    public zzcwj(zzczb zzczbVar, View view, zzcmn zzcmnVar, zzfct zzfctVar, int i, boolean z, boolean z2, zzcwb zzcwbVar) {
        super(zzczbVar);
        this.i = view;
        this.j = zzcmnVar;
        this.k = zzfctVar;
        this.l = i;
        this.m = z;
        this.n = z2;
        this.o = zzcwbVar;
    }

    public final int zza() {
        return this.l;
    }

    public final View zzb() {
        return this.i;
    }

    public final zzfct zzc() {
        return zzfdr.zzb(this.b.zzs, this.k);
    }

    public final void zzd(zzbcz zzbczVar) {
        this.j.zzaj(zzbczVar);
    }

    public final boolean zze() {
        return this.m;
    }

    public final boolean zzf() {
        return this.n;
    }

    public final boolean zzg() {
        return this.j.zzay();
    }

    public final boolean zzh() {
        zzcmn zzcmnVar = this.j;
        return zzcmnVar.zzP() != null && zzcmnVar.zzP().zzJ();
    }

    public final void zzi(long j, int i) {
        this.o.zza(j, i);
    }

    public final zzbdj zzj() {
        return this.p;
    }

    public final void zzk(zzbdj zzbdjVar) {
        this.p = zzbdjVar;
    }
}
