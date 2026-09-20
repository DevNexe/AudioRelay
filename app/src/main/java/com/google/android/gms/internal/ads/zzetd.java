package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetd implements zzeum {
    public final Bundle a;

    public zzetd(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
