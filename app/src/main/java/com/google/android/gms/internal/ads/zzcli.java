package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import defpackage.ft;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcli extends zzckz implements zzcim {
    public static final /* synthetic */ int zzd = 0;
    public String A;
    public boolean B;
    public boolean C;
    public zzckr D;
    public long E;
    public long F;
    public zzcin z;

    public zzcli(zzciw zzciwVar, zzciv zzcivVar) {
        super(zzciwVar);
        Context context = zzciwVar.getContext();
        zzcin zzcmaVar = zzcivVar.zzm ? new zzcma(context, zzcivVar, (zzciw) this.y.get()) : new zzcke(context, zzcivVar, (zzciw) this.y.get());
        this.z = zzcmaVar;
        zzcmaVar.zzI(this);
    }

    public static final String b(String str) {
        return "cache:".concat(String.valueOf(zzcgg.zze(str)));
    }

    public static String c(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.zzckz, defpackage.ul3
    public final void release() {
        zzcin zzcinVar = this.z;
        if (zzcinVar != null) {
            zzcinVar.zzI(null);
            this.z.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzC(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final void zzb() {
        synchronized (this) {
            this.B = true;
            notify();
            release();
        }
        String str = this.A;
        if (str != null) {
            zzc(this.A, b(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final void zzh(int i) {
        this.z.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzi(final boolean z, final long j) {
        final zzciw zzciwVar = (zzciw) this.y.get();
        if (zzciwVar != null) {
            zzcha.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclh
                @Override // java.lang.Runnable
                public final void run() {
                    zzciwVar.zzx(z, j);
                }
            });
        }
    }

    public final zzcin zzj() {
        synchronized (this) {
            this.C = true;
            notify();
        }
        this.z.zzI(null);
        zzcin zzcinVar = this.z;
        this.z = null;
        return zzcinVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzk(String str, Exception exc) {
        zzcgn.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzp().zzs(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzl(String str, Exception exc) {
        zzcgn.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzp().zzs(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final void zzn(int i) {
        this.z.zzH(i);
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final void zzo(int i) {
        this.z.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final void zzp(int i) {
        this.z.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final boolean zzq(String str) {
        return zzr(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.zzciw] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.zzckz, com.google.android.gms.internal.ads.zzcli] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.zzcli] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [long] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzckz] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzckz
    public final boolean zzr(String str, String[] strArr) throws Throwable {
        ?? r6;
        String str2;
        ?? r5;
        long j;
        ?? r1;
        String str3;
        long j2;
        ?? r2;
        ?? r15 = this;
        ?? r13 = str;
        r15.A = r13;
        String strB = b(str);
        ?? r17 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            r15.z.zzC(uriArr, r15.x);
            ?? r0 = (zzciw) r15.y.get();
            if (r0 != 0) {
                r0.zzv(strB, r15);
            }
            ft ftVarZzB = com.google.android.gms.ads.internal.zzt.zzB();
            long jB = ftVarZzB.b();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzw)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzv)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzu)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue();
            ?? r3 = -1;
            long j3 = jIntValue;
            r13 = r13;
            r15 = r15;
            while (true) {
                synchronized (this) {
                    try {
                        if (ftVarZzB.b() - jB > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (r15.B) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!r15.C) {
                            if (!r15.z.zzR()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = r15.z.zzz();
                            if (jZzz > 0) {
                                long jZzv = r15.z.zzv();
                                if (jZzv != r3) {
                                    try {
                                        long j4 = jZzz;
                                        str3 = strB;
                                        try {
                                            zzg(str, strB, jZzv, j4, jZzv > 0, zBooleanValue ? r15.z.zzA() : -1L, zBooleanValue ? r15.z.zzx() : -1L, zBooleanValue ? r15.z.zzB() : -1L, zzcin.zzs(), zzcin.zzu());
                                            r2 = jZzv;
                                            j2 = jZzz;
                                            r6 = j4;
                                        } catch (Throwable th) {
                                            th = th;
                                            r5 = this;
                                            r6 = str;
                                            str2 = str3;
                                            try {
                                                throw th;
                                            } catch (Exception e) {
                                                e = e;
                                                ?? r4 = r17;
                                                zzcgn.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                                com.google.android.gms.ads.internal.zzt.zzp().zzs(e, "VideoStreamExoPlayerCache.preload");
                                                release();
                                                r5.zzc(r6, str2, r4, c(r4, e));
                                                return false;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r5 = this;
                                        r6 = str;
                                        str2 = strB;
                                    }
                                } else {
                                    str3 = strB;
                                    j2 = jZzz;
                                    r2 = r3;
                                    r6 = j3;
                                }
                                r5 = (jZzv > j2 ? 1 : (jZzv == j2 ? 0 : -1));
                                if (r5 >= 0) {
                                    zze(str, str3, j2);
                                } else {
                                    try {
                                        zzcli zzcliVar = this;
                                        r6 = str;
                                        str2 = str3;
                                        if (zzcliVar.z.zzw() < j3 || jZzv <= 0) {
                                            r1 = r2;
                                            r5 = zzcliVar;
                                            j = j3;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                }
                            } else {
                                j = j3;
                                jLongValue2 = jLongValue2;
                                r6 = r13;
                                str2 = strB;
                                r5 = r15;
                                r1 = r3;
                            }
                            try {
                                try {
                                    r5.wait(jLongValue);
                                } catch (Throwable th4) {
                                    th = th4;
                                    r17 = r1;
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                        return true;
                    } catch (Throwable th5) {
                        th = th5;
                        r6 = r13;
                        str2 = strB;
                        r5 = r15;
                    }
                }
                return true;
                jLongValue = jLongValue;
                r15 = r5;
                r13 = r6;
                strB = str2;
                j3 = j;
                jLongValue2 = jLongValue2;
                r3 = r1;
            }
        } catch (Exception e2) {
            e = e2;
            r6 = r13;
            str2 = strB;
            r5 = r15;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final boolean zzs(String str, String[] strArr, zzckr zzckrVar) {
        this.A = str;
        this.D = zzckrVar;
        String strB = b(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.z.zzC(uriArr, this.x);
            zzciw zzciwVar = (zzciw) this.y.get();
            if (zzciwVar != null) {
                zzciwVar.zzv(strB, this);
            }
            this.E = com.google.android.gms.ads.internal.zzt.zzB().b();
            this.F = -1L;
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzclg(this), 0L);
            return true;
        } catch (Exception e) {
            zzcgn.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzt.zzp().zzs(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzc(str, strB, "error", c("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcim
    public final void zzv() {
        zzcgn.zzj("Precache onRenderedFirstFrame");
    }
}
