package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzczj {
    public final List zza;

    public zzczj(zzczc zzczcVar) {
        this.zza = Collections.singletonList(zzfyo.zzi(zzczcVar));
    }

    public zzczj(List list) {
        this.zza = list;
    }

    public static zzegk zza(zzegk zzegkVar) {
        return new zzegl(zzegkVar, new zzfru() { // from class: com.google.android.gms.internal.ads.zzczi
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                return new zzczj((zzczc) obj);
            }
        });
    }
}
