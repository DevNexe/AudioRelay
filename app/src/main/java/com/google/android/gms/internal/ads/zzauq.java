package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl2;
import defpackage.w06;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzauq implements Parcelable {
    public static final Parcelable.Creator<zzauq> CREATOR = new w06();
    public int w;
    public final UUID x;
    public final String zza;
    public final byte[] zzb;
    public final boolean zzc;

    public zzauq(Parcel parcel) {
        this.x = new UUID(parcel.readLong(), parcel.readLong());
        this.zza = parcel.readString();
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzauq)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzauq zzauqVar = (zzauq) obj;
        return this.zza.equals(zzauqVar.zza) && zzban.zzo(this.x, zzauqVar.x) && Arrays.equals(this.zzb, zzauqVar.zzb);
    }

    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iA = bl2.a(this.zza, this.x.hashCode() * 31, 31) + Arrays.hashCode(this.zzb);
        this.w = iA;
        return iA;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.x;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
    }

    public zzauq(UUID uuid, String str, byte[] bArr, boolean z) {
        uuid.getClass();
        this.x = uuid;
        this.zza = str;
        bArr.getClass();
        this.zzb = bArr;
        this.zzc = false;
    }
}
