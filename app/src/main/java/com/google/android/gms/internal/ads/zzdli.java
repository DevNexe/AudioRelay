package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class zzdli {
    public final zzdmn a;
    public final zzcmn b;

    public zzdli(zzdmn zzdmnVar, zzcmn zzcmnVar) {
        this.a = zzdmnVar;
        this.b = zzcmnVar;
    }

    public static final zzdke zzh(zzfio zzfioVar) {
        return new zzdke(zzfioVar, zzcha.zzf);
    }

    public static final zzdke zzi(zzdms zzdmsVar) {
        return new zzdke(zzdmsVar, zzcha.zzf);
    }

    public final View zza() {
        zzcmn zzcmnVar = this.b;
        if (zzcmnVar == null) {
            return null;
        }
        return zzcmnVar.zzI();
    }

    public final View zzb() {
        zzcmn zzcmnVar = this.b;
        if (zzcmnVar != null) {
            return zzcmnVar.zzI();
        }
        return null;
    }

    public final zzcmn zzc() {
        return this.b;
    }

    public final zzdke zzd(Executor executor) {
        final zzcmn zzcmnVar = this.b;
        return new zzdke(new zzdhk() { // from class: com.google.android.gms.internal.ads.zzdlg
            @Override // com.google.android.gms.internal.ads.zzdhk
            public final void zza() {
                zzcmn zzcmnVar2 = zzcmnVar;
                if (zzcmnVar2.zzN() != null) {
                    zzcmnVar2.zzN().zzb();
                }
            }
        }, executor);
    }

    public final zzdmn zze() {
        return this.a;
    }

    public Set zzf(zzdby zzdbyVar) {
        return Collections.singleton(new zzdke(zzdbyVar, zzcha.zzf));
    }

    public Set zzg(zzdby zzdbyVar) {
        return Collections.singleton(new zzdke(zzdbyVar, zzcha.zzf));
    }
}
