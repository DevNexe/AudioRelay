package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.i5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvm extends zzarv implements zzbvo {
    public zzbvm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final IObjectWrapper zze() {
        return i5.a(L0(K0(), 1));
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final boolean zzf() {
        Parcel parcelL0 = L0(K0(), 2);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }
}
