package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface zzzm {
    public static final zzzm zzb = new zzzm() { // from class: com.google.android.gms.internal.ads.zzzk
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            int i = zzzl.zza;
            return new zzzf[0];
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };

    zzzf[] zza();

    zzzf[] zzb(Uri uri, Map map);
}
