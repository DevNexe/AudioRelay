package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnk extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzfnk> CREATOR = new zzfnl();
    public final int zza;
    public final byte[] zzb;

    public zzfnk(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.zza);
        Th.B(parcel, 2, this.zzb);
        Th.X(parcel, iP);
    }

    public zzfnk(byte[] bArr) {
        this(1, bArr);
    }
}
