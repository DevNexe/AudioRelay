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
public final class zzcln extends zzep {
    public final Context e;
    public final zzev f;
    public final String g;
    public final int h;
    public final boolean i;
    public InputStream j;
    public boolean k;
    public Uri l;
    public volatile zzbdx m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public zzfyx s;
    public final AtomicLong t;
    public final zzclq u;

    public zzcln(Context context, zzev zzevVar, String str, int i, zzfx zzfxVar, zzclq zzclqVar, byte[] bArr) {
        super(false);
        this.e = context;
        this.f = zzevVar;
        this.u = zzclqVar;
        this.g = str;
        this.h = i;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = 0L;
        this.t = new AtomicLong(-1L);
        this.s = null;
        this.i = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbB)).booleanValue();
        zzf(zzfxVar);
    }

    public final boolean d() {
        if (!this.i) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdu)).booleanValue() || this.p) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdv)).booleanValue() && !this.q;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.j;
        int iZza = inputStream != null ? inputStream.read(bArr, i, i2) : this.f.zza(bArr, i, i2);
        if (!this.i || this.j != null) {
            zzg(iZza);
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
    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws Throwable {
        zzbdu zzbduVarZzb;
        Long l;
        boolean z;
        boolean z2;
        long jC;
        String strA = "ms";
        if (this.k) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r2 = 1;
        this.k = true;
        this.l = zzfaVar.zza;
        if (!this.i) {
            c(zzfaVar);
        }
        this.m = zzbdx.zza(zzfaVar.zza);
        ?? sb = -1;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdr)).booleanValue()) {
            if (this.m != null) {
                this.m.zzh = zzfaVar.zzf;
                this.m.zzi = zzfsu.zzc(this.g);
                this.m.zzj = this.h;
                zzbduVarZzb = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.m);
            } else {
                zzbduVarZzb = null;
            }
            if (zzbduVarZzb != null && zzbduVarZzb.zze()) {
                this.n = zzbduVarZzb.zzd();
                this.p = zzbduVarZzb.zzg();
                this.q = zzbduVarZzb.zzf();
                this.r = zzbduVarZzb.zza();
                this.o = true;
                if (!d()) {
                    this.j = zzbduVarZzb.zzc();
                    if (this.i) {
                        c(zzfaVar);
                    }
                    return -1L;
                }
            }
        } else if (this.m != null) {
            this.m.zzh = zzfaVar.zzf;
            this.m.zzi = zzfsu.zzc(this.g);
            this.m.zzj = this.h;
            if (this.m.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdt);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzds);
            }
            long jLongValue = l.longValue();
            long jC2 = com.google.android.gms.ads.internal.zzt.zzB().c();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future futureZza = zzbei.zza(this.e, this.m);
            try {
                try {
                    zzbej zzbejVar = (zzbej) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.n = zzbejVar.zzd();
                        this.p = zzbejVar.zzf();
                        this.q = zzbejVar.zze();
                        this.r = zzbejVar.zza();
                        if (!d()) {
                            this.j = zzbejVar.zzc();
                            if (this.i) {
                                c(zzfaVar);
                            }
                            long jC3 = com.google.android.gms.ads.internal.zzt.zzB().c() - jC2;
                            zzcim zzcimVar = this.u.zza.H;
                            if (zzcimVar != null) {
                                zzcimVar.zzi(true, jC3);
                            }
                            this.o = true;
                            com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jC3 + "ms");
                            return -1L;
                        }
                        long jC4 = com.google.android.gms.ads.internal.zzt.zzB().c() - jC2;
                        zzcim zzcimVar2 = this.u.zza.H;
                        if (zzcimVar2 != null) {
                            zzcimVar2.zzi(true, jC4);
                        }
                        this.o = true;
                        strA = "Cache connection took " + jC4 + "ms";
                    } catch (InterruptedException unused) {
                        z2 = true;
                        futureZza.cancel(true);
                        Thread.currentThread().interrupt();
                        jC = com.google.android.gms.ads.internal.zzt.zzB().c() - jC2;
                        zzcim zzcimVar3 = this.u.zza.H;
                        if (zzcimVar3 != null) {
                            zzcimVar3.zzi(z2, jC);
                        }
                        this.o = z2;
                        sb = new StringBuilder("Cache connection took ");
                        strA = hc2.a(sb, jC, "ms");
                    } catch (ExecutionException | TimeoutException unused2) {
                        z = true;
                        futureZza.cancel(true);
                        jC = com.google.android.gms.ads.internal.zzt.zzB().c() - jC2;
                        zzcim zzcimVar4 = this.u.zza.H;
                        if (zzcimVar4 != null) {
                            zzcimVar4.zzi(z, jC);
                        }
                        this.o = z;
                        sb = new StringBuilder("Cache connection took ");
                        strA = hc2.a(sb, jC, "ms");
                    } catch (Throwable th) {
                        th = th;
                        long jC5 = com.google.android.gms.ads.internal.zzt.zzB().c() - jC2;
                        ?? r5 = this.u.zza.H;
                        if (r5 != 0) {
                            r5.zzi(r2, jC5);
                        }
                        this.o = r2;
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
        this.o = false;
        if (this.m != null) {
            zzfaVar = new zzfa(Uri.parse(this.m.zza), null, zzfaVar.zze, zzfaVar.zzf, zzfaVar.zzg, null, zzfaVar.zzi);
        }
        return this.f.zzb(zzfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() throws IOException {
        if (!this.k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.k = false;
        this.l = null;
        boolean z = (this.i && this.j == null) ? false : true;
        InputStream inputStream = this.j;
        if (inputStream != null) {
            gh1.a(inputStream);
            this.j = null;
        } else {
            this.f.zzd();
        }
        if (z) {
            a();
        }
    }

    public final long zzk() {
        return this.r;
    }

    public final long zzl() {
        if (this.m == null) {
            return -1L;
        }
        if (this.t.get() != -1) {
            return this.t.get();
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = zzcha.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzclm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzcln zzclnVar = this.zza;
                        zzclnVar.getClass();
                        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzc().zza(zzclnVar.m));
                    }
                });
            }
        }
        if (!this.s.isDone()) {
            return -1L;
        }
        try {
            this.t.compareAndSet(-1L, ((Long) this.s.get()).longValue());
            return this.t.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    public final boolean zzn() {
        return this.n;
    }

    public final boolean zzo() {
        return this.q;
    }

    public final boolean zzp() {
        return this.p;
    }

    public final boolean zzq() {
        return this.o;
    }
}
