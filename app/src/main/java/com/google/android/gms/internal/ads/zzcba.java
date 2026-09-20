package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzcba extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzcba> CREATOR = new zzcbb();
    public final Bundle zza;
    public final zzcgt zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzfff zzi;
    public String zzj;

    public zzcba(Bundle bundle, zzcgt zzcgtVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfff zzfffVar, String str4) {
        this.zza = bundle;
        this.zzb = zzcgtVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfffVar;
        this.zzj = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.A(parcel, 1, this.zza);
        Th.I(parcel, 2, this.zzb, i);
        Th.I(parcel, 3, this.zzc, i);
        Th.J(parcel, 4, this.zzd);
        Th.L(parcel, 5, this.zze);
        Th.I(parcel, 6, this.zzf, i);
        Th.J(parcel, 7, this.zzg);
        Th.J(parcel, 9, this.zzh);
        Th.I(parcel, 10, this.zzi, i);
        Th.J(parcel, 11, this.zzj);
        Th.X(parcel, iP);
    }
}
