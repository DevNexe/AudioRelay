package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;
import defpackage.i5;
import defpackage.i76;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends zza {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper M0(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) {
        Parcel parcelL0 = L0();
        i76.c(parcelL0, objectWrapper);
        parcelL0.writeString(str);
        parcelL0.writeInt(i);
        i76.c(parcelL0, objectWrapper2);
        return i5.a(K0(parcelL0, 2));
    }

    public final IObjectWrapper N0(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) {
        Parcel parcelL0 = L0();
        i76.c(parcelL0, objectWrapper);
        parcelL0.writeString(str);
        parcelL0.writeInt(i);
        i76.c(parcelL0, objectWrapper2);
        return i5.a(K0(parcelL0, 3));
    }
}
