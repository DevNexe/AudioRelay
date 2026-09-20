package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnw extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzfnw> CREATOR = new zzfnx();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    public zzfnw(int i, int i2, int i3, String str, String str2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.zza);
        Th.G(parcel, 2, this.zzb);
        Th.J(parcel, 3, this.zzc);
        Th.J(parcel, 4, this.zzd);
        Th.G(parcel, 5, this.zze);
        Th.X(parcel, iP);
    }

    public zzfnw(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }
}
