package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;
import defpackage.i76;
import defpackage.l97;
import defpackage.s67;

/* JADX INFO: loaded from: classes.dex */
public final class zzad extends zza implements zzaf {
    public zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final l97 W(s67 s67Var) {
        Parcel parcelL0 = L0();
        int i = i76.a;
        parcelL0.writeInt(1);
        s67Var.writeToParcel(parcelL0, 0);
        Parcel parcelK0 = K0(parcelL0, 6);
        l97 l97Var = (l97) i76.a(parcelK0, l97.CREATOR);
        parcelK0.recycle();
        return l97Var;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean i0(com.google.android.gms.common.NUlFixed nUl, ObjectWrapper objectWrapper) {
        Parcel parcelL0 = L0();
        int i = i76.a;
        parcelL0.writeInt(1);
        nUl.writeToParcel(parcelL0, 0);
        i76.c(parcelL0, objectWrapper);
        Parcel parcelK0 = K0(parcelL0, 5);
        boolean z = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzi() {
        Parcel parcelK0 = K0(L0(), 7);
        int i = i76.a;
        boolean z = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z;
    }
}
