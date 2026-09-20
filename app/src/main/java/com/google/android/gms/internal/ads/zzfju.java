package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfju {
    public final Context a;
    public final Executor b;
    public final zzcgs c;
    public final zzfje d;

    public zzfju(Context context, zzfyy zzfyyVar, zzcgs zzcgsVar, zzfje zzfjeVar) {
        this.a = context;
        this.b = zzfyyVar;
        this.c = zzcgsVar;
        this.d = zzfjeVar;
    }

    public final void zzc(final String str, final zzfjc zzfjcVar) {
        boolean zZza = zzfje.zza();
        Executor executor = this.b;
        if (zZza && ((Boolean) zzbkh.zzd.zze()).booleanValue()) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjt
                @Override // java.lang.Runnable
                public final void run() {
                    zzfju zzfjuVar = this.zza;
                    String str2 = str;
                    zzfjc zzfjcVar2 = zzfjcVar;
                    zzfir zzfirVarZza = zzfiq.zza(zzfjuVar.a, 14);
                    zzfirVarZza.zzf();
                    zzfirVarZza.zze(zzfjuVar.c.zza(str2));
                    if (zzfjcVar2 == null) {
                        zzfjuVar.d.zzb(zzfirVarZza.zzj());
                    } else {
                        zzfjcVar2.zza(zzfirVarZza);
                        zzfjcVar2.zzg();
                    }
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjs
                @Override // java.lang.Runnable
                public final void run() {
                    zzfju zzfjuVar = this.zza;
                    zzfjuVar.c.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
