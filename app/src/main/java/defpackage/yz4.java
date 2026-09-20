package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yz4 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ci2 A;
        public final /* synthetic */ long B;
        public final /* synthetic */ long C;
        public final /* synthetic */ y81<wv, g30, Integer, sd5> D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ h81<sd5> x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(boolean z, h81<sd5> h81Var, pg2 pg2Var, boolean z2, ci2 ci2Var, long j, long j2, y81<? super wv, ? super g30, ? super Integer, sd5> y81Var, int i, int i2) {
            super(2);
            this.w = z;
            this.x = h81Var;
            this.y = pg2Var;
            this.z = z2;
            this.A = ci2Var;
            this.B = j;
            this.C = j2;
            this.D = y81Var;
            this.E = i;
            this.F = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            yz4.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, g30Var, this.E | 1, this.F);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ long w;
        public final /* synthetic */ long x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(long j, long j2, boolean z, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = j;
            this.x = j2;
            this.y = z;
            this.z = x81Var;
            this.A = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            yz4.b(this.w, this.x, this.y, this.z, g30Var, this.A | 1);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements y81<t95.CQf<Boolean>, g30, Integer, lx0<yu>> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(3);
        }

        @Override // defpackage.y81
        public final lx0<yu> invoke(t95.CQf<Boolean> cQf, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(-2120892502);
            boolean zB = cQf.b(Boolean.FALSE, Boolean.TRUE);
            nq0.QnHx qnHx = nq0.QnHx.a;
            nb5 nb5Var = zB ? new nb5(150, 100, qnHx) : hH.E(100, 0, qnHx, 2);
            g30Var2.G();
            return nb5Var;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ h81<sd5> B;
        public final /* synthetic */ y81<wv, g30, Integer, sd5> C;
        public final /* synthetic */ int D;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ ci2 y;
        public final /* synthetic */ uj1 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(pg2 pg2Var, boolean z, ci2 ci2Var, p53 p53Var, boolean z2, h81 h81Var, y81 y81Var, int i) {
            super(2);
            this.w = pg2Var;
            this.x = z;
            this.y = ci2Var;
            this.z = p53Var;
            this.A = z2;
            this.B = h81Var;
            this.C = y81Var;
            this.D = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                pg2 pg2VarF = gm4.f(m74.a(this.w, this.x, this.y, this.z, this.A, new zs3(4), this.B));
                da.QnHx qnHx = One.QnHx.n;
                CZ9P.CQf cQf = CZ9P.e;
                int i = ((this.D >> 12) & 7168) | 432;
                g30Var2.e(-483455358);
                rb2 rb2VarA = tv.a(cQf, qnHx, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ = S12N.j(pg2VarF);
                int i2 = ((((i << 3) & 112) << 9) & 7168) | 6;
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
                hH.u(g30Var2, rb2VarA, a30.QnHx.e);
                hH.u(g30Var2, ij0Var, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                szVarJ.invoke(bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, Integer.valueOf((i2 >> 3) & 112));
                g30Var2.e(2058660585);
                g30Var2.e(-1163856341);
                if (((i2 >> 9) & 14 & 11) == 2 && g30Var2.t()) {
                    g30Var2.x();
                } else {
                    this.C.invoke(zv.a, g30Var2, Integer.valueOf(((i >> 6) & 112) | 6));
                }
                ex0.d(g30Var2);
            }
            return sd5.a;
        }
    }

    static {
        FWT.B(20);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0174  */
    /* JADX WARN: Code duplicated, block: B:122:0x0182  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    public static final void a(boolean z, h81<sd5> h81Var, pg2 pg2Var, boolean z2, ci2 ci2Var, long j, long j2, y81<? super wv, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        long j3;
        int i8;
        ci2 ci2Var2;
        long j4;
        long jB;
        ci2 ci2Var3;
        boolean z4;
        long j5;
        long j6;
        pg2 pg2Var3;
        Object objB0;
        boolean z5;
        ci2 ci2Var4;
        long j7;
        long j8;
        tk3 tk3VarU;
        int i9;
        j30 j30VarQ = g30Var.q(713679175);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(h81Var) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 896) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    z3 = z2;
                    if (j30VarQ.c(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        if (j30VarQ.I(ci2Var)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((458752 & i) != 0) {
                        i3 |= ((i2 & 32) == 0 || !j30VarQ.j(j)) ? 65536 : 131072;
                    }
                    if ((3670016 & i) == 0) {
                        j3 = j2;
                        if ((i2 & 64) == 0 || !j30VarQ.j(j3)) {
                            i9 = 524288;
                        } else {
                            i9 = 1048576;
                        }
                        i3 |= i9;
                    } else {
                        j3 = j2;
                    }
                    if ((i2 & 128) != 0) {
                        i3 |= 12582912;
                    } else if ((29360128 & i) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((23967451 & i3) == 4793490 || !j30VarQ.t()) {
                        j30VarQ.t0();
                        if ((i & 1) != 0 || j30VarQ.Y()) {
                            if (i10 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == g30.QnHx.a) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i2 & 32) != 0) {
                                j4 = ((yu) j30VarQ.E(r70.a)).a;
                                i3 &= -458753;
                            } else {
                                j4 = j;
                            }
                            if ((i2 & 64) != 0) {
                                jB = yu.b(j4, AY.C(j30VarQ, 6));
                                i3 &= -3670017;
                            } else {
                                jB = j3;
                            }
                            ci2Var3 = ci2Var2;
                            z4 = z3;
                            j5 = jB;
                            j6 = j4;
                            pg2Var3 = pg2Var2;
                        } else {
                            j30VarQ.x();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            ci2Var3 = ci2Var;
                            j6 = j;
                            pg2Var3 = pg2Var2;
                            z4 = z3;
                            j5 = j3;
                        }
                        j30VarQ.S();
                        int i11 = i3 >> 15;
                        b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i11 & 112) | (i11 & 14) | 3072 | ((i3 << 6) & 896));
                        pg2Var2 = pg2Var3;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        j7 = j6;
                        j8 = j5;
                    } else {
                        j30VarQ.x();
                        z5 = z3;
                        j8 = j3;
                        ci2Var4 = ci2Var;
                        j7 = j;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(z, h81Var, pg2Var2, z5, ci2Var4, j7, j8, y81Var, i, i2);
                }
                i3 |= 24576;
                if ((458752 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !j30VarQ.j(j)) ? 65536 : 131072;
                }
                if ((3670016 & i) == 0) {
                    j3 = j2;
                    if ((i2 & 64) == 0) {
                        i9 = 524288;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    j3 = j2;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((23967451 & i3) == 4793490) {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    }
                    j30VarQ.S();
                    int i12 = i3 >> 15;
                    b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i12 & 112) | (i12 & 14) | 3072 | ((i3 << 6) & 896));
                    pg2Var2 = pg2Var3;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    j7 = j6;
                    j8 = j5;
                } else {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    }
                    j30VarQ.S();
                    int i13 = i3 >> 15;
                    b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i13 & 112) | (i13 & 14) | 3072 | ((i3 << 6) & 896));
                    pg2Var2 = pg2Var3;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    j7 = j6;
                    j8 = j5;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(z, h81Var, pg2Var2, z5, ci2Var4, j7, j8, y81Var, i, i2);
            }
            i3 |= 3072;
            z3 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    if (j30VarQ.I(ci2Var)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !j30VarQ.j(j)) ? 65536 : 131072;
                }
                if ((3670016 & i) == 0) {
                    j3 = j2;
                    if ((i2 & 64) == 0) {
                        i9 = 524288;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    j3 = j2;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((23967451 & i3) == 4793490) {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    }
                    j30VarQ.S();
                    int i14 = i3 >> 15;
                    b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i14 & 112) | (i14 & 14) | 3072 | ((i3 << 6) & 896));
                    pg2Var2 = pg2Var3;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    j7 = j6;
                    j8 = j5;
                } else {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    }
                    j30VarQ.S();
                    int i15 = i3 >> 15;
                    b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i15 & 112) | (i15 & 14) | 3072 | ((i3 << 6) & 896));
                    pg2Var2 = pg2Var3;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    j7 = j6;
                    j8 = j5;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(z, h81Var, pg2Var2, z5, ci2Var4, j7, j8, y81Var, i, i2);
            }
            i3 |= 24576;
            if ((458752 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !j30VarQ.j(j)) ? 65536 : 131072;
            }
            if ((3670016 & i) == 0) {
                j3 = j2;
                if ((i2 & 64) == 0) {
                    i9 = 524288;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                j3 = j2;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((29360128 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((23967451 & i3) == 4793490) {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                }
                j30VarQ.S();
                int i16 = i3 >> 15;
                b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i16 & 112) | (i16 & 14) | 3072 | ((i3 << 6) & 896));
                pg2Var2 = pg2Var3;
                z5 = z4;
                ci2Var4 = ci2Var3;
                j7 = j6;
                j8 = j5;
            } else {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                }
                j30VarQ.S();
                int i17 = i3 >> 15;
                b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i17 & 112) | (i17 & 14) | 3072 | ((i3 << 6) & 896));
                pg2Var2 = pg2Var3;
                z5 = z4;
                ci2Var4 = ci2Var3;
                j7 = j6;
                j8 = j5;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(z, h81Var, pg2Var2, z5, ci2Var4, j7, j8, y81Var, i, i2);
        }
        i3 |= 384;
        pg2Var2 = pg2Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z3 = z2;
                if (j30VarQ.c(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    if (j30VarQ.I(ci2Var)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) != 0) {
                    i3 |= ((i2 & 32) == 0 || !j30VarQ.j(j)) ? 65536 : 131072;
                }
                if ((3670016 & i) == 0) {
                    j3 = j2;
                    if ((i2 & 64) == 0) {
                        i9 = 524288;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    j3 = j2;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((23967451 & i3) == 4793490) {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    }
                    j30VarQ.S();
                    int i18 = i3 >> 15;
                    b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i18 & 112) | (i18 & 14) | 3072 | ((i3 << 6) & 896));
                    pg2Var2 = pg2Var3;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    j7 = j6;
                    j8 = j5;
                } else {
                    j30VarQ.t0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((yu) j30VarQ.E(r70.a)).a;
                            i3 &= -458753;
                        } else {
                            j4 = j;
                        }
                        if ((i2 & 64) != 0) {
                            jB = yu.b(j4, AY.C(j30VarQ, 6));
                            i3 &= -3670017;
                        } else {
                            jB = j3;
                        }
                        ci2Var3 = ci2Var2;
                        z4 = z3;
                        j5 = jB;
                        j6 = j4;
                        pg2Var3 = pg2Var2;
                    }
                    j30VarQ.S();
                    int i19 = i3 >> 15;
                    b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i19 & 112) | (i19 & 14) | 3072 | ((i3 << 6) & 896));
                    pg2Var2 = pg2Var3;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    j7 = j6;
                    j8 = j5;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(z, h81Var, pg2Var2, z5, ci2Var4, j7, j8, y81Var, i, i2);
            }
            i3 |= 24576;
            if ((458752 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !j30VarQ.j(j)) ? 65536 : 131072;
            }
            if ((3670016 & i) == 0) {
                j3 = j2;
                if ((i2 & 64) == 0) {
                    i9 = 524288;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                j3 = j2;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((29360128 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((23967451 & i3) == 4793490) {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                }
                j30VarQ.S();
                int i110 = i3 >> 15;
                b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i110 & 112) | (i110 & 14) | 3072 | ((i3 << 6) & 896));
                pg2Var2 = pg2Var3;
                z5 = z4;
                ci2Var4 = ci2Var3;
                j7 = j6;
                j8 = j5;
            } else {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                }
                j30VarQ.S();
                int i111 = i3 >> 15;
                b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i111 & 112) | (i111 & 14) | 3072 | ((i3 << 6) & 896));
                pg2Var2 = pg2Var3;
                z5 = z4;
                ci2Var4 = ci2Var3;
                j7 = j6;
                j8 = j5;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(z, h81Var, pg2Var2, z5, ci2Var4, j7, j8, y81Var, i, i2);
        }
        i3 |= 3072;
        z3 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                if (j30VarQ.I(ci2Var)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((458752 & i) != 0) {
                i3 |= ((i2 & 32) == 0 || !j30VarQ.j(j)) ? 65536 : 131072;
            }
            if ((3670016 & i) == 0) {
                j3 = j2;
                if ((i2 & 64) == 0) {
                    i9 = 524288;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                j3 = j2;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((29360128 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((23967451 & i3) == 4793490) {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                }
                j30VarQ.S();
                int i112 = i3 >> 15;
                b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i112 & 112) | (i112 & 14) | 3072 | ((i3 << 6) & 896));
                pg2Var2 = pg2Var3;
                z5 = z4;
                ci2Var4 = ci2Var3;
                j7 = j6;
                j8 = j5;
            } else {
                j30VarQ.t0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j4 = ((yu) j30VarQ.E(r70.a)).a;
                        i3 &= -458753;
                    } else {
                        j4 = j;
                    }
                    if ((i2 & 64) != 0) {
                        jB = yu.b(j4, AY.C(j30VarQ, 6));
                        i3 &= -3670017;
                    } else {
                        jB = j3;
                    }
                    ci2Var3 = ci2Var2;
                    z4 = z3;
                    j5 = jB;
                    j6 = j4;
                    pg2Var3 = pg2Var2;
                }
                j30VarQ.S();
                int i113 = i3 >> 15;
                b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i113 & 112) | (i113 & 14) | 3072 | ((i3 << 6) & 896));
                pg2Var2 = pg2Var3;
                z5 = z4;
                ci2Var4 = ci2Var3;
                j7 = j6;
                j8 = j5;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(z, h81Var, pg2Var2, z5, ci2Var4, j7, j8, y81Var, i, i2);
        }
        i3 |= 24576;
        if ((458752 & i) != 0) {
            i3 |= ((i2 & 32) == 0 || !j30VarQ.j(j)) ? 65536 : 131072;
        }
        if ((3670016 & i) == 0) {
            j3 = j2;
            if ((i2 & 64) == 0) {
                i9 = 524288;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        } else {
            j3 = j2;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (j30VarQ.I(y81Var)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((23967451 & i3) == 4793490) {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var2 = (ci2) objB0;
                } else {
                    ci2Var2 = ci2Var;
                }
                if ((i2 & 32) != 0) {
                    j4 = ((yu) j30VarQ.E(r70.a)).a;
                    i3 &= -458753;
                } else {
                    j4 = j;
                }
                if ((i2 & 64) != 0) {
                    jB = yu.b(j4, AY.C(j30VarQ, 6));
                    i3 &= -3670017;
                } else {
                    jB = j3;
                }
                ci2Var3 = ci2Var2;
                z4 = z3;
                j5 = jB;
                j6 = j4;
                pg2Var3 = pg2Var2;
            } else {
                if (i10 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var2 = (ci2) objB0;
                } else {
                    ci2Var2 = ci2Var;
                }
                if ((i2 & 32) != 0) {
                    j4 = ((yu) j30VarQ.E(r70.a)).a;
                    i3 &= -458753;
                } else {
                    j4 = j;
                }
                if ((i2 & 64) != 0) {
                    jB = yu.b(j4, AY.C(j30VarQ, 6));
                    i3 &= -3670017;
                } else {
                    jB = j3;
                }
                ci2Var3 = ci2Var2;
                z4 = z3;
                j5 = jB;
                j6 = j4;
                pg2Var3 = pg2Var2;
            }
            j30VarQ.S();
            int i114 = i3 >> 15;
            b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i114 & 112) | (i114 & 14) | 3072 | ((i3 << 6) & 896));
            pg2Var2 = pg2Var3;
            z5 = z4;
            ci2Var4 = ci2Var3;
            j7 = j6;
            j8 = j5;
        } else {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var2 = (ci2) objB0;
                } else {
                    ci2Var2 = ci2Var;
                }
                if ((i2 & 32) != 0) {
                    j4 = ((yu) j30VarQ.E(r70.a)).a;
                    i3 &= -458753;
                } else {
                    j4 = j;
                }
                if ((i2 & 64) != 0) {
                    jB = yu.b(j4, AY.C(j30VarQ, 6));
                    i3 &= -3670017;
                } else {
                    jB = j3;
                }
                ci2Var3 = ci2Var2;
                z4 = z3;
                j5 = jB;
                j6 = j4;
                pg2Var3 = pg2Var2;
            } else {
                if (i10 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var2 = (ci2) objB0;
                } else {
                    ci2Var2 = ci2Var;
                }
                if ((i2 & 32) != 0) {
                    j4 = ((yu) j30VarQ.E(r70.a)).a;
                    i3 &= -458753;
                } else {
                    j4 = j;
                }
                if ((i2 & 64) != 0) {
                    jB = yu.b(j4, AY.C(j30VarQ, 6));
                    i3 &= -3670017;
                } else {
                    jB = j3;
                }
                ci2Var3 = ci2Var2;
                z4 = z3;
                j5 = jB;
                j6 = j4;
                pg2Var3 = pg2Var2;
            }
            j30VarQ.S();
            int i115 = i3 >> 15;
            b(j6, j5, z, X.m(j30VarQ, -1237246709, new QnHx(pg2Var3, z, ci2Var3, vs3.a(true, 0.0f, j6, j30VarQ, ((i3 >> 9) & 896) | 6, 2), z4, h81Var, y81Var, i3)), j30VarQ, (i115 & 112) | (i115 & 14) | 3072 | ((i3 << 6) & 896));
            pg2Var2 = pg2Var3;
            z5 = z4;
            ci2Var4 = ci2Var3;
            j7 = j6;
            j8 = j5;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(z, h81Var, pg2Var2, z5, ci2Var4, j7, j8, y81Var, i, i2);
    }

    public static final void b(long j, long j2, boolean z, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-405571117);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.j(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.j(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.c(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 2048 : 1024;
        }
        if ((i2 & 5851) == 1170 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            int i3 = i2 >> 6;
            t95 t95VarC = da5.c(Boolean.valueOf(z), null, j30VarQ, i3 & 14, 2);
            LPt8Fixed lPt8 = LPt8Fixed.w;
            j30VarQ.e(-1462136984);
            boolean zBooleanValue = ((Boolean) t95VarC.d()).booleanValue();
            j30VarQ.e(1445938070);
            long j3 = zBooleanValue ? j : j2;
            j30VarQ.R(false);
            fv fvVarF = yu.f(j3);
            j30VarQ.e(-3686930);
            boolean zI = j30VarQ.I(fvVarF);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = (pb5) qv.a.invoke(fvVarF);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pb5 pb5Var = (pb5) objB0;
            j30VarQ.e(1847725064);
            boolean zBooleanValue2 = ((Boolean) t95VarC.b()).booleanValue();
            j30VarQ.e(1445938070);
            long j4 = zBooleanValue2 ? j : j2;
            j30VarQ.R(false);
            yu yuVar = new yu(j4);
            boolean zBooleanValue3 = ((Boolean) t95VarC.d()).booleanValue();
            j30VarQ.e(1445938070);
            long j5 = zBooleanValue3 ? j : j2;
            j30VarQ.R(false);
            t95.LPt8Fixed lPt8B = da5.b(t95VarC, yuVar, new yu(j5), lPt8.invoke(t95VarC.c(), j30VarQ, 0), pb5Var, "ColorAnimation", j30VarQ);
            j30VarQ.R(false);
            j30VarQ.R(false);
            q40.a(new ng3[]{r70.a.b(new yu(yu.b(((yu) lPt8B.getValue()).a, 1.0f))), p70.a.b(Float.valueOf(yu.d(((yu) lPt8B.getValue()).a)))}, x81Var, j30VarQ, (i3 & 112) | 8);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(j, j2, z, x81Var, i);
    }
}
