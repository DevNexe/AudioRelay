package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lc4 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ jf4 w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(jf4 jf4Var, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = jf4Var;
            this.x = pg2Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            lc4.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0193  */
    /* JADX WARN: Code duplicated, block: B:68:0x0197  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x0258  */
    /* JADX WARN: Code duplicated, block: B:80:0x0264  */
    /* JADX WARN: Code duplicated, block: B:82:0x0268  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void a(jf4 jf4Var, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        pg2.QnHx qnHx;
        pg2 pg2Var3;
        int i4;
        rb2 rb2VarA;
        jt4 jt4Var;
        ij0 ij0Var;
        jt4 jt4Var2;
        jy1 jy1Var;
        jt4 jt4Var3;
        ti5 ti5Var;
        yy1.QnHx qnHx2;
        sz szVarJ;
        int i5;
        jE<?> jEVar;
        a30.QnHx.F1 f1;
        a30.QnHx.C0012QnHx c0012QnHx;
        a30.QnHx.CQf cQf;
        a30.QnHx.NUlFixed nUl;
        xu3 xu3Var;
        int i6;
        mv2 mv2Var;
        rb2 rb2VarA2;
        ij0 ij0Var2;
        jy1 jy1Var2;
        ti5 ti5Var2;
        sz szVarJ2;
        String str;
        boolean z;
        boolean z2;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(1830767778);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(jf4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !j30VarQ.t()) {
                qnHx = pg2.QnHx.w;
                if (i7 != 0) {
                    pg2Var3 = qnHx;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf2 = e40.a;
                i4 = (i3 >> 3) & 14;
                j30VarQ.e(693286680);
                rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, j30VarQ);
                j30VarQ.e(-1323940314);
                jt4Var = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var);
                jt4Var2 = r40.k;
                jy1Var = (jy1) j30VarQ.E(jt4Var2);
                jt4Var3 = r40.o;
                ti5Var = (ti5) j30VarQ.E(jt4Var3);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2Var3);
                i5 = ((((i4 << 3) & 112) << 9) & 7168) | 6;
                jEVar = j30VarQ.a;
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                f1 = a30.QnHx.e;
                hH.u(j30VarQ, rb2VarA, f1);
                c0012QnHx = a30.QnHx.d;
                hH.u(j30VarQ, ij0Var, c0012QnHx);
                cQf = a30.QnHx.f;
                hH.u(j30VarQ, jy1Var, cQf);
                nUl = a30.QnHx.g;
                szVarJ.invoke(sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, Integer.valueOf((i5 >> 3) & 112));
                j30VarQ.e(2058660585);
                j30VarQ.e(-678309503);
                if (((i5 >> 9) & 14 & 11) == 2 || !j30VarQ.t()) {
                    xu3Var = xu3.a;
                    i6 = ((i4 >> 6) & 112) | 6;
                    if ((i6 & 14) == 0) {
                        i6 |= j30VarQ.I(xu3Var) ? 4 : 2;
                    }
                    if ((i6 & 91) == 18 || !j30VarQ.t()) {
                        j30VarQ.e(420052361);
                        mv2Var = jf4Var.c;
                        if (mv2Var != null) {
                            da.CQf cQf3 = One.QnHx.k;
                            wo1.QnHx qnHx3 = wo1.a;
                            bw2.a(mv2Var, new th5(cQf3), j30VarQ, 0, 0);
                            float f = rv0.a;
                            hH.i(new lm4(f, 0.0f, f, 0.0f, 10), j30VarQ, 0);
                            sd5 sd5Var = sd5.a;
                        }
                        j30VarQ.R(false);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(qnHx);
                        if (!(jEVar instanceof jE)) {
                            fp1.c0();
                            throw null;
                        }
                        j30VarQ.s();
                        if (j30VarQ.K) {
                            j30VarQ.l(qnHx2);
                        } else {
                            j30VarQ.A();
                        }
                        j30VarQ.x = false;
                        Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                        j30VarQ.e(-1588534140);
                        str = jf4Var.a;
                        if (str != null) {
                            j55.b(str, null, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).i, j30VarQ, 196608, 0, 32734);
                            hH.i(gm4.g(qnHx, 4), j30VarQ, 6);
                            sd5 sd5Var2 = sd5.a;
                        }
                        j30VarQ.R(false);
                        j55.b(jf4Var.b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30VarQ, 0, 0, 32766);
                        z = false;
                        z2 = true;
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                    } else {
                        j30VarQ.x();
                    }
                    O.g(j30VarQ, z, z, z2, z);
                    j30VarQ.R(z);
                    pg2Var2 = pg2Var3;
                } else {
                    j30VarQ.x();
                }
                z = false;
                z2 = true;
                O.g(j30VarQ, z, z, z2, z);
                j30VarQ.R(z);
                pg2Var2 = pg2Var3;
            } else {
                j30VarQ.x();
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(jf4Var, pg2Var2, i, i2);
        }
        i3 |= 48;
        pg2Var2 = pg2Var;
        if ((i3 & 91) == 18) {
            qnHx = pg2.QnHx.w;
            if (i7 != 0) {
                pg2Var3 = qnHx;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf4 = e40.a;
            i4 = (i3 >> 3) & 14;
            j30VarQ.e(693286680);
            rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, j30VarQ);
            j30VarQ.e(-1323940314);
            jt4Var = r40.e;
            ij0Var = (ij0) j30VarQ.E(jt4Var);
            jt4Var2 = r40.k;
            jy1Var = (jy1) j30VarQ.E(jt4Var2);
            jt4Var3 = r40.o;
            ti5Var = (ti5) j30VarQ.E(jt4Var3);
            a30.e.getClass();
            qnHx2 = a30.QnHx.b;
            szVarJ = S12N.j(pg2Var3);
            i5 = ((((i4 << 3) & 112) << 9) & 7168) | 6;
            jEVar = j30VarQ.a;
            if (!(jEVar instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            f1 = a30.QnHx.e;
            hH.u(j30VarQ, rb2VarA, f1);
            c0012QnHx = a30.QnHx.d;
            hH.u(j30VarQ, ij0Var, c0012QnHx);
            cQf = a30.QnHx.f;
            hH.u(j30VarQ, jy1Var, cQf);
            nUl = a30.QnHx.g;
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, Integer.valueOf((i5 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-678309503);
            if (((i5 >> 9) & 14 & 11) == 2) {
                xu3Var = xu3.a;
                i6 = ((i4 >> 6) & 112) | 6;
                if ((i6 & 14) == 0) {
                    i6 |= j30VarQ.I(xu3Var) ? 4 : 2;
                }
                if ((i6 & 91) == 18) {
                }
                j30VarQ.e(420052361);
                mv2Var = jf4Var.c;
                if (mv2Var != null) {
                    da.CQf cQf5 = One.QnHx.k;
                    wo1.QnHx qnHx4 = wo1.a;
                    bw2.a(mv2Var, new th5(cQf5), j30VarQ, 0, 0);
                    float f2 = rv0.a;
                    hH.i(new lm4(f2, 0.0f, f2, 0.0f, 10), j30VarQ, 0);
                    sd5 sd5Var3 = sd5.a;
                }
                j30VarQ.R(false);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(qnHx);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                j30VarQ.e(-1588534140);
                str = jf4Var.a;
                if (str != null) {
                    j55.b(str, null, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).i, j30VarQ, 196608, 0, 32734);
                    hH.i(gm4.g(qnHx, 4), j30VarQ, 6);
                    sd5 sd5Var4 = sd5.a;
                }
                j30VarQ.R(false);
                j55.b(jf4Var.b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30VarQ, 0, 0, 32766);
                z = false;
                z2 = true;
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
            } else {
                xu3Var = xu3.a;
                i6 = ((i4 >> 6) & 112) | 6;
                if ((i6 & 14) == 0) {
                    i6 |= j30VarQ.I(xu3Var) ? 4 : 2;
                }
                if ((i6 & 91) == 18) {
                }
                j30VarQ.e(420052361);
                mv2Var = jf4Var.c;
                if (mv2Var != null) {
                    da.CQf cQf6 = One.QnHx.k;
                    wo1.QnHx qnHx5 = wo1.a;
                    bw2.a(mv2Var, new th5(cQf6), j30VarQ, 0, 0);
                    float f3 = rv0.a;
                    hH.i(new lm4(f3, 0.0f, f3, 0.0f, 10), j30VarQ, 0);
                    sd5 sd5Var5 = sd5.a;
                }
                j30VarQ.R(false);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(qnHx);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                j30VarQ.e(-1588534140);
                str = jf4Var.a;
                if (str != null) {
                    j55.b(str, null, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).i, j30VarQ, 196608, 0, 32734);
                    hH.i(gm4.g(qnHx, 4), j30VarQ, 6);
                    sd5 sd5Var6 = sd5.a;
                }
                j30VarQ.R(false);
                j55.b(jf4Var.b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30VarQ, 0, 0, 32766);
                z = false;
                z2 = true;
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
            }
            O.g(j30VarQ, z, z, z2, z);
            j30VarQ.R(z);
            pg2Var2 = pg2Var3;
        } else {
            qnHx = pg2.QnHx.w;
            if (i7 != 0) {
                pg2Var3 = qnHx;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf7 = e40.a;
            i4 = (i3 >> 3) & 14;
            j30VarQ.e(693286680);
            rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, j30VarQ);
            j30VarQ.e(-1323940314);
            jt4Var = r40.e;
            ij0Var = (ij0) j30VarQ.E(jt4Var);
            jt4Var2 = r40.k;
            jy1Var = (jy1) j30VarQ.E(jt4Var2);
            jt4Var3 = r40.o;
            ti5Var = (ti5) j30VarQ.E(jt4Var3);
            a30.e.getClass();
            qnHx2 = a30.QnHx.b;
            szVarJ = S12N.j(pg2Var3);
            i5 = ((((i4 << 3) & 112) << 9) & 7168) | 6;
            jEVar = j30VarQ.a;
            if (!(jEVar instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            f1 = a30.QnHx.e;
            hH.u(j30VarQ, rb2VarA, f1);
            c0012QnHx = a30.QnHx.d;
            hH.u(j30VarQ, ij0Var, c0012QnHx);
            cQf = a30.QnHx.f;
            hH.u(j30VarQ, jy1Var, cQf);
            nUl = a30.QnHx.g;
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, Integer.valueOf((i5 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-678309503);
            if (((i5 >> 9) & 14 & 11) == 2) {
                xu3Var = xu3.a;
                i6 = ((i4 >> 6) & 112) | 6;
                if ((i6 & 14) == 0) {
                    i6 |= j30VarQ.I(xu3Var) ? 4 : 2;
                }
                if ((i6 & 91) == 18) {
                }
                j30VarQ.e(420052361);
                mv2Var = jf4Var.c;
                if (mv2Var != null) {
                    da.CQf cQf8 = One.QnHx.k;
                    wo1.QnHx qnHx6 = wo1.a;
                    bw2.a(mv2Var, new th5(cQf8), j30VarQ, 0, 0);
                    float f4 = rv0.a;
                    hH.i(new lm4(f4, 0.0f, f4, 0.0f, 10), j30VarQ, 0);
                    sd5 sd5Var7 = sd5.a;
                }
                j30VarQ.R(false);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(qnHx);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                j30VarQ.e(-1588534140);
                str = jf4Var.a;
                if (str != null) {
                    j55.b(str, null, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).i, j30VarQ, 196608, 0, 32734);
                    hH.i(gm4.g(qnHx, 4), j30VarQ, 6);
                    sd5 sd5Var8 = sd5.a;
                }
                j30VarQ.R(false);
                j55.b(jf4Var.b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30VarQ, 0, 0, 32766);
                z = false;
                z2 = true;
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
            } else {
                xu3Var = xu3.a;
                i6 = ((i4 >> 6) & 112) | 6;
                if ((i6 & 14) == 0) {
                    i6 |= j30VarQ.I(xu3Var) ? 4 : 2;
                }
                if ((i6 & 91) == 18) {
                }
                j30VarQ.e(420052361);
                mv2Var = jf4Var.c;
                if (mv2Var != null) {
                    da.CQf cQf9 = One.QnHx.k;
                    wo1.QnHx qnHx7 = wo1.a;
                    bw2.a(mv2Var, new th5(cQf9), j30VarQ, 0, 0);
                    float f5 = rv0.a;
                    hH.i(new lm4(f5, 0.0f, f5, 0.0f, 10), j30VarQ, 0);
                    sd5 sd5Var9 = sd5.a;
                }
                j30VarQ.R(false);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(qnHx);
                if (!(jEVar instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                j30VarQ.e(-1588534140);
                str = jf4Var.a;
                if (str != null) {
                    j55.b(str, null, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).i, j30VarQ, 196608, 0, 32734);
                    hH.i(gm4.g(qnHx, 4), j30VarQ, 6);
                    sd5 sd5Var10 = sd5.a;
                }
                j30VarQ.R(false);
                j55.b(jf4Var.b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30VarQ, 0, 0, 32766);
                z = false;
                z2 = true;
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
            }
            O.g(j30VarQ, z, z, z2, z);
            j30VarQ.R(z);
            pg2Var2 = pg2Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(jf4Var, pg2Var2, i, i2);
    }
}
