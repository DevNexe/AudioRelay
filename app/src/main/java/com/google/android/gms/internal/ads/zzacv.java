package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.i5;
import defpackage.qt5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacv extends zzada {
    public static final Parcelable.Creator<zzacv> CREATOR = new qt5();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzacv(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = zzel.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = (byte[]) zzel.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacv.class == obj.getClass()) {
            zzacv zzacvVar = (zzacv) obj;
            if (zzel.zzT(this.zza, zzacvVar.zza) && zzel.zzT(this.zzb, zzacvVar.zzb) && zzel.zzT(this.zzc, zzacvVar.zzc) && Arrays.equals(this.zzd, zzacvVar.zzd)) {
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
        return Arrays.hashCode(this.zzd) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = this.zzc;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        return i5.b(sb, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzacv(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
