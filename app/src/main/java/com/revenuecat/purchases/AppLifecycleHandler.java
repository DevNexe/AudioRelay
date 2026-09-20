package com.revenuecat.purchases;

import defpackage.d32;
import defpackage.w61;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLifecycleHandler implements w61 {
    private final LifecycleDelegate lifecycleDelegate;

    public AppLifecycleHandler(LifecycleDelegate lifecycleDelegate) {
        this.lifecycleDelegate = lifecycleDelegate;
    }

    @Override // defpackage.w61
    public /* bridge */ /* synthetic */ void onCreate(d32 d32Var) {
    }

    @Override // defpackage.w61
    public /* bridge */ /* synthetic */ void onDestroy(d32 d32Var) {
    }

    @Override // defpackage.w61
    public /* bridge */ /* synthetic */ void onPause(d32 d32Var) {
    }

    @Override // defpackage.w61
    public /* bridge */ /* synthetic */ void onResume(d32 d32Var) {
    }

    @Override // defpackage.w61
    public void onStart(d32 d32Var) {
        this.lifecycleDelegate.onAppForegrounded();
    }

    @Override // defpackage.w61
    public void onStop(d32 d32Var) {
        this.lifecycleDelegate.onAppBackgrounded();
    }
}
