package com.google.android.gms.internal.ads;

import defpackage.d7G;
import defpackage.ma5;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbuj implements zzbtv {
    public final zzbtx a;
    public final zzbty b;
    public final zzbtr c;
    public final String d;

    public zzbuj(zzbtr zzbtrVar, String str, zzbty zzbtyVar, zzbtx zzbtxVar) {
        this.c = zzbtrVar;
        this.d = str;
        this.b = zzbtyVar;
        this.a = zzbtxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxv
    public final zzfyx zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final zzfyx zzb(Object obj) {
        zzchf zzchfVar = new zzchf();
        zzbtl zzbtlVarZzb = this.c.zzb(null);
        zzbtlVarZzb.zzi(new ma5(this, zzbtlVarZzb, obj, zzchfVar), new d7G(zzbtlVarZzb, zzchfVar));
        return zzchfVar;
    }
}
