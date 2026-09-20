package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzduf;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzfbv;
import com.google.android.gms.internal.ads.zzfcf;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzfem;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfyk;
import defpackage.uj6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class uj6 implements zzfyk {
    public final /* synthetic */ zzfcf A;
    public final /* synthetic */ zzeod w;
    public final /* synthetic */ zzfjc x;
    public final /* synthetic */ zzfir y;
    public final /* synthetic */ vj6 z;

    public uj6(zzfcf zzfcfVar, zzeod zzeodVar, zzfjc zzfjcVar, zzfir zzfirVar, vj6 vj6Var) {
        this.A = zzfcfVar;
        this.w = zzeodVar;
        this.x = zzfjcVar;
        this.y = zzfirVar;
        this.z = vj6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        zzfjc zzfjcVar;
        zzduf zzdufVar = (zzduf) this.A.e.zzd();
        final zze zzeVarZzb = zzdufVar == null ? zzfem.zzb(th, null) : zzdufVar.zzb().zza(th);
        synchronized (this.A) {
            try {
                if (zzdufVar != null) {
                    zzdufVar.zza().zza(zzeVarZzb);
                    this.A.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcb
                        @Override // java.lang.Runnable
                        public final void run() {
                            uj6 uj6Var = this.zza;
                            uj6Var.A.d.zza(zzeVarZzb);
                        }
                    });
                } else {
                    this.A.d.zza(zzeVarZzb);
                    this.A.a(this.z).zzh().zzb().zzc().zzd();
                }
                zzfeh.zzb(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.w.mo45zza();
                if (!((Boolean) zzbkh.zzc.zze()).booleanValue() || (zzfjcVar = this.x) == null) {
                    zzfje zzfjeVar = this.A.g;
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
        zzdua zzduaVar = (zzdua) obj;
        synchronized (this.A) {
            zzduaVar.zzn().zzd(this.A.d);
            this.w.zzb(zzduaVar);
            zzfcf zzfcfVar = this.A;
            Executor executor = zzfcfVar.b;
            final zzfbv zzfbvVar = zzfcfVar.d;
            zzfbvVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfca
                @Override // java.lang.Runnable
                public final void run() {
                    zzfbvVar.zzn();
                }
            });
            this.A.d.zzv();
            if (!((Boolean) zzbkh.zzc.zze()).booleanValue() || (zzfjcVar = this.x) == null) {
                zzfje zzfjeVar = this.A.g;
                zzfir zzfirVar = this.y;
                zzfirVar.zzb(zzduaVar.zzp().zzb);
                zzfirVar.zzc(zzduaVar.zzl().zzg());
                zzfirVar.zze(true);
                zzfjeVar.zzb(zzfirVar.zzj());
            } else {
                zzfjcVar.zzf(zzduaVar.zzp().zzb);
                zzfjcVar.zze(zzduaVar.zzl().zzg());
                zzfir zzfirVar2 = this.y;
                zzfirVar2.zze(true);
                zzfjcVar.zza(zzfirVar2);
                zzfjcVar.zzg();
            }
        }
    }
}
