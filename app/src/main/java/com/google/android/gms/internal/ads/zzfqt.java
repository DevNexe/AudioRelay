package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfqt extends zzarw implements zzfqu {
    public zzfqt() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzarx.zza(parcel, Bundle.CREATOR);
        zzarx.zzc(parcel);
        zzb(bundle);
        return true;
    }
}
