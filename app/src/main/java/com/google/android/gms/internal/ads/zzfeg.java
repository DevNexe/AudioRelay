package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfeg {
    public static zzfeg d;
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzcj b;
    public final AtomicReference c = new AtomicReference();

    public zzfeg(Context context, com.google.android.gms.ads.internal.client.zzcj zzcjVar) {
        this.a = context;
        this.b = zzcjVar;
    }

    public static zzfeg zzd(Context context) {
        synchronized (zzfeg.class) {
            zzfeg zzfegVar = d;
            if (zzfegVar != null) {
                return zzfegVar;
            }
            Context applicationContext = context.getApplicationContext();
            long jLongValue = ((Long) zzbkq.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcj zzcjVarAsInterface = null;
            if (jLongValue > 0 && jLongValue <= 222508000) {
                try {
                    zzcjVarAsInterface = zzci.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    zzcgn.zzh("Failed to retrieve lite SDK info.", e);
                }
            }
            zzfeg zzfegVar2 = new zzfeg(applicationContext, zzcjVarAsInterface);
            d = zzfegVar2;
            return zzfegVar2;
        }
    }

    public final zzbvf zzb() {
        return (zzbvf) this.c.get();
    }

    public final zzcgt zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.zzt.zzq();
        boolean zZzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.a);
        zzcgt zzcgtVar = new zzcgt(ModuleDescriptor.MODULE_VERSION, i2, true, zZzA);
        if (!((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            return zzcgtVar;
        }
        zzeh liteSdkVersion = null;
        com.google.android.gms.ads.internal.client.zzcj zzcjVar = this.b;
        if (zzcjVar != null) {
            try {
                liteSdkVersion = zzcjVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return liteSdkVersion == null ? zzcgtVar : new zzcgt(ModuleDescriptor.MODULE_VERSION, liteSdkVersion.zza(), true, zZzA);
    }

    public final void zze(zzbvf zzbvfVar) {
        zzbvf adapterCreator;
        boolean zBooleanValue = ((Boolean) zzbkq.zza.zze()).booleanValue();
        AtomicReference atomicReference = this.c;
        if (!zBooleanValue) {
            zzfef.zza(atomicReference, null, zzbvfVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcj zzcjVar = this.b;
        if (zzcjVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcjVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        if (adapterCreator != null) {
            zzbvfVar = adapterCreator;
        }
        zzfef.zza(atomicReference, null, zzbvfVar);
    }
}
