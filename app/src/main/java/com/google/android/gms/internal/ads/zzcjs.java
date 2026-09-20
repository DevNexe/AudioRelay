package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import defpackage.gh1;
import defpackage.hc2;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcjs implements zzazi {
    public final zzazx a;
    public final Context b;
    public final zzazi c;
    public final String d;
    public final int e;
    public InputStream g;
    public boolean h;
    public Uri i;
    public volatile zzbdx j;
    public final zzcka r;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public long o = 0;
    public final AtomicLong q = new AtomicLong(-1);
    public zzfyx p = null;
    public final boolean f = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue();

    public zzcjs(Context context, zzazi zzaziVar, String str, int i, zzazx zzazxVar, zzcka zzckaVar, byte[] bArr) {
        this.b = context;
        this.c = zzaziVar;
        this.a = zzazxVar;
        this.r = zzckaVar;
        this.d = str;
        this.e = i;
    }

    public final boolean a() {
        if (!this.f) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdu)).booleanValue() || this.m) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdv)).booleanValue() && !this.n;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzazx zzazxVar;
        if (!this.h) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.g;
        int iZza = inputStream != null ? inputStream.read(bArr, i, i2) : this.c.zza(bArr, i, i2);
        if ((!this.f || this.g != null) && (zzazxVar = this.a) != null) {
            ((zzcke) zzazxVar).zzW(this, iZza);
        }
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzcim] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzazi
    public final long zzb(zzazk zzazkVar) throws Throwable {
        zzbdu zzbduVarZzb;
        zzazx zzazxVar;
        boolean z;
        boolean z2;
        long jC;
        zzazx zzazxVar2;
        zzazx zzazxVar3;
        String strA = "ms";
        if (this.h) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        ?? r2 = 1;
        this.h = true;
        this.i = zzazkVar.zza;
        if (!this.f && (zzazxVar3 = this.a) != null) {
            ((zzcke) zzazxVar3).zzk(this, zzazkVar);
        }
        this.j = zzbdx.zza(zzazkVar.zza);
        ?? sb = -1;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdr)).booleanValue()) {
            if (this.j != null) {
                this.j.zzh = zzazkVar.zzc;
                this.j.zzi = zzfsu.zzc(this.d);
                this.j.zzj = this.e;
                zzbduVarZzb = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.j);
            } else {
                zzbduVarZzb = null;
            }
            if (zzbduVarZzb != null && zzbduVarZzb.zze()) {
                this.k = zzbduVarZzb.zzd();
                this.m = zzbduVarZzb.zzg();
                this.n = zzbduVarZzb.zzf();
                this.o = zzbduVarZzb.zza();
                this.l = true;
                if (!a()) {
                    this.g = zzbduVarZzb.zzc();
                    if (this.f && (zzazxVar = this.a) != null) {
                        ((zzcke) zzazxVar).zzk(this, zzazkVar);
                    }
                    return -1L;
                }
            }
        } else if (this.j != null) {
            this.j.zzh = zzazkVar.zzc;
            this.j.zzi = zzfsu.zzc(this.d);
            this.j.zzj = this.e;
            long jLongValue = (this.j.zzg ? (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdt) : (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzds)).longValue();
            long jC2 = com.google.android.gms.ads.internal.zzt.zzB().c();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future futureZza = zzbei.zza(this.b, this.j);
            try {
                try {
                    zzbej zzbejVar = (zzbej) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.k = zzbejVar.zzd();
                        this.m = zzbejVar.zzf();
                        this.n = zzbejVar.zze();
                        this.o = zzbejVar.zza();
                        if (!a()) {
                            this.g = zzbejVar.zzc();
                            if (this.f && (zzazxVar2 = this.a) != null) {
                                ((zzcke) zzazxVar2).zzk(this, zzazkVar);
                            }
                            long jC3 = com.google.android.gms.ads.internal.zzt.zzB().c() - jC2;
                            zzcim zzcimVar = this.r.zza.I;
                            if (zzcimVar != null) {
                                zzcimVar.zzi(true, jC3);
                            }
                            this.l = true;
                            com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jC3 + "ms");
                            return -1L;
                        }
                        long jC4 = com.google.android.gms.ads.internal.zzt.zzB().c() - jC2;
                        zzcim zzcimVar2 = this.r.zza.I;
                        if (zzcimVar2 != null) {
                            zzcimVar2.zzi(true, jC4);
                        }
                        this.l = true;
                        strA = "Cache connection took " + jC4 + "ms";
                    } catch (InterruptedException unused) {
                        z2 = true;
                        futureZza.cancel(true);
                        Thread.currentThread().interrupt();
                        jC = com.google.android.gms.ads.internal.zzt.zzB().c() - jC2;
                        zzcim zzcimVar3 = this.r.zza.I;
                        if (zzcimVar3 != null) {
                            zzcimVar3.zzi(z2, jC);
                        }
                        this.l = z2;
                        sb = new StringBuilder("Cache connection took ");
                        strA = hc2.a(sb, jC, "ms");
                    } catch (ExecutionException | TimeoutException unused2) {
                        z = true;
                        futureZza.cancel(true);
                        jC = com.google.android.gms.ads.internal.zzt.zzB().c() - jC2;
                        zzcim zzcimVar4 = this.r.zza.I;
                        if (zzcimVar4 != null) {
                            zzcimVar4.zzi(z, jC);
                        }
                        this.l = z;
                        sb = new StringBuilder("Cache connection took ");
                        strA = hc2.a(sb, jC, "ms");
                    } catch (Throwable th) {
                        th = th;
                        long jC5 = com.google.android.gms.ads.internal.zzt.zzB().c() - jC2;
                        ?? r5 = this.r.zza.I;
                        if (r5 != 0) {
                            r5.zzi(r2, jC5);
                        }
                        this.l = r2;
                        com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jC5 + strA);
                        throw th;
                    }
                } catch (InterruptedException unused3) {
                    z2 = false;
                } catch (ExecutionException | TimeoutException unused4) {
                    z = false;
                } catch (Throwable th2) {
                    th = th2;
                    r2 = 0;
                }
                com.google.android.gms.ads.internal.util.zze.zza(strA);
            } catch (Throwable th3) {
                th = th3;
                r2 = sb;
            }
        }
        this.l = false;
        if (this.j != null) {
            zzazkVar = new zzazk(Uri.parse(this.j.zza), null, zzazkVar.zzb, zzazkVar.zzc, zzazkVar.zzd, null, 0);
        }
        return this.c.zzb(zzazkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final Uri zzc() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void zzd() throws IOException {
        if (!this.h) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.h = false;
        this.i = null;
        InputStream inputStream = this.g;
        if (inputStream == null) {
            this.c.zzd();
        } else {
            gh1.a(inputStream);
            this.g = null;
        }
    }

    public final long zze() {
        return this.o;
    }

    public final long zzf() {
        if (this.j == null) {
            return -1L;
        }
        if (this.q.get() != -1) {
            return this.q.get();
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = zzcha.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcjr
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzcjs zzcjsVar = this.zza;
                        zzcjsVar.getClass();
                        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzc().zza(zzcjsVar.j));
                    }
                });
            }
        }
        if (!this.p.isDone()) {
            return -1L;
        }
        try {
            this.q.compareAndSet(-1L, ((Long) this.p.get()).longValue());
            return this.q.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    public final boolean zzh() {
        return this.k;
    }

    public final boolean zzi() {
        return this.n;
    }

    public final boolean zzj() {
        return this.m;
    }

    public final boolean zzk() {
        return this.l;
    }
}
