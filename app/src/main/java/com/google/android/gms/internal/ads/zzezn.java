package com.google.android.gms.internal.ads;

import defpackage.dj6;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzezn implements zzfah {
    public final zzfah a;
    public final zzfah b;
    public final zzffu c;
    public final String d;

    @GuardedBy("this")
    public zzdch e;
    public final Executor f;

    public zzezn(zzfah zzfahVar, zzfah zzfahVar2, zzffu zzffuVar, String str, Executor executor) {
        this.a = zzfahVar;
        this.b = zzfahVar2;
        this.c = zzffuVar;
        this.d = str;
        this.f = executor;
    }

    public final zzfyx a(zzffh zzffhVar, zzfai zzfaiVar) {
        zzdch zzdchVar = zzffhVar.zza;
        this.e = zzdchVar;
        if (zzffhVar.zzc != null) {
            if (zzdchVar.zzf() != null) {
                zzffhVar.zzc.zzo().zzbL(zzffhVar.zza.zzf());
            }
            return zzfyo.zzi(zzffhVar.zzc);
        }
        zzdchVar.zzb().zzk(zzffhVar.zzb);
        return ((zzezx) this.a).zzb(zzfaiVar, null, zzffhVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfah
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdch zzd() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzfah
    public final /* bridge */ /* synthetic */ zzfyx zzc(zzfai zzfaiVar, zzfag zzfagVar, Object obj) {
        return zzf(zzfaiVar, zzfagVar, null);
    }

    public final synchronized zzfyx zzf(final zzfai zzfaiVar, final zzfag zzfagVar, zzdch zzdchVar) {
        zzdcg zzdcgVarZza = zzfagVar.zza(zzfaiVar.zzb);
        zzdcgVarZza.zza(new zzezo(this.d));
        final zzdch zzdchVar2 = (zzdch) zzdcgVarZza.zzh();
        zzdchVar2.zzg();
        zzdchVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzdchVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfdn zzfdnVarZzg = zzdchVar2.zzg();
            final dj6 dj6Var = new dj6(zzfagVar, zzfaiVar, zzfdnVarZzg.zzd, zzfdnVarZzg.zzf, this.f, zzfdnVarZzg.zzj, null);
            return zzfyo.zzn(zzfyf.zzv(((zzezt) this.b).zzb(zzfaiVar, zzfagVar, zzdchVar2)), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzezk
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) {
                    final zzezn zzeznVar = this.zza;
                    zzfai zzfaiVar2 = zzfaiVar;
                    dj6 dj6Var2 = dj6Var;
                    zzfag zzfagVar2 = zzfagVar;
                    zzdch zzdchVar3 = zzdchVar2;
                    zzezs zzezsVar = (zzezs) obj;
                    if (zzezsVar != null) {
                        zzeznVar.getClass();
                        dj6 dj6Var3 = new dj6(dj6Var2.a, dj6Var2.b, dj6Var2.c, dj6Var2.d, dj6Var2.e, dj6Var2.f, zzezsVar.zza);
                        zzffh zzffhVar = zzezsVar.zzc;
                        zzffu zzffuVar = zzeznVar.c;
                        if (zzffhVar != null) {
                            zzeznVar.e = null;
                            zzffuVar.zze(dj6Var3);
                            return zzeznVar.a(zzezsVar.zzc, zzfaiVar2);
                        }
                        zzfyx zzfyxVarZza = zzffuVar.zza(dj6Var3);
                        if (zzfyxVarZza != null) {
                            zzeznVar.e = null;
                            return zzfyo.zzn(zzfyxVarZza, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzezj
                                @Override // com.google.android.gms.internal.ads.zzfxv
                                public final zzfyx zza(Object obj2) throws zzeas {
                                    zzfft zzfftVar;
                                    zzezn zzeznVar2 = zzeznVar;
                                    zzffr zzffrVar = (zzffr) obj2;
                                    zzeznVar2.getClass();
                                    if (zzffrVar == null || zzffrVar.zza == null || (zzfftVar = zzffrVar.zzb) == null) {
                                        throw new zzeas(1, "Empty prefetch");
                                    }
                                    zzbfa zzbfaVarZza = zzbfg.zza();
                                    zzbey zzbeyVarZza = zzbez.zza();
                                    zzbeyVarZza.zzd(2);
                                    zzbeyVarZza.zzb(zzbfd.zzd());
                                    zzbfaVarZza.zza(zzbeyVarZza);
                                    zzffrVar.zza.zza.zzb().zzc().zzi((zzbfg) zzbfaVarZza.zzal());
                                    return zzeznVar2.a(zzffrVar.zza, ((dj6) zzfftVar).b);
                                }
                            }, zzeznVar.f);
                        }
                        zzffuVar.zze(dj6Var3);
                        zzfaiVar2 = new zzfai(zzfaiVar2.zzb, zzezsVar.zzb);
                    }
                    zzfyx zzfyxVarZzb = ((zzezx) zzeznVar.a).zzb(zzfaiVar2, zzfagVar2, zzdchVar3);
                    zzeznVar.e = zzdchVar3;
                    return zzfyxVarZzb;
                }
            }, this.f);
        }
        this.e = zzdchVar2;
        return ((zzezx) this.a).zzb(zzfaiVar, zzfagVar, zzdchVar2);
    }
}
