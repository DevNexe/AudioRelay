package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ft;
import defpackage.x76;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdu {
    public final ft a;
    public final x76 b;

    public zzcdu(ft ftVar, x76 x76Var) {
        this.a = ftVar;
        this.b = x76Var;
    }

    public static zzcdu zza(Context context) {
        return zzcet.zzd(context).a();
    }

    public final void zzb(int i, long j) {
        this.b.a(i, j);
    }

    public final void zzc() {
        x76 x76Var = this.b;
        x76Var.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzao)).booleanValue()) {
            x76Var.c.zzt();
        }
    }

    public final void zzd(com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.b.a(-1, this.a.b());
    }

    public final void zze() {
        this.b.a(-1, this.a.b());
    }
}
