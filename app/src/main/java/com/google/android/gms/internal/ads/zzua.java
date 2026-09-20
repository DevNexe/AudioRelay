package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class zzua extends zzcn {
    public static final Object f = new Object();
    public final long a;
    public final long b;
    public final boolean c;
    public final zzbg d;
    public final zzaw e;

    static {
        zzaj zzajVar = new zzaj();
        zzajVar.zza("SinglePeriodTimeline");
        zzajVar.zzb(Uri.EMPTY);
        zzajVar.zzc();
    }

    public zzua(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, zzbg zzbgVar, zzaw zzawVar) {
        this.a = j4;
        this.b = j5;
        this.c = z;
        this.d = zzbgVar;
        this.e = zzawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zza(Object obj) {
        return f.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzd(int i, zzck zzckVar, boolean z) {
        zzdd.zza(i, 0, 1);
        zzckVar.zzk(null, z ? f : null, 0, this.a, 0L, zzd.zza, false);
        return zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzcm zze(int i, zzcm zzcmVar, long j) {
        zzdd.zza(i, 0, 1);
        zzcmVar.zza(zzcm.zza, this.d, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.c, false, this.e, 0L, this.b, 0, 0, 0L);
        return zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final Object zzf(int i) {
        zzdd.zza(i, 0, 1);
        return f;
    }
}
