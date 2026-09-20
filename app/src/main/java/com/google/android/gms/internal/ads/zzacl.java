package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lt5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacl extends zzada {
    public static final Parcelable.Creator<zzacl> CREATOR = new lt5();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzacl(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = zzel.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = (byte[]) zzel.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacl.class == obj.getClass()) {
            zzacl zzaclVar = (zzacl) obj;
            if (this.zzc == zzaclVar.zzc && zzel.zzT(this.zza, zzaclVar.zza) && zzel.zzT(this.zzb, zzaclVar.zzb) && Arrays.equals(this.zzd, zzaclVar.zzd)) {
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

    @Override // com.google.android.gms.internal.ads.zzada
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzada, com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbk zzbkVar) {
        zzbkVar.zza(this.zzd, this.zzc);
    }

    public zzacl(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
