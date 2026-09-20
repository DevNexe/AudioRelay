package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeoz implements zzeum {
    public final String a;

    public zzeoz(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
