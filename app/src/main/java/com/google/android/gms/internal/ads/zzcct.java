package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcct implements RewardItem {
    public final zzccg w;

    public zzcct(zzccg zzccgVar) {
        this.w = zzccgVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzccg zzccgVar = this.w;
        if (zzccgVar != null) {
            try {
                return zzccgVar.zze();
            } catch (RemoteException e) {
                zzcgn.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzccg zzccgVar = this.w;
        if (zzccgVar != null) {
            try {
                return zzccgVar.zzf();
            } catch (RemoteException e) {
                zzcgn.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
