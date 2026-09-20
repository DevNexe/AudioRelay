package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import defpackage.j95;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaju extends Thread {
    public final zzajr A;
    public final BlockingQueue w;
    public final zzajt x;
    public final zzajk y;
    public volatile boolean z = false;

    public zzaju(BlockingQueue blockingQueue, zzajt zzajtVar, zzajk zzajkVar, zzajr zzajrVar, byte[] bArr) {
        this.w = blockingQueue;
        this.x = zzajtVar;
        this.y = zzajkVar;
        this.A = zzajrVar;
    }

    public final void a() {
        j95 j95Var;
        zzajr zzajrVar = this.A;
        zzaka zzakaVar = (zzaka) this.w.take();
        SystemClock.elapsedRealtime();
        zzakaVar.g(3);
        try {
            try {
                zzakaVar.zzm("network-queue-take");
                zzakaVar.zzw();
                TrafficStats.setThreadStatsTag(zzakaVar.zzc());
                zzajw zzajwVarZza = this.x.zza(zzakaVar);
                zzakaVar.zzm("network-http-complete");
                if (zzajwVarZza.zze && zzakaVar.zzv()) {
                    zzakaVar.d("not-modified");
                    synchronized (zzakaVar.A) {
                        j95Var = zzakaVar.G;
                    }
                    if (j95Var != null) {
                        j95Var.b(zzakaVar);
                    }
                    zzakaVar.g(4);
                    return;
                }
                zzakg zzakgVarA = zzakaVar.a(zzajwVarZza);
                zzakaVar.zzm("network-parse-complete");
                if (zzakgVarA.zzb != null) {
                    this.y.zzd(zzakaVar.zzj(), zzakgVarA.zzb);
                    zzakaVar.zzm("network-cache-written");
                }
                zzakaVar.zzq();
                zzajrVar.zzb(zzakaVar, zzakgVarA, null);
                zzakaVar.e(zzakgVarA);
                zzakaVar.g(4);
            } catch (zzakj e) {
                SystemClock.elapsedRealtime();
                zzajrVar.zza(zzakaVar, e);
                synchronized (zzakaVar.A) {
                    j95 j95Var2 = zzakaVar.G;
                    if (j95Var2 != null) {
                        j95Var2.b(zzakaVar);
                    }
                    zzakaVar.g(4);
                }
            } catch (Exception e2) {
                zzakm.zzc(e2, "Unhandled exception %s", e2.toString());
                zzakj zzakjVar = new zzakj(e2);
                SystemClock.elapsedRealtime();
                zzajrVar.zza(zzakaVar, zzakjVar);
                synchronized (zzakaVar.A) {
                    j95 j95Var3 = zzakaVar.G;
                    if (j95Var3 != null) {
                        j95Var3.b(zzakaVar);
                    }
                    zzakaVar.g(4);
                }
            }
        } catch (Throwable th) {
            zzakaVar.g(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzakm.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.z = true;
        interrupt();
    }
}
