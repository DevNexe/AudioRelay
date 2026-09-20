package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzclg implements Runnable {
    public final /* synthetic */ zzcli zza;

    public /* synthetic */ zzclg(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.zzckz, com.google.android.gms.internal.ads.zzcli] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.zzcli] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [long] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.StringBuilder] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ?? r1;
        String str;
        ?? r2;
        zzcli zzcliVar;
        long j;
        zzcli zzcliVar2;
        String str2;
        long j2;
        zzcli zzcliVar3;
        zzclg zzclgVar = this;
        zzcli zzcliVar4 = zzclgVar.zza;
        String strB = zzcli.b(zzcliVar4.A);
        ?? r18 = "error";
        try {
            ?? LongValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzv)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzu)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue();
            try {
                synchronized (zzcliVar4) {
                    try {
                        if (com.google.android.gms.ads.internal.zzt.zzB().b() - zzcliVar4.E > LongValue) {
                            throw new IOException("Timeout reached. Limit: " + LongValue + " ms");
                        }
                        try {
                            if (zzcliVar4.B) {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                            if (!zzcliVar4.C) {
                                if (!zzcliVar4.z.zzR()) {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                                long jZzz = zzcliVar4.z.zzz();
                                if (jZzz > 0) {
                                    long jZzv = zzcliVar4.z.zzv();
                                    if (jZzv != zzcliVar4.F) {
                                        try {
                                            zzcliVar2 = zzcliVar4;
                                            str2 = strB;
                                            try {
                                                zzcliVar4.zzg(zzcliVar4.A, strB, jZzv, jZzz, jZzv > 0, zBooleanValue ? zzcliVar4.z.zzA() : -1L, zBooleanValue ? zzcliVar4.z.zzx() : -1L, zBooleanValue ? zzcliVar4.z.zzB() : -1L, zzcin.zzs(), zzcin.zzu());
                                                j = jZzv;
                                                zzcliVar2.F = j;
                                                j2 = jZzz;
                                                zzcliVar2 = zzcliVar2;
                                            } catch (Throwable th) {
                                                th = th;
                                                zzcliVar3 = zzcliVar2;
                                                str = str2;
                                                r1 = zzcliVar3;
                                                r18 = r18;
                                                try {
                                                    throw th;
                                                } catch (Exception e) {
                                                    e = e;
                                                    ?? r3 = r18;
                                                    zzcgn.zzj("Failed to preload url " + r1.A + " Exception: " + e.getMessage());
                                                    com.google.android.gms.ads.internal.zzt.zzp().zzs(e, "VideoStreamExoPlayerCache.preload");
                                                    r1.release();
                                                    r1.zzc(r1.A, str, r3, zzcli.c(r3, e));
                                                    r2 = r1;
                                                    com.google.android.gms.ads.internal.zzt.zzz().zzc(r2.D);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zzcliVar3 = zzcliVar4;
                                            str2 = strB;
                                            str = str2;
                                            r1 = zzcliVar3;
                                            r18 = r18;
                                            throw th;
                                        }
                                    } else {
                                        j = jZzv;
                                        zzcliVar2 = zzcliVar4;
                                        str2 = strB;
                                        j2 = jZzz;
                                    }
                                    if (j >= j2) {
                                        zzcliVar2.zze(zzcliVar2.A, str2, j2);
                                        r2 = zzcliVar2;
                                    } else if (zzcliVar2.z.zzw() >= jIntValue && j > 0) {
                                        zzcliVar = zzcliVar2;
                                        zzcliVar = zzcliVar2;
                                        r2 = zzcliVar2;
                                    }
                                } else {
                                    zzcliVar = zzcliVar4;
                                }
                                zzcliVar = zzcliVar2;
                                zzcliVar = zzcliVar2;
                                zzcliVar = zzcliVar2;
                                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzclg(zzcliVar), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzw)).longValue());
                                return;
                            }
                            com.google.android.gms.ads.internal.zzt.zzz().zzc(r2.D);
                        } catch (Throwable th3) {
                            th = th3;
                            r18 = LongValue;
                            r1 = zzclgVar;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r1 = zzcliVar4;
                        str = strB;
                        r18 = r18;
                    }
                }
                r2 = zzcliVar4;
                com.google.android.gms.ads.internal.zzt.zzz().zzc(r2.D);
            } catch (Throwable th5) {
                th = th5;
                r1 = zzclgVar;
                r18 = r18;
            }
        } catch (Exception e2) {
            e = e2;
            r1 = zzcliVar4;
            str = strB;
        }
    }
}
