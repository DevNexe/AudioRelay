package com.google.android.gms.internal.ads;

import android.os.Binder;
import defpackage.rg6;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzede {
    public final zzfyy a;
    public final zzecl b;
    public final zzgul c;

    public zzede(zzfyy zzfyyVar, zzecl zzeclVar, zzgul zzgulVar) {
        this.a = zzfyyVar;
        this.b = zzeclVar;
        this.c = zzgulVar;
    }

    public final zzfyx a(final zzcba zzcbaVar, rg6 rg6Var, final rg6 rg6Var2, final zzfxv zzfxvVar) {
        String str = zzcbaVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzq();
        boolean zZzy = com.google.android.gms.ads.internal.util.zzs.zzy(str);
        zzfyy zzfyyVar = this.a;
        return zzfyo.zzg(zzfyo.zzn(zzfyf.zzv(zZzy ? zzfyo.zzh(new zzecu(1)) : zzfyo.zzg(rg6Var.zza(zzcbaVar), ExecutionException.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzecv
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzfyo.zzh(((ExecutionException) obj).getCause());
            }
        }, zzfyyVar)), zzfxvVar, zzfyyVar), zzecu.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzedc
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzede zzedeVar = this.zza;
                rg6 rg6Var3 = rg6Var2;
                zzcba zzcbaVar2 = zzcbaVar;
                zzfxv zzfxvVar2 = zzfxvVar;
                zzedeVar.getClass();
                return zzfyo.zzn(rg6Var3.zza(zzcbaVar2), zzfxvVar2, zzedeVar.a);
            }
        }, zzfyyVar);
    }

    public final zzfyx zza(final zzcba zzcbaVar) {
        zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzecz
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzcba zzcbaVar2 = zzcbaVar;
                zzcbaVar2.zzj = new String(zzfwx.zza((InputStream) obj), zzfrs.zzc);
                return zzfyo.zzi(zzcbaVar2);
            }
        };
        final zzecl zzeclVar = this.b;
        return a(zzcbaVar, new rg6() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // defpackage.rg6
            public final zzfyx zza(zzcba zzcbaVar2) {
                return zzeclVar.zzb(zzcbaVar2);
            }
        }, new rg6() { // from class: com.google.android.gms.internal.ads.zzedb
            @Override // defpackage.rg6
            public final zzfyx zza(zzcba zzcbaVar2) {
                return ((zzedv) this.zza.c.zzb()).zzb(zzcbaVar2, Binder.getCallingUid());
            }
        }, zzfxvVar);
    }

    public final zzfyx zzf(zzcba zzcbaVar) {
        if (zzaqe.zzg(zzcbaVar.zzj)) {
            return zzfyo.zzh(new zzeas(2, "Pool key missing from removeUrl call."));
        }
        return a(zzcbaVar, new rg6() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // defpackage.rg6
            public final zzfyx zza(zzcba zzcbaVar2) {
                zzede zzedeVar = this.zza;
                zzedeVar.getClass();
                return zzedeVar.b.zzc(((Boolean) zzbku.zzd.zze()).booleanValue() ? zzcbaVar2.zzh : zzcbaVar2.zzj);
            }
        }, new rg6() { // from class: com.google.android.gms.internal.ads.zzecy
            @Override // defpackage.rg6
            public final zzfyx zza(zzcba zzcbaVar2) {
                return ((zzedv) this.zza.c.zzb()).zzi(((Boolean) zzbku.zzd.zze()).booleanValue() ? zzcbaVar2.zzh : zzcbaVar2.zzj);
            }
        }, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzecw
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzfyo.zzi(null);
            }
        });
    }
}
