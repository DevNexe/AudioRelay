package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a42;
import defpackage.f36;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbaq implements Parcelable {
    public static final Parcelable.Creator<zzbaq> CREATOR = new f36();
    public int w;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzbaq(int i, int i2, int i3, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = bArr;
    }

    public zzbaq(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbaq.class == obj.getClass()) {
            zzbaq zzbaqVar = (zzbaq) obj;
            if (this.zza == zzbaqVar.zza && this.zzb == zzbaqVar.zzb && this.zzc == zzbaqVar.zzc && Arrays.equals(this.zzd, zzbaqVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.zzd) + ((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31);
        this.w = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        boolean z = this.zzd != null;
        StringBuilder sbA = a42.a("ColorInfo(", i, ", ", i2, ", ");
        sbA.append(i3);
        sbA.append(", ");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd != null ? 1 : 0);
        byte[] bArr = this.zzd;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
