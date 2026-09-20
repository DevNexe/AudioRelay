package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejy {
    public final zzfec a;
    public final zzdvg b;
    public final zzdxo c;
    public final zzfhz d;

    public zzejy(zzfec zzfecVar, zzdvg zzdvgVar, zzdxo zzdxoVar, zzfhz zzfhzVar) {
        this.a = zzfecVar;
        this.b = zzdvgVar;
        this.c = zzdxoVar;
        this.d = zzfhzVar;
    }

    public final void zza(zzfcv zzfcvVar, zzfcs zzfcsVar, int i, @Nullable zzego zzegoVar, long j) {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue();
        zzfec zzfecVar = this.a;
        zzdvg zzdvgVar = this.b;
        if (zBooleanValue) {
            zzfhy zzfhyVarZzb = zzfhy.zzb("adapter_status");
            zzfhyVarZzb.zzg(zzfcvVar);
            zzfhyVarZzb.zzf(zzfcsVar);
            zzfhyVarZzb.zza("adapter_l", String.valueOf(j));
            zzfhyVarZzb.zza("sc", Integer.toString(i));
            if (zzegoVar != null) {
                zzfhyVarZzb.zza("arec", Integer.toString(zzegoVar.zzb().zza));
                String strZza = zzfecVar.zza(zzegoVar.getMessage());
                if (strZza != null) {
                    zzfhyVarZzb.zza("areec", strZza);
                }
            }
            zzdvf zzdvfVarZzb = zzdvgVar.zzb(zzfcsVar.zzu);
            if (zzdvfVarZzb != null) {
                zzfhyVarZzb.zza("ancn", zzdvfVarZzb.zza);
                zzbxl zzbxlVar = zzdvfVarZzb.zzb;
                if (zzbxlVar != null) {
                    zzfhyVarZzb.zza("adapter_v", zzbxlVar.toString());
                }
                zzbxl zzbxlVar2 = zzdvfVarZzb.zzc;
                if (zzbxlVar2 != null) {
                    zzfhyVarZzb.zza("adapter_sv", zzbxlVar2.toString());
                }
            }
            this.d.zzb(zzfhyVarZzb);
            return;
        }
        zzdxn zzdxnVarZza = this.c.zza();
        zzdxnVarZza.zze(zzfcvVar);
        zzdxnVarZza.zzd(zzfcsVar);
        zzdxnVarZza.zzb("action", "adapter_status");
        zzdxnVarZza.zzb("adapter_l", String.valueOf(j));
        zzdxnVarZza.zzb("sc", Integer.toString(i));
        if (zzegoVar != null) {
            zzdxnVarZza.zzb("arec", Integer.toString(zzegoVar.zzb().zza));
            String strZza2 = zzfecVar.zza(zzegoVar.getMessage());
            if (strZza2 != null) {
                zzdxnVarZza.zzb("areec", strZza2);
            }
        }
        zzdvf zzdvfVarZzb2 = zzdvgVar.zzb(zzfcsVar.zzu);
        if (zzdvfVarZzb2 != null) {
            zzdxnVarZza.zzb("ancn", zzdvfVarZzb2.zza);
            zzbxl zzbxlVar3 = zzdvfVarZzb2.zzb;
            if (zzbxlVar3 != null) {
                zzdxnVarZza.zzb("adapter_v", zzbxlVar3.toString());
            }
            zzbxl zzbxlVar4 = zzdvfVarZzb2.zzc;
            if (zzbxlVar4 != null) {
                zzdxnVarZza.zzb("adapter_sv", zzbxlVar4.toString());
            }
        }
        zzdxnVarZza.zzg();
    }
}
