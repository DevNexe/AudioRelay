package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetu implements zzeun {
    public final String a;
    public final zzfyy b;
    public final ScheduledExecutorService c;
    public final Context d;
    public final zzfdn e;
    public final zzcok f;

    public zzetu(zzfyy zzfyyVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfdn zzfdnVar, zzcok zzcokVar) {
        this.b = zzfyyVar;
        this.c = scheduledExecutorService;
        this.a = str;
        this.d = context;
        this.e = zzfdnVar;
        this.f = zzcokVar;
    }

    public static /* synthetic */ zzfyx zzc(zzetu zzetuVar) {
        String strName = zzetuVar.a;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgg)).booleanValue()) {
            strName = AdFormat.UNKNOWN.name();
        }
        zzg zzgVarZzn = zzetuVar.f.zzn();
        zzdci zzdciVar = new zzdci();
        zzdciVar.zzc(zzetuVar.d);
        zzfdl zzfdlVar = new zzfdl();
        zzfdlVar.zzs("adUnitId");
        zzfdlVar.zzE(zzetuVar.e.zzd);
        zzfdlVar.zzr(new com.google.android.gms.ads.internal.client.zzq());
        zzdciVar.zzf(zzfdlVar.zzG());
        zzgVarZzn.zza(zzdciVar.zzg());
        com.google.android.gms.ads.nonagon.signalgeneration.zzac zzacVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzac();
        zzacVar.zza(strName);
        zzgVarZzn.zzb(zzacVar.zzb());
        new zzdii();
        zzfyf zzfyfVar = (zzfyf) zzfyo.zzo(zzfyf.zzv(zzgVarZzn.zzc().zzc()), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgh)).longValue(), TimeUnit.MILLISECONDS, zzetuVar.c);
        zzets zzetsVar = new zzfru() { // from class: com.google.android.gms.internal.ads.zzets
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzam zzamVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzam) obj;
                return zzamVar != null ? new zzetv(zzamVar.zza) : new zzetv(null);
            }
        };
        zzfyy zzfyyVar = zzetuVar.b;
        return zzfyo.zzf(zzfyo.zzm(zzfyfVar, zzetsVar, zzfyyVar), Exception.class, new zzfru() { // from class: com.google.android.gms.internal.ads.zzett
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                zzcgn.zzh("", (Exception) obj);
                return new zzetv(null);
            }
        }, zzfyyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgf)).booleanValue();
        zzfyy zzfyyVar = this.b;
        return (!zBooleanValue || "adUnitId".equals(this.e.zzf)) ? zzfyyVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzetv(null);
            }
        }) : zzfyo.zzl(new zzfxu() { // from class: com.google.android.gms.internal.ads.zzetr
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final zzfyx zza() {
                return zzetu.zzc(this.zza);
            }
        }, zzfyyVar);
    }
}
