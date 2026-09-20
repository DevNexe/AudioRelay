package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbra extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzbra> CREATOR = new zzbrb();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    public zzbra(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.zza = z;
        this.zzb = str;
        this.zzc = i;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z2;
        this.zzh = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.z(parcel, 1, this.zza);
        Th.J(parcel, 2, this.zzb);
        Th.G(parcel, 3, this.zzc);
        Th.B(parcel, 4, this.zzd);
        Th.K(parcel, 5, this.zze);
        Th.K(parcel, 6, this.zzf);
        Th.z(parcel, 7, this.zzg);
        Th.H(parcel, 8, this.zzh);
        Th.X(parcel, iP);
    }
}
