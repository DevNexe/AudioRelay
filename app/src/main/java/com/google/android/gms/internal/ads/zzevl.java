package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevl implements zzeun {
    public final zzfyy a;

    public zzevl(zzcbc zzcbcVar, Context context, String str, zzfyy zzfyyVar) {
        this.a = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevm(new JSONObject());
            }
        });
    }
}
