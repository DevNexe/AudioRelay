package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.Th;
import defpackage.a42;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcgt extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzcgt> CREATOR = new zzcgu();
    public String zza;
    public int zzb;
    public int zzc;
    public boolean zzd;
    public boolean zze;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzcgt(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        StringBuilder sbA = a42.a("afma-sdk-a-v", i, ".", i2, ".");
        sbA.append(str);
        this(sbA.toString(), i, i2, z, z3);
    }

    public static zzcgt zza() {
        return new zzcgt(12451000, 12451000, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 2, this.zza);
        Th.G(parcel, 3, this.zzb);
        Th.G(parcel, 4, this.zzc);
        Th.z(parcel, 5, this.zzd);
        Th.z(parcel, 6, this.zze);
        Th.X(parcel, iP);
    }

    public zzcgt(int i, int i2, boolean z, boolean z2) {
        this(ModuleDescriptor.MODULE_VERSION, i2, true, false, z2);
    }

    public zzcgt(String str, int i, int i2, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = z2;
    }
}
