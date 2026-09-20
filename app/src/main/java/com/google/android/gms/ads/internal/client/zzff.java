package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzff extends com5Fixed {
    public static final Parcelable.Creator<zzff> CREATOR = new zzfg();
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzff(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.z(parcel, 2, this.zza);
        Th.z(parcel, 3, this.zzb);
        Th.z(parcel, 4, this.zzc);
        Th.X(parcel, iP);
    }

    public zzff(boolean z, boolean z2, boolean z3) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
    }
}
