package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import defpackage.iz5;
import defpackage.pz5;
import defpackage.qz5;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqi implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final Handler I = new Handler(Looper.getMainLooper());
    public qz5 A;
    public final zzapu B;
    public WeakReference C;
    public WeakReference D;
    public final iz5 E;
    public byte F = -1;
    public int G = -1;
    public long H = -3;
    public final Context w;
    public final Application x;
    public final PowerManager y;
    public final KeyguardManager z;

    public zzaqi(Context context, zzapu zzapuVar) {
        Context applicationContext = context.getApplicationContext();
        this.w = applicationContext;
        this.B = zzapuVar;
        this.y = (PowerManager) applicationContext.getSystemService("power");
        this.z = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.x = application;
            this.E = new iz5(application, this);
        }
        b(null);
    }

    public final View a() {
        WeakReference weakReference = this.D;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void b(View view) {
        long j;
        View viewA = a();
        if (viewA != null) {
            viewA.removeOnAttachStateChangeListener(this);
            f(viewA);
        }
        this.D = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.H = j;
    }

    public final void c(Activity activity, int i) {
        Window window;
        if (this.D == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewA = a();
        if (viewA == null || viewPeekDecorView == null || viewA.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.G = i;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005c  */
    public final void d() {
        Activity activityZzb;
        if (this.D == null) {
            return;
        }
        View viewA = a();
        if (viewA == null) {
            this.H = -3L;
            this.F = (byte) -1;
            return;
        }
        int i = viewA.getVisibility() != 0 ? 1 : 0;
        if (!viewA.isShown()) {
            i |= 2;
        }
        PowerManager powerManager = this.y;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i |= 4;
        }
        if (!this.B.a) {
            KeyguardManager keyguardManager = this.z;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || (activityZzb = zzaqe.zzb(viewA)) == null) {
                i |= 8;
            } else {
                Window window = activityZzb.getWindow();
                WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
                if (attributes == null || (attributes.flags & 524288) == 0) {
                    i |= 8;
                }
            }
        }
        if (!viewA.getGlobalVisibleRect(new Rect())) {
            i |= 16;
        }
        if (!viewA.getLocalVisibleRect(new Rect())) {
            i |= 32;
        }
        int windowVisibility = viewA.getWindowVisibility();
        int i2 = this.G;
        if (i2 != -1) {
            windowVisibility = i2;
        }
        if (windowVisibility != 0) {
            i |= 64;
        }
        if (this.F != i) {
            this.F = (byte) i;
            this.H = i == 0 ? SystemClock.elapsedRealtime() : (-3) - ((long) i);
        }
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.C = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.A == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            qz5 qz5Var = new qz5(this);
            this.A = qz5Var;
            this.w.registerReceiver(qz5Var, intentFilter);
        }
        Application application = this.x;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.E);
            } catch (Exception unused) {
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.C;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.C = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        qz5 qz5Var = this.A;
        if (qz5Var != null) {
            try {
                this.w.unregisterReceiver(qz5Var);
            } catch (Exception unused3) {
            }
            this.A = null;
        }
        Application application = this.x;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.E);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d();
        I.post(new pz5(this, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.G = -1;
        e(view);
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.G = -1;
        d();
        I.post(new pz5(this, 0));
        f(view);
    }

    public final long zza() {
        if (this.H <= -2 && a() == null) {
            this.H = -3L;
        }
        return this.H;
    }
}
