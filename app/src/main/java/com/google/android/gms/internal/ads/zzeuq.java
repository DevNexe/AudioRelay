package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeuq {
    public final Context a;
    public final Set b;
    public final Executor c;
    public final zzfjc d;
    public final zzdxo e;

    public zzeuq(Context context, Executor executor, Set set, zzfjc zzfjcVar, zzdxo zzdxoVar) {
        this.a = context;
        this.c = executor;
        this.b = set;
        this.d = zzfjcVar;
        this.e = zzdxoVar;
    }

    public final zzfyx zza(final Object obj) {
        zzfir zzfirVarZza = zzfiq.zza(this.a, 8);
        zzfirVarZza.zzf();
        Set<zzeun> set = this.b;
        final ArrayList arrayList = new ArrayList(set.size());
        for (final zzeun zzeunVar : set) {
            zzfyx zzfyxVarZzb = zzeunVar.zzb();
            zzfyxVarZzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuo
                @Override // java.lang.Runnable
                public final void run() {
                    zzeuq zzeuqVar = this.zza;
                    zzeun zzeunVar2 = zzeunVar;
                    zzeuqVar.getClass();
                    long jC = com.google.android.gms.ads.internal.zzt.zzB().c() - com.google.android.gms.ads.internal.zzt.zzB().c();
                    if (((Boolean) zzbkr.zza.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfsu.zzc(zzeunVar2.getClass().getCanonicalName()) + " = " + jC);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbM)).booleanValue()) {
                        zzdxn zzdxnVarZza = zzeuqVar.e.zza();
                        zzdxnVarZza.zzb("action", "lat_ms");
                        zzdxnVarZza.zzb("lat_grp", "sig_lat_grp");
                        zzdxnVarZza.zzb("lat_id", String.valueOf(zzeunVar2.zza()));
                        zzdxnVarZza.zzb("clat_ms", String.valueOf(jC));
                        zzdxnVarZza.zzh();
                    }
                }
            }, zzcha.zzf);
            arrayList.add(zzfyxVarZzb);
        }
        zzfyx zzfyxVarZza = zzfyo.zzc(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeup
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                Object obj2 = obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzeum zzeumVar = (zzeum) ((zzfyx) it.next()).get();
                    if (zzeumVar != null) {
                        zzeumVar.zzf(obj2);
                    }
                }
                return obj2;
            }
        }, this.c);
        if (zzfje.zza()) {
            zzfjb.zza(zzfyxVarZza, this.d, zzfirVarZza);
        }
        return zzfyxVarZza;
    }
}
