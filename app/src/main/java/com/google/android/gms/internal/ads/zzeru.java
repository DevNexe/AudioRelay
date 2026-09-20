package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeru implements zzeum {
    public final boolean a;

    public zzeru(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.a);
    }
}
