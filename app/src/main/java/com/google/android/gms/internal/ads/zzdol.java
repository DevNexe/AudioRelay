package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdol {
    public zzblx a;

    public zzdol(zzdoa zzdoaVar) {
        this.a = zzdoaVar;
    }

    public final synchronized zzblx zza() {
        return this.a;
    }

    public final synchronized void zzb(zzblx zzblxVar) {
        this.a = zzblxVar;
    }
}
