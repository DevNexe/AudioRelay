package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfoj extends zzarw implements zzfok {
    public zzfoj() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                parcel.readString();
                zzarx.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzarx.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzarx.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzarx.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzarx.zzc(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzarx.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
