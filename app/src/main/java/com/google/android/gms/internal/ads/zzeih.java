package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.qh6;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeih extends zzcca implements zzdei {

    @GuardedBy("this")
    public zzccb w;

    @GuardedBy("this")
    public zzdeh x;

    @GuardedBy("this")
    public zzdkw y;

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zza(zzdeh zzdehVar) {
        this.x = zzdehVar;
    }

    public final synchronized void zzc(zzccb zzccbVar) {
        this.w = zzccbVar;
    }

    public final synchronized void zzd(zzdkw zzdkwVar) {
        this.y = zzdkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        zzccb zzccbVar = this.w;
        if (zzccbVar != null) {
            ((zzela) zzccbVar).x.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        zzccb zzccbVar = this.w;
        if (zzccbVar != null) {
            zzccbVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) {
        zzdeh zzdehVar = this.x;
        if (zzdehVar != null) {
            zzdehVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) {
        zzccb zzccbVar = this.w;
        if (zzccbVar != null) {
            ((zzela) zzccbVar).y.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        zzdeh zzdehVar = this.x;
        if (zzdehVar != null) {
            zzdehVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        zzccb zzccbVar = this.w;
        if (zzccbVar != null) {
            ((zzela) zzccbVar).w.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) {
        zzdkw zzdkwVar = this.y;
        if (zzdkwVar != null) {
            zzcgn.zzj("Fail to initialize adapter ".concat(String.valueOf(((qh6) zzdkwVar).c.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) {
        zzdkw zzdkwVar = this.y;
        if (zzdkwVar != null) {
            Executor executor = ((qh6) zzdkwVar).d.b;
            final zzfde zzfdeVar = ((qh6) zzdkwVar).a;
            final zzfcs zzfcsVar = ((qh6) zzdkwVar).b;
            final zzegn zzegnVar = ((qh6) zzdkwVar).c;
            final qh6 qh6Var = (qh6) zzdkwVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeky
                @Override // java.lang.Runnable
                public final void run() {
                    qh6 qh6Var2 = qh6Var;
                    zzfde zzfdeVar2 = zzfdeVar;
                    zzfcs zzfcsVar2 = zzfcsVar;
                    zzegn zzegnVar2 = zzegnVar;
                    zzelb zzelbVar = qh6Var2.d;
                    zzelb.a(zzfdeVar2, zzfcsVar2, zzegnVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzccc zzcccVar) {
        zzccb zzccbVar = this.w;
        if (zzccbVar != null) {
            ((zzela) zzccbVar).z.zza(zzcccVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) {
        zzccb zzccbVar = this.w;
        if (zzccbVar != null) {
            ((zzela) zzccbVar).y.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) {
        zzccb zzccbVar = this.w;
        if (zzccbVar != null) {
            ((zzela) zzccbVar).z.zzc();
        }
    }
}
