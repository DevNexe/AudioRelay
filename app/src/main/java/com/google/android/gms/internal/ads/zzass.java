package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.GM;
import defpackage.e06;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzass implements Parcelable {
    public static final Parcelable.Creator<zzass> CREATOR = new e06();
    public int w;
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final zzaxd zzd;
    public final String zze;
    public final String zzf;
    public final int zzg;
    public final List zzh;
    public final zzaur zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final float zzn;
    public final int zzo;
    public final byte[] zzp;
    public final zzbaq zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final int zzu;
    public final int zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    public zzass(Parcel parcel) {
        this.zza = parcel.readString();
        this.zze = parcel.readString();
        this.zzf = parcel.readString();
        this.zzc = parcel.readString();
        this.zzb = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzk = parcel.readInt();
        this.zzl = parcel.readFloat();
        this.zzm = parcel.readInt();
        this.zzn = parcel.readFloat();
        this.zzp = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzo = parcel.readInt();
        this.zzq = (zzbaq) parcel.readParcelable(zzbaq.class.getClassLoader());
        this.zzr = parcel.readInt();
        this.zzs = parcel.readInt();
        this.zzt = parcel.readInt();
        this.zzu = parcel.readInt();
        this.zzv = parcel.readInt();
        this.zzx = parcel.readInt();
        this.zzy = parcel.readString();
        this.zzz = parcel.readInt();
        this.zzw = parcel.readLong();
        int i = parcel.readInt();
        this.zzh = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.zzh.add(parcel.createByteArray());
        }
        this.zzi = (zzaur) parcel.readParcelable(zzaur.class.getClassLoader());
        this.zzd = (zzaxd) parcel.readParcelable(zzaxd.class.getClassLoader());
    }

    @TargetApi(16)
    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static zzass zzg(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, zzaur zzaurVar, int i5, String str4) {
        return zzh(str, str2, null, -1, -1, i3, i4, -1, -1, -1, null, zzaurVar, 0, str4, null);
    }

    public static zzass zzh(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, zzaur zzaurVar, int i8, String str4, zzaxd zzaxdVar) {
        return new zzass(str, null, str2, null, -1, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i8, str4, -1, Long.MAX_VALUE, list, zzaurVar, null);
    }

    public static zzass zzi(String str, String str2, String str3, int i, List list, String str4, zzaur zzaurVar) {
        return new zzass(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzaurVar, null);
    }

    public static zzass zzj(String str, String str2, String str3, int i, zzaur zzaurVar) {
        return new zzass(str, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzaurVar, null);
    }

    public static zzass zzk(String str, String str2, String str3, int i, int i2, String str4, int i3, zzaur zzaurVar, long j, List list) {
        return new zzass(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzaurVar, null);
    }

    public static zzass zzl(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, int i5, float f2, byte[] bArr, int i6, zzbaq zzbaqVar, zzaur zzaurVar) {
        return new zzass(str, null, str2, null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzbaqVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzaurVar, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzass.class == obj.getClass()) {
            zzass zzassVar = (zzass) obj;
            if (this.zzb == zzassVar.zzb && this.zzg == zzassVar.zzg && this.zzj == zzassVar.zzj && this.zzk == zzassVar.zzk && this.zzl == zzassVar.zzl && this.zzm == zzassVar.zzm && this.zzn == zzassVar.zzn && this.zzo == zzassVar.zzo && this.zzr == zzassVar.zzr && this.zzs == zzassVar.zzs && this.zzt == zzassVar.zzt && this.zzu == zzassVar.zzu && this.zzv == zzassVar.zzv && this.zzw == zzassVar.zzw && this.zzx == zzassVar.zzx && zzban.zzo(this.zza, zzassVar.zza) && zzban.zzo(this.zzy, zzassVar.zzy) && this.zzz == zzassVar.zzz && zzban.zzo(this.zze, zzassVar.zze) && zzban.zzo(this.zzf, zzassVar.zzf) && zzban.zzo(this.zzc, zzassVar.zzc) && zzban.zzo(this.zzi, zzassVar.zzi) && zzban.zzo(this.zzd, zzassVar.zzd) && zzban.zzo(this.zzq, zzassVar.zzq) && Arrays.equals(this.zzp, zzassVar.zzp) && this.zzh.size() == zzassVar.zzh.size()) {
                for (int i = 0; i < this.zzh.size(); i++) {
                    if (!Arrays.equals((byte[]) this.zzh.get(i), (byte[]) zzassVar.zzh.get(i))) {
                        return false;
                    }
                }
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
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.zze;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zzf;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zzc;
        int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.zzb) * 31) + this.zzj) * 31) + this.zzk) * 31) + this.zzr) * 31) + this.zzs) * 31;
        String str5 = this.zzy;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.zzz) * 31;
        zzaur zzaurVar = this.zzi;
        int iHashCode6 = (iHashCode5 + (zzaurVar == null ? 0 : zzaurVar.hashCode())) * 31;
        zzaxd zzaxdVar = this.zzd;
        int iHashCode7 = iHashCode6 + (zzaxdVar != null ? zzaxdVar.hashCode() : 0);
        this.w = iHashCode7;
        return iHashCode7;
    }

    public final String toString() {
        return "Format(" + this.zza + ", " + this.zze + ", " + this.zzf + ", " + this.zzb + ", " + this.zzy + ", [" + this.zzj + ", " + this.zzk + ", " + this.zzl + "], [" + this.zzr + ", " + this.zzs + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzg);
        parcel.writeInt(this.zzj);
        parcel.writeInt(this.zzk);
        parcel.writeFloat(this.zzl);
        parcel.writeInt(this.zzm);
        parcel.writeFloat(this.zzn);
        parcel.writeInt(this.zzp != null ? 1 : 0);
        byte[] bArr = this.zzp;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzo);
        parcel.writeParcelable(this.zzq, i);
        parcel.writeInt(this.zzr);
        parcel.writeInt(this.zzs);
        parcel.writeInt(this.zzt);
        parcel.writeInt(this.zzu);
        parcel.writeInt(this.zzv);
        parcel.writeInt(this.zzx);
        parcel.writeString(this.zzy);
        parcel.writeInt(this.zzz);
        parcel.writeLong(this.zzw);
        int size = this.zzh.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.zzh.get(i2));
        }
        parcel.writeParcelable(this.zzi, 0);
        parcel.writeParcelable(this.zzd, 0);
    }

    public final int zza() {
        int i;
        int i2 = this.zzj;
        if (i2 == -1 || (i = this.zzk) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat zzb() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzf);
        String str = this.zzy;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.zzg);
        a(mediaFormat, "width", this.zzj);
        a(mediaFormat, "height", this.zzk);
        float f = this.zzl;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        a(mediaFormat, "rotation-degrees", this.zzm);
        a(mediaFormat, "channel-count", this.zzr);
        a(mediaFormat, "sample-rate", this.zzs);
        a(mediaFormat, "encoder-delay", this.zzu);
        a(mediaFormat, "encoder-padding", this.zzv);
        for (int i = 0; i < this.zzh.size(); i++) {
            mediaFormat.setByteBuffer(GM.a("csd-", i), ByteBuffer.wrap((byte[]) this.zzh.get(i)));
        }
        zzbaq zzbaqVar = this.zzq;
        if (zzbaqVar != null) {
            a(mediaFormat, "color-transfer", zzbaqVar.zzc);
            a(mediaFormat, "color-standard", zzbaqVar.zza);
            a(mediaFormat, "color-range", zzbaqVar.zzb);
            byte[] bArr = zzbaqVar.zzd;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final zzass zzc(zzaur zzaurVar) {
        return new zzass(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, zzaurVar, this.zzd);
    }

    public final zzass zzd(int i, int i2) {
        return new zzass(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, i, i2, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzass zze(int i) {
        return new zzass(this.zza, this.zze, this.zzf, this.zzc, this.zzb, i, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzass zzf(zzaxd zzaxdVar) {
        return new zzass(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, zzaxdVar);
    }

    public zzass(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzbaq zzbaqVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, zzaur zzaurVar, zzaxd zzaxdVar) {
        this.zza = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzc = str4;
        this.zzb = i;
        this.zzg = i2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = f;
        this.zzm = i5;
        this.zzn = f2;
        this.zzp = bArr;
        this.zzo = i6;
        this.zzq = zzbaqVar;
        this.zzr = i7;
        this.zzs = i8;
        this.zzt = i9;
        this.zzu = i10;
        this.zzv = i11;
        this.zzx = i12;
        this.zzy = str5;
        this.zzz = i13;
        this.zzw = j;
        this.zzh = list == null ? Collections.emptyList() : list;
        this.zzi = zzaurVar;
        this.zzd = zzaxdVar;
    }
}
