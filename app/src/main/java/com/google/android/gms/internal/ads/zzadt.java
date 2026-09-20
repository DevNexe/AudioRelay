package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.du5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadt implements zzbp {
    public static final Parcelable.Creator<zzadt> CREATOR = new du5();
    public final float zza;
    public final int zzb;

    public zzadt(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    public /* synthetic */ zzadt(Parcel parcel) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadt.class == obj.getClass()) {
            zzadt zzadtVar = (zzadt) obj;
            if (this.zza == zzadtVar.zza && this.zzb == zzadtVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final /* synthetic */ void zza(zzbk zzbkVar) {
    }
}
