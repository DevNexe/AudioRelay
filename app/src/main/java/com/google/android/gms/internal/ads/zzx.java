package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ob7;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzx implements Comparator<zzw>, Parcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new ob7();
    public final zzw[] w;
    public int x;
    public final String zza;
    public final int zzb;

    public zzx(Parcel parcel) {
        this.zza = parcel.readString();
        zzw[] zzwVarArr = (zzw[]) zzel.zzH((zzw[]) parcel.createTypedArray(zzw.CREATOR));
        this.w = zzwVarArr;
        this.zzb = zzwVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzw zzwVar, zzw zzwVar2) {
        zzw zzwVar3 = zzwVar;
        zzw zzwVar4 = zzwVar2;
        UUID uuid = zzo.zza;
        if (uuid.equals(zzwVar3.zza)) {
            return !uuid.equals(zzwVar4.zza) ? 1 : 0;
        }
        return zzwVar3.zza.compareTo(zzwVar4.zza);
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
        if (obj != null && zzx.class == obj.getClass()) {
            zzx zzxVar = (zzx) obj;
            if (zzel.zzT(this.zza, zzxVar.zza) && Arrays.equals(this.w, zzxVar.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.x;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.w);
        this.x = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.w, 0);
    }

    public final zzw zza(int i) {
        return this.w[i];
    }

    public final zzx zzb(String str) {
        return zzel.zzT(this.zza, str) ? this : new zzx(str, false, this.w);
    }

    public zzx(String str, boolean z, zzw... zzwVarArr) {
        this.zza = str;
        zzwVarArr = z ? (zzw[]) zzwVarArr.clone() : zzwVarArr;
        this.w = zzwVarArr;
        this.zzb = zzwVarArr.length;
        Arrays.sort(zzwVarArr, this);
    }

    public zzx(String str, zzw... zzwVarArr) {
        this(null, true, zzwVarArr);
    }

    public zzx(List list) {
        this(null, false, (zzw[]) list.toArray(new zzw[0]));
    }
}
