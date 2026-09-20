package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzez extends com5Fixed {
    public static final Parcelable.Creator<zzez> CREATOR = new zzfa();
    public final int zza;
    public final int zzb;

    public zzez(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.zza);
        Th.G(parcel, 2, this.zzb);
        Th.X(parcel, iP);
    }

    public zzez(RequestConfiguration requestConfiguration) {
        this.zza = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzb = requestConfiguration.getTagForUnderAgeOfConsent();
    }
}
