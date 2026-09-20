package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;
import defpackage.i5;
import defpackage.i76;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends zza {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final IObjectWrapper M0(ObjectWrapper objectWrapper, String str, int i) {
        Parcel parcelL0 = L0();
        i76.c(parcelL0, objectWrapper);
        parcelL0.writeString(str);
        parcelL0.writeInt(i);
        return i5.a(K0(parcelL0, 2));
    }

    public final IObjectWrapper N0(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) {
        Parcel parcelL0 = L0();
        i76.c(parcelL0, objectWrapper);
        parcelL0.writeString(str);
        parcelL0.writeInt(i);
        i76.c(parcelL0, objectWrapper2);
        return i5.a(K0(parcelL0, 8));
    }

    public final IObjectWrapper O0(ObjectWrapper objectWrapper, String str, int i) {
        Parcel parcelL0 = L0();
        i76.c(parcelL0, objectWrapper);
        parcelL0.writeString(str);
        parcelL0.writeInt(i);
        return i5.a(K0(parcelL0, 4));
    }

    public final IObjectWrapper P0(ObjectWrapper objectWrapper, String str, boolean z, long j) {
        Parcel parcelL0 = L0();
        i76.c(parcelL0, objectWrapper);
        parcelL0.writeString(str);
        parcelL0.writeInt(z ? 1 : 0);
        parcelL0.writeLong(j);
        return i5.a(K0(parcelL0, 7));
    }
}
