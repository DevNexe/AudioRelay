package com.google.android.gms.internal.ads;

import android.util.Log;
import defpackage.hs5;
import defpackage.is5;
import defpackage.js5;
import defpackage.ms5;
import defpackage.ns5;
import defpackage.os5;
import defpackage.ps5;
import defpackage.qs5;
import defpackage.rs5;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaaz implements zzzf {
    public int c;
    public ms5 e;
    public long h;
    public os5 i;
    public int m;
    public boolean n;
    public final zzed a = new zzed(12);
    public final js5 b = new js5();
    public zzzi d = new zzzd();
    public os5[] g = new os5[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    public final os5 a(int i) {
        for (os5 os5Var : this.g) {
            if (os5Var.b == i || os5Var.c == i) {
                return os5Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0374  */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws zzbu, EOFException, InterruptedIOException {
        boolean z;
        int i;
        long j;
        long j2 = this.h;
        if (j2 != -1) {
            long jZzf = zzzgVar.zzf();
            if (j2 < jZzf || j2 > 262144 + jZzf) {
                zzaafVar.zza = j2;
                z = true;
            } else {
                ((zzyv) zzzgVar).zzo((int) (j2 - jZzf), false);
                z = false;
            }
        } else {
            z = false;
        }
        this.h = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.c;
        os5 os5Var = null;
        if (i2 == 0) {
            if (!zzd(zzzgVar)) {
                throw zzbu.zza("AVI Header List not found", null);
            }
            ((zzyv) zzzgVar).zzo(12, false);
            this.c = 1;
            return 0;
        }
        js5 js5Var = this.b;
        zzed zzedVar = this.a;
        if (i2 == 1) {
            ((zzyv) zzzgVar).zzn(zzedVar.zzH(), 0, 12, false);
            zzedVar.zzF(0);
            js5Var.getClass();
            js5Var.a = zzedVar.zzg();
            js5Var.b = zzedVar.zzg();
            js5Var.getClass();
            int i3 = js5Var.a;
            if (i3 != 1414744396) {
                throw zzbu.zza("LIST expected, found: " + i3, null);
            }
            int iZzg = zzedVar.zzg();
            js5Var.getClass();
            if (iZzg == 1819436136) {
                this.j = js5Var.b;
                this.c = 2;
                return 0;
            }
            throw zzbu.zza("hdrl expected, found: " + iZzg, null);
        }
        if (i2 == 2) {
            int i4 = this.j - 4;
            zzed zzedVar2 = new zzed(i4);
            ((zzyv) zzzgVar).zzn(zzedVar2.zzH(), 0, i4, false);
            ps5 ps5VarB = ps5.b(1819436136, zzedVar2);
            int i5 = ps5VarB.b;
            if (i5 != 1819436136) {
                throw zzbu.zza("Unexpected header list type " + i5, null);
            }
            ms5 ms5Var = (ms5) ps5VarB.a(ms5.class);
            if (ms5Var == null) {
                throw zzbu.zza("AviHeader not found", null);
            }
            this.e = ms5Var;
            this.f = ((long) ms5Var.c) * ((long) ms5Var.a);
            ArrayList arrayList = new ArrayList();
            zzfuv zzfuvVar = ps5VarB.a;
            int size = zzfuvVar.size();
            int i6 = 0;
            int i7 = 0;
            while (i6 < size) {
                hs5 hs5Var = (hs5) zzfuvVar.get(i6);
                if (hs5Var.zza() == 1819440243) {
                    ps5 ps5Var = (ps5) hs5Var;
                    int i8 = i7 + 1;
                    ns5 ns5Var = (ns5) ps5Var.a(ns5.class);
                    qs5 qs5Var = (qs5) ps5Var.a(qs5.class);
                    if (ns5Var == null) {
                        Log.w("AviExtractor", "Missing Stream Header");
                    } else {
                        if (qs5Var == null) {
                            Log.w("AviExtractor", "Missing Stream Format");
                        } else {
                            i = size;
                            long jZzw = zzel.zzw(ns5Var.d, ((long) ns5Var.b) * 1000000, ns5Var.c);
                            zzaf zzafVar = qs5Var.a;
                            zzad zzadVarZzb = zzafVar.zzb();
                            zzadVarZzb.zzG(i7);
                            int i9 = ns5Var.e;
                            if (i9 != 0) {
                                zzadVarZzb.zzL(i9);
                            }
                            rs5 rs5Var = (rs5) ps5Var.a(rs5.class);
                            if (rs5Var != null) {
                                zzadVarZzb.zzJ(rs5Var.a);
                            }
                            int iZzb = zzbt.zzb(zzafVar.zzm);
                            if (iZzb == 1) {
                                zzaam zzaamVarZzv = this.d.zzv(i7, iZzb);
                                zzaamVarZzv.zzk(zzadVarZzb.zzY());
                                os5 os5Var2 = new os5(i7, iZzb, jZzw, ns5Var.d, zzaamVarZzv);
                                this.f = jZzw;
                                os5Var = os5Var2;
                            } else if (iZzb == 2) {
                                iZzb = 2;
                                zzaam zzaamVarZzv2 = this.d.zzv(i7, iZzb);
                                zzaamVarZzv2.zzk(zzadVarZzb.zzY());
                                os5 os5Var3 = new os5(i7, iZzb, jZzw, ns5Var.d, zzaamVarZzv2);
                                this.f = jZzw;
                                os5Var = os5Var3;
                            } else {
                                os5Var = null;
                            }
                        }
                        if (os5Var != null) {
                            arrayList.add(os5Var);
                        }
                        i7 = i8;
                    }
                    i = size;
                    if (os5Var != null) {
                        arrayList.add(os5Var);
                    }
                    i7 = i8;
                } else {
                    i = size;
                }
                i6++;
                os5Var = null;
                size = i;
            }
            this.g = (os5[]) arrayList.toArray(new os5[0]);
            this.d.zzB();
            this.c = 3;
            return 0;
        }
        if (i2 == 3) {
            long j3 = this.k;
            if (j3 != -1 && zzzgVar.zzf() != j3) {
                this.h = j3;
                return 0;
            }
            ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, 12, false);
            zzzgVar.zzj();
            zzedVar.zzF(0);
            js5Var.getClass();
            js5Var.a = zzedVar.zzg();
            js5Var.b = zzedVar.zzg();
            js5Var.getClass();
            int iZzg2 = zzedVar.zzg();
            int i10 = js5Var.a;
            if (i10 == 1179011410) {
                ((zzyv) zzzgVar).zzo(12, false);
                return 0;
            }
            if (i10 != 1414744396 || iZzg2 != 1769369453) {
                this.h = zzzgVar.zzf() + ((long) js5Var.b) + 8;
                return 0;
            }
            long jZzf2 = zzzgVar.zzf();
            this.k = jZzf2;
            long j4 = jZzf2 + ((long) js5Var.b) + 8;
            this.l = j4;
            if (!this.n) {
                ms5 ms5Var2 = this.e;
                ms5Var2.getClass();
                if ((ms5Var2.b & 16) == 16) {
                    this.c = 4;
                    this.h = j4;
                    return 0;
                }
                this.d.zzL(new zzaah(this.f, 0L));
                this.n = true;
            }
            this.h = zzzgVar.zzf() + 12;
            this.c = 6;
            return 0;
        }
        if (i2 == 4) {
            ((zzyv) zzzgVar).zzn(zzedVar.zzH(), 0, 8, false);
            zzedVar.zzF(0);
            int iZzg3 = zzedVar.zzg();
            int iZzg4 = zzedVar.zzg();
            if (iZzg3 == 829973609) {
                this.c = 5;
                this.m = iZzg4;
            } else {
                this.h = zzzgVar.zzf() + ((long) iZzg4);
            }
            return 0;
        }
        if (i2 == 5) {
            zzed zzedVar3 = new zzed(this.m);
            ((zzyv) zzzgVar).zzn(zzedVar3.zzH(), 0, this.m, false);
            if (zzedVar3.zza() < 16) {
                j = 0;
            } else {
                int iZzc = zzedVar3.zzc();
                zzedVar3.zzG(8);
                int iZzg5 = zzedVar3.zzg();
                long j5 = this.k;
                j = ((long) iZzg5) > j5 ? 0L : j5 + 8;
                zzedVar3.zzF(iZzc);
            }
            while (zzedVar3.zza() >= 16) {
                int iZzg6 = zzedVar3.zzg();
                int iZzg7 = zzedVar3.zzg();
                long jZzg = ((long) zzedVar3.zzg()) + j;
                zzedVar3.zzg();
                os5 os5VarA = a(iZzg6);
                if (os5VarA != null) {
                    if ((iZzg7 & 16) == 16) {
                        if (os5VarA.j == os5VarA.l.length) {
                            long[] jArr = os5VarA.k;
                            os5VarA.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                            int[] iArr = os5VarA.l;
                            os5VarA.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                        }
                        long[] jArr2 = os5VarA.k;
                        int i11 = os5VarA.j;
                        jArr2[i11] = jZzg;
                        os5VarA.l[i11] = os5VarA.i;
                        os5VarA.j = i11 + 1;
                    }
                    os5VarA.i++;
                }
            }
            for (os5 os5Var4 : this.g) {
                os5Var4.k = Arrays.copyOf(os5Var4.k, os5Var4.j);
                os5Var4.l = Arrays.copyOf(os5Var4.l, os5Var4.j);
            }
            this.n = true;
            this.d.zzL(new is5(this, this.f));
            this.c = 6;
            this.h = this.k;
            return 0;
        }
        if (zzzgVar.zzf() >= this.l) {
            return -1;
        }
        os5 os5Var5 = this.i;
        if (os5Var5 != null) {
            int i12 = os5Var5.g;
            int iZze = i12 - os5Var5.a.zze(zzzgVar, i12, false);
            os5Var5.g = iZze;
            boolean z2 = iZze == 0;
            if (z2) {
                if (os5Var5.f > 0) {
                    zzaam zzaamVar = os5Var5.a;
                    int i13 = os5Var5.h;
                    zzaamVar.zzs((os5Var5.d * ((long) i13)) / ((long) os5Var5.e), Arrays.binarySearch(os5Var5.l, i13) >= 0 ? 1 : 0, os5Var5.f, 0, null);
                }
                os5Var5.h++;
            }
            if (!z2) {
                return 0;
            }
            this.i = null;
            return 0;
        }
        if ((zzzgVar.zzf() & 1) == 1) {
            ((zzyv) zzzgVar).zzo(1, false);
        }
        zzyv zzyvVar = (zzyv) zzzgVar;
        zzyvVar.zzm(zzedVar.zzH(), 0, 12, false);
        zzedVar.zzF(0);
        int iZzg8 = zzedVar.zzg();
        if (iZzg8 == 1414744396) {
            zzedVar.zzF(8);
            zzyvVar.zzo(zzedVar.zzg() != 1769369453 ? 8 : 12, false);
            zzzgVar.zzj();
            return 0;
        }
        int iZzg9 = zzedVar.zzg();
        if (iZzg8 == 1263424842) {
            this.h = zzzgVar.zzf() + ((long) iZzg9) + 8;
            return 0;
        }
        zzyvVar.zzo(8, false);
        zzzgVar.zzj();
        os5 os5VarA2 = a(iZzg8);
        if (os5VarA2 == null) {
            this.h = zzzgVar.zzf() + ((long) iZzg9);
            return 0;
        }
        os5VarA2.f = iZzg9;
        os5VarA2.g = iZzg9;
        this.i = os5VarA2;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.c = 0;
        this.d = zzziVar;
        this.h = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        int i;
        this.h = -1L;
        this.i = null;
        for (os5 os5Var : this.g) {
            if (os5Var.j == 0) {
                os5Var.h = 0;
            } else {
                os5Var.h = os5Var.l[zzel.zzd(os5Var.k, j, true, true)];
            }
        }
        if (j != 0) {
            i = 6;
        } else {
            if (this.g.length == 0) {
                this.c = 0;
                return;
            }
            i = 3;
        }
        this.c = i;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) {
        zzed zzedVar = this.a;
        ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, 12, false);
        zzedVar.zzF(0);
        if (zzedVar.zzg() != 1179011410) {
            return false;
        }
        zzedVar.zzG(4);
        return zzedVar.zzg() == 541677121;
    }
}
