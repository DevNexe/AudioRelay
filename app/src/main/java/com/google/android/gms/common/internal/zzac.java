package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.b47;

/* JADX INFO: loaded from: classes.dex */
final class zzac implements IGmsServiceBroker {
    public final IBinder w;

    public zzac(IBinder iBinder) {
        this.w = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.w;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void r(zzd zzdVar, CQf cQf) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(zzdVar);
            parcelObtain.writeInt(1);
            b47.a(cQf, parcelObtain, 0);
            this.w.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
