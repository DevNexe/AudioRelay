package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnn extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzfnn> CREATOR = new zzfno();
    public final int zza;
    public final String zzb;
    public final String zzc;

    public zzfnn(int i, String str, String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.zza);
        Th.J(parcel, 2, this.zzb);
        Th.J(parcel, 3, this.zzc);
        Th.X(parcel, iP);
    }

    public zzfnn(String str, String str2) {
        this(1, str, str2);
    }
}
