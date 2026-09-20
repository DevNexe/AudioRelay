package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcda extends zzccf {
    public final String w;
    public final int x;

    public zzcda(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccg
    public final int zze() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzccg
    public final String zzf() {
        return this.w;
    }

    public zzcda(String str, int i) {
        this.w = str;
        this.x = i;
    }
}
