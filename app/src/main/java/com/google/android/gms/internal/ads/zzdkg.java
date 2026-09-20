package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdkg extends zzdih implements zzbbm {

    @GuardedBy("this")
    public final WeakHashMap x;
    public final Context y;
    public final zzfcs z;

    public zzdkg(Context context, Set set, zzfcs zzfcsVar) {
        super(set);
        this.x = new WeakHashMap(1);
        this.y = context;
        this.z = zzfcsVar;
    }

    public final synchronized void zza(View view) {
        zzbbn zzbbnVar = (zzbbn) this.x.get(view);
        if (zzbbnVar == null) {
            zzbbnVar = new zzbbn(this.y, view);
            zzbbnVar.zzc(this);
            this.x.put(view, zzbbnVar);
        }
        if (this.z.zzY) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbh)).booleanValue()) {
                zzbbnVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbg)).longValue());
                return;
            }
        }
        zzbbnVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.x.containsKey(view)) {
            ((zzbbn) this.x.get(view)).zze(this);
            this.x.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbm
    public final synchronized void zzc(final zzbbl zzbblVar) {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzbbm) obj).zzc(zzbblVar);
            }
        });
    }
}
