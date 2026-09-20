package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhi {
    public final Context a;
    public final zzde b;
    public final zzhc c;
    public final zzhd d;
    public zzfsv e;
    public zzfsv f;
    public final zzhg g;
    public final zzhh h;
    public final Looper i;
    public final zzk j;
    public final zzkb k;
    public boolean l;
    public final zzgt m;

    public zzhi(final Context context, zzclw zzclwVar, byte[] bArr) {
        zzhc zzhcVar = new zzhc(zzclwVar, null);
        zzhd zzhdVar = new zzhd(context);
        zzfsv zzfsvVar = new zzfsv() { // from class: com.google.android.gms.internal.ads.zzhe
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return new zzvo(context);
            }
        };
        zzhf zzhfVar = new zzfsv() { // from class: com.google.android.gms.internal.ads.zzhf
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return new zzgu();
            }
        };
        zzhg zzhgVar = new zzhg(context);
        zzhh zzhhVar = zzhh.zza;
        this.a = context;
        this.c = zzhcVar;
        this.d = zzhdVar;
        this.e = zzfsvVar;
        this.f = zzhfVar;
        this.g = zzhgVar;
        this.h = zzhhVar;
        this.i = zzel.zzE();
        this.j = zzk.zza;
        this.k = zzkb.zze;
        this.m = new zzgt(zzel.zzv(20L), zzel.zzv(500L));
        this.b = zzde.zza;
    }
}
