package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblt extends NativeAd.AdChoicesInfo {
    public final zzbls a;
    public final ArrayList b = new ArrayList();
    public final String c;

    public zzblt(zzbls zzblsVar) {
        zzbma zzblyVar;
        IBinder iBinder;
        this.a = zzblsVar;
        try {
            this.c = zzblsVar.zzg();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            this.c = "";
        }
        try {
            for (Object obj : zzblsVar.zzh()) {
                if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                    zzblyVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzblyVar = iInterfaceQueryLocalInterface instanceof zzbma ? (zzbma) iInterfaceQueryLocalInterface : new zzbly(iBinder);
                }
                if (zzblyVar != null) {
                    this.b.add(new zzbmb(zzblyVar));
                }
            }
        } catch (RemoteException e2) {
            zzcgn.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.c;
    }
}
