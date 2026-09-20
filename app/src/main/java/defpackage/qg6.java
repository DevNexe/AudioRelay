package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzbz;

/* JADX INFO: loaded from: classes3.dex */
public final class qg6 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ CQf w;

    public qg6(CQf cQf) {
        this.w = cQf;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.w.c(new kf6(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.w.c(new zf6(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.w.c(new zf6(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.w.c(new zb6(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbz zzbzVar = new zzbz();
        this.w.c(new be6(this, activity, zzbzVar));
        Bundle bundleL0 = zzbzVar.L0(50L);
        if (bundleL0 != null) {
            bundle.putAll(bundleL0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.w.c(new rf6(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.w.c(new rf6(this, activity, 1));
    }
}
