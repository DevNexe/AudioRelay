package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdbv implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzdbv(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.a.zzb();
        final zzcgt zzcgtVarZza = ((zzcpa) this.b).zza();
        final zzfdn zzfdnVarZza = ((zzdcp) this.c).zza();
        return new zzfru() { // from class: com.google.android.gms.internal.ads.zzdbu
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                Context context2 = context;
                zzcgt zzcgtVar = zzcgtVarZza;
                zzfdn zzfdnVar = zzfdnVarZza;
                zzfcs zzfcsVar = (zzfcs) obj;
                com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context2);
                zzasVar.zzp(zzfcsVar.zzC);
                zzasVar.zzq(zzfcsVar.zzD.toString());
                zzasVar.zzo(zzcgtVar.zza);
                zzasVar.zzn(zzfdnVar.zzf);
                return zzasVar;
            }
        };
    }
}
