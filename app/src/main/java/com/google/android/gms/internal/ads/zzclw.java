package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzclw {
    public final /* synthetic */ zzcma zza;

    public /* synthetic */ zzclw(zzcma zzcmaVar) {
        this.zza = zzcmaVar;
    }

    public final zzjy[] zza(Handler handler, zzya zzyaVar, zznq zznqVar, zzug zzugVar, zzrg zzrgVar) {
        zzcma zzcmaVar = this.zza;
        Context context = zzcmaVar.y;
        zzqq zzqqVar = zzqq.zzb;
        zznb zznbVar = zznb.zza;
        zzne[] zzneVarArr = new zzne[0];
        zzog zzogVar = new zzog();
        if (zznbVar == null && zznbVar == null) {
            throw new NullPointerException("Both parameters are null");
        }
        zzogVar.zzb(zznbVar);
        zzogVar.zzc(zzneVarArr);
        zzos zzosVarZzd = zzogVar.zzd();
        zzqi zzqiVar = zzqi.zza;
        return new zzjy[]{new zzoy(context, zzqiVar, zzqqVar, false, handler, zznqVar, zzosVarZzd), new zzxd(zzcmaVar.y, zzqiVar, zzqqVar, 0L, false, handler, zzyaVar, -1, 30.0f)};
    }
}
