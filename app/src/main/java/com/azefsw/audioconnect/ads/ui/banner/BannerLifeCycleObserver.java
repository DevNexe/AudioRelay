package com.azefsw.audioconnect.ads.ui.banner;

import com.google.android.gms.ads.AdView;
import defpackage.KrLY;
import defpackage.d32;
import defpackage.w61;

/* JADX INFO: loaded from: classes.dex */
final class BannerLifeCycleObserver implements w61 {
    public final KrLY w;

    public BannerLifeCycleObserver(KrLY krLY) {
        this.w = krLY;
    }

    @Override // defpackage.w61
    public final /* synthetic */ void onCreate(d32 d32Var) {
    }

    @Override // defpackage.w61
    public final void onDestroy(d32 d32Var) {
        KrLY krLY = this.w;
        krLY.setVisibility(8);
        AdView adView = krLY.w;
        if (adView != null) {
            adView.destroy();
        }
    }

    @Override // defpackage.w61
    public final /* synthetic */ void onPause(d32 d32Var) {
    }

    @Override // defpackage.w61
    public final /* synthetic */ void onResume(d32 d32Var) {
    }

    @Override // defpackage.w61
    public final /* synthetic */ void onStart(d32 d32Var) {
    }

    @Override // defpackage.w61
    public final /* synthetic */ void onStop(d32 d32Var) {
    }
}
