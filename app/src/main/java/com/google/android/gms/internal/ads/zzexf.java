package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzexf implements zzeun {
    public final zzfyy a;

    public zzexf(zzfyy zzfyyVar) {
        this.a = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzI);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzJ)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, com.google.android.gms.ads.internal.util.zzch.zza(str2));
                        }
                    }
                }
                return new zzexg(map);
            }
        });
    }
}
