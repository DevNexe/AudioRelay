package com.google.android.gms.internal.ads;

import defpackage.nw5;
import defpackage.pw5;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahi implements zzagz {
    public final zzaia a;
    public long e;
    public String g;
    public zzaam h;
    public nw5 i;
    public boolean j;
    public boolean l;
    public final boolean[] f = new boolean[3];
    public final pw5 b = new pw5(7);
    public final pw5 c = new pw5(8);
    public final pw5 d = new pw5(6);
    public long k = -9223372036854775807L;
    public final zzed m = new zzed();

    public zzahi(zzaia zzaiaVar, boolean z, boolean z2) {
        this.a = zzaiaVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzed zzedVar) {
        pw5 pw5Var;
        pw5 pw5Var2;
        pw5 pw5Var3;
        int i;
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        int i4;
        int i5;
        boolean z;
        int i6;
        zzdd.zzb(this.h);
        int i7 = zzel.zza;
        int iZzc = zzedVar.zzc();
        int iZzd = zzedVar.zzd();
        byte[] bArrZzH = zzedVar.zzH();
        this.e += (long) zzedVar.zza();
        this.h.zzq(zzedVar, zzedVar.zza());
        while (true) {
            int iZza = zzaac.zza(bArrZzH, iZzc, iZzd, this.f);
            pw5Var = this.c;
            pw5Var2 = this.b;
            pw5Var3 = this.d;
            if (iZza == iZzd) {
                break;
            }
            int i8 = iZza + 3;
            int i9 = bArrZzH[i8] & 31;
            int i10 = iZza - iZzc;
            if (i10 > 0) {
                if (!this.j) {
                    pw5Var2.a(bArrZzH, iZzc, iZza);
                    pw5Var.a(bArrZzH, iZzc, iZza);
                }
                pw5Var3.a(bArrZzH, iZzc, iZza);
            }
            int i11 = iZzd - iZza;
            long j = this.e - ((long) i11);
            int i12 = i10 < 0 ? -i10 : 0;
            long j2 = this.k;
            if (this.j) {
                i2 = i11;
                i3 = iZzd;
                bArr2 = bArrZzH;
                i4 = i8;
                i5 = i9;
            } else {
                pw5Var2.d(i12);
                pw5Var.d(i12);
                if (this.j) {
                    i2 = i11;
                    i3 = iZzd;
                    bArr2 = bArrZzH;
                    i4 = i8;
                    i5 = i9;
                    if (pw5Var2.c) {
                        zzaab zzaabVarZzd = zzaac.zzd(pw5Var2.d, 4, pw5Var2.e);
                        this.i.b.append(zzaabVarZzd.zzd, zzaabVarZzd);
                        pw5Var2.b();
                    } else if (pw5Var.c) {
                        zzaaa zzaaaVarZzc = zzaac.zzc(pw5Var.d, 4, pw5Var.e);
                        this.i.c.append(zzaaaVarZzc.zza, zzaaaVarZzc);
                        pw5Var.b();
                    }
                } else if (pw5Var2.c && pw5Var.c) {
                    ArrayList arrayList = new ArrayList();
                    i4 = i8;
                    arrayList.add(Arrays.copyOf(pw5Var2.d, pw5Var2.e));
                    arrayList.add(Arrays.copyOf(pw5Var.d, pw5Var.e));
                    i3 = iZzd;
                    zzaab zzaabVarZzd2 = zzaac.zzd(pw5Var2.d, 4, pw5Var2.e);
                    bArr2 = bArrZzH;
                    zzaaa zzaaaVarZzc2 = zzaac.zzc(pw5Var.d, 4, pw5Var.e);
                    i5 = i9;
                    String strZza = zzdf.zza(zzaabVarZzd2.zza, zzaabVarZzd2.zzb, zzaabVarZzd2.zzc);
                    zzaam zzaamVar = this.h;
                    zzad zzadVar = new zzad();
                    i2 = i11;
                    zzadVar.zzH(this.g);
                    zzadVar.zzS("video/avc");
                    zzadVar.zzx(strZza);
                    zzadVar.zzX(zzaabVarZzd2.zze);
                    zzadVar.zzF(zzaabVarZzd2.zzf);
                    zzadVar.zzP(zzaabVarZzd2.zzg);
                    zzadVar.zzI(arrayList);
                    zzaamVar.zzk(zzadVar.zzY());
                    this.j = true;
                    this.i.b.append(zzaabVarZzd2.zzd, zzaabVarZzd2);
                    this.i.c.append(zzaaaVarZzc2.zza, zzaaaVarZzc2);
                    pw5Var2.b();
                    pw5Var.b();
                } else {
                    i2 = i11;
                    i3 = iZzd;
                    bArr2 = bArrZzH;
                    i4 = i8;
                    i5 = i9;
                }
            }
            if (pw5Var3.d(i12)) {
                int iZzb = zzaac.zzb(pw5Var3.d, pw5Var3.e);
                byte[] bArr3 = pw5Var3.d;
                zzed zzedVar2 = this.m;
                zzedVar2.zzD(bArr3, iZzb);
                zzedVar2.zzF(4);
                this.a.zza(j2, zzedVar2);
            }
            nw5 nw5Var = this.i;
            boolean z2 = this.j;
            boolean z3 = this.l;
            if (nw5Var.d != 9) {
                j = j;
                z = true;
            } else {
                if (z2 && nw5Var.g) {
                    long j3 = nw5Var.e;
                    int i13 = i2 + ((int) (j - j3));
                    long j4 = nw5Var.i;
                    if (j4 != -9223372036854775807L) {
                        nw5Var.a.zzs(j4, nw5Var.j ? 1 : 0, (int) (j3 - nw5Var.h), i13, null);
                    }
                }
                nw5Var.h = nw5Var.e;
                nw5Var.i = nw5Var.f;
                nw5Var.j = false;
                z = true;
                nw5Var.g = true;
            }
            boolean z4 = nw5Var.j;
            int i14 = nw5Var.d;
            if (i14 != 5 && (!z3 || i14 != z)) {
                z = false;
            }
            boolean z5 = z | z4;
            nw5Var.j = z5;
            if (z5) {
                this.l = false;
            }
            long j5 = this.k;
            if (this.j) {
                i6 = i5;
            } else {
                i6 = i5;
                pw5Var2.c(i6);
                pw5Var.c(i6);
            }
            pw5Var3.c(i6);
            nw5 nw5Var2 = this.i;
            nw5Var2.d = i6;
            nw5Var2.f = j5;
            nw5Var2.e = j;
            iZzc = i4;
            iZzd = i3;
            bArrZzH = bArr2;
        }
        int i15 = iZzd;
        byte[] bArr4 = bArrZzH;
        if (this.j) {
            i = i15;
            bArr = bArr4;
        } else {
            i = i15;
            bArr = bArr4;
            pw5Var2.a(bArr, iZzc, i);
            pw5Var.a(bArr, iZzc, i);
        }
        pw5Var3.a(bArr, iZzc, i);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        zzailVar.zzc();
        this.g = zzailVar.zzb();
        zzaam zzaamVarZzv = zzziVar.zzv(zzailVar.zza(), 2);
        this.h = zzaamVarZzv;
        this.i = new nw5(zzaamVarZzv);
        this.a.zzb(zzziVar, zzailVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
        this.l |= (i & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zze() {
        this.e = 0L;
        this.l = false;
        this.k = -9223372036854775807L;
        zzaac.zze(this.f);
        this.b.b();
        this.c.b();
        this.d.b();
        nw5 nw5Var = this.i;
        if (nw5Var != null) {
            nw5Var.g = false;
        }
    }
}
