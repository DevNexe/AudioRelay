package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeon implements zzeum {
    public final boolean a;

    public zzeon(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.a ? "0" : "1");
    }
}
