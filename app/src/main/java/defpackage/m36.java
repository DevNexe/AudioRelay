package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzcgn;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class m36 implements Application.ActivityLifecycleCallbacks {
    public final Application w;
    public final WeakReference x;
    public boolean y = false;

    public m36(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.x = new WeakReference(activityLifecycleCallbacks);
        this.w = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.x.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            } else if (!this.y) {
                this.w.unregisterActivityLifecycleCallbacks(this);
                this.y = true;
            }
        } catch (Exception e) {
            zzcgn.zzh("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.x.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            } else if (!this.y) {
                this.w.unregisterActivityLifecycleCallbacks(this);
                this.y = true;
            }
        } catch (Exception e) {
            zzcgn.zzh("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.x.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPaused(activity);
            } else if (!this.y) {
                this.w.unregisterActivityLifecycleCallbacks(this);
                this.y = true;
            }
        } catch (Exception e) {
            zzcgn.zzh("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.x.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityResumed(activity);
            } else if (!this.y) {
                this.w.unregisterActivityLifecycleCallbacks(this);
                this.y = true;
            }
        } catch (Exception e) {
            zzcgn.zzh("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.x.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            } else if (!this.y) {
                this.w.unregisterActivityLifecycleCallbacks(this);
                this.y = true;
            }
        } catch (Exception e) {
            zzcgn.zzh("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.x.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            } else if (!this.y) {
                this.w.unregisterActivityLifecycleCallbacks(this);
                this.y = true;
            }
        } catch (Exception e) {
            zzcgn.zzh("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.x.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStopped(activity);
            } else if (!this.y) {
                this.w.unregisterActivityLifecycleCallbacks(this);
                this.y = true;
            }
        } catch (Exception e) {
            zzcgn.zzh("Error while dispatching lifecycle callback.", e);
        }
    }
}
