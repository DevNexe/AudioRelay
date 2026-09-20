package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cu5;
import defpackage.qc0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadq implements zzbp {
    public static final Parcelable.Creator<zzadq> CREATOR = new cu5();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzadq(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    public /* synthetic */ zzadq(Parcel parcel) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadq.class == obj.getClass()) {
            zzadq zzadqVar = (zzadq) obj;
            if (this.zza == zzadqVar.zza && this.zzb == zzadqVar.zzb && this.zzc == zzadqVar.zzc && this.zzd == zzadqVar.zzd && this.zze == zzadqVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        long j2 = this.zzb;
        long j3 = this.zzc;
        long j4 = this.zzd;
        long j5 = this.zze;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.zza;
        long j2 = this.zzb;
        long j3 = this.zzc;
        long j4 = this.zzd;
        long j5 = this.zze;
        StringBuilder sbB = qc0.b("Motion photo metadata: photoStartPosition=", j, ", photoSize=");
        sbB.append(j2);
        sbB.append(", photoPresentationTimestampUs=");
        sbB.append(j3);
        sbB.append(", videoStartPosition=");
        sbB.append(j4);
        sbB.append(", videoSize=");
        sbB.append(j5);
        return sbB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final /* synthetic */ void zza(zzbk zzbkVar) {
    }
}
