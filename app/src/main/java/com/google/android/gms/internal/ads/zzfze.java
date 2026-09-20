package com.google.android.gms.internal.ads;

import defpackage.fq6;
import defpackage.kq6;
import defpackage.nq6;
import defpackage.s86;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfze {
    public static Executor a(Executor executor, qc qcVar) {
        executor.getClass();
        return executor == fq6.INSTANCE ? executor : new kq6(executor, qcVar);
    }

    public static zzfyy zza(ExecutorService executorService) {
        if (executorService instanceof zzfyy) {
            return (zzfyy) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new nq6((ScheduledExecutorService) executorService) : new s86(executorService);
    }

    public static Executor zzb() {
        return fq6.INSTANCE;
    }
}
