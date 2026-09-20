package com.google.android.gms.internal.ads;

import android.util.Log;
import defpackage.ax5;
import defpackage.kw5;
import defpackage.lw5;
import defpackage.pw5;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahe implements zzagz {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final ax5 a;
    public final zzed b;
    public final boolean[] c;
    public final kw5 d;
    public final pw5 e;
    public lw5 f;
    public long g;
    public String h;
    public zzaam i;
    public boolean j;
    public long k;

    public zzahe() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0281  */
    /* JADX WARN: Code duplicated, block: B:114:0x0283  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x012c  */
    /* JADX WARN: Code duplicated, block: B:58:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x017a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x0199  */
    /* JADX WARN: Code duplicated, block: B:75:0x019e A[LOOP:1: B:74:0x019c->B:75:0x019e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e4  */
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
        kw5 kw5Var;
        pw5 pw5Var;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        zzec zzecVar;
        int iZzc;
        float f;
        int iZzc2;
        int i3;
        int i4;
        int iZzc3;
        int iZzc4;
        zzdd.zzb(this.f);
        zzdd.zzb(this.i);
        int iZzc5 = zzedVar.zzc();
        int iZzd = zzedVar.zzd();
        byte[] bArrZzH = zzedVar.zzH();
        this.g += (long) zzedVar.zza();
        this.i.zzq(zzedVar, zzedVar.zza());
        while (true) {
            int iZza = zzaac.zza(bArrZzH, iZzc5, iZzd, this.c);
            kw5Var = this.d;
            pw5Var = this.e;
            if (iZza == iZzd) {
                break;
            }
            int i5 = iZza + 3;
            int i6 = zzedVar.zzH()[i5] & 255;
            int i7 = iZza - iZzc5;
            if (!this.j) {
                if (i7 > 0) {
                    kw5Var.a(bArrZzH, iZzc5, iZza);
                }
                int i8 = i7 < 0 ? -i7 : 0;
                int i9 = kw5Var.b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                if (i6 == 179 || i6 == 181) {
                                    kw5Var.c -= i8;
                                    kw5Var.a = false;
                                    z3 = true;
                                }
                                if (z3) {
                                    zzaam zzaamVar = this.i;
                                    int i10 = kw5Var.d;
                                    String str = this.h;
                                    str.getClass();
                                    byte[] bArrCopyOf = Arrays.copyOf(kw5Var.e, kw5Var.c);
                                    zzecVar = new zzec(bArrCopyOf, bArrCopyOf.length);
                                    zzecVar.zzk(i10);
                                    zzecVar.zzk(4);
                                    zzecVar.zzi();
                                    zzecVar.zzj(8);
                                    if (zzecVar.zzl()) {
                                        zzecVar.zzj(4);
                                        zzecVar.zzj(3);
                                    }
                                    iZzc = zzecVar.zzc(4);
                                    if (iZzc == 15) {
                                        iZzc3 = zzecVar.zzc(8);
                                        iZzc4 = zzecVar.zzc(8);
                                        if (iZzc4 == 0) {
                                            Log.w("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                        } else {
                                            f = iZzc3 / iZzc4;
                                        }
                                    } else if (iZzc < 7) {
                                        f = l[iZzc];
                                    } else {
                                        Log.w("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    }
                                    if (zzecVar.zzl()) {
                                        zzecVar.zzj(2);
                                        zzecVar.zzj(1);
                                        if (zzecVar.zzl()) {
                                            zzecVar.zzj(15);
                                            zzecVar.zzi();
                                            zzecVar.zzj(15);
                                            zzecVar.zzi();
                                            zzecVar.zzj(15);
                                            zzecVar.zzi();
                                            zzecVar.zzj(3);
                                            zzecVar.zzj(11);
                                            zzecVar.zzi();
                                            zzecVar.zzj(15);
                                            zzecVar.zzi();
                                        }
                                    }
                                    if (zzecVar.zzc(2) != 0) {
                                        Log.w("H263Reader", "Unhandled video object layer shape");
                                    }
                                    zzecVar.zzi();
                                    iZzc2 = zzecVar.zzc(16);
                                    zzecVar.zzi();
                                    if (zzecVar.zzl()) {
                                        if (iZzc2 == 0) {
                                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                                        } else {
                                            i4 = 0;
                                            for (i3 = iZzc2 - 1; i3 > 0; i3 >>= 1) {
                                                i4++;
                                            }
                                            zzecVar.zzj(i4);
                                        }
                                    }
                                    zzecVar.zzi();
                                    int iZzc6 = zzecVar.zzc(13);
                                    zzecVar.zzi();
                                    int iZzc7 = zzecVar.zzc(13);
                                    zzecVar.zzi();
                                    zzecVar.zzi();
                                    zzad zzadVar = new zzad();
                                    zzadVar.zzH(str);
                                    zzadVar.zzS("video/mp4v-es");
                                    zzadVar.zzX(iZzc6);
                                    zzadVar.zzF(iZzc7);
                                    zzadVar.zzP(f);
                                    zzadVar.zzI(Collections.singletonList(bArrCopyOf));
                                    zzaamVar.zzk(zzadVar.zzY());
                                    this.j = true;
                                }
                            } else if ((i6 & 240) != 32) {
                                Log.w("H263Reader", "Unexpected start code value");
                                kw5Var.a = false;
                                kw5Var.c = 0;
                                kw5Var.b = 0;
                            } else {
                                kw5Var.d = kw5Var.c;
                                kw5Var.b = 4;
                            }
                        } else if (i6 > 31) {
                            Log.w("H263Reader", "Unexpected start code value");
                            kw5Var.a = false;
                            kw5Var.c = 0;
                            kw5Var.b = 0;
                        } else {
                            kw5Var.b = 3;
                        }
                    } else if (i6 != 181) {
                        Log.w("H263Reader", "Unexpected start code value");
                        kw5Var.a = false;
                        kw5Var.c = 0;
                        kw5Var.b = 0;
                    } else {
                        kw5Var.b = 2;
                    }
                } else if (i6 == 176) {
                    kw5Var.b = 1;
                    kw5Var.a = true;
                }
                kw5Var.a(kw5.f, 0, 3);
                z3 = false;
                if (z3) {
                    zzaam zzaamVar2 = this.i;
                    int i11 = kw5Var.d;
                    String str2 = this.h;
                    str2.getClass();
                    byte[] bArrCopyOf2 = Arrays.copyOf(kw5Var.e, kw5Var.c);
                    zzecVar = new zzec(bArrCopyOf2, bArrCopyOf2.length);
                    zzecVar.zzk(i11);
                    zzecVar.zzk(4);
                    zzecVar.zzi();
                    zzecVar.zzj(8);
                    if (zzecVar.zzl()) {
                        zzecVar.zzj(4);
                        zzecVar.zzj(3);
                    }
                    iZzc = zzecVar.zzc(4);
                    if (iZzc == 15) {
                        iZzc3 = zzecVar.zzc(8);
                        iZzc4 = zzecVar.zzc(8);
                        if (iZzc4 == 0) {
                            Log.w("H263Reader", "Invalid aspect ratio");
                            f = 1.0f;
                        } else {
                            f = iZzc3 / iZzc4;
                        }
                    } else if (iZzc < 7) {
                        f = l[iZzc];
                    } else {
                        Log.w("H263Reader", "Invalid aspect ratio");
                        f = 1.0f;
                    }
                    if (zzecVar.zzl()) {
                        zzecVar.zzj(2);
                        zzecVar.zzj(1);
                        if (zzecVar.zzl()) {
                            zzecVar.zzj(15);
                            zzecVar.zzi();
                            zzecVar.zzj(15);
                            zzecVar.zzi();
                            zzecVar.zzj(15);
                            zzecVar.zzi();
                            zzecVar.zzj(3);
                            zzecVar.zzj(11);
                            zzecVar.zzi();
                            zzecVar.zzj(15);
                            zzecVar.zzi();
                        }
                    }
                    if (zzecVar.zzc(2) != 0) {
                        Log.w("H263Reader", "Unhandled video object layer shape");
                    }
                    zzecVar.zzi();
                    iZzc2 = zzecVar.zzc(16);
                    zzecVar.zzi();
                    if (zzecVar.zzl()) {
                        if (iZzc2 == 0) {
                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            i4 = 0;
                            while (i3 > 0) {
                                i4++;
                            }
                            zzecVar.zzj(i4);
                        }
                    }
                    zzecVar.zzi();
                    int iZzc8 = zzecVar.zzc(13);
                    zzecVar.zzi();
                    int iZzc9 = zzecVar.zzc(13);
                    zzecVar.zzi();
                    zzecVar.zzi();
                    zzad zzadVar2 = new zzad();
                    zzadVar2.zzH(str2);
                    zzadVar2.zzS("video/mp4v-es");
                    zzadVar2.zzX(iZzc8);
                    zzadVar2.zzF(iZzc9);
                    zzadVar2.zzP(f);
                    zzadVar2.zzI(Collections.singletonList(bArrCopyOf2));
                    zzaamVar2.zzk(zzadVar2.zzY());
                    this.j = true;
                }
            }
            this.f.a(bArrZzH, iZzc5, iZza);
            if (i7 > 0) {
                pw5Var.a(bArrZzH, iZzc5, iZza);
                i = 0;
            } else {
                i = -i7;
            }
            if (pw5Var.d(i)) {
                int iZzb = zzaac.zzb(pw5Var.d, pw5Var.e);
                int i12 = zzel.zza;
                byte[] bArr = pw5Var.d;
                zzed zzedVar2 = this.b;
                zzedVar2.zzD(bArr, iZzb);
                this.a.a(this.k, zzedVar2);
            }
            if (i6 == 178) {
                if (zzedVar.zzH()[iZza + 2] == 1) {
                    pw5Var.c(178);
                }
                i6 = 178;
            }
            int i13 = iZzd - iZza;
            long j = this.g;
            lw5 lw5Var = this.f;
            long j2 = j - ((long) i13);
            boolean z4 = this.j;
            if (lw5Var.e == 182 && z4 && lw5Var.b) {
                long j3 = lw5Var.h;
                if (j3 != -9223372036854775807L) {
                    lw5Var.a.zzs(j3, lw5Var.d ? 1 : 0, (int) (j2 - lw5Var.g), i13, null);
                }
            }
            if (lw5Var.e != 179) {
                lw5Var.g = j2;
            }
            lw5 lw5Var2 = this.f;
            long j4 = this.k;
            lw5Var2.e = i6;
            lw5Var2.d = false;
            if (i6 != 182) {
                if (i6 == 179) {
                    i2 = 179;
                } else {
                    z = false;
                }
                lw5Var2.b = z;
                if (i6 == 182) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                lw5Var2.c = z2;
                lw5Var2.f = 0;
                lw5Var2.h = j4;
                iZzc5 = i5;
            } else {
                i2 = i6;
            }
            i6 = i2;
            z = true;
            lw5Var2.b = z;
            if (i6 == 182) {
                z2 = true;
            } else {
                z2 = false;
            }
            lw5Var2.c = z2;
            lw5Var2.f = 0;
            lw5Var2.h = j4;
            iZzc5 = i5;
        }
        if (!this.j) {
            kw5Var.a(bArrZzH, iZzc5, iZzd);
        }
        this.f.a(bArrZzH, iZzc5, iZzd);
        pw5Var.a(bArrZzH, iZzc5, iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        zzailVar.zzc();
        this.h = zzailVar.zzb();
        zzaam zzaamVarZzv = zzziVar.zzv(zzailVar.zza(), 2);
        this.i = zzaamVarZzv;
        this.f = new lw5(zzaamVarZzv);
        this.a.b(zzziVar, zzailVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zze() {
        zzaac.zze(this.c);
        kw5 kw5Var = this.d;
        kw5Var.a = false;
        kw5Var.c = 0;
        kw5Var.b = 0;
        lw5 lw5Var = this.f;
        if (lw5Var != null) {
            lw5Var.b = false;
            lw5Var.c = false;
            lw5Var.d = false;
            lw5Var.e = -1;
        }
        this.e.b();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    public zzahe(ax5 ax5Var) {
        this.a = ax5Var;
        this.c = new boolean[4];
        this.d = new kw5();
        this.k = -9223372036854775807L;
        this.e = new pw5(178);
        this.b = new zzed();
    }
}
