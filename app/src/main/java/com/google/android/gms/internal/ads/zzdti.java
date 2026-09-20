package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdti implements Callable {
    public final zzefz A;
    public final Executor B;
    public final zzapb C;
    public final zzcgt D;
    public final zzfju E;
    public final com.google.android.gms.ads.internal.zza w;
    public final Context x;
    public final zzdxo y;
    public final zzfhz z;

    public zzdti(Context context, Executor executor, zzapb zzapbVar, zzcgt zzcgtVar, com.google.android.gms.ads.internal.zza zzaVar, zzcmz zzcmzVar, zzefz zzefzVar, zzfju zzfjuVar, zzdxo zzdxoVar, zzfhz zzfhzVar) {
        this.x = context;
        this.B = executor;
        this.C = zzapbVar;
        this.D = zzcgtVar;
        this.w = zzaVar;
        this.A = zzefzVar;
        this.E = zzfjuVar;
        this.y = zzdxoVar;
        this.z = zzfhzVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzdtl zzdtlVar = new zzdtl(this);
        zzdtlVar.zzh();
        return zzdtlVar;
    }
}
