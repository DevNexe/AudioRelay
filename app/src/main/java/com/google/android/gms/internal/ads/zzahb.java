package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.ax5;
import defpackage.jw5;
import defpackage.pw5;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahb implements zzagz {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public zzaam b;
    public final ax5 c;
    public final zzed d;
    public final pw5 e;
    public final boolean[] f;
    public final jw5 g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public zzahb() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:52:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01be  */
    /* JADX WARN: Code duplicated, block: B:84:0x01db  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x0207  */
    /* JADX WARN: Code duplicated, block: B:98:0x0209  */
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
        jw5 jw5Var;
        pw5 pw5Var;
        int i;
        int i2;
        int i3;
        long j;
        long j2;
        boolean z;
        long j3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        float f2;
        int i9;
        zzdd.zzb(this.b);
        int iZzc = zzedVar.zzc();
        int iZzd = zzedVar.zzd();
        byte[] bArrZzH = zzedVar.zzH();
        this.h += (long) zzedVar.zza();
        this.b.zzq(zzedVar, zzedVar.zza());
        while (true) {
            int iZza = zzaac.zza(bArrZzH, iZzc, iZzd, this.f);
            jw5Var = this.g;
            pw5Var = this.e;
            if (iZza == iZzd) {
                break;
            }
            int i10 = iZza + 3;
            int i11 = zzedVar.zzH()[i10] & 255;
            int i12 = iZza - iZzc;
            if (this.j) {
                i10 = i10;
                i11 = i11;
            } else {
                if (i12 > 0) {
                    jw5Var.a(bArrZzH, iZzc, iZza);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                if (jw5Var.a) {
                    int i14 = jw5Var.b - i13;
                    jw5Var.b = i14;
                    if (jw5Var.c == 0 && i11 == 181) {
                        jw5Var.c = i14;
                    } else {
                        jw5Var.a = false;
                        z2 = true;
                    }
                    if (z2) {
                        String str = this.a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(jw5Var.d, jw5Var.b);
                        byte b = bArrCopyOf[4];
                        int i15 = bArrCopyOf[5] & 255;
                        i5 = ((b & 255) << 4) | (i15 >> 4);
                        i6 = ((i15 & 15) << 8) | (bArrCopyOf[6] & 255);
                        i7 = (bArrCopyOf[7] & 240) >> 4;
                        if (i7 != 2) {
                            f = i6 * 4;
                            i8 = i5 * 3;
                        } else if (i7 != 3) {
                            if (i7 != 4) {
                                f2 = 1.0f;
                            } else {
                                f = i6 * 121;
                                i8 = i5 * 100;
                            }
                            zzad zzadVar = new zzad();
                            zzadVar.zzH(str);
                            zzadVar.zzS("video/mpeg2");
                            zzadVar.zzX(i5);
                            zzadVar.zzF(i6);
                            zzadVar.zzP(f2);
                            zzadVar.zzI(Collections.singletonList(bArrCopyOf));
                            zzaf zzafVarZzY = zzadVar.zzY();
                            i9 = (bArrCopyOf[7] & 15) - 1;
                            long j4 = 0;
                            if (i9 >= 0 || i9 >= 8) {
                                i10 = i10;
                                i11 = i11;
                            } else {
                                double d = q[i9];
                                byte b2 = bArrCopyOf[jw5Var.c + 9];
                                int i16 = (b2 & 96) >> 5;
                                int i17 = b2 & 31;
                                if (i16 != i17) {
                                    d *= (((double) i16) + 1.0d) / ((double) (i17 + 1));
                                }
                                j4 = (long) (1000000.0d / d);
                            }
                            Pair pairCreate = Pair.create(zzafVarZzY, Long.valueOf(j4));
                            this.b.zzk((zzaf) pairCreate.first);
                            this.k = ((Long) pairCreate.second).longValue();
                            this.j = true;
                        } else {
                            f = i6 * 16;
                            i8 = i5 * 9;
                        }
                        f2 = f / i8;
                        zzad zzadVar2 = new zzad();
                        zzadVar2.zzH(str);
                        zzadVar2.zzS("video/mpeg2");
                        zzadVar2.zzX(i5);
                        zzadVar2.zzF(i6);
                        zzadVar2.zzP(f2);
                        zzadVar2.zzI(Collections.singletonList(bArrCopyOf));
                        zzaf zzafVarZzY2 = zzadVar2.zzY();
                        i9 = (bArrCopyOf[7] & 15) - 1;
                        long j5 = 0;
                        if (i9 >= 0) {
                            i10 = i10;
                            i11 = i11;
                        } else {
                            i10 = i10;
                            i11 = i11;
                        }
                        Pair pairCreate2 = Pair.create(zzafVarZzY2, Long.valueOf(j5));
                        this.b.zzk((zzaf) pairCreate2.first);
                        this.k = ((Long) pairCreate2.second).longValue();
                        this.j = true;
                    } else {
                        i10 = i10;
                        i11 = i11;
                    }
                } else if (i11 == 179) {
                    jw5Var.a = true;
                }
                jw5Var.a(jw5.e, 0, 3);
                z2 = false;
                if (z2) {
                    String str2 = this.a;
                    str2.getClass();
                    byte[] bArrCopyOf2 = Arrays.copyOf(jw5Var.d, jw5Var.b);
                    byte b3 = bArrCopyOf2[4];
                    int i18 = bArrCopyOf2[5] & 255;
                    i5 = ((b3 & 255) << 4) | (i18 >> 4);
                    i6 = ((i18 & 15) << 8) | (bArrCopyOf2[6] & 255);
                    i7 = (bArrCopyOf2[7] & 240) >> 4;
                    if (i7 != 2) {
                        f = i6 * 4;
                        i8 = i5 * 3;
                    } else if (i7 != 3) {
                        if (i7 != 4) {
                            f2 = 1.0f;
                        } else {
                            f = i6 * 121;
                            i8 = i5 * 100;
                        }
                        zzad zzadVar3 = new zzad();
                        zzadVar3.zzH(str2);
                        zzadVar3.zzS("video/mpeg2");
                        zzadVar3.zzX(i5);
                        zzadVar3.zzF(i6);
                        zzadVar3.zzP(f2);
                        zzadVar3.zzI(Collections.singletonList(bArrCopyOf2));
                        zzaf zzafVarZzY3 = zzadVar3.zzY();
                        i9 = (bArrCopyOf2[7] & 15) - 1;
                        long j6 = 0;
                        if (i9 >= 0) {
                            i10 = i10;
                            i11 = i11;
                        } else {
                            i10 = i10;
                            i11 = i11;
                        }
                        Pair pairCreate3 = Pair.create(zzafVarZzY3, Long.valueOf(j6));
                        this.b.zzk((zzaf) pairCreate3.first);
                        this.k = ((Long) pairCreate3.second).longValue();
                        this.j = true;
                    } else {
                        f = i6 * 16;
                        i8 = i5 * 9;
                    }
                    f2 = f / i8;
                    zzad zzadVar4 = new zzad();
                    zzadVar4.zzH(str2);
                    zzadVar4.zzS("video/mpeg2");
                    zzadVar4.zzX(i5);
                    zzadVar4.zzF(i6);
                    zzadVar4.zzP(f2);
                    zzadVar4.zzI(Collections.singletonList(bArrCopyOf2));
                    zzaf zzafVarZzY4 = zzadVar4.zzY();
                    i9 = (bArrCopyOf2[7] & 15) - 1;
                    long j7 = 0;
                    if (i9 >= 0) {
                        i10 = i10;
                        i11 = i11;
                    } else {
                        i10 = i10;
                        i11 = i11;
                    }
                    Pair pairCreate4 = Pair.create(zzafVarZzY4, Long.valueOf(j7));
                    this.b.zzk((zzaf) pairCreate4.first);
                    this.k = ((Long) pairCreate4.second).longValue();
                    this.j = true;
                } else {
                    i10 = i10;
                    i11 = i11;
                }
            }
            if (pw5Var != null) {
                if (i12 > 0) {
                    pw5Var.a(bArrZzH, iZzc, iZza);
                    i4 = 0;
                } else {
                    i4 = -i12;
                }
                if (pw5Var.d(i4)) {
                    int iZzb = zzaac.zzb(pw5Var.d, pw5Var.e);
                    int i19 = zzel.zza;
                    byte[] bArr = pw5Var.d;
                    zzed zzedVar2 = this.d;
                    zzedVar2.zzD(bArr, iZzb);
                    this.c.a(this.n, zzedVar2);
                }
                i = i11;
                if (i == 178) {
                    if (zzedVar.zzH()[iZza + 2] == 1) {
                        pw5Var.c(178);
                    }
                    i2 = 178;
                }
                if (i2 != 0 || i2 == 179) {
                    i3 = iZzd - iZza;
                    if (this.p && this.j) {
                        j3 = this.n;
                        if (j3 != -9223372036854775807L) {
                            this.b.zzs(j3, this.o ? 1 : 0, ((int) (this.h - this.m)) - i3, i3, null);
                        }
                    }
                    if (this.i || this.p) {
                        this.m = this.h - ((long) i3);
                        j = this.l;
                        if (j == -9223372036854775807L) {
                            j2 = this.n;
                            if (j2 != -9223372036854775807L) {
                                j = j2 + this.k;
                            } else {
                                j = -9223372036854775807L;
                            }
                        }
                        this.n = j;
                        this.o = false;
                        this.l = -9223372036854775807L;
                        this.i = true;
                    }
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.p = z;
                } else if (i2 == 184) {
                    this.o = true;
                }
                iZzc = i10;
            } else {
                i = i11;
            }
            i2 = i;
            if (i2 != 0) {
                i3 = iZzd - iZza;
                if (this.p) {
                    j3 = this.n;
                    if (j3 != -9223372036854775807L) {
                        this.b.zzs(j3, this.o ? 1 : 0, ((int) (this.h - this.m)) - i3, i3, null);
                    }
                }
                if (this.i) {
                    this.m = this.h - ((long) i3);
                    j = this.l;
                    if (j == -9223372036854775807L) {
                        j2 = this.n;
                        if (j2 != -9223372036854775807L) {
                            j = j2 + this.k;
                        } else {
                            j = -9223372036854775807L;
                        }
                    }
                    this.n = j;
                    this.o = false;
                    this.l = -9223372036854775807L;
                    this.i = true;
                } else {
                    this.m = this.h - ((long) i3);
                    j = this.l;
                    if (j == -9223372036854775807L) {
                        j2 = this.n;
                        if (j2 != -9223372036854775807L) {
                            j = j2 + this.k;
                        } else {
                            j = -9223372036854775807L;
                        }
                    }
                    this.n = j;
                    this.o = false;
                    this.l = -9223372036854775807L;
                    this.i = true;
                }
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.p = z;
            } else {
                i3 = iZzd - iZza;
                if (this.p) {
                    j3 = this.n;
                    if (j3 != -9223372036854775807L) {
                        this.b.zzs(j3, this.o ? 1 : 0, ((int) (this.h - this.m)) - i3, i3, null);
                    }
                }
                if (this.i) {
                    this.m = this.h - ((long) i3);
                    j = this.l;
                    if (j == -9223372036854775807L) {
                        j2 = this.n;
                        if (j2 != -9223372036854775807L) {
                            j = j2 + this.k;
                        } else {
                            j = -9223372036854775807L;
                        }
                    }
                    this.n = j;
                    this.o = false;
                    this.l = -9223372036854775807L;
                    this.i = true;
                } else {
                    this.m = this.h - ((long) i3);
                    j = this.l;
                    if (j == -9223372036854775807L) {
                        j2 = this.n;
                        if (j2 != -9223372036854775807L) {
                            j = j2 + this.k;
                        } else {
                            j = -9223372036854775807L;
                        }
                    }
                    this.n = j;
                    this.o = false;
                    this.l = -9223372036854775807L;
                    this.i = true;
                }
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.p = z;
            }
            iZzc = i10;
        }
        if (!this.j) {
            jw5Var.a(bArrZzH, iZzc, iZzd);
        }
        if (pw5Var != null) {
            pw5Var.a(bArrZzH, iZzc, iZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        zzailVar.zzc();
        this.a = zzailVar.zzb();
        this.b = zzziVar.zzv(zzailVar.zza(), 2);
        ax5 ax5Var = this.c;
        if (ax5Var != null) {
            ax5Var.b(zzziVar, zzailVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzd(long j, int i) {
        this.l = j;
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zze() {
        zzaac.zze(this.f);
        jw5 jw5Var = this.g;
        jw5Var.a = false;
        jw5Var.b = 0;
        jw5Var.c = 0;
        pw5 pw5Var = this.e;
        if (pw5Var != null) {
            pw5Var.b();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    public zzahb(ax5 ax5Var) {
        zzed zzedVar;
        this.c = ax5Var;
        this.f = new boolean[4];
        this.g = new jw5();
        if (ax5Var != null) {
            this.e = new pw5(178);
            zzedVar = new zzed();
        } else {
            zzedVar = null;
            this.e = null;
        }
        this.d = zzedVar;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
}
