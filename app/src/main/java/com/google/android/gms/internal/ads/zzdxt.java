package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzdxt extends zzdxv {
    public zzdxt(Executor executor, zzcgs zzcgsVar, zzfih zzfihVar, zzfij zzfijVar) {
        super(executor, zzcgsVar, zzfijVar);
        zzfihVar.zza(this.a);
    }

    public final Map zza() {
        return new HashMap(this.a);
    }
}
