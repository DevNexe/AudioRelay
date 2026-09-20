package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaia {
    public final List a;
    public final zzaam[] b;

    public zzaia(List list) {
        this.a = list;
        this.b = new zzaam[list.size()];
    }

    public final void zza(long j, zzed zzedVar) {
        zzys.zza(j, zzedVar, this.b);
    }

    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        int i = 0;
        while (true) {
            zzaam[] zzaamVarArr = this.b;
            if (i >= zzaamVarArr.length) {
                return;
            }
            zzailVar.zzc();
            zzaam zzaamVarZzv = zzziVar.zzv(zzailVar.zza(), 3);
            zzaf zzafVar = (zzaf) this.a.get(i);
            String str = zzafVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdd.zze(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String strZzb = zzafVar.zzb;
            if (strZzb == null) {
                strZzb = zzailVar.zzb();
            }
            zzad zzadVar = new zzad();
            zzadVar.zzH(strZzb);
            zzadVar.zzS(str);
            zzadVar.zzU(zzafVar.zze);
            zzadVar.zzK(zzafVar.zzd);
            zzadVar.zzu(zzafVar.zzE);
            zzadVar.zzI(zzafVar.zzo);
            zzaamVarZzv.zzk(zzadVar.zzY());
            zzaamVarArr[i] = zzaamVarZzv;
            i++;
        }
    }
}
