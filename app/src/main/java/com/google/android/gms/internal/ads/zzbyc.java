package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyc extends NativeAd.AdChoicesInfo {
    public final ArrayList a = new ArrayList();
    public final String b;

    public zzbyc(zzbls zzblsVar) {
        try {
            this.b = zzblsVar.zzg();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            this.b = "";
        }
        try {
            for (Object obj : zzblsVar.zzh()) {
                zzbma zzbmaVarZzg = obj instanceof IBinder ? zzblz.zzg((IBinder) obj) : null;
                if (zzbmaVarZzg != null) {
                    this.a.add(new zzbye(zzbmaVarZzg));
                }
            }
        } catch (RemoteException e2) {
            zzcgn.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.b;
    }
}
