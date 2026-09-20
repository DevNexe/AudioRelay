package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.GM;
import defpackage.mh6;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzekc implements zzfxv {
    public final zzfhp a;
    public final zzdda b;
    public final zzfjq c;
    public final zzfju d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final zzczf g;
    public final zzejx h;
    public final zzegp i;
    public final Context j;
    public final zzfjc k;

    public zzekc(Context context, zzfhp zzfhpVar, zzejx zzejxVar, zzdda zzddaVar, zzfjq zzfjqVar, zzfju zzfjuVar, zzczf zzczfVar, zzfyy zzfyyVar, ScheduledExecutorService scheduledExecutorService, zzegp zzegpVar, zzfjc zzfjcVar) {
        this.j = context;
        this.a = zzfhpVar;
        this.h = zzejxVar;
        this.b = zzddaVar;
        this.c = zzfjqVar;
        this.d = zzfjuVar;
        this.g = zzczfVar;
        this.e = zzfyyVar;
        this.f = scheduledExecutorService;
        this.i = zzegpVar;
        this.k = zzfjcVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // com.google.android.gms.internal.ads.zzfxv
    public final /* synthetic */ zzfyx zza(Object obj) {
        String strZza;
        zzczf zzczfVar;
        int i;
        final zzfde zzfdeVar = (zzfde) obj;
        int i2 = zzfdeVar.zzb.zzb.zze;
        if (i2 == 0) {
            strZza = "No ad config.";
        } else if (i2 < 200 || i2 >= 300) {
            strZza = (i2 < 300 || i2 >= 400) ? GM.a("Received error HTTP response code: ", i2) : "No location header to follow redirect or too many redirects.";
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzez)).booleanValue()) {
            strZza = "No ad config.";
        } else {
            strZza = "No fill.";
        }
        zzfcv zzfcvVar = zzfdeVar.zzb.zzb;
        zzfcu zzfcuVar = zzfcvVar.zzi;
        if (zzfcuVar != null) {
            strZza = zzfcuVar.zza();
        }
        zzegp zzegpVar = this.i;
        zzegpVar.zzg(zzfcvVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhb)).booleanValue() && (i = zzfdeVar.zzb.zzb.zze) != 0 && (i < 200 || i >= 300)) {
            return zzfyo.zzh(new zzeka(3, strZza));
        }
        zzfhj zzfhjVar = zzfhj.RENDER_CONFIG_INIT;
        zzfyx zzfyxVarZzh = zzfyo.zzh(new zzeka(3, strZza));
        zzfhp zzfhpVar = this.a;
        zzfgu zzfguVarZza = zzfgz.zzc(zzfyxVarZzh, zzfhjVar, zzfhpVar).zza();
        Iterator it = zzfdeVar.zzb.zza.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            zzczfVar = this.g;
            if (!zHasNext) {
                break;
            }
            zzfcs zzfcsVar = (zzfcs) it.next();
            zzegpVar.zzd(zzfcsVar);
            Iterator it2 = zzfcsVar.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    zzegpVar.zze(zzfcsVar, 0L, zzfem.zzd(1, null, null));
                    break;
                }
                zzegk zzegkVarZza = zzczfVar.zza(zzfcsVar.zzb, (String) it2.next());
                if (zzegkVarZza != null && zzegkVarZza.zzb(zzfdeVar, zzfcsVar)) {
                    break;
                }
            }
        }
        this.b.zzj(new zzcup(zzfdeVar, this.d, this.c), this.e);
        int i3 = 0;
        for (final zzfcs zzfcsVar2 : zzfdeVar.zzb.zza) {
            for (String str : zzfcsVar2.zza) {
                final zzegk zzegkVarZza2 = zzczfVar.zza(zzfcsVar2.zzb, str);
                if (zzegkVarZza2 != null && zzegkVarZza2.zzb(zzfdeVar, zzfcsVar2)) {
                    zzfguVarZza = zzfhpVar.zzb(zzfhj.RENDER_CONFIG_WATERFALL, zzfguVarZza).zzh("render-config-" + i3 + "-" + str).zzc(Throwable.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzekb
                        @Override // com.google.android.gms.internal.ads.zzfxv
                        public final zzfyx zza(Object obj2) {
                            zzekc zzekcVar = this.zza;
                            zzfcs zzfcsVar3 = zzfcsVar2;
                            zzfde zzfdeVar2 = zzfdeVar;
                            zzegk zzegkVar = zzegkVarZza2;
                            zzfir zzfirVarZza = zzfiq.zza(zzekcVar.j, 12);
                            zzfirVarZza.zzc(zzfcsVar3.zzF);
                            zzfirVarZza.zzf();
                            zzfyx zzfyxVarZzo = zzfyo.zzo(zzegkVar.zza(zzfdeVar2, zzfcsVar3), zzfcsVar3.zzS, TimeUnit.MILLISECONDS, zzekcVar.f);
                            zzfjq zzfjqVar = zzekcVar.c;
                            zzejx zzejxVar = zzekcVar.h;
                            zzejxVar.getClass();
                            zzfcv zzfcvVar2 = zzfdeVar2.zzb.zzb;
                            long jC = zzejxVar.a.c();
                            String str2 = zzfcsVar3.zzx;
                            if (str2 != null) {
                                zzfyo.zzr(zzfyxVarZzo, new mh6(zzejxVar, jC, str2, zzfcsVar3, zzfcvVar2, zzfjqVar, zzfdeVar2), zzcha.zzf);
                            }
                            zzfjb.zza(zzfyxVarZzo, zzekcVar.k, zzfirVarZza);
                            return zzfyxVarZzo;
                        }
                    }).zza();
                    break;
                }
            }
            i3++;
        }
        return zzfguVarZza;
    }
}
