package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzcfi extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzcfi> CREATOR = new zzcfj();

    @Deprecated
    public final String zza;
    public final String zzb;

    @Deprecated
    public final com.google.android.gms.ads.internal.client.zzq zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;

    public zzcfi(String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.zza);
        Th.J(parcel, 2, this.zzb);
        Th.I(parcel, 3, this.zzc, i);
        Th.I(parcel, 4, this.zzd, i);
        Th.X(parcel, iP);
    }
}
