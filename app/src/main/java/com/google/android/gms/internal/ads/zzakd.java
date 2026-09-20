package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakd {
    public final AtomicInteger a;
    public final HashSet b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final zzajk e;
    public final zzajt f;
    public final zzaju[] g;
    public zzajm h;
    public final ArrayList i;
    public final ArrayList j;
    public final zzajr k;

    public zzakd(zzajk zzajkVar, zzajt zzajtVar, int i) {
        zzajr zzajrVar = new zzajr(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.e = zzajkVar;
        this.f = zzajtVar;
        this.g = new zzaju[4];
        this.k = zzajrVar;
    }

    public final void a() {
        synchronized (this.j) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((zzakb) it.next()).zza();
            }
        }
    }

    public final zzaka zza(zzaka zzakaVar) {
        zzakaVar.zzf(this);
        synchronized (this.b) {
            this.b.add(zzakaVar);
        }
        zzakaVar.zzg(this.a.incrementAndGet());
        zzakaVar.zzm("add-to-queue");
        a();
        this.c.add(zzakaVar);
        return zzakaVar;
    }

    public final void zzd() {
        zzaju[] zzajuVarArr;
        zzajm zzajmVar = this.h;
        if (zzajmVar != null) {
            zzajmVar.zzb();
        }
        int i = 0;
        while (true) {
            zzajuVarArr = this.g;
            if (i >= 4) {
                break;
            }
            zzaju zzajuVar = zzajuVarArr[i];
            if (zzajuVar != null) {
                zzajuVar.zza();
            }
            i++;
        }
        PriorityBlockingQueue priorityBlockingQueue = this.c;
        PriorityBlockingQueue priorityBlockingQueue2 = this.d;
        zzajm zzajmVar2 = new zzajm(priorityBlockingQueue, priorityBlockingQueue2, this.e, this.k, null);
        this.h = zzajmVar2;
        zzajmVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzaju zzajuVar2 = new zzaju(priorityBlockingQueue2, this.f, this.e, this.k, null);
            zzajuVarArr[i2] = zzajuVar2;
            zzajuVar2.start();
        }
    }
}
