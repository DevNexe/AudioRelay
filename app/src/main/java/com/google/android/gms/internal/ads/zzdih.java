package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public class zzdih {

    @GuardedBy("this")
    public final HashMap w = new HashMap();

    public zzdih(Set set) {
        zzm(set);
    }

    public final synchronized void a(final zzdig zzdigVar) {
        for (Map.Entry entry : this.w.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdif
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdigVar.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzp().zzs(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    public final synchronized void zzg(zzdke zzdkeVar) {
        zzj(zzdkeVar.zza, zzdkeVar.zzb);
    }

    public final synchronized void zzj(Object obj, Executor executor) {
        this.w.put(obj, executor);
    }

    public final synchronized void zzm(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzg((zzdke) it.next());
        }
    }
}
