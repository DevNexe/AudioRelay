package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d26;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxh extends zzaxj {
    public static final Parcelable.Creator<zzaxh> CREATOR = new d26();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzaxh(Parcel parcel) {
        super("COMM");
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxh.class == obj.getClass()) {
            zzaxh zzaxhVar = (zzaxh) obj;
            if (zzban.zzo(this.zzb, zzaxhVar.zzb) && zzban.zzo(this.zza, zzaxhVar.zza) && zzban.zzo(this.zzc, zzaxhVar.zzc)) {
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zze);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzaxh(String str, String str2, String str3) {
        super("COMM");
        this.zza = "und";
        this.zzb = str2;
        this.zzc = str3;
    }
}
