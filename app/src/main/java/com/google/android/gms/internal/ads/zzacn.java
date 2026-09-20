package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl2;
import defpackage.mt5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacn extends zzada {
    public static final Parcelable.Creator<zzacn> CREATOR = new mt5();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzacn(Parcel parcel) {
        String string = parcel.readString();
        int i = zzel.zza;
        super(string);
        this.zza = (byte[]) zzel.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacn.class == obj.getClass()) {
            zzacn zzacnVar = (zzacn) obj;
            if (this.zzf.equals(zzacnVar.zzf) && Arrays.equals(this.zza, zzacnVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza) + bl2.a(this.zzf, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzacn(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
