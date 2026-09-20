package com.google.android.gms.internal.ads;

import defpackage.ej6;
import defpackage.fj6;
import defpackage.gj6;
import defpackage.oj6;
import defpackage.pj6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzezt implements zzfah {
    public final zzfey a;
    public final Executor b;
    public final fj6 c = new fj6(0);

    public zzezt(zzfey zzfeyVar, Executor executor) {
        this.a = zzfeyVar;
        this.b = executor;
    }

    public final zzfyx zzb(zzfai zzfaiVar, zzfag zzfagVar, final zzdch zzdchVar) {
        zzfyx zzfyxVarZzi;
        zzfyx zzfyxVarZzf;
        zzfey zzfeyVar = this.a;
        Executor executor = this.b;
        pj6 pj6Var = new pj6(zzfeyVar, zzdchVar, executor);
        zzfac zzfacVar = pj6Var.d;
        if (zzfacVar == null) {
            if (((Boolean) zzbku.zza.zze()).booleanValue()) {
                zzfyxVarZzf = zzfyo.zzf(zzfyo.zzm(zzfyf.zzv(zzdchVar.zzb().zze(zzfeyVar.zza())), new oj6(pj6Var), executor), zzecu.class, new gj6(pj6Var), executor);
            } else {
                zzfdn zzfdnVarZzg = zzdchVar.zzg();
                zzfac zzfacVar2 = new zzfac(null, zzfeyVar.zzc(zzfdnVarZzg.zzd, zzfdnVarZzg.zzf, zzfdnVarZzg.zzj));
                pj6Var.d = zzfacVar2;
                zzfyxVarZzf = zzfyo.zzi(zzfacVar2);
            }
            zzfyxVarZzi = zzfyo.zzm(zzfyxVarZzf, new zzfru() { // from class: com.google.android.gms.internal.ads.zzezy
                @Override // com.google.android.gms.internal.ads.zzfru
                public final Object apply(Object obj) {
                    return (zzfac) obj;
                }
            }, executor);
        } else {
            zzfyxVarZzi = zzfyo.zzi(zzfacVar);
        }
        return zzfyo.zzf(zzfyo.zzn(zzfyf.zzv(zzfyxVarZzi), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzezp
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzezt zzeztVar = this.zza;
                zzdch zzdchVar2 = zzdchVar;
                zzfac zzfacVar3 = (zzfac) obj;
                zzeztVar.getClass();
                zzffi zzffiVar = zzfacVar3.zzb;
                zzcba zzcbaVar = zzfacVar3.zza;
                zzffh zzffhVarZzb = zzffiVar != null ? zzeztVar.a.zzb(zzffiVar) : null;
                if (zzffiVar == null) {
                    return zzfyo.zzi(null);
                }
                if (zzffhVarZzb != null && zzcbaVar != null) {
                    zzfyo.zzr(zzdchVar2.zzb().zzg(zzcbaVar), zzeztVar.c, zzeztVar.b);
                }
                return zzfyo.zzi(new zzezs(zzffiVar, zzcbaVar, zzffhVarZzb));
            }
        }, executor), Exception.class, new ej6(), executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfah
    public final /* bridge */ /* synthetic */ zzfyx zzc(zzfai zzfaiVar, zzfag zzfagVar, Object obj) {
        return zzb(zzfaiVar, zzfagVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfah
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
