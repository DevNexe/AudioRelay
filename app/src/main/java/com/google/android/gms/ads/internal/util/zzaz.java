package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzfem;
import com.google.android.gms.internal.ads.zzfsu;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends com5Fixed {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    public final String zza;
    public final int zzb;

    public zzaz(String str, int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static zzaz zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarZza = zzfem.zza(th);
        return new zzaz(zzfsu.zzd(th.getMessage()) ? zzeVarZza.zzb : th.getMessage(), zzeVarZza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.zza);
        Th.G(parcel, 2, this.zzb);
        Th.X(parcel, iP);
    }
}
