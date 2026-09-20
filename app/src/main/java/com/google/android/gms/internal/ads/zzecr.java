package com.google.android.gms.internal.ads;

import defpackage.sd6;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecr implements zzect {
    public final Map a;
    public final zzfyy b;
    public final zzdfr c;

    public zzecr(Map map, zzfyy zzfyyVar, zzdfr zzdfrVar) {
        this.a = map;
        this.b = zzfyyVar;
        this.c = zzdfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzect
    public final zzfyx zzb(final zzcba zzcbaVar) {
        this.c.zzbE(zzcbaVar);
        zzfyx zzfyxVarZzh = zzfyo.zzh(new zzeas(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgW)).split(",")) {
            final zzgve zzgveVar = (zzgve) this.a.get(str.trim());
            if (zzgveVar != null) {
                zzfyxVarZzh = zzfyo.zzg(zzfyxVarZzh, zzeas.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzecp
                    @Override // com.google.android.gms.internal.ads.zzfxv
                    public final zzfyx zza(Object obj) {
                        zzgve zzgveVar2 = zzgveVar;
                        return ((zzect) zzgveVar2.zzb()).zzb(zzcbaVar);
                    }
                }, this.b);
            }
        }
        zzfyo.zzr(zzfyxVarZzh, new sd6(this, 8), zzcha.zzf);
        return zzfyxVarZzh;
    }
}
