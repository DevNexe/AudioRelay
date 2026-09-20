package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(14)
public final class cy6 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ dy6 w;

    public /* synthetic */ cy6(dy6 dy6Var) {
        this.w = dy6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        dz6 dz6Var;
        Uri data;
        dy6 dy6Var = this.w;
        try {
            try {
                bi6 bi6Var = dy6Var.a.i;
                dq6.h(bi6Var);
                bi6Var.n.b("onActivityCreated");
                Intent intent = activity.getIntent();
                dq6 dq6Var = dy6Var.a;
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    dq6.f(dq6Var.l);
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z = true;
                    String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z = false;
                    }
                    ro6 ro6Var = dq6Var.j;
                    dq6.h(ro6Var);
                    ro6Var.m(new zx6(this, z, data, str, queryParameter));
                }
                dz6Var = dq6Var.o;
            } catch (RuntimeException e) {
                bi6 bi6Var2 = dy6Var.a.i;
                dq6.h(bi6Var2);
                bi6Var2.f.c(e, "Throwable caught in onActivityCreated");
                dz6Var = dy6Var.a.o;
            }
            dq6.g(dz6Var);
            dz6Var.m(activity, bundle);
        } catch (Throwable th) {
            dz6 dz6Var2 = dy6Var.a.o;
            dq6.g(dz6Var2);
            dz6Var2.m(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        dz6 dz6Var = this.w.a.o;
        dq6.g(dz6Var);
        synchronized (dz6Var.l) {
            if (activity == dz6Var.g) {
                dz6Var.g = null;
            }
        }
        if (dz6Var.a.g.o()) {
            dz6Var.f.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i;
        dz6 dz6Var = this.w.a.o;
        dq6.g(dz6Var);
        synchronized (dz6Var.l) {
            i = 0;
            dz6Var.k = false;
            dz6Var.h = true;
        }
        dz6Var.a.n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (dz6Var.a.g.o()) {
            qy6 qy6VarN = dz6Var.n(activity);
            dz6Var.d = dz6Var.c;
            dz6Var.c = null;
            ro6 ro6Var = dz6Var.a.j;
            dq6.h(ro6Var);
            ro6Var.m(new qx5(dz6Var, qy6VarN, jElapsedRealtime, 2));
        } else {
            dz6Var.c = null;
            ro6 ro6Var2 = dz6Var.a.j;
            dq6.h(ro6Var2);
            ro6Var2.m(new yy6(dz6Var, jElapsedRealtime, i));
        }
        w17 w17Var = this.w.a.k;
        dq6.g(w17Var);
        w17Var.a.n.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        ro6 ro6Var3 = w17Var.a.j;
        dq6.h(ro6Var3);
        ro6Var3.m(new bx6(w17Var, jElapsedRealtime2, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        w17 w17Var = this.w.a.k;
        dq6.g(w17Var);
        w17Var.a.n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ro6 ro6Var = w17Var.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new yy6(w17Var, jElapsedRealtime, 1));
        dz6 dz6Var = this.w.a.o;
        dq6.g(dz6Var);
        synchronized (dz6Var.l) {
            dz6Var.k = true;
            if (activity != dz6Var.g) {
                synchronized (dz6Var.l) {
                    dz6Var.g = activity;
                    dz6Var.h = false;
                }
                if (dz6Var.a.g.o()) {
                    dz6Var.i = null;
                    ro6 ro6Var2 = dz6Var.a.j;
                    dq6.h(ro6Var2);
                    ro6Var2.m(new vy6(dz6Var, 1));
                }
            }
        }
        if (!dz6Var.a.g.o()) {
            dz6Var.c = dz6Var.i;
            ro6 ro6Var3 = dz6Var.a.j;
            dq6.h(ro6Var3);
            ro6Var3.m(new vy6(dz6Var, 0));
            return;
        }
        dz6Var.o(activity, dz6Var.n(activity), false);
        id6 id6VarJ = dz6Var.a.j();
        id6VarJ.a.n.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        ro6 ro6Var4 = id6VarJ.a.j;
        dq6.h(ro6Var4);
        ro6Var4.m(new y66(id6VarJ, jElapsedRealtime2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        qy6 qy6Var;
        dz6 dz6Var = this.w.a.o;
        dq6.g(dz6Var);
        if (!dz6Var.a.g.o() || bundle == null || (qy6Var = (qy6) dz6Var.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(FacebookAdapter.KEY_ID, qy6Var.c);
        bundle2.putString(MediationMetaData.KEY_NAME, qy6Var.a);
        bundle2.putString("referrer_name", qy6Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
