package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbnq;

/* JADX INFO: loaded from: classes.dex */
public final class zzfd extends zzbnq {
    public final ShouldDelayBannerRenderingListener w;

    public zzfd(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.w = shouldDelayBannerRenderingListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbnr
    public final boolean zzb(IObjectWrapper iObjectWrapper) {
        return this.w.shouldDelayBannerRendering((Runnable) ObjectWrapper.M0(iObjectWrapper));
    }
}
