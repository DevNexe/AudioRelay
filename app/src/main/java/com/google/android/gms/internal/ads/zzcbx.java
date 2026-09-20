package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbx extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzcbx> CREATOR = new zzcby();
    public final com.google.android.gms.ads.internal.client.zzl zza;
    public final String zzb;

    public zzcbx(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) {
        this.zza = zzlVar;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.I(parcel, 2, this.zza, i);
        Th.J(parcel, 3, this.zzb);
        Th.X(parcel, iP);
    }
}
