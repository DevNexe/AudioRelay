package defpackage;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzasd;
import com.google.android.gms.internal.ads.zzase;
import com.google.android.gms.internal.ads.zzasf;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzasn;
import com.google.android.gms.internal.ads.zzasu;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzatb;
import com.google.android.gms.internal.ads.zzatc;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayp;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzazb;
import com.google.android.gms.internal.ads.zzazd;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzcjt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class a06 implements zzasi {
    public final zzasx[] a;
    public final zzazd b;
    public final zzazb c;
    public final zz5 d;
    public final d06 e;
    public final CopyOnWriteArraySet f;
    public final zzatc g;
    public final zzatb h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public zzatd o;
    public Object p;
    public zzayp q;
    public zzazb r;
    public zzasw s;
    public zzasn t;
    public long u;

    @SuppressLint({"HandlerLeak"})
    public a06(zzasx[] zzasxVarArr, zzazd zzazdVar, zzcjt zzcjtVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.2 [" + zzban.zze + "]");
        this.a = zzasxVarArr;
        zzazdVar.getClass();
        this.b = zzazdVar;
        this.j = false;
        this.k = 1;
        this.f = new CopyOnWriteArraySet();
        zzazb zzazbVar = new zzazb(new zzayt[2], null);
        this.c = zzazbVar;
        this.o = zzatd.zza;
        this.g = new zzatc();
        this.h = new zzatb();
        this.q = zzayp.zza;
        this.r = zzazbVar;
        this.s = zzasw.zza;
        zz5 zz5Var = new zz5(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.d = zz5Var;
        zzasn zzasnVar = new zzasn(0, 0L);
        this.t = zzasnVar;
        this.e = new d06(zzasxVarArr, zzazdVar, zzcjtVar, this.j, zz5Var, zzasnVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final int zza() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final long zzb() {
        if (this.o.zzh() || this.l > 0) {
            return this.u;
        }
        this.o.zzd(this.t.zza, this.h, false);
        return zzasd.zzb(this.t.zzd) + zzasd.zzb(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final long zzc() {
        if (this.o.zzh() || this.l > 0) {
            return this.u;
        }
        this.o.zzd(this.t.zza, this.h, false);
        return zzasd.zzb(this.t.zzc) + zzasd.zzb(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final long zzd() {
        if (this.o.zzh()) {
            return -9223372036854775807L;
        }
        zzatd zzatdVar = this.o;
        if (!zzatdVar.zzh() && this.l <= 0) {
            this.o.zzd(this.t.zza, this.h, false);
        }
        return zzasd.zzb(zzatdVar.zzg(0, this.g, false).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zze(zzasf zzasfVar) {
        this.f.add(zzasfVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f A[LOOP:0: B:30:0x0059->B:32:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x007a A[ORIG_RETURN, RETURN] */
    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzf(zzash... zzashVarArr) {
        int i;
        Iterator it;
        d06 d06Var = this.e;
        boolean z = false;
        if (!(d06Var.d0 && d06Var.e0 > 0)) {
            synchronized (d06Var) {
                if (d06Var.M) {
                    Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                    return;
                }
                int i2 = d06Var.S;
                d06Var.S = i2 + 1;
                d06Var.A.obtainMessage(11, zzashVarArr).sendToTarget();
                while (d06Var.T <= i2) {
                    try {
                        d06Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                return;
            }
        }
        synchronized (d06Var) {
            try {
                if (!d06Var.M) {
                    int i3 = d06Var.S;
                    d06Var.S = i3 + 1;
                    d06Var.A.obtainMessage(11, zzashVarArr).sendToTarget();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long jElapsedRealtime2 = d06Var.e0;
                    long j = jElapsedRealtime + jElapsedRealtime2;
                    while (true) {
                        i = d06Var.T;
                        if (i > i3 || jElapsedRealtime2 <= 0) {
                            break;
                        }
                        try {
                            d06Var.wait(jElapsedRealtime2);
                        } catch (InterruptedException unused2) {
                            Thread.currentThread().interrupt();
                        }
                        jElapsedRealtime2 = j - SystemClock.elapsedRealtime();
                    }
                    if (i3 < i) {
                    }
                    if (z) {
                    }
                    it = this.f.iterator();
                    while (it.hasNext()) {
                        ((zzasf) it.next()).zzc(new zzase(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = true;
        if (z) {
            it = this.f.iterator();
            while (it.hasNext()) {
                ((zzasf) it.next()).zzc(new zzase(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzg() {
        this.e.c0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzh(int i) {
        this.e.e0 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzi() {
        this.e.d0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzj(zzaya zzayaVar) {
        boolean zZzh = this.o.zzh();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f;
        if (!zZzh || this.p != null) {
            this.o = zzatd.zza;
            this.p = null;
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((zzasf) it.next()).zzf(this.o, this.p);
            }
        }
        if (this.i) {
            this.i = false;
            this.q = zzayp.zza;
            this.r = this.c;
            this.b.zzd(null);
            Iterator it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                ((zzasf) it2.next()).zzg(this.q, this.r);
            }
        }
        this.m++;
        this.e.A.obtainMessage(0, 1, 0, zzayaVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzk() {
        d06 d06Var = this.e;
        boolean z = true;
        if (!(d06Var.d0 && d06Var.e0 > 0)) {
            synchronized (d06Var) {
                try {
                    if (!d06Var.M) {
                        d06Var.A.sendEmptyMessage(6);
                        while (!d06Var.M) {
                            try {
                                d06Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        }
                        d06Var.B.quit();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.d.removeCallbacksAndMessages(null);
            return;
        }
        synchronized (d06Var) {
            if (!d06Var.M) {
                d06Var.A.sendEmptyMessage(6);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long jElapsedRealtime2 = d06Var.e0;
                long j = jElapsedRealtime + jElapsedRealtime2;
                while (true) {
                    if (d06Var.M) {
                        d06Var.B.quit();
                        break;
                    }
                    if (jElapsedRealtime2 <= 0) {
                        break;
                    }
                    try {
                        d06Var.wait(jElapsedRealtime2);
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                    }
                    jElapsedRealtime2 = j - SystemClock.elapsedRealtime();
                    throw th;
                }
                z = d06Var.M;
            }
        }
        if (!z) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((zzasf) it.next()).zzc(new zzase(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
            }
        }
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzl(zzasf zzasfVar) {
        this.f.remove(zzasfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzm(long j) {
        boolean zZzh = this.o.zzh();
        zzatb zzatbVar = this.h;
        if (!zZzh && this.l <= 0) {
            this.o.zzd(this.t.zza, zzatbVar, false);
        }
        if (!this.o.zzh() && this.o.zzc() <= 0) {
            throw new zzasu(this.o, 0, j);
        }
        this.l++;
        if (!this.o.zzh()) {
            this.o.zzg(0, this.g, false);
            zzasd.zza(j);
            long j2 = this.o.zzd(0, zzatbVar, false).zzc;
        }
        this.u = j;
        this.e.A.obtainMessage(3, new c06(this.o, zzasd.zza(j))).sendToTarget();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((zzasf) it.next()).zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzn(zzash... zzashVarArr) {
        d06 d06Var = this.e;
        if (d06Var.M) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            d06Var.S++;
            d06Var.A.obtainMessage(11, zzashVarArr).sendToTarget();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzo(int i) {
        this.e.g0 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzp(int i) {
        this.e.f0 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzq(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.e.A.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((zzasf) it.next()).zzd(z, this.k);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzr() {
        this.e.A.sendEmptyMessage(5);
    }
}
