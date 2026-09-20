package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbsc extends zzarw implements zzbsd {
    public zzbsc() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            zzarx.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
