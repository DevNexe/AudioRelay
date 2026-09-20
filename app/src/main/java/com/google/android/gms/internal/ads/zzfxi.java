package com.google.android.gms.internal.ads;

import defpackage.tq6;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfxi extends AbstractExecutorService implements zzfyy {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new tq6(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzfyx) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
    public final zzfyx zza(Runnable runnable) {
        return (zzfyx) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
    public final zzfyx zzb(Callable callable) {
        return (zzfyx) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new tq6(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzfyx) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (zzfyx) super.submit(callable);
    }
}
