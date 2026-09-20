package com.google.android.gms.internal.ads;

import defpackage.p86;
import defpackage.q86;
import defpackage.r86;
import defpackage.s86;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcha {
    public static final zzfyy zza;
    public static final zzfyy zzb;
    public static final zzfyy zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfyy zze;
    public static final zzfyy zzf;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zza = new s86((Executor) new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, timeUnit, new SynchronousQueue(), new q86("Default")));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new q86("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zzb = new s86((Executor) threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new q86("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        zzc = new s86((Executor) threadPoolExecutor2);
        zzd = new p86(new q86("Schedule"));
        zze = new s86(new r86());
        zzf = new s86(zzfze.zzb());
    }
}
