package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oh1 {
    public static final float a = 24;

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ ci2 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(h81<sd5> h81Var, pg2 pg2Var, boolean z, ci2 ci2Var, x81<? super g30, ? super Integer, sd5> x81Var, int i, int i2) {
            super(2);
            this.w = h81Var;
            this.x = pg2Var;
            this.y = z;
            this.z = ci2Var;
            this.A = x81Var;
            this.B = i;
            this.C = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            oh1.a(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1, this.C);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0143  */
    /* JADX WARN: Code duplicated, block: B:80:0x014a  */
    /* JADX WARN: Code duplicated, block: B:81:0x014e  */
    /* JADX WARN: Code duplicated, block: B:84:0x017c  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void a(h81<sd5> h81Var, pg2 pg2Var, boolean z, ci2 ci2Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        ci2 ci2Var2;
        int i7;
        int i8;
        pg2 pg2Var3;
        boolean z3;
        ci2 ci2Var3;
        rb2 rb2VarC;
        ij0 ij0Var;
        jy1 jy1Var;
        ti5 ti5Var;
        yy1.QnHx qnHx;
        sz szVarJ;
        float fZ;
        pg2 pg2Var4;
        boolean z4;
        ci2 ci2Var4;
        Object objB0;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-111063634);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 112) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z2 = z;
                    if (j30VarQ.c(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        ci2Var2 = ci2Var;
                        if (j30VarQ.I(ci2Var2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        if (j30VarQ.I(x81Var)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    if ((46811 & i3) == 9362 || !j30VarQ.t()) {
                        if (i9 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == g30.QnHx.a) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        jt4 jt4Var = f95.a;
                        pg2 pg2VarB = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                        da daVar = One.QnHx.e;
                        j30VarQ.e(733328855);
                        rb2VarC = fe.c(daVar, false, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var = (ij0) j30VarQ.E(r40.e);
                        jy1Var = (jy1) j30VarQ.E(r40.k);
                        ti5Var = (ti5) j30VarQ.E(r40.o);
                        a30.e.getClass();
                        qnHx = a30.QnHx.b;
                        szVarJ = S12N.j(pg2VarB);
                        if (!(j30VarQ.a instanceof jE)) {
                            fp1.c0();
                            throw null;
                        }
                        j30VarQ.s();
                        if (j30VarQ.K) {
                            j30VarQ.l(qnHx);
                        } else {
                            j30VarQ.A();
                        }
                        j30VarQ.x = false;
                        hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                        hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                        hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                        j30VarQ.e(-2146259096);
                        if (z3) {
                            j30VarQ.e(753555775);
                            fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                        } else {
                            j30VarQ.e(753555801);
                            fZ = AY.z(j30VarQ);
                        }
                        j30VarQ.R(false);
                        q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        pg2Var4 = pg2Var3;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                    } else {
                        j30VarQ.x();
                        pg2Var4 = pg2Var2;
                        z4 = z2;
                        ci2Var4 = ci2Var2;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new QnHx(h81Var, pg2Var4, z4, ci2Var4, x81Var, i, i2);
                }
                i3 |= 3072;
                ci2Var2 = ci2Var;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (j30VarQ.I(x81Var)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((46811 & i3) == 9362) {
                    if (i9 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    jt4 jt4Var2 = f95.a;
                    pg2 pg2VarB2 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                    da daVar2 = One.QnHx.e;
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(daVar2, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarB2);
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                    j30VarQ.e(-2146259096);
                    if (z3) {
                        j30VarQ.e(753555775);
                        fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                    } else {
                        j30VarQ.e(753555801);
                        fZ = AY.z(j30VarQ);
                    }
                    j30VarQ.R(false);
                    q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    pg2Var4 = pg2Var3;
                    z4 = z3;
                    ci2Var4 = ci2Var3;
                } else {
                    if (i9 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    jt4 jt4Var3 = f95.a;
                    pg2 pg2VarB3 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                    da daVar3 = One.QnHx.e;
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(daVar3, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarB3);
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                    j30VarQ.e(-2146259096);
                    if (z3) {
                        j30VarQ.e(753555775);
                        fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                    } else {
                        j30VarQ.e(753555801);
                        fZ = AY.z(j30VarQ);
                    }
                    j30VarQ.R(false);
                    q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    pg2Var4 = pg2Var3;
                    z4 = z3;
                    ci2Var4 = ci2Var3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new QnHx(h81Var, pg2Var4, z4, ci2Var4, x81Var, i, i2);
            }
            i3 |= 384;
            z2 = z;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    ci2Var2 = ci2Var;
                    if (j30VarQ.I(ci2Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (j30VarQ.I(x81Var)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((46811 & i3) == 9362) {
                    if (i9 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    jt4 jt4Var4 = f95.a;
                    pg2 pg2VarB4 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                    da daVar4 = One.QnHx.e;
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(daVar4, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarB4);
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                    j30VarQ.e(-2146259096);
                    if (z3) {
                        j30VarQ.e(753555775);
                        fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                    } else {
                        j30VarQ.e(753555801);
                        fZ = AY.z(j30VarQ);
                    }
                    j30VarQ.R(false);
                    q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    pg2Var4 = pg2Var3;
                    z4 = z3;
                    ci2Var4 = ci2Var3;
                } else {
                    if (i9 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    jt4 jt4Var5 = f95.a;
                    pg2 pg2VarB5 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                    da daVar5 = One.QnHx.e;
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(daVar5, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarB5);
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                    j30VarQ.e(-2146259096);
                    if (z3) {
                        j30VarQ.e(753555775);
                        fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                    } else {
                        j30VarQ.e(753555801);
                        fZ = AY.z(j30VarQ);
                    }
                    j30VarQ.R(false);
                    q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    pg2Var4 = pg2Var3;
                    z4 = z3;
                    ci2Var4 = ci2Var3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new QnHx(h81Var, pg2Var4, z4, ci2Var4, x81Var, i, i2);
            }
            i3 |= 3072;
            ci2Var2 = ci2Var;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (j30VarQ.I(x81Var)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((46811 & i3) == 9362) {
                if (i9 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB0;
                } else {
                    ci2Var3 = ci2Var2;
                }
                jt4 jt4Var6 = f95.a;
                pg2 pg2VarB6 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                da daVar6 = One.QnHx.e;
                j30VarQ.e(733328855);
                rb2VarC = fe.c(daVar6, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarB6);
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                j30VarQ.e(-2146259096);
                if (z3) {
                    j30VarQ.e(753555775);
                    fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                } else {
                    j30VarQ.e(753555801);
                    fZ = AY.z(j30VarQ);
                }
                j30VarQ.R(false);
                q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                pg2Var4 = pg2Var3;
                z4 = z3;
                ci2Var4 = ci2Var3;
            } else {
                if (i9 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB0;
                } else {
                    ci2Var3 = ci2Var2;
                }
                jt4 jt4Var7 = f95.a;
                pg2 pg2VarB7 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                da daVar7 = One.QnHx.e;
                j30VarQ.e(733328855);
                rb2VarC = fe.c(daVar7, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarB7);
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                j30VarQ.e(-2146259096);
                if (z3) {
                    j30VarQ.e(753555775);
                    fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                } else {
                    j30VarQ.e(753555801);
                    fZ = AY.z(j30VarQ);
                }
                j30VarQ.R(false);
                q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                pg2Var4 = pg2Var3;
                z4 = z3;
                ci2Var4 = ci2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(h81Var, pg2Var4, z4, ci2Var4, x81Var, i, i2);
        }
        i3 |= 48;
        pg2Var2 = pg2Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z2 = z;
                if (j30VarQ.c(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    ci2Var2 = ci2Var;
                    if (j30VarQ.I(ci2Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (j30VarQ.I(x81Var)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((46811 & i3) == 9362) {
                    if (i9 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    jt4 jt4Var8 = f95.a;
                    pg2 pg2VarB8 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                    da daVar8 = One.QnHx.e;
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(daVar8, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarB8);
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                    j30VarQ.e(-2146259096);
                    if (z3) {
                        j30VarQ.e(753555775);
                        fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                    } else {
                        j30VarQ.e(753555801);
                        fZ = AY.z(j30VarQ);
                    }
                    j30VarQ.R(false);
                    q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    pg2Var4 = pg2Var3;
                    z4 = z3;
                    ci2Var4 = ci2Var3;
                } else {
                    if (i9 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == g30.QnHx.a) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    jt4 jt4Var9 = f95.a;
                    pg2 pg2VarB9 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                    da daVar9 = One.QnHx.e;
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(daVar9, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarB9);
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                    j30VarQ.e(-2146259096);
                    if (z3) {
                        j30VarQ.e(753555775);
                        fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                    } else {
                        j30VarQ.e(753555801);
                        fZ = AY.z(j30VarQ);
                    }
                    j30VarQ.R(false);
                    q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    pg2Var4 = pg2Var3;
                    z4 = z3;
                    ci2Var4 = ci2Var3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new QnHx(h81Var, pg2Var4, z4, ci2Var4, x81Var, i, i2);
            }
            i3 |= 3072;
            ci2Var2 = ci2Var;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (j30VarQ.I(x81Var)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((46811 & i3) == 9362) {
                if (i9 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB0;
                } else {
                    ci2Var3 = ci2Var2;
                }
                jt4 jt4Var10 = f95.a;
                pg2 pg2VarB10 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                da daVar10 = One.QnHx.e;
                j30VarQ.e(733328855);
                rb2VarC = fe.c(daVar10, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarB10);
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                j30VarQ.e(-2146259096);
                if (z3) {
                    j30VarQ.e(753555775);
                    fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                } else {
                    j30VarQ.e(753555801);
                    fZ = AY.z(j30VarQ);
                }
                j30VarQ.R(false);
                q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                pg2Var4 = pg2Var3;
                z4 = z3;
                ci2Var4 = ci2Var3;
            } else {
                if (i9 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB0;
                } else {
                    ci2Var3 = ci2Var2;
                }
                jt4 jt4Var11 = f95.a;
                pg2 pg2VarB11 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                da daVar11 = One.QnHx.e;
                j30VarQ.e(733328855);
                rb2VarC = fe.c(daVar11, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarB11);
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                j30VarQ.e(-2146259096);
                if (z3) {
                    j30VarQ.e(753555775);
                    fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                } else {
                    j30VarQ.e(753555801);
                    fZ = AY.z(j30VarQ);
                }
                j30VarQ.R(false);
                q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                pg2Var4 = pg2Var3;
                z4 = z3;
                ci2Var4 = ci2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(h81Var, pg2Var4, z4, ci2Var4, x81Var, i, i2);
        }
        i3 |= 384;
        z2 = z;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                ci2Var2 = ci2Var;
                if (j30VarQ.I(ci2Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (j30VarQ.I(x81Var)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((46811 & i3) == 9362) {
                if (i9 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB0;
                } else {
                    ci2Var3 = ci2Var2;
                }
                jt4 jt4Var12 = f95.a;
                pg2 pg2VarB12 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                da daVar12 = One.QnHx.e;
                j30VarQ.e(733328855);
                rb2VarC = fe.c(daVar12, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarB12);
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                j30VarQ.e(-2146259096);
                if (z3) {
                    j30VarQ.e(753555775);
                    fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                } else {
                    j30VarQ.e(753555801);
                    fZ = AY.z(j30VarQ);
                }
                j30VarQ.R(false);
                q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                pg2Var4 = pg2Var3;
                z4 = z3;
                ci2Var4 = ci2Var3;
            } else {
                if (i9 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB0;
                } else {
                    ci2Var3 = ci2Var2;
                }
                jt4 jt4Var13 = f95.a;
                pg2 pg2VarB13 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
                da daVar13 = One.QnHx.e;
                j30VarQ.e(733328855);
                rb2VarC = fe.c(daVar13, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarB13);
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
                j30VarQ.e(-2146259096);
                if (z3) {
                    j30VarQ.e(753555775);
                    fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
                } else {
                    j30VarQ.e(753555801);
                    fZ = AY.z(j30VarQ);
                }
                j30VarQ.R(false);
                q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                pg2Var4 = pg2Var3;
                z4 = z3;
                ci2Var4 = ci2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(h81Var, pg2Var4, z4, ci2Var4, x81Var, i, i2);
        }
        i3 |= 3072;
        ci2Var2 = ci2Var;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (j30VarQ.I(x81Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((46811 & i3) == 9362) {
            if (i9 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i6 != 0) {
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                if (objB0 == g30.QnHx.a) {
                    objB0 = new di2();
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ci2Var3 = (ci2) objB0;
            } else {
                ci2Var3 = ci2Var2;
            }
            jt4 jt4Var14 = f95.a;
            pg2 pg2VarB14 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
            da daVar14 = One.QnHx.e;
            j30VarQ.e(733328855);
            rb2VarC = fe.c(daVar14, false, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            qnHx = a30.QnHx.b;
            szVarJ = S12N.j(pg2VarB14);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
            j30VarQ.e(-2146259096);
            if (z3) {
                j30VarQ.e(753555775);
                fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
            } else {
                j30VarQ.e(753555801);
                fZ = AY.z(j30VarQ);
            }
            j30VarQ.R(false);
            q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
            pg2Var4 = pg2Var3;
            z4 = z3;
            ci2Var4 = ci2Var3;
        } else {
            if (i9 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i6 != 0) {
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                if (objB0 == g30.QnHx.a) {
                    objB0 = new di2();
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ci2Var3 = (ci2) objB0;
            } else {
                ci2Var3 = ci2Var2;
            }
            jt4 jt4Var15 = f95.a;
            pg2 pg2VarB15 = hr.b(f30.a(pg2Var3, wo1.a, g95.w), ci2Var3, vs3.a(false, a, 0L, j30VarQ, 54, 4), z3, new zs3(0), h81Var, 8);
            da daVar15 = One.QnHx.e;
            j30VarQ.e(733328855);
            rb2VarC = fe.c(daVar15, false, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            qnHx = a30.QnHx.b;
            szVarJ = S12N.j(pg2VarB15);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
            j30VarQ.e(-2146259096);
            if (z3) {
                j30VarQ.e(753555775);
                fZ = ((Number) j30VarQ.E(p70.a)).floatValue();
            } else {
                j30VarQ.e(753555801);
                fZ = AY.z(j30VarQ);
            }
            j30VarQ.R(false);
            q40.a(new ng3[]{p70.a.b(Float.valueOf(fZ))}, x81Var, j30VarQ, ((i3 >> 9) & 112) | 8);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
            pg2Var4 = pg2Var3;
            z4 = z3;
            ci2Var4 = ci2Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(h81Var, pg2Var4, z4, ci2Var4, x81Var, i, i2);
    }
}
