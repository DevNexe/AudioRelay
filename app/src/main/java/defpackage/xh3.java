package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xh3 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ String x;
        public final /* synthetic */ String y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(String str, int i, String str2, boolean z) {
            super(2);
            this.w = z;
            this.x = str;
            this.y = str2;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            String str = this.x;
            String str2 = this.y;
            xh3.a(this.w, str, str2, g30Var, i);
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
            this.w.invoke();
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<x21, sd5> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(x21 x21Var) {
            x21Var.a(false);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ h81<sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(h81<sd5> h81Var) {
            super(0);
            this.w = h81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke();
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ String x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(String str, String str2, int i) {
            super(2);
            this.w = str;
            this.x = str2;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            pg2.QnHx qnHx;
            g30 g30Var2;
            g30 g30Var3;
            g30 g30Var4 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var4.t()) {
                g30Var4.x();
            } else {
                e40.CQf cQf = e40.a;
                g30Var4.e(-483455358);
                pg2.QnHx qnHx2 = pg2.QnHx.w;
                rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, g30Var4);
                g30Var4.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var4.E(r40.e);
                jy1 jy1Var = (jy1) g30Var4.E(r40.k);
                ti5 ti5Var = (ti5) g30Var4.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx3 = a30.QnHx.b;
                sz szVarJ = S12N.j(qnHx2);
                if (!(g30Var4.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var4.s();
                if (g30Var4.m()) {
                    g30Var4.l(qnHx3);
                } else {
                    g30Var4.A();
                }
                g30Var4.u();
                hH.u(g30Var4, rb2VarA, a30.QnHx.e);
                hH.u(g30Var4, ij0Var, a30.QnHx.d);
                hH.u(g30Var4, jy1Var, a30.QnHx.f);
                qc0.c(0, szVarJ, bl2.b(g30Var4, ti5Var, a30.QnHx.g, g30Var4), g30Var4, 2058660585, -1163856341);
                g30Var4.e(-1515609324);
                String str = this.w;
                int i = this.y;
                if (str == null) {
                    g30Var2 = g30Var4;
                    qnHx = qnHx2;
                } else {
                    hH.i(gm4.g(qnHx2, 8), g30Var4, 6);
                    qnHx = qnHx2;
                    g30Var2 = g30Var4;
                    j55.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var4.E(sc5.a)).j, g30Var2, (i >> 3) & 14, 0, 32766);
                }
                g30Var2.G();
                String str2 = this.x;
                if (str2 == null) {
                    g30Var3 = g30Var2;
                } else {
                    pg2.QnHx qnHx4 = qnHx;
                    g30Var3 = g30Var2;
                    hH.i(gm4.g(qnHx4, 8), g30Var3, 6);
                    p74.a(fTO$.h(qnHx4, g30Var3), X.m(g30Var3, -1191891539, new wh3(str2, i)), g30Var3, 48, 0);
                }
                ex0.d(g30Var3);
            }
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(String str, int i) {
            super(2);
            this.w = str;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                if (!(((double) 1.0f) > 0.0d)) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx = wo1.a;
                j55.b(this.w, new mz1(1.0f, true), 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, ((this.x >> 3) & 14) | 196608, 0, 32732);
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements h81<sd5> {
        public final /* synthetic */ h81<sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(h81<sd5> h81Var) {
            super(0);
            this.w = h81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke();
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ bd3 B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ h81<sd5> D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;
        public final /* synthetic */ String w;
        public final /* synthetic */ Boolean x;
        public final /* synthetic */ String y;
        public final /* synthetic */ String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(String str, Boolean bool, String str2, String str3, boolean z, bd3 bd3Var, boolean z2, h81<sd5> h81Var, int i, int i2) {
            super(2);
            this.w = str;
            this.x = bool;
            this.y = str2;
            this.z = str3;
            this.A = z;
            this.B = bd3Var;
            this.C = z2;
            this.D = h81Var;
            this.E = i;
            this.F = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            xh3.b(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, g30Var, this.E | 1, this.F);
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ String x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ bd3 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public byN(boolean z, String str, boolean z2, bd3 bd3Var, int i) {
            super(2);
            this.w = z;
            this.x = str;
            this.y = z2;
            this.z = bd3Var;
            this.A = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            xh3.c(this.w, this.x, this.y, this.z, g30Var, this.A | 1);
            return sd5.a;
        }
    }

    public static final void a(boolean z, String str, String str2, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(529085909);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(str2) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            io5.a(!z, q10.b, X.m(j30VarQ, 1296602367, new QnHx(str, str2, i2)), j30VarQ, 432);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(str, i, str2, z);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x012d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0131  */
    /* JADX WARN: Code duplicated, block: B:112:0x0136  */
    /* JADX WARN: Code duplicated, block: B:113:0x013d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0142 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0146  */
    /* JADX WARN: Code duplicated, block: B:120:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x015d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0178  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x017f  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:137:0x023d  */
    /* JADX WARN: Code duplicated, block: B:139:0x024d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0252  */
    /* JADX WARN: Code duplicated, block: B:145:0x026d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x027f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x0294  */
    /* JADX WARN: Code duplicated, block: B:157:0x0307  */
    /* JADX WARN: Code duplicated, block: B:159:0x030e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0314  */
    /* JADX WARN: Code duplicated, block: B:165:0x038c  */
    /* JADX WARN: Code duplicated, block: B:167:0x039f  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    public static final void b(String str, Boolean bool, String str2, String str3, boolean z, bd3 bd3Var, boolean z2, h81<sd5> h81Var, g30 g30Var, int i, int i2) {
        int i3;
        int i4;
        String str4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        bd3 bd3Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        String str5;
        boolean z4;
        bd3 bd3Var3;
        boolean z5;
        boolean z6;
        boolean zBooleanValue;
        boolean z7;
        pg2.QnHx qnHx;
        boolean zI;
        Object objB0;
        g30.QnHx.C0132QnHx c0132QnHx;
        float f;
        float f2;
        float f3;
        float f4;
        rb2 rb2VarA;
        jt4 jt4Var;
        ij0 ij0Var;
        jt4 jt4Var2;
        jy1 jy1Var;
        jt4 jt4Var3;
        ti5 ti5Var;
        yy1.QnHx qnHx2;
        sz szVarJ;
        String str6;
        jE<?> jEVar;
        a30.QnHx.F1 f1;
        a30.QnHx.C0012QnHx c0012QnHx;
        a30.QnHx.CQf cQf;
        a30.QnHx.NUlFixed nUl;
        pg2 pg2VarY;
        g30.QnHx.C0132QnHx c0132QnHx2;
        boolean z8;
        int i13;
        boolean z9;
        boolean zI2;
        Object objB1;
        String str7;
        rb2 rb2VarA2;
        ij0 ij0Var2;
        jy1 jy1Var2;
        ti5 ti5Var2;
        sz szVarJ2;
        String str8;
        boolean z10;
        String str9;
        boolean z11;
        bd3 bd3Var4;
        boolean zI3;
        Object objB2;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(1736035049);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(bool) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 896) == 0) {
                i3 |= j30VarQ.I(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    str4 = str3;
                    if (j30VarQ.I(str4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        z3 = z;
                        if (j30VarQ.c(z3)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((458752 & i) == 0) {
                            bd3Var2 = bd3Var;
                            if (j30VarQ.I(bd3Var2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            if (j30VarQ.c(z2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        if ((i2 & 128) != 0) {
                            if ((29360128 & i) == 0) {
                                if (j30VarQ.I(h81Var)) {
                                    i12 = 8388608;
                                } else {
                                    i12 = 4194304;
                                }
                            }
                            if ((23967451 & i3) == 4793490 || !j30VarQ.t()) {
                                if (i14 != 0) {
                                    str5 = null;
                                } else {
                                    str5 = str2;
                                }
                                if (i4 != 0) {
                                    str4 = null;
                                }
                                if (i6 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i8 != 0) {
                                    bd3Var3 = bd3.StarOnly;
                                } else {
                                    bd3Var3 = bd3Var2;
                                }
                                if (i10 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = z2;
                                }
                                e40.CQf cQf2 = e40.a;
                                if (bool != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (bool != null) {
                                    zBooleanValue = bool.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                                if (str4 == null || str5 != null) {
                                    z7 = false;
                                } else {
                                    z7 = true;
                                }
                                qnHx = pg2.QnHx.w;
                                j30VarQ.e(1157296644);
                                zI = j30VarQ.I(h81Var);
                                objB0 = j30VarQ.b0();
                                c0132QnHx = g30.QnHx.a;
                                if (zI || objB0 == c0132QnHx) {
                                    objB0 = new F1(h81Var);
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                pg2 pg2VarC = hr.c(qnHx, z5, (h81) objB0, 6);
                                f = 8;
                                f2 = 16;
                                if (z7) {
                                    f3 = f;
                                } else {
                                    f3 = f2;
                                }
                                if (z7) {
                                    f4 = f;
                                } else {
                                    f4 = f2;
                                }
                                pg2 pg2VarW = ps0.W(pg2VarC, f, f3, f2, f4);
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
                                szVarJ = S12N.j(pg2VarW);
                                str6 = str5;
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
                                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                                xu3 xu3Var = xu3.a;
                                j30VarQ.e(1102243231);
                                da.CQf cQf3 = One.QnHx.k;
                                pg2 pg2VarB = xu3Var.b(qnHx, cQf3);
                                LPt8Fixed lPt8 = LPt8Fixed.w;
                                mg3<a31> mg3Var = z21.a;
                                wo1.QnHx qnHx3 = wo1.a;
                                pg2VarY = pg2VarB.y(new a31(lPt8));
                                if (z5) {
                                    j30VarQ.e(1157296644);
                                    zI3 = j30VarQ.I(h81Var);
                                    objB2 = j30VarQ.b0();
                                    if (zI3) {
                                        c0132QnHx2 = c0132QnHx;
                                    } else {
                                        c0132QnHx2 = c0132QnHx;
                                        if (objB2 == c0132QnHx2) {
                                        }
                                        z8 = false;
                                        j30VarQ.R(false);
                                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                    }
                                    objB2 = new NUlFixed(h81Var);
                                    j30VarQ.F0(objB2);
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                    z8 = false;
                                }
                                pg2 pg2Var = pg2VarY;
                                j30VarQ.R(z8);
                                if (z5 || !z6) {
                                    i13 = 1157296644;
                                    z9 = false;
                                } else {
                                    i13 = 1157296644;
                                    z9 = true;
                                }
                                j30VarQ.e(i13);
                                zI2 = j30VarQ.I(h81Var);
                                objB1 = j30VarQ.b0();
                                if (zI2 || objB1 == c0132QnHx2) {
                                    objB1 = new YKK(h81Var);
                                    j30VarQ.F0(objB1);
                                }
                                j30VarQ.R(false);
                                str7 = str4;
                                uh3.a(zBooleanValue, (h81) objB1, pg2Var, z9, null, null, j30VarQ, 0, 48);
                                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                                pg2 pg2VarB2 = xu3Var.b(xu3Var.a(qnHx, 1.0f, true), cQf3);
                                j30VarQ.e(-483455358);
                                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                                j30VarQ.e(-1323940314);
                                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                                szVarJ2 = S12N.j(pg2VarB2);
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
                                int i15 = (i3 >> 18) & 14;
                                int i16 = i3 >> 6;
                                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i15 | (i16 & 896) | (i16 & 7168));
                                int i17 = i3 >> 3;
                                a(z5, str6, str7, j30VarQ, i15 | (i17 & 112) | (i17 & 896));
                                j30VarQ.R(false);
                                j30VarQ.R(false);
                                j30VarQ.R(true);
                                j30VarQ.R(false);
                                j30VarQ.R(false);
                                O.g(j30VarQ, false, false, true, false);
                                j30VarQ.R(false);
                                str8 = str6;
                                bd3 bd3Var5 = bd3Var3;
                                z10 = z4;
                                str9 = str7;
                                z11 = z5;
                                bd3Var4 = bd3Var5;
                            } else {
                                j30VarQ.x();
                                str8 = str2;
                                str9 = str4;
                                z10 = z3;
                                bd3Var4 = bd3Var2;
                                z11 = z2;
                            }
                            tk3VarU = j30VarQ.U();
                            if (tk3VarU == null) {
                                return;
                            }
                            tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                        }
                        i12 = 12582912;
                        i3 |= i12;
                        if ((23967451 & i3) == 4793490) {
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i8 != 0) {
                                bd3Var3 = bd3.StarOnly;
                            } else {
                                bd3Var3 = bd3Var2;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            e40.CQf cQf4 = e40.a;
                            if (bool != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (str4 == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            qnHx = pg2.QnHx.w;
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (zI) {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            } else {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarC2 = hr.c(qnHx, z5, (h81) objB0, 6);
                            f = 8;
                            f2 = 16;
                            if (z7) {
                                f3 = f;
                            } else {
                                f3 = f2;
                            }
                            if (z7) {
                                f4 = f;
                            } else {
                                f4 = f2;
                            }
                            pg2 pg2VarW2 = ps0.W(pg2VarC2, f, f3, f2, f4);
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
                            szVarJ = S12N.j(pg2VarW2);
                            str6 = str5;
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
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            xu3 xu3Var2 = xu3.a;
                            j30VarQ.e(1102243231);
                            da.CQf cQf5 = One.QnHx.k;
                            pg2 pg2VarB3 = xu3Var2.b(qnHx, cQf5);
                            LPt8Fixed lPt9 = LPt8Fixed.w;
                            mg3<a31> mg3Var2 = z21.a;
                            wo1.QnHx qnHx4 = wo1.a;
                            pg2VarY = pg2VarB3.y(new a31(lPt9));
                            if (z5) {
                                j30VarQ.e(1157296644);
                                zI3 = j30VarQ.I(h81Var);
                                objB2 = j30VarQ.b0();
                                if (zI3) {
                                    c0132QnHx2 = c0132QnHx;
                                    if (objB2 == c0132QnHx2) {
                                    }
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                }
                                objB2 = new NUlFixed(h81Var);
                                j30VarQ.F0(objB2);
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                                z8 = false;
                            }
                            pg2 pg2Var2 = pg2VarY;
                            j30VarQ.R(z8);
                            if (z5) {
                                i13 = 1157296644;
                                z9 = false;
                            } else {
                                i13 = 1157296644;
                                z9 = false;
                            }
                            j30VarQ.e(i13);
                            zI2 = j30VarQ.I(h81Var);
                            objB1 = j30VarQ.b0();
                            if (zI2) {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            str7 = str4;
                            uh3.a(zBooleanValue, (h81) objB1, pg2Var2, z9, null, null, j30VarQ, 0, 48);
                            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                            pg2 pg2VarB4 = xu3Var2.b(xu3Var2.a(qnHx, 1.0f, true), cQf5);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(pg2VarB4);
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
                            int i18 = (i3 >> 18) & 14;
                            int i19 = i3 >> 6;
                            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i18 | (i19 & 896) | (i19 & 7168));
                            int i110 = i3 >> 3;
                            a(z5, str6, str7, j30VarQ, i18 | (i110 & 112) | (i110 & 896));
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            j30VarQ.R(true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            str8 = str6;
                            bd3 bd3Var6 = bd3Var3;
                            z10 = z4;
                            str9 = str7;
                            z11 = z5;
                            bd3Var4 = bd3Var6;
                        } else {
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i8 != 0) {
                                bd3Var3 = bd3.StarOnly;
                            } else {
                                bd3Var3 = bd3Var2;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            e40.CQf cQf6 = e40.a;
                            if (bool != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (str4 == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            qnHx = pg2.QnHx.w;
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (zI) {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            } else {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarC3 = hr.c(qnHx, z5, (h81) objB0, 6);
                            f = 8;
                            f2 = 16;
                            if (z7) {
                                f3 = f;
                            } else {
                                f3 = f2;
                            }
                            if (z7) {
                                f4 = f;
                            } else {
                                f4 = f2;
                            }
                            pg2 pg2VarW3 = ps0.W(pg2VarC3, f, f3, f2, f4);
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
                            szVarJ = S12N.j(pg2VarW3);
                            str6 = str5;
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
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            xu3 xu3Var3 = xu3.a;
                            j30VarQ.e(1102243231);
                            da.CQf cQf7 = One.QnHx.k;
                            pg2 pg2VarB5 = xu3Var3.b(qnHx, cQf7);
                            LPt8Fixed lPt10 = LPt8Fixed.w;
                            mg3<a31> mg3Var3 = z21.a;
                            wo1.QnHx qnHx5 = wo1.a;
                            pg2VarY = pg2VarB5.y(new a31(lPt10));
                            if (z5) {
                                j30VarQ.e(1157296644);
                                zI3 = j30VarQ.I(h81Var);
                                objB2 = j30VarQ.b0();
                                if (zI3) {
                                    c0132QnHx2 = c0132QnHx;
                                    if (objB2 == c0132QnHx2) {
                                    }
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                }
                                objB2 = new NUlFixed(h81Var);
                                j30VarQ.F0(objB2);
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                                z8 = false;
                            }
                            pg2 pg2Var3 = pg2VarY;
                            j30VarQ.R(z8);
                            if (z5) {
                                i13 = 1157296644;
                                z9 = false;
                            } else {
                                i13 = 1157296644;
                                z9 = false;
                            }
                            j30VarQ.e(i13);
                            zI2 = j30VarQ.I(h81Var);
                            objB1 = j30VarQ.b0();
                            if (zI2) {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            str7 = str4;
                            uh3.a(zBooleanValue, (h81) objB1, pg2Var3, z9, null, null, j30VarQ, 0, 48);
                            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                            pg2 pg2VarB6 = xu3Var3.b(xu3Var3.a(qnHx, 1.0f, true), cQf7);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(pg2VarB6);
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
                            int i111 = (i3 >> 18) & 14;
                            int i112 = i3 >> 6;
                            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111 | (i112 & 896) | (i112 & 7168));
                            int i113 = i3 >> 3;
                            a(z5, str6, str7, j30VarQ, i111 | (i113 & 112) | (i113 & 896));
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            j30VarQ.R(true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            str8 = str6;
                            bd3 bd3Var7 = bd3Var3;
                            z10 = z4;
                            str9 = str7;
                            z11 = z5;
                            bd3Var4 = bd3Var7;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                    }
                    i3 |= 196608;
                    bd3Var2 = bd3Var;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (j30VarQ.c(z2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 128) != 0) {
                        if ((29360128 & i) == 0) {
                            if (j30VarQ.I(h81Var)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                        }
                        if ((23967451 & i3) == 4793490) {
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i8 != 0) {
                                bd3Var3 = bd3.StarOnly;
                            } else {
                                bd3Var3 = bd3Var2;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            e40.CQf cQf8 = e40.a;
                            if (bool != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (str4 == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            qnHx = pg2.QnHx.w;
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (zI) {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            } else {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarC4 = hr.c(qnHx, z5, (h81) objB0, 6);
                            f = 8;
                            f2 = 16;
                            if (z7) {
                                f3 = f;
                            } else {
                                f3 = f2;
                            }
                            if (z7) {
                                f4 = f;
                            } else {
                                f4 = f2;
                            }
                            pg2 pg2VarW4 = ps0.W(pg2VarC4, f, f3, f2, f4);
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
                            szVarJ = S12N.j(pg2VarW4);
                            str6 = str5;
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
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            xu3 xu3Var4 = xu3.a;
                            j30VarQ.e(1102243231);
                            da.CQf cQf9 = One.QnHx.k;
                            pg2 pg2VarB7 = xu3Var4.b(qnHx, cQf9);
                            LPt8Fixed lPt11 = LPt8Fixed.w;
                            mg3<a31> mg3Var4 = z21.a;
                            wo1.QnHx qnHx6 = wo1.a;
                            pg2VarY = pg2VarB7.y(new a31(lPt11));
                            if (z5) {
                                j30VarQ.e(1157296644);
                                zI3 = j30VarQ.I(h81Var);
                                objB2 = j30VarQ.b0();
                                if (zI3) {
                                    c0132QnHx2 = c0132QnHx;
                                    if (objB2 == c0132QnHx2) {
                                    }
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                }
                                objB2 = new NUlFixed(h81Var);
                                j30VarQ.F0(objB2);
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                                z8 = false;
                            }
                            pg2 pg2Var4 = pg2VarY;
                            j30VarQ.R(z8);
                            if (z5) {
                                i13 = 1157296644;
                                z9 = false;
                            } else {
                                i13 = 1157296644;
                                z9 = false;
                            }
                            j30VarQ.e(i13);
                            zI2 = j30VarQ.I(h81Var);
                            objB1 = j30VarQ.b0();
                            if (zI2) {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            str7 = str4;
                            uh3.a(zBooleanValue, (h81) objB1, pg2Var4, z9, null, null, j30VarQ, 0, 48);
                            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                            pg2 pg2VarB8 = xu3Var4.b(xu3Var4.a(qnHx, 1.0f, true), cQf9);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(pg2VarB8);
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
                            int i114 = (i3 >> 18) & 14;
                            int i115 = i3 >> 6;
                            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i114 | (i115 & 896) | (i115 & 7168));
                            int i116 = i3 >> 3;
                            a(z5, str6, str7, j30VarQ, i114 | (i116 & 112) | (i116 & 896));
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            j30VarQ.R(true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            str8 = str6;
                            bd3 bd3Var8 = bd3Var3;
                            z10 = z4;
                            str9 = str7;
                            z11 = z5;
                            bd3Var4 = bd3Var8;
                        } else {
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i8 != 0) {
                                bd3Var3 = bd3.StarOnly;
                            } else {
                                bd3Var3 = bd3Var2;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            e40.CQf cQf10 = e40.a;
                            if (bool != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (str4 == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            qnHx = pg2.QnHx.w;
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (zI) {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            } else {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarC5 = hr.c(qnHx, z5, (h81) objB0, 6);
                            f = 8;
                            f2 = 16;
                            if (z7) {
                                f3 = f;
                            } else {
                                f3 = f2;
                            }
                            if (z7) {
                                f4 = f;
                            } else {
                                f4 = f2;
                            }
                            pg2 pg2VarW5 = ps0.W(pg2VarC5, f, f3, f2, f4);
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
                            szVarJ = S12N.j(pg2VarW5);
                            str6 = str5;
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
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            xu3 xu3Var5 = xu3.a;
                            j30VarQ.e(1102243231);
                            da.CQf cQf11 = One.QnHx.k;
                            pg2 pg2VarB9 = xu3Var5.b(qnHx, cQf11);
                            LPt8Fixed lPt12 = LPt8Fixed.w;
                            mg3<a31> mg3Var5 = z21.a;
                            wo1.QnHx qnHx7 = wo1.a;
                            pg2VarY = pg2VarB9.y(new a31(lPt12));
                            if (z5) {
                                j30VarQ.e(1157296644);
                                zI3 = j30VarQ.I(h81Var);
                                objB2 = j30VarQ.b0();
                                if (zI3) {
                                    c0132QnHx2 = c0132QnHx;
                                    if (objB2 == c0132QnHx2) {
                                    }
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                }
                                objB2 = new NUlFixed(h81Var);
                                j30VarQ.F0(objB2);
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                                z8 = false;
                            }
                            pg2 pg2Var5 = pg2VarY;
                            j30VarQ.R(z8);
                            if (z5) {
                                i13 = 1157296644;
                                z9 = false;
                            } else {
                                i13 = 1157296644;
                                z9 = false;
                            }
                            j30VarQ.e(i13);
                            zI2 = j30VarQ.I(h81Var);
                            objB1 = j30VarQ.b0();
                            if (zI2) {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            str7 = str4;
                            uh3.a(zBooleanValue, (h81) objB1, pg2Var5, z9, null, null, j30VarQ, 0, 48);
                            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                            pg2 pg2VarB10 = xu3Var5.b(xu3Var5.a(qnHx, 1.0f, true), cQf11);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(pg2VarB10);
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
                            int i117 = (i3 >> 18) & 14;
                            int i118 = i3 >> 6;
                            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i117 | (i118 & 896) | (i118 & 7168));
                            int i119 = i3 >> 3;
                            a(z5, str6, str7, j30VarQ, i117 | (i119 & 112) | (i119 & 896));
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            j30VarQ.R(true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            str8 = str6;
                            bd3 bd3Var9 = bd3Var3;
                            z10 = z4;
                            str9 = str7;
                            z11 = z5;
                            bd3Var4 = bd3Var9;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                    }
                    i12 = 12582912;
                    i3 |= i12;
                    if ((23967451 & i3) == 4793490) {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf12 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC6 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW6 = ps0.W(pg2VarC6, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW6);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var6 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf13 = One.QnHx.k;
                        pg2 pg2VarB11 = xu3Var6.b(qnHx, cQf13);
                        LPt8Fixed lPt13 = LPt8Fixed.w;
                        mg3<a31> mg3Var6 = z21.a;
                        wo1.QnHx qnHx8 = wo1.a;
                        pg2VarY = pg2VarB11.y(new a31(lPt13));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var6 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var6, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB12 = xu3Var6.b(xu3Var6.a(qnHx, 1.0f, true), cQf13);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB12);
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
                        int i1110 = (i3 >> 18) & 14;
                        int i1111 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1110 | (i1111 & 896) | (i1111 & 7168));
                        int i1112 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i1110 | (i1112 & 112) | (i1112 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var10 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var10;
                    } else {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf14 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC7 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW7 = ps0.W(pg2VarC7, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW7);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var7 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf15 = One.QnHx.k;
                        pg2 pg2VarB13 = xu3Var7.b(qnHx, cQf15);
                        LPt8Fixed lPt14 = LPt8Fixed.w;
                        mg3<a31> mg3Var7 = z21.a;
                        wo1.QnHx qnHx9 = wo1.a;
                        pg2VarY = pg2VarB13.y(new a31(lPt14));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var7 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var7, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB14 = xu3Var7.b(xu3Var7.a(qnHx, 1.0f, true), cQf15);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB14);
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
                        int i1113 = (i3 >> 18) & 14;
                        int i1114 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1113 | (i1114 & 896) | (i1114 & 7168));
                        int i1115 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i1113 | (i1115 & 112) | (i1115 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var11 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var11;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                }
                i3 |= 24576;
                z3 = z;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        bd3Var2 = bd3Var;
                        if (j30VarQ.I(bd3Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (j30VarQ.c(z2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 128) != 0) {
                        if ((29360128 & i) == 0) {
                            if (j30VarQ.I(h81Var)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                        }
                        if ((23967451 & i3) == 4793490) {
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i8 != 0) {
                                bd3Var3 = bd3.StarOnly;
                            } else {
                                bd3Var3 = bd3Var2;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            e40.CQf cQf16 = e40.a;
                            if (bool != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (str4 == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            qnHx = pg2.QnHx.w;
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (zI) {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            } else {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarC8 = hr.c(qnHx, z5, (h81) objB0, 6);
                            f = 8;
                            f2 = 16;
                            if (z7) {
                                f3 = f;
                            } else {
                                f3 = f2;
                            }
                            if (z7) {
                                f4 = f;
                            } else {
                                f4 = f2;
                            }
                            pg2 pg2VarW8 = ps0.W(pg2VarC8, f, f3, f2, f4);
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
                            szVarJ = S12N.j(pg2VarW8);
                            str6 = str5;
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
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            xu3 xu3Var8 = xu3.a;
                            j30VarQ.e(1102243231);
                            da.CQf cQf17 = One.QnHx.k;
                            pg2 pg2VarB15 = xu3Var8.b(qnHx, cQf17);
                            LPt8Fixed lPt15 = LPt8Fixed.w;
                            mg3<a31> mg3Var8 = z21.a;
                            wo1.QnHx qnHx10 = wo1.a;
                            pg2VarY = pg2VarB15.y(new a31(lPt15));
                            if (z5) {
                                j30VarQ.e(1157296644);
                                zI3 = j30VarQ.I(h81Var);
                                objB2 = j30VarQ.b0();
                                if (zI3) {
                                    c0132QnHx2 = c0132QnHx;
                                    if (objB2 == c0132QnHx2) {
                                    }
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                }
                                objB2 = new NUlFixed(h81Var);
                                j30VarQ.F0(objB2);
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                                z8 = false;
                            }
                            pg2 pg2Var8 = pg2VarY;
                            j30VarQ.R(z8);
                            if (z5) {
                                i13 = 1157296644;
                                z9 = false;
                            } else {
                                i13 = 1157296644;
                                z9 = false;
                            }
                            j30VarQ.e(i13);
                            zI2 = j30VarQ.I(h81Var);
                            objB1 = j30VarQ.b0();
                            if (zI2) {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            str7 = str4;
                            uh3.a(zBooleanValue, (h81) objB1, pg2Var8, z9, null, null, j30VarQ, 0, 48);
                            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                            pg2 pg2VarB16 = xu3Var8.b(xu3Var8.a(qnHx, 1.0f, true), cQf17);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(pg2VarB16);
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
                            int i1116 = (i3 >> 18) & 14;
                            int i1117 = i3 >> 6;
                            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1116 | (i1117 & 896) | (i1117 & 7168));
                            int i1118 = i3 >> 3;
                            a(z5, str6, str7, j30VarQ, i1116 | (i1118 & 112) | (i1118 & 896));
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            j30VarQ.R(true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            str8 = str6;
                            bd3 bd3Var12 = bd3Var3;
                            z10 = z4;
                            str9 = str7;
                            z11 = z5;
                            bd3Var4 = bd3Var12;
                        } else {
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i8 != 0) {
                                bd3Var3 = bd3.StarOnly;
                            } else {
                                bd3Var3 = bd3Var2;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            e40.CQf cQf18 = e40.a;
                            if (bool != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (str4 == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            qnHx = pg2.QnHx.w;
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (zI) {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            } else {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarC9 = hr.c(qnHx, z5, (h81) objB0, 6);
                            f = 8;
                            f2 = 16;
                            if (z7) {
                                f3 = f;
                            } else {
                                f3 = f2;
                            }
                            if (z7) {
                                f4 = f;
                            } else {
                                f4 = f2;
                            }
                            pg2 pg2VarW9 = ps0.W(pg2VarC9, f, f3, f2, f4);
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
                            szVarJ = S12N.j(pg2VarW9);
                            str6 = str5;
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
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            xu3 xu3Var9 = xu3.a;
                            j30VarQ.e(1102243231);
                            da.CQf cQf19 = One.QnHx.k;
                            pg2 pg2VarB17 = xu3Var9.b(qnHx, cQf19);
                            LPt8Fixed lPt16 = LPt8Fixed.w;
                            mg3<a31> mg3Var9 = z21.a;
                            wo1.QnHx qnHx11 = wo1.a;
                            pg2VarY = pg2VarB17.y(new a31(lPt16));
                            if (z5) {
                                j30VarQ.e(1157296644);
                                zI3 = j30VarQ.I(h81Var);
                                objB2 = j30VarQ.b0();
                                if (zI3) {
                                    c0132QnHx2 = c0132QnHx;
                                    if (objB2 == c0132QnHx2) {
                                    }
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                }
                                objB2 = new NUlFixed(h81Var);
                                j30VarQ.F0(objB2);
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                                z8 = false;
                            }
                            pg2 pg2Var9 = pg2VarY;
                            j30VarQ.R(z8);
                            if (z5) {
                                i13 = 1157296644;
                                z9 = false;
                            } else {
                                i13 = 1157296644;
                                z9 = false;
                            }
                            j30VarQ.e(i13);
                            zI2 = j30VarQ.I(h81Var);
                            objB1 = j30VarQ.b0();
                            if (zI2) {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            str7 = str4;
                            uh3.a(zBooleanValue, (h81) objB1, pg2Var9, z9, null, null, j30VarQ, 0, 48);
                            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                            pg2 pg2VarB18 = xu3Var9.b(xu3Var9.a(qnHx, 1.0f, true), cQf19);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(pg2VarB18);
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
                            int i1119 = (i3 >> 18) & 14;
                            int i11110 = i3 >> 6;
                            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1119 | (i11110 & 896) | (i11110 & 7168));
                            int i11111 = i3 >> 3;
                            a(z5, str6, str7, j30VarQ, i1119 | (i11111 & 112) | (i11111 & 896));
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            j30VarQ.R(true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            str8 = str6;
                            bd3 bd3Var13 = bd3Var3;
                            z10 = z4;
                            str9 = str7;
                            z11 = z5;
                            bd3Var4 = bd3Var13;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                    }
                    i12 = 12582912;
                    i3 |= i12;
                    if ((23967451 & i3) == 4793490) {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf110 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC10 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW10 = ps0.W(pg2VarC10, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW10);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var10 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf111 = One.QnHx.k;
                        pg2 pg2VarB19 = xu3Var10.b(qnHx, cQf111);
                        LPt8Fixed lPt17 = LPt8Fixed.w;
                        mg3<a31> mg3Var10 = z21.a;
                        wo1.QnHx qnHx12 = wo1.a;
                        pg2VarY = pg2VarB19.y(new a31(lPt17));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var10 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var10, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB110 = xu3Var10.b(xu3Var10.a(qnHx, 1.0f, true), cQf111);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB110);
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
                        int i11112 = (i3 >> 18) & 14;
                        int i11113 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11112 | (i11113 & 896) | (i11113 & 7168));
                        int i11114 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i11112 | (i11114 & 112) | (i11114 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var14 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var14;
                    } else {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf112 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC11 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW11 = ps0.W(pg2VarC11, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW11);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var11 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf113 = One.QnHx.k;
                        pg2 pg2VarB111 = xu3Var11.b(qnHx, cQf113);
                        LPt8Fixed lPt18 = LPt8Fixed.w;
                        mg3<a31> mg3Var11 = z21.a;
                        wo1.QnHx qnHx13 = wo1.a;
                        pg2VarY = pg2VarB111.y(new a31(lPt18));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var11 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var11, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB112 = xu3Var11.b(xu3Var11.a(qnHx, 1.0f, true), cQf113);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB112);
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
                        int i11115 = (i3 >> 18) & 14;
                        int i11116 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11115 | (i11116 & 896) | (i11116 & 7168));
                        int i11117 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i11115 | (i11117 & 112) | (i11117 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var15 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var15;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                }
                i3 |= 196608;
                bd3Var2 = bd3Var;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (j30VarQ.c(z2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (j30VarQ.I(h81Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                    }
                    if ((23967451 & i3) == 4793490) {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf114 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC12 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW12 = ps0.W(pg2VarC12, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW12);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var12 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf115 = One.QnHx.k;
                        pg2 pg2VarB113 = xu3Var12.b(qnHx, cQf115);
                        LPt8Fixed lPt19 = LPt8Fixed.w;
                        mg3<a31> mg3Var12 = z21.a;
                        wo1.QnHx qnHx14 = wo1.a;
                        pg2VarY = pg2VarB113.y(new a31(lPt19));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var12 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var12, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB114 = xu3Var12.b(xu3Var12.a(qnHx, 1.0f, true), cQf115);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB114);
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
                        int i11118 = (i3 >> 18) & 14;
                        int i11119 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11118 | (i11119 & 896) | (i11119 & 7168));
                        int i111110 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i11118 | (i111110 & 112) | (i111110 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var16 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var16;
                    } else {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf116 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC13 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW13 = ps0.W(pg2VarC13, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW13);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var13 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf117 = One.QnHx.k;
                        pg2 pg2VarB115 = xu3Var13.b(qnHx, cQf117);
                        LPt8Fixed lPt110 = LPt8Fixed.w;
                        mg3<a31> mg3Var13 = z21.a;
                        wo1.QnHx qnHx15 = wo1.a;
                        pg2VarY = pg2VarB115.y(new a31(lPt110));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var13 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var13, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB116 = xu3Var13.b(xu3Var13.a(qnHx, 1.0f, true), cQf117);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB116);
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
                        int i111111 = (i3 >> 18) & 14;
                        int i111112 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111 | (i111112 & 896) | (i111112 & 7168));
                        int i111113 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i111111 | (i111113 & 112) | (i111113 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var17 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var17;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                }
                i12 = 12582912;
                i3 |= i12;
                if ((23967451 & i3) == 4793490) {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf118 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC14 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW14 = ps0.W(pg2VarC14, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW14);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var14 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf119 = One.QnHx.k;
                    pg2 pg2VarB117 = xu3Var14.b(qnHx, cQf119);
                    LPt8Fixed lPt111 = LPt8Fixed.w;
                    mg3<a31> mg3Var14 = z21.a;
                    wo1.QnHx qnHx16 = wo1.a;
                    pg2VarY = pg2VarB117.y(new a31(lPt111));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var14 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var14, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB118 = xu3Var14.b(xu3Var14.a(qnHx, 1.0f, true), cQf119);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB118);
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
                    int i111114 = (i3 >> 18) & 14;
                    int i111115 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111114 | (i111115 & 896) | (i111115 & 7168));
                    int i111116 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i111114 | (i111116 & 112) | (i111116 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var18 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var18;
                } else {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf1110 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC15 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW15 = ps0.W(pg2VarC15, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW15);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var15 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf1111 = One.QnHx.k;
                    pg2 pg2VarB119 = xu3Var15.b(qnHx, cQf1111);
                    LPt8Fixed lPt112 = LPt8Fixed.w;
                    mg3<a31> mg3Var15 = z21.a;
                    wo1.QnHx qnHx17 = wo1.a;
                    pg2VarY = pg2VarB119.y(new a31(lPt112));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var15 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var15, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB1110 = xu3Var15.b(xu3Var15.a(qnHx, 1.0f, true), cQf1111);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB1110);
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
                    int i111117 = (i3 >> 18) & 14;
                    int i111118 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111117 | (i111118 & 896) | (i111118 & 7168));
                    int i111119 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i111117 | (i111119 & 112) | (i111119 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var19 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var19;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
            }
            i3 |= 3072;
            str4 = str3;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z3 = z;
                    if (j30VarQ.c(z3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        bd3Var2 = bd3Var;
                        if (j30VarQ.I(bd3Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (j30VarQ.c(z2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 128) != 0) {
                        if ((29360128 & i) == 0) {
                            if (j30VarQ.I(h81Var)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                        }
                        if ((23967451 & i3) == 4793490) {
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i8 != 0) {
                                bd3Var3 = bd3.StarOnly;
                            } else {
                                bd3Var3 = bd3Var2;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            e40.CQf cQf1112 = e40.a;
                            if (bool != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (str4 == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            qnHx = pg2.QnHx.w;
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (zI) {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            } else {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarC16 = hr.c(qnHx, z5, (h81) objB0, 6);
                            f = 8;
                            f2 = 16;
                            if (z7) {
                                f3 = f;
                            } else {
                                f3 = f2;
                            }
                            if (z7) {
                                f4 = f;
                            } else {
                                f4 = f2;
                            }
                            pg2 pg2VarW16 = ps0.W(pg2VarC16, f, f3, f2, f4);
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
                            szVarJ = S12N.j(pg2VarW16);
                            str6 = str5;
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
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            xu3 xu3Var16 = xu3.a;
                            j30VarQ.e(1102243231);
                            da.CQf cQf1113 = One.QnHx.k;
                            pg2 pg2VarB1111 = xu3Var16.b(qnHx, cQf1113);
                            LPt8Fixed lPt113 = LPt8Fixed.w;
                            mg3<a31> mg3Var16 = z21.a;
                            wo1.QnHx qnHx18 = wo1.a;
                            pg2VarY = pg2VarB1111.y(new a31(lPt113));
                            if (z5) {
                                j30VarQ.e(1157296644);
                                zI3 = j30VarQ.I(h81Var);
                                objB2 = j30VarQ.b0();
                                if (zI3) {
                                    c0132QnHx2 = c0132QnHx;
                                    if (objB2 == c0132QnHx2) {
                                    }
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                }
                                objB2 = new NUlFixed(h81Var);
                                j30VarQ.F0(objB2);
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                                z8 = false;
                            }
                            pg2 pg2Var16 = pg2VarY;
                            j30VarQ.R(z8);
                            if (z5) {
                                i13 = 1157296644;
                                z9 = false;
                            } else {
                                i13 = 1157296644;
                                z9 = false;
                            }
                            j30VarQ.e(i13);
                            zI2 = j30VarQ.I(h81Var);
                            objB1 = j30VarQ.b0();
                            if (zI2) {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            str7 = str4;
                            uh3.a(zBooleanValue, (h81) objB1, pg2Var16, z9, null, null, j30VarQ, 0, 48);
                            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                            pg2 pg2VarB1112 = xu3Var16.b(xu3Var16.a(qnHx, 1.0f, true), cQf1113);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(pg2VarB1112);
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
                            int i1111110 = (i3 >> 18) & 14;
                            int i1111111 = i3 >> 6;
                            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111110 | (i1111111 & 896) | (i1111111 & 7168));
                            int i1111112 = i3 >> 3;
                            a(z5, str6, str7, j30VarQ, i1111110 | (i1111112 & 112) | (i1111112 & 896));
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            j30VarQ.R(true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            str8 = str6;
                            bd3 bd3Var110 = bd3Var3;
                            z10 = z4;
                            str9 = str7;
                            z11 = z5;
                            bd3Var4 = bd3Var110;
                        } else {
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i8 != 0) {
                                bd3Var3 = bd3.StarOnly;
                            } else {
                                bd3Var3 = bd3Var2;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            e40.CQf cQf1114 = e40.a;
                            if (bool != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (str4 == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            qnHx = pg2.QnHx.w;
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (zI) {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            } else {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarC17 = hr.c(qnHx, z5, (h81) objB0, 6);
                            f = 8;
                            f2 = 16;
                            if (z7) {
                                f3 = f;
                            } else {
                                f3 = f2;
                            }
                            if (z7) {
                                f4 = f;
                            } else {
                                f4 = f2;
                            }
                            pg2 pg2VarW17 = ps0.W(pg2VarC17, f, f3, f2, f4);
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
                            szVarJ = S12N.j(pg2VarW17);
                            str6 = str5;
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
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            xu3 xu3Var17 = xu3.a;
                            j30VarQ.e(1102243231);
                            da.CQf cQf1115 = One.QnHx.k;
                            pg2 pg2VarB1113 = xu3Var17.b(qnHx, cQf1115);
                            LPt8Fixed lPt114 = LPt8Fixed.w;
                            mg3<a31> mg3Var17 = z21.a;
                            wo1.QnHx qnHx19 = wo1.a;
                            pg2VarY = pg2VarB1113.y(new a31(lPt114));
                            if (z5) {
                                j30VarQ.e(1157296644);
                                zI3 = j30VarQ.I(h81Var);
                                objB2 = j30VarQ.b0();
                                if (zI3) {
                                    c0132QnHx2 = c0132QnHx;
                                    if (objB2 == c0132QnHx2) {
                                    }
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                }
                                objB2 = new NUlFixed(h81Var);
                                j30VarQ.F0(objB2);
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                                z8 = false;
                            }
                            pg2 pg2Var17 = pg2VarY;
                            j30VarQ.R(z8);
                            if (z5) {
                                i13 = 1157296644;
                                z9 = false;
                            } else {
                                i13 = 1157296644;
                                z9 = false;
                            }
                            j30VarQ.e(i13);
                            zI2 = j30VarQ.I(h81Var);
                            objB1 = j30VarQ.b0();
                            if (zI2) {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            str7 = str4;
                            uh3.a(zBooleanValue, (h81) objB1, pg2Var17, z9, null, null, j30VarQ, 0, 48);
                            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                            pg2 pg2VarB1114 = xu3Var17.b(xu3Var17.a(qnHx, 1.0f, true), cQf1115);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(pg2VarB1114);
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
                            int i1111113 = (i3 >> 18) & 14;
                            int i1111114 = i3 >> 6;
                            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111113 | (i1111114 & 896) | (i1111114 & 7168));
                            int i1111115 = i3 >> 3;
                            a(z5, str6, str7, j30VarQ, i1111113 | (i1111115 & 112) | (i1111115 & 896));
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            j30VarQ.R(true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            str8 = str6;
                            bd3 bd3Var111 = bd3Var3;
                            z10 = z4;
                            str9 = str7;
                            z11 = z5;
                            bd3Var4 = bd3Var111;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                    }
                    i12 = 12582912;
                    i3 |= i12;
                    if ((23967451 & i3) == 4793490) {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf1116 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC18 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW18 = ps0.W(pg2VarC18, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW18);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var18 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf1117 = One.QnHx.k;
                        pg2 pg2VarB1115 = xu3Var18.b(qnHx, cQf1117);
                        LPt8Fixed lPt115 = LPt8Fixed.w;
                        mg3<a31> mg3Var18 = z21.a;
                        wo1.QnHx qnHx110 = wo1.a;
                        pg2VarY = pg2VarB1115.y(new a31(lPt115));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var18 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var18, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB1116 = xu3Var18.b(xu3Var18.a(qnHx, 1.0f, true), cQf1117);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB1116);
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
                        int i1111116 = (i3 >> 18) & 14;
                        int i1111117 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111116 | (i1111117 & 896) | (i1111117 & 7168));
                        int i1111118 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i1111116 | (i1111118 & 112) | (i1111118 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var112 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var112;
                    } else {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf1118 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC19 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW19 = ps0.W(pg2VarC19, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW19);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var19 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf1119 = One.QnHx.k;
                        pg2 pg2VarB1117 = xu3Var19.b(qnHx, cQf1119);
                        LPt8Fixed lPt116 = LPt8Fixed.w;
                        mg3<a31> mg3Var19 = z21.a;
                        wo1.QnHx qnHx111 = wo1.a;
                        pg2VarY = pg2VarB1117.y(new a31(lPt116));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var19 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var19, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB1118 = xu3Var19.b(xu3Var19.a(qnHx, 1.0f, true), cQf1119);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB1118);
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
                        int i1111119 = (i3 >> 18) & 14;
                        int i11111110 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111119 | (i11111110 & 896) | (i11111110 & 7168));
                        int i11111111 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i1111119 | (i11111111 & 112) | (i11111111 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var113 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var113;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                }
                i3 |= 196608;
                bd3Var2 = bd3Var;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (j30VarQ.c(z2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (j30VarQ.I(h81Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                    }
                    if ((23967451 & i3) == 4793490) {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf11110 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC110 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW110 = ps0.W(pg2VarC110, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW110);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var110 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf11111 = One.QnHx.k;
                        pg2 pg2VarB1119 = xu3Var110.b(qnHx, cQf11111);
                        LPt8Fixed lPt117 = LPt8Fixed.w;
                        mg3<a31> mg3Var110 = z21.a;
                        wo1.QnHx qnHx112 = wo1.a;
                        pg2VarY = pg2VarB1119.y(new a31(lPt117));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var110 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var110, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB11110 = xu3Var110.b(xu3Var110.a(qnHx, 1.0f, true), cQf11111);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB11110);
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
                        int i11111112 = (i3 >> 18) & 14;
                        int i11111113 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111112 | (i11111113 & 896) | (i11111113 & 7168));
                        int i11111114 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i11111112 | (i11111114 & 112) | (i11111114 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var114 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var114;
                    } else {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf11112 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC111 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW111 = ps0.W(pg2VarC111, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW111);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var111 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf11113 = One.QnHx.k;
                        pg2 pg2VarB11111 = xu3Var111.b(qnHx, cQf11113);
                        LPt8Fixed lPt118 = LPt8Fixed.w;
                        mg3<a31> mg3Var111 = z21.a;
                        wo1.QnHx qnHx113 = wo1.a;
                        pg2VarY = pg2VarB11111.y(new a31(lPt118));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var111 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var111, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB11112 = xu3Var111.b(xu3Var111.a(qnHx, 1.0f, true), cQf11113);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB11112);
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
                        int i11111115 = (i3 >> 18) & 14;
                        int i11111116 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111115 | (i11111116 & 896) | (i11111116 & 7168));
                        int i11111117 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i11111115 | (i11111117 & 112) | (i11111117 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var115 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var115;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                }
                i12 = 12582912;
                i3 |= i12;
                if ((23967451 & i3) == 4793490) {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf11114 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC112 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW112 = ps0.W(pg2VarC112, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW112);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var112 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf11115 = One.QnHx.k;
                    pg2 pg2VarB11113 = xu3Var112.b(qnHx, cQf11115);
                    LPt8Fixed lPt119 = LPt8Fixed.w;
                    mg3<a31> mg3Var112 = z21.a;
                    wo1.QnHx qnHx114 = wo1.a;
                    pg2VarY = pg2VarB11113.y(new a31(lPt119));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var112 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var112, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB11114 = xu3Var112.b(xu3Var112.a(qnHx, 1.0f, true), cQf11115);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB11114);
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
                    int i11111118 = (i3 >> 18) & 14;
                    int i11111119 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111118 | (i11111119 & 896) | (i11111119 & 7168));
                    int i111111110 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i11111118 | (i111111110 & 112) | (i111111110 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var116 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var116;
                } else {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf11116 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC113 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW113 = ps0.W(pg2VarC113, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW113);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var113 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf11117 = One.QnHx.k;
                    pg2 pg2VarB11115 = xu3Var113.b(qnHx, cQf11117);
                    LPt8Fixed lPt1110 = LPt8Fixed.w;
                    mg3<a31> mg3Var113 = z21.a;
                    wo1.QnHx qnHx115 = wo1.a;
                    pg2VarY = pg2VarB11115.y(new a31(lPt1110));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var113 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var113, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB11116 = xu3Var113.b(xu3Var113.a(qnHx, 1.0f, true), cQf11117);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB11116);
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
                    int i111111111 = (i3 >> 18) & 14;
                    int i111111112 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111 | (i111111112 & 896) | (i111111112 & 7168));
                    int i111111113 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i111111111 | (i111111113 & 112) | (i111111113 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var117 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var117;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
            }
            i3 |= 24576;
            z3 = z;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    bd3Var2 = bd3Var;
                    if (j30VarQ.I(bd3Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (j30VarQ.c(z2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (j30VarQ.I(h81Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                    }
                    if ((23967451 & i3) == 4793490) {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf11118 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC114 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW114 = ps0.W(pg2VarC114, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW114);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var114 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf11119 = One.QnHx.k;
                        pg2 pg2VarB11117 = xu3Var114.b(qnHx, cQf11119);
                        LPt8Fixed lPt1111 = LPt8Fixed.w;
                        mg3<a31> mg3Var114 = z21.a;
                        wo1.QnHx qnHx116 = wo1.a;
                        pg2VarY = pg2VarB11117.y(new a31(lPt1111));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var114 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var114, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB11118 = xu3Var114.b(xu3Var114.a(qnHx, 1.0f, true), cQf11119);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB11118);
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
                        int i111111114 = (i3 >> 18) & 14;
                        int i111111115 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111114 | (i111111115 & 896) | (i111111115 & 7168));
                        int i111111116 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i111111114 | (i111111116 & 112) | (i111111116 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var118 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var118;
                    } else {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf111110 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC115 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW115 = ps0.W(pg2VarC115, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW115);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var115 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf111111 = One.QnHx.k;
                        pg2 pg2VarB11119 = xu3Var115.b(qnHx, cQf111111);
                        LPt8Fixed lPt1112 = LPt8Fixed.w;
                        mg3<a31> mg3Var115 = z21.a;
                        wo1.QnHx qnHx117 = wo1.a;
                        pg2VarY = pg2VarB11119.y(new a31(lPt1112));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var115 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var115, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB111110 = xu3Var115.b(xu3Var115.a(qnHx, 1.0f, true), cQf111111);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB111110);
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
                        int i111111117 = (i3 >> 18) & 14;
                        int i111111118 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111117 | (i111111118 & 896) | (i111111118 & 7168));
                        int i111111119 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i111111117 | (i111111119 & 112) | (i111111119 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var119 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var119;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                }
                i12 = 12582912;
                i3 |= i12;
                if ((23967451 & i3) == 4793490) {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf111112 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC116 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW116 = ps0.W(pg2VarC116, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW116);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var116 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf111113 = One.QnHx.k;
                    pg2 pg2VarB111111 = xu3Var116.b(qnHx, cQf111113);
                    LPt8Fixed lPt1113 = LPt8Fixed.w;
                    mg3<a31> mg3Var116 = z21.a;
                    wo1.QnHx qnHx118 = wo1.a;
                    pg2VarY = pg2VarB111111.y(new a31(lPt1113));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var116 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var116, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB111112 = xu3Var116.b(xu3Var116.a(qnHx, 1.0f, true), cQf111113);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB111112);
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
                    int i1111111110 = (i3 >> 18) & 14;
                    int i1111111111 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111110 | (i1111111111 & 896) | (i1111111111 & 7168));
                    int i1111111112 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i1111111110 | (i1111111112 & 112) | (i1111111112 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var1110 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var1110;
                } else {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf111114 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC117 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW117 = ps0.W(pg2VarC117, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW117);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var117 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf111115 = One.QnHx.k;
                    pg2 pg2VarB111113 = xu3Var117.b(qnHx, cQf111115);
                    LPt8Fixed lPt1114 = LPt8Fixed.w;
                    mg3<a31> mg3Var117 = z21.a;
                    wo1.QnHx qnHx119 = wo1.a;
                    pg2VarY = pg2VarB111113.y(new a31(lPt1114));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var117 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var117, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB111114 = xu3Var117.b(xu3Var117.a(qnHx, 1.0f, true), cQf111115);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB111114);
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
                    int i1111111113 = (i3 >> 18) & 14;
                    int i1111111114 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111113 | (i1111111114 & 896) | (i1111111114 & 7168));
                    int i1111111115 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i1111111113 | (i1111111115 & 112) | (i1111111115 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var1111 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var1111;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
            }
            i3 |= 196608;
            bd3Var2 = bd3Var;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (j30VarQ.c(z2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (j30VarQ.I(h81Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf111116 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC118 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW118 = ps0.W(pg2VarC118, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW118);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var118 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf111117 = One.QnHx.k;
                    pg2 pg2VarB111115 = xu3Var118.b(qnHx, cQf111117);
                    LPt8Fixed lPt1115 = LPt8Fixed.w;
                    mg3<a31> mg3Var118 = z21.a;
                    wo1.QnHx qnHx1110 = wo1.a;
                    pg2VarY = pg2VarB111115.y(new a31(lPt1115));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var118 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var118, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB111116 = xu3Var118.b(xu3Var118.a(qnHx, 1.0f, true), cQf111117);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB111116);
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
                    int i1111111116 = (i3 >> 18) & 14;
                    int i1111111117 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111116 | (i1111111117 & 896) | (i1111111117 & 7168));
                    int i1111111118 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i1111111116 | (i1111111118 & 112) | (i1111111118 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var1112 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var1112;
                } else {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf111118 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC119 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW119 = ps0.W(pg2VarC119, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW119);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var119 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf111119 = One.QnHx.k;
                    pg2 pg2VarB111117 = xu3Var119.b(qnHx, cQf111119);
                    LPt8Fixed lPt1116 = LPt8Fixed.w;
                    mg3<a31> mg3Var119 = z21.a;
                    wo1.QnHx qnHx1111 = wo1.a;
                    pg2VarY = pg2VarB111117.y(new a31(lPt1116));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var119 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var119, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB111118 = xu3Var119.b(xu3Var119.a(qnHx, 1.0f, true), cQf111119);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB111118);
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
                    int i1111111119 = (i3 >> 18) & 14;
                    int i11111111110 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111119 | (i11111111110 & 896) | (i11111111110 & 7168));
                    int i11111111111 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i1111111119 | (i11111111111 & 112) | (i11111111111 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var1113 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var1113;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
            }
            i12 = 12582912;
            i3 |= i12;
            if ((23967451 & i3) == 4793490) {
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i8 != 0) {
                    bd3Var3 = bd3.StarOnly;
                } else {
                    bd3Var3 = bd3Var2;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                e40.CQf cQf1111110 = e40.a;
                if (bool != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (str4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                qnHx = pg2.QnHx.w;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI) {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarC1110 = hr.c(qnHx, z5, (h81) objB0, 6);
                f = 8;
                f2 = 16;
                if (z7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                if (z7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                pg2 pg2VarW1110 = ps0.W(pg2VarC1110, f, f3, f2, f4);
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
                szVarJ = S12N.j(pg2VarW1110);
                str6 = str5;
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
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                xu3 xu3Var1110 = xu3.a;
                j30VarQ.e(1102243231);
                da.CQf cQf1111111 = One.QnHx.k;
                pg2 pg2VarB111119 = xu3Var1110.b(qnHx, cQf1111111);
                LPt8Fixed lPt1117 = LPt8Fixed.w;
                mg3<a31> mg3Var1110 = z21.a;
                wo1.QnHx qnHx1112 = wo1.a;
                pg2VarY = pg2VarB111119.y(new a31(lPt1117));
                if (z5) {
                    j30VarQ.e(1157296644);
                    zI3 = j30VarQ.I(h81Var);
                    objB2 = j30VarQ.b0();
                    if (zI3) {
                        c0132QnHx2 = c0132QnHx;
                        if (objB2 == c0132QnHx2) {
                        }
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                    }
                    objB2 = new NUlFixed(h81Var);
                    j30VarQ.F0(objB2);
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                    z8 = false;
                }
                pg2 pg2Var1110 = pg2VarY;
                j30VarQ.R(z8);
                if (z5) {
                    i13 = 1157296644;
                    z9 = false;
                } else {
                    i13 = 1157296644;
                    z9 = false;
                }
                j30VarQ.e(i13);
                zI2 = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI2) {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                str7 = str4;
                uh3.a(zBooleanValue, (h81) objB1, pg2Var1110, z9, null, null, j30VarQ, 0, 48);
                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                pg2 pg2VarB1111110 = xu3Var1110.b(xu3Var1110.a(qnHx, 1.0f, true), cQf1111111);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(pg2VarB1111110);
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
                int i11111111112 = (i3 >> 18) & 14;
                int i11111111113 = i3 >> 6;
                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111112 | (i11111111113 & 896) | (i11111111113 & 7168));
                int i11111111114 = i3 >> 3;
                a(z5, str6, str7, j30VarQ, i11111111112 | (i11111111114 & 112) | (i11111111114 & 896));
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                str8 = str6;
                bd3 bd3Var1114 = bd3Var3;
                z10 = z4;
                str9 = str7;
                z11 = z5;
                bd3Var4 = bd3Var1114;
            } else {
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i8 != 0) {
                    bd3Var3 = bd3.StarOnly;
                } else {
                    bd3Var3 = bd3Var2;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                e40.CQf cQf1111112 = e40.a;
                if (bool != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (str4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                qnHx = pg2.QnHx.w;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI) {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarC1111 = hr.c(qnHx, z5, (h81) objB0, 6);
                f = 8;
                f2 = 16;
                if (z7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                if (z7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                pg2 pg2VarW1111 = ps0.W(pg2VarC1111, f, f3, f2, f4);
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
                szVarJ = S12N.j(pg2VarW1111);
                str6 = str5;
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
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                xu3 xu3Var1111 = xu3.a;
                j30VarQ.e(1102243231);
                da.CQf cQf1111113 = One.QnHx.k;
                pg2 pg2VarB1111111 = xu3Var1111.b(qnHx, cQf1111113);
                LPt8Fixed lPt1118 = LPt8Fixed.w;
                mg3<a31> mg3Var1111 = z21.a;
                wo1.QnHx qnHx1113 = wo1.a;
                pg2VarY = pg2VarB1111111.y(new a31(lPt1118));
                if (z5) {
                    j30VarQ.e(1157296644);
                    zI3 = j30VarQ.I(h81Var);
                    objB2 = j30VarQ.b0();
                    if (zI3) {
                        c0132QnHx2 = c0132QnHx;
                        if (objB2 == c0132QnHx2) {
                        }
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                    }
                    objB2 = new NUlFixed(h81Var);
                    j30VarQ.F0(objB2);
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                    z8 = false;
                }
                pg2 pg2Var1111 = pg2VarY;
                j30VarQ.R(z8);
                if (z5) {
                    i13 = 1157296644;
                    z9 = false;
                } else {
                    i13 = 1157296644;
                    z9 = false;
                }
                j30VarQ.e(i13);
                zI2 = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI2) {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                str7 = str4;
                uh3.a(zBooleanValue, (h81) objB1, pg2Var1111, z9, null, null, j30VarQ, 0, 48);
                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                pg2 pg2VarB1111112 = xu3Var1111.b(xu3Var1111.a(qnHx, 1.0f, true), cQf1111113);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(pg2VarB1111112);
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
                int i11111111115 = (i3 >> 18) & 14;
                int i11111111116 = i3 >> 6;
                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111115 | (i11111111116 & 896) | (i11111111116 & 7168));
                int i11111111117 = i3 >> 3;
                a(z5, str6, str7, j30VarQ, i11111111115 | (i11111111117 & 112) | (i11111111117 & 896));
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                str8 = str6;
                bd3 bd3Var1115 = bd3Var3;
                z10 = z4;
                str9 = str7;
                z11 = z5;
                bd3Var4 = bd3Var1115;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
        }
        i3 |= 384;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                str4 = str3;
                if (j30VarQ.I(str4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z3 = z;
                    if (j30VarQ.c(z3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        bd3Var2 = bd3Var;
                        if (j30VarQ.I(bd3Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (j30VarQ.c(z2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 128) != 0) {
                        if ((29360128 & i) == 0) {
                            if (j30VarQ.I(h81Var)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                        }
                        if ((23967451 & i3) == 4793490) {
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i8 != 0) {
                                bd3Var3 = bd3.StarOnly;
                            } else {
                                bd3Var3 = bd3Var2;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            e40.CQf cQf1111114 = e40.a;
                            if (bool != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (str4 == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            qnHx = pg2.QnHx.w;
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (zI) {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            } else {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarC1112 = hr.c(qnHx, z5, (h81) objB0, 6);
                            f = 8;
                            f2 = 16;
                            if (z7) {
                                f3 = f;
                            } else {
                                f3 = f2;
                            }
                            if (z7) {
                                f4 = f;
                            } else {
                                f4 = f2;
                            }
                            pg2 pg2VarW1112 = ps0.W(pg2VarC1112, f, f3, f2, f4);
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
                            szVarJ = S12N.j(pg2VarW1112);
                            str6 = str5;
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
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            xu3 xu3Var1112 = xu3.a;
                            j30VarQ.e(1102243231);
                            da.CQf cQf1111115 = One.QnHx.k;
                            pg2 pg2VarB1111113 = xu3Var1112.b(qnHx, cQf1111115);
                            LPt8Fixed lPt1119 = LPt8Fixed.w;
                            mg3<a31> mg3Var1112 = z21.a;
                            wo1.QnHx qnHx1114 = wo1.a;
                            pg2VarY = pg2VarB1111113.y(new a31(lPt1119));
                            if (z5) {
                                j30VarQ.e(1157296644);
                                zI3 = j30VarQ.I(h81Var);
                                objB2 = j30VarQ.b0();
                                if (zI3) {
                                    c0132QnHx2 = c0132QnHx;
                                    if (objB2 == c0132QnHx2) {
                                    }
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                }
                                objB2 = new NUlFixed(h81Var);
                                j30VarQ.F0(objB2);
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                                z8 = false;
                            }
                            pg2 pg2Var1112 = pg2VarY;
                            j30VarQ.R(z8);
                            if (z5) {
                                i13 = 1157296644;
                                z9 = false;
                            } else {
                                i13 = 1157296644;
                                z9 = false;
                            }
                            j30VarQ.e(i13);
                            zI2 = j30VarQ.I(h81Var);
                            objB1 = j30VarQ.b0();
                            if (zI2) {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            str7 = str4;
                            uh3.a(zBooleanValue, (h81) objB1, pg2Var1112, z9, null, null, j30VarQ, 0, 48);
                            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                            pg2 pg2VarB1111114 = xu3Var1112.b(xu3Var1112.a(qnHx, 1.0f, true), cQf1111115);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(pg2VarB1111114);
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
                            int i11111111118 = (i3 >> 18) & 14;
                            int i11111111119 = i3 >> 6;
                            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111118 | (i11111111119 & 896) | (i11111111119 & 7168));
                            int i111111111110 = i3 >> 3;
                            a(z5, str6, str7, j30VarQ, i11111111118 | (i111111111110 & 112) | (i111111111110 & 896));
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            j30VarQ.R(true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            str8 = str6;
                            bd3 bd3Var1116 = bd3Var3;
                            z10 = z4;
                            str9 = str7;
                            z11 = z5;
                            bd3Var4 = bd3Var1116;
                        } else {
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i8 != 0) {
                                bd3Var3 = bd3.StarOnly;
                            } else {
                                bd3Var3 = bd3Var2;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            e40.CQf cQf1111116 = e40.a;
                            if (bool != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (str4 == null) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            qnHx = pg2.QnHx.w;
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(h81Var);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (zI) {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            } else {
                                objB0 = new F1(h81Var);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarC1113 = hr.c(qnHx, z5, (h81) objB0, 6);
                            f = 8;
                            f2 = 16;
                            if (z7) {
                                f3 = f;
                            } else {
                                f3 = f2;
                            }
                            if (z7) {
                                f4 = f;
                            } else {
                                f4 = f2;
                            }
                            pg2 pg2VarW1113 = ps0.W(pg2VarC1113, f, f3, f2, f4);
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
                            szVarJ = S12N.j(pg2VarW1113);
                            str6 = str5;
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
                            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                            xu3 xu3Var1113 = xu3.a;
                            j30VarQ.e(1102243231);
                            da.CQf cQf1111117 = One.QnHx.k;
                            pg2 pg2VarB1111115 = xu3Var1113.b(qnHx, cQf1111117);
                            LPt8Fixed lPt11110 = LPt8Fixed.w;
                            mg3<a31> mg3Var1113 = z21.a;
                            wo1.QnHx qnHx1115 = wo1.a;
                            pg2VarY = pg2VarB1111115.y(new a31(lPt11110));
                            if (z5) {
                                j30VarQ.e(1157296644);
                                zI3 = j30VarQ.I(h81Var);
                                objB2 = j30VarQ.b0();
                                if (zI3) {
                                    c0132QnHx2 = c0132QnHx;
                                    if (objB2 == c0132QnHx2) {
                                    }
                                    z8 = false;
                                    j30VarQ.R(false);
                                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                                } else {
                                    c0132QnHx2 = c0132QnHx;
                                }
                                objB2 = new NUlFixed(h81Var);
                                j30VarQ.F0(objB2);
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                                z8 = false;
                            }
                            pg2 pg2Var1113 = pg2VarY;
                            j30VarQ.R(z8);
                            if (z5) {
                                i13 = 1157296644;
                                z9 = false;
                            } else {
                                i13 = 1157296644;
                                z9 = false;
                            }
                            j30VarQ.e(i13);
                            zI2 = j30VarQ.I(h81Var);
                            objB1 = j30VarQ.b0();
                            if (zI2) {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new YKK(h81Var);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            str7 = str4;
                            uh3.a(zBooleanValue, (h81) objB1, pg2Var1113, z9, null, null, j30VarQ, 0, 48);
                            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                            pg2 pg2VarB1111116 = xu3Var1113.b(xu3Var1113.a(qnHx, 1.0f, true), cQf1111117);
                            j30VarQ.e(-483455358);
                            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                            j30VarQ.e(-1323940314);
                            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                            szVarJ2 = S12N.j(pg2VarB1111116);
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
                            int i111111111111 = (i3 >> 18) & 14;
                            int i111111111112 = i3 >> 6;
                            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111111 | (i111111111112 & 896) | (i111111111112 & 7168));
                            int i111111111113 = i3 >> 3;
                            a(z5, str6, str7, j30VarQ, i111111111111 | (i111111111113 & 112) | (i111111111113 & 896));
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            j30VarQ.R(true);
                            j30VarQ.R(false);
                            j30VarQ.R(false);
                            O.g(j30VarQ, false, false, true, false);
                            j30VarQ.R(false);
                            str8 = str6;
                            bd3 bd3Var1117 = bd3Var3;
                            z10 = z4;
                            str9 = str7;
                            z11 = z5;
                            bd3Var4 = bd3Var1117;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                    }
                    i12 = 12582912;
                    i3 |= i12;
                    if ((23967451 & i3) == 4793490) {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf1111118 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC1114 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW1114 = ps0.W(pg2VarC1114, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW1114);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var1114 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf1111119 = One.QnHx.k;
                        pg2 pg2VarB1111117 = xu3Var1114.b(qnHx, cQf1111119);
                        LPt8Fixed lPt11111 = LPt8Fixed.w;
                        mg3<a31> mg3Var1114 = z21.a;
                        wo1.QnHx qnHx1116 = wo1.a;
                        pg2VarY = pg2VarB1111117.y(new a31(lPt11111));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var1114 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var1114, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB1111118 = xu3Var1114.b(xu3Var1114.a(qnHx, 1.0f, true), cQf1111119);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB1111118);
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
                        int i111111111114 = (i3 >> 18) & 14;
                        int i111111111115 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111114 | (i111111111115 & 896) | (i111111111115 & 7168));
                        int i111111111116 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i111111111114 | (i111111111116 & 112) | (i111111111116 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var1118 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var1118;
                    } else {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf11111110 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC1115 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW1115 = ps0.W(pg2VarC1115, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW1115);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var1115 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf11111111 = One.QnHx.k;
                        pg2 pg2VarB1111119 = xu3Var1115.b(qnHx, cQf11111111);
                        LPt8Fixed lPt11112 = LPt8Fixed.w;
                        mg3<a31> mg3Var1115 = z21.a;
                        wo1.QnHx qnHx1117 = wo1.a;
                        pg2VarY = pg2VarB1111119.y(new a31(lPt11112));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var1115 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var1115, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB11111110 = xu3Var1115.b(xu3Var1115.a(qnHx, 1.0f, true), cQf11111111);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB11111110);
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
                        int i111111111117 = (i3 >> 18) & 14;
                        int i111111111118 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111117 | (i111111111118 & 896) | (i111111111118 & 7168));
                        int i111111111119 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i111111111117 | (i111111111119 & 112) | (i111111111119 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var1119 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var1119;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                }
                i3 |= 196608;
                bd3Var2 = bd3Var;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (j30VarQ.c(z2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (j30VarQ.I(h81Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                    }
                    if ((23967451 & i3) == 4793490) {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf11111112 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC1116 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW1116 = ps0.W(pg2VarC1116, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW1116);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var1116 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf11111113 = One.QnHx.k;
                        pg2 pg2VarB11111111 = xu3Var1116.b(qnHx, cQf11111113);
                        LPt8Fixed lPt11113 = LPt8Fixed.w;
                        mg3<a31> mg3Var1116 = z21.a;
                        wo1.QnHx qnHx1118 = wo1.a;
                        pg2VarY = pg2VarB11111111.y(new a31(lPt11113));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var1116 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var1116, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB11111112 = xu3Var1116.b(xu3Var1116.a(qnHx, 1.0f, true), cQf11111113);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB11111112);
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
                        int i1111111111110 = (i3 >> 18) & 14;
                        int i1111111111111 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111110 | (i1111111111111 & 896) | (i1111111111111 & 7168));
                        int i1111111111112 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i1111111111110 | (i1111111111112 & 112) | (i1111111111112 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var11110 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var11110;
                    } else {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf11111114 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC1117 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW1117 = ps0.W(pg2VarC1117, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW1117);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var1117 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf11111115 = One.QnHx.k;
                        pg2 pg2VarB11111113 = xu3Var1117.b(qnHx, cQf11111115);
                        LPt8Fixed lPt11114 = LPt8Fixed.w;
                        mg3<a31> mg3Var1117 = z21.a;
                        wo1.QnHx qnHx1119 = wo1.a;
                        pg2VarY = pg2VarB11111113.y(new a31(lPt11114));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var1117 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var1117, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB11111114 = xu3Var1117.b(xu3Var1117.a(qnHx, 1.0f, true), cQf11111115);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB11111114);
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
                        int i1111111111113 = (i3 >> 18) & 14;
                        int i1111111111114 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111113 | (i1111111111114 & 896) | (i1111111111114 & 7168));
                        int i1111111111115 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i1111111111113 | (i1111111111115 & 112) | (i1111111111115 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var11111 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var11111;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                }
                i12 = 12582912;
                i3 |= i12;
                if ((23967451 & i3) == 4793490) {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf11111116 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC1118 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW1118 = ps0.W(pg2VarC1118, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW1118);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var1118 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf11111117 = One.QnHx.k;
                    pg2 pg2VarB11111115 = xu3Var1118.b(qnHx, cQf11111117);
                    LPt8Fixed lPt11115 = LPt8Fixed.w;
                    mg3<a31> mg3Var1118 = z21.a;
                    wo1.QnHx qnHx11110 = wo1.a;
                    pg2VarY = pg2VarB11111115.y(new a31(lPt11115));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var1118 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var1118, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB11111116 = xu3Var1118.b(xu3Var1118.a(qnHx, 1.0f, true), cQf11111117);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB11111116);
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
                    int i1111111111116 = (i3 >> 18) & 14;
                    int i1111111111117 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111116 | (i1111111111117 & 896) | (i1111111111117 & 7168));
                    int i1111111111118 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i1111111111116 | (i1111111111118 & 112) | (i1111111111118 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var11112 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var11112;
                } else {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf11111118 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC1119 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW1119 = ps0.W(pg2VarC1119, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW1119);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var1119 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf11111119 = One.QnHx.k;
                    pg2 pg2VarB11111117 = xu3Var1119.b(qnHx, cQf11111119);
                    LPt8Fixed lPt11116 = LPt8Fixed.w;
                    mg3<a31> mg3Var1119 = z21.a;
                    wo1.QnHx qnHx11111 = wo1.a;
                    pg2VarY = pg2VarB11111117.y(new a31(lPt11116));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var1119 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var1119, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB11111118 = xu3Var1119.b(xu3Var1119.a(qnHx, 1.0f, true), cQf11111119);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB11111118);
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
                    int i1111111111119 = (i3 >> 18) & 14;
                    int i11111111111110 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111119 | (i11111111111110 & 896) | (i11111111111110 & 7168));
                    int i11111111111111 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i1111111111119 | (i11111111111111 & 112) | (i11111111111111 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var11113 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var11113;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
            }
            i3 |= 24576;
            z3 = z;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    bd3Var2 = bd3Var;
                    if (j30VarQ.I(bd3Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (j30VarQ.c(z2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (j30VarQ.I(h81Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                    }
                    if ((23967451 & i3) == 4793490) {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf111111110 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC11110 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW11110 = ps0.W(pg2VarC11110, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW11110);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var11110 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf111111111 = One.QnHx.k;
                        pg2 pg2VarB11111119 = xu3Var11110.b(qnHx, cQf111111111);
                        LPt8Fixed lPt11117 = LPt8Fixed.w;
                        mg3<a31> mg3Var11110 = z21.a;
                        wo1.QnHx qnHx11112 = wo1.a;
                        pg2VarY = pg2VarB11111119.y(new a31(lPt11117));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var11110 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var11110, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB111111110 = xu3Var11110.b(xu3Var11110.a(qnHx, 1.0f, true), cQf111111111);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB111111110);
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
                        int i11111111111112 = (i3 >> 18) & 14;
                        int i11111111111113 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111111112 | (i11111111111113 & 896) | (i11111111111113 & 7168));
                        int i11111111111114 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i11111111111112 | (i11111111111114 & 112) | (i11111111111114 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var11114 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var11114;
                    } else {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf111111112 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC11111 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW11111 = ps0.W(pg2VarC11111, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW11111);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var11111 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf111111113 = One.QnHx.k;
                        pg2 pg2VarB111111111 = xu3Var11111.b(qnHx, cQf111111113);
                        LPt8Fixed lPt11118 = LPt8Fixed.w;
                        mg3<a31> mg3Var11111 = z21.a;
                        wo1.QnHx qnHx11113 = wo1.a;
                        pg2VarY = pg2VarB111111111.y(new a31(lPt11118));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var11111 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var11111, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB111111112 = xu3Var11111.b(xu3Var11111.a(qnHx, 1.0f, true), cQf111111113);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB111111112);
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
                        int i11111111111115 = (i3 >> 18) & 14;
                        int i11111111111116 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111111115 | (i11111111111116 & 896) | (i11111111111116 & 7168));
                        int i11111111111117 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i11111111111115 | (i11111111111117 & 112) | (i11111111111117 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var11115 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var11115;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                }
                i12 = 12582912;
                i3 |= i12;
                if ((23967451 & i3) == 4793490) {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf111111114 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC11112 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW11112 = ps0.W(pg2VarC11112, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW11112);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var11112 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf111111115 = One.QnHx.k;
                    pg2 pg2VarB111111113 = xu3Var11112.b(qnHx, cQf111111115);
                    LPt8Fixed lPt11119 = LPt8Fixed.w;
                    mg3<a31> mg3Var11112 = z21.a;
                    wo1.QnHx qnHx11114 = wo1.a;
                    pg2VarY = pg2VarB111111113.y(new a31(lPt11119));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var11112 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var11112, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB111111114 = xu3Var11112.b(xu3Var11112.a(qnHx, 1.0f, true), cQf111111115);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB111111114);
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
                    int i11111111111118 = (i3 >> 18) & 14;
                    int i11111111111119 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111111118 | (i11111111111119 & 896) | (i11111111111119 & 7168));
                    int i111111111111110 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i11111111111118 | (i111111111111110 & 112) | (i111111111111110 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var11116 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var11116;
                } else {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf111111116 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC11113 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW11113 = ps0.W(pg2VarC11113, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW11113);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var11113 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf111111117 = One.QnHx.k;
                    pg2 pg2VarB111111115 = xu3Var11113.b(qnHx, cQf111111117);
                    LPt8Fixed lPt111110 = LPt8Fixed.w;
                    mg3<a31> mg3Var11113 = z21.a;
                    wo1.QnHx qnHx11115 = wo1.a;
                    pg2VarY = pg2VarB111111115.y(new a31(lPt111110));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var11113 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var11113, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB111111116 = xu3Var11113.b(xu3Var11113.a(qnHx, 1.0f, true), cQf111111117);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB111111116);
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
                    int i111111111111111 = (i3 >> 18) & 14;
                    int i111111111111112 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111111111 | (i111111111111112 & 896) | (i111111111111112 & 7168));
                    int i111111111111113 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i111111111111111 | (i111111111111113 & 112) | (i111111111111113 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var11117 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var11117;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
            }
            i3 |= 196608;
            bd3Var2 = bd3Var;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (j30VarQ.c(z2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (j30VarQ.I(h81Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf111111118 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC11114 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW11114 = ps0.W(pg2VarC11114, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW11114);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var11114 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf111111119 = One.QnHx.k;
                    pg2 pg2VarB111111117 = xu3Var11114.b(qnHx, cQf111111119);
                    LPt8Fixed lPt111111 = LPt8Fixed.w;
                    mg3<a31> mg3Var11114 = z21.a;
                    wo1.QnHx qnHx11116 = wo1.a;
                    pg2VarY = pg2VarB111111117.y(new a31(lPt111111));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var11114 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var11114, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB111111118 = xu3Var11114.b(xu3Var11114.a(qnHx, 1.0f, true), cQf111111119);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB111111118);
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
                    int i111111111111114 = (i3 >> 18) & 14;
                    int i111111111111115 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111111114 | (i111111111111115 & 896) | (i111111111111115 & 7168));
                    int i111111111111116 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i111111111111114 | (i111111111111116 & 112) | (i111111111111116 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var11118 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var11118;
                } else {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf1111111110 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC11115 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW11115 = ps0.W(pg2VarC11115, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW11115);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var11115 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf1111111111 = One.QnHx.k;
                    pg2 pg2VarB111111119 = xu3Var11115.b(qnHx, cQf1111111111);
                    LPt8Fixed lPt111112 = LPt8Fixed.w;
                    mg3<a31> mg3Var11115 = z21.a;
                    wo1.QnHx qnHx11117 = wo1.a;
                    pg2VarY = pg2VarB111111119.y(new a31(lPt111112));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var11115 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var11115, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB1111111110 = xu3Var11115.b(xu3Var11115.a(qnHx, 1.0f, true), cQf1111111111);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB1111111110);
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
                    int i111111111111117 = (i3 >> 18) & 14;
                    int i111111111111118 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111111117 | (i111111111111118 & 896) | (i111111111111118 & 7168));
                    int i111111111111119 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i111111111111117 | (i111111111111119 & 112) | (i111111111111119 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var11119 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var11119;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
            }
            i12 = 12582912;
            i3 |= i12;
            if ((23967451 & i3) == 4793490) {
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i8 != 0) {
                    bd3Var3 = bd3.StarOnly;
                } else {
                    bd3Var3 = bd3Var2;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                e40.CQf cQf1111111112 = e40.a;
                if (bool != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (str4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                qnHx = pg2.QnHx.w;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI) {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarC11116 = hr.c(qnHx, z5, (h81) objB0, 6);
                f = 8;
                f2 = 16;
                if (z7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                if (z7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                pg2 pg2VarW11116 = ps0.W(pg2VarC11116, f, f3, f2, f4);
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
                szVarJ = S12N.j(pg2VarW11116);
                str6 = str5;
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
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                xu3 xu3Var11116 = xu3.a;
                j30VarQ.e(1102243231);
                da.CQf cQf1111111113 = One.QnHx.k;
                pg2 pg2VarB1111111111 = xu3Var11116.b(qnHx, cQf1111111113);
                LPt8Fixed lPt111113 = LPt8Fixed.w;
                mg3<a31> mg3Var11116 = z21.a;
                wo1.QnHx qnHx11118 = wo1.a;
                pg2VarY = pg2VarB1111111111.y(new a31(lPt111113));
                if (z5) {
                    j30VarQ.e(1157296644);
                    zI3 = j30VarQ.I(h81Var);
                    objB2 = j30VarQ.b0();
                    if (zI3) {
                        c0132QnHx2 = c0132QnHx;
                        if (objB2 == c0132QnHx2) {
                        }
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                    }
                    objB2 = new NUlFixed(h81Var);
                    j30VarQ.F0(objB2);
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                    z8 = false;
                }
                pg2 pg2Var11116 = pg2VarY;
                j30VarQ.R(z8);
                if (z5) {
                    i13 = 1157296644;
                    z9 = false;
                } else {
                    i13 = 1157296644;
                    z9 = false;
                }
                j30VarQ.e(i13);
                zI2 = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI2) {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                str7 = str4;
                uh3.a(zBooleanValue, (h81) objB1, pg2Var11116, z9, null, null, j30VarQ, 0, 48);
                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                pg2 pg2VarB1111111112 = xu3Var11116.b(xu3Var11116.a(qnHx, 1.0f, true), cQf1111111113);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(pg2VarB1111111112);
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
                int i1111111111111110 = (i3 >> 18) & 14;
                int i1111111111111111 = i3 >> 6;
                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111111110 | (i1111111111111111 & 896) | (i1111111111111111 & 7168));
                int i1111111111111112 = i3 >> 3;
                a(z5, str6, str7, j30VarQ, i1111111111111110 | (i1111111111111112 & 112) | (i1111111111111112 & 896));
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                str8 = str6;
                bd3 bd3Var111110 = bd3Var3;
                z10 = z4;
                str9 = str7;
                z11 = z5;
                bd3Var4 = bd3Var111110;
            } else {
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i8 != 0) {
                    bd3Var3 = bd3.StarOnly;
                } else {
                    bd3Var3 = bd3Var2;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                e40.CQf cQf1111111114 = e40.a;
                if (bool != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (str4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                qnHx = pg2.QnHx.w;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI) {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarC11117 = hr.c(qnHx, z5, (h81) objB0, 6);
                f = 8;
                f2 = 16;
                if (z7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                if (z7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                pg2 pg2VarW11117 = ps0.W(pg2VarC11117, f, f3, f2, f4);
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
                szVarJ = S12N.j(pg2VarW11117);
                str6 = str5;
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
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                xu3 xu3Var11117 = xu3.a;
                j30VarQ.e(1102243231);
                da.CQf cQf1111111115 = One.QnHx.k;
                pg2 pg2VarB1111111113 = xu3Var11117.b(qnHx, cQf1111111115);
                LPt8Fixed lPt111114 = LPt8Fixed.w;
                mg3<a31> mg3Var11117 = z21.a;
                wo1.QnHx qnHx11119 = wo1.a;
                pg2VarY = pg2VarB1111111113.y(new a31(lPt111114));
                if (z5) {
                    j30VarQ.e(1157296644);
                    zI3 = j30VarQ.I(h81Var);
                    objB2 = j30VarQ.b0();
                    if (zI3) {
                        c0132QnHx2 = c0132QnHx;
                        if (objB2 == c0132QnHx2) {
                        }
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                    }
                    objB2 = new NUlFixed(h81Var);
                    j30VarQ.F0(objB2);
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                    z8 = false;
                }
                pg2 pg2Var11117 = pg2VarY;
                j30VarQ.R(z8);
                if (z5) {
                    i13 = 1157296644;
                    z9 = false;
                } else {
                    i13 = 1157296644;
                    z9 = false;
                }
                j30VarQ.e(i13);
                zI2 = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI2) {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                str7 = str4;
                uh3.a(zBooleanValue, (h81) objB1, pg2Var11117, z9, null, null, j30VarQ, 0, 48);
                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                pg2 pg2VarB1111111114 = xu3Var11117.b(xu3Var11117.a(qnHx, 1.0f, true), cQf1111111115);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(pg2VarB1111111114);
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
                int i1111111111111113 = (i3 >> 18) & 14;
                int i1111111111111114 = i3 >> 6;
                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111111113 | (i1111111111111114 & 896) | (i1111111111111114 & 7168));
                int i1111111111111115 = i3 >> 3;
                a(z5, str6, str7, j30VarQ, i1111111111111113 | (i1111111111111115 & 112) | (i1111111111111115 & 896));
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                str8 = str6;
                bd3 bd3Var111111 = bd3Var3;
                z10 = z4;
                str9 = str7;
                z11 = z5;
                bd3Var4 = bd3Var111111;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
        }
        i3 |= 3072;
        str4 = str3;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                z3 = z;
                if (j30VarQ.c(z3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    bd3Var2 = bd3Var;
                    if (j30VarQ.I(bd3Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (j30VarQ.c(z2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (j30VarQ.I(h81Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                    }
                    if ((23967451 & i3) == 4793490) {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf1111111116 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC11118 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW11118 = ps0.W(pg2VarC11118, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW11118);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var11118 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf1111111117 = One.QnHx.k;
                        pg2 pg2VarB1111111115 = xu3Var11118.b(qnHx, cQf1111111117);
                        LPt8Fixed lPt111115 = LPt8Fixed.w;
                        mg3<a31> mg3Var11118 = z21.a;
                        wo1.QnHx qnHx111110 = wo1.a;
                        pg2VarY = pg2VarB1111111115.y(new a31(lPt111115));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var11118 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var11118, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB1111111116 = xu3Var11118.b(xu3Var11118.a(qnHx, 1.0f, true), cQf1111111117);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB1111111116);
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
                        int i1111111111111116 = (i3 >> 18) & 14;
                        int i1111111111111117 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111111116 | (i1111111111111117 & 896) | (i1111111111111117 & 7168));
                        int i1111111111111118 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i1111111111111116 | (i1111111111111118 & 112) | (i1111111111111118 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var111112 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var111112;
                    } else {
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i8 != 0) {
                            bd3Var3 = bd3.StarOnly;
                        } else {
                            bd3Var3 = bd3Var2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        e40.CQf cQf1111111118 = e40.a;
                        if (bool != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (str4 == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        qnHx = pg2.QnHx.w;
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(h81Var);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (zI) {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        } else {
                            objB0 = new F1(h81Var);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarC11119 = hr.c(qnHx, z5, (h81) objB0, 6);
                        f = 8;
                        f2 = 16;
                        if (z7) {
                            f3 = f;
                        } else {
                            f3 = f2;
                        }
                        if (z7) {
                            f4 = f;
                        } else {
                            f4 = f2;
                        }
                        pg2 pg2VarW11119 = ps0.W(pg2VarC11119, f, f3, f2, f4);
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
                        szVarJ = S12N.j(pg2VarW11119);
                        str6 = str5;
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
                        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                        xu3 xu3Var11119 = xu3.a;
                        j30VarQ.e(1102243231);
                        da.CQf cQf1111111119 = One.QnHx.k;
                        pg2 pg2VarB1111111117 = xu3Var11119.b(qnHx, cQf1111111119);
                        LPt8Fixed lPt111116 = LPt8Fixed.w;
                        mg3<a31> mg3Var11119 = z21.a;
                        wo1.QnHx qnHx111111 = wo1.a;
                        pg2VarY = pg2VarB1111111117.y(new a31(lPt111116));
                        if (z5) {
                            j30VarQ.e(1157296644);
                            zI3 = j30VarQ.I(h81Var);
                            objB2 = j30VarQ.b0();
                            if (zI3) {
                                c0132QnHx2 = c0132QnHx;
                                if (objB2 == c0132QnHx2) {
                                }
                                z8 = false;
                                j30VarQ.R(false);
                                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                            } else {
                                c0132QnHx2 = c0132QnHx;
                            }
                            objB2 = new NUlFixed(h81Var);
                            j30VarQ.F0(objB2);
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                            z8 = false;
                        }
                        pg2 pg2Var11119 = pg2VarY;
                        j30VarQ.R(z8);
                        if (z5) {
                            i13 = 1157296644;
                            z9 = false;
                        } else {
                            i13 = 1157296644;
                            z9 = false;
                        }
                        j30VarQ.e(i13);
                        zI2 = j30VarQ.I(h81Var);
                        objB1 = j30VarQ.b0();
                        if (zI2) {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new YKK(h81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        str7 = str4;
                        uh3.a(zBooleanValue, (h81) objB1, pg2Var11119, z9, null, null, j30VarQ, 0, 48);
                        hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                        pg2 pg2VarB1111111118 = xu3Var11119.b(xu3Var11119.a(qnHx, 1.0f, true), cQf1111111119);
                        j30VarQ.e(-483455358);
                        rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                        jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                        ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                        szVarJ2 = S12N.j(pg2VarB1111111118);
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
                        int i1111111111111119 = (i3 >> 18) & 14;
                        int i11111111111111110 = i3 >> 6;
                        c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111111119 | (i11111111111111110 & 896) | (i11111111111111110 & 7168));
                        int i11111111111111111 = i3 >> 3;
                        a(z5, str6, str7, j30VarQ, i1111111111111119 | (i11111111111111111 & 112) | (i11111111111111111 & 896));
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        j30VarQ.R(true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        O.g(j30VarQ, false, false, true, false);
                        j30VarQ.R(false);
                        str8 = str6;
                        bd3 bd3Var111113 = bd3Var3;
                        z10 = z4;
                        str9 = str7;
                        z11 = z5;
                        bd3Var4 = bd3Var111113;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
                }
                i12 = 12582912;
                i3 |= i12;
                if ((23967451 & i3) == 4793490) {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf11111111110 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC111110 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW111110 = ps0.W(pg2VarC111110, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW111110);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var111110 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf11111111111 = One.QnHx.k;
                    pg2 pg2VarB1111111119 = xu3Var111110.b(qnHx, cQf11111111111);
                    LPt8Fixed lPt111117 = LPt8Fixed.w;
                    mg3<a31> mg3Var111110 = z21.a;
                    wo1.QnHx qnHx111112 = wo1.a;
                    pg2VarY = pg2VarB1111111119.y(new a31(lPt111117));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var111110 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var111110, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB11111111110 = xu3Var111110.b(xu3Var111110.a(qnHx, 1.0f, true), cQf11111111111);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB11111111110);
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
                    int i11111111111111112 = (i3 >> 18) & 14;
                    int i11111111111111113 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111111111112 | (i11111111111111113 & 896) | (i11111111111111113 & 7168));
                    int i11111111111111114 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i11111111111111112 | (i11111111111111114 & 112) | (i11111111111111114 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var111114 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var111114;
                } else {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf11111111112 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC111111 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW111111 = ps0.W(pg2VarC111111, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW111111);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var111111 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf11111111113 = One.QnHx.k;
                    pg2 pg2VarB11111111111 = xu3Var111111.b(qnHx, cQf11111111113);
                    LPt8Fixed lPt111118 = LPt8Fixed.w;
                    mg3<a31> mg3Var111111 = z21.a;
                    wo1.QnHx qnHx111113 = wo1.a;
                    pg2VarY = pg2VarB11111111111.y(new a31(lPt111118));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var111111 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var111111, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB11111111112 = xu3Var111111.b(xu3Var111111.a(qnHx, 1.0f, true), cQf11111111113);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB11111111112);
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
                    int i11111111111111115 = (i3 >> 18) & 14;
                    int i11111111111111116 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111111111115 | (i11111111111111116 & 896) | (i11111111111111116 & 7168));
                    int i11111111111111117 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i11111111111111115 | (i11111111111111117 & 112) | (i11111111111111117 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var111115 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var111115;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
            }
            i3 |= 196608;
            bd3Var2 = bd3Var;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (j30VarQ.c(z2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (j30VarQ.I(h81Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf11111111114 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC111112 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW111112 = ps0.W(pg2VarC111112, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW111112);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var111112 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf11111111115 = One.QnHx.k;
                    pg2 pg2VarB11111111113 = xu3Var111112.b(qnHx, cQf11111111115);
                    LPt8Fixed lPt111119 = LPt8Fixed.w;
                    mg3<a31> mg3Var111112 = z21.a;
                    wo1.QnHx qnHx111114 = wo1.a;
                    pg2VarY = pg2VarB11111111113.y(new a31(lPt111119));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var111112 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var111112, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB11111111114 = xu3Var111112.b(xu3Var111112.a(qnHx, 1.0f, true), cQf11111111115);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB11111111114);
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
                    int i11111111111111118 = (i3 >> 18) & 14;
                    int i11111111111111119 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111111111118 | (i11111111111111119 & 896) | (i11111111111111119 & 7168));
                    int i111111111111111110 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i11111111111111118 | (i111111111111111110 & 112) | (i111111111111111110 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var111116 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var111116;
                } else {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf11111111116 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC111113 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW111113 = ps0.W(pg2VarC111113, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW111113);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var111113 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf11111111117 = One.QnHx.k;
                    pg2 pg2VarB11111111115 = xu3Var111113.b(qnHx, cQf11111111117);
                    LPt8Fixed lPt1111110 = LPt8Fixed.w;
                    mg3<a31> mg3Var111113 = z21.a;
                    wo1.QnHx qnHx111115 = wo1.a;
                    pg2VarY = pg2VarB11111111115.y(new a31(lPt1111110));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var111113 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var111113, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB11111111116 = xu3Var111113.b(xu3Var111113.a(qnHx, 1.0f, true), cQf11111111117);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB11111111116);
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
                    int i111111111111111111 = (i3 >> 18) & 14;
                    int i111111111111111112 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111111111111 | (i111111111111111112 & 896) | (i111111111111111112 & 7168));
                    int i111111111111111113 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i111111111111111111 | (i111111111111111113 & 112) | (i111111111111111113 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var111117 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var111117;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
            }
            i12 = 12582912;
            i3 |= i12;
            if ((23967451 & i3) == 4793490) {
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i8 != 0) {
                    bd3Var3 = bd3.StarOnly;
                } else {
                    bd3Var3 = bd3Var2;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                e40.CQf cQf11111111118 = e40.a;
                if (bool != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (str4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                qnHx = pg2.QnHx.w;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI) {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarC111114 = hr.c(qnHx, z5, (h81) objB0, 6);
                f = 8;
                f2 = 16;
                if (z7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                if (z7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                pg2 pg2VarW111114 = ps0.W(pg2VarC111114, f, f3, f2, f4);
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
                szVarJ = S12N.j(pg2VarW111114);
                str6 = str5;
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
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                xu3 xu3Var111114 = xu3.a;
                j30VarQ.e(1102243231);
                da.CQf cQf11111111119 = One.QnHx.k;
                pg2 pg2VarB11111111117 = xu3Var111114.b(qnHx, cQf11111111119);
                LPt8Fixed lPt1111111 = LPt8Fixed.w;
                mg3<a31> mg3Var111114 = z21.a;
                wo1.QnHx qnHx111116 = wo1.a;
                pg2VarY = pg2VarB11111111117.y(new a31(lPt1111111));
                if (z5) {
                    j30VarQ.e(1157296644);
                    zI3 = j30VarQ.I(h81Var);
                    objB2 = j30VarQ.b0();
                    if (zI3) {
                        c0132QnHx2 = c0132QnHx;
                        if (objB2 == c0132QnHx2) {
                        }
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                    }
                    objB2 = new NUlFixed(h81Var);
                    j30VarQ.F0(objB2);
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                    z8 = false;
                }
                pg2 pg2Var111114 = pg2VarY;
                j30VarQ.R(z8);
                if (z5) {
                    i13 = 1157296644;
                    z9 = false;
                } else {
                    i13 = 1157296644;
                    z9 = false;
                }
                j30VarQ.e(i13);
                zI2 = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI2) {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                str7 = str4;
                uh3.a(zBooleanValue, (h81) objB1, pg2Var111114, z9, null, null, j30VarQ, 0, 48);
                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                pg2 pg2VarB11111111118 = xu3Var111114.b(xu3Var111114.a(qnHx, 1.0f, true), cQf11111111119);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(pg2VarB11111111118);
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
                int i111111111111111114 = (i3 >> 18) & 14;
                int i111111111111111115 = i3 >> 6;
                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111111111114 | (i111111111111111115 & 896) | (i111111111111111115 & 7168));
                int i111111111111111116 = i3 >> 3;
                a(z5, str6, str7, j30VarQ, i111111111111111114 | (i111111111111111116 & 112) | (i111111111111111116 & 896));
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                str8 = str6;
                bd3 bd3Var111118 = bd3Var3;
                z10 = z4;
                str9 = str7;
                z11 = z5;
                bd3Var4 = bd3Var111118;
            } else {
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i8 != 0) {
                    bd3Var3 = bd3.StarOnly;
                } else {
                    bd3Var3 = bd3Var2;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                e40.CQf cQf111111111110 = e40.a;
                if (bool != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (str4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                qnHx = pg2.QnHx.w;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI) {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarC111115 = hr.c(qnHx, z5, (h81) objB0, 6);
                f = 8;
                f2 = 16;
                if (z7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                if (z7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                pg2 pg2VarW111115 = ps0.W(pg2VarC111115, f, f3, f2, f4);
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
                szVarJ = S12N.j(pg2VarW111115);
                str6 = str5;
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
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                xu3 xu3Var111115 = xu3.a;
                j30VarQ.e(1102243231);
                da.CQf cQf111111111111 = One.QnHx.k;
                pg2 pg2VarB11111111119 = xu3Var111115.b(qnHx, cQf111111111111);
                LPt8Fixed lPt1111112 = LPt8Fixed.w;
                mg3<a31> mg3Var111115 = z21.a;
                wo1.QnHx qnHx111117 = wo1.a;
                pg2VarY = pg2VarB11111111119.y(new a31(lPt1111112));
                if (z5) {
                    j30VarQ.e(1157296644);
                    zI3 = j30VarQ.I(h81Var);
                    objB2 = j30VarQ.b0();
                    if (zI3) {
                        c0132QnHx2 = c0132QnHx;
                        if (objB2 == c0132QnHx2) {
                        }
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                    }
                    objB2 = new NUlFixed(h81Var);
                    j30VarQ.F0(objB2);
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                    z8 = false;
                }
                pg2 pg2Var111115 = pg2VarY;
                j30VarQ.R(z8);
                if (z5) {
                    i13 = 1157296644;
                    z9 = false;
                } else {
                    i13 = 1157296644;
                    z9 = false;
                }
                j30VarQ.e(i13);
                zI2 = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI2) {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                str7 = str4;
                uh3.a(zBooleanValue, (h81) objB1, pg2Var111115, z9, null, null, j30VarQ, 0, 48);
                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                pg2 pg2VarB111111111110 = xu3Var111115.b(xu3Var111115.a(qnHx, 1.0f, true), cQf111111111111);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(pg2VarB111111111110);
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
                int i111111111111111117 = (i3 >> 18) & 14;
                int i111111111111111118 = i3 >> 6;
                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111111111117 | (i111111111111111118 & 896) | (i111111111111111118 & 7168));
                int i111111111111111119 = i3 >> 3;
                a(z5, str6, str7, j30VarQ, i111111111111111117 | (i111111111111111119 & 112) | (i111111111111111119 & 896));
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                str8 = str6;
                bd3 bd3Var111119 = bd3Var3;
                z10 = z4;
                str9 = str7;
                z11 = z5;
                bd3Var4 = bd3Var111119;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
        }
        i3 |= 24576;
        z3 = z;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((458752 & i) == 0) {
                bd3Var2 = bd3Var;
                if (j30VarQ.I(bd3Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (j30VarQ.c(z2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (j30VarQ.I(h81Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf111111111112 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC111116 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW111116 = ps0.W(pg2VarC111116, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW111116);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var111116 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf111111111113 = One.QnHx.k;
                    pg2 pg2VarB111111111111 = xu3Var111116.b(qnHx, cQf111111111113);
                    LPt8Fixed lPt1111113 = LPt8Fixed.w;
                    mg3<a31> mg3Var111116 = z21.a;
                    wo1.QnHx qnHx111118 = wo1.a;
                    pg2VarY = pg2VarB111111111111.y(new a31(lPt1111113));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var111116 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var111116, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB111111111112 = xu3Var111116.b(xu3Var111116.a(qnHx, 1.0f, true), cQf111111111113);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB111111111112);
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
                    int i1111111111111111110 = (i3 >> 18) & 14;
                    int i1111111111111111111 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111111111110 | (i1111111111111111111 & 896) | (i1111111111111111111 & 7168));
                    int i1111111111111111112 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i1111111111111111110 | (i1111111111111111112 & 112) | (i1111111111111111112 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var1111110 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var1111110;
                } else {
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i8 != 0) {
                        bd3Var3 = bd3.StarOnly;
                    } else {
                        bd3Var3 = bd3Var2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    e40.CQf cQf111111111114 = e40.a;
                    if (bool != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (str4 == null) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    qnHx = pg2.QnHx.w;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (zI) {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new F1(h81Var);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarC111117 = hr.c(qnHx, z5, (h81) objB0, 6);
                    f = 8;
                    f2 = 16;
                    if (z7) {
                        f3 = f;
                    } else {
                        f3 = f2;
                    }
                    if (z7) {
                        f4 = f;
                    } else {
                        f4 = f2;
                    }
                    pg2 pg2VarW111117 = ps0.W(pg2VarC111117, f, f3, f2, f4);
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
                    szVarJ = S12N.j(pg2VarW111117);
                    str6 = str5;
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
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                    xu3 xu3Var111117 = xu3.a;
                    j30VarQ.e(1102243231);
                    da.CQf cQf111111111115 = One.QnHx.k;
                    pg2 pg2VarB111111111113 = xu3Var111117.b(qnHx, cQf111111111115);
                    LPt8Fixed lPt1111114 = LPt8Fixed.w;
                    mg3<a31> mg3Var111117 = z21.a;
                    wo1.QnHx qnHx111119 = wo1.a;
                    pg2VarY = pg2VarB111111111113.y(new a31(lPt1111114));
                    if (z5) {
                        j30VarQ.e(1157296644);
                        zI3 = j30VarQ.I(h81Var);
                        objB2 = j30VarQ.b0();
                        if (zI3) {
                            c0132QnHx2 = c0132QnHx;
                            if (objB2 == c0132QnHx2) {
                            }
                            z8 = false;
                            j30VarQ.R(false);
                            pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                        } else {
                            c0132QnHx2 = c0132QnHx;
                        }
                        objB2 = new NUlFixed(h81Var);
                        j30VarQ.F0(objB2);
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                        z8 = false;
                    }
                    pg2 pg2Var111117 = pg2VarY;
                    j30VarQ.R(z8);
                    if (z5) {
                        i13 = 1157296644;
                        z9 = false;
                    } else {
                        i13 = 1157296644;
                        z9 = false;
                    }
                    j30VarQ.e(i13);
                    zI2 = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new YKK(h81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    str7 = str4;
                    uh3.a(zBooleanValue, (h81) objB1, pg2Var111117, z9, null, null, j30VarQ, 0, 48);
                    hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                    pg2 pg2VarB111111111114 = xu3Var111117.b(xu3Var111117.a(qnHx, 1.0f, true), cQf111111111115);
                    j30VarQ.e(-483455358);
                    rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    szVarJ2 = S12N.j(pg2VarB111111111114);
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
                    int i1111111111111111113 = (i3 >> 18) & 14;
                    int i1111111111111111114 = i3 >> 6;
                    c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111111111113 | (i1111111111111111114 & 896) | (i1111111111111111114 & 7168));
                    int i1111111111111111115 = i3 >> 3;
                    a(z5, str6, str7, j30VarQ, i1111111111111111113 | (i1111111111111111115 & 112) | (i1111111111111111115 & 896));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    str8 = str6;
                    bd3 bd3Var1111111 = bd3Var3;
                    z10 = z4;
                    str9 = str7;
                    z11 = z5;
                    bd3Var4 = bd3Var1111111;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
            }
            i12 = 12582912;
            i3 |= i12;
            if ((23967451 & i3) == 4793490) {
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i8 != 0) {
                    bd3Var3 = bd3.StarOnly;
                } else {
                    bd3Var3 = bd3Var2;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                e40.CQf cQf111111111116 = e40.a;
                if (bool != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (str4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                qnHx = pg2.QnHx.w;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI) {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarC111118 = hr.c(qnHx, z5, (h81) objB0, 6);
                f = 8;
                f2 = 16;
                if (z7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                if (z7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                pg2 pg2VarW111118 = ps0.W(pg2VarC111118, f, f3, f2, f4);
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
                szVarJ = S12N.j(pg2VarW111118);
                str6 = str5;
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
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                xu3 xu3Var111118 = xu3.a;
                j30VarQ.e(1102243231);
                da.CQf cQf111111111117 = One.QnHx.k;
                pg2 pg2VarB111111111115 = xu3Var111118.b(qnHx, cQf111111111117);
                LPt8Fixed lPt1111115 = LPt8Fixed.w;
                mg3<a31> mg3Var111118 = z21.a;
                wo1.QnHx qnHx1111110 = wo1.a;
                pg2VarY = pg2VarB111111111115.y(new a31(lPt1111115));
                if (z5) {
                    j30VarQ.e(1157296644);
                    zI3 = j30VarQ.I(h81Var);
                    objB2 = j30VarQ.b0();
                    if (zI3) {
                        c0132QnHx2 = c0132QnHx;
                        if (objB2 == c0132QnHx2) {
                        }
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                    }
                    objB2 = new NUlFixed(h81Var);
                    j30VarQ.F0(objB2);
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                    z8 = false;
                }
                pg2 pg2Var111118 = pg2VarY;
                j30VarQ.R(z8);
                if (z5) {
                    i13 = 1157296644;
                    z9 = false;
                } else {
                    i13 = 1157296644;
                    z9 = false;
                }
                j30VarQ.e(i13);
                zI2 = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI2) {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                str7 = str4;
                uh3.a(zBooleanValue, (h81) objB1, pg2Var111118, z9, null, null, j30VarQ, 0, 48);
                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                pg2 pg2VarB111111111116 = xu3Var111118.b(xu3Var111118.a(qnHx, 1.0f, true), cQf111111111117);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(pg2VarB111111111116);
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
                int i1111111111111111116 = (i3 >> 18) & 14;
                int i1111111111111111117 = i3 >> 6;
                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111111111116 | (i1111111111111111117 & 896) | (i1111111111111111117 & 7168));
                int i1111111111111111118 = i3 >> 3;
                a(z5, str6, str7, j30VarQ, i1111111111111111116 | (i1111111111111111118 & 112) | (i1111111111111111118 & 896));
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                str8 = str6;
                bd3 bd3Var1111112 = bd3Var3;
                z10 = z4;
                str9 = str7;
                z11 = z5;
                bd3Var4 = bd3Var1111112;
            } else {
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i8 != 0) {
                    bd3Var3 = bd3.StarOnly;
                } else {
                    bd3Var3 = bd3Var2;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                e40.CQf cQf111111111118 = e40.a;
                if (bool != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (str4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                qnHx = pg2.QnHx.w;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI) {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarC111119 = hr.c(qnHx, z5, (h81) objB0, 6);
                f = 8;
                f2 = 16;
                if (z7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                if (z7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                pg2 pg2VarW111119 = ps0.W(pg2VarC111119, f, f3, f2, f4);
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
                szVarJ = S12N.j(pg2VarW111119);
                str6 = str5;
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
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                xu3 xu3Var111119 = xu3.a;
                j30VarQ.e(1102243231);
                da.CQf cQf111111111119 = One.QnHx.k;
                pg2 pg2VarB111111111117 = xu3Var111119.b(qnHx, cQf111111111119);
                LPt8Fixed lPt1111116 = LPt8Fixed.w;
                mg3<a31> mg3Var111119 = z21.a;
                wo1.QnHx qnHx1111111 = wo1.a;
                pg2VarY = pg2VarB111111111117.y(new a31(lPt1111116));
                if (z5) {
                    j30VarQ.e(1157296644);
                    zI3 = j30VarQ.I(h81Var);
                    objB2 = j30VarQ.b0();
                    if (zI3) {
                        c0132QnHx2 = c0132QnHx;
                        if (objB2 == c0132QnHx2) {
                        }
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                    }
                    objB2 = new NUlFixed(h81Var);
                    j30VarQ.F0(objB2);
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                    z8 = false;
                }
                pg2 pg2Var111119 = pg2VarY;
                j30VarQ.R(z8);
                if (z5) {
                    i13 = 1157296644;
                    z9 = false;
                } else {
                    i13 = 1157296644;
                    z9 = false;
                }
                j30VarQ.e(i13);
                zI2 = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI2) {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                str7 = str4;
                uh3.a(zBooleanValue, (h81) objB1, pg2Var111119, z9, null, null, j30VarQ, 0, 48);
                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                pg2 pg2VarB111111111118 = xu3Var111119.b(xu3Var111119.a(qnHx, 1.0f, true), cQf111111111119);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(pg2VarB111111111118);
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
                int i1111111111111111119 = (i3 >> 18) & 14;
                int i11111111111111111110 = i3 >> 6;
                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i1111111111111111119 | (i11111111111111111110 & 896) | (i11111111111111111110 & 7168));
                int i11111111111111111111 = i3 >> 3;
                a(z5, str6, str7, j30VarQ, i1111111111111111119 | (i11111111111111111111 & 112) | (i11111111111111111111 & 896));
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                str8 = str6;
                bd3 bd3Var1111113 = bd3Var3;
                z10 = z4;
                str9 = str7;
                z11 = z5;
                bd3Var4 = bd3Var1111113;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
        }
        i3 |= 196608;
        bd3Var2 = bd3Var;
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (j30VarQ.c(z2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        if ((i2 & 128) != 0) {
            if ((29360128 & i) == 0) {
                if (j30VarQ.I(h81Var)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
            }
            if ((23967451 & i3) == 4793490) {
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i8 != 0) {
                    bd3Var3 = bd3.StarOnly;
                } else {
                    bd3Var3 = bd3Var2;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                e40.CQf cQf1111111111110 = e40.a;
                if (bool != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (str4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                qnHx = pg2.QnHx.w;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI) {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarC1111110 = hr.c(qnHx, z5, (h81) objB0, 6);
                f = 8;
                f2 = 16;
                if (z7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                if (z7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                pg2 pg2VarW1111110 = ps0.W(pg2VarC1111110, f, f3, f2, f4);
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
                szVarJ = S12N.j(pg2VarW1111110);
                str6 = str5;
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
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                xu3 xu3Var1111110 = xu3.a;
                j30VarQ.e(1102243231);
                da.CQf cQf1111111111111 = One.QnHx.k;
                pg2 pg2VarB111111111119 = xu3Var1111110.b(qnHx, cQf1111111111111);
                LPt8Fixed lPt1111117 = LPt8Fixed.w;
                mg3<a31> mg3Var1111110 = z21.a;
                wo1.QnHx qnHx1111112 = wo1.a;
                pg2VarY = pg2VarB111111111119.y(new a31(lPt1111117));
                if (z5) {
                    j30VarQ.e(1157296644);
                    zI3 = j30VarQ.I(h81Var);
                    objB2 = j30VarQ.b0();
                    if (zI3) {
                        c0132QnHx2 = c0132QnHx;
                        if (objB2 == c0132QnHx2) {
                        }
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                    }
                    objB2 = new NUlFixed(h81Var);
                    j30VarQ.F0(objB2);
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                    z8 = false;
                }
                pg2 pg2Var1111110 = pg2VarY;
                j30VarQ.R(z8);
                if (z5) {
                    i13 = 1157296644;
                    z9 = false;
                } else {
                    i13 = 1157296644;
                    z9 = false;
                }
                j30VarQ.e(i13);
                zI2 = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI2) {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                str7 = str4;
                uh3.a(zBooleanValue, (h81) objB1, pg2Var1111110, z9, null, null, j30VarQ, 0, 48);
                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                pg2 pg2VarB1111111111110 = xu3Var1111110.b(xu3Var1111110.a(qnHx, 1.0f, true), cQf1111111111111);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(pg2VarB1111111111110);
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
                int i11111111111111111112 = (i3 >> 18) & 14;
                int i11111111111111111113 = i3 >> 6;
                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111111111111112 | (i11111111111111111113 & 896) | (i11111111111111111113 & 7168));
                int i11111111111111111114 = i3 >> 3;
                a(z5, str6, str7, j30VarQ, i11111111111111111112 | (i11111111111111111114 & 112) | (i11111111111111111114 & 896));
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                str8 = str6;
                bd3 bd3Var1111114 = bd3Var3;
                z10 = z4;
                str9 = str7;
                z11 = z5;
                bd3Var4 = bd3Var1111114;
            } else {
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i8 != 0) {
                    bd3Var3 = bd3.StarOnly;
                } else {
                    bd3Var3 = bd3Var2;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                e40.CQf cQf1111111111112 = e40.a;
                if (bool != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (str4 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                qnHx = pg2.QnHx.w;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI) {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new F1(h81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarC1111111 = hr.c(qnHx, z5, (h81) objB0, 6);
                f = 8;
                f2 = 16;
                if (z7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                if (z7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                pg2 pg2VarW1111111 = ps0.W(pg2VarC1111111, f, f3, f2, f4);
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
                szVarJ = S12N.j(pg2VarW1111111);
                str6 = str5;
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
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
                xu3 xu3Var1111111 = xu3.a;
                j30VarQ.e(1102243231);
                da.CQf cQf1111111111113 = One.QnHx.k;
                pg2 pg2VarB1111111111111 = xu3Var1111111.b(qnHx, cQf1111111111113);
                LPt8Fixed lPt1111118 = LPt8Fixed.w;
                mg3<a31> mg3Var1111111 = z21.a;
                wo1.QnHx qnHx1111113 = wo1.a;
                pg2VarY = pg2VarB1111111111111.y(new a31(lPt1111118));
                if (z5) {
                    j30VarQ.e(1157296644);
                    zI3 = j30VarQ.I(h81Var);
                    objB2 = j30VarQ.b0();
                    if (zI3) {
                        c0132QnHx2 = c0132QnHx;
                        if (objB2 == c0132QnHx2) {
                        }
                        z8 = false;
                        j30VarQ.R(false);
                        pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                    } else {
                        c0132QnHx2 = c0132QnHx;
                    }
                    objB2 = new NUlFixed(h81Var);
                    j30VarQ.F0(objB2);
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                    z8 = false;
                }
                pg2 pg2Var1111111 = pg2VarY;
                j30VarQ.R(z8);
                if (z5) {
                    i13 = 1157296644;
                    z9 = false;
                } else {
                    i13 = 1157296644;
                    z9 = false;
                }
                j30VarQ.e(i13);
                zI2 = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI2) {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new YKK(h81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                str7 = str4;
                uh3.a(zBooleanValue, (h81) objB1, pg2Var1111111, z9, null, null, j30VarQ, 0, 48);
                hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
                pg2 pg2VarB1111111111112 = xu3Var1111111.b(xu3Var1111111.a(qnHx, 1.0f, true), cQf1111111111113);
                j30VarQ.e(-483455358);
                rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                szVarJ2 = S12N.j(pg2VarB1111111111112);
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
                int i11111111111111111115 = (i3 >> 18) & 14;
                int i11111111111111111116 = i3 >> 6;
                c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111111111111115 | (i11111111111111111116 & 896) | (i11111111111111111116 & 7168));
                int i11111111111111111117 = i3 >> 3;
                a(z5, str6, str7, j30VarQ, i11111111111111111115 | (i11111111111111111117 & 112) | (i11111111111111111117 & 896));
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.R(true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
                str8 = str6;
                bd3 bd3Var1111115 = bd3Var3;
                z10 = z4;
                str9 = str7;
                z11 = z5;
                bd3Var4 = bd3Var1111115;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
        }
        i12 = 12582912;
        i3 |= i12;
        if ((23967451 & i3) == 4793490) {
            if (i14 != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            if (i4 != 0) {
                str4 = null;
            }
            if (i6 != 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (i8 != 0) {
                bd3Var3 = bd3.StarOnly;
            } else {
                bd3Var3 = bd3Var2;
            }
            if (i10 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            e40.CQf cQf1111111111114 = e40.a;
            if (bool != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (str4 == null) {
                z7 = false;
            } else {
                z7 = false;
            }
            qnHx = pg2.QnHx.w;
            j30VarQ.e(1157296644);
            zI = j30VarQ.I(h81Var);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (zI) {
                objB0 = new F1(h81Var);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new F1(h81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pg2 pg2VarC1111112 = hr.c(qnHx, z5, (h81) objB0, 6);
            f = 8;
            f2 = 16;
            if (z7) {
                f3 = f;
            } else {
                f3 = f2;
            }
            if (z7) {
                f4 = f;
            } else {
                f4 = f2;
            }
            pg2 pg2VarW1111112 = ps0.W(pg2VarC1111112, f, f3, f2, f4);
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
            szVarJ = S12N.j(pg2VarW1111112);
            str6 = str5;
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
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
            xu3 xu3Var1111112 = xu3.a;
            j30VarQ.e(1102243231);
            da.CQf cQf1111111111115 = One.QnHx.k;
            pg2 pg2VarB1111111111113 = xu3Var1111112.b(qnHx, cQf1111111111115);
            LPt8Fixed lPt1111119 = LPt8Fixed.w;
            mg3<a31> mg3Var1111112 = z21.a;
            wo1.QnHx qnHx1111114 = wo1.a;
            pg2VarY = pg2VarB1111111111113.y(new a31(lPt1111119));
            if (z5) {
                j30VarQ.e(1157296644);
                zI3 = j30VarQ.I(h81Var);
                objB2 = j30VarQ.b0();
                if (zI3) {
                    c0132QnHx2 = c0132QnHx;
                    if (objB2 == c0132QnHx2) {
                    }
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                }
                objB2 = new NUlFixed(h81Var);
                j30VarQ.F0(objB2);
                z8 = false;
                j30VarQ.R(false);
                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
            } else {
                c0132QnHx2 = c0132QnHx;
                z8 = false;
            }
            pg2 pg2Var1111112 = pg2VarY;
            j30VarQ.R(z8);
            if (z5) {
                i13 = 1157296644;
                z9 = false;
            } else {
                i13 = 1157296644;
                z9 = false;
            }
            j30VarQ.e(i13);
            zI2 = j30VarQ.I(h81Var);
            objB1 = j30VarQ.b0();
            if (zI2) {
                objB1 = new YKK(h81Var);
                j30VarQ.F0(objB1);
            } else {
                objB1 = new YKK(h81Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            str7 = str4;
            uh3.a(zBooleanValue, (h81) objB1, pg2Var1111112, z9, null, null, j30VarQ, 0, 48);
            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
            pg2 pg2VarB1111111111114 = xu3Var1111112.b(xu3Var1111112.a(qnHx, 1.0f, true), cQf1111111111115);
            j30VarQ.e(-483455358);
            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
            szVarJ2 = S12N.j(pg2VarB1111111111114);
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
            int i11111111111111111118 = (i3 >> 18) & 14;
            int i11111111111111111119 = i3 >> 6;
            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i11111111111111111118 | (i11111111111111111119 & 896) | (i11111111111111111119 & 7168));
            int i111111111111111111110 = i3 >> 3;
            a(z5, str6, str7, j30VarQ, i11111111111111111118 | (i111111111111111111110 & 112) | (i111111111111111111110 & 896));
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
            str8 = str6;
            bd3 bd3Var1111116 = bd3Var3;
            z10 = z4;
            str9 = str7;
            z11 = z5;
            bd3Var4 = bd3Var1111116;
        } else {
            if (i14 != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            if (i4 != 0) {
                str4 = null;
            }
            if (i6 != 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (i8 != 0) {
                bd3Var3 = bd3.StarOnly;
            } else {
                bd3Var3 = bd3Var2;
            }
            if (i10 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            e40.CQf cQf1111111111116 = e40.a;
            if (bool != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (str4 == null) {
                z7 = false;
            } else {
                z7 = false;
            }
            qnHx = pg2.QnHx.w;
            j30VarQ.e(1157296644);
            zI = j30VarQ.I(h81Var);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (zI) {
                objB0 = new F1(h81Var);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new F1(h81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pg2 pg2VarC1111113 = hr.c(qnHx, z5, (h81) objB0, 6);
            f = 8;
            f2 = 16;
            if (z7) {
                f3 = f;
            } else {
                f3 = f2;
            }
            if (z7) {
                f4 = f;
            } else {
                f4 = f2;
            }
            pg2 pg2VarW1111113 = ps0.W(pg2VarC1111113, f, f3, f2, f4);
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
            szVarJ = S12N.j(pg2VarW1111113);
            str6 = str5;
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
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
            xu3 xu3Var1111113 = xu3.a;
            j30VarQ.e(1102243231);
            da.CQf cQf1111111111117 = One.QnHx.k;
            pg2 pg2VarB1111111111115 = xu3Var1111113.b(qnHx, cQf1111111111117);
            LPt8Fixed lPt11111110 = LPt8Fixed.w;
            mg3<a31> mg3Var1111113 = z21.a;
            wo1.QnHx qnHx1111115 = wo1.a;
            pg2VarY = pg2VarB1111111111115.y(new a31(lPt11111110));
            if (z5) {
                j30VarQ.e(1157296644);
                zI3 = j30VarQ.I(h81Var);
                objB2 = j30VarQ.b0();
                if (zI3) {
                    c0132QnHx2 = c0132QnHx;
                    if (objB2 == c0132QnHx2) {
                    }
                    z8 = false;
                    j30VarQ.R(false);
                    pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
                } else {
                    c0132QnHx2 = c0132QnHx;
                }
                objB2 = new NUlFixed(h81Var);
                j30VarQ.F0(objB2);
                z8 = false;
                j30VarQ.R(false);
                pg2VarY = fTO$.h(mw1.a(pg2VarY, (h81) objB2), j30VarQ);
            } else {
                c0132QnHx2 = c0132QnHx;
                z8 = false;
            }
            pg2 pg2Var1111113 = pg2VarY;
            j30VarQ.R(z8);
            if (z5) {
                i13 = 1157296644;
                z9 = false;
            } else {
                i13 = 1157296644;
                z9 = false;
            }
            j30VarQ.e(i13);
            zI2 = j30VarQ.I(h81Var);
            objB1 = j30VarQ.b0();
            if (zI2) {
                objB1 = new YKK(h81Var);
                j30VarQ.F0(objB1);
            } else {
                objB1 = new YKK(h81Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            str7 = str4;
            uh3.a(zBooleanValue, (h81) objB1, pg2Var1111113, z9, null, null, j30VarQ, 0, 48);
            hH.i(gm4.k(qnHx, f2), j30VarQ, 6);
            pg2 pg2VarB1111111111116 = xu3Var1111113.b(xu3Var1111113.a(qnHx, 1.0f, true), cQf1111111111117);
            j30VarQ.e(-483455358);
            rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var2 = (ij0) j30VarQ.E(jt4Var);
            jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
            ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
            szVarJ2 = S12N.j(pg2VarB1111111111116);
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
            int i111111111111111111111 = (i3 >> 18) & 14;
            int i111111111111111111112 = i3 >> 6;
            c(z5, str, z4, bd3Var3, j30VarQ, ((i3 << 3) & 112) | i111111111111111111111 | (i111111111111111111112 & 896) | (i111111111111111111112 & 7168));
            int i111111111111111111113 = i3 >> 3;
            a(z5, str6, str7, j30VarQ, i111111111111111111111 | (i111111111111111111113 & 112) | (i111111111111111111113 & 896));
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
            str8 = str6;
            bd3 bd3Var1111117 = bd3Var3;
            z10 = z4;
            str9 = str7;
            z11 = z5;
            bd3Var4 = bd3Var1111117;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new auxFixed(str, bool, str8, str9, z10, bd3Var4, z11, h81Var, i, i2);
    }

    public static final void c(boolean z, String str, boolean z2, bd3 bd3Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1120049969);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.c(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(bd3Var) ? 2048 : 1024;
        }
        if ((i2 & 5851) == 1170 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            da.CQf cQf2 = One.QnHx.k;
            j30VarQ.e(693286680);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarA = uu3.a(CZ9P.a, cQf2, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx);
            if (!(j30VarQ.a instanceof jE)) {
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
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -678309503);
            io5.a(!z, q10.a, X.m(j30VarQ, -2004344329, new T23(str, i2)), j30VarQ, 432);
            if (z2) {
                cd3.a(null, bd3Var, j30VarQ, (i2 >> 6) & 112, 1);
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new byN(z, str, z2, bd3Var, i);
    }
}
