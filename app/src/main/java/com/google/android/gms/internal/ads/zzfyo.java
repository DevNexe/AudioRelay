package com.google.android.gms.internal.ads;

import defpackage.aq6;
import defpackage.fq6;
import defpackage.hq6;
import defpackage.oq6;
import defpackage.qq6;
import defpackage.rp6;
import defpackage.sp6;
import defpackage.tb7;
import defpackage.tq6;
import defpackage.up6;
import defpackage.vp6;
import defpackage.wp6;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfyo {
    public static zzfyn zza(Iterable iterable) {
        return new zzfyn(false, zzfuv.zzl(iterable));
    }

    @SafeVarargs
    public static zzfyn zzb(zzfyx... zzfyxVarArr) {
        return new zzfyn(false, zzfuv.zzn(zzfyxVarArr));
    }

    public static zzfyn zzc(Iterable iterable) {
        return new zzfyn(true, zzfuv.zzl(iterable));
    }

    @SafeVarargs
    public static zzfyn zzd(zzfyx... zzfyxVarArr) {
        return new zzfyn(true, zzfuv.zzn(zzfyxVarArr));
    }

    public static zzfyx zze(Iterable iterable) {
        return new aq6(zzfuv.zzl(iterable));
    }

    public static zzfyx zzf(zzfyx zzfyxVar, Class cls, zzfru zzfruVar, Executor executor) {
        sp6 sp6Var = new sp6(zzfyxVar, cls, zzfruVar);
        zzfyxVar.zzc(sp6Var, zzfze.a(executor, sp6Var));
        return sp6Var;
    }

    public static zzfyx zzg(zzfyx zzfyxVar, Class cls, zzfxv zzfxvVar, Executor executor) {
        rp6 rp6Var = new rp6(zzfyxVar, cls, zzfxvVar);
        zzfyxVar.zzc(rp6Var, zzfze.a(executor, rp6Var));
        return rp6Var;
    }

    public static zzfyx zzh(Throwable th) {
        th.getClass();
        return new Z(th);
    }

    public static zzfyx zzi(Object obj) {
        return obj == null ? hq6.x : new hq6(obj);
    }

    public static zzfyx zzj() {
        return hq6.x;
    }

    public static zzfyx zzk(Callable callable, Executor executor) {
        tq6 tq6Var = new tq6(callable);
        executor.execute(tq6Var);
        return tq6Var;
    }

    public static zzfyx zzl(zzfxu zzfxuVar, Executor executor) {
        tq6 tq6Var = new tq6(zzfxuVar);
        executor.execute(tq6Var);
        return tq6Var;
    }

    public static zzfyx zzm(zzfyx zzfyxVar, zzfru zzfruVar, Executor executor) {
        int i = wp6.F;
        zzfruVar.getClass();
        vp6 vp6Var = new vp6(zzfyxVar, zzfruVar);
        zzfyxVar.zzc(vp6Var, zzfze.a(executor, vp6Var));
        return vp6Var;
    }

    public static zzfyx zzn(zzfyx zzfyxVar, zzfxv zzfxvVar, Executor executor) {
        int i = wp6.F;
        executor.getClass();
        up6 up6Var = new up6(zzfyxVar, zzfxvVar);
        zzfyxVar.zzc(up6Var, zzfze.a(executor, up6Var));
        return up6Var;
    }

    public static zzfyx zzo(zzfyx zzfyxVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zzfyxVar.isDone()) {
            return zzfyxVar;
        }
        qq6 qq6Var = new qq6(zzfyxVar);
        oq6 oq6Var = new oq6(qq6Var);
        qq6Var.E = scheduledExecutorService.schedule(oq6Var, j, timeUnit);
        zzfyxVar.zzc(oq6Var, fq6.INSTANCE);
        return qq6Var;
    }

    public static Object zzp(Future future) {
        if (future.isDone()) {
            return zzfzp.zza(future);
        }
        throw new IllegalStateException(zzfsu.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzfzp.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfyd((Error) cause);
            }
            throw new zzfzo(cause);
        }
    }

    public static void zzr(zzfyx zzfyxVar, zzfyk zzfykVar, Executor executor) {
        zzfykVar.getClass();
        zzfyxVar.zzc(new tb7(6, zzfyxVar, zzfykVar), executor);
    }
}
