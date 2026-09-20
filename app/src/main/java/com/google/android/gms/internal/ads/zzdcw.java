package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdcw extends zzdih implements com.google.android.gms.ads.internal.client.zza {
    public zzdcw(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdcv
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
