package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ot5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacr extends zzada {
    public static final Parcelable.Creator<zzacr> CREATOR = new ot5();
    public final zzada[] w;
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;

    public zzacr(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = zzel.zza;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = (String[]) zzel.zzH(parcel.createStringArray());
        int i2 = parcel.readInt();
        this.w = new zzada[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.w[i3] = (zzada) parcel.readParcelable(zzada.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacr.class == obj.getClass()) {
            zzacr zzacrVar = (zzacr) obj;
            if (this.zzb == zzacrVar.zzb && this.zzc == zzacrVar.zzc && zzel.zzT(this.zza, zzacrVar.zza) && Arrays.equals(this.zzd, zzacrVar.zzd) && Arrays.equals(this.w, zzacrVar.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31;
        String str = this.zza;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        zzada[] zzadaVarArr = this.w;
        parcel.writeInt(zzadaVarArr.length);
        for (zzada zzadaVar : zzadaVarArr) {
            parcel.writeParcelable(zzadaVar, 0);
        }
    }

    public zzacr(String str, boolean z, boolean z2, String[] strArr, zzada[] zzadaVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.w = zzadaVarArr;
    }
}
