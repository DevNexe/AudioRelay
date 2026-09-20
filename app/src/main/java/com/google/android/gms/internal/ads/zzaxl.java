package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl2;
import defpackage.e26;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxl extends zzaxj {
    public static final Parcelable.Creator<zzaxl> CREATOR = new e26();
    public final String zza;
    public final String zzb;

    public zzaxl(Parcel parcel) {
        super(parcel.readString());
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxl.class == obj.getClass()) {
            zzaxl zzaxlVar = (zzaxl) obj;
            if (this.zze.equals(zzaxlVar.zze) && zzban.zzo(this.zza, zzaxlVar.zza) && zzban.zzo(this.zzb, zzaxlVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = bl2.a(this.zze, 527, 31);
        String str = this.zza;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zze);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzaxl(String str, String str2, String str3) {
        super(str);
        this.zza = null;
        this.zzb = str3;
    }
}
