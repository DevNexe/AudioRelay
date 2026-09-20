package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzapa;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzfmf;
import com.google.android.gms.internal.ads.zzfnh;
import com.google.android.gms.internal.ads.zzfob;
import defpackage.ny1;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzi implements Runnable, zzaox {
    public final boolean A;
    public final boolean B;
    public final ExecutorService C;
    public final zzfmf D;
    public Context E;
    public final Context F;
    public zzcgt G;
    public final zzcgt H;
    public final boolean I;
    public int K;
    public boolean z;
    public final Vector w = new Vector();
    public final AtomicReference x = new AtomicReference();
    public final AtomicReference y = new AtomicReference();
    public final CountDownLatch J = new CountDownLatch(1);

    public zzi(Context context, zzcgt zzcgtVar) {
        this.E = context;
        this.F = context;
        this.G = zzcgtVar;
        this.H = zzcgtVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.C = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzay.zzc().zzb(zzbiy.zzbT)).booleanValue();
        this.I = zBooleanValue;
        this.D = zzfmf.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.A = ((Boolean) zzay.zzc().zzb(zzbiy.zzbP)).booleanValue();
        this.B = ((Boolean) zzay.zzc().zzb(zzbiy.zzbU)).booleanValue();
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzbS)).booleanValue()) {
            this.K = 2;
        } else {
            this.K = 1;
        }
        if (!((Boolean) zzay.zzc().zzb(zzbiy.zzcC)).booleanValue()) {
            this.z = a();
        }
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzcw)).booleanValue()) {
            zzcha.zza.execute(this);
            return;
        }
        zzaw.zzb();
        if (zzcgg.zzt()) {
            zzcha.zza.execute(this);
        } else {
            run();
        }
    }

    public final boolean a() {
        Context context = this.E;
        ny1 ny1Var = new ny1(this);
        return new zzfob(this.E, zzfnh.zzb(context, this.D), ny1Var, ((Boolean) zzay.zzc().zzb(zzbiy.zzbQ)).booleanValue()).zzd(1);
    }

    public final zzaox b() {
        return ((!this.A || this.z) ? this.K : 1) == 2 ? (zzaox) this.y.get() : (zzaox) this.x.get();
    }

    public final void c() {
        zzaox zzaoxVarB = b();
        Vector<Object[]> vector = this.w;
        if (vector.isEmpty() || zzaoxVarB == null) {
            return;
        }
        for (Object[] objArr : vector) {
            int length = objArr.length;
            if (length == 1) {
                zzaoxVarB.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzaoxVarB.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void d(boolean z) {
        String str = this.G.zza;
        Context context = this.E;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.x.set(zzapa.zzt(str, context, z, this.K));
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch = this.J;
        try {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zzcC)).booleanValue()) {
                this.z = a();
            }
            final boolean z = !((Boolean) zzay.zzc().zzb(zzbiy.zzaQ)).booleanValue() && this.G.zzd;
            if (((!this.A || this.z) ? this.K : 1) == 1) {
                d(z);
                if (this.K == 2) {
                    this.C.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzi zziVar = this.zza;
                            boolean z2 = z;
                            zziVar.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                String str = zziVar.H.zza;
                                Context context = zziVar.F;
                                Context applicationContext = context.getApplicationContext();
                                if (applicationContext != null) {
                                    context = applicationContext;
                                }
                                zzaou.zza(str, context, z2, zziVar.I).zzo();
                            } catch (NullPointerException e) {
                                zziVar.D.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
                            }
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    String str = this.G.zza;
                    Context context = this.E;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzaou zzaouVarZza = zzaou.zza(str, context, z, this.I);
                    this.y.set(zzaouVarZza);
                    if (this.B && !zzaouVarZza.zzq()) {
                        this.K = 1;
                        d(z);
                    }
                } catch (NullPointerException e) {
                    this.K = 1;
                    d(z);
                    this.D.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            countDownLatch.countDown();
            this.E = null;
            this.G = null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            this.E = null;
            this.G = null;
            throw th;
        }
    }

    public final boolean zzd() {
        try {
            this.J.await();
            return true;
        } catch (InterruptedException e) {
            zzcgn.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        zzaox zzaoxVarB = b();
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzil)).booleanValue()) {
            zzt.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzF(view, 4, null);
        }
        if (zzaoxVarB == null) {
            return "";
        }
        c();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return zzaoxVarB.zzf(context, str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zzg(Context context) {
        zzaox zzaoxVarB;
        if (!zzd() || (zzaoxVarB = b()) == null) {
            return "";
        }
        c();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return zzaoxVarB.zzg(context);
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzay.zzc().zzb(zzbiy.zzik)).booleanValue()) {
            zzaox zzaoxVarB = b();
            if (((Boolean) zzay.zzc().zzb(zzbiy.zzil)).booleanValue()) {
                zzt.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
            }
            return zzaoxVarB != null ? zzaoxVarB.zzh(context, view, activity) : "";
        }
        if (!zzd()) {
            return "";
        }
        zzaox zzaoxVarB2 = b();
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzil)).booleanValue()) {
            zzt.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
        }
        return zzaoxVarB2 != null ? zzaoxVarB2.zzh(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final void zzk(MotionEvent motionEvent) {
        zzaox zzaoxVarB = b();
        if (zzaoxVarB == null) {
            this.w.add(new Object[]{motionEvent});
        } else {
            c();
            zzaoxVarB.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final void zzl(int i, int i2, int i3) {
        zzaox zzaoxVarB = b();
        if (zzaoxVarB == null) {
            this.w.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            c();
            zzaoxVarB.zzl(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final void zzn(View view) {
        zzaox zzaoxVarB = b();
        if (zzaoxVarB != null) {
            zzaoxVarB.zzn(view);
        }
    }
}
