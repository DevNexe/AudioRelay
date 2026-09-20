package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.ft;
import defpackage.z96;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzclf extends zzckz implements zzazx {
    public final zzciv A;
    public boolean B;
    public final z96 C;
    public final zzckk D;
    public ByteBuffer E;
    public boolean F;
    public final Object G;
    public final String H;
    public final int I;
    public boolean J;
    public String z;

    public zzclf(zzciw zzciwVar, zzciv zzcivVar) {
        super(zzciwVar);
        this.A = zzcivVar;
        this.C = new z96();
        this.D = new zzckk();
        this.G = new Object();
        this.H = zzciwVar != null ? zzciwVar.zzt() : "";
        this.I = zzciwVar != null ? zzciwVar.zzh() : 0;
    }

    public final void b() {
        z96 z96Var = this.C;
        Iterator it = z96Var.a.iterator();
        while (it.hasNext()) {
            Map mapZze = ((zzazm) it.next()).zze();
            if (mapZze != null) {
                for (Map.Entry entry : mapZze.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                            z96Var.b = Math.max(z96Var.b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        int i = (int) z96Var.b;
        int iZza = (int) this.D.zza(this.E);
        int iPosition = this.E.position();
        int iRound = Math.round((iPosition / i) * iZza);
        boolean z = iRound > 0;
        int iZzs = zzcin.zzs();
        int iZzu = zzcin.zzu();
        String str = this.z;
        zzf(str, "cache:".concat(String.valueOf(zzcgg.zze(str))), iPosition, i, iRound, iZza, z, iZzs, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final void zzb() {
        this.B = true;
    }

    public final String zzi() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    public final void zzk(Object obj, zzazk zzazkVar) {
        this.C.a.add((zzazm) obj);
    }

    public final ByteBuffer zzl() {
        synchronized (this.G) {
            ByteBuffer byteBuffer = this.E;
            if (byteBuffer != null && !this.F) {
                byteBuffer.flip();
                this.F = true;
            }
            this.B = true;
        }
        return this.E;
    }

    public final boolean zzm() {
        return this.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [long] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [long] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r19v1, types: [long] */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.google.android.gms.internal.ads.zzazx, com.google.android.gms.internal.ads.zzckz, com.google.android.gms.internal.ads.zzclf] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:? -> B:46:0x014d). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzckz
    public final boolean zzq(String str) throws Throwable {
        Object obj;
        ?? r12;
        ?? r14;
        this.z = str;
        String strConcat = "cache:".concat(String.valueOf(zzcgg.zze(str)));
        try {
            String str2 = this.x;
            zzciv zzcivVar = this.A;
            zzazi zzazmVar = new zzazm(str2, null, this, zzcivVar.zzd, zzcivVar.zzf, true, null);
            if (this.A.zzj) {
                zzazmVar = new zzcjs(this.w, zzazmVar, this.H, this.I, null, null, null);
            }
            zzazmVar.zzb(new zzazk(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            zzciw zzciwVar = (zzciw) this.y.get();
            if (zzciwVar != null) {
                zzciwVar.zzv(strConcat, this);
            }
            ft ftVarZzB = com.google.android.gms.ads.internal.zzt.zzB();
            ?? B = ftVarZzB.b();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzw)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzv)).longValue();
            this.E = ByteBuffer.allocate(this.A.zzc);
            int i = 8192;
            byte[] bArr = new byte[8192];
            ?? r15 = B;
            obj = "error";
            while (true) {
                try {
                    int iZza = zzazmVar.zza(bArr, 0, Math.min(this.E.remaining(), i));
                    zzazi zzaziVar = zzazmVar;
                    if (iZza == -1) {
                        this.J = true;
                        zze(str, strConcat, (int) this.D.zza(this.E));
                        return true;
                    }
                    synchronized (this.G) {
                        try {
                            if (!this.B) {
                                try {
                                    this.E.put(bArr, 0, iZza);
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            try {
                                if (this.E.remaining() <= 0) {
                                    b();
                                    return true;
                                }
                                try {
                                    if (this.B) {
                                        throw new IOException("Precache abort at " + this.E.limit() + " bytes");
                                    }
                                    long jB = ftVarZzB.b();
                                    if (jB - r15 >= jLongValue) {
                                        r14 = r15;
                                        b();
                                        r14 = jB;
                                    }
                                    r14 = r15;
                                    if (jB - B > 1000 * jLongValue2) {
                                        throw new IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                                    }
                                    i = 8192;
                                    zzazmVar = zzaziVar;
                                    strConcat = strConcat;
                                    r15 = r14;
                                } catch (Exception e) {
                                    e = e;
                                    r12 = B;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                r12 = obj;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    strConcat = strConcat;
                }
                r12 = obj;
                String strA = defpackage.LPt6Fixed.a(e.getClass().getCanonicalName(), ":", e.getMessage());
                zzcgn.zzj("Failed to preload url " + str + " Exception: " + strA);
                zzc(str, strConcat, r12, strA);
                return false;
            }
        } catch (Exception e4) {
            e = e4;
            strConcat = strConcat;
            obj = "error";
        }
    }
}
