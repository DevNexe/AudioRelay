package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfyj extends zzfyh implements zzfyx {
    @Override // com.google.android.gms.internal.ads.zzfyh
    public /* bridge */ /* synthetic */ Future c() {
        throw null;
    }

    public abstract zzfyx e();

    @Override // com.google.android.gms.internal.ads.zzfyx
    public final void zzc(Runnable runnable, Executor executor) {
        e().zzc(runnable, executor);
    }
}
