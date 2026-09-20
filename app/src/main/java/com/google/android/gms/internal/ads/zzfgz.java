package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfgz {
    public static final zzfhg zza(Callable callable, Object obj, zzfhh zzfhhVar) {
        return zzb(callable, zzfhhVar.a, obj, zzfhhVar);
    }

    public static final zzfhg zzb(Callable callable, zzfyy zzfyyVar, Object obj, zzfhh zzfhhVar) {
        return new zzfhg(zzfhhVar, obj, zzfhh.d, Collections.emptyList(), zzfyyVar.zzb(callable));
    }

    public static final zzfhg zzc(zzfyx zzfyxVar, Object obj, zzfhh zzfhhVar) {
        return new zzfhg(zzfhhVar, obj, zzfhh.d, Collections.emptyList(), zzfyxVar);
    }

    public static final zzfhg zzd(final zzfgt zzfgtVar, zzfyy zzfyyVar, Object obj, zzfhh zzfhhVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfgy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfgtVar.zza();
                return null;
            }
        }, zzfyyVar, obj, zzfhhVar);
    }
}
