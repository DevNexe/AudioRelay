package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdvs implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;

    public zzdvs(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcoq) this.a).zza();
        final String strZzb = ((zzebk) this.b).zzb();
        zzcgt zzcgtVarZza = ((zzcpa) this.c).zza();
        final zzbev zzbevVar = (zzbev) this.d.zzb();
        final String str = (String) this.e.zzb();
        zzbel zzbelVar = new zzbel(new zzber(contextZza));
        zzbhk zzbhkVarZza = zzbhl.zza();
        zzbhkVarZza.zza(zzcgtVarZza.zzb);
        zzbhkVarZza.zzc(zzcgtVarZza.zzc);
        zzbhkVarZza.zzb(true != zzcgtVarZza.zzd ? 2 : 0);
        final zzbhl zzbhlVar = (zzbhl) zzbhkVarZza.zzal();
        zzbelVar.zzb(new zzbek() { // from class: com.google.android.gms.internal.ads.zzdvr
            @Override // com.google.android.gms.internal.ads.zzbek
            public final void zza(zzbga zzbgaVar) {
                zzbev zzbevVar2 = zzbevVar;
                String str2 = strZzb;
                zzbhl zzbhlVar2 = zzbhlVar;
                String str3 = str;
                zzbew zzbewVar = (zzbew) zzbgaVar.zza().zzaz();
                zzbewVar.zza(zzbevVar2);
                zzbgaVar.zze(zzbewVar);
                zzbfs zzbfsVar = (zzbfs) zzbgaVar.zzb().zzaz();
                zzbfsVar.zza(str2);
                zzbfsVar.zzb(zzbhlVar2);
                zzbgaVar.zzg(zzbfsVar);
                zzbgaVar.zzh(str3);
            }
        });
        return zzbelVar;
    }
}
