package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.oa7;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsb extends zzrp {
    public final zzsi k;
    public final boolean l;
    public final zzcm m;
    public final zzck n;
    public oa7 o;
    public zzry p;
    public boolean q;
    public boolean r;
    public boolean s;

    public zzsb(zzsi zzsiVar, boolean z) {
        boolean z2;
        this.k = zzsiVar;
        if (z) {
            zzsiVar.zzu();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new zzcm();
        this.n = new zzck();
        zzsiVar.zzG();
        this.o = new oa7(new zzsa(zzsiVar.zzz()), zzcm.zza, oa7.d);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final /* bridge */ /* synthetic */ zzsg d(Object obj, zzsg zzsgVar) {
        Object obj2 = zzsgVar.zza;
        Object obj3 = this.o.c;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = oa7.d;
        }
        return zzsgVar.zzc(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzrp
    public final void e(Object obj, zzsi zzsiVar, zzcn zzcnVar) {
        long j;
        oa7 oa7Var;
        zzsg zzsgVarZzc;
        oa7 oa7Var2;
        if (this.r) {
            oa7 oa7Var3 = this.o;
            this.o = new oa7(zzcnVar, oa7Var3.b, oa7Var3.c);
            zzry zzryVar = this.p;
            if (zzryVar != null) {
                g(zzryVar.zzn());
            }
        } else {
            if (!zzcnVar.zzo()) {
                zzcm zzcmVar = this.m;
                zzcnVar.zze(0, zzcmVar, 0L);
                Object obj2 = zzcmVar.zzc;
                zzry zzryVar2 = this.p;
                if (zzryVar2 != null) {
                    long jZzq = zzryVar2.zzq();
                    this.o.zzn(zzryVar2.zza.zza, this.n);
                    this.o.zze(0, zzcmVar, 0L);
                    if (jZzq != 0) {
                        j = jZzq;
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                Pair pairZzl = zzcnVar.zzl(this.m, this.n, 0, j);
                Object obj3 = pairZzl.first;
                long jLongValue = ((Long) pairZzl.second).longValue();
                if (this.s) {
                    oa7 oa7Var4 = this.o;
                    oa7Var = new oa7(zzcnVar, oa7Var4.b, oa7Var4.c);
                } else {
                    oa7Var = new oa7(zzcnVar, obj2, obj3);
                }
                this.o = oa7Var;
                zzry zzryVar3 = this.p;
                if (zzryVar3 != null) {
                    g(jLongValue);
                    zzsg zzsgVar = zzryVar3.zza;
                    Object obj4 = zzsgVar.zza;
                    if (this.o.c != null && obj4.equals(oa7.d)) {
                        obj4 = this.o.c;
                    }
                    zzsgVarZzc = zzsgVar.zzc(obj4);
                }
                this.s = true;
                this.r = true;
                c(this.o);
                if (zzsgVarZzc != null) {
                    zzry zzryVar4 = this.p;
                    zzryVar4.getClass();
                    zzryVar4.zzr(zzsgVarZzc);
                }
            }
            if (this.s) {
                oa7 oa7Var5 = this.o;
                oa7Var2 = new oa7(zzcnVar, oa7Var5.b, oa7Var5.c);
            } else {
                oa7Var2 = new oa7(zzcnVar, zzcm.zza, oa7.d);
            }
            this.o = oa7Var2;
        }
        zzsgVarZzc = null;
        this.s = true;
        this.r = true;
        c(this.o);
        if (zzsgVarZzc != null) {
            zzry zzryVar5 = this.p;
            zzryVar5.getClass();
            zzryVar5.zzr(zzsgVarZzc);
        }
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void g(long j) {
        zzry zzryVar = this.p;
        int iZza = this.o.zza(zzryVar.zza.zza);
        if (iZza == -1) {
            return;
        }
        oa7 oa7Var = this.o;
        zzck zzckVar = this.n;
        oa7Var.zzd(iZza, zzckVar, false);
        long j2 = zzckVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzryVar.zzs(j);
    }

    public final zzcn zzA() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzB(zzse zzseVar) {
        ((zzry) zzseVar).zzt();
        if (zzseVar == this.p) {
            this.p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final zzry zzD(zzsg zzsgVar, zzwf zzwfVar, long j) {
        zzry zzryVar = new zzry(zzsgVar, zzwfVar, j, null);
        zzsi zzsiVar = this.k;
        zzryVar.zzu(zzsiVar);
        if (this.r) {
            Object obj = zzsgVar.zza;
            if (this.o.c != null && obj.equals(oa7.d)) {
                obj = this.o.c;
            }
            zzryVar.zzr(zzsgVar.zzc(obj));
        } else {
            this.p = zzryVar;
            if (!this.q) {
                this.q = true;
                f(null, zzsiVar);
            }
        }
        return zzryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzrh
    public final void zzn(zzfx zzfxVar) {
        super.zzn(zzfxVar);
        if (this.l) {
            return;
        }
        this.q = true;
        f(null, this.k);
    }

    @Override // com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzrh
    public final void zzq() {
        this.r = false;
        this.q = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzsi
    public final void zzw() {
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final zzbg zzz() {
        return this.k.zzz();
    }
}
