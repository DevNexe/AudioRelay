package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewa implements zzeun {
    public final zzfyy a;

    public zzewa(zzbea zzbeaVar, zzfyy zzfyyVar, Context context, byte[] bArr) {
        this.a = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzewb(new JSONObject());
            }
        });
    }
}
