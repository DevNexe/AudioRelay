package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n64 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ y81<m64, g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(pg2 pg2Var, int i, y81<? super m64, ? super g30, ? super Integer, sd5> y81Var, int i2, int i3) {
            super(2);
            this.w = pg2Var;
            this.x = i;
            this.y = y81Var;
            this.z = i2;
            this.A = i3;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            n64.a(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:85:0x020b  */
    /* JADX WARN: Code duplicated, block: B:87:0x020f  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void a(pg2 pg2Var, int i, y81<? super m64, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i2, int i3) {
        pg2 pg2Var2;
        int i4;
        int i5;
        int i6;
        pg2 pg2Var3;
        int i7;
        int i8;
        da daVar;
        rb2 rb2VarC;
        jt4 jt4Var;
        ij0 ij0Var;
        jt4 jt4Var2;
        jy1 jy1Var;
        jt4 jt4Var3;
        ti5 ti5Var;
        yy1.QnHx qnHx;
        sz szVarJ;
        int i9;
        pg2 pg2Var4;
        jE<?> jEVar;
        a30.QnHx.F1 f1;
        a30.QnHx.C0012QnHx c0012QnHx;
        a30.QnHx.CQf cQf;
        a30.QnHx.NUlFixed nUl;
        le leVar;
        int i10;
        m64 m64VarW;
        rb2 rb2VarC2;
        ij0 ij0Var2;
        jy1 jy1Var2;
        ti5 ti5Var2;
        sz szVarJ2;
        boolean z;
        boolean z2;
        pg2 pg2Var5;
        int i11;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(287464602);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            pg2Var2 = pg2Var;
        } else if ((i2 & 14) == 0) {
            pg2Var2 = pg2Var;
            i4 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i2;
        } else {
            pg2Var2 = pg2Var;
            i4 = i2;
        }
        int i13 = i3 & 2;
        if (i13 == 0) {
            if ((i2 & 112) == 0) {
                i5 = i;
                i4 |= j30VarQ.i(i5) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                i4 |= 384;
            } else if ((i2 & 896) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i4 & 731) == 146 || !j30VarQ.t()) {
                if (i12 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i13 != 0) {
                    i7 = 0;
                } else {
                    i7 = i5;
                }
                e40.CQf cQf2 = e40.a;
                i8 = i4 & 14;
                j30VarQ.e(733328855);
                daVar = One.QnHx.a;
                rb2VarC = fe.c(daVar, false, j30VarQ);
                j30VarQ.e(-1323940314);
                jt4Var = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var);
                jt4Var2 = r40.k;
                jy1Var = (jy1) j30VarQ.E(jt4Var2);
                jt4Var3 = r40.o;
                ti5Var = (ti5) j30VarQ.E(jt4Var3);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2Var3);
                i9 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
                pg2Var4 = pg2Var3;
                jEVar = j30VarQ.a;
                if (!(jEVar instanceof jE)) {
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
                f1 = a30.QnHx.e;
                hH.u(j30VarQ, rb2VarC, f1);
                c0012QnHx = a30.QnHx.d;
                hH.u(j30VarQ, ij0Var, c0012QnHx);
                cQf = a30.QnHx.f;
                hH.u(j30VarQ, jy1Var, cQf);
                nUl = a30.QnHx.g;
                szVarJ.invoke(sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, Integer.valueOf((i9 >> 3) & 112));
                j30VarQ.e(2058660585);
                j30VarQ.e(-2137368960);
                if (((i9 >> 9) & 14 & 11) == 2 || !j30VarQ.t()) {
                    leVar = le.a;
                    i10 = ((i8 >> 6) & 112) | 6;
                    if ((i10 & 14) == 0) {
                        i10 |= j30VarQ.I(leVar) ? 4 : 2;
                    }
                    if ((i10 & 91) == 18 || !j30VarQ.t()) {
                        m64VarW = ob.w(i7, j30VarQ, 0);
                        y81Var.invoke(m64VarW, j30VarQ, Integer.valueOf((i4 >> 3) & 112));
                        da daVar2 = One.QnHx.e;
                        wo1.QnHx qnHx2 = wo1.a;
                        ee eeVar = new ee(daVar2, true);
                        j30VarQ.e(733328855);
                        rb2VarC2 = fe.c(daVar, false, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(eeVar);
                        if (!(jEVar instanceof jE)) {
                            fp1.c0();
                            throw null;
                        }
                        j30VarQ.s();
                        if (j30VarQ.K) {
                            j30VarQ.l(qnHx);
                        } else {
                            j30VarQ.A();
                        }
                        z = false;
                        j30VarQ.x = false;
                        Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarC2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -2137368960);
                        vh5.a(new ee(One.QnHx.f, false), m64VarW, j30VarQ, 0);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        z2 = true;
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                    } else {
                        j30VarQ.x();
                    }
                    O.g(j30VarQ, z, z, z2, z);
                    j30VarQ.R(z);
                    pg2Var5 = pg2Var4;
                    i11 = i7;
                } else {
                    j30VarQ.x();
                }
                z = false;
                z2 = true;
                O.g(j30VarQ, z, z, z2, z);
                j30VarQ.R(z);
                pg2Var5 = pg2Var4;
                i11 = i7;
            } else {
                j30VarQ.x();
                pg2Var5 = pg2Var2;
                i11 = i5;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(pg2Var5, i11, y81Var, i2, i3);
        }
        i4 |= 48;
        i5 = i;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (j30VarQ.I(y81Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        if ((i4 & 731) == 146) {
            if (i12 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i13 != 0) {
                i7 = 0;
            } else {
                i7 = i5;
            }
            e40.CQf cQf3 = e40.a;
            i8 = i4 & 14;
            j30VarQ.e(733328855);
            daVar = One.QnHx.a;
            rb2VarC = fe.c(daVar, false, j30VarQ);
            j30VarQ.e(-1323940314);
            jt4Var = r40.e;
            ij0Var = (ij0) j30VarQ.E(jt4Var);
            jt4Var2 = r40.k;
            jy1Var = (jy1) j30VarQ.E(jt4Var2);
            jt4Var3 = r40.o;
            ti5Var = (ti5) j30VarQ.E(jt4Var3);
            a30.e.getClass();
            qnHx = a30.QnHx.b;
            szVarJ = S12N.j(pg2Var3);
            i9 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
            pg2Var4 = pg2Var3;
            jEVar = j30VarQ.a;
            if (!(jEVar instanceof jE)) {
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
            f1 = a30.QnHx.e;
            hH.u(j30VarQ, rb2VarC, f1);
            c0012QnHx = a30.QnHx.d;
            hH.u(j30VarQ, ij0Var, c0012QnHx);
            cQf = a30.QnHx.f;
            hH.u(j30VarQ, jy1Var, cQf);
            nUl = a30.QnHx.g;
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, Integer.valueOf((i9 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-2137368960);
            if (((i9 >> 9) & 14 & 11) == 2) {
                leVar = le.a;
                i10 = ((i8 >> 6) & 112) | 6;
                if ((i10 & 14) == 0) {
                    i10 |= j30VarQ.I(leVar) ? 4 : 2;
                }
                if ((i10 & 91) == 18) {
                }
                m64VarW = ob.w(i7, j30VarQ, 0);
                y81Var.invoke(m64VarW, j30VarQ, Integer.valueOf((i4 >> 3) & 112));
                da daVar3 = One.QnHx.e;
                wo1.QnHx qnHx3 = wo1.a;
                ee eeVar2 = new ee(daVar3, true);
                j30VarQ.e(733328855);
                rb2VarC2 = fe.c(daVar, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(eeVar2);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                z = false;
                j30VarQ.x = false;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarC2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -2137368960);
                vh5.a(new ee(One.QnHx.f, false), m64VarW, j30VarQ, 0);
                j30VarQ.R(false);
                j30VarQ.R(false);
                z2 = true;
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
            } else {
                leVar = le.a;
                i10 = ((i8 >> 6) & 112) | 6;
                if ((i10 & 14) == 0) {
                    i10 |= j30VarQ.I(leVar) ? 4 : 2;
                }
                if ((i10 & 91) == 18) {
                }
                m64VarW = ob.w(i7, j30VarQ, 0);
                y81Var.invoke(m64VarW, j30VarQ, Integer.valueOf((i4 >> 3) & 112));
                da daVar4 = One.QnHx.e;
                wo1.QnHx qnHx4 = wo1.a;
                ee eeVar3 = new ee(daVar4, true);
                j30VarQ.e(733328855);
                rb2VarC2 = fe.c(daVar, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(eeVar3);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                z = false;
                j30VarQ.x = false;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarC2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -2137368960);
                vh5.a(new ee(One.QnHx.f, false), m64VarW, j30VarQ, 0);
                j30VarQ.R(false);
                j30VarQ.R(false);
                z2 = true;
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
            }
            O.g(j30VarQ, z, z, z2, z);
            j30VarQ.R(z);
            pg2Var5 = pg2Var4;
            i11 = i7;
        } else {
            if (i12 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i13 != 0) {
                i7 = 0;
            } else {
                i7 = i5;
            }
            e40.CQf cQf4 = e40.a;
            i8 = i4 & 14;
            j30VarQ.e(733328855);
            daVar = One.QnHx.a;
            rb2VarC = fe.c(daVar, false, j30VarQ);
            j30VarQ.e(-1323940314);
            jt4Var = r40.e;
            ij0Var = (ij0) j30VarQ.E(jt4Var);
            jt4Var2 = r40.k;
            jy1Var = (jy1) j30VarQ.E(jt4Var2);
            jt4Var3 = r40.o;
            ti5Var = (ti5) j30VarQ.E(jt4Var3);
            a30.e.getClass();
            qnHx = a30.QnHx.b;
            szVarJ = S12N.j(pg2Var3);
            i9 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
            pg2Var4 = pg2Var3;
            jEVar = j30VarQ.a;
            if (!(jEVar instanceof jE)) {
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
            f1 = a30.QnHx.e;
            hH.u(j30VarQ, rb2VarC, f1);
            c0012QnHx = a30.QnHx.d;
            hH.u(j30VarQ, ij0Var, c0012QnHx);
            cQf = a30.QnHx.f;
            hH.u(j30VarQ, jy1Var, cQf);
            nUl = a30.QnHx.g;
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, Integer.valueOf((i9 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-2137368960);
            if (((i9 >> 9) & 14 & 11) == 2) {
                leVar = le.a;
                i10 = ((i8 >> 6) & 112) | 6;
                if ((i10 & 14) == 0) {
                    i10 |= j30VarQ.I(leVar) ? 4 : 2;
                }
                if ((i10 & 91) == 18) {
                }
                m64VarW = ob.w(i7, j30VarQ, 0);
                y81Var.invoke(m64VarW, j30VarQ, Integer.valueOf((i4 >> 3) & 112));
                da daVar5 = One.QnHx.e;
                wo1.QnHx qnHx5 = wo1.a;
                ee eeVar4 = new ee(daVar5, true);
                j30VarQ.e(733328855);
                rb2VarC2 = fe.c(daVar, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(eeVar4);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                z = false;
                j30VarQ.x = false;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarC2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -2137368960);
                vh5.a(new ee(One.QnHx.f, false), m64VarW, j30VarQ, 0);
                j30VarQ.R(false);
                j30VarQ.R(false);
                z2 = true;
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
            } else {
                leVar = le.a;
                i10 = ((i8 >> 6) & 112) | 6;
                if ((i10 & 14) == 0) {
                    i10 |= j30VarQ.I(leVar) ? 4 : 2;
                }
                if ((i10 & 91) == 18) {
                }
                m64VarW = ob.w(i7, j30VarQ, 0);
                y81Var.invoke(m64VarW, j30VarQ, Integer.valueOf((i4 >> 3) & 112));
                da daVar6 = One.QnHx.e;
                wo1.QnHx qnHx6 = wo1.a;
                ee eeVar5 = new ee(daVar6, true);
                j30VarQ.e(733328855);
                rb2VarC2 = fe.c(daVar, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(eeVar5);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                z = false;
                j30VarQ.x = false;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarC2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -2137368960);
                vh5.a(new ee(One.QnHx.f, false), m64VarW, j30VarQ, 0);
                j30VarQ.R(false);
                j30VarQ.R(false);
                z2 = true;
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
            }
            O.g(j30VarQ, z, z, z2, z);
            j30VarQ.R(z);
            pg2Var5 = pg2Var4;
            i11 = i7;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(pg2Var5, i11, y81Var, i2, i3);
    }
}
