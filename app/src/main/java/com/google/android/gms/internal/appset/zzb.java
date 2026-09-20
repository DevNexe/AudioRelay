package com.google.android.gms.internal.appset;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.HB;
import defpackage.b76;
import defpackage.h76;
import defpackage.z05;

/* JADX INFO: loaded from: classes3.dex */
public class zzb extends Binder implements IInterface {
    public zzb() {
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        zze zzeVar = (zze) this;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = h76.a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        b76 b76VarCreateFromParcel = parcel.readInt() == 0 ? null : b76.CREATOR.createFromParcel(parcel);
        zzo zzoVar = (zzo) zzeVar;
        HB hb = b76VarCreateFromParcel != null ? new HB(b76VarCreateFromParcel.w, b76VarCreateFromParcel.x) : null;
        boolean z = statusCreateFromParcel.x <= 0;
        z05 z05Var = zzoVar.w;
        if (z) {
            z05Var.a(hb);
            return true;
        }
        z05Var.a.r(new ApiException(statusCreateFromParcel));
        return true;
    }
}
