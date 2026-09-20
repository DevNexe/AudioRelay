package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.v06;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaur implements Comparator<zzauq>, Parcelable {
    public static final Parcelable.Creator<zzaur> CREATOR = new v06();
    public final zzauq[] w;
    public int x;
    public final int zza;

    public zzaur(Parcel parcel) {
        zzauq[] zzauqVarArr = (zzauq[]) parcel.createTypedArray(zzauq.CREATOR);
        this.w = zzauqVarArr;
        this.zza = zzauqVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzauq zzauqVar, zzauq zzauqVar2) {
        zzauq zzauqVar3 = zzauqVar;
        zzauq zzauqVar4 = zzauqVar2;
        UUID uuid = zzasd.zzb;
        if (uuid.equals(zzauqVar3.x)) {
            return !uuid.equals(zzauqVar4.x) ? 1 : 0;
        }
        return zzauqVar3.x.compareTo(zzauqVar4.x);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaur.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.w, ((zzaur) obj).w);
    }

    public final int hashCode() {
        int i = this.x;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.w);
        this.x = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.w, 0);
    }

    public final zzauq zza(int i) {
        return this.w[i];
    }

    public zzaur(List list) {
        this(false, (zzauq[]) list.toArray(new zzauq[list.size()]));
    }

    public zzaur(boolean z, zzauq... zzauqVarArr) {
        zzauqVarArr = z ? (zzauq[]) zzauqVarArr.clone() : zzauqVarArr;
        Arrays.sort(zzauqVarArr, this);
        int i = 1;
        while (true) {
            int length = zzauqVarArr.length;
            if (i >= length) {
                this.w = zzauqVarArr;
                this.zza = length;
                return;
            } else {
                if (zzauqVarArr[i - 1].x.equals(zzauqVarArr[i].x)) {
                    throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(zzauqVarArr[i].x)));
                }
                i++;
            }
        }
    }

    public zzaur(zzauq... zzauqVarArr) {
        this(true, zzauqVarArr);
    }
}
