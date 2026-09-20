package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vz2 {
    public final ArrayList a = new ArrayList();
    public final QnHx b = new QnHx(0);
    public final QnHx c = new QnHx(0);
    public final QnHx d = new QnHx(0);
    public final QnHx e = new QnHx(0);

    public static final class QnHx {
        public float a;
        public float b;

        public QnHx() {
            this(0);
        }

        public QnHx(int i) {
            this.a = 0.0f;
            this.b = 0.0f;
        }

        public final void a() {
            this.a = 0.0f;
            this.b = 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(Float.valueOf(this.a), Float.valueOf(qnHx.a)) && ur1.a(Float.valueOf(this.b), Float.valueOf(qnHx.b));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PathPoint(x=");
            sb.append(this.a);
            sb.append(", y=");
            return dj.b(sb, this.b, ')');
        }
    }

    public static void b(qz2 qz2Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            b(qz2Var, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d16 * dSqrt2;
        double d24 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d19 - d24;
            d9 = d20 + d23;
        } else {
            d8 = d19 + d24;
            d9 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d9 * d6;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        double d29 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * d29) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d30 = -d10;
        double d31 = d30 * dCos2;
        double d32 = d6 * dSin2;
        double d33 = d30 * dSin2;
        double d34 = d6 * dCos2;
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = d;
        double d37 = d2;
        double d38 = (d31 * dSin3) - (d32 * dCos3);
        double d39 = (dCos3 * d34) + (dSin3 * d33);
        int i = 0;
        double d40 = dAtan2;
        while (i < iCeil) {
            double d41 = d40 + d35;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            double d42 = d35;
            double d43 = (((d10 * dCos2) * dCos4) + d27) - (d32 * dSin4);
            int i2 = iCeil;
            double d44 = (d34 * dSin4) + (d10 * dSin2 * dCos4) + d28;
            double d45 = (d31 * dSin4) - (d32 * dCos4);
            double d46 = (dCos4 * d34) + (dSin4 * d33);
            double d47 = d41 - d40;
            double dTan = Math.tan(d47 / d18);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d29) - ((double) 1)) * Math.sin(d47)) / ((double) 3);
            qz2Var.h((float) ((d38 * dSqrt3) + d36), (float) ((d39 * dSqrt3) + d37), (float) (d43 - (dSqrt3 * d45)), (float) (d44 - (dSqrt3 * d46)), (float) d43, (float) d44);
            i++;
            d33 = d33;
            dSin2 = dSin2;
            d27 = d27;
            d36 = d43;
            d37 = d44;
            d40 = d41;
            d39 = d46;
            d38 = d45;
            iCeil = i2;
            d35 = d42;
            d10 = d5;
        }
    }

    public final void a(char c, float[] fArr) {
        ArrayList arrayList;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        ArrayList arrayList2;
        List listSingletonList;
        Object yVar;
        ArrayList arrayList3 = this.a;
        if (c == 'z' || c == 'Z') {
            listSingletonList = Collections.singletonList(uz2.CQf.c);
        } else {
            char c4 = 2;
            if (c == 'm') {
                np1 np1VarM = AY.M(new pp1(0, fArr.length - 2), 2);
                arrayList2 = new ArrayList(mu.w0(np1VarM, 10));
                op1 it = np1VarM.iterator();
                while (it.y) {
                    int iNextInt = it.nextInt();
                    float[] fArrC0 = NPO.c0(fArr, iNextInt, iNextInt + 2);
                    float f = fArrC0[0];
                    float f2 = fArrC0[1];
                    Object rBi = new uz2.RBi(f, f2);
                    if ((rBi instanceof uz2.YKK) && iNextInt > 0) {
                        rBi = new uz2.NUlFixed(f, f2);
                    } else if (iNextInt > 0) {
                        rBi = new uz2.y(f, f2);
                    }
                    arrayList2.add(rBi);
                }
            } else if (c == 'M') {
                np1 np1VarM2 = AY.M(new pp1(0, fArr.length - 2), 2);
                arrayList2 = new ArrayList(mu.w0(np1VarM2, 10));
                op1 it2 = np1VarM2.iterator();
                while (it2.y) {
                    int iNextInt2 = it2.nextInt();
                    float[] fArrC1 = NPO.c0(fArr, iNextInt2, iNextInt2 + 2);
                    float f3 = fArrC1[0];
                    float f4 = fArrC1[1];
                    Object ykk = new uz2.YKK(f3, f4);
                    if (iNextInt2 > 0) {
                        ykk = new uz2.NUlFixed(f3, f4);
                    } else if ((ykk instanceof uz2.RBi) && iNextInt2 > 0) {
                        ykk = new uz2.y(f3, f4);
                    }
                    arrayList2.add(ykk);
                }
            } else if (c == 'l') {
                np1 np1VarM3 = AY.M(new pp1(0, fArr.length - 2), 2);
                arrayList2 = new ArrayList(mu.w0(np1VarM3, 10));
                op1 it3 = np1VarM3.iterator();
                while (it3.y) {
                    int iNextInt3 = it3.nextInt();
                    float[] fArrC2 = NPO.c0(fArr, iNextInt3, iNextInt3 + 2);
                    float f5 = fArrC2[0];
                    float f6 = fArrC2[1];
                    Object yVar2 = new uz2.y(f5, f6);
                    if ((yVar2 instanceof uz2.YKK) && iNextInt3 > 0) {
                        yVar2 = new uz2.NUlFixed(f5, f6);
                    } else if ((yVar2 instanceof uz2.RBi) && iNextInt3 > 0) {
                        yVar2 = new uz2.y(f5, f6);
                    }
                    arrayList2.add(yVar2);
                }
            } else if (c == 'L') {
                np1 np1VarM4 = AY.M(new pp1(0, fArr.length - 2), 2);
                arrayList2 = new ArrayList(mu.w0(np1VarM4, 10));
                op1 it4 = np1VarM4.iterator();
                while (it4.y) {
                    int iNextInt4 = it4.nextInt();
                    float[] fArrC3 = NPO.c0(fArr, iNextInt4, iNextInt4 + 2);
                    float f7 = fArrC3[0];
                    float f8 = fArrC3[1];
                    Object nUl = new uz2.NUlFixed(f7, f8);
                    if ((nUl instanceof uz2.YKK) && iNextInt4 > 0) {
                        nUl = new uz2.NUlFixed(f7, f8);
                    } else if ((nUl instanceof uz2.RBi) && iNextInt4 > 0) {
                        nUl = new uz2.y(f7, f8);
                    }
                    arrayList2.add(nUl);
                }
            } else if (c == 'h') {
                np1 np1VarM5 = AY.M(new pp1(0, fArr.length - 1), 1);
                arrayList2 = new ArrayList(mu.w0(np1VarM5, 10));
                op1 it5 = np1VarM5.iterator();
                while (it5.y) {
                    int iNextInt5 = it5.nextInt();
                    float[] fArrC4 = NPO.c0(fArr, iNextInt5, iNextInt5 + 1);
                    float f9 = fArrC4[0];
                    Object pRn = new uz2.PRnFixed(f9);
                    if ((pRn instanceof uz2.YKK) && iNextInt5 > 0) {
                        pRn = new uz2.NUlFixed(f9, fArrC4[1]);
                    } else if ((pRn instanceof uz2.RBi) && iNextInt5 > 0) {
                        pRn = new uz2.y(f9, fArrC4[1]);
                    }
                    arrayList2.add(pRn);
                }
            } else if (c == 'H') {
                np1 np1VarM6 = AY.M(new pp1(0, fArr.length - 1), 1);
                arrayList2 = new ArrayList(mu.w0(np1VarM6, 10));
                op1 it6 = np1VarM6.iterator();
                while (it6.y) {
                    int iNextInt6 = it6.nextInt();
                    float[] fArrC5 = NPO.c0(fArr, iNextInt6, iNextInt6 + 1);
                    float f10 = fArrC5[0];
                    Object lPt8 = new uz2.LPt8Fixed(f10);
                    if ((lPt8 instanceof uz2.YKK) && iNextInt6 > 0) {
                        lPt8 = new uz2.NUlFixed(f10, fArrC5[1]);
                    } else if ((lPt8 instanceof uz2.RBi) && iNextInt6 > 0) {
                        lPt8 = new uz2.y(f10, fArrC5[1]);
                    }
                    arrayList2.add(lPt8);
                }
            } else if (c == 'v') {
                np1 np1VarM7 = AY.M(new pp1(0, fArr.length - 1), 1);
                arrayList2 = new ArrayList(mu.w0(np1VarM7, 10));
                op1 it7 = np1VarM7.iterator();
                while (it7.y) {
                    int iNextInt7 = it7.nextInt();
                    float[] fArrC6 = NPO.c0(fArr, iNextInt7, iNextInt7 + 1);
                    float f11 = fArrC6[0];
                    Object taVar = new uz2.ta(f11);
                    if ((taVar instanceof uz2.YKK) && iNextInt7 > 0) {
                        taVar = new uz2.NUlFixed(f11, fArrC6[1]);
                    } else if ((taVar instanceof uz2.RBi) && iNextInt7 > 0) {
                        taVar = new uz2.y(f11, fArrC6[1]);
                    }
                    arrayList2.add(taVar);
                }
            } else if (c == 'V') {
                np1 np1VarM8 = AY.M(new pp1(0, fArr.length - 1), 1);
                arrayList2 = new ArrayList(mu.w0(np1VarM8, 10));
                op1 it8 = np1VarM8.iterator();
                while (it8.y) {
                    int iNextInt8 = it8.nextInt();
                    float[] fArrC7 = NPO.c0(fArr, iNextInt8, iNextInt8 + 1);
                    float f12 = fArrC7[0];
                    Object lPt9 = new uz2.LPt9Fixed(f12);
                    if ((lPt9 instanceof uz2.YKK) && iNextInt8 > 0) {
                        lPt9 = new uz2.NUlFixed(f12, fArrC7[1]);
                    } else if ((lPt9 instanceof uz2.RBi) && iNextInt8 > 0) {
                        lPt9 = new uz2.y(f12, fArrC7[1]);
                    }
                    arrayList2.add(lPt9);
                }
            } else {
                char c5 = 5;
                char c6 = 3;
                if (c == 'c') {
                    np1 np1VarM9 = AY.M(new pp1(0, fArr.length - 6), 6);
                    arrayList = new ArrayList(mu.w0(np1VarM9, 10));
                    op1 it9 = np1VarM9.iterator();
                    while (it9.y) {
                        int iNextInt9 = it9.nextInt();
                        float[] fArrC8 = NPO.c0(fArr, iNextInt9, iNextInt9 + 6);
                        float f13 = fArrC8[0];
                        float f14 = fArrC8[1];
                        Object fjcm = new uz2.FJCM(f13, f14, fArrC8[2], fArrC8[3], fArrC8[4], fArrC8[c5]);
                        if (!(fjcm instanceof uz2.YKK) || iNextInt9 <= 0) {
                            yVar = (!(fjcm instanceof uz2.RBi) || iNextInt9 <= 0) ? fjcm : new uz2.y(f13, f14);
                        } else {
                            yVar = new uz2.NUlFixed(f13, f14);
                        }
                        arrayList.add(yVar);
                        c5 = 5;
                    }
                } else if (c == 'C') {
                    np1 np1VarM10 = AY.M(new pp1(0, fArr.length - 6), 6);
                    arrayList = new ArrayList(mu.w0(np1VarM10, 10));
                    op1 it10 = np1VarM10.iterator();
                    while (it10.y) {
                        int iNextInt10 = it10.nextInt();
                        float[] fArrC9 = NPO.c0(fArr, iNextInt10, iNextInt10 + 6);
                        float f15 = fArrC9[0];
                        float f16 = fArrC9[1];
                        Object f1 = new uz2.F1(f15, f16, fArrC9[2], fArrC9[c6], fArrC9[4], fArrC9[5]);
                        if ((f1 instanceof uz2.YKK) && iNextInt10 > 0) {
                            f1 = new uz2.NUlFixed(f15, f16);
                        } else if ((f1 instanceof uz2.RBi) && iNextInt10 > 0) {
                            f1 = new uz2.y(f15, f16);
                        }
                        arrayList.add(f1);
                        c6 = 3;
                    }
                } else if (c == 's') {
                    np1 np1VarM11 = AY.M(new pp1(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(mu.w0(np1VarM11, 10));
                    op1 it11 = np1VarM11.iterator();
                    while (it11.y) {
                        int iNextInt11 = it11.nextInt();
                        float[] fArrC10 = NPO.c0(fArr, iNextInt11, iNextInt11 + 4);
                        float f17 = fArrC10[0];
                        float f18 = fArrC10[1];
                        Object lPt6 = new uz2.LPt6Fixed(f17, f18, fArrC10[2], fArrC10[3]);
                        if ((lPt6 instanceof uz2.YKK) && iNextInt11 > 0) {
                            lPt6 = new uz2.NUlFixed(f17, f18);
                        } else if ((lPt6 instanceof uz2.RBi) && iNextInt11 > 0) {
                            lPt6 = new uz2.y(f17, f18);
                        }
                        arrayList.add(lPt6);
                    }
                } else if (c == 'S') {
                    np1 np1VarM12 = AY.M(new pp1(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(mu.w0(np1VarM12, 10));
                    op1 it12 = np1VarM12.iterator();
                    while (it12.y) {
                        int iNextInt12 = it12.nextInt();
                        float[] fArrC11 = NPO.c0(fArr, iNextInt12, iNextInt12 + 4);
                        float f19 = fArrC11[0];
                        float f20 = fArrC11[1];
                        Object t23 = new uz2.T23(f19, f20, fArrC11[2], fArrC11[3]);
                        if ((t23 instanceof uz2.YKK) && iNextInt12 > 0) {
                            t23 = new uz2.NUlFixed(f19, f20);
                        } else if ((t23 instanceof uz2.RBi) && iNextInt12 > 0) {
                            t23 = new uz2.y(f19, f20);
                        }
                        arrayList.add(t23);
                    }
                } else if (c == 'q') {
                    np1 np1VarM13 = AY.M(new pp1(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(mu.w0(np1VarM13, 10));
                    op1 it13 = np1VarM13.iterator();
                    while (it13.y) {
                        int iNextInt13 = it13.nextInt();
                        float[] fArrC12 = NPO.c0(fArr, iNextInt13, iNextInt13 + 4);
                        float f21 = fArrC12[0];
                        float f22 = fArrC12[1];
                        Object mz = new uz2.MZ(f21, f22, fArrC12[2], fArrC12[3]);
                        if ((mz instanceof uz2.YKK) && iNextInt13 > 0) {
                            mz = new uz2.NUlFixed(f21, f22);
                        } else if ((mz instanceof uz2.RBi) && iNextInt13 > 0) {
                            mz = new uz2.y(f21, f22);
                        }
                        arrayList.add(mz);
                    }
                } else if (c == 'Q') {
                    np1 np1VarM14 = AY.M(new pp1(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(mu.w0(np1VarM14, 10));
                    op1 it14 = np1VarM14.iterator();
                    while (it14.y) {
                        int iNextInt14 = it14.nextInt();
                        float[] fArrC13 = NPO.c0(fArr, iNextInt14, iNextInt14 + 4);
                        float f23 = fArrC13[0];
                        float f24 = fArrC13[1];
                        Object auxVar = new uz2.auxFixed(f23, f24, fArrC13[2], fArrC13[3]);
                        if ((auxVar instanceof uz2.YKK) && iNextInt14 > 0) {
                            auxVar = new uz2.NUlFixed(f23, f24);
                        } else if ((auxVar instanceof uz2.RBi) && iNextInt14 > 0) {
                            auxVar = new uz2.y(f23, f24);
                        }
                        arrayList.add(auxVar);
                    }
                } else if (c == 't') {
                    np1 np1VarM15 = AY.M(new pp1(0, fArr.length - 2), 2);
                    arrayList2 = new ArrayList(mu.w0(np1VarM15, 10));
                    op1 it15 = np1VarM15.iterator();
                    while (it15.y) {
                        int iNextInt15 = it15.nextInt();
                        float[] fArrC14 = NPO.c0(fArr, iNextInt15, iNextInt15 + 2);
                        float f25 = fArrC14[0];
                        float f26 = fArrC14[1];
                        Object xn1 = new uz2.Xn1(f25, f26);
                        if ((xn1 instanceof uz2.YKK) && iNextInt15 > 0) {
                            xn1 = new uz2.NUlFixed(f25, f26);
                        } else if ((xn1 instanceof uz2.RBi) && iNextInt15 > 0) {
                            xn1 = new uz2.y(f25, f26);
                        }
                        arrayList2.add(xn1);
                    }
                } else if (c == 'T') {
                    np1 np1VarM16 = AY.M(new pp1(0, fArr.length - 2), 2);
                    arrayList2 = new ArrayList(mu.w0(np1VarM16, 10));
                    op1 it16 = np1VarM16.iterator();
                    while (it16.y) {
                        int iNextInt16 = it16.nextInt();
                        float[] fArrC15 = NPO.c0(fArr, iNextInt16, iNextInt16 + 2);
                        float f27 = fArrC15[0];
                        float f28 = fArrC15[1];
                        Object byn = new uz2.byN(f27, f28);
                        if ((byn instanceof uz2.YKK) && iNextInt16 > 0) {
                            byn = new uz2.NUlFixed(f27, f28);
                        } else if ((byn instanceof uz2.RBi) && iNextInt16 > 0) {
                            byn = new uz2.y(f27, f28);
                        }
                        arrayList2.add(byn);
                    }
                } else if (c == 'a') {
                    np1 np1VarM17 = AY.M(new pp1(0, fArr.length - 7), 7);
                    arrayList = new ArrayList(mu.w0(np1VarM17, 10));
                    op1 it17 = np1VarM17.iterator();
                    while (it17.y) {
                        int iNextInt17 = it17.nextInt();
                        float[] fArrC16 = NPO.c0(fArr, iNextInt17, iNextInt17 + 7);
                        float f29 = fArrC16[0];
                        float f30 = fArrC16[1];
                        float f31 = fArrC16[2];
                        boolean z3 = Float.compare(fArrC16[3], 0.0f) != 0;
                        if (Float.compare(fArrC16[4], 0.0f) != 0) {
                            c3 = 5;
                            z2 = true;
                        } else {
                            c3 = 5;
                            z2 = false;
                        }
                        Object eq = new uz2.EQ(f29, f30, f31, z3, z2, fArrC16[c3], fArrC16[6]);
                        if ((eq instanceof uz2.YKK) && iNextInt17 > 0) {
                            eq = new uz2.NUlFixed(fArrC16[0], fArrC16[1]);
                        } else if ((eq instanceof uz2.RBi) && iNextInt17 > 0) {
                            eq = new uz2.y(fArrC16[0], fArrC16[1]);
                        }
                        arrayList.add(eq);
                    }
                } else {
                    if (c != 'A') {
                        throw new IllegalArgumentException("Unknown command for: " + c);
                    }
                    np1 np1VarM18 = AY.M(new pp1(0, fArr.length - 7), 7);
                    arrayList = new ArrayList(mu.w0(np1VarM18, 10));
                    op1 it18 = np1VarM18.iterator();
                    while (it18.y) {
                        int iNextInt18 = it18.nextInt();
                        float[] fArrC17 = NPO.c0(fArr, iNextInt18, iNextInt18 + 7);
                        float f32 = fArrC17[0];
                        float f33 = fArrC17[1];
                        float f34 = fArrC17[c4];
                        boolean z4 = Float.compare(fArrC17[3], 0.0f) != 0;
                        if (Float.compare(fArrC17[4], 0.0f) != 0) {
                            c2 = 5;
                            z = true;
                        } else {
                            c2 = 5;
                            z = false;
                        }
                        Object qnHx = new uz2.QnHx(f32, f33, f34, z4, z, fArrC17[c2], fArrC17[6]);
                        if ((qnHx instanceof uz2.YKK) && iNextInt18 > 0) {
                            qnHx = new uz2.NUlFixed(fArrC17[0], fArrC17[1]);
                        } else if ((qnHx instanceof uz2.RBi) && iNextInt18 > 0) {
                            qnHx = new uz2.y(fArrC17[0], fArrC17[1]);
                        }
                        arrayList.add(qnHx);
                        c4 = 2;
                    }
                }
                listSingletonList = arrayList;
            }
            listSingletonList = arrayList2;
        }
        arrayList3.addAll(listSingletonList);
    }

    public final void c(qz2 qz2Var) {
        int i;
        QnHx qnHx;
        uz2 uz2Var;
        int i2;
        QnHx qnHx2;
        ArrayList arrayList;
        QnHx qnHx3;
        QnHx qnHx4;
        QnHx qnHx5;
        int i3;
        uz2 uz2Var2;
        QnHx qnHx6;
        qz2Var.reset();
        QnHx qnHx7 = this.b;
        qnHx7.a();
        QnHx qnHx8 = this.c;
        qnHx8.a();
        QnHx qnHx9 = this.d;
        qnHx9.a();
        QnHx qnHx10 = this.e;
        qnHx10.a();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        uz2 uz2Var3 = null;
        int i4 = 0;
        while (i4 < size) {
            uz2 uz2Var4 = (uz2) arrayList2.get(i4);
            if (uz2Var3 == null) {
                uz2Var3 = uz2Var4;
            }
            if (uz2Var4 instanceof uz2.CQf) {
                qnHx7.a = qnHx9.a;
                qnHx7.b = qnHx9.b;
                qnHx8.a = qnHx9.a;
                qnHx8.b = qnHx9.b;
                qz2Var.close();
                qz2Var.g(qnHx7.a, qnHx7.b);
            } else if (uz2Var4 instanceof uz2.RBi) {
                uz2.RBi rBi = (uz2.RBi) uz2Var4;
                float f = qnHx7.a;
                float f2 = rBi.c;
                qnHx7.a = f + f2;
                float f3 = qnHx7.b;
                float f4 = rBi.d;
                qnHx7.b = f3 + f4;
                qz2Var.b(f2, f4);
                qnHx9.a = qnHx7.a;
                qnHx9.b = qnHx7.b;
            } else if (uz2Var4 instanceof uz2.YKK) {
                uz2.YKK ykk = (uz2.YKK) uz2Var4;
                float f5 = ykk.c;
                qnHx7.a = f5;
                float f6 = ykk.d;
                qnHx7.b = f6;
                qz2Var.g(f5, f6);
                qnHx9.a = qnHx7.a;
                qnHx9.b = qnHx7.b;
            } else if (uz2Var4 instanceof uz2.y) {
                uz2.y yVar = (uz2.y) uz2Var4;
                float f7 = yVar.c;
                float f8 = yVar.d;
                qz2Var.j(f7, f8);
                qnHx7.a += yVar.c;
                qnHx7.b += f8;
            } else if (uz2Var4 instanceof uz2.NUlFixed) {
                uz2.NUlFixed nUl = (uz2.NUlFixed) uz2Var4;
                float f9 = nUl.c;
                float f10 = nUl.d;
                qz2Var.k(f9, f10);
                qnHx7.a = nUl.c;
                qnHx7.b = f10;
            } else if (uz2Var4 instanceof uz2.PRnFixed) {
                uz2.PRnFixed pRn = (uz2.PRnFixed) uz2Var4;
                qz2Var.j(pRn.c, 0.0f);
                qnHx7.a += pRn.c;
            } else if (uz2Var4 instanceof uz2.LPt8Fixed) {
                uz2.LPt8Fixed lPt8 = (uz2.LPt8Fixed) uz2Var4;
                qz2Var.k(lPt8.c, qnHx7.b);
                qnHx7.a = lPt8.c;
            } else if (uz2Var4 instanceof uz2.ta) {
                uz2.ta taVar = (uz2.ta) uz2Var4;
                qz2Var.j(0.0f, taVar.c);
                qnHx7.b += taVar.c;
            } else {
                if (uz2Var4 instanceof uz2.LPt9Fixed) {
                    uz2.LPt9Fixed lPt9 = (uz2.LPt9Fixed) uz2Var4;
                    qz2Var.k(qnHx7.a, lPt9.c);
                    qnHx7.b = lPt9.c;
                } else {
                    if (uz2Var4 instanceof uz2.FJCM) {
                        uz2.FJCM fjcm = (uz2.FJCM) uz2Var4;
                        i = size;
                        qnHx = qnHx9;
                        uz2Var = uz2Var4;
                        qz2Var.c(fjcm.c, fjcm.d, fjcm.e, fjcm.f, fjcm.g, fjcm.h);
                        qnHx8.a = qnHx7.a + fjcm.e;
                        qnHx8.b = qnHx7.b + fjcm.f;
                        qnHx7.a += fjcm.g;
                        qnHx7.b += fjcm.h;
                    } else {
                        i = size;
                        qnHx = qnHx9;
                        uz2Var = uz2Var4;
                        if (uz2Var instanceof uz2.F1) {
                            uz2.F1 f1 = (uz2.F1) uz2Var;
                            qz2Var.h(f1.c, f1.d, f1.e, f1.f, f1.g, f1.h);
                            qnHx8.a = f1.e;
                            qnHx8.b = f1.f;
                            qnHx7.a = f1.g;
                            qnHx7.b = f1.h;
                        } else if (uz2Var instanceof uz2.LPt6Fixed) {
                            uz2.LPt6Fixed lPt6 = (uz2.LPt6Fixed) uz2Var;
                            if (uz2Var3.a) {
                                qnHx10.a = qnHx7.a - qnHx8.a;
                                qnHx10.b = qnHx7.b - qnHx8.b;
                            } else {
                                qnHx10.a();
                            }
                            qz2Var.c(qnHx10.a, qnHx10.b, lPt6.c, lPt6.d, lPt6.e, lPt6.f);
                            qnHx8.a = qnHx7.a + lPt6.c;
                            qnHx8.b = qnHx7.b + lPt6.d;
                            qnHx7.a += lPt6.e;
                            qnHx7.b += lPt6.f;
                        } else if (uz2Var instanceof uz2.T23) {
                            uz2.T23 t23 = (uz2.T23) uz2Var;
                            if (uz2Var3.a) {
                                float f11 = 2;
                                qnHx10.a = (qnHx7.a * f11) - qnHx8.a;
                                qnHx10.b = (f11 * qnHx7.b) - qnHx8.b;
                            } else {
                                qnHx10.a = qnHx7.a;
                                qnHx10.b = qnHx7.b;
                            }
                            qz2Var.h(qnHx10.a, qnHx10.b, t23.c, t23.d, t23.e, t23.f);
                            qnHx8.a = t23.c;
                            qnHx8.b = t23.d;
                            qnHx7.a = t23.e;
                            qnHx7.b = t23.f;
                        } else if (uz2Var instanceof uz2.MZ) {
                            uz2.MZ mz = (uz2.MZ) uz2Var;
                            float f12 = mz.c;
                            float f13 = mz.d;
                            float f14 = mz.e;
                            float f15 = mz.f;
                            qz2Var.e(f12, f13, f14, f15);
                            qnHx8.a = qnHx7.a + mz.c;
                            qnHx8.b = qnHx7.b + f13;
                            qnHx7.a += f14;
                            qnHx7.b += f15;
                        } else if (uz2Var instanceof uz2.auxFixed) {
                            uz2.auxFixed auxVar = (uz2.auxFixed) uz2Var;
                            float f16 = auxVar.c;
                            float f17 = auxVar.d;
                            float f18 = auxVar.e;
                            float f19 = auxVar.f;
                            qz2Var.d(f16, f17, f18, f19);
                            qnHx8.a = auxVar.c;
                            qnHx8.b = f17;
                            qnHx7.a = f18;
                            qnHx7.b = f19;
                        } else if (uz2Var instanceof uz2.Xn1) {
                            uz2.Xn1 xn1 = (uz2.Xn1) uz2Var;
                            if (uz2Var3.b) {
                                qnHx10.a = qnHx7.a - qnHx8.a;
                                qnHx10.b = qnHx7.b - qnHx8.b;
                            } else {
                                qnHx10.a();
                            }
                            float f20 = qnHx10.a;
                            float f21 = qnHx10.b;
                            float f22 = xn1.c;
                            float f23 = xn1.d;
                            qz2Var.e(f20, f21, f22, f23);
                            qnHx8.a = qnHx7.a + qnHx10.a;
                            qnHx8.b = qnHx7.b + qnHx10.b;
                            qnHx7.a += xn1.c;
                            qnHx7.b += f23;
                        } else if (uz2Var instanceof uz2.byN) {
                            uz2.byN byn = (uz2.byN) uz2Var;
                            if (uz2Var3.b) {
                                float f24 = 2;
                                qnHx10.a = (qnHx7.a * f24) - qnHx8.a;
                                qnHx10.b = (f24 * qnHx7.b) - qnHx8.b;
                            } else {
                                qnHx10.a = qnHx7.a;
                                qnHx10.b = qnHx7.b;
                            }
                            float f25 = qnHx10.a;
                            float f26 = qnHx10.b;
                            float f27 = byn.c;
                            float f28 = byn.d;
                            qz2Var.d(f25, f26, f27, f28);
                            qnHx8.a = qnHx10.a;
                            qnHx8.b = qnHx10.b;
                            qnHx7.a = byn.c;
                            qnHx7.b = f28;
                        } else {
                            if (uz2Var instanceof uz2.EQ) {
                                uz2.EQ eq = (uz2.EQ) uz2Var;
                                float f29 = eq.h;
                                float f30 = qnHx7.a;
                                float f31 = f29 + f30;
                                float f32 = qnHx7.b;
                                float f33 = eq.i + f32;
                                i2 = i4;
                                i3 = i;
                                qnHx2 = qnHx10;
                                arrayList = arrayList2;
                                qnHx5 = qnHx;
                                uz2Var2 = uz2Var;
                                b(qz2Var, f30, f32, f31, f33, eq.c, eq.d, eq.e, eq.f, eq.g);
                                qnHx4 = qnHx7;
                                qnHx4.a = f31;
                                qnHx4.b = f33;
                                qnHx3 = qnHx8;
                                qnHx3.a = f31;
                                qnHx3.b = f33;
                            } else {
                                i2 = i4;
                                qnHx2 = qnHx10;
                                arrayList = arrayList2;
                                qnHx3 = qnHx8;
                                qnHx4 = qnHx7;
                                qnHx5 = qnHx;
                                i3 = i;
                                if (uz2Var instanceof uz2.QnHx) {
                                    uz2.QnHx qnHx11 = (uz2.QnHx) uz2Var;
                                    double d = qnHx4.a;
                                    double d2 = qnHx4.b;
                                    double d3 = qnHx11.h;
                                    float f34 = qnHx11.i;
                                    uz2Var2 = uz2Var;
                                    b(qz2Var, d, d2, d3, f34, qnHx11.c, qnHx11.d, qnHx11.e, qnHx11.f, qnHx11.g);
                                    float f35 = qnHx11.h;
                                    qnHx4 = qnHx4;
                                    qnHx4.a = f35;
                                    qnHx4.b = f34;
                                    qnHx6 = qnHx3;
                                    qnHx6.a = f35;
                                    qnHx6.b = f34;
                                } else {
                                    uz2Var2 = uz2Var;
                                }
                            }
                            qnHx6 = qnHx3;
                        }
                    }
                    i2 = i4;
                    qnHx2 = qnHx10;
                    arrayList = arrayList2;
                    qnHx6 = qnHx8;
                    uz2Var2 = uz2Var;
                    qnHx4 = qnHx7;
                    qnHx5 = qnHx;
                    i3 = i;
                }
                i4 = i2 + 1;
                qnHx7 = qnHx4;
                qnHx8 = qnHx6;
                arrayList2 = arrayList;
                size = i3;
                qnHx10 = qnHx2;
                qnHx9 = qnHx5;
                uz2Var3 = uz2Var2;
            }
            uz2Var2 = uz2Var4;
            i3 = size;
            i2 = i4;
            qnHx2 = qnHx10;
            arrayList = arrayList2;
            qnHx6 = qnHx8;
            qnHx5 = qnHx9;
            qnHx4 = qnHx7;
            i4 = i2 + 1;
            qnHx7 = qnHx4;
            qnHx8 = qnHx6;
            arrayList2 = arrayList;
            size = i3;
            qnHx10 = qnHx2;
            qnHx9 = qnHx5;
            uz2Var3 = uz2Var2;
        }
    }
}
