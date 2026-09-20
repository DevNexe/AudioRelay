package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcyi extends zzcxa {
    public final zzbnr i;
    public final Runnable j;
    public final Executor k;

    public zzcyi(zzczb zzczbVar, zzbnr zzbnrVar, Runnable runnable, Executor executor) {
        super(zzczbVar);
        this.i = zzbnrVar;
        this.j = runnable;
        this.k = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzW() {
        final zzcyg zzcygVar = new zzcyg(new AtomicReference(this.j));
        this.k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyh
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable;
                zzcyi zzcyiVar = this.zza;
                Runnable runnable2 = zzcygVar;
                zzcyiVar.getClass();
                try {
                    if (zzcyiVar.i.zzb(new ObjectWrapper(runnable2)) || (runnable = (Runnable) ((zzcyg) runnable2).zza.getAndSet(null)) == null) {
                        return;
                    }
                    runnable.run();
                } catch (RemoteException unused) {
                    Runnable runnable3 = (Runnable) ((zzcyg) runnable2).zza.getAndSet(null);
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final com.google.android.gms.ads.internal.client.zzdk zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final zzfct zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final zzfct zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }
}
