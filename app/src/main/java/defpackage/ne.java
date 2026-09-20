package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ne {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ One x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ y81<se, g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(pg2 pg2Var, One one, boolean z, y81<? super se, ? super g30, ? super Integer, sd5> y81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = one;
            this.y = z;
            this.z = y81Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ne.a(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<bw4, g70, sb2> {
        public final /* synthetic */ rb2 w;
        public final /* synthetic */ y81<se, g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(rb2 rb2Var, y81<? super se, ? super g30, ? super Integer, sd5> y81Var, int i) {
            super(2);
            this.w = rb2Var;
            this.x = y81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sb2 invoke(bw4 bw4Var, g70 g70Var) {
            bw4 bw4Var2 = bw4Var;
            long j = g70Var.a;
            return this.w.a(bw4Var2, bw4Var2.F(sd5.a, X.n(-1945019079, new me(this.x, new ue(bw4Var2, j), this.y), true)), j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x0095  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void a(pg2 pg2Var, One one, boolean z, y81<? super se, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        pg2 pg2Var2;
        One one2;
        rb2 rb2VarC;
        boolean zI;
        Object objB0;
        boolean z2;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(1781813501);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                i3 |= j30VarQ.I(one) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    if (j30VarQ.c(z)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (j30VarQ.I(y81Var)) {
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
                    if (i8 != 0) {
                        one2 = One.QnHx.a;
                    } else {
                        one2 = one;
                    }
                    if (i4 != 0) {
                        z = false;
                    }
                    rb2VarC = fe.c(one2, z, j30VarQ);
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(y81Var) | j30VarQ.I(rb2VarC);
                    objB0 = j30VarQ.b0();
                    if (zI || objB0 == g30.QnHx.a) {
                        objB0 = new QnHx(rb2VarC, y81Var, i3);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    yv4.a(pg2Var2, (x81) objB0, j30VarQ, i3 & 14, 0);
                } else {
                    j30VarQ.x();
                    pg2Var2 = pg2Var;
                    one2 = one;
                }
                z2 = z;
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(pg2Var2, one2, z2, y81Var, i, i2);
            }
            i3 |= 384;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(y81Var)) {
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
                if (i8 != 0) {
                    one2 = One.QnHx.a;
                } else {
                    one2 = one;
                }
                if (i4 != 0) {
                    z = false;
                }
                rb2VarC = fe.c(one2, z, j30VarQ);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(y81Var) | j30VarQ.I(rb2VarC);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new QnHx(rb2VarC, y81Var, i3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new QnHx(rb2VarC, y81Var, i3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                yv4.a(pg2Var2, (x81) objB0, j30VarQ, i3 & 14, 0);
            } else {
                if (i7 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i8 != 0) {
                    one2 = One.QnHx.a;
                } else {
                    one2 = one;
                }
                if (i4 != 0) {
                    z = false;
                }
                rb2VarC = fe.c(one2, z, j30VarQ);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(y81Var) | j30VarQ.I(rb2VarC);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new QnHx(rb2VarC, y81Var, i3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new QnHx(rb2VarC, y81Var, i3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                yv4.a(pg2Var2, (x81) objB0, j30VarQ, i3 & 14, 0);
            }
            z2 = z;
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(pg2Var2, one2, z2, y81Var, i, i2);
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                if (j30VarQ.c(z)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(y81Var)) {
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
                if (i8 != 0) {
                    one2 = One.QnHx.a;
                } else {
                    one2 = one;
                }
                if (i4 != 0) {
                    z = false;
                }
                rb2VarC = fe.c(one2, z, j30VarQ);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(y81Var) | j30VarQ.I(rb2VarC);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new QnHx(rb2VarC, y81Var, i3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new QnHx(rb2VarC, y81Var, i3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                yv4.a(pg2Var2, (x81) objB0, j30VarQ, i3 & 14, 0);
            } else {
                if (i7 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i8 != 0) {
                    one2 = One.QnHx.a;
                } else {
                    one2 = one;
                }
                if (i4 != 0) {
                    z = false;
                }
                rb2VarC = fe.c(one2, z, j30VarQ);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(y81Var) | j30VarQ.I(rb2VarC);
                objB0 = j30VarQ.b0();
                if (zI) {
                    objB0 = new QnHx(rb2VarC, y81Var, i3);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new QnHx(rb2VarC, y81Var, i3);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                yv4.a(pg2Var2, (x81) objB0, j30VarQ, i3 & 14, 0);
            }
            z2 = z;
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(pg2Var2, one2, z2, y81Var, i, i2);
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(y81Var)) {
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
            if (i8 != 0) {
                one2 = One.QnHx.a;
            } else {
                one2 = one;
            }
            if (i4 != 0) {
                z = false;
            }
            rb2VarC = fe.c(one2, z, j30VarQ);
            j30VarQ.e(511388516);
            zI = j30VarQ.I(y81Var) | j30VarQ.I(rb2VarC);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new QnHx(rb2VarC, y81Var, i3);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new QnHx(rb2VarC, y81Var, i3);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            yv4.a(pg2Var2, (x81) objB0, j30VarQ, i3 & 14, 0);
        } else {
            if (i7 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            if (i8 != 0) {
                one2 = One.QnHx.a;
            } else {
                one2 = one;
            }
            if (i4 != 0) {
                z = false;
            }
            rb2VarC = fe.c(one2, z, j30VarQ);
            j30VarQ.e(511388516);
            zI = j30VarQ.I(y81Var) | j30VarQ.I(rb2VarC);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new QnHx(rb2VarC, y81Var, i3);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new QnHx(rb2VarC, y81Var, i3);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            yv4.a(pg2Var2, (x81) objB0, j30VarQ, i3 & 14, 0);
        }
        z2 = z;
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var2, one2, z2, y81Var, i, i2);
    }
}
