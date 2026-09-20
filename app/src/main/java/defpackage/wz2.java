package defpackage;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class wz2 {
    public static boolean a(QnHx[] qnHxArr, QnHx[] qnHxArr2) {
        if (qnHxArr == null || qnHxArr2 == null || qnHxArr.length != qnHxArr2.length) {
            return false;
        }
        for (int i = 0; i < qnHxArr.length; i++) {
            QnHx qnHx = qnHxArr[i];
            char c = qnHx.a;
            QnHx qnHx2 = qnHxArr2[i];
            if (c != qnHx2.a || qnHx.b.length != qnHx2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i - 0;
        int iMin = Math.min(i2, length - 0);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098 A[Catch: NumberFormatException -> 0x00b9, LOOP:3: B:29:0x006d->B:49:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r13 == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static wz2.QnHx[] c(java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz2.c(java.lang.String):wz2$QnHx[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        QnHx[] qnHxArrC = c(str);
        if (qnHxArrC == null) {
            return null;
        }
        try {
            QnHx.b(qnHxArrC, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(b70.a("Error in parsing ", str), e);
        }
    }

    public static QnHx[] e(QnHx[] qnHxArr) {
        if (qnHxArr == null) {
            return null;
        }
        QnHx[] qnHxArr2 = new QnHx[qnHxArr.length];
        for (int i = 0; i < qnHxArr.length; i++) {
            qnHxArr2[i] = new QnHx(qnHxArr[i]);
        }
        return qnHxArr2;
    }

    public static class QnHx {
        public char a;
        public final float[] b;

        public QnHx(char c, float[] fArr) {
            this.a = c;
            this.b = fArr;
        }

        public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = f2;
            double d5 = (d4 * dSin) + (d3 * dCos);
            double d6 = d3;
            double d7 = f5;
            double d8 = d5 / d7;
            double d9 = f6;
            double d10 = ((d4 * dCos) + (((double) (-f)) * dSin)) / d9;
            double d11 = d4;
            double d12 = f4;
            double d13 = ((d12 * dSin) + (((double) f3) * dCos)) / d7;
            double d14 = ((d12 * dCos) + (((double) (-f3)) * dSin)) / d9;
            double d15 = d8 - d13;
            double d16 = d10 - d14;
            double d17 = (d8 + d13) / 2.0d;
            double d18 = (d10 + d14) / 2.0d;
            double d19 = (d16 * d16) + (d15 * d15);
            if (d19 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d20 = (1.0d / d19) - 0.25d;
            if (d20 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d19);
                float fSqrt = (float) (Math.sqrt(d19) / 1.99999d);
                a(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d20);
            double d21 = d15 * dSqrt;
            double d22 = dSqrt * d16;
            if (z == z2) {
                d = d17 - d22;
                d2 = d18 + d21;
            } else {
                d = d17 + d22;
                d2 = d18 - d21;
            }
            double dAtan2 = Math.atan2(d10 - d2, d8 - d);
            double dAtan3 = Math.atan2(d14 - d2, d13 - d) - dAtan2;
            int i = 0;
            if (z2 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d23 = d * d7;
            double d24 = d2 * d9;
            double d25 = (d23 * dCos) - (d24 * dSin);
            double d26 = (d24 * dCos) + (d23 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d27 = -d7;
            double d28 = d27 * dCos2;
            double d29 = d9 * dSin2;
            double d30 = (d28 * dSin3) - (d29 * dCos3);
            double d31 = d27 * dSin2;
            double d32 = d9 * dCos2;
            double d33 = (dCos3 * d32) + (dSin3 * d31);
            double d34 = dAtan3 / ((double) iCeil);
            double d35 = dAtan2;
            while (i < iCeil) {
                double d36 = d35 + d34;
                double dSin4 = Math.sin(d36);
                double dCos4 = Math.cos(d36);
                double d37 = d34;
                double d38 = (((d7 * dCos2) * dCos4) + d25) - (d29 * dSin4);
                double d39 = d25;
                double d40 = (d32 * dSin4) + (d7 * dSin2 * dCos4) + d26;
                double d41 = (d28 * dSin4) - (d29 * dCos4);
                double d42 = (dCos4 * d32) + (dSin4 * d31);
                double d43 = d36 - d35;
                double dTan = Math.tan(d43 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d43)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d30 * dSqrt2) + d6), (float) ((d33 * dSqrt2) + d11), (float) (d38 - (dSqrt2 * d41)), (float) (d40 - (dSqrt2 * d42)), (float) d38, (float) d40);
                i++;
                d32 = d32;
                d31 = d31;
                iCeil = iCeil;
                dCos2 = dCos2;
                d35 = d36;
                d7 = d7;
                d33 = d42;
                d30 = d41;
                d6 = d38;
                d11 = d40;
                d34 = d37;
                d25 = d39;
            }
        }

        public static void b(QnHx[] qnHxArr, Path path) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float[] fArr = new float[6];
            char c = 'm';
            char c2 = 0;
            char c3 = 'm';
            int i3 = 0;
            while (i3 < qnHxArr.length) {
                QnHx qnHx = qnHxArr[i3];
                char c4 = qnHx.a;
                float f21 = fArr[c2];
                float f22 = fArr[1];
                float f23 = fArr[2];
                float f24 = fArr[3];
                float f25 = fArr[4];
                float f26 = fArr[5];
                switch (c4) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f25, f26);
                        f21 = f25;
                        f23 = f21;
                        f22 = f26;
                        f24 = f22;
                    default:
                        i = 2;
                        break;
                }
                float f27 = f25;
                float f28 = f26;
                float f29 = f21;
                float f30 = f22;
                int i4 = 0;
                while (true) {
                    float[] fArr2 = qnHx.b;
                    if (i4 < fArr2.length) {
                        if (c4 != 'A') {
                            if (c4 != 'C') {
                                if (c4 == 'H') {
                                    i2 = i4;
                                    c4 = c4;
                                    qnHx = qnHx;
                                    i3 = i3;
                                    int i5 = i2 + 0;
                                    path.lineTo(fArr2[i5], f30);
                                    f29 = fArr2[i5];
                                } else if (c4 == 'Q') {
                                    i2 = i4;
                                    int i6 = i2 + 0;
                                    int i7 = i2 + 1;
                                    int i8 = i2 + 2;
                                    int i9 = i2 + 3;
                                    path.quadTo(fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                                    f = fArr2[i6];
                                    f2 = fArr2[i7];
                                    f29 = fArr2[i8];
                                    f30 = fArr2[i9];
                                } else if (c4 == 'V') {
                                    i2 = i4;
                                    c4 = c4;
                                    qnHx = qnHx;
                                    i3 = i3;
                                    int i10 = i2 + 0;
                                    path.lineTo(f29, fArr2[i10]);
                                    f30 = fArr2[i10];
                                } else if (c4 != 'a') {
                                    if (c4 != 'c') {
                                        if (c4 == 'h') {
                                            i2 = i4;
                                            int i11 = i2 + 0;
                                            path.rLineTo(fArr2[i11], 0.0f);
                                            f29 += fArr2[i11];
                                        } else if (c4 != 'q') {
                                            if (c4 != 'v') {
                                                if (c4 != 'L') {
                                                    if (c4 == 'M') {
                                                        i2 = i4;
                                                        f11 = fArr2[i2 + 0];
                                                        f12 = fArr2[i2 + 1];
                                                        if (i2 > 0) {
                                                            path.lineTo(f11, f12);
                                                        } else {
                                                            path.moveTo(f11, f12);
                                                            f27 = f11;
                                                            f28 = f12;
                                                        }
                                                    } else if (c4 == 'S') {
                                                        i2 = i4;
                                                        float f31 = f30;
                                                        float f32 = f29;
                                                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                            f13 = (f31 * 2.0f) - f24;
                                                            f14 = (f32 * 2.0f) - f23;
                                                        } else {
                                                            f14 = f32;
                                                            f13 = f31;
                                                        }
                                                        int i12 = i2 + 0;
                                                        int i13 = i2 + 1;
                                                        int i14 = i2 + 2;
                                                        int i15 = i2 + 3;
                                                        path.cubicTo(f14, f13, fArr2[i12], fArr2[i13], fArr2[i14], fArr2[i15]);
                                                        float f33 = fArr2[i12];
                                                        float f34 = fArr2[i13];
                                                        f9 = fArr2[i14];
                                                        f8 = fArr2[i15];
                                                        f23 = f33;
                                                        f24 = f34;
                                                        f29 = f9;
                                                        f30 = f8;
                                                    } else if (c4 == 'T') {
                                                        i2 = i4;
                                                        float f35 = f30;
                                                        float f36 = f29;
                                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                            f15 = (f36 * 2.0f) - f23;
                                                            f16 = (f35 * 2.0f) - f24;
                                                        } else {
                                                            f15 = f36;
                                                            f16 = f35;
                                                        }
                                                        int i16 = i2 + 0;
                                                        int i17 = i2 + 1;
                                                        path.quadTo(f15, f16, fArr2[i16], fArr2[i17]);
                                                        f24 = f16;
                                                        f23 = f15;
                                                        c4 = c4;
                                                        qnHx = qnHx;
                                                        i3 = i3;
                                                        f29 = fArr2[i16];
                                                        f30 = fArr2[i17];
                                                    } else if (c4 == 'l') {
                                                        i2 = i4;
                                                        int i18 = i2 + 0;
                                                        float f37 = fArr2[i18];
                                                        int i19 = i2 + 1;
                                                        path.rLineTo(f37, fArr2[i19]);
                                                        f29 += fArr2[i18];
                                                        f10 = fArr2[i19];
                                                    } else if (c4 == c) {
                                                        i2 = i4;
                                                        float f38 = fArr2[i2 + 0];
                                                        f29 += f38;
                                                        float f39 = fArr2[i2 + 1];
                                                        f30 += f39;
                                                        if (i2 > 0) {
                                                            path.rLineTo(f38, f39);
                                                        } else {
                                                            path.rMoveTo(f38, f39);
                                                            f28 = f30;
                                                            f27 = f29;
                                                        }
                                                    } else if (c4 != 's') {
                                                        if (c4 == 't') {
                                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                f19 = f29 - f23;
                                                                f20 = f30 - f24;
                                                            } else {
                                                                f20 = 0.0f;
                                                                f19 = 0.0f;
                                                            }
                                                            int i20 = i4 + 0;
                                                            int i21 = i4 + 1;
                                                            path.rQuadTo(f19, f20, fArr2[i20], fArr2[i21]);
                                                            float f40 = f19 + f29;
                                                            float f41 = f20 + f30;
                                                            f29 += fArr2[i20];
                                                            f30 += fArr2[i21];
                                                            f24 = f41;
                                                            f23 = f40;
                                                        }
                                                        i2 = i4;
                                                    } else {
                                                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                            float f42 = f29 - f23;
                                                            f17 = f30 - f24;
                                                            f18 = f42;
                                                        } else {
                                                            f17 = 0.0f;
                                                            f18 = 0.0f;
                                                        }
                                                        int i22 = i4 + 0;
                                                        int i23 = i4 + 1;
                                                        int i24 = i4 + 2;
                                                        int i25 = i4 + 3;
                                                        i2 = i4;
                                                        f3 = f30;
                                                        float f43 = f29;
                                                        path.rCubicTo(f18, f17, fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                                                        f4 = fArr2[i22] + f43;
                                                        f5 = fArr2[i23] + f3;
                                                        f6 = f43 + fArr2[i24];
                                                        f7 = fArr2[i25];
                                                    }
                                                    f29 = f27;
                                                    f30 = f28;
                                                } else {
                                                    i2 = i4;
                                                    int i26 = i2 + 0;
                                                    int i27 = i2 + 1;
                                                    path.lineTo(fArr2[i26], fArr2[i27]);
                                                    f11 = fArr2[i26];
                                                    f12 = fArr2[i27];
                                                }
                                                f29 = f11;
                                                f30 = f12;
                                            } else {
                                                i2 = i4;
                                                int i28 = i2 + 0;
                                                path.rLineTo(0.0f, fArr2[i28]);
                                                f10 = fArr2[i28];
                                            }
                                            f30 += f10;
                                        } else {
                                            i2 = i4;
                                            f3 = f30;
                                            float f44 = f29;
                                            int i29 = i2 + 0;
                                            float f45 = fArr2[i29];
                                            int i30 = i2 + 1;
                                            int i31 = i2 + 2;
                                            int i32 = i2 + 3;
                                            path.rQuadTo(f45, fArr2[i30], fArr2[i31], fArr2[i32]);
                                            f4 = fArr2[i29] + f44;
                                            f5 = fArr2[i30] + f3;
                                            float f46 = f44 + fArr2[i31];
                                            float f47 = fArr2[i32];
                                            f6 = f46;
                                            f7 = f47;
                                        }
                                        c4 = c4;
                                        qnHx = qnHx;
                                        i3 = i3;
                                    } else {
                                        i2 = i4;
                                        f3 = f30;
                                        float f48 = f29;
                                        int i33 = i2 + 2;
                                        int i34 = i2 + 3;
                                        int i35 = i2 + 4;
                                        int i36 = i2 + 5;
                                        path.rCubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                        f4 = fArr2[i33] + f48;
                                        f5 = fArr2[i34] + f3;
                                        f6 = f48 + fArr2[i35];
                                        f7 = fArr2[i36];
                                    }
                                    f8 = f3 + f7;
                                    f23 = f4;
                                    f24 = f5;
                                    f9 = f6;
                                    f29 = f9;
                                    f30 = f8;
                                    c4 = c4;
                                    qnHx = qnHx;
                                    i3 = i3;
                                } else {
                                    i2 = i4;
                                    float f49 = f30;
                                    float f50 = f29;
                                    int i37 = i2 + 5;
                                    int i38 = i2 + 6;
                                    a(path, f50, f49, fArr2[i37] + f50, fArr2[i38] + f49, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                                    f29 = f50 + fArr2[i37];
                                    f30 = f49 + fArr2[i38];
                                }
                                i4 = i2 + i;
                                qnHx = qnHx;
                                c3 = c4;
                                c4 = c3;
                                i3 = i3;
                                c = 'm';
                            } else {
                                i2 = i4;
                                int i39 = i2 + 2;
                                int i40 = i2 + 3;
                                int i41 = i2 + 4;
                                int i42 = i2 + 5;
                                path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                float f51 = fArr2[i41];
                                float f52 = fArr2[i42];
                                f = fArr2[i39];
                                f29 = f51;
                                f30 = f52;
                                f2 = fArr2[i40];
                            }
                            f23 = f;
                            f24 = f2;
                            i4 = i2 + i;
                            qnHx = qnHx;
                            c3 = c4;
                            c4 = c3;
                            i3 = i3;
                            c = 'm';
                        } else {
                            i2 = i4;
                            int i43 = i2 + 5;
                            int i44 = i2 + 6;
                            a(path, f29, f30, fArr2[i43], fArr2[i44], fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                            f29 = fArr2[i43];
                            f30 = fArr2[i44];
                        }
                        f24 = f30;
                        f23 = f29;
                        i4 = i2 + i;
                        qnHx = qnHx;
                        c3 = c4;
                        c4 = c3;
                        i3 = i3;
                        c = 'm';
                    }
                }
                int i45 = i3;
                fArr[0] = f29;
                fArr[1] = f30;
                fArr[2] = f23;
                fArr[3] = f24;
                fArr[4] = f27;
                fArr[5] = f28;
                i3 = i45 + 1;
                c3 = qnHxArr[i45].a;
                c = 'm';
                c2 = 0;
            }
        }

        public QnHx(QnHx qnHx) {
            this.a = qnHx.a;
            float[] fArr = qnHx.b;
            this.b = wz2.b(fArr, fArr.length);
        }
    }
}
