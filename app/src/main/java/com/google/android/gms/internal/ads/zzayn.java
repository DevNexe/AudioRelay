package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzayn extends zzatd {
    public static final Object c = new Object();
    public final long a;
    public final long b;

    public zzayn(long j, boolean z) {
        this.a = j;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final int zza(Object obj) {
        return c.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final zzatb zzd(int i, zzatb zzatbVar, boolean z) {
        zzazy.zza(i, 0, 1);
        Object obj = z ? c : null;
        zzatbVar.zza = obj;
        zzatbVar.zzb = obj;
        zzatbVar.zzc = this.a;
        return zzatbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final zzatc zze(int i, zzatc zzatcVar, boolean z, long j) {
        zzazy.zza(i, 0, 1);
        zzatcVar.zza = this.b;
        return zzatcVar;
    }
}
