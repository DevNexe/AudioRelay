package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqy extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzbqy> CREATOR = new zzbqz();
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    public zzbqy(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.zza);
        Th.K(parcel, 2, this.zzb);
        Th.K(parcel, 3, this.zzc);
        Th.X(parcel, iP);
    }
}
