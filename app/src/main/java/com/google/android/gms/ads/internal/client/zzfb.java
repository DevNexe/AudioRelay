package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzfb extends com5Fixed {
    public static final Parcelable.Creator<zzfb> CREATOR = new zzfc();
    public final String zza;

    public zzfb(SearchAdRequest searchAdRequest) {
        this.zza = searchAdRequest.getQuery();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 15, this.zza);
        Th.X(parcel, iP);
    }

    public zzfb(String str) {
        this.zza = str;
    }
}
