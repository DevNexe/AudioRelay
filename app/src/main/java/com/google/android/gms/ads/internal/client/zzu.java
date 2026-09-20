package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzu extends com5Fixed {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public final String zza;
    public long zzb;
    public zze zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    public zzu(String str, long j, zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.zza);
        Th.H(parcel, 2, this.zzb);
        Th.I(parcel, 3, this.zzc, i);
        Th.A(parcel, 4, this.zzd);
        Th.J(parcel, 5, this.zze);
        Th.J(parcel, 6, this.zzf);
        Th.J(parcel, 7, this.zzg);
        Th.J(parcel, 8, this.zzh);
        Th.X(parcel, iP);
    }
}
