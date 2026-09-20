package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcx extends zzarw implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        zze zzeVar = (zze) zzarx.zza(parcel, zze.CREATOR);
        zzarx.zzc(parcel);
        zze(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}
