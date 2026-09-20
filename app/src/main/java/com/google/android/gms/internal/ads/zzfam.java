package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.od6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfam implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzfam(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfah zzb() {
        Context context = (Context) this.a.zzb();
        zzfeu zzfeuVar = (zzfeu) this.b.zzb();
        zzffm zzffmVar = (zzffm) this.c.zzb();
        zzcfq zzcfqVarZzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfr)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh() : com.google.android.gms.ads.internal.zzt.zzp().zzh().zzi();
        boolean z = false;
        if (zzcfqVarZzh != null && zzcfqVarZzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzft)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfq)).booleanValue() || z) {
                zzffl zzfflVarZza = zzffmVar.zza(zzffc.Rewarded, context, zzfeuVar, new od6(new zzezi(), 5));
                zzezx zzezxVar = new zzezx(new zzezw());
                zzfey zzfeyVar = zzfflVarZza.zza;
                zzfyy zzfyyVar = zzcha.zza;
                return new zzezn(zzezxVar, new zzezt(zzfeyVar, zzfyyVar), zzfflVarZza.zzb, zzfflVarZza.zza.zza().zzf, zzfyyVar);
            }
        }
        return new zzezw();
    }
}
