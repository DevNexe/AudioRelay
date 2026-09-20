package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdda extends zzdih implements zzddb {
    public zzdda(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdcz
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzddb) obj).zza(zzeVar);
            }
        });
    }
}
