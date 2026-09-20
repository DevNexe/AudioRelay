package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdii {
    public final HashSet a = new HashSet();
    public final HashSet b = new HashSet();
    public final HashSet c = new HashSet();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final HashSet h = new HashSet();
    public final HashSet i = new HashSet();
    public final HashSet j = new HashSet();
    public final HashSet k = new HashSet();
    public final HashSet l = new HashSet();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public zzfae o;

    public final zzdii zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.c.add(new zzdke(zzaVar, executor));
        return this;
    }

    public final zzdii zzb(zzddb zzddbVar, Executor executor) {
        this.i.add(new zzdke(zzddbVar, executor));
        return this;
    }

    public final zzdii zzc(zzddo zzddoVar, Executor executor) {
        this.l.add(new zzdke(zzddoVar, executor));
        return this;
    }

    public final zzdii zzd(zzdds zzddsVar, Executor executor) {
        this.f.add(new zzdke(zzddsVar, executor));
        return this;
    }

    public final zzdii zze(zzdcy zzdcyVar, Executor executor) {
        this.e.add(new zzdke(zzdcyVar, executor));
        return this;
    }

    public final zzdii zzf(zzdem zzdemVar, Executor executor) {
        this.h.add(new zzdke(zzdemVar, executor));
        return this;
    }

    public final zzdii zzg(zzdex zzdexVar, Executor executor) {
        this.g.add(new zzdke(zzdexVar, executor));
        return this;
    }

    public final zzdii zzh(com.google.android.gms.ads.internal.overlay.zzo zzoVar, Executor executor) {
        this.n.add(new zzdke(zzoVar, executor));
        return this;
    }

    public final zzdii zzi(zzdfj zzdfjVar, Executor executor) {
        this.m.add(new zzdke(zzdfjVar, executor));
        return this;
    }

    public final zzdii zzj(zzdft zzdftVar, Executor executor) {
        this.b.add(new zzdke(zzdftVar, executor));
        return this;
    }

    public final zzdii zzk(zzasb zzasbVar, Executor executor) {
        this.k.add(new zzdke(zzasbVar, executor));
        return this;
    }

    public final zzdii zzl(zzdkl zzdklVar, Executor executor) {
        this.d.add(new zzdke(zzdklVar, executor));
        return this;
    }

    public final zzdii zzm(zzfae zzfaeVar) {
        this.o = zzfaeVar;
        return this;
    }

    public final zzdik zzn() {
        return new zzdik(this);
    }
}
