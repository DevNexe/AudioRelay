package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzchn;

/* JADX INFO: loaded from: classes.dex */
public final class zzci {
    public final View a;
    public Activity b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ViewTreeObserver.OnGlobalLayoutListener f;

    public zzci(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.b = activity;
        this.a = view;
        this.f = onGlobalLayoutListener;
    }

    public final void a() {
        View decorView;
        if (this.c) {
            return;
        }
        Activity activity = this.b;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = null;
            if (window != null && (decorView = window.getDecorView()) != null) {
                viewTreeObserver = decorView.getViewTreeObserver();
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        com.google.android.gms.ads.internal.zzt.zzy();
        zzchn.zza(this.a, onGlobalLayoutListener);
        this.c = true;
    }

    public final void zza() {
        View decorView;
        this.e = false;
        Activity activity = this.b;
        if (activity != null && this.c) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f);
            }
            this.c = false;
        }
    }

    public final void zzb() {
        this.e = true;
        if (this.d) {
            a();
        }
    }

    public final void zzc() {
        this.d = true;
        if (this.e) {
            a();
        }
    }

    public final void zzd() {
        View decorView;
        this.d = false;
        Activity activity = this.b;
        if (activity != null && this.c) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f);
            }
            this.c = false;
        }
    }

    public final void zze(Activity activity) {
        this.b = activity;
    }
}
