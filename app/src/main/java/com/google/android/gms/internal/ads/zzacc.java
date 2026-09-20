package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ht5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacc implements zzbp {
    public static final Parcelable.Creator<zzacc> CREATOR;
    public int w;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzS("application/id3");
        zzadVar.zzY();
        zzad zzadVar2 = new zzad();
        zzadVar2.zzS("application/x-scte35");
        zzadVar2.zzY();
        CREATOR = new ht5();
    }

    public zzacc(Parcel parcel) {
        String string = parcel.readString();
        int i = zzel.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = (byte[]) zzel.zzH(parcel.createByteArray());
    }

    public zzacc(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacc.class == obj.getClass()) {
            zzacc zzaccVar = (zzacc) obj;
            if (this.zzc == zzaccVar.zzc && this.zzd == zzaccVar.zzd && zzel.zzT(this.zza, zzaccVar.zza) && zzel.zzT(this.zzb, zzaccVar.zzb) && Arrays.equals(this.zze, zzaccVar.zze)) {
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
        String str = this.zza;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.zzc;
        long j2 = this.zzd;
        int iHashCode3 = ((((((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.zze);
        this.w = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final /* synthetic */ void zza(zzbk zzbkVar) {
    }
}
