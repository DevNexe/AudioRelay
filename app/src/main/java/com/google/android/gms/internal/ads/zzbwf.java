package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwf extends zzbvn {
    public final MediationInterscrollerAd w;

    public zzbwf(MediationInterscrollerAd mediationInterscrollerAd) {
        this.w = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final IObjectWrapper zze() {
        return new ObjectWrapper(this.w.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final boolean zzf() {
        return this.w.shouldDelegateInterscrollerEffect();
    }
}
