package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.w46;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzch extends zzbn implements zzci {
    public zzch() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) w46.a(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            w46.b(parcel);
            ((zzdv) this).y(j, bundle, string, string2);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iZzd = ((zzdv) this).zzd();
            parcel2.writeNoException();
            parcel2.writeInt(iZzd);
        }
        return true;
    }
}
