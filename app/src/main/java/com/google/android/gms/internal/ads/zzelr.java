package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.vh6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelr implements zzegk {
    public final Context a;
    public final zzcxx b;
    public final zzbjt c;
    public final zzfyy d;
    public final zzfhp e;

    public zzelr(Context context, zzcxx zzcxxVar, zzfhp zzfhpVar, zzfyy zzfyyVar, zzbjt zzbjtVar) {
        this.a = context;
        this.b = zzcxxVar;
        this.e = zzfhpVar;
        this.d = zzfyyVar;
        this.c = zzbjtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(zzfde zzfdeVar, zzfcs zzfcsVar) {
        vh6 vh6Var = new vh6(new View(this.a), zzeln.zza, (zzfct) zzfcsVar.zzv.get(0));
        zzcxb zzcxbVarZza = this.b.zza(new zzczr(zzfdeVar, zzfcsVar, null), vh6Var);
        zzelq zzelqVarZzk = zzcxbVarZza.zzk();
        zzfcx zzfcxVar = zzfcsVar.zzt;
        final zzbjo zzbjoVar = new zzbjo(zzelqVarZzk, zzfcxVar.zzb, zzfcxVar.zza);
        return zzfgz.zzd(new zzfgt() { // from class: com.google.android.gms.internal.ads.zzelo
            @Override // com.google.android.gms.internal.ads.zzfgt
            public final void zza() {
                zzelr zzelrVar = this.zza;
                zzelrVar.c.zze(zzbjoVar);
            }
        }, this.d, zzfhj.CUSTOM_RENDER_SYN, this.e).zzb(zzfhj.CUSTOM_RENDER_ACK).zzd(zzfyo.zzi(zzcxbVarZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        zzfcx zzfcxVar;
        return (this.c == null || (zzfcxVar = zzfcsVar.zzt) == null || zzfcxVar.zza == null) ? false : true;
    }
}
