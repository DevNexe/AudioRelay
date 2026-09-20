package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzdnb;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzeol;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfyk;
import defpackage.di6;

/* JADX INFO: loaded from: classes3.dex */
public final class di6 implements zzfyk {
    public final /* synthetic */ zzeol A;
    public final /* synthetic */ zzeod w;
    public final /* synthetic */ zzfjc x;
    public final /* synthetic */ zzfir y;
    public final /* synthetic */ zzdnb z;

    public di6(zzeol zzeolVar, zzeod zzeodVar, zzfjc zzfjcVar, zzfir zzfirVar, zzdnb zzdnbVar) {
        this.A = zzeolVar;
        this.w = zzeodVar;
        this.x = zzfjcVar;
        this.y = zzfirVar;
        this.z = zzdnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        zzfjc zzfjcVar;
        zzdnb zzdnbVar = this.z;
        final zze zzeVarZza = zzdnbVar.zza().zza(th);
        zzdnbVar.zzb().zza(zzeVarZza);
        zzeol zzeolVar = this.A;
        zzeolVar.b.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoj
            @Override // java.lang.Runnable
            public final void run() {
                di6 di6Var = this.zza;
                di6Var.A.d.zza().zza(zzeVarZza);
            }
        });
        zzfeh.zzb(zzeVarZza.zza, th, "NativeAdLoader.onFailure");
        this.w.mo45zza();
        boolean zBooleanValue = ((Boolean) zzbkh.zzc.zze()).booleanValue();
        zzfir zzfirVar = this.y;
        if (!zBooleanValue || (zzfjcVar = this.x) == null) {
            zzfje zzfjeVar = zzeolVar.e;
            zzfirVar.zza(zzeVarZza);
            zzfirVar.zze(false);
            zzfjeVar.zzb(zzfirVar.zzj());
            return;
        }
        zzfjcVar.zzc(zzeVarZza);
        zzfirVar.zze(false);
        zzfjcVar.zza(zzfirVar);
        zzfjcVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo32zzb(Object obj) {
        zzfjc zzfjcVar;
        zzczc zzczcVar = (zzczc) obj;
        synchronized (this.A) {
            zzczcVar.zzn().zza(this.A.d.zzd());
            this.w.zzb(zzczcVar);
            this.A.b.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoi
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.A.d.zzb().zzn();
                }
            });
            if (!((Boolean) zzbkh.zzc.zze()).booleanValue() || (zzfjcVar = this.x) == null) {
                zzfje zzfjeVar = this.A.e;
                zzfir zzfirVar = this.y;
                zzfirVar.zzb(zzczcVar.zzp().zzb);
                zzfirVar.zzc(zzczcVar.zzl().zzg());
                zzfirVar.zze(true);
                zzfjeVar.zzb(zzfirVar.zzj());
            } else {
                zzfjcVar.zzf(zzczcVar.zzp().zzb);
                zzfjcVar.zze(zzczcVar.zzl().zzg());
                zzfir zzfirVar2 = this.y;
                zzfirVar2.zze(true);
                zzfjcVar.zza(zzfirVar2);
                zzfjcVar.zzg();
            }
        }
    }
}
