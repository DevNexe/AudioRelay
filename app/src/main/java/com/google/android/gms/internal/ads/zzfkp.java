package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfkp implements Application.ActivityLifecycleCallbacks {

    @SuppressLint({"StaticFieldLeak"})
    public static final zzfkp z = new zzfkp();
    public boolean w;
    public boolean x;
    public zzfku y;

    public static zzfkp zza() {
        return z;
    }

    public final void a() {
        boolean z2 = this.x;
        Iterator it = zzfko.zza().zzc().iterator();
        while (it.hasNext()) {
            zzfla zzflaVarZzg = ((zzfkd) it.next()).zzg();
            if (zzflaVarZzg.zzk()) {
                String str = true != z2 ? "foregrounded" : "backgrounded";
                zzfkt.zza().getClass();
                zzfkt.a(zzflaVarZzg.zza(), "setState", str);
            }
        }
    }

    public final void b(boolean z2) {
        if (this.x != z2) {
            this.x = z2;
            if (this.w) {
                a();
                if (this.y != null) {
                    if (!z2) {
                        zzflq.zzd().zzi();
                    } else {
                        zzflq.zzd().zzh();
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View viewZzf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z2 = true;
        for (zzfkd zzfkdVar : zzfko.zza().zzb()) {
            if (zzfkdVar.zzj() && (viewZzf = zzfkdVar.zzf()) != null && viewZzf.hasWindowFocus()) {
                z2 = false;
            }
        }
        b(i != 100 && z2);
    }

    public final void zzb() {
        this.w = true;
        this.x = false;
        a();
    }

    public final void zzc() {
        this.w = false;
        this.x = false;
        this.y = null;
    }

    public final void zzd(zzfku zzfkuVar) {
        this.y = zzfkuVar;
    }
}
