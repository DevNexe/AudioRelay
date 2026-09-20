package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kp8W {
    public static final float a = 56;
    public static final float b;
    public static final lm4 c;
    public static final pg2 d;

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ dj4 A;
        public final /* synthetic */ pg2 B;
        public final /* synthetic */ y81<wu3, g30, Integer, sd5> C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;
        public final /* synthetic */ long w;
        public final /* synthetic */ long x;
        public final /* synthetic */ float y;
        public final /* synthetic */ ay2 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(long j, long j2, float f, ay2 ay2Var, dj4 dj4Var, pg2 pg2Var, y81<? super wu3, ? super g30, ? super Integer, sd5> y81Var, int i, int i2) {
            super(2);
            this.w = j;
            this.x = j2;
            this.y = f;
            this.z = ay2Var;
            this.A = dj4Var;
            this.B = pg2Var;
            this.C = y81Var;
            this.D = i;
            this.E = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            kp8W.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, g30Var, this.D | 1, this.E);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<wu3, g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ int x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ y81<wu3, g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i, x81 x81Var, x81 x81Var2, y81 y81Var) {
            super(3);
            this.w = x81Var;
            this.x = i;
            this.y = x81Var2;
            this.z = y81Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wu3 wu3Var, g30 g30Var, Integer num) {
            wu3 wu3Var2 = wu3Var;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(wu3Var2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                da.CQf cQf = One.QnHx.k;
                x81<g30, Integer, sd5> x81Var = this.w;
                int i = this.x;
                if (x81Var == null) {
                    g30Var2.e(-512812651);
                    hH.i(kp8W.c, g30Var2, 6);
                    g30Var2.G();
                } else {
                    g30Var2.e(-512812592);
                    pg2 pg2Var = kp8W.d;
                    g30Var2.e(693286680);
                    rb2 rb2VarA = uu3.a(CZ9P.a, cQf, g30Var2);
                    g30Var2.e(-1323940314);
                    ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                    jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                    ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                    a30.e.getClass();
                    yy1.QnHx qnHx = a30.QnHx.b;
                    sz szVarJ = S12N.j(pg2Var);
                    if (!(g30Var2.v() instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    g30Var2.s();
                    if (g30Var2.m()) {
                        g30Var2.l(qnHx);
                    } else {
                        g30Var2.A();
                    }
                    g30Var2.u();
                    hH.u(g30Var2, rb2VarA, a30.QnHx.e);
                    hH.u(g30Var2, ij0Var, a30.QnHx.d);
                    hH.u(g30Var2, jy1Var, a30.QnHx.f);
                    qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -678309503);
                    g30Var2.e(1485618042);
                    q40.a(new ng3[]{p70.a.b(Float.valueOf(AY.A(g30Var2)))}, x81Var, g30Var2, ((i >> 3) & 112) | 8);
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.H();
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.G();
                }
                pg2 pg2VarA = wu3Var2.a(gm4.b, 1.0f, true);
                g30Var2.e(693286680);
                rb2 rb2VarA2 = uu3.a(CZ9P.a, cQf, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var2 = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var2 = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var2 = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ2 = S12N.j(pg2VarA);
                if (!(g30Var2.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var2.s();
                if (g30Var2.m()) {
                    g30Var2.l(qnHx2);
                } else {
                    g30Var2.A();
                }
                g30Var2.u();
                hH.u(g30Var2, rb2VarA2, a30.QnHx.e);
                hH.u(g30Var2, ij0Var2, a30.QnHx.d);
                hH.u(g30Var2, jy1Var2, a30.QnHx.f);
                qc0.c(0, szVarJ2, bl2.b(g30Var2, ti5Var2, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -678309503);
                g30Var2.e(159489950);
                j55.a(((rc5) g30Var2.E(sc5.a)).f, X.m(g30Var2, -2021518195, new eL(i, this.y)), g30Var2, 48);
                g30Var2.G();
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
                q40.a(new ng3[]{p70.a.b(Float.valueOf(AY.C(g30Var2, 6)))}, X.m(g30Var2, 1157662914, new Ot3(this.z, i)), g30Var2, 56);
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ long A;
        public final /* synthetic */ long B;
        public final /* synthetic */ float C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ y81<wu3, g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(x81<? super g30, ? super Integer, sd5> x81Var, pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var2, y81<? super wu3, ? super g30, ? super Integer, sd5> y81Var, long j, long j2, float f, int i, int i2) {
            super(2);
            this.w = x81Var;
            this.x = pg2Var;
            this.y = x81Var2;
            this.z = y81Var;
            this.A = j;
            this.B = j2;
            this.C = f;
            this.D = i;
            this.E = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            kp8W.b(this.w, this.x, this.y, this.z, this.A, this.B, this.C, g30Var, this.D | 1, this.E);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ay2 w;
        public final /* synthetic */ y81<wu3, g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(ay2 ay2Var, y81<? super wu3, ? super g30, ? super Integer, sd5> y81Var, int i) {
            super(2);
            this.w = ay2Var;
            this.x = y81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                q40.a(new ng3[]{p70.a.b(Float.valueOf(AY.C(g30Var2, 6)))}, X.m(g30Var2, 1296061040, new ih(this.w, this.x, this.y)), g30Var2, 56);
            }
            return sd5.a;
        }
    }

    static {
        float f = 4;
        b = f;
        float f2 = 16 - f;
        wo1.QnHx qnHx = wo1.a;
        c = new lm4(f2, 0.0f, f2, 0.0f, 10);
        d = gm4.k(gm4.b, 72 - f);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x0130  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void a(long j, long j2, float f, ay2 ay2Var, dj4 dj4Var, pg2 pg2Var, y81<? super wu3, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        pg2 pg2Var2;
        int i8;
        int i9;
        pg2 pg2Var3;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-1249680788);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.j(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= j30VarQ.j(j2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 896) == 0) {
                    if (j30VarQ.g(f)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i3 |= i4;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (j30VarQ.I(ay2Var)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    if ((57344 & i) == 0) {
                        if (j30VarQ.I(dj4Var)) {
                            i6 = 16384;
                        } else {
                            i6 = 8192;
                        }
                        i3 |= i6;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((i & 458752) == 0) {
                            pg2Var2 = pg2Var;
                            if (j30VarQ.I(pg2Var2)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i3 |= i8;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            if (j30VarQ.I(y81Var)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if ((2995931 & i3) == 599186 || !j30VarQ.t()) {
                            if (i7 != 0) {
                                pg2Var3 = pg2.QnHx.w;
                            } else {
                                pg2Var3 = pg2Var2;
                            }
                            int i10 = i3 << 6;
                            ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i10 & 896) | (i10 & 7168) | ((i3 << 9) & 458752), 16);
                        } else {
                            j30VarQ.x();
                            pg2Var3 = pg2Var2;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
                    }
                    i3 |= 196608;
                    pg2Var2 = pg2Var;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((2995931 & i3) == 599186) {
                        if (i7 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        int i11 = i3 << 6;
                        ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i11 & 896) | (i11 & 7168) | ((i3 << 9) & 458752), 16);
                    } else {
                        if (i7 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        int i12 = i3 << 6;
                        ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i12 & 896) | (i12 & 7168) | ((i3 << 9) & 458752), 16);
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
                }
                i3 |= 24576;
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((i & 458752) == 0) {
                        pg2Var2 = pg2Var;
                        if (j30VarQ.I(pg2Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((2995931 & i3) == 599186) {
                        if (i7 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        int i13 = i3 << 6;
                        ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i13 & 896) | (i13 & 7168) | ((i3 << 9) & 458752), 16);
                    } else {
                        if (i7 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        int i14 = i3 << 6;
                        ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i14 & 896) | (i14 & 7168) | ((i3 << 9) & 458752), 16);
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
                }
                i3 |= 196608;
                pg2Var2 = pg2Var;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((2995931 & i3) == 599186) {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i15 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i15 & 896) | (i15 & 7168) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i16 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i16 & 896) | (i16 & 7168) | ((i3 << 9) & 458752), 16);
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
            }
            i3 |= 384;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(ay2Var)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                if ((57344 & i) == 0) {
                    if (j30VarQ.I(dj4Var)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((i & 458752) == 0) {
                        pg2Var2 = pg2Var;
                        if (j30VarQ.I(pg2Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((2995931 & i3) == 599186) {
                        if (i7 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        int i17 = i3 << 6;
                        ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i17 & 896) | (i17 & 7168) | ((i3 << 9) & 458752), 16);
                    } else {
                        if (i7 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        int i18 = i3 << 6;
                        ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i18 & 896) | (i18 & 7168) | ((i3 << 9) & 458752), 16);
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
                }
                i3 |= 196608;
                pg2Var2 = pg2Var;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((2995931 & i3) == 599186) {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i19 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i19 & 896) | (i19 & 7168) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i110 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i110 & 896) | (i110 & 7168) | ((i3 << 9) & 458752), 16);
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
            }
            i3 |= 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((i & 458752) == 0) {
                    pg2Var2 = pg2Var;
                    if (j30VarQ.I(pg2Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((2995931 & i3) == 599186) {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i111 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i111 & 896) | (i111 & 7168) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i112 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i112 & 896) | (i112 & 7168) | ((i3 << 9) & 458752), 16);
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
            }
            i3 |= 196608;
            pg2Var2 = pg2Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((2995931 & i3) == 599186) {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                int i113 = i3 << 6;
                ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i113 & 896) | (i113 & 7168) | ((i3 << 9) & 458752), 16);
            } else {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                int i114 = i3 << 6;
                ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i114 & 896) | (i114 & 7168) | ((i3 << 9) & 458752), 16);
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
        }
        i3 |= 48;
        if ((i2 & 4) != 0) {
            if ((i & 896) == 0) {
                if (j30VarQ.g(f)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(ay2Var)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                if ((57344 & i) == 0) {
                    if (j30VarQ.I(dj4Var)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((i & 458752) == 0) {
                        pg2Var2 = pg2Var;
                        if (j30VarQ.I(pg2Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((2995931 & i3) == 599186) {
                        if (i7 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        int i115 = i3 << 6;
                        ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i115 & 896) | (i115 & 7168) | ((i3 << 9) & 458752), 16);
                    } else {
                        if (i7 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        int i116 = i3 << 6;
                        ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i116 & 896) | (i116 & 7168) | ((i3 << 9) & 458752), 16);
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
                }
                i3 |= 196608;
                pg2Var2 = pg2Var;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((2995931 & i3) == 599186) {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i117 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i117 & 896) | (i117 & 7168) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i118 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i118 & 896) | (i118 & 7168) | ((i3 << 9) & 458752), 16);
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
            }
            i3 |= 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((i & 458752) == 0) {
                    pg2Var2 = pg2Var;
                    if (j30VarQ.I(pg2Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((2995931 & i3) == 599186) {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i119 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i119 & 896) | (i119 & 7168) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i1110 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1110 & 896) | (i1110 & 7168) | ((i3 << 9) & 458752), 16);
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
            }
            i3 |= 196608;
            pg2Var2 = pg2Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((2995931 & i3) == 599186) {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                int i1111 = i3 << 6;
                ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1111 & 896) | (i1111 & 7168) | ((i3 << 9) & 458752), 16);
            } else {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                int i1112 = i3 << 6;
                ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1112 & 896) | (i1112 & 7168) | ((i3 << 9) & 458752), 16);
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(ay2Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 16) != 0) {
            if ((57344 & i) == 0) {
                if (j30VarQ.I(dj4Var)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((i & 458752) == 0) {
                    pg2Var2 = pg2Var;
                    if (j30VarQ.I(pg2Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((2995931 & i3) == 599186) {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i1113 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1113 & 896) | (i1113 & 7168) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    int i1114 = i3 << 6;
                    ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1114 & 896) | (i1114 & 7168) | ((i3 << 9) & 458752), 16);
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
            }
            i3 |= 196608;
            pg2Var2 = pg2Var;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((2995931 & i3) == 599186) {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                int i1115 = i3 << 6;
                ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1115 & 896) | (i1115 & 7168) | ((i3 << 9) & 458752), 16);
            } else {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                int i1116 = i3 << 6;
                ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1116 & 896) | (i1116 & 7168) | ((i3 << 9) & 458752), 16);
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
        }
        i3 |= 24576;
        i7 = i2 & 32;
        if (i7 != 0) {
            if ((i & 458752) == 0) {
                pg2Var2 = pg2Var;
                if (j30VarQ.I(pg2Var2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((2995931 & i3) == 599186) {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                int i1117 = i3 << 6;
                ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1117 & 896) | (i1117 & 7168) | ((i3 << 9) & 458752), 16);
            } else {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                int i1118 = i3 << 6;
                ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1118 & 896) | (i1118 & 7168) | ((i3 << 9) & 458752), 16);
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
        }
        i3 |= 196608;
        pg2Var2 = pg2Var;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (j30VarQ.I(y81Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((2995931 & i3) == 599186) {
            if (i7 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            int i1119 = i3 << 6;
            ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1119 & 896) | (i1119 & 7168) | ((i3 << 9) & 458752), 16);
        } else {
            if (i7 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            int i11110 = i3 << 6;
            ix4.a(pg2Var3, dj4Var, j, j2, null, f, X.m(j30VarQ, -1027830352, new QnHx(ay2Var, y81Var, i3)), j30VarQ, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i11110 & 896) | (i11110 & 7168) | ((i3 << 9) & 458752), 16);
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(j, j2, f, ay2Var, dj4Var, pg2Var3, y81Var, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
    public static final void b(x81<? super g30, ? super Integer, sd5> x81Var, pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var2, y81<? super wu3, ? super g30, ? super Integer, sd5> y81Var, long j, long j2, float f, g30 g30Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        y81<? super wu3, ? super g30, ? super Integer, sd5> y81Var2;
        int i7;
        long j3;
        long j4;
        int i8;
        float f2;
        int i9;
        pg2 pg2Var2;
        x81<? super g30, ? super Integer, sd5> x81Var3;
        y81<? super wu3, ? super g30, ? super Integer, sd5> y81Var3;
        long jK;
        long jB;
        float f3;
        long j5;
        rv rvVar;
        pg2 pg2Var3;
        x81<? super g30, ? super Integer, sd5> x81Var4;
        y81<? super wu3, ? super g30, ? super Integer, sd5> y81Var4;
        long j6;
        long j7;
        tk3 tk3VarU;
        int i10;
        j30 j30VarQ = g30Var.q(-2087748139);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(x81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 112) == 0) {
                i3 |= j30VarQ.I(pg2Var) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    if (j30VarQ.I(x81Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        y81Var2 = y81Var;
                        if (j30VarQ.I(y81Var2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((57344 & i) == 0) {
                        j3 = j;
                        if ((i2 & 16) == 0 || !j30VarQ.j(j3)) {
                            i10 = 8192;
                        } else {
                            i10 = 16384;
                        }
                        i3 |= i10;
                    } else {
                        j3 = j;
                    }
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0) {
                            j4 = j2;
                            int i12 = j30VarQ.j(j4) ? 131072 : 65536;
                            i3 |= i12;
                        } else {
                            j4 = j2;
                        }
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i3 |= 1572864;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 3670016) == 0) {
                            if (j30VarQ.g(f2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                    }
                    if ((i3 & 2995931) == 599186 || !j30VarQ.t()) {
                        j30VarQ.t0();
                        if ((i & 1) != 0 || j30VarQ.Y()) {
                            if (i11 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i4 != 0) {
                                x81Var3 = null;
                            } else {
                                x81Var3 = x81Var2;
                            }
                            if (i6 != 0) {
                                y81Var3 = e00.a;
                            } else {
                                y81Var3 = y81Var2;
                            }
                            if ((i2 & 16) != 0) {
                                rvVar = (rv) j30VarQ.E(sv.a);
                                if (rvVar.l()) {
                                    jK = rvVar.g();
                                } else {
                                    jK = rvVar.k();
                                }
                                i3 &= -57345;
                            } else {
                                jK = j3;
                            }
                            if ((i2 & 32) != 0) {
                                jB = sv.b(jK, j30VarQ);
                                i3 &= -458753;
                            } else {
                                jB = j4;
                            }
                            if (i8 != 0) {
                                f3 = oL6.a;
                            } else {
                                f3 = f2;
                            }
                            j5 = jB;
                        } else {
                            j30VarQ.x();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            pg2Var2 = pg2Var;
                            x81Var3 = x81Var2;
                            y81Var3 = y81Var2;
                            f3 = f2;
                            jK = j3;
                            j5 = j4;
                        }
                        j30VarQ.S();
                        int i13 = i3 >> 12;
                        a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i13 & 896) | (i13 & 14) | 1600512 | (i13 & 112) | ((i3 << 12) & 458752), 0);
                        pg2Var3 = pg2Var2;
                        x81Var4 = x81Var3;
                        y81Var4 = y81Var3;
                        f2 = f3;
                        j6 = jK;
                        j7 = j5;
                    } else {
                        j30VarQ.x();
                        pg2Var3 = pg2Var;
                        x81Var4 = x81Var2;
                        y81Var4 = y81Var2;
                        j6 = j3;
                        j7 = j4;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new LPt8Fixed(x81Var, pg2Var3, x81Var4, y81Var4, j6, j7, f2, i, i2);
                }
                i3 |= 3072;
                y81Var2 = y81Var;
                if ((57344 & i) == 0) {
                    j3 = j;
                    if ((i2 & 16) == 0) {
                        i10 = 8192;
                    } else {
                        i10 = 8192;
                    }
                    i3 |= i10;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (j30VarQ.j(j4)) {
                        }
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 3670016) == 0) {
                        if (j30VarQ.g(f2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    }
                    j30VarQ.S();
                    int i14 = i3 >> 12;
                    a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i14 & 896) | (i14 & 14) | 1600512 | (i14 & 112) | ((i3 << 12) & 458752), 0);
                    pg2Var3 = pg2Var2;
                    x81Var4 = x81Var3;
                    y81Var4 = y81Var3;
                    f2 = f3;
                    j6 = jK;
                    j7 = j5;
                } else {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    }
                    j30VarQ.S();
                    int i15 = i3 >> 12;
                    a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i15 & 896) | (i15 & 14) | 1600512 | (i15 & 112) | ((i3 << 12) & 458752), 0);
                    pg2Var3 = pg2Var2;
                    x81Var4 = x81Var3;
                    y81Var4 = y81Var3;
                    f2 = f3;
                    j6 = jK;
                    j7 = j5;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(x81Var, pg2Var3, x81Var4, y81Var4, j6, j7, f2, i, i2);
            }
            i3 |= 384;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    y81Var2 = y81Var;
                    if (j30VarQ.I(y81Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((57344 & i) == 0) {
                    j3 = j;
                    if ((i2 & 16) == 0) {
                        i10 = 8192;
                    } else {
                        i10 = 8192;
                    }
                    i3 |= i10;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (j30VarQ.j(j4)) {
                        }
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 3670016) == 0) {
                        if (j30VarQ.g(f2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    }
                    j30VarQ.S();
                    int i16 = i3 >> 12;
                    a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i16 & 896) | (i16 & 14) | 1600512 | (i16 & 112) | ((i3 << 12) & 458752), 0);
                    pg2Var3 = pg2Var2;
                    x81Var4 = x81Var3;
                    y81Var4 = y81Var3;
                    f2 = f3;
                    j6 = jK;
                    j7 = j5;
                } else {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    }
                    j30VarQ.S();
                    int i17 = i3 >> 12;
                    a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i17 & 896) | (i17 & 14) | 1600512 | (i17 & 112) | ((i3 << 12) & 458752), 0);
                    pg2Var3 = pg2Var2;
                    x81Var4 = x81Var3;
                    y81Var4 = y81Var3;
                    f2 = f3;
                    j6 = jK;
                    j7 = j5;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(x81Var, pg2Var3, x81Var4, y81Var4, j6, j7, f2, i, i2);
            }
            i3 |= 3072;
            y81Var2 = y81Var;
            if ((57344 & i) == 0) {
                j3 = j;
                if ((i2 & 16) == 0) {
                    i10 = 8192;
                } else {
                    i10 = 8192;
                }
                i3 |= i10;
            } else {
                j3 = j;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (j30VarQ.j(j4)) {
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 3670016) == 0) {
                    if (j30VarQ.g(f2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i3 & 2995931) == 599186) {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                }
                j30VarQ.S();
                int i18 = i3 >> 12;
                a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i18 & 896) | (i18 & 14) | 1600512 | (i18 & 112) | ((i3 << 12) & 458752), 0);
                pg2Var3 = pg2Var2;
                x81Var4 = x81Var3;
                y81Var4 = y81Var3;
                f2 = f3;
                j6 = jK;
                j7 = j5;
            } else {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                }
                j30VarQ.S();
                int i19 = i3 >> 12;
                a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i19 & 896) | (i19 & 14) | 1600512 | (i19 & 112) | ((i3 << 12) & 458752), 0);
                pg2Var3 = pg2Var2;
                x81Var4 = x81Var3;
                y81Var4 = y81Var3;
                f2 = f3;
                j6 = jK;
                j7 = j5;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(x81Var, pg2Var3, x81Var4, y81Var4, j6, j7, f2, i, i2);
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                if (j30VarQ.I(x81Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    y81Var2 = y81Var;
                    if (j30VarQ.I(y81Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((57344 & i) == 0) {
                    j3 = j;
                    if ((i2 & 16) == 0) {
                        i10 = 8192;
                    } else {
                        i10 = 8192;
                    }
                    i3 |= i10;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (j30VarQ.j(j4)) {
                        }
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 3670016) == 0) {
                        if (j30VarQ.g(f2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    }
                    j30VarQ.S();
                    int i110 = i3 >> 12;
                    a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i110 & 896) | (i110 & 14) | 1600512 | (i110 & 112) | ((i3 << 12) & 458752), 0);
                    pg2Var3 = pg2Var2;
                    x81Var4 = x81Var3;
                    y81Var4 = y81Var3;
                    f2 = f3;
                    j6 = jK;
                    j7 = j5;
                } else {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i4 != 0) {
                            x81Var3 = null;
                        } else {
                            x81Var3 = x81Var2;
                        }
                        if (i6 != 0) {
                            y81Var3 = e00.a;
                        } else {
                            y81Var3 = y81Var2;
                        }
                        if ((i2 & 16) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i3 &= -57345;
                        } else {
                            jK = j3;
                        }
                        if ((i2 & 32) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i3 &= -458753;
                        } else {
                            jB = j4;
                        }
                        if (i8 != 0) {
                            f3 = oL6.a;
                        } else {
                            f3 = f2;
                        }
                        j5 = jB;
                    }
                    j30VarQ.S();
                    int i111 = i3 >> 12;
                    a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i111 & 896) | (i111 & 14) | 1600512 | (i111 & 112) | ((i3 << 12) & 458752), 0);
                    pg2Var3 = pg2Var2;
                    x81Var4 = x81Var3;
                    y81Var4 = y81Var3;
                    f2 = f3;
                    j6 = jK;
                    j7 = j5;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(x81Var, pg2Var3, x81Var4, y81Var4, j6, j7, f2, i, i2);
            }
            i3 |= 3072;
            y81Var2 = y81Var;
            if ((57344 & i) == 0) {
                j3 = j;
                if ((i2 & 16) == 0) {
                    i10 = 8192;
                } else {
                    i10 = 8192;
                }
                i3 |= i10;
            } else {
                j3 = j;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (j30VarQ.j(j4)) {
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 3670016) == 0) {
                    if (j30VarQ.g(f2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i3 & 2995931) == 599186) {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                }
                j30VarQ.S();
                int i112 = i3 >> 12;
                a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i112 & 896) | (i112 & 14) | 1600512 | (i112 & 112) | ((i3 << 12) & 458752), 0);
                pg2Var3 = pg2Var2;
                x81Var4 = x81Var3;
                y81Var4 = y81Var3;
                f2 = f3;
                j6 = jK;
                j7 = j5;
            } else {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                }
                j30VarQ.S();
                int i113 = i3 >> 12;
                a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i113 & 896) | (i113 & 14) | 1600512 | (i113 & 112) | ((i3 << 12) & 458752), 0);
                pg2Var3 = pg2Var2;
                x81Var4 = x81Var3;
                y81Var4 = y81Var3;
                f2 = f3;
                j6 = jK;
                j7 = j5;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(x81Var, pg2Var3, x81Var4, y81Var4, j6, j7, f2, i, i2);
        }
        i3 |= 384;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                y81Var2 = y81Var;
                if (j30VarQ.I(y81Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((57344 & i) == 0) {
                j3 = j;
                if ((i2 & 16) == 0) {
                    i10 = 8192;
                } else {
                    i10 = 8192;
                }
                i3 |= i10;
            } else {
                j3 = j;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (j30VarQ.j(j4)) {
                    }
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 3670016) == 0) {
                    if (j30VarQ.g(f2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i3 & 2995931) == 599186) {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                }
                j30VarQ.S();
                int i114 = i3 >> 12;
                a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i114 & 896) | (i114 & 14) | 1600512 | (i114 & 112) | ((i3 << 12) & 458752), 0);
                pg2Var3 = pg2Var2;
                x81Var4 = x81Var3;
                y81Var4 = y81Var3;
                f2 = f3;
                j6 = jK;
                j7 = j5;
            } else {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        x81Var3 = null;
                    } else {
                        x81Var3 = x81Var2;
                    }
                    if (i6 != 0) {
                        y81Var3 = e00.a;
                    } else {
                        y81Var3 = y81Var2;
                    }
                    if ((i2 & 16) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i3 &= -57345;
                    } else {
                        jK = j3;
                    }
                    if ((i2 & 32) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i3 &= -458753;
                    } else {
                        jB = j4;
                    }
                    if (i8 != 0) {
                        f3 = oL6.a;
                    } else {
                        f3 = f2;
                    }
                    j5 = jB;
                }
                j30VarQ.S();
                int i115 = i3 >> 12;
                a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i115 & 896) | (i115 & 14) | 1600512 | (i115 & 112) | ((i3 << 12) & 458752), 0);
                pg2Var3 = pg2Var2;
                x81Var4 = x81Var3;
                y81Var4 = y81Var3;
                f2 = f3;
                j6 = jK;
                j7 = j5;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(x81Var, pg2Var3, x81Var4, y81Var4, j6, j7, f2, i, i2);
        }
        i3 |= 3072;
        y81Var2 = y81Var;
        if ((57344 & i) == 0) {
            j3 = j;
            if ((i2 & 16) == 0) {
                i10 = 8192;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        } else {
            j3 = j;
        }
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                j4 = j2;
                if (j30VarQ.j(j4)) {
                }
                i3 |= i12;
            } else {
                j4 = j2;
            }
            i3 |= i12;
        } else {
            j4 = j2;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 3670016) == 0) {
                if (j30VarQ.g(f2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
        }
        if ((i3 & 2995931) == 599186) {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    x81Var3 = null;
                } else {
                    x81Var3 = x81Var2;
                }
                if (i6 != 0) {
                    y81Var3 = e00.a;
                } else {
                    y81Var3 = y81Var2;
                }
                if ((i2 & 16) != 0) {
                    rvVar = (rv) j30VarQ.E(sv.a);
                    if (rvVar.l()) {
                        jK = rvVar.g();
                    } else {
                        jK = rvVar.k();
                    }
                    i3 &= -57345;
                } else {
                    jK = j3;
                }
                if ((i2 & 32) != 0) {
                    jB = sv.b(jK, j30VarQ);
                    i3 &= -458753;
                } else {
                    jB = j4;
                }
                if (i8 != 0) {
                    f3 = oL6.a;
                } else {
                    f3 = f2;
                }
                j5 = jB;
            } else {
                if (i11 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    x81Var3 = null;
                } else {
                    x81Var3 = x81Var2;
                }
                if (i6 != 0) {
                    y81Var3 = e00.a;
                } else {
                    y81Var3 = y81Var2;
                }
                if ((i2 & 16) != 0) {
                    rvVar = (rv) j30VarQ.E(sv.a);
                    if (rvVar.l()) {
                        jK = rvVar.g();
                    } else {
                        jK = rvVar.k();
                    }
                    i3 &= -57345;
                } else {
                    jK = j3;
                }
                if ((i2 & 32) != 0) {
                    jB = sv.b(jK, j30VarQ);
                    i3 &= -458753;
                } else {
                    jB = j4;
                }
                if (i8 != 0) {
                    f3 = oL6.a;
                } else {
                    f3 = f2;
                }
                j5 = jB;
            }
            j30VarQ.S();
            int i116 = i3 >> 12;
            a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i116 & 896) | (i116 & 14) | 1600512 | (i116 & 112) | ((i3 << 12) & 458752), 0);
            pg2Var3 = pg2Var2;
            x81Var4 = x81Var3;
            y81Var4 = y81Var3;
            f2 = f3;
            j6 = jK;
            j7 = j5;
        } else {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    x81Var3 = null;
                } else {
                    x81Var3 = x81Var2;
                }
                if (i6 != 0) {
                    y81Var3 = e00.a;
                } else {
                    y81Var3 = y81Var2;
                }
                if ((i2 & 16) != 0) {
                    rvVar = (rv) j30VarQ.E(sv.a);
                    if (rvVar.l()) {
                        jK = rvVar.g();
                    } else {
                        jK = rvVar.k();
                    }
                    i3 &= -57345;
                } else {
                    jK = j3;
                }
                if ((i2 & 32) != 0) {
                    jB = sv.b(jK, j30VarQ);
                    i3 &= -458753;
                } else {
                    jB = j4;
                }
                if (i8 != 0) {
                    f3 = oL6.a;
                } else {
                    f3 = f2;
                }
                j5 = jB;
            } else {
                if (i11 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    x81Var3 = null;
                } else {
                    x81Var3 = x81Var2;
                }
                if (i6 != 0) {
                    y81Var3 = e00.a;
                } else {
                    y81Var3 = y81Var2;
                }
                if ((i2 & 16) != 0) {
                    rvVar = (rv) j30VarQ.E(sv.a);
                    if (rvVar.l()) {
                        jK = rvVar.g();
                    } else {
                        jK = rvVar.k();
                    }
                    i3 &= -57345;
                } else {
                    jK = j3;
                }
                if ((i2 & 32) != 0) {
                    jB = sv.b(jK, j30VarQ);
                    i3 &= -458753;
                } else {
                    jB = j4;
                }
                if (i8 != 0) {
                    f3 = oL6.a;
                } else {
                    f3 = f2;
                }
                j5 = jB;
            }
            j30VarQ.S();
            int i117 = i3 >> 12;
            a(jK, j5, f3, oL6.b, el3.a, pg2Var2, X.m(j30VarQ, -1484077694, new F1(i3, x81Var3, x81Var, y81Var3)), j30VarQ, (i117 & 896) | (i117 & 14) | 1600512 | (i117 & 112) | ((i3 << 12) & 458752), 0);
            pg2Var3 = pg2Var2;
            x81Var4 = x81Var3;
            y81Var4 = y81Var3;
            f2 = f3;
            j6 = jK;
            j7 = j5;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(x81Var, pg2Var3, x81Var4, y81Var4, j6, j7, f2, i, i2);
    }
}
