package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.HB;
import defpackage.da7;
import defpackage.w05;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqf implements zzeun {
    public final zzcfw a;
    public final da7 b;
    public final ScheduledExecutorService c;
    public final zzfyy d;
    public final Context e;

    public zzeqf(Context context, zzcfw zzcfwVar, ScheduledExecutorService scheduledExecutorService, zzfyy zzfyyVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzco)).booleanValue()) {
            this.b = new da7(context);
        }
        this.e = context;
        this.a = zzcfwVar;
        this.c = scheduledExecutorService;
        this.d = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzck)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcp)).booleanValue()) {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcl)).booleanValue();
                da7 da7Var = this.b;
                if (!zBooleanValue) {
                    return zzfyo.zzm(zzfpk.zza(da7Var.a()), new zzfru() { // from class: com.google.android.gms.internal.ads.zzeqc
                        @Override // com.google.android.gms.internal.ads.zzfru
                        public final Object apply(Object obj) {
                            HB hb = (HB) obj;
                            return new zzeqg(hb.a, hb.b);
                        }
                    }, zzcha.zzf);
                }
                w05<HB> w05VarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzco)).booleanValue() ? zzfep.zza(this.e) : da7Var.a();
                if (w05VarZza == null) {
                    return zzfyo.zzi(new zzeqg(null, -1));
                }
                zzfyx zzfyxVarZzn = zzfyo.zzn(zzfpk.zza(w05VarZza), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzeqd
                    @Override // com.google.android.gms.internal.ads.zzfxv
                    public final zzfyx zza(Object obj) {
                        HB hb = (HB) obj;
                        return hb == null ? zzfyo.zzi(new zzeqg(null, -1)) : zzfyo.zzi(new zzeqg(hb.a, hb.b));
                    }
                }, zzcha.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcm)).booleanValue()) {
                    zzfyxVarZzn = zzfyo.zzo(zzfyxVarZzn, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcn)).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return zzfyo.zzf(zzfyxVarZzn, Exception.class, new zzfru() { // from class: com.google.android.gms.internal.ads.zzeqe
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj) {
                        this.zza.a.zzt((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeqg(null, -1);
                    }
                }, this.d);
            }
        }
        return zzfyo.zzi(new zzeqg(null, -1));
    }
}
