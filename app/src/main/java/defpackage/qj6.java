package defpackage;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdle;
import com.google.android.gms.internal.ads.zzdmf;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzfav;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfyk;
import defpackage.qj6;

/* JADX INFO: loaded from: classes3.dex */
public final class qj6 implements zzfyk {
    public final /* synthetic */ zzfav A;
    public final /* synthetic */ zzeod w;
    public final /* synthetic */ zzfjc x;
    public final /* synthetic */ zzfir y;
    public final /* synthetic */ zzdmf z;

    public qj6(zzfav zzfavVar, zzeod zzeodVar, zzfjc zzfjcVar, zzfir zzfirVar, zzdmf zzdmfVar) {
        this.A = zzfavVar;
        this.w = zzeodVar;
        this.x = zzfjcVar;
        this.y = zzfirVar;
        this.z = zzdmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        zzfjc zzfjcVar;
        final zze zzeVarZza = this.z.zza().zza(th);
        synchronized (this.A) {
            try {
                this.A.i = null;
                this.z.zzb().zza(zzeVarZza);
                if (((Boolean) zzay.zzc().zzb(zzbiy.zzgV)).booleanValue()) {
                    this.A.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfas
                        @Override // java.lang.Runnable
                        public final void run() {
                            qj6 qj6Var = this.zza;
                            qj6Var.A.d.zza(zzeVarZza);
                        }
                    });
                    this.A.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfat
                        @Override // java.lang.Runnable
                        public final void run() {
                            qj6 qj6Var = this.zza;
                            qj6Var.A.e.zza(zzeVarZza);
                        }
                    });
                }
                zzfeh.zzb(zzeVarZza.zza, th, "InterstitialAdLoader.onFailure");
                this.w.mo45zza();
                if (!((Boolean) zzbkh.zzc.zze()).booleanValue() || (zzfjcVar = this.x) == null) {
                    zzfje zzfjeVar = this.A.g;
                    zzfir zzfirVar = this.y;
                    zzfirVar.zza(zzeVarZza);
                    zzfirVar.zze(false);
                    zzfjeVar.zzb(zzfirVar.zzj());
                } else {
                    zzfjcVar.zzc(zzeVarZza);
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
        zzdle zzdleVar = (zzdle) obj;
        synchronized (this.A) {
            try {
                this.A.i = null;
                zzbiq zzbiqVar = zzbiy.zzgV;
                if (((Boolean) zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
                    zzdhc zzdhcVarZzn = zzdleVar.zzn();
                    zzdhcVarZzn.zza(this.A.d);
                    zzdhcVarZzn.zzd(this.A.e);
                }
                this.w.zzb(zzdleVar);
                if (((Boolean) zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
                    this.A.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaq
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.A.d.zzn();
                        }
                    });
                    this.A.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfar
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.A.e.zzn();
                        }
                    });
                }
                if (!((Boolean) zzbkh.zzc.zze()).booleanValue() || (zzfjcVar = this.x) == null) {
                    zzfje zzfjeVar = this.A.g;
                    zzfir zzfirVar = this.y;
                    zzfirVar.zzb(zzdleVar.zzp().zzb);
                    zzfirVar.zzc(zzdleVar.zzl().zzg());
                    zzfirVar.zze(true);
                    zzfjeVar.zzb(zzfirVar.zzj());
                } else {
                    zzfjcVar.zzf(zzdleVar.zzp().zzb);
                    zzfjcVar.zze(zzdleVar.zzl().zzg());
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
