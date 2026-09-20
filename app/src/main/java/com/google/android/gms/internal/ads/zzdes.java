package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdes extends zzdih implements zzbol {
    public final Bundle x;

    public zzdes(Set set) {
        super(set);
        this.x = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zza(String str, Bundle bundle) {
        this.x.putAll(bundle);
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzder
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzflz) obj).zzv();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.x);
    }
}
