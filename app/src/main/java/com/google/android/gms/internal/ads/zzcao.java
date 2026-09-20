package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzcao extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzcao> CREATOR = new zzcap();
    public final boolean zza;
    public final List zzb;

    public zzcao() {
        this(false, Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.z(parcel, 2, this.zza);
        Th.L(parcel, 3, this.zzb);
        Th.X(parcel, iP);
    }

    public zzcao(boolean z, List list) {
        this.zza = z;
        this.zzb = list;
    }
}
