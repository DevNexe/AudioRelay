package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzarw;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbv extends zzarw implements zzbw {
    public static zzbw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof zzbw ? (zzbw) iInterfaceQueryLocalInterface : new zzbu(iBinder);
    }
}
