package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.v86;
import defpackage.w86;

/* JADX INFO: loaded from: classes3.dex */
public final class zzchn {
    public static final void zza(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        v86 v86Var = new v86(view, onGlobalLayoutListener);
        ViewTreeObserver viewTreeObserverA = v86Var.a();
        if (viewTreeObserverA != null) {
            v86Var.b(viewTreeObserverA);
        }
    }

    public static final void zzb(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        w86 w86Var = new w86(view, onScrollChangedListener);
        ViewTreeObserver viewTreeObserverA = w86Var.a();
        if (viewTreeObserverA != null) {
            w86Var.b(viewTreeObserverA);
        }
    }
}
