package com.google.android.gms.internal.ads;

import defpackage.ok4;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdox {
    public zzbnb a;
    public zzbmy b;
    public zzbno c;
    public zzbnl d;
    public zzbsg e;
    public final ok4 f = new ok4();
    public final ok4 g = new ok4();

    public final zzdox zza(zzbmy zzbmyVar) {
        this.b = zzbmyVar;
        return this;
    }

    public final zzdox zzb(zzbnb zzbnbVar) {
        this.a = zzbnbVar;
        return this;
    }

    public final zzdox zzc(String str, zzbnh zzbnhVar, zzbne zzbneVar) {
        this.f.put(str, zzbnhVar);
        if (zzbneVar != null) {
            this.g.put(str, zzbneVar);
        }
        return this;
    }

    public final zzdox zzd(zzbsg zzbsgVar) {
        this.e = zzbsgVar;
        return this;
    }

    public final zzdox zze(zzbnl zzbnlVar) {
        this.d = zzbnlVar;
        return this;
    }

    public final zzdox zzf(zzbno zzbnoVar) {
        this.c = zzbnoVar;
        return this;
    }

    public final zzdoz zzg() {
        return new zzdoz(this);
    }
}
