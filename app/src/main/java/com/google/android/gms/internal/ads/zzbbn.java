package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import defpackage.aa7;
import defpackage.m36;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbbn implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long K = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbf)).longValue();
    public static final /* synthetic */ int L = 0;
    public aa7 A;
    public WeakReference B;
    public final WeakReference C;
    public final m36 D;
    public final com.google.android.gms.ads.internal.util.zzbz E = new com.google.android.gms.ads.internal.util.zzbz(K);
    public boolean F = false;
    public int G = -1;
    public final HashSet H = new HashSet();
    public final DisplayMetrics I;
    public final Rect J;
    public final Context w;
    public final Application x;
    public final PowerManager y;
    public final KeyguardManager z;

    public zzbbn(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.w = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.y = (PowerManager) applicationContext.getSystemService("power");
        this.z = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.x = application;
            this.D = new m36(application, this);
        }
        this.I = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.J = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.C;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.C = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f = rect.left;
        float f2 = this.I.density;
        return new Rect((int) (f / f2), (int) (rect.top / f2), (int) (rect.right / f2), (int) (rect.bottom / f2));
    }

    public final void b(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.C;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.G = i;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final void c(int i) {
        WeakReference weakReference;
        View view;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        ?? EmptyList;
        ?? r4;
        HashSet hashSet = this.H;
        if (hashSet.isEmpty() || (weakReference = this.C) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e) {
                zzcgn.zzh("Failure getting view location.", e);
            }
            int i2 = iArr[0];
            rect.left = i2;
            rect.top = iArr[1];
            rect.right = view2.getWidth() + i2;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
        } else {
            view = null;
            globalVisibleRect = false;
            localVisibleRect = false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbi)).booleanValue() || view == null) {
            EmptyList = Collections.emptyList();
        } else {
            try {
                EmptyList = new ArrayList();
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        EmptyList.add(a(rect5));
                    }
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzt.zzp().zzt(e2, "PositionWatcher.getParentScrollViewRects");
                EmptyList = Collections.emptyList();
            }
        }
        ?? r32 = EmptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i3 = this.G;
        if (i3 != -1) {
            windowVisibility = i3;
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        long jZzt = com.google.android.gms.ads.internal.util.zzs.zzt(view);
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzig)).booleanValue();
        KeyguardManager keyguardManager = this.z;
        PowerManager powerManager = this.y;
        if (zBooleanValue) {
            if (view2 != null) {
                com.google.android.gms.ads.internal.zzt.zzq();
                if (com.google.android.gms.ads.internal.util.zzs.zzP(view, powerManager, keyguardManager) && globalVisibleRect && localVisibleRect) {
                    if (jZzt >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzij)).intValue() && windowVisibility == 0) {
                        r4 = 1;
                        windowVisibility = 0;
                    }
                }
            }
            r4 = 0;
        } else {
            if (view2 != null) {
                com.google.android.gms.ads.internal.zzt.zzq();
                if (com.google.android.gms.ads.internal.util.zzs.zzP(view, powerManager, keyguardManager) && globalVisibleRect && localVisibleRect && windowVisibility == 0) {
                    r4 = 1;
                    windowVisibility = 0;
                }
            }
            r4 = 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzil)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzq();
            int i4 = (windowVisibility == 0 ? 128 : 0) | (true != com.google.android.gms.ads.internal.util.zzs.zzP(view, powerManager, keyguardManager) ? 0 : 64) | (true != globalVisibleRect ? 0 : 8) | (true != localVisibleRect ? 0 : 16);
            int i5 = jZzt >= ((long) ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzij)).intValue()) ? 32 : 0;
            com.google.android.gms.ads.internal.zzt.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzF(view, i4 | i5 | r4, null);
        }
        if (i == 1 && !this.E.zzb() && r4 == this.F) {
            return;
        }
        if (r4 == 0 && !this.F) {
            if (i == 1) {
                return;
            }
        }
        zzbbl zzbblVar = new zzbbl(com.google.android.gms.ads.internal.zzt.zzB().c(), powerManager.isScreenOn(), view != null && view.isAttachedToWindow(), view != null ? view.getWindowVisibility() : 8, a(this.J), a(rect), a(rect2), globalVisibleRect, a(rect3), localVisibleRect, jZzt, a(rect4), this.I.density, r4, r32);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((zzbbm) it.next()).zzc(zzbblVar);
        }
        this.F = r4;
    }

    public final void d() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.c(3);
            }
        });
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.B = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.A == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.A = new aa7(this);
            com.google.android.gms.ads.internal.zzt.zzw().zzc(this.w, this.A, intentFilter);
        }
        Application application = this.x;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.D);
            } catch (Exception e) {
                zzcgn.zzh("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.B;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.B = null;
            }
        } catch (Exception e) {
            zzcgn.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            zzcgn.zzh("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.A != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzw().zzd(this.w, this.A);
            } catch (IllegalStateException e3) {
                zzcgn.zzh("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzt.zzp().zzt(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.A = null;
        }
        Application application = this.x;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.D);
            } catch (Exception e5) {
                zzcgn.zzh("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c(3);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c(2);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.G = -1;
        e(view);
        c(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.G = -1;
        c(3);
        d();
        f(view);
    }

    public final void zzc(zzbbm zzbbmVar) {
        this.H.add(zzbbmVar);
        c(3);
    }

    public final void zze(zzbbm zzbbmVar) {
        this.H.remove(zzbbmVar);
    }

    public final void zzf() {
        this.E.zza(K);
    }

    public final void zzg(long j) {
        this.E.zza(j);
    }
}
