package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.od6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzduw {
    public final Context a;
    public final zzapb b;
    public final zzbjx c;
    public final zzcgt d;
    public final com.google.android.gms.ads.internal.zza e;
    public final zzbel f;
    public final zzdfn g;

    public zzduw(zzcmz zzcmzVar, Context context, zzapb zzapbVar, zzbjx zzbjxVar, zzcgt zzcgtVar, com.google.android.gms.ads.internal.zza zzaVar, zzbel zzbelVar, zzdfn zzdfnVar) {
        this.a = context;
        this.b = zzapbVar;
        this.c = zzbjxVar;
        this.d = zzcgtVar;
        this.e = zzaVar;
        this.f = zzbelVar;
        this.g = zzdfnVar;
    }

    public final zzcmn zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfcs zzfcsVar, zzfcv zzfcvVar) {
        return zzcmz.zza(this.a, zzcoc.zzc(zzqVar), zzqVar.zza, false, false, this.b, this.c, this.d, null, new od6(this, 3), this.e, this.f, zzfcsVar, zzfcvVar);
    }
}
