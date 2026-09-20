package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcxa;
import com.google.android.gms.internal.ads.zzcxx;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzeno;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzezc;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfyk;
import defpackage.cj6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class cj6 implements zzfyk {
    public final /* synthetic */ zzezc A;
    public final /* synthetic */ zzeod w;
    public final /* synthetic */ zzfjc x;
    public final /* synthetic */ zzfir y;
    public final /* synthetic */ zzcxx z;

    public cj6(zzezc zzezcVar, zzeod zzeodVar, zzfjc zzfjcVar, zzfir zzfirVar, zzcxx zzcxxVar) {
        this.A = zzezcVar;
        this.w = zzeodVar;
        this.x = zzfjcVar;
        this.y = zzfirVar;
        this.z = zzcxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        zzfjc zzfjcVar;
        final zze zzeVarZza = this.z.zzd().zza(th);
        synchronized (this.A) {
            try {
                this.A.l = null;
                this.z.zzf().zza(zzeVarZza);
                if (((Boolean) zzay.zzc().zzb(zzbiy.zzgT)).booleanValue()) {
                    this.A.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeza
                        @Override // java.lang.Runnable
                        public final void run() {
                            cj6 cj6Var = this.zza;
                            cj6Var.A.d.zza(zzeVarZza);
                        }
                    });
                }
                zzezc zzezcVar = this.A;
                zzezcVar.h.zzd(zzezcVar.j.zzc());
                zzfeh.zzb(zzeVarZza.zza, th, "BannerAdLoader.onFailure");
                this.w.mo45zza();
                if (!((Boolean) zzbkh.zzc.zze()).booleanValue() || (zzfjcVar = this.x) == null) {
                    zzfje zzfjeVar = this.A.i;
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
        zzcxa zzcxaVar = (zzcxa) obj;
        synchronized (this.A) {
            zzezc zzezcVar = this.A;
            zzezcVar.l = null;
            zzezcVar.f.removeAllViews();
            if (zzcxaVar.zzc() != null) {
                ViewParent parent = zzcxaVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    zzcgn.zzj("Banner view provided from " + (zzcxaVar.zzl() != null ? zzcxaVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcxaVar.zzc());
                }
            }
            zzbiq zzbiqVar = zzbiy.zzgT;
            if (((Boolean) zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
                zzdhc zzdhcVarZzn = zzcxaVar.zzn();
                zzdhcVarZzn.zza(this.A.d);
                zzdhcVarZzn.zzc(this.A.e);
            }
            this.A.f.addView(zzcxaVar.zzc());
            this.w.zzb(zzcxaVar);
            if (((Boolean) zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
                zzezc zzezcVar2 = this.A;
                Executor executor = zzezcVar2.b;
                final zzeno zzenoVar = zzezcVar2.d;
                zzenoVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzenoVar.zzn();
                    }
                });
            }
            this.A.h.zzd(zzcxaVar.zza());
            if (!((Boolean) zzbkh.zzc.zze()).booleanValue() || (zzfjcVar = this.x) == null) {
                zzfje zzfjeVar = this.A.i;
                zzfir zzfirVar = this.y;
                zzfirVar.zzb(zzcxaVar.zzp().zzb);
                zzfirVar.zzc(zzcxaVar.zzl().zzg());
                zzfirVar.zze(true);
                zzfjeVar.zzb(zzfirVar.zzj());
            } else {
                zzfjcVar.zzf(zzcxaVar.zzp().zzb);
                zzfjcVar.zze(zzcxaVar.zzl().zzg());
                zzfir zzfirVar2 = this.y;
                zzfirVar2.zze(true);
                zzfjcVar.zza(zzfirVar2);
                zzfjcVar.zzg();
            }
        }
    }
}
