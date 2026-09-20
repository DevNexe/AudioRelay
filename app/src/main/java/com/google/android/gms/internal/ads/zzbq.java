package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.x46;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbq implements Parcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new x46();
    public final zzbp[] w;

    public zzbq(Parcel parcel) {
        this.w = new zzbp[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbp[] zzbpVarArr = this.w;
            if (i >= zzbpVarArr.length) {
                return;
            }
            zzbpVarArr[i] = (zzbp) parcel.readParcelable(zzbp.class.getClassLoader());
            i++;
        }
    }

    public zzbq(zzbp... zzbpVarArr) {
        this.w = zzbpVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbq.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.w, ((zzbq) obj).w);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.w);
    }

    public final String toString() {
        return "entries=".concat(String.valueOf(Arrays.toString(this.w)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzbp[] zzbpVarArr = this.w;
        parcel.writeInt(zzbpVarArr.length);
        for (zzbp zzbpVar : zzbpVarArr) {
            parcel.writeParcelable(zzbpVar, 0);
        }
    }

    public final int zza() {
        return this.w.length;
    }

    public final zzbp zzb(int i) {
        return this.w[i];
    }

    public final zzbq zzc(zzbp... zzbpVarArr) {
        return zzbpVarArr.length == 0 ? this : new zzbq((zzbp[]) zzel.zzad(this.w, zzbpVarArr));
    }

    public final zzbq zzd(zzbq zzbqVar) {
        return zzbqVar == null ? this : zzc(zzbqVar.w);
    }

    public zzbq(List list) {
        this.w = (zzbp[]) list.toArray(new zzbp[0]);
    }
}
