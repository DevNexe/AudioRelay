package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import defpackage.i5;

/* JADX INFO: loaded from: classes.dex */
public final class zzx extends zza implements zzz {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zzc() {
        Parcel parcelK0 = K0(L0(), 2);
        int i = parcelK0.readInt();
        parcelK0.recycle();
        return i;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final IObjectWrapper zzd() {
        return i5.a(K0(L0(), 1));
    }
}
