package defpackage;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public final class b02 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ zz1 w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ e02 y;
        public final /* synthetic */ x81<c02, g70, sb2> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(zz1 zz1Var, pg2 pg2Var, e02 e02Var, x81<? super c02, ? super g70, ? extends sb2> x81Var, int i, int i2) {
            super(2);
            this.w = zz1Var;
            this.x = pg2Var;
            this.y = e02Var;
            this.z = x81Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            b02.a(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<zz1> {
        public final /* synthetic */ is4<zz1> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(ri2 ri2Var) {
            super(0);
            this.w = ri2Var;
        }

        @Override // defpackage.h81
        public final zz1 invoke() {
            return this.w.getValue();
        }
    }

    public static final class QnHx extends cx1 implements x81<bw4, g70, sb2> {
        public final /* synthetic */ yz1 w;
        public final /* synthetic */ x81<c02, g70, sb2> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(yz1 yz1Var, x81<? super c02, ? super g70, ? extends sb2> x81Var) {
            super(2);
            this.w = yz1Var;
            this.x = x81Var;
        }

        @Override // defpackage.x81
        public final sb2 invoke(bw4 bw4Var, g70 g70Var) {
            bw4 bw4Var2 = bw4Var;
            long j = g70Var.a;
            yz1 yz1Var = this.w;
            if (!ur1.a(bw4Var2, yz1Var.d) || !g70.b(j, yz1Var.e)) {
                yz1Var.d = bw4Var2;
                yz1Var.e = j;
                yz1Var.c.clear();
            }
            return this.x.invoke(new d02(yz1Var, bw4Var2), new g70(j));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0076  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:69:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:75:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void a(zz1 zz1Var, pg2 pg2Var, e02 e02Var, x81<? super c02, ? super g70, ? extends sb2> x81Var, g30 g30Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        pg2 pg2Var2;
        e02 e02Var2;
        ri2 ri2VarF0;
        j24 j24VarK;
        Object objB0;
        g30.QnHx.C0132QnHx c0132QnHx;
        yz1 yz1Var;
        Object objB1;
        aw4 aw4Var;
        boolean zI;
        Object objB2;
        pg2 pg2Var3;
        e02 e02Var3;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(852831187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(zz1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                i3 |= j30VarQ.I(pg2Var) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    if (j30VarQ.I(e02Var)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (j30VarQ.I(x81Var)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                    if (i7 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        e02Var2 = null;
                    } else {
                        e02Var2 = e02Var;
                    }
                    ri2VarF0 = ps0.f0(zz1Var, j30VarQ);
                    j24VarK = S12N.k(j30VarQ);
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = new yz1(j24VarK, new F1(ri2VarF0));
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    yz1Var = (yz1) objB0;
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new aw4(new a02(yz1Var));
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    aw4Var = (aw4) objB1;
                    j30VarQ.e(617316839);
                    if (e02Var2 != null) {
                        g02.a(e02Var2, yz1Var, aw4Var, j30VarQ, ((i3 >> 6) & 14) | 64 | AdRequest.MAX_CONTENT_URL_LENGTH);
                        sd5 sd5Var = sd5.a;
                    }
                    j30VarQ.R(false);
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(yz1Var) | j30VarQ.I(x81Var);
                    objB2 = j30VarQ.b0();
                    if (zI || objB2 == c0132QnHx) {
                        objB2 = new QnHx(yz1Var, x81Var);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    yv4.b(aw4Var, pg2Var2, (x81) objB2, j30VarQ, (i3 & 112) | 8, 0);
                    pg2Var3 = pg2Var2;
                    e02Var3 = e02Var2;
                } else {
                    j30VarQ.x();
                    pg2Var3 = pg2Var;
                    e02Var3 = e02Var;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(zz1Var, pg2Var3, e02Var3, x81Var, i, i2);
            }
            i3 |= 384;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(x81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    e02Var2 = null;
                } else {
                    e02Var2 = e02Var;
                }
                ri2VarF0 = ps0.f0(zz1Var, j30VarQ);
                j24VarK = S12N.k(j30VarQ);
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = new yz1(j24VarK, new F1(ri2VarF0));
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                yz1Var = (yz1) objB0;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new aw4(new a02(yz1Var));
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                aw4Var = (aw4) objB1;
                j30VarQ.e(617316839);
                if (e02Var2 != null) {
                    g02.a(e02Var2, yz1Var, aw4Var, j30VarQ, ((i3 >> 6) & 14) | 64 | AdRequest.MAX_CONTENT_URL_LENGTH);
                    sd5 sd5Var2 = sd5.a;
                }
                j30VarQ.R(false);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(yz1Var) | j30VarQ.I(x81Var);
                objB2 = j30VarQ.b0();
                if (zI) {
                    objB2 = new QnHx(yz1Var, x81Var);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new QnHx(yz1Var, x81Var);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                yv4.b(aw4Var, pg2Var2, (x81) objB2, j30VarQ, (i3 & 112) | 8, 0);
                pg2Var3 = pg2Var2;
                e02Var3 = e02Var2;
            } else {
                if (i7 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    e02Var2 = null;
                } else {
                    e02Var2 = e02Var;
                }
                ri2VarF0 = ps0.f0(zz1Var, j30VarQ);
                j24VarK = S12N.k(j30VarQ);
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = new yz1(j24VarK, new F1(ri2VarF0));
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                yz1Var = (yz1) objB0;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new aw4(new a02(yz1Var));
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                aw4Var = (aw4) objB1;
                j30VarQ.e(617316839);
                if (e02Var2 != null) {
                    g02.a(e02Var2, yz1Var, aw4Var, j30VarQ, ((i3 >> 6) & 14) | 64 | AdRequest.MAX_CONTENT_URL_LENGTH);
                    sd5 sd5Var3 = sd5.a;
                }
                j30VarQ.R(false);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(yz1Var) | j30VarQ.I(x81Var);
                objB2 = j30VarQ.b0();
                if (zI) {
                    objB2 = new QnHx(yz1Var, x81Var);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new QnHx(yz1Var, x81Var);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                yv4.b(aw4Var, pg2Var2, (x81) objB2, j30VarQ, (i3 & 112) | 8, 0);
                pg2Var3 = pg2Var2;
                e02Var3 = e02Var2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(zz1Var, pg2Var3, e02Var3, x81Var, i, i2);
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                if (j30VarQ.I(e02Var)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(x81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    e02Var2 = null;
                } else {
                    e02Var2 = e02Var;
                }
                ri2VarF0 = ps0.f0(zz1Var, j30VarQ);
                j24VarK = S12N.k(j30VarQ);
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = new yz1(j24VarK, new F1(ri2VarF0));
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                yz1Var = (yz1) objB0;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new aw4(new a02(yz1Var));
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                aw4Var = (aw4) objB1;
                j30VarQ.e(617316839);
                if (e02Var2 != null) {
                    g02.a(e02Var2, yz1Var, aw4Var, j30VarQ, ((i3 >> 6) & 14) | 64 | AdRequest.MAX_CONTENT_URL_LENGTH);
                    sd5 sd5Var4 = sd5.a;
                }
                j30VarQ.R(false);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(yz1Var) | j30VarQ.I(x81Var);
                objB2 = j30VarQ.b0();
                if (zI) {
                    objB2 = new QnHx(yz1Var, x81Var);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new QnHx(yz1Var, x81Var);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                yv4.b(aw4Var, pg2Var2, (x81) objB2, j30VarQ, (i3 & 112) | 8, 0);
                pg2Var3 = pg2Var2;
                e02Var3 = e02Var2;
            } else {
                if (i7 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    e02Var2 = null;
                } else {
                    e02Var2 = e02Var;
                }
                ri2VarF0 = ps0.f0(zz1Var, j30VarQ);
                j24VarK = S12N.k(j30VarQ);
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = new yz1(j24VarK, new F1(ri2VarF0));
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                yz1Var = (yz1) objB0;
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                if (objB1 == c0132QnHx) {
                    objB1 = new aw4(new a02(yz1Var));
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                aw4Var = (aw4) objB1;
                j30VarQ.e(617316839);
                if (e02Var2 != null) {
                    g02.a(e02Var2, yz1Var, aw4Var, j30VarQ, ((i3 >> 6) & 14) | 64 | AdRequest.MAX_CONTENT_URL_LENGTH);
                    sd5 sd5Var5 = sd5.a;
                }
                j30VarQ.R(false);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(yz1Var) | j30VarQ.I(x81Var);
                objB2 = j30VarQ.b0();
                if (zI) {
                    objB2 = new QnHx(yz1Var, x81Var);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new QnHx(yz1Var, x81Var);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                yv4.b(aw4Var, pg2Var2, (x81) objB2, j30VarQ, (i3 & 112) | 8, 0);
                pg2Var3 = pg2Var2;
                e02Var3 = e02Var2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(zz1Var, pg2Var3, e02Var3, x81Var, i, i2);
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(x81Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) == 1170) {
            if (i7 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            if (i4 != 0) {
                e02Var2 = null;
            } else {
                e02Var2 = e02Var;
            }
            ri2VarF0 = ps0.f0(zz1Var, j30VarQ);
            j24VarK = S12N.k(j30VarQ);
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = new yz1(j24VarK, new F1(ri2VarF0));
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            yz1Var = (yz1) objB0;
            j30VarQ.e(-492369756);
            objB1 = j30VarQ.b0();
            if (objB1 == c0132QnHx) {
                objB1 = new aw4(new a02(yz1Var));
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            aw4Var = (aw4) objB1;
            j30VarQ.e(617316839);
            if (e02Var2 != null) {
                g02.a(e02Var2, yz1Var, aw4Var, j30VarQ, ((i3 >> 6) & 14) | 64 | AdRequest.MAX_CONTENT_URL_LENGTH);
                sd5 sd5Var6 = sd5.a;
            }
            j30VarQ.R(false);
            j30VarQ.e(511388516);
            zI = j30VarQ.I(yz1Var) | j30VarQ.I(x81Var);
            objB2 = j30VarQ.b0();
            if (zI) {
                objB2 = new QnHx(yz1Var, x81Var);
                j30VarQ.F0(objB2);
            } else {
                objB2 = new QnHx(yz1Var, x81Var);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            yv4.b(aw4Var, pg2Var2, (x81) objB2, j30VarQ, (i3 & 112) | 8, 0);
            pg2Var3 = pg2Var2;
            e02Var3 = e02Var2;
        } else {
            if (i7 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            if (i4 != 0) {
                e02Var2 = null;
            } else {
                e02Var2 = e02Var;
            }
            ri2VarF0 = ps0.f0(zz1Var, j30VarQ);
            j24VarK = S12N.k(j30VarQ);
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = new yz1(j24VarK, new F1(ri2VarF0));
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            yz1Var = (yz1) objB0;
            j30VarQ.e(-492369756);
            objB1 = j30VarQ.b0();
            if (objB1 == c0132QnHx) {
                objB1 = new aw4(new a02(yz1Var));
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            aw4Var = (aw4) objB1;
            j30VarQ.e(617316839);
            if (e02Var2 != null) {
                g02.a(e02Var2, yz1Var, aw4Var, j30VarQ, ((i3 >> 6) & 14) | 64 | AdRequest.MAX_CONTENT_URL_LENGTH);
                sd5 sd5Var7 = sd5.a;
            }
            j30VarQ.R(false);
            j30VarQ.e(511388516);
            zI = j30VarQ.I(yz1Var) | j30VarQ.I(x81Var);
            objB2 = j30VarQ.b0();
            if (zI) {
                objB2 = new QnHx(yz1Var, x81Var);
                j30VarQ.F0(objB2);
            } else {
                objB2 = new QnHx(yz1Var, x81Var);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            yv4.b(aw4Var, pg2Var2, (x81) objB2, j30VarQ, (i3 & 112) | 8, 0);
            pg2Var3 = pg2Var2;
            e02Var3 = e02Var2;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(zz1Var, pg2Var3, e02Var3, x81Var, i, i2);
    }
}
