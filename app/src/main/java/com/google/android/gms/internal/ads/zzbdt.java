package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import defpackage.pz5;
import defpackage.s36;
import defpackage.t36;
import defpackage.u36;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdt {
    public ScheduledFuture a = null;
    public final pz5 b = new pz5(this, 3);
    public final Object c = new Object();

    @GuardedBy("lock")
    public zzbdw d;

    @GuardedBy("lock")
    public Context e;

    @GuardedBy("lock")
    public zzbdz f;

    public static /* bridge */ /* synthetic */ void a(zzbdt zzbdtVar) {
        synchronized (zzbdtVar.c) {
            zzbdw zzbdwVar = zzbdtVar.d;
            if (zzbdwVar == null) {
                return;
            }
            if (zzbdwVar.isConnected() || zzbdtVar.d.isConnecting()) {
                zzbdtVar.d.disconnect();
            }
            zzbdtVar.d = null;
            zzbdtVar.f = null;
            Binder.flushPendingCommands();
        }
    }

    public final void b() {
        zzbdw zzbdwVar;
        synchronized (this.c) {
            try {
                if (this.e != null && this.d == null) {
                    t36 t36Var = new t36(this);
                    u36 u36Var = new u36(this);
                    synchronized (this) {
                        zzbdwVar = new zzbdw(this.e, com.google.android.gms.ads.internal.zzt.zzu().zzb(), t36Var, u36Var);
                    }
                    this.d = zzbdwVar;
                    zzbdwVar.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long zza(zzbdx zzbdxVar) {
        synchronized (this.c) {
            if (this.f == null) {
                return -2L;
            }
            if (this.d.zzp()) {
                try {
                    return this.f.zze(zzbdxVar);
                } catch (RemoteException e) {
                    zzcgn.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final zzbdu zzb(zzbdx zzbdxVar) {
        synchronized (this.c) {
            if (this.f == null) {
                return new zzbdu();
            }
            try {
                if (this.d.zzp()) {
                    return this.f.zzg(zzbdxVar);
                }
                return this.f.zzf(zzbdxVar);
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to call into cache service.", e);
                return new zzbdu();
            }
        }
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.c) {
            if (this.e != null) {
                return;
            }
            this.e = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdm)).booleanValue()) {
                b();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdl)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzb().zzc(new s36(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdn)).booleanValue()) {
            synchronized (this.c) {
                b();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdp)).booleanValue()) {
                    ScheduledFuture scheduledFuture = this.a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.a = zzcha.zzd.schedule(this.b, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdo)).longValue(), TimeUnit.MILLISECONDS);
                } else {
                    zzfph zzfphVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    zzfphVar.removeCallbacks(this.b);
                    zzfphVar.postDelayed(this.b, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdo)).longValue());
                }
            }
        }
    }
}
