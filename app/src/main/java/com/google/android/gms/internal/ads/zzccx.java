package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import defpackage.Th;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzccx extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzccx> CREATOR = new zzccy();
    public final String zza;
    public final String zzb;

    public zzccx(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.zza);
        Th.J(parcel, 2, this.zzb);
        Th.X(parcel, iP);
    }

    public zzccx(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
