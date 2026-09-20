package com.google.android.gms.internal.ads;

import defpackage.ib6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelw implements zzegk {
    public final zzbjt a;
    public final zzfyy b;
    public final zzfhp c;
    public final zzemf d;

    public zzelw(zzfhp zzfhpVar, zzfyy zzfyyVar, zzbjt zzbjtVar, zzemf zzemfVar, byte[] bArr) {
        this.c = zzfhpVar;
        this.b = zzfyyVar;
        this.a = zzbjtVar;
        this.d = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(zzfde zzfdeVar, zzfcs zzfcsVar) {
        zzchf zzchfVar = new zzchf();
        zzemb zzembVar = new zzemb();
        zzembVar.zzd(new ib6(this, zzchfVar, zzfdeVar, zzfcsVar, zzembVar));
        zzfcx zzfcxVar = zzfcsVar.zzt;
        final zzbjo zzbjoVar = new zzbjo(zzembVar, zzfcxVar.zzb, zzfcxVar.zza);
        return zzfgz.zzd(new zzfgt() { // from class: com.google.android.gms.internal.ads.zzelu
            @Override // com.google.android.gms.internal.ads.zzfgt
            public final void zza() {
                zzelw zzelwVar = this.zza;
                zzelwVar.a.zze(zzbjoVar);
            }
        }, this.b, zzfhj.CUSTOM_RENDER_SYN, this.c).zzb(zzfhj.CUSTOM_RENDER_ACK).zzd(zzchfVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        zzfcx zzfcxVar;
        return (this.a == null || (zzfcxVar = zzfcsVar.zzt) == null || zzfcxVar.zza == null) ? false : true;
    }
}
