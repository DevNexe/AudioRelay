package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfhh {
    public static final zzfyx d = zzfyo.zzi(null);
    public final zzfyy a;
    public final ScheduledExecutorService b;
    public final zzfhi c;

    public zzfhh(zzfyy zzfyyVar, ScheduledExecutorService scheduledExecutorService, zzfhi zzfhiVar) {
        this.a = zzfyyVar;
        this.b = scheduledExecutorService;
        this.c = zzfhiVar;
    }

    public abstract String a(Object obj);

    public final zzfgx zza(Object obj, zzfyx... zzfyxVarArr) {
        return new zzfgx(this, obj, Arrays.asList(zzfyxVarArr));
    }

    public final zzfhg zzb(Object obj, zzfyx zzfyxVar) {
        return new zzfhg(this, obj, zzfyxVar, Collections.singletonList(zzfyxVar), zzfyxVar);
    }
}
