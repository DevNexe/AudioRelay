package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b26;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxd implements Parcelable {
    public static final Parcelable.Creator<zzaxd> CREATOR = new b26();
    public final zzaxc[] w;

    public zzaxd(Parcel parcel) {
        this.w = new zzaxc[parcel.readInt()];
        int i = 0;
        while (true) {
            zzaxc[] zzaxcVarArr = this.w;
            if (i >= zzaxcVarArr.length) {
                return;
            }
            zzaxcVarArr[i] = (zzaxc) parcel.readParcelable(zzaxc.class.getClassLoader());
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaxd.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.w, ((zzaxd) obj).w);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzaxc[] zzaxcVarArr = this.w;
        parcel.writeInt(zzaxcVarArr.length);
        for (zzaxc zzaxcVar : zzaxcVarArr) {
            parcel.writeParcelable(zzaxcVar, 0);
        }
    }

    public final int zza() {
        return this.w.length;
    }

    public final zzaxc zzb(int i) {
        return this.w[i];
    }

    public zzaxd(List list) {
        zzaxc[] zzaxcVarArr = new zzaxc[list.size()];
        this.w = zzaxcVarArr;
        list.toArray(zzaxcVarArr);
    }
}
