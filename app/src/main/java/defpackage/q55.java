package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q55 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> A;
        public final /* synthetic */ h81<sd5> B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ String y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(pg2 pg2Var, String str, String str2, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, h81<sd5> h81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = str;
            this.y = str2;
            this.z = x81Var;
            this.A = x81Var2;
            this.B = h81Var;
            this.C = i;
            this.D = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            q55.b(this.w, this.x, this.y, this.z, this.A, this.B, g30Var, this.C | 1, this.D);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public final /* synthetic */ h81<sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(h81<sd5> h81Var) {
            super(0);
            this.w = h81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            h81<sd5> h81Var = this.w;
            if (h81Var != null) {
                h81Var.invoke();
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3, h81<sd5> h81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = x81Var;
            this.y = x81Var2;
            this.z = x81Var3;
            this.A = h81Var;
            this.B = i;
            this.C = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            q55.a(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1, this.C);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ int x;
        public final /* synthetic */ String y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(String str, int i, String str2) {
            super(2);
            this.w = str;
            this.x = i;
            this.y = str2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                jt4 jt4Var = sc5.a;
                w55 w55Var = ((rc5) g30Var2.E(jt4Var)).j;
                x41 x41Var = x41.B;
                String str = this.w;
                int i = this.x;
                j55.b(str, null, 0L, 0L, null, x41Var, null, 0L, null, null, 0L, 0, false, 0, null, w55Var, g30Var2, ((i >> 3) & 14) | 196608, 0, 32734);
                String str2 = this.y;
                if (str2 != null) {
                    float f = 8;
                    wo1.QnHx qnHx = wo1.a;
                    hH.i(new lm4(0.0f, f, 0.0f, f, 5), g30Var2, 6);
                    j55.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(jt4Var)).j, g30Var2, (i >> 6) & 14, 0, 32766);
                }
            }
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:108:0x0245  */
    /* JADX WARN: Code duplicated, block: B:113:0x026a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0279  */
    /* JADX WARN: Code duplicated, block: B:117:0x027e  */
    /* JADX WARN: Code duplicated, block: B:119:0x029b  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0148  */
    /* JADX WARN: Code duplicated, block: B:89:0x014c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0193  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b6  */
    /* JADX WARN: Instruction removed from duplicated block: B:117:0x027e, please report this as an issue */
    public static final void a(pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3, h81<sd5> h81Var, g30 g30Var, int i, int i2) {
        pg2 pg2Var2;
        int i3;
        int i4;
        x81<? super g30, ? super Integer, sd5> x81Var4;
        int i5;
        int i6;
        x81<? super g30, ? super Integer, sd5> x81Var5;
        int i7;
        int i8;
        h81<sd5> h81Var2;
        int i9;
        pg2.QnHx qnHx;
        x81<? super g30, ? super Integer, sd5> x81Var6;
        x81<? super g30, ? super Integer, sd5> x81Var7;
        h81<sd5> h81Var3;
        boolean z;
        boolean zI;
        Object objB0;
        float f;
        rb2 rb2VarA;
        jt4 jt4Var;
        ij0 ij0Var;
        jt4 jt4Var2;
        jy1 jy1Var;
        jt4 jt4Var3;
        pg2 pg2Var3;
        ti5 ti5Var;
        yy1.QnHx qnHx2;
        sz szVarJ;
        jE<?> jEVar;
        a30.QnHx.F1 f1;
        a30.QnHx.C0012QnHx c0012QnHx;
        a30.QnHx.CQf cQf;
        a30.QnHx.NUlFixed nUl;
        h81<sd5> h81Var4;
        boolean z2;
        rb2 rb2VarA2;
        ij0 ij0Var2;
        jy1 jy1Var2;
        ti5 ti5Var2;
        sz szVarJ2;
        x81<? super g30, ? super Integer, sd5> x81Var8;
        x81<? super g30, ? super Integer, sd5> x81Var9;
        h81<sd5> h81Var5;
        x81<? super g30, ? super Integer, sd5> x81Var10;
        pg2 pg2Var4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-2497279);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            pg2Var2 = pg2Var;
        } else if ((i & 14) == 0) {
            pg2Var2 = pg2Var;
            i3 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i;
        } else {
            pg2Var2 = pg2Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= j30VarQ.I(x81Var) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    x81Var4 = x81Var2;
                    if (j30VarQ.I(x81Var4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        x81Var5 = x81Var3;
                        if (j30VarQ.I(x81Var5)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            h81Var2 = h81Var;
                            if (j30VarQ.I(h81Var2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((46811 & i3) == 9362 || !j30VarQ.t()) {
                            qnHx = pg2.QnHx.w;
                            if (i10 != 0) {
                                pg2Var2 = qnHx;
                            }
                            if (i4 != 0) {
                                x81Var6 = null;
                            } else {
                                x81Var6 = x81Var4;
                            }
                            if (i6 != 0) {
                                x81Var7 = null;
                            } else {
                                x81Var7 = x81Var5;
                            }
                            if (i8 != 0) {
                                h81Var3 = null;
                            } else {
                                h81Var3 = h81Var2;
                            }
                            e40.CQf cQf2 = e40.a;
                            if (h81Var3 != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var3);
                            objB0 = j30VarQ.b0();
                            if (zI || objB0 == g30.QnHx.a) {
                                objB0 = new F1(h81Var3);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            f = 16;
                            pg2 pg2VarT = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                            da.CQf cQf3 = One.QnHx.k;
                            j30VarQ.e(693286680);
                            rb2VarA = uu3.a(CZ9P.a, cQf3, j30VarQ);
                            j30VarQ.e(-1323940314);
                            jt4Var = r40.e;
                            ij0Var = (ij0) j30VarQ.E(jt4Var);
                            jt4Var2 = r40.k;
                            jy1Var = (jy1) j30VarQ.E(jt4Var2);
                            jt4Var3 = r40.o;
                            pg2Var3 = pg2Var2;
                            ti5Var = (ti5) j30VarQ.E(jt4Var3);
                            a30.e.getClass();
                            qnHx2 = a30.QnHx.b;
                            szVarJ = S12N.j(pg2VarT);
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
                            h81Var4 = h81Var3;
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            j30VarQ.e(-2025531908);
                            if (x81Var6 != null) {
                                x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                                pq4.a(f, j30VarQ, 6);
                                sd5 sd5Var = sd5.a;
                            }
                            j30VarQ.R(false);
                            if (1.0f > 0.0d) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                            }
                            wo1.QnHx qnHx3 = wo1.a;
                            mz1 mz1Var = new mz1(1.0f, true);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(mz1Var);
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
                            x81Var8 = x81Var7;
                            Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                            fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            if (x81Var8 != null) {
                                x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                                pq4.a(f, j30VarQ, 6);
                                sd5 sd5Var2 = sd5.a;
                            }
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            x81Var9 = x81Var6;
                            h81Var5 = h81Var4;
                            x81Var10 = x81Var8;
                            pg2Var4 = pg2Var3;
                        } else {
                            j30VarQ.x();
                            pg2Var4 = pg2Var2;
                            x81Var9 = x81Var4;
                            x81Var10 = x81Var5;
                            h81Var5 = h81Var2;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
                    }
                    i3 |= 24576;
                    h81Var2 = h81Var;
                    if ((46811 & i3) == 9362) {
                        qnHx = pg2.QnHx.w;
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i6 != 0) {
                            x81Var7 = null;
                        } else {
                            x81Var7 = x81Var5;
                        }
                        if (i8 != 0) {
                            h81Var3 = null;
                        } else {
                            h81Var3 = h81Var2;
                        }
                        e40.CQf cQf4 = e40.a;
                        if (h81Var3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var3);
                        objB0 = j30VarQ.b0();
                        if (zI) {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        f = 16;
                        pg2 pg2VarT2 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                        da.CQf cQf5 = One.QnHx.k;
                        j30VarQ.e(693286680);
                        rb2VarA = uu3.a(CZ9P.a, cQf5, j30VarQ);
                        j30VarQ.e(-1323940314);
                        jt4Var = r40.e;
                        ij0Var = (ij0) j30VarQ.E(jt4Var);
                        jt4Var2 = r40.k;
                        jy1Var = (jy1) j30VarQ.E(jt4Var2);
                        jt4Var3 = r40.o;
                        pg2Var3 = pg2Var2;
                        ti5Var = (ti5) j30VarQ.E(jt4Var3);
                        a30.e.getClass();
                        qnHx2 = a30.QnHx.b;
                        szVarJ = S12N.j(pg2VarT2);
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
                        h81Var4 = h81Var3;
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        j30VarQ.e(-2025531908);
                        if (x81Var6 != null) {
                            x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var3 = sd5.a;
                        }
                        j30VarQ.R(false);
                        if (1.0f > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                        }
                        wo1.QnHx qnHx4 = wo1.a;
                        mz1 mz1Var2 = new mz1(1.0f, true);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(mz1Var2);
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
                        x81Var8 = x81Var7;
                        Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                        fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        if (x81Var8 != null) {
                            x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var4 = sd5.a;
                        }
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        x81Var9 = x81Var6;
                        h81Var5 = h81Var4;
                        x81Var10 = x81Var8;
                        pg2Var4 = pg2Var3;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i6 != 0) {
                            x81Var7 = null;
                        } else {
                            x81Var7 = x81Var5;
                        }
                        if (i8 != 0) {
                            h81Var3 = null;
                        } else {
                            h81Var3 = h81Var2;
                        }
                        e40.CQf cQf6 = e40.a;
                        if (h81Var3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var3);
                        objB0 = j30VarQ.b0();
                        if (zI) {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        f = 16;
                        pg2 pg2VarT3 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                        da.CQf cQf7 = One.QnHx.k;
                        j30VarQ.e(693286680);
                        rb2VarA = uu3.a(CZ9P.a, cQf7, j30VarQ);
                        j30VarQ.e(-1323940314);
                        jt4Var = r40.e;
                        ij0Var = (ij0) j30VarQ.E(jt4Var);
                        jt4Var2 = r40.k;
                        jy1Var = (jy1) j30VarQ.E(jt4Var2);
                        jt4Var3 = r40.o;
                        pg2Var3 = pg2Var2;
                        ti5Var = (ti5) j30VarQ.E(jt4Var3);
                        a30.e.getClass();
                        qnHx2 = a30.QnHx.b;
                        szVarJ = S12N.j(pg2VarT3);
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
                        h81Var4 = h81Var3;
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        j30VarQ.e(-2025531908);
                        if (x81Var6 != null) {
                            x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var5 = sd5.a;
                        }
                        j30VarQ.R(false);
                        if (1.0f > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                        }
                        wo1.QnHx qnHx5 = wo1.a;
                        mz1 mz1Var3 = new mz1(1.0f, true);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(mz1Var3);
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
                        x81Var8 = x81Var7;
                        Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                        fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        if (x81Var8 != null) {
                            x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var6 = sd5.a;
                        }
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        x81Var9 = x81Var6;
                        h81Var5 = h81Var4;
                        x81Var10 = x81Var8;
                        pg2Var4 = pg2Var3;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
                }
                i3 |= 3072;
                x81Var5 = x81Var3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        h81Var2 = h81Var;
                        if (j30VarQ.I(h81Var2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((46811 & i3) == 9362) {
                        qnHx = pg2.QnHx.w;
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i6 != 0) {
                            x81Var7 = null;
                        } else {
                            x81Var7 = x81Var5;
                        }
                        if (i8 != 0) {
                            h81Var3 = null;
                        } else {
                            h81Var3 = h81Var2;
                        }
                        e40.CQf cQf8 = e40.a;
                        if (h81Var3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var3);
                        objB0 = j30VarQ.b0();
                        if (zI) {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        f = 16;
                        pg2 pg2VarT4 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                        da.CQf cQf9 = One.QnHx.k;
                        j30VarQ.e(693286680);
                        rb2VarA = uu3.a(CZ9P.a, cQf9, j30VarQ);
                        j30VarQ.e(-1323940314);
                        jt4Var = r40.e;
                        ij0Var = (ij0) j30VarQ.E(jt4Var);
                        jt4Var2 = r40.k;
                        jy1Var = (jy1) j30VarQ.E(jt4Var2);
                        jt4Var3 = r40.o;
                        pg2Var3 = pg2Var2;
                        ti5Var = (ti5) j30VarQ.E(jt4Var3);
                        a30.e.getClass();
                        qnHx2 = a30.QnHx.b;
                        szVarJ = S12N.j(pg2VarT4);
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
                        h81Var4 = h81Var3;
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        j30VarQ.e(-2025531908);
                        if (x81Var6 != null) {
                            x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var7 = sd5.a;
                        }
                        j30VarQ.R(false);
                        if (1.0f > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                        }
                        wo1.QnHx qnHx6 = wo1.a;
                        mz1 mz1Var4 = new mz1(1.0f, true);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(mz1Var4);
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
                        x81Var8 = x81Var7;
                        Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                        fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        if (x81Var8 != null) {
                            x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var8 = sd5.a;
                        }
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        x81Var9 = x81Var6;
                        h81Var5 = h81Var4;
                        x81Var10 = x81Var8;
                        pg2Var4 = pg2Var3;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i6 != 0) {
                            x81Var7 = null;
                        } else {
                            x81Var7 = x81Var5;
                        }
                        if (i8 != 0) {
                            h81Var3 = null;
                        } else {
                            h81Var3 = h81Var2;
                        }
                        e40.CQf cQf10 = e40.a;
                        if (h81Var3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var3);
                        objB0 = j30VarQ.b0();
                        if (zI) {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        f = 16;
                        pg2 pg2VarT5 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                        da.CQf cQf11 = One.QnHx.k;
                        j30VarQ.e(693286680);
                        rb2VarA = uu3.a(CZ9P.a, cQf11, j30VarQ);
                        j30VarQ.e(-1323940314);
                        jt4Var = r40.e;
                        ij0Var = (ij0) j30VarQ.E(jt4Var);
                        jt4Var2 = r40.k;
                        jy1Var = (jy1) j30VarQ.E(jt4Var2);
                        jt4Var3 = r40.o;
                        pg2Var3 = pg2Var2;
                        ti5Var = (ti5) j30VarQ.E(jt4Var3);
                        a30.e.getClass();
                        qnHx2 = a30.QnHx.b;
                        szVarJ = S12N.j(pg2VarT5);
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
                        h81Var4 = h81Var3;
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        j30VarQ.e(-2025531908);
                        if (x81Var6 != null) {
                            x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var9 = sd5.a;
                        }
                        j30VarQ.R(false);
                        if (1.0f > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                        }
                        wo1.QnHx qnHx7 = wo1.a;
                        mz1 mz1Var5 = new mz1(1.0f, true);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(mz1Var5);
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
                        x81Var8 = x81Var7;
                        Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                        fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        if (x81Var8 != null) {
                            x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var10 = sd5.a;
                        }
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        x81Var9 = x81Var6;
                        h81Var5 = h81Var4;
                        x81Var10 = x81Var8;
                        pg2Var4 = pg2Var3;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
                }
                i3 |= 24576;
                h81Var2 = h81Var;
                if ((46811 & i3) == 9362) {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf12 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT6 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf13 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf13, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT6);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var11 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx8 = wo1.a;
                    mz1 mz1Var6 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var6);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var12 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf14 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT7 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf15 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf15, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT7);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var13 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx9 = wo1.a;
                    mz1 mz1Var7 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var7);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var14 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
            }
            i3 |= 384;
            x81Var4 = x81Var2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    x81Var5 = x81Var3;
                    if (j30VarQ.I(x81Var5)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        h81Var2 = h81Var;
                        if (j30VarQ.I(h81Var2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((46811 & i3) == 9362) {
                        qnHx = pg2.QnHx.w;
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i6 != 0) {
                            x81Var7 = null;
                        } else {
                            x81Var7 = x81Var5;
                        }
                        if (i8 != 0) {
                            h81Var3 = null;
                        } else {
                            h81Var3 = h81Var2;
                        }
                        e40.CQf cQf16 = e40.a;
                        if (h81Var3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var3);
                        objB0 = j30VarQ.b0();
                        if (zI) {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        f = 16;
                        pg2 pg2VarT8 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                        da.CQf cQf17 = One.QnHx.k;
                        j30VarQ.e(693286680);
                        rb2VarA = uu3.a(CZ9P.a, cQf17, j30VarQ);
                        j30VarQ.e(-1323940314);
                        jt4Var = r40.e;
                        ij0Var = (ij0) j30VarQ.E(jt4Var);
                        jt4Var2 = r40.k;
                        jy1Var = (jy1) j30VarQ.E(jt4Var2);
                        jt4Var3 = r40.o;
                        pg2Var3 = pg2Var2;
                        ti5Var = (ti5) j30VarQ.E(jt4Var3);
                        a30.e.getClass();
                        qnHx2 = a30.QnHx.b;
                        szVarJ = S12N.j(pg2VarT8);
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
                        h81Var4 = h81Var3;
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        j30VarQ.e(-2025531908);
                        if (x81Var6 != null) {
                            x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var15 = sd5.a;
                        }
                        j30VarQ.R(false);
                        if (1.0f > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                        }
                        wo1.QnHx qnHx10 = wo1.a;
                        mz1 mz1Var8 = new mz1(1.0f, true);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(mz1Var8);
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
                        x81Var8 = x81Var7;
                        Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                        fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        if (x81Var8 != null) {
                            x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var16 = sd5.a;
                        }
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        x81Var9 = x81Var6;
                        h81Var5 = h81Var4;
                        x81Var10 = x81Var8;
                        pg2Var4 = pg2Var3;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i6 != 0) {
                            x81Var7 = null;
                        } else {
                            x81Var7 = x81Var5;
                        }
                        if (i8 != 0) {
                            h81Var3 = null;
                        } else {
                            h81Var3 = h81Var2;
                        }
                        e40.CQf cQf18 = e40.a;
                        if (h81Var3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var3);
                        objB0 = j30VarQ.b0();
                        if (zI) {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        f = 16;
                        pg2 pg2VarT9 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                        da.CQf cQf19 = One.QnHx.k;
                        j30VarQ.e(693286680);
                        rb2VarA = uu3.a(CZ9P.a, cQf19, j30VarQ);
                        j30VarQ.e(-1323940314);
                        jt4Var = r40.e;
                        ij0Var = (ij0) j30VarQ.E(jt4Var);
                        jt4Var2 = r40.k;
                        jy1Var = (jy1) j30VarQ.E(jt4Var2);
                        jt4Var3 = r40.o;
                        pg2Var3 = pg2Var2;
                        ti5Var = (ti5) j30VarQ.E(jt4Var3);
                        a30.e.getClass();
                        qnHx2 = a30.QnHx.b;
                        szVarJ = S12N.j(pg2VarT9);
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
                        h81Var4 = h81Var3;
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        j30VarQ.e(-2025531908);
                        if (x81Var6 != null) {
                            x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var17 = sd5.a;
                        }
                        j30VarQ.R(false);
                        if (1.0f > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                        }
                        wo1.QnHx qnHx11 = wo1.a;
                        mz1 mz1Var9 = new mz1(1.0f, true);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(mz1Var9);
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
                        x81Var8 = x81Var7;
                        Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                        fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        if (x81Var8 != null) {
                            x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var18 = sd5.a;
                        }
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        x81Var9 = x81Var6;
                        h81Var5 = h81Var4;
                        x81Var10 = x81Var8;
                        pg2Var4 = pg2Var3;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
                }
                i3 |= 24576;
                h81Var2 = h81Var;
                if ((46811 & i3) == 9362) {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf110 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT10 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf111 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf111, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT10);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var19 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx12 = wo1.a;
                    mz1 mz1Var10 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var10);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var110 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf112 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT11 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf113 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf113, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT11);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var111 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx13 = wo1.a;
                    mz1 mz1Var11 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var11);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var112 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
            }
            i3 |= 3072;
            x81Var5 = x81Var3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    h81Var2 = h81Var;
                    if (j30VarQ.I(h81Var2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((46811 & i3) == 9362) {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf114 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT12 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf115 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf115, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT12);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var113 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx14 = wo1.a;
                    mz1 mz1Var12 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var12);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var114 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf116 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT13 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf117 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf117, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT13);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var115 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx15 = wo1.a;
                    mz1 mz1Var13 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var13);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var116 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
            }
            i3 |= 24576;
            h81Var2 = h81Var;
            if ((46811 & i3) == 9362) {
                qnHx = pg2.QnHx.w;
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i6 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var5;
                }
                if (i8 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                e40.CQf cQf118 = e40.a;
                if (h81Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var3);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                f = 16;
                pg2 pg2VarT14 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                da.CQf cQf119 = One.QnHx.k;
                j30VarQ.e(693286680);
                rb2VarA = uu3.a(CZ9P.a, cQf119, j30VarQ);
                j30VarQ.e(-1323940314);
                jt4Var = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var);
                jt4Var2 = r40.k;
                jy1Var = (jy1) j30VarQ.E(jt4Var2);
                jt4Var3 = r40.o;
                pg2Var3 = pg2Var2;
                ti5Var = (ti5) j30VarQ.E(jt4Var3);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarT14);
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
                h81Var4 = h81Var3;
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                j30VarQ.e(-2025531908);
                if (x81Var6 != null) {
                    x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var117 = sd5.a;
                }
                j30VarQ.R(false);
                if (1.0f > 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx16 = wo1.a;
                mz1 mz1Var14 = new mz1(1.0f, true);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(mz1Var14);
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
                x81Var8 = x81Var7;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                if (x81Var8 != null) {
                    x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var118 = sd5.a;
                }
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                x81Var9 = x81Var6;
                h81Var5 = h81Var4;
                x81Var10 = x81Var8;
                pg2Var4 = pg2Var3;
            } else {
                qnHx = pg2.QnHx.w;
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i6 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var5;
                }
                if (i8 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                e40.CQf cQf1110 = e40.a;
                if (h81Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var3);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                f = 16;
                pg2 pg2VarT15 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                da.CQf cQf1111 = One.QnHx.k;
                j30VarQ.e(693286680);
                rb2VarA = uu3.a(CZ9P.a, cQf1111, j30VarQ);
                j30VarQ.e(-1323940314);
                jt4Var = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var);
                jt4Var2 = r40.k;
                jy1Var = (jy1) j30VarQ.E(jt4Var2);
                jt4Var3 = r40.o;
                pg2Var3 = pg2Var2;
                ti5Var = (ti5) j30VarQ.E(jt4Var3);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarT15);
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
                h81Var4 = h81Var3;
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                j30VarQ.e(-2025531908);
                if (x81Var6 != null) {
                    x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var119 = sd5.a;
                }
                j30VarQ.R(false);
                if (1.0f > 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx17 = wo1.a;
                mz1 mz1Var15 = new mz1(1.0f, true);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(mz1Var15);
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
                x81Var8 = x81Var7;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                if (x81Var8 != null) {
                    x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var1110 = sd5.a;
                }
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                x81Var9 = x81Var6;
                h81Var5 = h81Var4;
                x81Var10 = x81Var8;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                x81Var4 = x81Var2;
                if (j30VarQ.I(x81Var4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    x81Var5 = x81Var3;
                    if (j30VarQ.I(x81Var5)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        h81Var2 = h81Var;
                        if (j30VarQ.I(h81Var2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((46811 & i3) == 9362) {
                        qnHx = pg2.QnHx.w;
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i6 != 0) {
                            x81Var7 = null;
                        } else {
                            x81Var7 = x81Var5;
                        }
                        if (i8 != 0) {
                            h81Var3 = null;
                        } else {
                            h81Var3 = h81Var2;
                        }
                        e40.CQf cQf1112 = e40.a;
                        if (h81Var3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var3);
                        objB0 = j30VarQ.b0();
                        if (zI) {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        f = 16;
                        pg2 pg2VarT16 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                        da.CQf cQf1113 = One.QnHx.k;
                        j30VarQ.e(693286680);
                        rb2VarA = uu3.a(CZ9P.a, cQf1113, j30VarQ);
                        j30VarQ.e(-1323940314);
                        jt4Var = r40.e;
                        ij0Var = (ij0) j30VarQ.E(jt4Var);
                        jt4Var2 = r40.k;
                        jy1Var = (jy1) j30VarQ.E(jt4Var2);
                        jt4Var3 = r40.o;
                        pg2Var3 = pg2Var2;
                        ti5Var = (ti5) j30VarQ.E(jt4Var3);
                        a30.e.getClass();
                        qnHx2 = a30.QnHx.b;
                        szVarJ = S12N.j(pg2VarT16);
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
                        h81Var4 = h81Var3;
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        j30VarQ.e(-2025531908);
                        if (x81Var6 != null) {
                            x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var1111 = sd5.a;
                        }
                        j30VarQ.R(false);
                        if (1.0f > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                        }
                        wo1.QnHx qnHx18 = wo1.a;
                        mz1 mz1Var16 = new mz1(1.0f, true);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(mz1Var16);
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
                        x81Var8 = x81Var7;
                        Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                        fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        if (x81Var8 != null) {
                            x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var1112 = sd5.a;
                        }
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        x81Var9 = x81Var6;
                        h81Var5 = h81Var4;
                        x81Var10 = x81Var8;
                        pg2Var4 = pg2Var3;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i6 != 0) {
                            x81Var7 = null;
                        } else {
                            x81Var7 = x81Var5;
                        }
                        if (i8 != 0) {
                            h81Var3 = null;
                        } else {
                            h81Var3 = h81Var2;
                        }
                        e40.CQf cQf1114 = e40.a;
                        if (h81Var3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var3);
                        objB0 = j30VarQ.b0();
                        if (zI) {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var3);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        f = 16;
                        pg2 pg2VarT17 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                        da.CQf cQf1115 = One.QnHx.k;
                        j30VarQ.e(693286680);
                        rb2VarA = uu3.a(CZ9P.a, cQf1115, j30VarQ);
                        j30VarQ.e(-1323940314);
                        jt4Var = r40.e;
                        ij0Var = (ij0) j30VarQ.E(jt4Var);
                        jt4Var2 = r40.k;
                        jy1Var = (jy1) j30VarQ.E(jt4Var2);
                        jt4Var3 = r40.o;
                        pg2Var3 = pg2Var2;
                        ti5Var = (ti5) j30VarQ.E(jt4Var3);
                        a30.e.getClass();
                        qnHx2 = a30.QnHx.b;
                        szVarJ = S12N.j(pg2VarT17);
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
                        h81Var4 = h81Var3;
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        j30VarQ.e(-2025531908);
                        if (x81Var6 != null) {
                            x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var1113 = sd5.a;
                        }
                        j30VarQ.R(false);
                        if (1.0f > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                        }
                        wo1.QnHx qnHx19 = wo1.a;
                        mz1 mz1Var17 = new mz1(1.0f, true);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(mz1Var17);
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
                        x81Var8 = x81Var7;
                        Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                        fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        if (x81Var8 != null) {
                            x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                            pq4.a(f, j30VarQ, 6);
                            sd5 sd5Var1114 = sd5.a;
                        }
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        x81Var9 = x81Var6;
                        h81Var5 = h81Var4;
                        x81Var10 = x81Var8;
                        pg2Var4 = pg2Var3;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
                }
                i3 |= 24576;
                h81Var2 = h81Var;
                if ((46811 & i3) == 9362) {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf1116 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT18 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf1117 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf1117, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT18);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var1115 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx110 = wo1.a;
                    mz1 mz1Var18 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var18);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var1116 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf1118 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT19 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf1119 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf1119, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT19);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var1117 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx111 = wo1.a;
                    mz1 mz1Var19 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var19);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var1118 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
            }
            i3 |= 3072;
            x81Var5 = x81Var3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    h81Var2 = h81Var;
                    if (j30VarQ.I(h81Var2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((46811 & i3) == 9362) {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf11110 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT110 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf11111 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf11111, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT110);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var1119 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx112 = wo1.a;
                    mz1 mz1Var110 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var110);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var11110 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf11112 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT111 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf11113 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf11113, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT111);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var11111 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx113 = wo1.a;
                    mz1 mz1Var111 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var111);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var11112 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
            }
            i3 |= 24576;
            h81Var2 = h81Var;
            if ((46811 & i3) == 9362) {
                qnHx = pg2.QnHx.w;
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i6 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var5;
                }
                if (i8 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                e40.CQf cQf11114 = e40.a;
                if (h81Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var3);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                f = 16;
                pg2 pg2VarT112 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                da.CQf cQf11115 = One.QnHx.k;
                j30VarQ.e(693286680);
                rb2VarA = uu3.a(CZ9P.a, cQf11115, j30VarQ);
                j30VarQ.e(-1323940314);
                jt4Var = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var);
                jt4Var2 = r40.k;
                jy1Var = (jy1) j30VarQ.E(jt4Var2);
                jt4Var3 = r40.o;
                pg2Var3 = pg2Var2;
                ti5Var = (ti5) j30VarQ.E(jt4Var3);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarT112);
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
                h81Var4 = h81Var3;
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                j30VarQ.e(-2025531908);
                if (x81Var6 != null) {
                    x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var11113 = sd5.a;
                }
                j30VarQ.R(false);
                if (1.0f > 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx114 = wo1.a;
                mz1 mz1Var112 = new mz1(1.0f, true);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(mz1Var112);
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
                x81Var8 = x81Var7;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                if (x81Var8 != null) {
                    x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var11114 = sd5.a;
                }
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                x81Var9 = x81Var6;
                h81Var5 = h81Var4;
                x81Var10 = x81Var8;
                pg2Var4 = pg2Var3;
            } else {
                qnHx = pg2.QnHx.w;
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i6 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var5;
                }
                if (i8 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                e40.CQf cQf11116 = e40.a;
                if (h81Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var3);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                f = 16;
                pg2 pg2VarT113 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                da.CQf cQf11117 = One.QnHx.k;
                j30VarQ.e(693286680);
                rb2VarA = uu3.a(CZ9P.a, cQf11117, j30VarQ);
                j30VarQ.e(-1323940314);
                jt4Var = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var);
                jt4Var2 = r40.k;
                jy1Var = (jy1) j30VarQ.E(jt4Var2);
                jt4Var3 = r40.o;
                pg2Var3 = pg2Var2;
                ti5Var = (ti5) j30VarQ.E(jt4Var3);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarT113);
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
                h81Var4 = h81Var3;
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                j30VarQ.e(-2025531908);
                if (x81Var6 != null) {
                    x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var11115 = sd5.a;
                }
                j30VarQ.R(false);
                if (1.0f > 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx115 = wo1.a;
                mz1 mz1Var113 = new mz1(1.0f, true);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(mz1Var113);
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
                x81Var8 = x81Var7;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                if (x81Var8 != null) {
                    x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var11116 = sd5.a;
                }
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                x81Var9 = x81Var6;
                h81Var5 = h81Var4;
                x81Var10 = x81Var8;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
        }
        i3 |= 384;
        x81Var4 = x81Var2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                x81Var5 = x81Var3;
                if (j30VarQ.I(x81Var5)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    h81Var2 = h81Var;
                    if (j30VarQ.I(h81Var2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((46811 & i3) == 9362) {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf11118 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT114 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf11119 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf11119, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT114);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var11117 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx116 = wo1.a;
                    mz1 mz1Var114 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var114);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var11118 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i6 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var5;
                    }
                    if (i8 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    e40.CQf cQf111110 = e40.a;
                    if (h81Var3 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var3);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    f = 16;
                    pg2 pg2VarT115 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                    da.CQf cQf111111 = One.QnHx.k;
                    j30VarQ.e(693286680);
                    rb2VarA = uu3.a(CZ9P.a, cQf111111, j30VarQ);
                    j30VarQ.e(-1323940314);
                    jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    jt4Var2 = r40.k;
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    jt4Var3 = r40.o;
                    pg2Var3 = pg2Var2;
                    ti5Var = (ti5) j30VarQ.E(jt4Var3);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarT115);
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
                    h81Var4 = h81Var3;
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    j30VarQ.e(-2025531908);
                    if (x81Var6 != null) {
                        x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var11119 = sd5.a;
                    }
                    j30VarQ.R(false);
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                    }
                    wo1.QnHx qnHx117 = wo1.a;
                    mz1 mz1Var115 = new mz1(1.0f, true);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(mz1Var115);
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
                    x81Var8 = x81Var7;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    if (x81Var8 != null) {
                        x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                        pq4.a(f, j30VarQ, 6);
                        sd5 sd5Var111110 = sd5.a;
                    }
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    x81Var9 = x81Var6;
                    h81Var5 = h81Var4;
                    x81Var10 = x81Var8;
                    pg2Var4 = pg2Var3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
            }
            i3 |= 24576;
            h81Var2 = h81Var;
            if ((46811 & i3) == 9362) {
                qnHx = pg2.QnHx.w;
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i6 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var5;
                }
                if (i8 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                e40.CQf cQf111112 = e40.a;
                if (h81Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var3);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                f = 16;
                pg2 pg2VarT116 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                da.CQf cQf111113 = One.QnHx.k;
                j30VarQ.e(693286680);
                rb2VarA = uu3.a(CZ9P.a, cQf111113, j30VarQ);
                j30VarQ.e(-1323940314);
                jt4Var = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var);
                jt4Var2 = r40.k;
                jy1Var = (jy1) j30VarQ.E(jt4Var2);
                jt4Var3 = r40.o;
                pg2Var3 = pg2Var2;
                ti5Var = (ti5) j30VarQ.E(jt4Var3);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarT116);
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
                h81Var4 = h81Var3;
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                j30VarQ.e(-2025531908);
                if (x81Var6 != null) {
                    x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var111111 = sd5.a;
                }
                j30VarQ.R(false);
                if (1.0f > 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx118 = wo1.a;
                mz1 mz1Var116 = new mz1(1.0f, true);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(mz1Var116);
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
                x81Var8 = x81Var7;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                if (x81Var8 != null) {
                    x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var111112 = sd5.a;
                }
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                x81Var9 = x81Var6;
                h81Var5 = h81Var4;
                x81Var10 = x81Var8;
                pg2Var4 = pg2Var3;
            } else {
                qnHx = pg2.QnHx.w;
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i6 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var5;
                }
                if (i8 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                e40.CQf cQf111114 = e40.a;
                if (h81Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var3);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                f = 16;
                pg2 pg2VarT117 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                da.CQf cQf111115 = One.QnHx.k;
                j30VarQ.e(693286680);
                rb2VarA = uu3.a(CZ9P.a, cQf111115, j30VarQ);
                j30VarQ.e(-1323940314);
                jt4Var = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var);
                jt4Var2 = r40.k;
                jy1Var = (jy1) j30VarQ.E(jt4Var2);
                jt4Var3 = r40.o;
                pg2Var3 = pg2Var2;
                ti5Var = (ti5) j30VarQ.E(jt4Var3);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarT117);
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
                h81Var4 = h81Var3;
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                j30VarQ.e(-2025531908);
                if (x81Var6 != null) {
                    x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var111113 = sd5.a;
                }
                j30VarQ.R(false);
                if (1.0f > 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx119 = wo1.a;
                mz1 mz1Var117 = new mz1(1.0f, true);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(mz1Var117);
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
                x81Var8 = x81Var7;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                if (x81Var8 != null) {
                    x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var111114 = sd5.a;
                }
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                x81Var9 = x81Var6;
                h81Var5 = h81Var4;
                x81Var10 = x81Var8;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
        }
        i3 |= 3072;
        x81Var5 = x81Var3;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((57344 & i) == 0) {
                h81Var2 = h81Var;
                if (j30VarQ.I(h81Var2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((46811 & i3) == 9362) {
                qnHx = pg2.QnHx.w;
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i6 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var5;
                }
                if (i8 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                e40.CQf cQf111116 = e40.a;
                if (h81Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var3);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                f = 16;
                pg2 pg2VarT118 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                da.CQf cQf111117 = One.QnHx.k;
                j30VarQ.e(693286680);
                rb2VarA = uu3.a(CZ9P.a, cQf111117, j30VarQ);
                j30VarQ.e(-1323940314);
                jt4Var = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var);
                jt4Var2 = r40.k;
                jy1Var = (jy1) j30VarQ.E(jt4Var2);
                jt4Var3 = r40.o;
                pg2Var3 = pg2Var2;
                ti5Var = (ti5) j30VarQ.E(jt4Var3);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarT118);
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
                h81Var4 = h81Var3;
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                j30VarQ.e(-2025531908);
                if (x81Var6 != null) {
                    x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var111115 = sd5.a;
                }
                j30VarQ.R(false);
                if (1.0f > 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx1110 = wo1.a;
                mz1 mz1Var118 = new mz1(1.0f, true);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(mz1Var118);
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
                x81Var8 = x81Var7;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                if (x81Var8 != null) {
                    x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var111116 = sd5.a;
                }
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                x81Var9 = x81Var6;
                h81Var5 = h81Var4;
                x81Var10 = x81Var8;
                pg2Var4 = pg2Var3;
            } else {
                qnHx = pg2.QnHx.w;
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i6 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var5;
                }
                if (i8 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                e40.CQf cQf111118 = e40.a;
                if (h81Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var3);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                f = 16;
                pg2 pg2VarT119 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
                da.CQf cQf111119 = One.QnHx.k;
                j30VarQ.e(693286680);
                rb2VarA = uu3.a(CZ9P.a, cQf111119, j30VarQ);
                j30VarQ.e(-1323940314);
                jt4Var = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var);
                jt4Var2 = r40.k;
                jy1Var = (jy1) j30VarQ.E(jt4Var2);
                jt4Var3 = r40.o;
                pg2Var3 = pg2Var2;
                ti5Var = (ti5) j30VarQ.E(jt4Var3);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarT119);
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
                h81Var4 = h81Var3;
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                j30VarQ.e(-2025531908);
                if (x81Var6 != null) {
                    x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var111117 = sd5.a;
                }
                j30VarQ.R(false);
                if (1.0f > 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx1111 = wo1.a;
                mz1 mz1Var119 = new mz1(1.0f, true);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(mz1Var119);
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
                x81Var8 = x81Var7;
                Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                if (x81Var8 != null) {
                    x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                    pq4.a(f, j30VarQ, 6);
                    sd5 sd5Var111118 = sd5.a;
                }
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                x81Var9 = x81Var6;
                h81Var5 = h81Var4;
                x81Var10 = x81Var8;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
        }
        i3 |= 24576;
        h81Var2 = h81Var;
        if ((46811 & i3) == 9362) {
            qnHx = pg2.QnHx.w;
            if (i10 != 0) {
                pg2Var2 = qnHx;
            }
            if (i4 != 0) {
                x81Var6 = null;
            } else {
                x81Var6 = x81Var4;
            }
            if (i6 != 0) {
                x81Var7 = null;
            } else {
                x81Var7 = x81Var5;
            }
            if (i8 != 0) {
                h81Var3 = null;
            } else {
                h81Var3 = h81Var2;
            }
            e40.CQf cQf1111110 = e40.a;
            if (h81Var3 != null) {
                z = true;
            } else {
                z = false;
            }
            j30VarQ.e(1157296644);
            zI = j30VarQ.I(h81Var3);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new F1(h81Var3);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new F1(h81Var3);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            f = 16;
            pg2 pg2VarT1110 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
            da.CQf cQf1111111 = One.QnHx.k;
            j30VarQ.e(693286680);
            rb2VarA = uu3.a(CZ9P.a, cQf1111111, j30VarQ);
            j30VarQ.e(-1323940314);
            jt4Var = r40.e;
            ij0Var = (ij0) j30VarQ.E(jt4Var);
            jt4Var2 = r40.k;
            jy1Var = (jy1) j30VarQ.E(jt4Var2);
            jt4Var3 = r40.o;
            pg2Var3 = pg2Var2;
            ti5Var = (ti5) j30VarQ.E(jt4Var3);
            a30.e.getClass();
            qnHx2 = a30.QnHx.b;
            szVarJ = S12N.j(pg2VarT1110);
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
            h81Var4 = h81Var3;
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
            j30VarQ.e(-2025531908);
            if (x81Var6 != null) {
                x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                pq4.a(f, j30VarQ, 6);
                sd5 sd5Var111119 = sd5.a;
            }
            j30VarQ.R(false);
            if (1.0f > 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
            }
            wo1.QnHx qnHx1112 = wo1.a;
            mz1 mz1Var1110 = new mz1(1.0f, true);
            j30VarQ.e(-483455358);
            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
            szVarJ2 = S12N.j(mz1Var1110);
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
            x81Var8 = x81Var7;
            Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
            fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
            j30VarQ.R(false);
            j30VarQ.R(false);
            if (x81Var8 != null) {
                x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                pq4.a(f, j30VarQ, 6);
                sd5 sd5Var1111110 = sd5.a;
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
            x81Var9 = x81Var6;
            h81Var5 = h81Var4;
            x81Var10 = x81Var8;
            pg2Var4 = pg2Var3;
        } else {
            qnHx = pg2.QnHx.w;
            if (i10 != 0) {
                pg2Var2 = qnHx;
            }
            if (i4 != 0) {
                x81Var6 = null;
            } else {
                x81Var6 = x81Var4;
            }
            if (i6 != 0) {
                x81Var7 = null;
            } else {
                x81Var7 = x81Var5;
            }
            if (i8 != 0) {
                h81Var3 = null;
            } else {
                h81Var3 = h81Var2;
            }
            e40.CQf cQf1111112 = e40.a;
            if (h81Var3 != null) {
                z = true;
            } else {
                z = false;
            }
            j30VarQ.e(1157296644);
            zI = j30VarQ.I(h81Var3);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new F1(h81Var3);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new F1(h81Var3);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            f = 16;
            pg2 pg2VarT1111 = ps0.T(hr.c(pg2Var2, z, (h81) objB0, 6), f);
            da.CQf cQf1111113 = One.QnHx.k;
            j30VarQ.e(693286680);
            rb2VarA = uu3.a(CZ9P.a, cQf1111113, j30VarQ);
            j30VarQ.e(-1323940314);
            jt4Var = r40.e;
            ij0Var = (ij0) j30VarQ.E(jt4Var);
            jt4Var2 = r40.k;
            jy1Var = (jy1) j30VarQ.E(jt4Var2);
            jt4Var3 = r40.o;
            pg2Var3 = pg2Var2;
            ti5Var = (ti5) j30VarQ.E(jt4Var3);
            a30.e.getClass();
            qnHx2 = a30.QnHx.b;
            szVarJ = S12N.j(pg2VarT1111);
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
            h81Var4 = h81Var3;
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
            j30VarQ.e(-2025531908);
            if (x81Var6 != null) {
                x81Var6.invoke(j30VarQ, Integer.valueOf((i3 >> 6) & 14));
                pq4.a(f, j30VarQ, 6);
                sd5 sd5Var1111111 = sd5.a;
            }
            j30VarQ.R(false);
            if (1.0f > 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
            }
            wo1.QnHx qnHx1113 = wo1.a;
            mz1 mz1Var1111 = new mz1(1.0f, true);
            j30VarQ.e(-483455358);
            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
            szVarJ2 = S12N.j(mz1Var1111);
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
            x81Var8 = x81Var7;
            Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
            fc2.b((i3 >> 3) & 14, x81Var, j30VarQ, false, false, true);
            j30VarQ.R(false);
            j30VarQ.R(false);
            if (x81Var8 != null) {
                x81Var8.invoke(j30VarQ, Integer.valueOf((i3 >> 9) & 14));
                pq4.a(f, j30VarQ, 6);
                sd5 sd5Var1111112 = sd5.a;
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
            x81Var9 = x81Var6;
            h81Var5 = h81Var4;
            x81Var10 = x81Var8;
            pg2Var4 = pg2Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(pg2Var4, x81Var, x81Var9, x81Var10, h81Var5, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void b(pg2 pg2Var, String str, String str2, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, h81<sd5> h81Var, g30 g30Var, int i, int i2) {
        pg2 pg2Var2;
        int i3;
        String str3;
        int i4;
        x81<? super g30, ? super Integer, sd5> x81Var3;
        int i5;
        int i6;
        x81<? super g30, ? super Integer, sd5> x81Var4;
        int i7;
        int i8;
        h81<sd5> h81Var2;
        int i9;
        pg2 pg2Var3;
        x81<? super g30, ? super Integer, sd5> x81Var5;
        x81<? super g30, ? super Integer, sd5> x81Var6;
        x81<? super g30, ? super Integer, sd5> x81Var7;
        x81<? super g30, ? super Integer, sd5> x81Var8;
        h81<sd5> h81Var3;
        String str4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-577507243);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            pg2Var2 = pg2Var;
        } else if ((i & 14) == 0) {
            pg2Var2 = pg2Var;
            i3 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i;
        } else {
            pg2Var2 = pg2Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(str) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 896) == 0) {
                str3 = str2;
                i3 |= j30VarQ.I(str3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    x81Var3 = x81Var;
                    if (j30VarQ.I(x81Var3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        x81Var4 = x81Var2;
                        if (j30VarQ.I(x81Var4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((458752 & i) == 0) {
                            h81Var2 = h81Var;
                            if (j30VarQ.I(h81Var2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((374491 & i3) == 74898 || !j30VarQ.t()) {
                            if (i10 != 0) {
                                pg2Var3 = pg2.QnHx.w;
                            } else {
                                pg2Var3 = pg2Var2;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            }
                            if (i4 != 0) {
                                x81Var5 = null;
                            } else {
                                x81Var5 = x81Var3;
                            }
                            if (i6 != 0) {
                                x81Var6 = null;
                            } else {
                                x81Var6 = x81Var4;
                            }
                            h81<sd5> h81Var4 = i8 == 0 ? h81Var2 : null;
                            e40.CQf cQf = e40.a;
                            sz szVarM = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                            int i12 = (i3 & 14) | 48;
                            int i13 = i3 >> 3;
                            a(pg2Var3, szVarM, x81Var5, x81Var6, h81Var4, j30VarQ, i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 0);
                            x81Var7 = x81Var5;
                            x81Var8 = x81Var6;
                            String str5 = str3;
                            h81Var3 = h81Var4;
                            str4 = str5;
                        } else {
                            j30VarQ.x();
                            pg2Var3 = pg2Var2;
                            str4 = str3;
                            x81Var7 = x81Var3;
                            x81Var8 = x81Var4;
                            h81Var3 = h81Var2;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
                    }
                    i3 |= 196608;
                    h81Var2 = h81Var;
                    if ((374491 & i3) == 74898) {
                        if (i10 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        }
                        if (i4 != 0) {
                            x81Var5 = null;
                        } else {
                            x81Var5 = x81Var3;
                        }
                        if (i6 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i8 == 0) {
                        }
                        e40.CQf cQf2 = e40.a;
                        sz szVarM2 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                        int i14 = (i3 & 14) | 48;
                        int i15 = i3 >> 3;
                        a(pg2Var3, szVarM2, x81Var5, x81Var6, h81Var4, j30VarQ, i14 | (i15 & 896) | (i15 & 7168) | (i15 & 57344), 0);
                        x81Var7 = x81Var5;
                        x81Var8 = x81Var6;
                        String str6 = str3;
                        h81Var3 = h81Var4;
                        str4 = str6;
                    } else {
                        if (i10 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        }
                        if (i4 != 0) {
                            x81Var5 = null;
                        } else {
                            x81Var5 = x81Var3;
                        }
                        if (i6 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i8 == 0) {
                        }
                        e40.CQf cQf3 = e40.a;
                        sz szVarM3 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                        int i16 = (i3 & 14) | 48;
                        int i17 = i3 >> 3;
                        a(pg2Var3, szVarM3, x81Var5, x81Var6, h81Var4, j30VarQ, i16 | (i17 & 896) | (i17 & 7168) | (i17 & 57344), 0);
                        x81Var7 = x81Var5;
                        x81Var8 = x81Var6;
                        String str7 = str3;
                        h81Var3 = h81Var4;
                        str4 = str7;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
                }
                i3 |= 24576;
                x81Var4 = x81Var2;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        h81Var2 = h81Var;
                        if (j30VarQ.I(h81Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((374491 & i3) == 74898) {
                        if (i10 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        }
                        if (i4 != 0) {
                            x81Var5 = null;
                        } else {
                            x81Var5 = x81Var3;
                        }
                        if (i6 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i8 == 0) {
                        }
                        e40.CQf cQf4 = e40.a;
                        sz szVarM4 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                        int i18 = (i3 & 14) | 48;
                        int i19 = i3 >> 3;
                        a(pg2Var3, szVarM4, x81Var5, x81Var6, h81Var4, j30VarQ, i18 | (i19 & 896) | (i19 & 7168) | (i19 & 57344), 0);
                        x81Var7 = x81Var5;
                        x81Var8 = x81Var6;
                        String str8 = str3;
                        h81Var3 = h81Var4;
                        str4 = str8;
                    } else {
                        if (i10 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        }
                        if (i4 != 0) {
                            x81Var5 = null;
                        } else {
                            x81Var5 = x81Var3;
                        }
                        if (i6 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i8 == 0) {
                        }
                        e40.CQf cQf5 = e40.a;
                        sz szVarM5 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                        int i110 = (i3 & 14) | 48;
                        int i111 = i3 >> 3;
                        a(pg2Var3, szVarM5, x81Var5, x81Var6, h81Var4, j30VarQ, i110 | (i111 & 896) | (i111 & 7168) | (i111 & 57344), 0);
                        x81Var7 = x81Var5;
                        x81Var8 = x81Var6;
                        String str9 = str3;
                        h81Var3 = h81Var4;
                        str4 = str9;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
                }
                i3 |= 196608;
                h81Var2 = h81Var;
                if ((374491 & i3) == 74898) {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf6 = e40.a;
                    sz szVarM6 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i112 = (i3 & 14) | 48;
                    int i113 = i3 >> 3;
                    a(pg2Var3, szVarM6, x81Var5, x81Var6, h81Var4, j30VarQ, i112 | (i113 & 896) | (i113 & 7168) | (i113 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str10 = str3;
                    h81Var3 = h81Var4;
                    str4 = str10;
                } else {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf7 = e40.a;
                    sz szVarM7 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i114 = (i3 & 14) | 48;
                    int i115 = i3 >> 3;
                    a(pg2Var3, szVarM7, x81Var5, x81Var6, h81Var4, j30VarQ, i114 | (i115 & 896) | (i115 & 7168) | (i115 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str11 = str3;
                    h81Var3 = h81Var4;
                    str4 = str11;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
            }
            i3 |= 3072;
            x81Var3 = x81Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    x81Var4 = x81Var2;
                    if (j30VarQ.I(x81Var4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        h81Var2 = h81Var;
                        if (j30VarQ.I(h81Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((374491 & i3) == 74898) {
                        if (i10 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        }
                        if (i4 != 0) {
                            x81Var5 = null;
                        } else {
                            x81Var5 = x81Var3;
                        }
                        if (i6 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i8 == 0) {
                        }
                        e40.CQf cQf8 = e40.a;
                        sz szVarM8 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                        int i116 = (i3 & 14) | 48;
                        int i117 = i3 >> 3;
                        a(pg2Var3, szVarM8, x81Var5, x81Var6, h81Var4, j30VarQ, i116 | (i117 & 896) | (i117 & 7168) | (i117 & 57344), 0);
                        x81Var7 = x81Var5;
                        x81Var8 = x81Var6;
                        String str12 = str3;
                        h81Var3 = h81Var4;
                        str4 = str12;
                    } else {
                        if (i10 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        }
                        if (i4 != 0) {
                            x81Var5 = null;
                        } else {
                            x81Var5 = x81Var3;
                        }
                        if (i6 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i8 == 0) {
                        }
                        e40.CQf cQf9 = e40.a;
                        sz szVarM9 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                        int i118 = (i3 & 14) | 48;
                        int i119 = i3 >> 3;
                        a(pg2Var3, szVarM9, x81Var5, x81Var6, h81Var4, j30VarQ, i118 | (i119 & 896) | (i119 & 7168) | (i119 & 57344), 0);
                        x81Var7 = x81Var5;
                        x81Var8 = x81Var6;
                        String str13 = str3;
                        h81Var3 = h81Var4;
                        str4 = str13;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
                }
                i3 |= 196608;
                h81Var2 = h81Var;
                if ((374491 & i3) == 74898) {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf10 = e40.a;
                    sz szVarM10 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i1110 = (i3 & 14) | 48;
                    int i1111 = i3 >> 3;
                    a(pg2Var3, szVarM10, x81Var5, x81Var6, h81Var4, j30VarQ, i1110 | (i1111 & 896) | (i1111 & 7168) | (i1111 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str14 = str3;
                    h81Var3 = h81Var4;
                    str4 = str14;
                } else {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf11 = e40.a;
                    sz szVarM11 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i1112 = (i3 & 14) | 48;
                    int i1113 = i3 >> 3;
                    a(pg2Var3, szVarM11, x81Var5, x81Var6, h81Var4, j30VarQ, i1112 | (i1113 & 896) | (i1113 & 7168) | (i1113 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str15 = str3;
                    h81Var3 = h81Var4;
                    str4 = str15;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
            }
            i3 |= 24576;
            x81Var4 = x81Var2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    h81Var2 = h81Var;
                    if (j30VarQ.I(h81Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((374491 & i3) == 74898) {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf12 = e40.a;
                    sz szVarM12 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i1114 = (i3 & 14) | 48;
                    int i1115 = i3 >> 3;
                    a(pg2Var3, szVarM12, x81Var5, x81Var6, h81Var4, j30VarQ, i1114 | (i1115 & 896) | (i1115 & 7168) | (i1115 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str16 = str3;
                    h81Var3 = h81Var4;
                    str4 = str16;
                } else {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf13 = e40.a;
                    sz szVarM13 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i1116 = (i3 & 14) | 48;
                    int i1117 = i3 >> 3;
                    a(pg2Var3, szVarM13, x81Var5, x81Var6, h81Var4, j30VarQ, i1116 | (i1117 & 896) | (i1117 & 7168) | (i1117 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str17 = str3;
                    h81Var3 = h81Var4;
                    str4 = str17;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
            }
            i3 |= 196608;
            h81Var2 = h81Var;
            if ((374491 & i3) == 74898) {
                if (i10 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if (i4 != 0) {
                    x81Var5 = null;
                } else {
                    x81Var5 = x81Var3;
                }
                if (i6 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i8 == 0) {
                }
                e40.CQf cQf14 = e40.a;
                sz szVarM14 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                int i1118 = (i3 & 14) | 48;
                int i1119 = i3 >> 3;
                a(pg2Var3, szVarM14, x81Var5, x81Var6, h81Var4, j30VarQ, i1118 | (i1119 & 896) | (i1119 & 7168) | (i1119 & 57344), 0);
                x81Var7 = x81Var5;
                x81Var8 = x81Var6;
                String str18 = str3;
                h81Var3 = h81Var4;
                str4 = str18;
            } else {
                if (i10 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if (i4 != 0) {
                    x81Var5 = null;
                } else {
                    x81Var5 = x81Var3;
                }
                if (i6 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i8 == 0) {
                }
                e40.CQf cQf15 = e40.a;
                sz szVarM15 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                int i11110 = (i3 & 14) | 48;
                int i11111 = i3 >> 3;
                a(pg2Var3, szVarM15, x81Var5, x81Var6, h81Var4, j30VarQ, i11110 | (i11111 & 896) | (i11111 & 7168) | (i11111 & 57344), 0);
                x81Var7 = x81Var5;
                x81Var8 = x81Var6;
                String str19 = str3;
                h81Var3 = h81Var4;
                str4 = str19;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
        }
        i3 |= 384;
        str3 = str2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                x81Var3 = x81Var;
                if (j30VarQ.I(x81Var3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    x81Var4 = x81Var2;
                    if (j30VarQ.I(x81Var4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        h81Var2 = h81Var;
                        if (j30VarQ.I(h81Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((374491 & i3) == 74898) {
                        if (i10 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        }
                        if (i4 != 0) {
                            x81Var5 = null;
                        } else {
                            x81Var5 = x81Var3;
                        }
                        if (i6 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i8 == 0) {
                        }
                        e40.CQf cQf16 = e40.a;
                        sz szVarM16 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                        int i11112 = (i3 & 14) | 48;
                        int i11113 = i3 >> 3;
                        a(pg2Var3, szVarM16, x81Var5, x81Var6, h81Var4, j30VarQ, i11112 | (i11113 & 896) | (i11113 & 7168) | (i11113 & 57344), 0);
                        x81Var7 = x81Var5;
                        x81Var8 = x81Var6;
                        String str110 = str3;
                        h81Var3 = h81Var4;
                        str4 = str110;
                    } else {
                        if (i10 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        }
                        if (i4 != 0) {
                            x81Var5 = null;
                        } else {
                            x81Var5 = x81Var3;
                        }
                        if (i6 != 0) {
                            x81Var6 = null;
                        } else {
                            x81Var6 = x81Var4;
                        }
                        if (i8 == 0) {
                        }
                        e40.CQf cQf17 = e40.a;
                        sz szVarM17 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                        int i11114 = (i3 & 14) | 48;
                        int i11115 = i3 >> 3;
                        a(pg2Var3, szVarM17, x81Var5, x81Var6, h81Var4, j30VarQ, i11114 | (i11115 & 896) | (i11115 & 7168) | (i11115 & 57344), 0);
                        x81Var7 = x81Var5;
                        x81Var8 = x81Var6;
                        String str111 = str3;
                        h81Var3 = h81Var4;
                        str4 = str111;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
                }
                i3 |= 196608;
                h81Var2 = h81Var;
                if ((374491 & i3) == 74898) {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf18 = e40.a;
                    sz szVarM18 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i11116 = (i3 & 14) | 48;
                    int i11117 = i3 >> 3;
                    a(pg2Var3, szVarM18, x81Var5, x81Var6, h81Var4, j30VarQ, i11116 | (i11117 & 896) | (i11117 & 7168) | (i11117 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str112 = str3;
                    h81Var3 = h81Var4;
                    str4 = str112;
                } else {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf19 = e40.a;
                    sz szVarM19 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i11118 = (i3 & 14) | 48;
                    int i11119 = i3 >> 3;
                    a(pg2Var3, szVarM19, x81Var5, x81Var6, h81Var4, j30VarQ, i11118 | (i11119 & 896) | (i11119 & 7168) | (i11119 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str113 = str3;
                    h81Var3 = h81Var4;
                    str4 = str113;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
            }
            i3 |= 24576;
            x81Var4 = x81Var2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    h81Var2 = h81Var;
                    if (j30VarQ.I(h81Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((374491 & i3) == 74898) {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf110 = e40.a;
                    sz szVarM110 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i111110 = (i3 & 14) | 48;
                    int i111111 = i3 >> 3;
                    a(pg2Var3, szVarM110, x81Var5, x81Var6, h81Var4, j30VarQ, i111110 | (i111111 & 896) | (i111111 & 7168) | (i111111 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str114 = str3;
                    h81Var3 = h81Var4;
                    str4 = str114;
                } else {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf111 = e40.a;
                    sz szVarM111 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i111112 = (i3 & 14) | 48;
                    int i111113 = i3 >> 3;
                    a(pg2Var3, szVarM111, x81Var5, x81Var6, h81Var4, j30VarQ, i111112 | (i111113 & 896) | (i111113 & 7168) | (i111113 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str115 = str3;
                    h81Var3 = h81Var4;
                    str4 = str115;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
            }
            i3 |= 196608;
            h81Var2 = h81Var;
            if ((374491 & i3) == 74898) {
                if (i10 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if (i4 != 0) {
                    x81Var5 = null;
                } else {
                    x81Var5 = x81Var3;
                }
                if (i6 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i8 == 0) {
                }
                e40.CQf cQf112 = e40.a;
                sz szVarM112 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                int i111114 = (i3 & 14) | 48;
                int i111115 = i3 >> 3;
                a(pg2Var3, szVarM112, x81Var5, x81Var6, h81Var4, j30VarQ, i111114 | (i111115 & 896) | (i111115 & 7168) | (i111115 & 57344), 0);
                x81Var7 = x81Var5;
                x81Var8 = x81Var6;
                String str116 = str3;
                h81Var3 = h81Var4;
                str4 = str116;
            } else {
                if (i10 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if (i4 != 0) {
                    x81Var5 = null;
                } else {
                    x81Var5 = x81Var3;
                }
                if (i6 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i8 == 0) {
                }
                e40.CQf cQf113 = e40.a;
                sz szVarM113 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                int i111116 = (i3 & 14) | 48;
                int i111117 = i3 >> 3;
                a(pg2Var3, szVarM113, x81Var5, x81Var6, h81Var4, j30VarQ, i111116 | (i111117 & 896) | (i111117 & 7168) | (i111117 & 57344), 0);
                x81Var7 = x81Var5;
                x81Var8 = x81Var6;
                String str117 = str3;
                h81Var3 = h81Var4;
                str4 = str117;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
        }
        i3 |= 3072;
        x81Var3 = x81Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                x81Var4 = x81Var2;
                if (j30VarQ.I(x81Var4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    h81Var2 = h81Var;
                    if (j30VarQ.I(h81Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((374491 & i3) == 74898) {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf114 = e40.a;
                    sz szVarM114 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i111118 = (i3 & 14) | 48;
                    int i111119 = i3 >> 3;
                    a(pg2Var3, szVarM114, x81Var5, x81Var6, h81Var4, j30VarQ, i111118 | (i111119 & 896) | (i111119 & 7168) | (i111119 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str118 = str3;
                    h81Var3 = h81Var4;
                    str4 = str118;
                } else {
                    if (i10 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        x81Var5 = null;
                    } else {
                        x81Var5 = x81Var3;
                    }
                    if (i6 != 0) {
                        x81Var6 = null;
                    } else {
                        x81Var6 = x81Var4;
                    }
                    if (i8 == 0) {
                    }
                    e40.CQf cQf115 = e40.a;
                    sz szVarM115 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                    int i1111110 = (i3 & 14) | 48;
                    int i1111111 = i3 >> 3;
                    a(pg2Var3, szVarM115, x81Var5, x81Var6, h81Var4, j30VarQ, i1111110 | (i1111111 & 896) | (i1111111 & 7168) | (i1111111 & 57344), 0);
                    x81Var7 = x81Var5;
                    x81Var8 = x81Var6;
                    String str119 = str3;
                    h81Var3 = h81Var4;
                    str4 = str119;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
            }
            i3 |= 196608;
            h81Var2 = h81Var;
            if ((374491 & i3) == 74898) {
                if (i10 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if (i4 != 0) {
                    x81Var5 = null;
                } else {
                    x81Var5 = x81Var3;
                }
                if (i6 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i8 == 0) {
                }
                e40.CQf cQf116 = e40.a;
                sz szVarM116 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                int i1111112 = (i3 & 14) | 48;
                int i1111113 = i3 >> 3;
                a(pg2Var3, szVarM116, x81Var5, x81Var6, h81Var4, j30VarQ, i1111112 | (i1111113 & 896) | (i1111113 & 7168) | (i1111113 & 57344), 0);
                x81Var7 = x81Var5;
                x81Var8 = x81Var6;
                String str1110 = str3;
                h81Var3 = h81Var4;
                str4 = str1110;
            } else {
                if (i10 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if (i4 != 0) {
                    x81Var5 = null;
                } else {
                    x81Var5 = x81Var3;
                }
                if (i6 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i8 == 0) {
                }
                e40.CQf cQf117 = e40.a;
                sz szVarM117 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                int i1111114 = (i3 & 14) | 48;
                int i1111115 = i3 >> 3;
                a(pg2Var3, szVarM117, x81Var5, x81Var6, h81Var4, j30VarQ, i1111114 | (i1111115 & 896) | (i1111115 & 7168) | (i1111115 & 57344), 0);
                x81Var7 = x81Var5;
                x81Var8 = x81Var6;
                String str1111 = str3;
                h81Var3 = h81Var4;
                str4 = str1111;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
        }
        i3 |= 24576;
        x81Var4 = x81Var2;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((458752 & i) == 0) {
                h81Var2 = h81Var;
                if (j30VarQ.I(h81Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((374491 & i3) == 74898) {
                if (i10 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if (i4 != 0) {
                    x81Var5 = null;
                } else {
                    x81Var5 = x81Var3;
                }
                if (i6 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i8 == 0) {
                }
                e40.CQf cQf118 = e40.a;
                sz szVarM118 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                int i1111116 = (i3 & 14) | 48;
                int i1111117 = i3 >> 3;
                a(pg2Var3, szVarM118, x81Var5, x81Var6, h81Var4, j30VarQ, i1111116 | (i1111117 & 896) | (i1111117 & 7168) | (i1111117 & 57344), 0);
                x81Var7 = x81Var5;
                x81Var8 = x81Var6;
                String str1112 = str3;
                h81Var3 = h81Var4;
                str4 = str1112;
            } else {
                if (i10 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if (i4 != 0) {
                    x81Var5 = null;
                } else {
                    x81Var5 = x81Var3;
                }
                if (i6 != 0) {
                    x81Var6 = null;
                } else {
                    x81Var6 = x81Var4;
                }
                if (i8 == 0) {
                }
                e40.CQf cQf119 = e40.a;
                sz szVarM119 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
                int i1111118 = (i3 & 14) | 48;
                int i1111119 = i3 >> 3;
                a(pg2Var3, szVarM119, x81Var5, x81Var6, h81Var4, j30VarQ, i1111118 | (i1111119 & 896) | (i1111119 & 7168) | (i1111119 & 57344), 0);
                x81Var7 = x81Var5;
                x81Var8 = x81Var6;
                String str1113 = str3;
                h81Var3 = h81Var4;
                str4 = str1113;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
        }
        i3 |= 196608;
        h81Var2 = h81Var;
        if ((374491 & i3) == 74898) {
            if (i10 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i11 != 0) {
                str3 = null;
            }
            if (i4 != 0) {
                x81Var5 = null;
            } else {
                x81Var5 = x81Var3;
            }
            if (i6 != 0) {
                x81Var6 = null;
            } else {
                x81Var6 = x81Var4;
            }
            if (i8 == 0) {
            }
            e40.CQf cQf1110 = e40.a;
            sz szVarM1110 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
            int i11111110 = (i3 & 14) | 48;
            int i11111111 = i3 >> 3;
            a(pg2Var3, szVarM1110, x81Var5, x81Var6, h81Var4, j30VarQ, i11111110 | (i11111111 & 896) | (i11111111 & 7168) | (i11111111 & 57344), 0);
            x81Var7 = x81Var5;
            x81Var8 = x81Var6;
            String str1114 = str3;
            h81Var3 = h81Var4;
            str4 = str1114;
        } else {
            if (i10 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i11 != 0) {
                str3 = null;
            }
            if (i4 != 0) {
                x81Var5 = null;
            } else {
                x81Var5 = x81Var3;
            }
            if (i6 != 0) {
                x81Var6 = null;
            } else {
                x81Var6 = x81Var4;
            }
            if (i8 == 0) {
            }
            e40.CQf cQf1111 = e40.a;
            sz szVarM1111 = X.m(j30VarQ, -1134692021, new QnHx(str, i3, str3));
            int i11111112 = (i3 & 14) | 48;
            int i11111113 = i3 >> 3;
            a(pg2Var3, szVarM1111, x81Var5, x81Var6, h81Var4, j30VarQ, i11111112 | (i11111113 & 896) | (i11111113 & 7168) | (i11111113 & 57344), 0);
            x81Var7 = x81Var5;
            x81Var8 = x81Var6;
            String str1115 = str3;
            h81Var3 = h81Var4;
            str4 = str1115;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var3, str, str4, x81Var7, x81Var8, h81Var3, i, i2);
    }
}
