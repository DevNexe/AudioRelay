package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.au5;
import defpackage.bl2;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadk extends zzada {
    public static final Parcelable.Creator<zzadk> CREATOR = new au5();
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzadk(Parcel parcel) {
        String string = parcel.readString();
        int i = zzel.zza;
        super(string);
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadk.class == obj.getClass()) {
            zzadk zzadkVar = (zzadk) obj;
            if (this.zzf.equals(zzadkVar.zzf) && zzel.zzT(this.zza, zzadkVar.zza) && zzel.zzT(this.zzb, zzadkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = bl2.a(this.zzf, 527, 31);
        String str = this.zza;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final String toString() {
        return defpackage.LPt6Fixed.a(this.zzf, ": url=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzadk(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}
