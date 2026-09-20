package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepp implements zzeum {
    public final Bundle a;

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.a;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", bundle2);
    }
}
