package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzdo extends com5Fixed {
    public static final Parcelable.Creator<zzdo> CREATOR = new zzdp();
    public final int zza;

    public zzdo(int i) {
        this.zza = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 2, this.zza);
        Th.X(parcel, iP);
    }
}
