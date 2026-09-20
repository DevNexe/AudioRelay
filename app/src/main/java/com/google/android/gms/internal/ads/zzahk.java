package com.google.android.gms.internal.ads;

import defpackage.bj0;
import defpackage.ow5;
import defpackage.pw5;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahk implements zzagz {
    public final zzaia a;
    public String b;
    public zzaam c;
    public ow5 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final pw5 g = new pw5(32);
    public final pw5 h = new pw5(33);
    public final pw5 i = new pw5(34);
    public final pw5 j = new pw5(39);
    public final pw5 k = new pw5(40);
    public long m = -9223372036854775807L;
    public final zzed n = new zzed();

    public zzahk(zzaia zzaiaVar) {
        this.a = zzaiaVar;
    }

    @RequiresNonNull({"sampleReader"})
    public final void a(byte[] bArr, int i, int i2) {
        ow5 ow5Var = this.d;
        if (ow5Var.f) {
            int i3 = ow5Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                ow5Var.g = (bArr[i4] & 128) != 0;
                ow5Var.f = false;
            } else {
                ow5Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:174:0x038f  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:178:0x03be  */
    /* JADX WARN: Code duplicated, block: B:181:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:192:0x0404  */
    /* JADX WARN: Code duplicated, block: B:195:0x040b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0426  */
    /* JADX WARN: Code duplicated, block: B:207:0x0438  */
    /* JADX WARN: Code duplicated, block: B:214:0x0444  */
    /* JADX WARN: Code duplicated, block: B:217:0x044b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d3  */
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
        int i;
        int i2;
        boolean z;
        pw5 pw5Var;
        pw5 pw5Var2;
        pw5 pw5Var3;
        long j;
        pw5 pw5Var4;
        boolean zD;
        zzaia zzaiaVar;
        zzed zzedVar2;
        long j2;
        pw5 pw5Var5;
        ow5 ow5Var;
        boolean z2;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        int i3;
        int i4;
        zzdd.zzb(this.c);
        int i5 = zzel.zza;
        while (zzedVar.zza() > 0) {
            int iZzc = zzedVar.zzc();
            int iZzd = zzedVar.zzd();
            byte[] bArrZzH = zzedVar.zzH();
            this.l += (long) zzedVar.zza();
            this.c.zzq(zzedVar, zzedVar.zza());
            while (iZzc < iZzd) {
                int iZza = zzaac.zza(bArrZzH, iZzc, iZzd, this.f);
                if (iZza == iZzd) {
                    a(bArrZzH, iZzc, iZzd);
                    return;
                }
                int i6 = iZza + 3;
                int i7 = (bArrZzH[i6] & 126) >> 1;
                int i8 = iZza - iZzc;
                if (i8 > 0) {
                    a(bArrZzH, iZzc, iZza);
                }
                int i9 = iZzd - iZza;
                long j5 = this.l - ((long) i9);
                int i10 = i8 < 0 ? -i8 : 0;
                long j6 = this.m;
                ow5 ow5Var2 = this.d;
                boolean z5 = this.e;
                if (ow5Var2.j && ow5Var2.g) {
                    ow5Var2.m = ow5Var2.c;
                    ow5Var2.j = false;
                } else {
                    if (ow5Var2.h || ow5Var2.g) {
                        if (z5 && ow5Var2.i) {
                            i2 = i6;
                            long j7 = ow5Var2.b;
                            i = iZzd;
                            int i11 = ((int) (j5 - j7)) + i9;
                            long j8 = ow5Var2.l;
                            if (j8 != -9223372036854775807L) {
                                bArrZzH = bArrZzH;
                                ow5Var2.a.zzs(j8, ow5Var2.m ? 1 : 0, (int) (j7 - ow5Var2.k), i11, null);
                            }
                            ow5Var2.k = ow5Var2.b;
                            ow5Var2.l = ow5Var2.e;
                            ow5Var2.m = ow5Var2.c;
                            ow5Var2.i = true;
                        } else {
                            i = iZzd;
                            i2 = i6;
                        }
                        ow5Var2.k = ow5Var2.b;
                        ow5Var2.l = ow5Var2.e;
                        ow5Var2.m = ow5Var2.c;
                        ow5Var2.i = true;
                    }
                    z = this.e;
                    pw5Var = this.i;
                    pw5Var2 = this.h;
                    pw5Var3 = this.g;
                    if (z) {
                        pw5Var3 = pw5Var3;
                        j5 = j5;
                        j = j6;
                    } else {
                        pw5Var3.d(i10);
                        pw5Var2.d(i10);
                        pw5Var.d(i10);
                        if (!pw5Var3.c && pw5Var2.c && pw5Var.c) {
                            zzaam zzaamVar = this.c;
                            String str = this.b;
                            int i12 = pw5Var3.e;
                            byte[] bArr = new byte[pw5Var2.e + i12 + pw5Var.e];
                            int i13 = 0;
                            System.arraycopy(pw5Var3.d, 0, bArr, 0, i12);
                            System.arraycopy(pw5Var2.d, 0, bArr, pw5Var3.e, pw5Var2.e);
                            System.arraycopy(pw5Var.d, 0, bArr, pw5Var3.e + pw5Var2.e, pw5Var.e);
                            zzaae zzaaeVar = new zzaae(pw5Var2.d, 0, pw5Var2.e);
                            zzaaeVar.zze(44);
                            int iZza2 = zzaaeVar.zza(3);
                            zzaaeVar.zzd();
                            int iZza3 = zzaaeVar.zza(2);
                            boolean zZzf = zzaaeVar.zzf();
                            int iZza4 = zzaaeVar.zza(5);
                            int i14 = 0;
                            for (int i15 = 32; i13 < i15; i15 = 32) {
                                if (zzaaeVar.zzf()) {
                                    i14 |= 1 << i13;
                                }
                                i13++;
                            }
                            int[] iArr = new int[6];
                            for (int i16 = 0; i16 < 6; i16++) {
                                iArr[i16] = zzaaeVar.zza(8);
                            }
                            int iZza5 = zzaaeVar.zza(8);
                            int i17 = 0;
                            for (int i18 = 0; i18 < iZza2; i18++) {
                                if (zzaaeVar.zzf()) {
                                    i17 += 89;
                                }
                                if (zzaaeVar.zzf()) {
                                    i17 += 8;
                                }
                            }
                            zzaaeVar.zze(i17);
                            if (iZza2 > 0) {
                                int i19 = 8 - iZza2;
                                zzaaeVar.zze(i19 + i19);
                            }
                            zzaaeVar.zzc();
                            int iZzc2 = zzaaeVar.zzc();
                            if (iZzc2 == 3) {
                                zzaaeVar.zzd();
                                iZzc2 = 3;
                            }
                            int iZzc3 = zzaaeVar.zzc();
                            int iZzc4 = zzaaeVar.zzc();
                            if (zzaaeVar.zzf()) {
                                int iZzc5 = zzaaeVar.zzc();
                                int iZzc6 = zzaaeVar.zzc();
                                int iZzc7 = zzaaeVar.zzc();
                                int iZzc8 = zzaaeVar.zzc();
                                if (iZzc2 != 1) {
                                    if (iZzc2 == 2) {
                                        iZzc2 = 2;
                                        i3 = 2;
                                    } else {
                                        i3 = 1;
                                    }
                                    if (iZzc2 == 1) {
                                        i4 = 2;
                                    } else {
                                        i4 = 1;
                                    }
                                    iZzc3 -= (iZzc5 + iZzc6) * i3;
                                    iZzc4 -= (iZzc7 + iZzc8) * i4;
                                } else {
                                    i3 = 2;
                                }
                                if (iZzc2 == 1) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                iZzc3 -= (iZzc5 + iZzc6) * i3;
                                iZzc4 -= (iZzc7 + iZzc8) * i4;
                            } else {
                                j5 = j5;
                            }
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            int iZzc9 = zzaaeVar.zzc();
                            for (int i20 = true != zzaaeVar.zzf() ? iZza2 : 0; i20 <= iZza2; i20++) {
                                zzaaeVar.zzc();
                                zzaaeVar.zzc();
                                zzaaeVar.zzc();
                            }
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            zzaaeVar.zzc();
                            if (zzaaeVar.zzf() && zzaaeVar.zzf()) {
                                int i21 = 0;
                                for (int i22 = 4; i21 < i22; i22 = 4) {
                                    int i23 = 6;
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        if (zzaaeVar.zzf()) {
                                            int iMin = Math.min(64, 1 << ((i21 + i21) + 4));
                                            if (i21 > 1) {
                                                zzaaeVar.zzb();
                                            }
                                            for (int i25 = 0; i25 < iMin; i25++) {
                                                zzaaeVar.zzb();
                                            }
                                        } else {
                                            zzaaeVar.zzc();
                                        }
                                        i24 += i21 == 3 ? 3 : 1;
                                        i23 = 6;
                                        j6 = j6;
                                    }
                                    i21++;
                                }
                            }
                            j = j6;
                            zzaaeVar.zze(2);
                            if (zzaaeVar.zzf()) {
                                zzaaeVar.zze(8);
                                zzaaeVar.zzc();
                                zzaaeVar.zzc();
                                zzaaeVar.zzd();
                            }
                            int i26 = 0;
                            boolean zZzf2 = false;
                            int i27 = 0;
                            for (int iZzc10 = zzaaeVar.zzc(); i26 < iZzc10; iZzc10 = iZzc10) {
                                if (i26 != 0) {
                                    zZzf2 = zzaaeVar.zzf();
                                }
                                if (zZzf2) {
                                    zzaaeVar.zzd();
                                    zzaaeVar.zzc();
                                    for (int i28 = 0; i28 <= i27; i28++) {
                                        if (zzaaeVar.zzf()) {
                                            zzaaeVar.zzd();
                                        }
                                    }
                                } else {
                                    int iZzc11 = zzaaeVar.zzc();
                                    int iZzc12 = zzaaeVar.zzc();
                                    int i29 = iZzc11 + iZzc12;
                                    for (int i30 = 0; i30 < iZzc11; i30++) {
                                        zzaaeVar.zzc();
                                        zzaaeVar.zzd();
                                    }
                                    for (int i31 = 0; i31 < iZzc12; i31++) {
                                        zzaaeVar.zzc();
                                        zzaaeVar.zzd();
                                    }
                                    i27 = i29;
                                }
                                i26++;
                            }
                            if (zzaaeVar.zzf()) {
                                for (int i32 = 0; i32 < zzaaeVar.zzc(); i32++) {
                                    zzaaeVar.zze(iZzc9 + 5);
                                }
                            }
                            zzaaeVar.zze(2);
                            float f = 1.0f;
                            if (zzaaeVar.zzf()) {
                                if (zzaaeVar.zzf()) {
                                    int iZza6 = zzaaeVar.zza(8);
                                    if (iZza6 == 255) {
                                        int iZza7 = zzaaeVar.zza(16);
                                        int iZza8 = zzaaeVar.zza(16);
                                        if (iZza7 != 0 && iZza8 != 0) {
                                            f = iZza7 / iZza8;
                                        }
                                    } else if (iZza6 < 17) {
                                        f = zzaac.zzb[iZza6];
                                    } else {
                                        bj0.b("Unexpected aspect_ratio_idc value: ", iZza6, "H265Reader");
                                    }
                                }
                                if (zzaaeVar.zzf()) {
                                    zzaaeVar.zzd();
                                }
                                if (zzaaeVar.zzf()) {
                                    zzaaeVar.zze(4);
                                    if (zzaaeVar.zzf()) {
                                        zzaaeVar.zze(24);
                                    }
                                }
                                if (zzaaeVar.zzf()) {
                                    zzaaeVar.zzc();
                                    zzaaeVar.zzc();
                                }
                                zzaaeVar.zzd();
                                if (zzaaeVar.zzf()) {
                                    iZzc4 += iZzc4;
                                }
                            }
                            String strZzb = zzdf.zzb(iZza3, zZzf, iZza4, i14, iArr, iZza5);
                            zzad zzadVar = new zzad();
                            zzadVar.zzH(str);
                            zzadVar.zzS("video/hevc");
                            zzadVar.zzx(strZzb);
                            zzadVar.zzX(iZzc3);
                            zzadVar.zzF(iZzc4);
                            zzadVar.zzP(f);
                            zzadVar.zzI(Collections.singletonList(bArr));
                            zzaamVar.zzk(zzadVar.zzY());
                            this.e = true;
                        } else {
                            pw5Var3 = pw5Var3;
                            j5 = j5;
                            j = j6;
                        }
                    }
                    pw5Var4 = this.j;
                    zD = pw5Var4.d(i10);
                    zzaiaVar = this.a;
                    zzedVar2 = this.n;
                    if (zD) {
                        zzedVar2.zzD(pw5Var4.d, zzaac.zzb(pw5Var4.d, pw5Var4.e));
                        zzedVar2.zzG(5);
                        j2 = j;
                        zzaiaVar.zza(j2, zzedVar2);
                    } else {
                        j2 = j;
                    }
                    pw5Var5 = this.k;
                    if (pw5Var5.d(i10)) {
                        zzedVar2.zzD(pw5Var5.d, zzaac.zzb(pw5Var5.d, pw5Var5.e));
                        zzedVar2.zzG(5);
                        zzaiaVar.zza(j2, zzedVar2);
                    }
                    long j9 = this.m;
                    ow5Var = this.d;
                    z2 = this.e;
                    ow5Var.g = false;
                    ow5Var.h = false;
                    ow5Var.e = j9;
                    ow5Var.d = 0;
                    j3 = j5;
                    ow5Var.b = j3;
                    if (i7 >= 32 && i7 != 40) {
                        if (ow5Var.i && !ow5Var.j) {
                            if (z2) {
                                j4 = ow5Var.l;
                                if (j4 != -9223372036854775807L) {
                                    ow5Var.a.zzs(j4, ow5Var.m ? 1 : 0, (int) (j3 - ow5Var.k), i9, null);
                                }
                            }
                            ow5Var.i = false;
                        }
                        if (i7 > 35 || i7 == 39) {
                            ow5Var.h = !ow5Var.j;
                            ow5Var.j = true;
                        }
                    }
                    if (i7 >= 16 || i7 > 21) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    ow5Var.c = z3;
                    if (!z3 || i7 <= 9) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ow5Var.f = z4;
                    if (!this.e) {
                        pw5Var3.c(i7);
                        pw5Var2.c(i7);
                        pw5Var.c(i7);
                    }
                    pw5Var4.c(i7);
                    pw5Var5.c(i7);
                    iZzc = i2;
                    iZzd = i;
                    bArrZzH = bArrZzH;
                }
                i = iZzd;
                bArrZzH = bArrZzH;
                i2 = i6;
                i9 = i9;
                z = this.e;
                pw5Var = this.i;
                pw5Var2 = this.h;
                pw5Var3 = this.g;
                if (z) {
                    pw5Var3.d(i10);
                    pw5Var2.d(i10);
                    pw5Var.d(i10);
                    if (!pw5Var3.c) {
                        pw5Var3 = pw5Var3;
                        j5 = j5;
                        j = j6;
                    } else {
                        pw5Var3 = pw5Var3;
                        j5 = j5;
                        j = j6;
                    }
                } else {
                    pw5Var3 = pw5Var3;
                    j5 = j5;
                    j = j6;
                }
                pw5Var4 = this.j;
                zD = pw5Var4.d(i10);
                zzaiaVar = this.a;
                zzedVar2 = this.n;
                if (zD) {
                    zzedVar2.zzD(pw5Var4.d, zzaac.zzb(pw5Var4.d, pw5Var4.e));
                    zzedVar2.zzG(5);
                    j2 = j;
                    zzaiaVar.zza(j2, zzedVar2);
                } else {
                    j2 = j;
                }
                pw5Var5 = this.k;
                if (pw5Var5.d(i10)) {
                    zzedVar2.zzD(pw5Var5.d, zzaac.zzb(pw5Var5.d, pw5Var5.e));
                    zzedVar2.zzG(5);
                    zzaiaVar.zza(j2, zzedVar2);
                }
                long j10 = this.m;
                ow5Var = this.d;
                z2 = this.e;
                ow5Var.g = false;
                ow5Var.h = false;
                ow5Var.e = j10;
                ow5Var.d = 0;
                j3 = j5;
                ow5Var.b = j3;
                if (i7 >= 32) {
                    if (ow5Var.i) {
                        if (z2) {
                            j4 = ow5Var.l;
                            if (j4 != -9223372036854775807L) {
                                ow5Var.a.zzs(j4, ow5Var.m ? 1 : 0, (int) (j3 - ow5Var.k), i9, null);
                            }
                        }
                        ow5Var.i = false;
                    }
                    if (i7 > 35) {
                        ow5Var.h = !ow5Var.j;
                        ow5Var.j = true;
                    } else {
                        ow5Var.h = !ow5Var.j;
                        ow5Var.j = true;
                    }
                }
                if (i7 >= 16) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                ow5Var.c = z3;
                if (z3) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                ow5Var.f = z4;
                if (!this.e) {
                    pw5Var3.c(i7);
                    pw5Var2.c(i7);
                    pw5Var.c(i7);
                }
                pw5Var4.c(i7);
                pw5Var5.c(i7);
                iZzc = i2;
                iZzd = i;
                bArrZzH = bArrZzH;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        zzailVar.zzc();
        this.b = zzailVar.zzb();
        zzaam zzaamVarZzv = zzziVar.zzv(zzailVar.zza(), 2);
        this.c = zzaamVarZzv;
        this.d = new ow5(zzaamVarZzv);
        this.a.zzb(zzziVar, zzailVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zze() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        zzaac.zze(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        ow5 ow5Var = this.d;
        if (ow5Var != null) {
            ow5Var.f = false;
            ow5Var.g = false;
            ow5Var.h = false;
            ow5Var.i = false;
            ow5Var.j = false;
        }
    }
}
