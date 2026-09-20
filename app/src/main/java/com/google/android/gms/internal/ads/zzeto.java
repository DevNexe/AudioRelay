package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeto implements zzeum {
    public final String a;

    public zzeto(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putString("rtb", this.a);
    }
}
