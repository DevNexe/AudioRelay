package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pt5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzact extends zzada {
    public static final Parcelable.Creator<zzact> CREATOR = new pt5();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzact(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = zzel.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzact.class == obj.getClass()) {
            zzact zzactVar = (zzact) obj;
            if (zzel.zzT(this.zzb, zzactVar.zzb) && zzel.zzT(this.zza, zzactVar.zza) && zzel.zzT(this.zzc, zzactVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.zzb;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzc;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final String toString() {
        return this.zzf + ": language=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzact(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
