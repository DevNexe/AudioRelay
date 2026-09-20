package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.w46;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzce extends zzbn implements zzcf {
    public zzce() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) w46.a(parcel, Bundle.CREATOR);
        w46.b(parcel);
        ((zzbz) this).zzd(bundle);
        parcel2.writeNoException();
        return true;
    }
}
