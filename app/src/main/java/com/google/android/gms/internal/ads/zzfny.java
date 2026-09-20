package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfny extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzfny> CREATOR = new zzfnz();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    public zzfny(byte[] bArr, int i, int i2) {
        this.zza = i;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.zza);
        Th.B(parcel, 2, this.zzb);
        Th.G(parcel, 3, this.zzc);
        Th.X(parcel, iP);
    }

    public zzfny(byte[] bArr, int i) {
        this(null, 1, 1);
    }
}
