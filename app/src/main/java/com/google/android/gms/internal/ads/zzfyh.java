package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfyh extends zzfum implements Future {
    @Override // com.google.android.gms.internal.ads.zzfum
    public /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    public abstract Future c();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return c().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return c().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return c().get(j, timeUnit);
    }
}
