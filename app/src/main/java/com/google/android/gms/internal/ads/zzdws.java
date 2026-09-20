package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdws implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;

    public zzdws(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet;
        final String strZza = ((zzewv) this.a).zza();
        Context contextZza = ((zzcoq) this.b).zza();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        Map mapZzb = ((zzguv) this.d).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdX)).booleanValue()) {
            zzbel zzbelVar = new zzbel(new zzber(contextZza));
            zzbelVar.zzb(new zzbek() { // from class: com.google.android.gms.internal.ads.zzdwt
                @Override // com.google.android.gms.internal.ads.zzbek
                public final void zza(zzbga zzbgaVar) {
                    zzbgaVar.zzh(strZza);
                }
            });
            setEmptySet = Collections.singleton(new zzdke(new zzdwv(zzbelVar, mapZzb), zzfyyVar));
        } else {
            setEmptySet = Collections.emptySet();
        }
        zzguz.zzb(setEmptySet);
        return setEmptySet;
    }
}
