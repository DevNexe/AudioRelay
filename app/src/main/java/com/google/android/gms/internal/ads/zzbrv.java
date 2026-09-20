package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrv extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzbrv> CREATOR = new zzbrw();
    public final String zza;
    public final Bundle zzb;

    public zzbrv(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.zza);
        Th.A(parcel, 2, this.zzb);
        Th.X(parcel, iP);
    }
}
