package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzddq extends zzdih {
    public boolean x;

    public zzddq(Set set) {
        super(set);
        this.x = false;
    }

    public final synchronized void zza() {
        if (this.x) {
            return;
        }
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzddp
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzdds) obj).zzl();
            }
        });
        this.x = true;
    }
}
