package defpackage;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzcwi;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzexy;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzfem;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfyk;
import defpackage.xi6;

/* JADX INFO: loaded from: classes3.dex */
public final class xi6 implements zzfyk {
    public final /* synthetic */ zzexy A;
    public final /* synthetic */ zzeod w;
    public final /* synthetic */ zzfjc x;
    public final /* synthetic */ zzfir y;
    public final /* synthetic */ yi6 z;

    public xi6(zzexy zzexyVar, zzeod zzeodVar, zzfjc zzfjcVar, zzfir zzfirVar, yi6 yi6Var) {
        this.A = zzexyVar;
        this.w = zzeodVar;
        this.x = zzfjcVar;
        this.y = zzfirVar;
        this.z = yi6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        zzfjc zzfjcVar;
        zzcwi zzcwiVar = (zzcwi) this.A.e.zzd();
        final zze zzeVarZzb = zzcwiVar == null ? zzfem.zzb(th, null) : zzcwiVar.zzb().zza(th);
        synchronized (this.A) {
            try {
                zzexy zzexyVar = this.A;
                zzexyVar.j = null;
                if (zzcwiVar != null) {
                    zzcwiVar.zzc().zza(zzeVarZzb);
                    if (((Boolean) zzay.zzc().zzb(zzbiy.zzgU)).booleanValue()) {
                        this.A.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexu
                            @Override // java.lang.Runnable
                            public final void run() {
                                xi6 xi6Var = this.zza;
                                xi6Var.A.d.zza(zzeVarZzb);
                            }
                        });
                    }
                } else {
                    zzexyVar.d.zza(zzeVarZzb);
                    ((zzcwi) this.A.b(this.z).zzh()).zzb().zzc().zzd();
                }
                zzfeh.zzb(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
                this.w.mo45zza();
                if (!((Boolean) zzbkh.zzc.zze()).booleanValue() || (zzfjcVar = this.x) == null) {
                    zzfje zzfjeVar = this.A.h;
                    zzfir zzfirVar = this.y;
                    zzfirVar.zza(zzeVarZzb);
                    zzfirVar.zze(false);
                    zzfjeVar.zzb(zzfirVar.zzj());
                } else {
                    zzfjcVar.zzc(zzeVarZzb);
                    zzfir zzfirVar2 = this.y;
                    zzfirVar2.zze(false);
                    zzfjcVar.zza(zzfirVar2);
                    zzfjcVar.zzg();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo32zzb(Object obj) {
        zzfjc zzfjcVar;
        zzczc zzczcVar = (zzczc) obj;
        synchronized (this.A) {
            try {
                this.A.j = null;
                if (((Boolean) zzay.zzc().zzb(zzbiy.zzgU)).booleanValue()) {
                    zzczcVar.zzn().zzb(this.A.d);
                }
                this.w.zzb(zzczcVar);
                if (!((Boolean) zzbkh.zzc.zze()).booleanValue() || (zzfjcVar = this.x) == null) {
                    zzfje zzfjeVar = this.A.h;
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
