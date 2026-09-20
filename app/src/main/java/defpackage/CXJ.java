package defpackage;

import android.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: C€XJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class CXJ {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final am5 e = new am5(0.31006f, 0.31616f);
    public static final am5 f = new am5(0.34567f, 0.3585f);
    public static final am5 g = new am5(0.32168f, 0.33767f);
    public static final am5 h = new am5(0.31271f, 0.32902f);
    public static final float[] i = {0.964212f, 1.0f, 0.825188f};
    public static ej1 j;
    public static ej1 k;

    /* JADX WARN: Code duplicated, block: B:161:0x0253  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:183:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:187:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:386:0x06b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:387:0x06b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:391:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:392:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:395:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:396:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:399:0x06da  */
    /* JADX WARN: Code duplicated, block: B:401:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:404:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:406:0x06ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:415:0x070d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    public static void a(f70 f70Var, o32 o32Var, int i2) {
        int i3;
        yn[] ynVarArr;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        w60[] w60VarArr;
        e70 e70Var;
        int i6;
        w60[] w60VarArr2;
        int i7;
        w60 w60Var;
        w60 w60Var2;
        kq4 kq4Var;
        w60 w60Var3;
        kq4 kq4Var2;
        e70 e70Var2;
        int i8;
        int i9;
        e70 e70Var3;
        kq4 kq4Var3;
        kq4 kq4Var4;
        w60 w60Var4;
        w60 w60Var5;
        kq4 kq4Var5;
        kq4 kq4Var6;
        int size;
        w60 w60Var6;
        e70 e70Var4;
        int i10;
        e70 e70Var5;
        int i11;
        f70 f70Var2 = f70Var;
        int i12 = 2;
        if (i2 == 0) {
            i3 = f70Var2.m0;
            ynVarArr = f70Var2.p0;
            i4 = 0;
        } else {
            i3 = f70Var2.n0;
            ynVarArr = f70Var2.o0;
            i4 = 2;
        }
        int i13 = 0;
        while (i13 < i3) {
            yn ynVar = ynVarArr[i13];
            boolean z7 = ynVar.q;
            int i14 = 3;
            int i15 = 8;
            int i16 = 1;
            e70 e70Var6 = ynVar.a;
            if (z7) {
                i5 = i13;
            } else {
                int i17 = ynVar.l;
                int i18 = i17 * 2;
                e70 e70Var7 = e70Var6;
                e70 e70Var8 = e70Var7;
                boolean z8 = false;
                while (!z8) {
                    ynVar.i += i16;
                    e70Var7.d0[i17] = null;
                    e70Var7.c0[i17] = null;
                    int i19 = e70Var7.X;
                    w60[] w60VarArr3 = e70Var7.G;
                    if (i19 != i15) {
                        e70Var7.f(i17);
                        w60VarArr3[i18].b();
                        int i20 = i18 + 1;
                        w60VarArr3[i20].b();
                        w60VarArr3[i18].b();
                        w60VarArr3[i20].b();
                        if (ynVar.b == null) {
                            ynVar.b = e70Var7;
                        }
                        ynVar.d = e70Var7;
                        int i21 = e70Var7.J[i17];
                        if (i21 == i14 && ((i11 = e70Var7.l[i17]) == 0 || i11 == i14 || i11 == i12)) {
                            ynVar.j++;
                            float f2 = e70Var7.b0[i17];
                            if (f2 > 0.0f) {
                                ynVar.k += f2;
                            }
                            if (e70Var7.X != 8 && i21 == 3 && (i11 == 0 || i11 == 3)) {
                                if (f2 < 0.0f) {
                                    ynVar.n = true;
                                } else {
                                    ynVar.o = true;
                                }
                                if (ynVar.h == null) {
                                    ynVar.h = new ArrayList<>();
                                }
                                ynVar.h.add(e70Var7);
                            }
                            if (ynVar.f == null) {
                                ynVar.f = e70Var7;
                            }
                            e70 e70Var9 = ynVar.g;
                            if (e70Var9 != null) {
                                e70Var9.c0[i17] = e70Var7;
                            }
                            ynVar.g = e70Var7;
                        }
                    }
                    e70 e70Var10 = e70Var8;
                    if (e70Var10 != e70Var7) {
                        e70Var10.d0[i17] = e70Var7;
                    }
                    w60 w60Var7 = w60VarArr3[i18 + 1].d;
                    if (w60Var7 != null) {
                        e70Var5 = w60Var7.b;
                        w60 w60Var8 = e70Var5.G[i18].d;
                        if (w60Var8 == null || w60Var8.b != e70Var7) {
                            e70Var5 = null;
                        }
                    } else {
                        e70Var5 = null;
                    }
                    if (e70Var5 == null) {
                        e70Var5 = e70Var7;
                        z8 = true;
                    }
                    e70Var8 = e70Var7;
                    i13 = i13;
                    i16 = 1;
                    i15 = 8;
                    i12 = 2;
                    e70Var7 = e70Var5;
                    i14 = 3;
                }
                i5 = i13;
                e70 e70Var11 = ynVar.b;
                if (e70Var11 != null) {
                    e70Var11.G[i18].b();
                }
                e70 e70Var12 = ynVar.d;
                if (e70Var12 != null) {
                    e70Var12.G[i18 + 1].b();
                }
                ynVar.c = e70Var7;
                if (i17 == 0 && ynVar.m) {
                    ynVar.e = e70Var7;
                } else {
                    ynVar.e = e70Var6;
                }
                ynVar.p = ynVar.o && ynVar.n;
            }
            ynVar.q = true;
            e70 e70Var13 = ynVar.c;
            e70 e70Var14 = ynVar.b;
            e70 e70Var15 = ynVar.d;
            e70 e70Var16 = ynVar.e;
            float f3 = ynVar.k;
            boolean z9 = f70Var2.J[i2] == 2;
            if (i2 == 0) {
                int i22 = e70Var16.Z;
                boolean z10 = i22 == 0;
                z2 = i22 == 1;
                if (i22 == 2) {
                    z3 = z10;
                    z4 = z2;
                    z5 = z3;
                    z6 = true;
                } else {
                    z = z10;
                    z4 = z2;
                    z5 = z;
                    z6 = false;
                }
            } else {
                int i23 = e70Var16.a0;
                boolean z11 = i23 == 0;
                boolean z12 = i23 == 1;
                if (i23 == 2) {
                    z3 = z11;
                    z2 = z12;
                    z4 = z2;
                    z5 = z3;
                    z6 = true;
                } else {
                    z = z11;
                    z2 = z12;
                    z4 = z2;
                    z5 = z;
                    z6 = false;
                }
            }
            e70 e70Var17 = e70Var6;
            boolean z13 = false;
            while (true) {
                w60VarArr = f70Var2.G;
                if (z13) {
                    break;
                }
                boolean z14 = z13;
                w60 w60Var9 = e70Var17.G[i4];
                int i24 = z6 ? 1 : 4;
                int iB = w60Var9.b();
                int i25 = i3;
                int[] iArr = e70Var17.J;
                yn[] ynVarArr2 = ynVarArr;
                e70 e70Var18 = e70Var16;
                boolean z15 = iArr[i2] == 3 && e70Var17.l[i2] == 0;
                w60 w60Var10 = w60Var9.d;
                if (w60Var10 != null && e70Var17 != e70Var6) {
                    iB = w60Var10.b() + iB;
                }
                int i26 = iB;
                if (z6 && e70Var17 != e70Var6 && e70Var17 != e70Var14) {
                    i24 = 5;
                }
                w60 w60Var11 = w60Var9.d;
                if (w60Var11 != null) {
                    if (e70Var17 == e70Var14) {
                        o32Var.f(w60Var9.g, w60Var11.g, i26, 6);
                    } else {
                        o32Var.f(w60Var9.g, w60Var11.g, i26, 8);
                    }
                    o32Var.e(w60Var9.g, w60Var9.d.g, i26, (!z15 || z6) ? i24 : 5);
                } else {
                    ynVar = ynVar;
                    e70Var14 = e70Var14;
                }
                w60[] w60VarArr4 = e70Var17.G;
                if (z9) {
                    if (e70Var17.X == 8 || iArr[i2] != 3) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        o32Var.f(w60VarArr4[i4 + 1].g, w60VarArr4[i4].g, 0, 5);
                    }
                    o32Var.f(w60VarArr4[i4].g, w60VarArr[i4].g, i10, 8);
                }
                w60 w60Var12 = w60VarArr4[i4 + 1].d;
                if (w60Var12 != null) {
                    e70Var4 = w60Var12.b;
                    w60 w60Var13 = e70Var4.G[i4].d;
                    if (w60Var13 == null || w60Var13.b != e70Var17) {
                        e70Var4 = null;
                    }
                } else {
                    e70Var4 = null;
                }
                if (e70Var4 != null) {
                    e70Var17 = e70Var4;
                    z13 = z14;
                } else {
                    z13 = true;
                }
                e70Var6 = e70Var6;
                i3 = i25;
                ynVarArr = ynVarArr2;
                e70Var16 = e70Var18;
                e70Var14 = e70Var14;
                ynVar = ynVar;
            }
            yn ynVar2 = ynVar;
            e70 e70Var19 = e70Var16;
            e70 e70Var20 = e70Var6;
            e70 e70Var21 = e70Var14;
            int i27 = i3;
            yn[] ynVarArr3 = ynVarArr;
            if (e70Var15 != null) {
                int i28 = i4 + 1;
                if (e70Var13.G[i28].d != null) {
                    w60 w60Var14 = e70Var15.G[i28];
                    if ((e70Var15.J[i2] == 3 && e70Var15.l[i2] == 0) && !z6) {
                        w60 w60Var15 = w60Var14.d;
                        if (w60Var15.b == f70Var2) {
                            o32Var.e(w60Var14.g, w60Var15.g, -w60Var14.b(), 5);
                        } else if (z6) {
                            w60Var6 = w60Var14.d;
                            if (w60Var6.b == f70Var2) {
                                o32Var.e(w60Var14.g, w60Var6.g, -w60Var14.b(), 4);
                            }
                        }
                    } else if (z6) {
                        w60Var6 = w60Var14.d;
                        if (w60Var6.b == f70Var2) {
                            o32Var.e(w60Var14.g, w60Var6.g, -w60Var14.b(), 4);
                        }
                    }
                    o32Var.g(w60Var14.g, e70Var13.G[i28].d.g, -w60Var14.b(), 6);
                }
            }
            if (z9) {
                int i29 = i4 + 1;
                kq4 kq4Var7 = w60VarArr[i29].g;
                w60 w60Var16 = e70Var13.G[i29];
                o32Var.f(kq4Var7, w60Var16.g, w60Var16.b(), 8);
            }
            yn ynVar3 = ynVar2;
            ArrayList<e70> arrayList = ynVar3.h;
            if (arrayList != null && (size = arrayList.size()) > 1) {
                float f4 = (!ynVar3.n || ynVar3.p) ? f3 : ynVar3.j;
                e70 e70Var22 = null;
                int i30 = 0;
                float f5 = 0.0f;
                while (i30 < size) {
                    e70 e70Var23 = arrayList.get(i30);
                    float f6 = e70Var23.b0[i2];
                    w60[] w60VarArr5 = e70Var23.G;
                    if (f6 < 0.0f) {
                        if (ynVar3.p) {
                            o32Var.e(w60VarArr5[i4 + 1].g, w60VarArr5[i4].g, 0, 4);
                        } else {
                            f6 = 1.0f;
                        }
                        ynVar3 = ynVar3;
                        arrayList = arrayList;
                        size = size;
                        i30++;
                        ynVar3 = ynVar3;
                        size = size;
                        arrayList = arrayList;
                    }
                    if (f6 == 0.0f) {
                        o32Var.e(w60VarArr5[i4 + 1].g, w60VarArr5[i4].g, 0, 8);
                        ynVar3 = ynVar3;
                        arrayList = arrayList;
                        size = size;
                    } else {
                        if (e70Var22 != null) {
                            w60[] w60VarArr6 = e70Var22.G;
                            kq4 kq4Var8 = w60VarArr6[i4].g;
                            int i31 = i4 + 1;
                            kq4 kq4Var9 = w60VarArr6[i31].g;
                            kq4 kq4Var10 = w60VarArr5[i4].g;
                            kq4 kq4Var11 = w60VarArr5[i31].g;
                            Cpj cpjK = o32Var.k();
                            cpjK.b = 0.0f;
                            if (f4 == 0.0f || f5 == f6) {
                                cpjK.d.k(kq4Var8, 1.0f);
                                cpjK.d.k(kq4Var9, -1.0f);
                                cpjK.d.k(kq4Var11, 1.0f);
                                cpjK.d.k(kq4Var10, -1.0f);
                            } else if (f5 == 0.0f) {
                                cpjK.d.k(kq4Var8, 1.0f);
                                cpjK.d.k(kq4Var9, -1.0f);
                            } else if (f6 == 0.0f) {
                                cpjK.d.k(kq4Var10, 1.0f);
                                cpjK.d.k(kq4Var11, -1.0f);
                            } else {
                                float f7 = (f5 / f4) / (f6 / f4);
                                cpjK.d.k(kq4Var8, 1.0f);
                                cpjK.d.k(kq4Var9, -1.0f);
                                cpjK.d.k(kq4Var11, f7);
                                cpjK.d.k(kq4Var10, -f7);
                            }
                            o32Var.c(cpjK);
                        }
                        f5 = f6;
                        e70Var22 = e70Var23;
                    }
                    i30++;
                    ynVar3 = ynVar3;
                    size = size;
                    arrayList = arrayList;
                }
            }
            yn ynVar4 = ynVar3;
            if (e70Var21 != null) {
                e70Var = e70Var21;
                if (e70Var == e70Var15 || z6) {
                    w60 w60Var17 = e70Var20.G[i4];
                    int i32 = i4 + 1;
                    w60 w60Var18 = e70Var13.G[i32];
                    w60 w60Var19 = w60Var17.d;
                    kq4 kq4Var12 = w60Var19 != null ? w60Var19.g : null;
                    w60 w60Var20 = w60Var18.d;
                    kq4 kq4Var13 = w60Var20 != null ? w60Var20.g : null;
                    w60 w60Var21 = e70Var.G[i4];
                    w60 w60Var22 = e70Var15.G[i32];
                    if (kq4Var12 == null || kq4Var13 == null) {
                        e70Var15 = e70Var15;
                        i5 = i5;
                    } else {
                        e70Var15 = e70Var15;
                        i5 = i5;
                        o32Var.b(w60Var21.g, kq4Var12, w60Var21.b(), i2 == 0 ? e70Var19.U : e70Var19.V, kq4Var13, w60Var22.g, w60Var22.b(), 7);
                    }
                }
                e70Var13 = e70Var13;
                i6 = i5;
                if ((z5 || z4) && e70Var != null && e70Var != e70Var15) {
                    w60VarArr2 = e70Var.G;
                    w60 w60Var23 = w60VarArr2[i4];
                    i7 = i4 + 1;
                    w60Var = e70Var15.G[i7];
                    w60Var2 = w60Var23.d;
                    if (w60Var2 != null) {
                        kq4Var = w60Var2.g;
                    } else {
                        kq4Var = null;
                    }
                    w60Var3 = w60Var.d;
                    if (w60Var3 != null) {
                        kq4Var2 = w60Var3.g;
                    } else {
                        kq4Var2 = null;
                    }
                    e70Var2 = e70Var13;
                    if (e70Var2 != e70Var15) {
                        w60 w60Var24 = e70Var2.G[i7].d;
                        kq4Var2 = w60Var24 != null ? w60Var24.g : null;
                    }
                    if (e70Var == e70Var15) {
                        w60Var = w60VarArr2[i7];
                    }
                    if (kq4Var == null && kq4Var2 != null) {
                        o32Var.b(w60Var23.g, kq4Var, w60Var23.b(), 0.5f, kq4Var2, w60Var.g, e70Var15.G[i7].b(), 5);
                    }
                }
                i13 = i6 + 1;
                i12 = 2;
                f70Var2 = f70Var;
                i3 = i27;
                ynVarArr = ynVarArr3;
            } else {
                e70Var = e70Var21;
            }
            if (!z5 || e70Var == null) {
                int i33 = 8;
                if (z4 && e70Var != null) {
                    int i34 = ynVar4.j;
                    boolean z16 = i34 > 0 && ynVar4.i == i34;
                    e70 e70Var24 = e70Var;
                    e70 e70Var25 = e70Var24;
                    while (e70Var25 != null) {
                        e70 e70Var26 = e70Var25.d0[i2];
                        while (e70Var26 != null && e70Var26.X == i33) {
                            e70Var26 = e70Var26.d0[i2];
                        }
                        if (e70Var25 == e70Var || e70Var25 == e70Var15 || e70Var26 == null) {
                            e70Var24 = e70Var24;
                            i5 = i5;
                            i9 = 8;
                        } else {
                            e70 e70Var27 = e70Var26 == e70Var15 ? null : e70Var26;
                            w60[] w60VarArr7 = e70Var25.G;
                            w60 w60Var25 = w60VarArr7[i4];
                            kq4 kq4Var14 = w60Var25.g;
                            int i35 = i4 + 1;
                            kq4 kq4Var15 = e70Var24.G[i35].g;
                            int iB2 = w60Var25.b();
                            int iB3 = w60VarArr7[i35].b();
                            if (e70Var27 != null) {
                                w60Var4 = e70Var27.G[i4];
                                kq4Var3 = w60Var4.g;
                                e70Var3 = e70Var27;
                                w60 w60Var26 = w60Var4.d;
                                kq4Var4 = w60Var26 != null ? w60Var26.g : null;
                            } else {
                                e70Var3 = e70Var27;
                                w60 w60Var27 = e70Var15.G[i4];
                                kq4Var3 = w60Var27 != null ? w60Var27.g : null;
                                kq4Var4 = w60VarArr7[i35].g;
                                w60Var4 = w60Var27;
                            }
                            int iB4 = w60Var4 != null ? w60Var4.b() + iB3 : iB3;
                            int iB5 = e70Var24.G[i35].b() + iB2;
                            int i36 = z16 ? 8 : 4;
                            if (kq4Var14 == null || kq4Var15 == null || kq4Var3 == null || kq4Var4 == null) {
                                i9 = 8;
                            } else {
                                i9 = 8;
                                o32Var.b(kq4Var14, kq4Var15, iB5, 0.5f, kq4Var3, kq4Var4, iB4, i36);
                            }
                            e70Var26 = e70Var3;
                        }
                        e70Var24 = e70Var25.X != i9 ? e70Var25 : e70Var24;
                        e70Var25 = e70Var26;
                        i5 = i5;
                        i33 = 8;
                    }
                    i6 = i5;
                    w60 w60Var28 = e70Var.G[i4];
                    w60 w60Var29 = e70Var20.G[i4].d;
                    int i37 = i4 + 1;
                    w60 w60Var30 = e70Var15.G[i37];
                    w60 w60Var31 = e70Var13.G[i37].d;
                    if (w60Var29 == null) {
                        i8 = 5;
                    } else {
                        if (e70Var != e70Var15) {
                            o32Var.e(w60Var28.g, w60Var29.g, w60Var28.b(), 5);
                        } else if (w60Var31 != null) {
                            i8 = 5;
                            o32Var.b(w60Var28.g, w60Var29.g, w60Var28.b(), 0.5f, w60Var30.g, w60Var31.g, w60Var30.b(), 5);
                        }
                        i8 = 5;
                    }
                    if (w60Var31 != null && e70Var != e70Var15) {
                        o32Var.e(w60Var30.g, w60Var31.g, -w60Var30.b(), i8);
                    }
                }
                if (z5) {
                    w60VarArr2 = e70Var.G;
                    w60 w60Var210 = w60VarArr2[i4];
                    i7 = i4 + 1;
                    w60Var = e70Var15.G[i7];
                    w60Var2 = w60Var210.d;
                    if (w60Var2 != null) {
                        kq4Var = w60Var2.g;
                    } else {
                        kq4Var = null;
                    }
                    w60Var3 = w60Var.d;
                    if (w60Var3 != null) {
                        kq4Var2 = w60Var3.g;
                    } else {
                        kq4Var2 = null;
                    }
                    e70Var2 = e70Var13;
                    if (e70Var2 != e70Var15) {
                        w60 w60Var211 = e70Var2.G[i7].d;
                        kq4Var2 = w60Var211 != null ? w60Var211.g : null;
                    }
                    if (e70Var == e70Var15) {
                        w60Var = w60VarArr2[i7];
                    }
                    if (kq4Var == null) {
                    }
                } else {
                    w60VarArr2 = e70Var.G;
                    w60 w60Var212 = w60VarArr2[i4];
                    i7 = i4 + 1;
                    w60Var = e70Var15.G[i7];
                    w60Var2 = w60Var212.d;
                    if (w60Var2 != null) {
                        kq4Var = w60Var2.g;
                    } else {
                        kq4Var = null;
                    }
                    w60Var3 = w60Var.d;
                    if (w60Var3 != null) {
                        kq4Var2 = w60Var3.g;
                    } else {
                        kq4Var2 = null;
                    }
                    e70Var2 = e70Var13;
                    if (e70Var2 != e70Var15) {
                        w60 w60Var213 = e70Var2.G[i7].d;
                        kq4Var2 = w60Var213 != null ? w60Var213.g : null;
                    }
                    if (e70Var == e70Var15) {
                        w60Var = w60VarArr2[i7];
                    }
                    if (kq4Var == null) {
                    }
                }
                i13 = i6 + 1;
                i12 = 2;
                f70Var2 = f70Var;
                i3 = i27;
                ynVarArr = ynVarArr3;
            } else {
                int i38 = ynVar4.j;
                boolean z17 = i38 > 0 && ynVar4.i == i38;
                e70 e70Var28 = e70Var;
                e70 e70Var29 = e70Var28;
                while (e70Var29 != null) {
                    e70 e70Var30 = e70Var29.d0[i2];
                    while (e70Var30 != null && e70Var30.X == 8) {
                        e70Var30 = e70Var30.d0[i2];
                    }
                    if (e70Var30 != null || e70Var29 == e70Var15) {
                        w60[] w60VarArr8 = e70Var29.G;
                        w60 w60Var32 = w60VarArr8[i4];
                        kq4 kq4Var16 = w60Var32.g;
                        w60 w60Var33 = w60Var32.d;
                        kq4 kq4Var17 = w60Var33 != null ? w60Var33.g : null;
                        if (e70Var28 != e70Var29) {
                            kq4Var17 = e70Var28.G[i4 + 1].g;
                        } else if (e70Var29 == e70Var && e70Var28 == e70Var29) {
                            w60 w60Var34 = e70Var20.G[i4].d;
                            kq4Var17 = w60Var34 != null ? w60Var34.g : null;
                        }
                        int iB6 = w60Var32.b();
                        int i39 = i4 + 1;
                        int iB7 = w60VarArr8[i39].b();
                        if (e70Var30 != null) {
                            w60Var5 = e70Var30.G[i4];
                            kq4Var5 = w60Var5.g;
                            kq4Var6 = w60VarArr8[i39].g;
                        } else {
                            w60Var5 = e70Var13.G[i39].d;
                            kq4Var5 = w60Var5 != null ? w60Var5.g : null;
                            kq4Var6 = w60VarArr8[i39].g;
                        }
                        kq4 kq4Var18 = kq4Var6;
                        if (w60Var5 != null) {
                            iB7 = w60Var5.b() + iB7;
                        }
                        if (e70Var28 != null) {
                            iB6 += e70Var28.G[i39].b();
                        }
                        if (kq4Var16 != null && kq4Var17 != null && kq4Var5 != null && kq4Var18 != null) {
                            int iB8 = e70Var29 == e70Var ? e70Var.G[i4].b() : iB6;
                            if (e70Var29 == e70Var15) {
                                iB7 = e70Var15.G[i39].b();
                            }
                            o32Var.b(kq4Var16, kq4Var17, iB8, 0.5f, kq4Var5, kq4Var18, iB7, z17 ? 8 : 5);
                        }
                    }
                    if (e70Var29.X == 8) {
                        e70Var29 = e70Var28;
                    }
                    e70Var28 = e70Var29;
                    e70Var29 = e70Var30;
                    e70Var20 = e70Var20;
                }
            }
            e70Var13 = e70Var13;
            i6 = i5;
            if (z5) {
                w60VarArr2 = e70Var.G;
                w60 w60Var214 = w60VarArr2[i4];
                i7 = i4 + 1;
                w60Var = e70Var15.G[i7];
                w60Var2 = w60Var214.d;
                if (w60Var2 != null) {
                    kq4Var = w60Var2.g;
                } else {
                    kq4Var = null;
                }
                w60Var3 = w60Var.d;
                if (w60Var3 != null) {
                    kq4Var2 = w60Var3.g;
                } else {
                    kq4Var2 = null;
                }
                e70Var2 = e70Var13;
                if (e70Var2 != e70Var15) {
                    w60 w60Var215 = e70Var2.G[i7].d;
                    kq4Var2 = w60Var215 != null ? w60Var215.g : null;
                }
                if (e70Var == e70Var15) {
                    w60Var = w60VarArr2[i7];
                }
                if (kq4Var == null) {
                }
            } else {
                w60VarArr2 = e70Var.G;
                w60 w60Var216 = w60VarArr2[i4];
                i7 = i4 + 1;
                w60Var = e70Var15.G[i7];
                w60Var2 = w60Var216.d;
                if (w60Var2 != null) {
                    kq4Var = w60Var2.g;
                } else {
                    kq4Var = null;
                }
                w60Var3 = w60Var.d;
                if (w60Var3 != null) {
                    kq4Var2 = w60Var3.g;
                } else {
                    kq4Var2 = null;
                }
                e70Var2 = e70Var13;
                if (e70Var2 != e70Var15) {
                    w60 w60Var217 = e70Var2.G[i7].d;
                    kq4Var2 = w60Var217 != null ? w60Var217.g : null;
                }
                if (e70Var == e70Var15) {
                    w60Var = w60VarArr2[i7];
                }
                if (kq4Var == null) {
                }
            }
            i13 = i6 + 1;
            i12 = 2;
            f70Var2 = f70Var;
            i3 = i27;
            ynVarArr = ynVarArr3;
        }
    }
}
