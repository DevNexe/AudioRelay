package com.google.android.gms.internal.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.signin.internal.zad;
import defpackage.bq5;
import defpackage.iq5;
import defpackage.zq5;

/* JADX INFO: loaded from: classes3.dex */
public class zab extends Binder implements IInterface {
    public zab() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
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
        zad zadVar = (zad) this;
        int i3 = 0;
        switch (i) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                zact zactVar = (zact) zadVar;
                zactVar.x.post(new iq5(i3, zactVar, (zq5) bq5.a(parcel, zq5.CREATOR)));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
