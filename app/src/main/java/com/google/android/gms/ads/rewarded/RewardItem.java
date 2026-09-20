package com.google.android.gms.ads.rewarded;

import defpackage.sy4;

/* JADX INFO: loaded from: classes.dex */
public interface RewardItem {
    public static final RewardItem DEFAULT_REWARD = new sy4((Object) null);

    int getAmount();

    String getType();
}
