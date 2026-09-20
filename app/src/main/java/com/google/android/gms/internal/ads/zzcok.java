package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.db6;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcok implements zzctr {

    @GuardedBy("AppComponent.class")
    @Nullable
    public static zzcok a;

    public static zzcok zza(Context context, @Nullable zzbvf zzbvfVar, int i) {
        zzcok zzcokVarZza;
        zzcpm zzcpmVar = new zzcpm();
        synchronized (zzcok.class) {
            zzcokVarZza = a;
            if (zzcokVarZza == null) {
                zzbiy.zzc(context);
                zzfeg zzfegVarZzd = zzfeg.zzd(context);
                zzcgt zzcgtVarZzc = zzfegVarZzd.zzc(ModuleDescriptor.MODULE_VERSION, false, i);
                zzfegVarZzd.zze(zzbvfVar);
                zzcqw zzcqwVar = new zzcqw(0);
                zzcol zzcolVar = new zzcol();
                zzcolVar.zzd(zzcgtVarZzc);
                zzcolVar.zzc(context);
                zzcqwVar.zzb(new zzcon(zzcolVar));
                zzcqwVar.zzc(new zzcsj(zzcpmVar, null));
                zzcokVarZza = zzcqwVar.zza();
                com.google.android.gms.ads.internal.zzt.zzp().zzr(context, zzcgtVarZzc);
                com.google.android.gms.ads.internal.zzt.zzc().zzi(context);
                com.google.android.gms.ads.internal.zzt.zzq().zzj(context);
                com.google.android.gms.ads.internal.zzt.zzq().zzi(context);
                com.google.android.gms.ads.internal.util.zzd.zza(context);
                com.google.android.gms.ads.internal.zzt.zzb().zzd(context);
                com.google.android.gms.ads.internal.zzt.zzw().zzb(context);
                zzcet.zzd(context);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfj)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzas)).booleanValue()) {
                        zzbel zzbelVar = new zzbel(new zzber(context));
                        zzeev zzeevVar = new zzeev(new zzeer(context), zzcokVarZza.zzz());
                        com.google.android.gms.ads.internal.zzt.zzq();
                        new zzefr(context, zzcgtVarZzc, zzbelVar, zzeevVar, UUID.randomUUID().toString(), zzcokVarZza.zzx()).zzb(com.google.android.gms.ads.internal.zzt.zzp().zzh().zzP());
                    }
                }
                a = zzcokVarZza;
            }
        }
        return zzcokVarZza;
    }

    public abstract db6 a(zzewr zzewrVar);

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzcsu zzb();

    public abstract zzcwc zzc();

    public abstract zzcwn zzd();

    public abstract zzcxw zze();

    public abstract zzdfn zzf();

    public abstract zzdme zzg();

    public abstract zzdna zzh();

    public abstract zzdue zzi();

    public abstract zzdyw zzj();

    public abstract zzeai zzk();

    public abstract zzegh zzl();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzm();

    public abstract zzg zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzaa zzo();

    @Override // com.google.android.gms.internal.ads.zzctr
    public final zzevf zzp(zzcba zzcbaVar, int i) {
        return a(new zzewr(zzcbaVar, i));
    }

    public abstract zzexq zzr();

    public abstract zzeze zzs();

    public abstract zzfax zzt();

    public abstract zzfcl zzu();

    public abstract zzfdz zzv();

    public abstract zzfej zzw();

    public abstract zzfhz zzx();

    public abstract zzfje zzy();

    public abstract zzfyy zzz();
}
