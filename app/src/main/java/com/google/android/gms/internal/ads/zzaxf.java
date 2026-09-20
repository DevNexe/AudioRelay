package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c26;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxf extends zzaxj {
    public static final Parcelable.Creator<zzaxf> CREATOR = new c26();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzaxf(Parcel parcel) {
        super("APIC");
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxf.class == obj.getClass()) {
            zzaxf zzaxfVar = (zzaxf) obj;
            if (this.zzc == zzaxfVar.zzc && zzban.zzo(this.zza, zzaxfVar.zza) && zzban.zzo(this.zzb, zzaxfVar.zzb) && Arrays.equals(this.zzd, zzaxfVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zzc + 527) * 31;
        String str = this.zza;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return Arrays.hashCode(this.zzd) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzaxf(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = null;
        this.zzc = 3;
        this.zzd = bArr;
    }
}
