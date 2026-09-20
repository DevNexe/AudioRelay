package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrl extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzbrl> CREATOR = new zzbrm();
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public zzbrl(String str, boolean z, int i, String str2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.zza);
        Th.z(parcel, 2, this.zzb);
        Th.G(parcel, 3, this.zzc);
        Th.J(parcel, 4, this.zzd);
        Th.X(parcel, iP);
    }
}
