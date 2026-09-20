package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl2;
import defpackage.bu5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadn implements zzbp {
    public static final Parcelable.Creator<zzadn> CREATOR = new bu5();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public /* synthetic */ zzadn(Parcel parcel) {
        String string = parcel.readString();
        int i = zzel.zza;
        this.zza = string;
        this.zzb = (byte[]) zzel.zzH(parcel.createByteArray());
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzadn(String str, byte[] bArr, int i, int i2) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadn.class == obj.getClass()) {
            zzadn zzadnVar = (zzadn) obj;
            if (this.zza.equals(zzadnVar.zza) && Arrays.equals(this.zzb, zzadnVar.zzb) && this.zzc == zzadnVar.zzc && this.zzd == zzadnVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) + bl2.a(this.zza, 527, 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final /* synthetic */ void zza(zzbk zzbkVar) {
    }
}
