package com.google.android.gms.internal.ads;

import android.os.Process;
import defpackage.j95;
import defpackage.ta7;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class zzajm extends Thread {
    public static final boolean C = zzakm.zzb;
    public final j95 A;
    public final zzajr B;
    public final BlockingQueue w;
    public final BlockingQueue x;
    public final zzajk y;
    public volatile boolean z = false;

    public zzajm(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzajk zzajkVar, zzajr zzajrVar, byte[] bArr) {
        this.w = blockingQueue;
        this.x = blockingQueue2;
        this.y = zzajkVar;
        this.B = zzajrVar;
        this.A = new j95(this, blockingQueue2, zzajrVar);
    }

    public final void a() {
        zzajk zzajkVar = this.y;
        zzaka zzakaVar = (zzaka) this.w.take();
        zzakaVar.zzm("cache-queue-take");
        zzakaVar.g(1);
        int i = 2;
        try {
            zzakaVar.zzw();
            zzajj zzajjVarZza = zzajkVar.zza(zzakaVar.zzj());
            BlockingQueue blockingQueue = this.x;
            j95 j95Var = this.A;
            if (zzajjVarZza == null) {
                zzakaVar.zzm("cache-miss");
                if (!j95Var.c(zzakaVar)) {
                    blockingQueue.put(zzakaVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (zzajjVarZza.zze < jCurrentTimeMillis) {
                zzakaVar.zzm("cache-hit-expired");
                zzakaVar.zze(zzajjVarZza);
                if (!j95Var.c(zzakaVar)) {
                    blockingQueue.put(zzakaVar);
                }
                return;
            }
            zzakaVar.zzm("cache-hit");
            zzakg zzakgVarA = zzakaVar.a(new zzajw(zzajjVarZza.zza, zzajjVarZza.zzg));
            zzakaVar.zzm("cache-hit-parsed");
            if (!zzakgVarA.zzc()) {
                zzakaVar.zzm("cache-parsing-failed");
                zzajkVar.zzc(zzakaVar.zzj(), true);
                zzakaVar.zze(null);
                if (!j95Var.c(zzakaVar)) {
                    blockingQueue.put(zzakaVar);
                }
                return;
            }
            long j = zzajjVarZza.zzf;
            zzajr zzajrVar = this.B;
            if (j < jCurrentTimeMillis) {
                zzakaVar.zzm("cache-hit-refresh-needed");
                zzakaVar.zze(zzajjVarZza);
                zzakgVarA.zzd = true;
                if (j95Var.c(zzakaVar)) {
                    zzajrVar.zzb(zzakaVar, zzakgVarA, null);
                } else {
                    zzajrVar.zzb(zzakaVar, zzakgVarA, new ta7(this, zzakaVar, i));
                }
            } else {
                zzajrVar.zzb(zzakaVar, zzakgVarA, null);
            }
        } finally {
            zzakaVar.g(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C) {
            zzakm.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.y.zzb();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzakm.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.z = true;
        interrupt();
    }
}
