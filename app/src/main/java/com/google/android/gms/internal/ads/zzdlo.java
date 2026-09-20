package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdlo implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;

    public zzdlo(zzdli zzdliVar, zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.a.zzb();
        final zzcgt zzcgtVarZza = ((zzcpa) this.b).zza();
        final zzfcs zzfcsVarZza = ((zzczs) this.c).zza();
        final zzfdn zzfdnVarZza = ((zzdcp) this.d).zza();
        return new zzdke(new zzdem() { // from class: com.google.android.gms.internal.ads.zzdlh
            @Override // com.google.android.gms.internal.ads.zzdem
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzt().zzn(context, zzcgtVarZza.zza, zzfcsVarZza.zzD.toString(), zzfdnVarZza.zzf);
            }
        }, zzcha.zzf);
    }
}
