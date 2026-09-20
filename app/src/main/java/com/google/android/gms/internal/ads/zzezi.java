package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzezi implements zzfah {
    public zzdch a;
    public final Executor b = zzfze.zzb();

    public final zzdch zza() {
        return this.a;
    }

    public final zzfyx zzb(zzfai zzfaiVar, zzfag zzfagVar, zzdch zzdchVar) {
        zzdcg zzdcgVarZza = zzfagVar.zza(zzfaiVar.zzb);
        zzdcgVarZza.zzb(new zzfan(true));
        zzdch zzdchVar2 = (zzdch) zzdcgVarZza.zzh();
        this.a = zzdchVar2;
        final zzdaf zzdafVarZzb = zzdchVar2.zzb();
        final zzffh zzffhVar = new zzffh();
        zzfyf zzfyfVarZzv = zzfyf.zzv(zzdafVarZzb.zzi());
        zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzezg
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzffh zzffhVar2 = zzffhVar;
                zzdaf zzdafVar = zzdafVarZzb;
                zzfde zzfdeVar = (zzfde) obj;
                zzffhVar2.zzb = zzfdeVar;
                Iterator it = zzfdeVar.zzb.zza.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfcs) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzfyo.zzi(null);
                        }
                        z = true;
                    }
                }
                if (z) {
                    return zzdafVar.zzh(zzfyo.zzi(zzfdeVar));
                }
                return zzfyo.zzi(null);
            }
        };
        Executor executor = this.b;
        return zzfyo.zzm(zzfyo.zzn(zzfyfVarZzv, zzfxvVar, executor), new zzfru() { // from class: com.google.android.gms.internal.ads.zzezh
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                zzffh zzffhVar2 = zzffhVar;
                zzffhVar2.zzc = (zzczc) obj;
                return zzffhVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfah
    public final /* bridge */ /* synthetic */ zzfyx zzc(zzfai zzfaiVar, zzfag zzfagVar, Object obj) {
        return zzb(zzfaiVar, zzfagVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfah
    public final /* synthetic */ Object zzd() {
        return this.a;
    }
}
