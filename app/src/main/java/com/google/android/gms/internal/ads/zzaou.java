package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import defpackage.cz5;
import defpackage.jz5;
import defpackage.pd6;
import defpackage.sd6;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaou implements zzaox {
    public static zzaou L;
    public final jz5 A;
    public final zzfmf B;
    public final Executor C;
    public final sd6 D;
    public final zzaqk F;
    public volatile boolean I;
    public final int K;
    public final Context w;
    public final zzfnu x;
    public final zzfob y;
    public final zzfod z;
    public volatile long G = 0;
    public final Object H = new Object();
    public volatile boolean J = false;
    public final CountDownLatch E = new CountDownLatch(1);

    public zzaou(Context context, zzfmf zzfmfVar, zzfnu zzfnuVar, zzfob zzfobVar, zzfod zzfodVar, jz5 jz5Var, Executor executor, zzfma zzfmaVar, int i, zzaqk zzaqkVar) {
        this.w = context;
        this.B = zzfmfVar;
        this.x = zzfnuVar;
        this.y = zzfobVar;
        this.z = zzfodVar;
        this.A = jz5Var;
        this.C = executor;
        this.K = i;
        this.F = zzaqkVar;
        this.D = new sd6(2, zzfmaVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cc A[Catch: all -> 0x0125, zzgoz -> 0x0127, TRY_LEAVE, TryCatch #1 {zzgoz -> 0x0127, blocks: (B:6:0x0020, B:8:0x0031, B:11:0x0036, B:12:0x0042, B:14:0x0050, B:16:0x005e, B:19:0x006b, B:26:0x009a, B:30:0x00b3, B:36:0x00cc, B:38:0x00db, B:40:0x00e1, B:42:0x00e9, B:43:0x00ec, B:33:0x00bd, B:34:0x00c4, B:22:0x0072, B:24:0x0088, B:45:0x00f8, B:47:0x0107, B:49:0x0116), top: B:60:0x0020, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8 A[Catch: all -> 0x0125, zzgoz -> 0x0127, TRY_ENTER, TRY_LEAVE, TryCatch #1 {zzgoz -> 0x0127, blocks: (B:6:0x0020, B:8:0x0031, B:11:0x0036, B:12:0x0042, B:14:0x0050, B:16:0x005e, B:19:0x006b, B:26:0x009a, B:30:0x00b3, B:36:0x00cc, B:38:0x00db, B:40:0x00e1, B:42:0x00e9, B:43:0x00ec, B:33:0x00bd, B:34:0x00c4, B:22:0x0072, B:24:0x0088, B:45:0x00f8, B:47:0x0107, B:49:0x0116), top: B:60:0x0020, outer: #0 }] */
    public static /* bridge */ /* synthetic */ void a(zzaou zzaouVar) {
        String str;
        String strZzj;
        CountDownLatch countDownLatch;
        boolean zZzb;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfnt zzfntVarC = zzaouVar.c();
        if (zzfntVarC != null) {
            String strZzk = zzfntVarC.zza().zzk();
            strZzj = zzfntVarC.zza().zzj();
            str = strZzk;
        } else {
            str = null;
            strZzj = null;
        }
        try {
            try {
                zzfny zzfnyVarZza = zzfmp.zza(zzaouVar.w, 1, zzaouVar.K, str, strZzj, "1", zzaouVar.B);
                byte[] bArr = zzfnyVarZza.zzb;
                if (bArr == null || bArr.length == 0) {
                    zzaouVar.B.zzd(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                    countDownLatch = zzaouVar.E;
                } else {
                    try {
                        zzarr zzarrVarZzc = zzarr.zzc(zzgnf.zzv(bArr), zzgnz.zza());
                        if (zzarrVarZzc.zzd().zzk().isEmpty() || zzarrVarZzc.zzd().zzj().isEmpty() || zzarrVarZzc.zze().zzE().length == 0) {
                            zzaouVar.B.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                            countDownLatch = zzaouVar.E;
                        } else {
                            zzfnt zzfntVarC2 = zzaouVar.c();
                            if (zzfntVarC2 != null) {
                                zzaru zzaruVarZza = zzfntVarC2.zza();
                                if (zzarrVarZzc.zzd().zzk().equals(zzaruVarZza.zzk()) && zzarrVarZzc.zzd().zzj().equals(zzaruVarZza.zzj())) {
                                    zzaouVar.B.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                                    countDownLatch = zzaouVar.E;
                                }
                            }
                            sd6 sd6Var = zzaouVar.D;
                            int i = zzfnyVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbO)).booleanValue()) {
                                zZzb = zzaouVar.x.zzb(zzarrVarZzc, sd6Var);
                            } else if (i == 3) {
                                zZzb = zzaouVar.y.zza(zzarrVarZzc);
                            } else if (i == 4) {
                                zZzb = zzaouVar.y.zzb(zzarrVarZzc, sd6Var);
                            } else {
                                zzaouVar.B.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                                countDownLatch = zzaouVar.E;
                            }
                            if (zZzb) {
                                zzfnt zzfntVarC3 = zzaouVar.c();
                                if (zzfntVarC3 != null) {
                                    if (zzaouVar.z.zzc(zzfntVarC3)) {
                                        zzaouVar.J = true;
                                    }
                                    zzaouVar.G = System.currentTimeMillis() / 1000;
                                }
                                countDownLatch = zzaouVar.E;
                            } else {
                                zzaouVar.B.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                                countDownLatch = zzaouVar.E;
                            }
                        }
                    } catch (NullPointerException unused) {
                        zzaouVar.B.zzd(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                        countDownLatch = zzaouVar.E;
                    }
                }
            } catch (zzgoz e) {
                zzaouVar.B.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
                countDownLatch = zzaouVar.E;
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            zzaouVar.E.countDown();
            throw th;
        }
    }

    public static synchronized zzaou zza(String str, Context context, boolean z, boolean z2) {
        return zzb(str, context, Executors.newCachedThreadPool(), z, z2);
    }

    @Deprecated
    public static synchronized zzaou zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        if (L == null) {
            zzfmg zzfmgVarZza = zzfmh.zza();
            zzfmgVarZza.zza(str);
            zzfmgVarZza.zzc(z);
            zzfmh zzfmhVarZzd = zzfmgVarZza.zzd();
            zzfmf zzfmfVarZza = zzfmf.zza(context, executor, z2);
            zzapf zzapfVarZzc = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcz)).booleanValue() ? zzapf.zzc(context) : null;
            zzaqk zzaqkVarZzd = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcA)).booleanValue() ? zzaqk.zzd(context, executor) : null;
            zzfmy zzfmyVarZze = zzfmy.zze(context, executor, zzfmfVarZza, zzfmhVarZzd);
            zzapu zzapuVar = new zzapu(context);
            jz5 jz5Var = new jz5(zzfmhVarZzd, zzfmyVarZze, new zzaqi(context, zzapuVar), zzapuVar, zzapfVarZzc, zzaqkVarZzd);
            int iZzb = zzfnh.zzb(context, zzfmfVarZza);
            zzfma zzfmaVar = new zzfma();
            zzaou zzaouVar = new zzaou(context, zzfmfVarZza, new zzfnu(context, iZzb), new zzfob(context, iZzb, new pd6(zzfmfVarZza, 1), ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbQ)).booleanValue()), new zzfod(context, jz5Var, zzfmfVarZza, zzfmaVar), jz5Var, executor, zzfmaVar, iZzb, zzaqkVarZzd);
            L = zzaouVar;
            zzaouVar.b();
            L.zzo();
        }
        return L;
    }

    public final synchronized void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfnt zzfntVarC = c();
        if (zzfntVarC == null) {
            this.B.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.z.zzc(zzfntVarC)) {
            this.J = true;
            this.E.countDown();
        }
    }

    public final zzfnt c() {
        if (zzfnh.zza(this.K)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbO)).booleanValue() ? this.y.zzc(1) : this.x.zzd(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzaqk zzaqkVar = this.F;
        if (zzaqkVar != null) {
            zzaqkVar.zzh();
        }
        zzo();
        zzfmi zzfmiVarZza = this.z.zza();
        if (zzfmiVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfmiVarZza.zza(context, null, str, view, activity);
        this.B.zzf(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zzg(Context context) {
        zzaqk zzaqkVar = this.F;
        if (zzaqkVar != null) {
            zzaqkVar.zzh();
        }
        zzo();
        zzfmi zzfmiVarZza = this.z.zza();
        if (zzfmiVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfmiVarZza.zzc(context, null);
        this.B.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zzh(Context context, View view, Activity activity) {
        zzaqk zzaqkVar = this.F;
        if (zzaqkVar != null) {
            zzaqkVar.zzh();
        }
        zzo();
        zzfmi zzfmiVarZza = this.z.zza();
        if (zzfmiVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfmiVarZza.zzb(context, null, view, activity);
        this.B.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final void zzk(MotionEvent motionEvent) {
        zzfmi zzfmiVarZza = this.z.zza();
        if (zzfmiVarZza != null) {
            try {
                zzfmiVarZza.zzd(null, motionEvent);
            } catch (zzfoc e) {
                this.B.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final void zzl(int i, int i2, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final void zzn(View view) {
        this.A.c.b(view);
    }

    public final void zzo() {
        if (this.I) {
            return;
        }
        synchronized (this.H) {
            if (!this.I) {
                if ((System.currentTimeMillis() / 1000) - this.G < 3600) {
                    return;
                }
                zzfnt zzfntVarZzb = this.z.zzb();
                if ((zzfntVarZzb == null || zzfntVarZzb.zzd(3600L)) && zzfnh.zza(this.K)) {
                    this.C.execute(new cz5(this, 0));
                }
            }
        }
    }

    public final synchronized boolean zzq() {
        return this.J;
    }
}
