package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ff3 {
    public static final float a = af3.a;
    public static final float b = 240;
    public static final float c = 40;
    public static final vc0 d = new vc0(0.2f);

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ float w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ long y;
        public final /* synthetic */ long z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(float f, pg2 pg2Var, long j, long j2, int i, int i2) {
            super(2);
            this.w = f;
            this.x = pg2Var;
            this.y = j;
            this.z = j2;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ff3.b(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<ro0, sd5> {
        public final /* synthetic */ long w;
        public final /* synthetic */ float x;
        public final /* synthetic */ long y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(long j, long j2, float f) {
            super(1);
            this.w = j;
            this.x = f;
            this.y = j2;
        }

        @Override // defpackage.j81
        public final sd5 invoke(ro0 ro0Var) {
            ro0 ro0Var2 = ro0Var;
            float fC = cm4.c(ro0Var2.d());
            ff3.c(ro0Var2, 1.0f, this.w, fC);
            ff3.c(ro0Var2, this.x, this.y, fC);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9 A[PHI: r1 r3
  0x00a9: PHI (r1v9 pg2) = (r1v3 pg2), (r1v11 pg2) binds: [B:54:0x00a2, B:46:0x0084] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r3v13 long) = (r3v6 long), (r3v14 long) binds: [B:54:0x00a2, B:46:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void a(float f, int i, int i2, long j, g30 g30Var, pg2 pg2Var) {
        pg2 pg2Var2;
        int i3;
        long j2;
        float f2;
        pg2 pg2Var3;
        long jG;
        pg2 pg2Var4;
        float f3;
        long j3;
        pg2 pg2Var5;
        float f4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-392089979);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            pg2Var2 = pg2Var;
        } else if ((i & 14) == 0) {
            pg2Var2 = pg2Var;
            i3 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i;
        } else {
            pg2Var2 = pg2Var;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                int i5 = j30VarQ.j(j2) ? 32 : 16;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                f2 = f;
                i3 |= j30VarQ.g(f2) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !j30VarQ.t()) {
                j30VarQ.t0();
                if ((i & 1) != 0 || j30VarQ.Y()) {
                    if (i4 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if ((i2 & 2) != 0) {
                        jG = ((rv) j30VarQ.E(sv.a)).g();
                    } else {
                        jG = j2;
                    }
                    if (i6 != 0) {
                        pg2Var4 = pg2Var3;
                        f3 = af3.a;
                    }
                    j30VarQ.S();
                    qv4 qv4Var = new qv4(((ij0) j30VarQ.E(r40.e)).b0(f3), 0.0f, 2, 0, 26);
                    bk1 bk1VarI = fTO$.i(j30VarQ);
                    qb5 qb5Var = mg5.b;
                    nq0.QnHx qnHx = nq0.QnHx.a;
                    bk1.QnHx qnHxG = fTO$.g(bk1VarI, 0, 5, qb5Var, hH.q(hH.E(6660, 0, qnHx, 2), 0, 6), j30VarQ);
                    bk1.QnHx qnHxF = fTO$.f(bk1VarI, 286.0f, hH.q(hH.E(1332, 0, qnHx, 2), 0, 6), j30VarQ);
                    df3 df3Var = df3.w;
                    rw1.CQf<Float> cQf = new rw1.CQf<>();
                    df3Var.invoke(cQf);
                    bk1.QnHx qnHxF2 = fTO$.f(bk1VarI, 290.0f, hH.q(new rw1(cQf), 0, 6), j30VarQ);
                    ef3 ef3Var = ef3.w;
                    rw1.CQf<Float> cQf2 = new rw1.CQf<>();
                    ef3Var.invoke(cQf2);
                    float f5 = f3;
                    gn.a(gm4.h(c94.a(pg2Var4, true, hf3.w), c), new bf3(f3, jG, qv4Var, qnHxG, qnHxF2, fTO$.f(bk1VarI, 290.0f, hH.q(new rw1(cQf2), 0, 6), j30VarQ), qnHxF), j30VarQ, 0);
                    j3 = jG;
                    pg2Var5 = pg2Var4;
                    f4 = f5;
                } else {
                    j30VarQ.x();
                    pg2Var3 = pg2Var2;
                    jG = j2;
                }
                pg2Var4 = pg2Var3;
                f3 = f2;
                j30VarQ.S();
                qv4 qv4Var2 = new qv4(((ij0) j30VarQ.E(r40.e)).b0(f3), 0.0f, 2, 0, 26);
                bk1 bk1VarI2 = fTO$.i(j30VarQ);
                qb5 qb5Var2 = mg5.b;
                nq0.QnHx qnHx2 = nq0.QnHx.a;
                bk1.QnHx qnHxG2 = fTO$.g(bk1VarI2, 0, 5, qb5Var2, hH.q(hH.E(6660, 0, qnHx2, 2), 0, 6), j30VarQ);
                bk1.QnHx qnHxF3 = fTO$.f(bk1VarI2, 286.0f, hH.q(hH.E(1332, 0, qnHx2, 2), 0, 6), j30VarQ);
                df3 df3Var2 = df3.w;
                rw1.CQf<Float> cQf3 = new rw1.CQf<>();
                df3Var2.invoke(cQf3);
                bk1.QnHx qnHxF4 = fTO$.f(bk1VarI2, 290.0f, hH.q(new rw1(cQf3), 0, 6), j30VarQ);
                ef3 ef3Var2 = ef3.w;
                rw1.CQf<Float> cQf4 = new rw1.CQf<>();
                ef3Var2.invoke(cQf4);
                float f6 = f3;
                gn.a(gm4.h(c94.a(pg2Var4, true, hf3.w), c), new bf3(f3, jG, qv4Var2, qnHxG2, qnHxF4, fTO$.f(bk1VarI2, 290.0f, hH.q(new rw1(cQf4), 0, 6), j30VarQ), qnHxF3), j30VarQ, 0);
                j3 = jG;
                pg2Var5 = pg2Var4;
                f4 = f6;
            } else {
                j30VarQ.x();
                pg2Var5 = pg2Var2;
                j3 = j2;
                f4 = f2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new cf3(pg2Var5, j3, f4, i, i2);
        }
        i3 |= 384;
        f2 = f;
        if ((i3 & 731) == 146) {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if ((i2 & 2) != 0) {
                    jG = ((rv) j30VarQ.E(sv.a)).g();
                } else {
                    jG = j2;
                }
                if (i6 != 0) {
                    pg2Var4 = pg2Var3;
                    f3 = af3.a;
                } else {
                    pg2Var4 = pg2Var3;
                    f3 = f2;
                }
            } else {
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if ((i2 & 2) != 0) {
                    jG = ((rv) j30VarQ.E(sv.a)).g();
                } else {
                    jG = j2;
                }
                if (i6 != 0) {
                    pg2Var4 = pg2Var3;
                    f3 = af3.a;
                } else {
                    pg2Var4 = pg2Var3;
                    f3 = f2;
                }
            }
            j30VarQ.S();
            qv4 qv4Var3 = new qv4(((ij0) j30VarQ.E(r40.e)).b0(f3), 0.0f, 2, 0, 26);
            bk1 bk1VarI3 = fTO$.i(j30VarQ);
            qb5 qb5Var3 = mg5.b;
            nq0.QnHx qnHx3 = nq0.QnHx.a;
            bk1.QnHx qnHxG3 = fTO$.g(bk1VarI3, 0, 5, qb5Var3, hH.q(hH.E(6660, 0, qnHx3, 2), 0, 6), j30VarQ);
            bk1.QnHx qnHxF5 = fTO$.f(bk1VarI3, 286.0f, hH.q(hH.E(1332, 0, qnHx3, 2), 0, 6), j30VarQ);
            df3 df3Var3 = df3.w;
            rw1.CQf<Float> cQf5 = new rw1.CQf<>();
            df3Var3.invoke(cQf5);
            bk1.QnHx qnHxF6 = fTO$.f(bk1VarI3, 290.0f, hH.q(new rw1(cQf5), 0, 6), j30VarQ);
            ef3 ef3Var3 = ef3.w;
            rw1.CQf<Float> cQf6 = new rw1.CQf<>();
            ef3Var3.invoke(cQf6);
            float f7 = f3;
            gn.a(gm4.h(c94.a(pg2Var4, true, hf3.w), c), new bf3(f3, jG, qv4Var3, qnHxG3, qnHxF6, fTO$.f(bk1VarI3, 290.0f, hH.q(new rw1(cQf6), 0, 6), j30VarQ), qnHxF5), j30VarQ, 0);
            j3 = jG;
            pg2Var5 = pg2Var4;
            f4 = f7;
        } else {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if ((i2 & 2) != 0) {
                    jG = ((rv) j30VarQ.E(sv.a)).g();
                } else {
                    jG = j2;
                }
                if (i6 != 0) {
                    pg2Var4 = pg2Var3;
                    f3 = af3.a;
                } else {
                    pg2Var4 = pg2Var3;
                    f3 = f2;
                }
            } else {
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if ((i2 & 2) != 0) {
                    jG = ((rv) j30VarQ.E(sv.a)).g();
                } else {
                    jG = j2;
                }
                if (i6 != 0) {
                    pg2Var4 = pg2Var3;
                    f3 = af3.a;
                } else {
                    pg2Var4 = pg2Var3;
                    f3 = f2;
                }
            }
            j30VarQ.S();
            qv4 qv4Var4 = new qv4(((ij0) j30VarQ.E(r40.e)).b0(f3), 0.0f, 2, 0, 26);
            bk1 bk1VarI4 = fTO$.i(j30VarQ);
            qb5 qb5Var4 = mg5.b;
            nq0.QnHx qnHx4 = nq0.QnHx.a;
            bk1.QnHx qnHxG4 = fTO$.g(bk1VarI4, 0, 5, qb5Var4, hH.q(hH.E(6660, 0, qnHx4, 2), 0, 6), j30VarQ);
            bk1.QnHx qnHxF7 = fTO$.f(bk1VarI4, 286.0f, hH.q(hH.E(1332, 0, qnHx4, 2), 0, 6), j30VarQ);
            df3 df3Var4 = df3.w;
            rw1.CQf<Float> cQf7 = new rw1.CQf<>();
            df3Var4.invoke(cQf7);
            bk1.QnHx qnHxF8 = fTO$.f(bk1VarI4, 290.0f, hH.q(new rw1(cQf7), 0, 6), j30VarQ);
            ef3 ef3Var4 = ef3.w;
            rw1.CQf<Float> cQf8 = new rw1.CQf<>();
            ef3Var4.invoke(cQf8);
            float f8 = f3;
            gn.a(gm4.h(c94.a(pg2Var4, true, hf3.w), c), new bf3(f3, jG, qv4Var4, qnHxG4, qnHxF8, fTO$.f(bk1VarI4, 290.0f, hH.q(new rw1(cQf8), 0, 6), j30VarQ), qnHxF7), j30VarQ, 0);
            j3 = jG;
            pg2Var5 = pg2Var4;
            f4 = f8;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new cf3(pg2Var5, j3, f4, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x0045  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x005c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0060  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0106  */
    /* JADX WARN: Code duplicated, block: B:73:0x010a  */
    /* JADX WARN: Code duplicated, block: B:78:0x012a  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void b(float f, pg2 pg2Var, long j, long j2, g30 g30Var, int i, int i2) {
        int i3;
        long j3;
        long jB;
        pg2 pg2Var2;
        long jG;
        boolean zI;
        Object objB0;
        long j4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-850309746);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.g(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                i3 |= j30VarQ.I(pg2Var) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    int i5 = j30VarQ.j(j3) ? 256 : 128;
                    i3 |= i5;
                } else {
                    j3 = j;
                }
                i3 |= i5;
            } else {
                j3 = j;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    jB = j2;
                    int i6 = j30VarQ.j(jB) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    jB = j2;
                }
                i3 |= i6;
            } else {
                jB = j2;
            }
            if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                j30VarQ.t0();
                if ((i & 1) != 0 || j30VarQ.Y()) {
                    if (i4 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i2 & 4) != 0) {
                        jG = ((rv) j30VarQ.E(sv.a)).g();
                    } else {
                        jG = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jB = yu.b(jG, 0.24f);
                    }
                } else {
                    j30VarQ.x();
                    pg2Var2 = pg2Var;
                    jG = j3;
                }
                j30VarQ.S();
                pg2 pg2VarI = gm4.i(c94.a(pg2Var2, true, new gf3(f, new pt(0.0f, 1.0f), 0)), b, a);
                yu yuVar = new yu(jB);
                Float fValueOf = Float.valueOf(f);
                yu yuVar2 = new yu(jG);
                j30VarQ.e(1618982084);
                zI = j30VarQ.I(yuVar) | j30VarQ.I(fValueOf) | j30VarQ.I(yuVar2);
                objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new QnHx(jB, jG, f);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                gn.a(pg2VarI, (j81) objB0, j30VarQ, 0);
            } else {
                j30VarQ.x();
                pg2Var2 = pg2Var;
                jG = j3;
            }
            j4 = jB;
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(f, pg2Var2, jG, j4, i, i2);
        }
        i3 |= 48;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (j30VarQ.j(j3)) {
                }
                i3 |= i5;
            } else {
                j3 = j;
            }
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                jB = j2;
                if (j30VarQ.j(jB)) {
                }
                i3 |= i6;
            } else {
                jB = j2;
            }
            i3 |= i6;
        } else {
            jB = j2;
        }
        if ((i3 & 5851) == 1170) {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if ((i2 & 4) != 0) {
                    jG = ((rv) j30VarQ.E(sv.a)).g();
                } else {
                    jG = j3;
                }
                if ((i2 & 8) != 0) {
                    jB = yu.b(jG, 0.24f);
                }
            } else {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if ((i2 & 4) != 0) {
                    jG = ((rv) j30VarQ.E(sv.a)).g();
                } else {
                    jG = j3;
                }
                if ((i2 & 8) != 0) {
                    jB = yu.b(jG, 0.24f);
                }
            }
            j30VarQ.S();
            pg2 pg2VarI2 = gm4.i(c94.a(pg2Var2, true, new gf3(f, new pt(0.0f, 1.0f), 0)), b, a);
            yu yuVar3 = new yu(jB);
            Float fValueOf2 = Float.valueOf(f);
            yu yuVar4 = new yu(jG);
            j30VarQ.e(1618982084);
            zI = j30VarQ.I(yuVar3) | j30VarQ.I(fValueOf2) | j30VarQ.I(yuVar4);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new QnHx(jB, jG, f);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new QnHx(jB, jG, f);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            gn.a(pg2VarI2, (j81) objB0, j30VarQ, 0);
        } else {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if ((i2 & 4) != 0) {
                    jG = ((rv) j30VarQ.E(sv.a)).g();
                } else {
                    jG = j3;
                }
                if ((i2 & 8) != 0) {
                    jB = yu.b(jG, 0.24f);
                }
            } else {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if ((i2 & 4) != 0) {
                    jG = ((rv) j30VarQ.E(sv.a)).g();
                } else {
                    jG = j3;
                }
                if ((i2 & 8) != 0) {
                    jB = yu.b(jG, 0.24f);
                }
            }
            j30VarQ.S();
            pg2 pg2VarI3 = gm4.i(c94.a(pg2Var2, true, new gf3(f, new pt(0.0f, 1.0f), 0)), b, a);
            yu yuVar5 = new yu(jB);
            Float fValueOf3 = Float.valueOf(f);
            yu yuVar6 = new yu(jG);
            j30VarQ.e(1618982084);
            zI = j30VarQ.I(yuVar5) | j30VarQ.I(fValueOf3) | j30VarQ.I(yuVar6);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new QnHx(jB, jG, f);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new QnHx(jB, jG, f);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            gn.a(pg2VarI3, (j81) objB0, j30VarQ, 0);
        }
        j4 = jB;
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(f, pg2Var2, jG, j4, i, i2);
    }

    public static final void c(ro0 ro0Var, float f, long j, float f2) {
        float fE = cm4.e(ro0Var.d());
        float fC = cm4.c(ro0Var.d()) / 2;
        boolean z = ro0Var.getLayoutDirection() == jy1.Ltr;
        ro0Var.E(j, X.a((z ? 0.0f : 1.0f - f) * fE, fC), X.a((z ? f : 1.0f) * fE, fC), (496 & 8) != 0 ? 0.0f : f2, (496 & 16) != 0 ? 0 : 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, (496 & 256) != 0 ? 3 : 0);
    }
}
