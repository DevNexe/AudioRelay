package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.yt5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadg extends zzada {
    public static final Parcelable.Creator<zzadg> CREATOR = new yt5();
    public final String zza;
    public final byte[] zzb;

    public zzadg(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = zzel.zza;
        this.zza = string;
        this.zzb = (byte[]) zzel.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadg.class == obj.getClass()) {
            zzadg zzadgVar = (zzadg) obj;
            if (zzel.zzT(this.zza, zzadgVar.zza) && Arrays.equals(this.zzb, zzadgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzb) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final String toString() {
        return defpackage.LPt6Fixed.a(this.zzf, ": owner=", this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzadg(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
