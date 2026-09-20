package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzber {
    public zzasa a;
    public boolean b;
    public final ExecutorService c;

    public zzber() {
        this.c = zzcgc.zzb;
    }

    public final void a(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdX)).booleanValue()) {
            try {
                this.a = (zzasa) zzcgr.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzcgp() { // from class: com.google.android.gms.internal.ads.zzben
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcgp
                    public final Object zza(Object obj) {
                        return zzarz.zzb(obj);
                    }
                });
                this.a.zze(new ObjectWrapper(context), "GMA_SDK");
                this.b = true;
            } catch (RemoteException | zzcgq | NullPointerException unused) {
                zzcgn.zze("Cannot dynamite load clearcut");
            }
        }
    }

    public zzber(final Context context) {
        ExecutorService executorService = zzcgc.zzb;
        this.c = executorService;
        zzbiy.zzc(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziA)).booleanValue()) {
            executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbem
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a(context);
                }
            });
        } else {
            a(context);
        }
    }
}
