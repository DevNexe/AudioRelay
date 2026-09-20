package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbuy {
    public static zzbuy b;
    public final AtomicBoolean a = new AtomicBoolean(false);

    public static zzbuy zza() {
        if (b == null) {
            b = new zzbuy();
        }
        return b;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbux
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                String str2 = str;
                zzbiy.zzc(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaf)).booleanValue());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzam)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzcoh) zzcgr.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzcgp() { // from class: com.google.android.gms.internal.ads.zzbuw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.zzcgp
                        public final Object zza(Object obj) {
                            return zzcog.zzb(obj);
                        }
                    })).zze(new ObjectWrapper(context2), new zzbuv(com.google.android.gms.internal.measurement.CQf.f(context2, "FA-Ads", "am", str2, bundle).b));
                } catch (RemoteException | zzcgq | NullPointerException e) {
                    zzcgn.zzl("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
