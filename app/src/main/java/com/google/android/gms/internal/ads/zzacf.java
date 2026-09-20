package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl2;
import defpackage.it5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacf implements zzbp {
    public static final Parcelable.Creator<zzacf> CREATOR = new it5();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzacf(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public zzacf(Parcel parcel) {
        this.zza = parcel.readInt();
        String string = parcel.readString();
        int i = zzel.zza;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = (byte[]) zzel.zzH(parcel.createByteArray());
    }

    public static zzacf zzb(zzed zzedVar) {
        int iZze = zzedVar.zze();
        String strZzx = zzedVar.zzx(zzedVar.zze(), zzfrs.zza);
        String strZzx2 = zzedVar.zzx(zzedVar.zze(), zzfrs.zzc);
        int iZze2 = zzedVar.zze();
        int iZze3 = zzedVar.zze();
        int iZze4 = zzedVar.zze();
        int iZze5 = zzedVar.zze();
        int iZze6 = zzedVar.zze();
        byte[] bArr = new byte[iZze6];
        zzedVar.zzB(bArr, 0, iZze6);
        return new zzacf(iZze, strZzx, strZzx2, iZze2, iZze3, iZze4, iZze5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacf.class == obj.getClass()) {
            zzacf zzacfVar = (zzacf) obj;
            if (this.zza == zzacfVar.zza && this.zzb.equals(zzacfVar.zzb) && this.zzc.equals(zzacfVar.zzc) && this.zzd == zzacfVar.zzd && this.zze == zzacfVar.zze && this.zzf == zzacfVar.zzf && this.zzg == zzacfVar.zzg && Arrays.equals(this.zzh, zzacfVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzh) + ((((((((bl2.a(this.zzc, bl2.a(this.zzb, (this.zza + 527) * 31, 31), 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbk zzbkVar) {
        zzbkVar.zza(this.zzh, this.zza);
    }
}
