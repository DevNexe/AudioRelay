package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import defpackage.Th;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbrx extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzbrx> CREATOR = new zzbry();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzbrx(int i, int i2, String str, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.zzb);
        Th.J(parcel, 2, this.zzc);
        Th.G(parcel, 3, this.zzd);
        Th.G(parcel, AdError.NETWORK_ERROR_CODE, this.zza);
        Th.X(parcel, iP);
    }
}
