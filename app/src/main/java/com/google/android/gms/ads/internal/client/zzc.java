package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends com5Fixed {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    public final String zza;
    public final String zzb;

    public zzc(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.zza);
        Th.J(parcel, 2, this.zzb);
        Th.X(parcel, iP);
    }
}
