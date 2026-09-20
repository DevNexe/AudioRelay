package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import defpackage.p36;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbcg {
    public final Object a = new Object();

    @GuardedBy("activityTrackerLock")
    public p36 b = null;

    @GuardedBy("activityTrackerLock")
    public boolean c = false;

    public final Activity zza() {
        synchronized (this.a) {
            try {
                p36 p36Var = this.b;
                if (p36Var == null) {
                    return null;
                }
                return p36Var.w;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context zzb() {
        synchronized (this.a) {
            p36 p36Var = this.b;
            if (p36Var == null) {
                return null;
            }
            return p36Var.x;
        }
    }

    public final void zzc(zzbcf zzbcfVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new p36();
            }
            p36 p36Var = this.b;
            synchronized (p36Var.y) {
                p36Var.B.add(zzbcfVar);
            }
        }
    }

    public final void zzd(Context context) {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        zzcgn.zzj("Can not cast Context to Application");
                        return;
                    }
                    if (this.b == null) {
                        this.b = new p36();
                    }
                    p36 p36Var = this.b;
                    if (!p36Var.E) {
                        application.registerActivityLifecycleCallbacks(p36Var);
                        if (context instanceof Activity) {
                            p36Var.a((Activity) context);
                        }
                        p36Var.x = application;
                        p36Var.F = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaM)).longValue();
                        p36Var.E = true;
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(zzbcf zzbcfVar) {
        synchronized (this.a) {
            p36 p36Var = this.b;
            if (p36Var == null) {
                return;
            }
            synchronized (p36Var.y) {
                p36Var.B.remove(zzbcfVar);
            }
        }
    }
}
