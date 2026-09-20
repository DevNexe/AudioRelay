package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends com5Fixed {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzj(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = f;
        this.zzf = i;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.z(parcel, 2, this.zza);
        Th.z(parcel, 3, this.zzb);
        Th.J(parcel, 4, this.zzc);
        Th.z(parcel, 5, this.zzd);
        float f = this.zze;
        parcel.writeInt(262150);
        parcel.writeFloat(f);
        Th.G(parcel, 7, this.zzf);
        Th.z(parcel, 8, this.zzg);
        Th.z(parcel, 9, this.zzh);
        Th.z(parcel, 10, this.zzi);
        Th.X(parcel, iP);
    }

    public zzj(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }
}
