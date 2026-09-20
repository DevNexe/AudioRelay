package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl2;
import defpackage.xb7;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw implements Parcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new xb7();
    public int w;
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzw(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String string = parcel.readString();
        int i = zzel.zza;
        this.zzc = string;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzw)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzw zzwVar = (zzw) obj;
        return zzel.zzT(this.zzb, zzwVar.zzb) && zzel.zzT(this.zzc, zzwVar.zzc) && zzel.zzT(this.zza, zzwVar.zza) && Arrays.equals(this.zzd, zzwVar.zzd);
    }

    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iA = bl2.a(this.zzc, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31) + Arrays.hashCode(this.zzd);
        this.w = iA;
        return iA;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzw(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }
}
