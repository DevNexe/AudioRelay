package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uh3 {
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float f;
    public static final float a = 24;
    public static final float e = 12;

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ci2 A;
        public final /* synthetic */ th3 B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ h81<sd5> x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(boolean z, h81<sd5> h81Var, pg2 pg2Var, boolean z2, ci2 ci2Var, th3 th3Var, int i, int i2) {
            super(2);
            this.w = z;
            this.x = h81Var;
            this.y = pg2Var;
            this.z = z2;
            this.A = ci2Var;
            this.B = th3Var;
            this.C = i;
            this.D = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            uh3.a(this.w, this.x, this.y, this.z, this.A, this.B, g30Var, this.C | 1, this.D);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<ro0, sd5> {
        public final /* synthetic */ is4<yu> w;
        public final /* synthetic */ is4<wm0> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(is4 is4Var, AOdm aOdm) {
            super(1);
            this.w = is4Var;
            this.x = aOdm;
        }

        @Override // defpackage.j81
        public final sd5 invoke(ro0 ro0Var) {
            ro0 ro0Var2 = ro0Var;
            float fB0 = ro0Var2.b0(uh3.f);
            is4<yu> is4Var = this.w;
            float f = fB0 / 2;
            ro0Var2.V(is4Var.getValue().a, (124 & 2) != 0 ? cm4.d(ro0Var2.d()) / 2.0f : ro0Var2.b0(uh3.d) - f, (124 & 4) != 0 ? ro0Var2.t0() : 0L, (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? gx0.w : new qv4(fB0, 0.0f, 0, 0, 30), null, (124 & 64) != 0 ? 3 : 0);
            is4<wm0> is4Var2 = this.x;
            if (Float.compare(is4Var2.getValue().w, 0) > 0) {
                ro0Var2.V(is4Var.getValue().a, (124 & 2) != 0 ? cm4.d(ro0Var2.d()) / 2.0f : ro0Var2.b0(is4Var2.getValue().w) - f, (124 & 4) != 0 ? ro0Var2.t0() : 0L, (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? gx0.w : gx0.w, null, (124 & 64) != 0 ? 3 : 0);
            }
            return sd5.a;
        }
    }

    static {
        float f2 = 2;
        b = f2;
        float f3 = 20;
        c = f3;
        d = f3 / f2;
        f = f2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01af  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:105:0x0211  */
    /* JADX WARN: Code duplicated, block: B:108:0x0223  */
    /* JADX WARN: Code duplicated, block: B:109:0x0230  */
    /* JADX WARN: Code duplicated, block: B:112:0x0273  */
    /* JADX WARN: Code duplicated, block: B:114:0x0277  */
    /* JADX WARN: Code duplicated, block: B:119:0x0294  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0181  */
    /* JADX WARN: Code duplicated, block: B:96:0x019c  */
    public static final void a(boolean z, h81<sd5> h81Var, pg2 pg2Var, boolean z2, ci2 ci2Var, th3 th3Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        ci2 ci2Var2;
        int i7;
        th3 th3Var2;
        int i8;
        g30.QnHx.C0132QnHx c0132QnHx;
        pg2.QnHx qnHx;
        ci2 ci2Var3;
        j30 j30Var;
        ci2 ci2Var4;
        boolean z4;
        th3 th3Var3;
        pg2 pg2Var3;
        long jI;
        long jB;
        long jB2;
        boolean zI;
        Object objB0;
        Object objB1;
        int i9;
        float f2;
        AOdm aOdmA;
        is4 is4VarA;
        j30 j30Var2;
        pg2.QnHx qnHx2;
        boolean z5;
        pg2 pg2VarA;
        pg2 pg2VarA2;
        boolean zI2;
        Object objB2;
        th3 th3Var4;
        boolean z6;
        ci2 ci2Var5;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(1314435585);
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
                        ci2Var2 = ci2Var;
                        if (j30VarQ.I(ci2Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            th3Var2 = th3Var;
                            int i11 = j30VarQ.I(th3Var2) ? 131072 : 65536;
                            i3 |= i11;
                        } else {
                            th3Var2 = th3Var;
                        }
                        i3 |= i11;
                    } else {
                        th3Var2 = th3Var;
                    }
                    if ((i3 & 374491) == 74898 || !j30VarQ.t()) {
                        j30VarQ.t0();
                        i8 = i & 1;
                        c0132QnHx = g30.QnHx.a;
                        qnHx = pg2.QnHx.w;
                        if (i8 != 0 || j30VarQ.Y()) {
                            if (i10 != 0) {
                                pg2Var2 = qnHx;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                j30VarQ.e(-492369756);
                                objB1 = j30VarQ.b0();
                                if (objB1 == c0132QnHx) {
                                    objB1 = new di2();
                                    j30VarQ.F0(objB1);
                                }
                                j30VarQ.R(false);
                                ci2Var3 = (ci2) objB1;
                            } else {
                                ci2Var3 = ci2Var;
                            }
                            if ((i2 & 32) != 0) {
                                j30VarQ.e(1370708026);
                                jt4 jt4Var = sv.a;
                                jI = ((rv) j30VarQ.E(jt4Var)).i();
                                jB = yu.b(((rv) j30VarQ.E(jt4Var)).f(), 0.6f);
                                jB2 = yu.b(((rv) j30VarQ.E(jt4Var)).f(), AY.z(j30VarQ));
                                yu yuVar = new yu(jI);
                                yu yuVar2 = new yu(jB);
                                yu yuVar3 = new yu(jB2);
                                j30Var = j30VarQ;
                                j30Var.e(1618982084);
                                zI = j30Var.I(yuVar3) | j30Var.I(yuVar) | j30Var.I(yuVar2);
                                objB0 = j30Var.b0();
                                if (zI || objB0 == c0132QnHx) {
                                    objB0 = new kh0(jI, jB, jB2);
                                    j30Var.F0(objB0);
                                }
                                j30Var.R(false);
                                j30Var.R(false);
                                th3Var2 = (kh0) objB0;
                            } else {
                                j30Var = j30VarQ;
                            }
                            ci2Var4 = ci2Var3;
                            z4 = z3;
                            th3Var3 = th3Var2;
                            pg2Var3 = pg2Var2;
                        } else {
                            j30VarQ.x();
                            ci2Var4 = ci2Var;
                            z4 = z3;
                            th3Var3 = th3Var2;
                            j30Var = j30VarQ;
                            pg2Var3 = pg2Var2;
                        }
                        j30Var.S();
                        if (z) {
                            f2 = e / 2;
                            i9 = 0;
                        } else {
                            i9 = 0;
                            f2 = 0;
                        }
                        aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                        is4VarA = th3Var3.a(z4, z, j30Var);
                        j30Var.e(1941632354);
                        if (h81Var != null) {
                            j30 j30Var3 = j30Var;
                            qnHx2 = qnHx;
                            z5 = false;
                            j30Var2 = j30Var3;
                            pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var3, 54, 4), z4, new zs3(3), h81Var);
                        } else {
                            j30Var2 = j30Var;
                            qnHx2 = qnHx;
                            z5 = false;
                            pg2VarA = qnHx2;
                        }
                        j30Var2.R(z5);
                        if (h81Var != null) {
                            jt4 jt4Var2 = f95.a;
                            pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                        } else {
                            pg2VarA2 = qnHx2;
                        }
                        pg2 pg2VarT = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                        float f3 = c;
                        wo1.QnHx qnHx3 = wo1.a;
                        pg2 pg2VarY = pg2VarT.y(new lm4(f3, f3, f3, f3, false));
                        j30Var2.e(511388516);
                        zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                        objB2 = j30Var2.b0();
                        if (zI2 || objB2 == c0132QnHx) {
                            objB2 = new QnHx(is4VarA, aOdmA);
                            j30Var2.F0(objB2);
                        }
                        j30Var2.R(false);
                        gn.a(pg2VarY, (j81) objB2, j30Var2, 0);
                        th3Var4 = th3Var3;
                        pg2Var2 = pg2Var3;
                        z6 = z4;
                        ci2Var5 = ci2Var4;
                    } else {
                        j30VarQ.x();
                        j30Var2 = j30VarQ;
                        z6 = z3;
                        ci2Var5 = ci2Var2;
                        th3Var4 = th3Var2;
                    }
                    tk3VarU = j30Var2.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(z, h81Var, pg2Var2, z6, ci2Var5, th3Var4, i, i2);
                }
                i3 |= 24576;
                ci2Var2 = ci2Var;
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        th3Var2 = th3Var;
                        if (j30VarQ.I(th3Var2)) {
                        }
                        i3 |= i11;
                    } else {
                        th3Var2 = th3Var;
                    }
                    i3 |= i11;
                } else {
                    th3Var2 = th3Var;
                }
                if ((i3 & 374491) == 74898) {
                    j30VarQ.t0();
                    i8 = i & 1;
                    c0132QnHx = g30.QnHx.a;
                    qnHx = pg2.QnHx.w;
                    if (i8 != 0) {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var3 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var3)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var3)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var3)).f(), AY.z(j30VarQ));
                            yu yuVar4 = new yu(jI);
                            yu yuVar5 = new yu(jB);
                            yu yuVar6 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar6) | j30Var.I(yuVar4) | j30Var.I(yuVar5);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var4 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var4)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var4)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var4)).f(), AY.z(j30VarQ));
                            yu yuVar7 = new yu(jI);
                            yu yuVar8 = new yu(jB);
                            yu yuVar9 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar9) | j30Var.I(yuVar7) | j30Var.I(yuVar8);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    }
                    j30Var.S();
                    if (z) {
                        f2 = e / 2;
                        i9 = 0;
                    } else {
                        i9 = 0;
                        f2 = 0;
                    }
                    aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                    is4VarA = th3Var3.a(z4, z, j30Var);
                    j30Var.e(1941632354);
                    if (h81Var != null) {
                        j30 j30Var4 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        j30Var2 = j30Var4;
                        pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var4, 54, 4), z4, new zs3(3), h81Var);
                    } else {
                        j30Var2 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        pg2VarA = qnHx2;
                    }
                    j30Var2.R(z5);
                    if (h81Var != null) {
                        jt4 jt4Var5 = f95.a;
                        pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                    } else {
                        pg2VarA2 = qnHx2;
                    }
                    pg2 pg2VarT2 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                    float f4 = c;
                    wo1.QnHx qnHx4 = wo1.a;
                    pg2 pg2VarY2 = pg2VarT2.y(new lm4(f4, f4, f4, f4, false));
                    j30Var2.e(511388516);
                    zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                    objB2 = j30Var2.b0();
                    if (zI2) {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    } else {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    }
                    j30Var2.R(false);
                    gn.a(pg2VarY2, (j81) objB2, j30Var2, 0);
                    th3Var4 = th3Var3;
                    pg2Var2 = pg2Var3;
                    z6 = z4;
                    ci2Var5 = ci2Var4;
                } else {
                    j30VarQ.t0();
                    i8 = i & 1;
                    c0132QnHx = g30.QnHx.a;
                    qnHx = pg2.QnHx.w;
                    if (i8 != 0) {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var6 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var6)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var6)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var6)).f(), AY.z(j30VarQ));
                            yu yuVar10 = new yu(jI);
                            yu yuVar11 = new yu(jB);
                            yu yuVar12 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar12) | j30Var.I(yuVar10) | j30Var.I(yuVar11);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var7 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var7)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var7)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var7)).f(), AY.z(j30VarQ));
                            yu yuVar13 = new yu(jI);
                            yu yuVar14 = new yu(jB);
                            yu yuVar15 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar15) | j30Var.I(yuVar13) | j30Var.I(yuVar14);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    }
                    j30Var.S();
                    if (z) {
                        f2 = e / 2;
                        i9 = 0;
                    } else {
                        i9 = 0;
                        f2 = 0;
                    }
                    aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                    is4VarA = th3Var3.a(z4, z, j30Var);
                    j30Var.e(1941632354);
                    if (h81Var != null) {
                        j30 j30Var5 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        j30Var2 = j30Var5;
                        pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var5, 54, 4), z4, new zs3(3), h81Var);
                    } else {
                        j30Var2 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        pg2VarA = qnHx2;
                    }
                    j30Var2.R(z5);
                    if (h81Var != null) {
                        jt4 jt4Var8 = f95.a;
                        pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                    } else {
                        pg2VarA2 = qnHx2;
                    }
                    pg2 pg2VarT3 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                    float f5 = c;
                    wo1.QnHx qnHx5 = wo1.a;
                    pg2 pg2VarY3 = pg2VarT3.y(new lm4(f5, f5, f5, f5, false));
                    j30Var2.e(511388516);
                    zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                    objB2 = j30Var2.b0();
                    if (zI2) {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    } else {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    }
                    j30Var2.R(false);
                    gn.a(pg2VarY3, (j81) objB2, j30Var2, 0);
                    th3Var4 = th3Var3;
                    pg2Var2 = pg2Var3;
                    z6 = z4;
                    ci2Var5 = ci2Var4;
                }
                tk3VarU = j30Var2.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(z, h81Var, pg2Var2, z6, ci2Var5, th3Var4, i, i2);
            }
            i3 |= 3072;
            z3 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    ci2Var2 = ci2Var;
                    if (j30VarQ.I(ci2Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        th3Var2 = th3Var;
                        if (j30VarQ.I(th3Var2)) {
                        }
                        i3 |= i11;
                    } else {
                        th3Var2 = th3Var;
                    }
                    i3 |= i11;
                } else {
                    th3Var2 = th3Var;
                }
                if ((i3 & 374491) == 74898) {
                    j30VarQ.t0();
                    i8 = i & 1;
                    c0132QnHx = g30.QnHx.a;
                    qnHx = pg2.QnHx.w;
                    if (i8 != 0) {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var9 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var9)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var9)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var9)).f(), AY.z(j30VarQ));
                            yu yuVar16 = new yu(jI);
                            yu yuVar17 = new yu(jB);
                            yu yuVar18 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar18) | j30Var.I(yuVar16) | j30Var.I(yuVar17);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var10 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var10)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var10)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var10)).f(), AY.z(j30VarQ));
                            yu yuVar19 = new yu(jI);
                            yu yuVar110 = new yu(jB);
                            yu yuVar111 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar111) | j30Var.I(yuVar19) | j30Var.I(yuVar110);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    }
                    j30Var.S();
                    if (z) {
                        f2 = e / 2;
                        i9 = 0;
                    } else {
                        i9 = 0;
                        f2 = 0;
                    }
                    aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                    is4VarA = th3Var3.a(z4, z, j30Var);
                    j30Var.e(1941632354);
                    if (h81Var != null) {
                        j30 j30Var6 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        j30Var2 = j30Var6;
                        pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var6, 54, 4), z4, new zs3(3), h81Var);
                    } else {
                        j30Var2 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        pg2VarA = qnHx2;
                    }
                    j30Var2.R(z5);
                    if (h81Var != null) {
                        jt4 jt4Var11 = f95.a;
                        pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                    } else {
                        pg2VarA2 = qnHx2;
                    }
                    pg2 pg2VarT4 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                    float f6 = c;
                    wo1.QnHx qnHx6 = wo1.a;
                    pg2 pg2VarY4 = pg2VarT4.y(new lm4(f6, f6, f6, f6, false));
                    j30Var2.e(511388516);
                    zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                    objB2 = j30Var2.b0();
                    if (zI2) {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    } else {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    }
                    j30Var2.R(false);
                    gn.a(pg2VarY4, (j81) objB2, j30Var2, 0);
                    th3Var4 = th3Var3;
                    pg2Var2 = pg2Var3;
                    z6 = z4;
                    ci2Var5 = ci2Var4;
                } else {
                    j30VarQ.t0();
                    i8 = i & 1;
                    c0132QnHx = g30.QnHx.a;
                    qnHx = pg2.QnHx.w;
                    if (i8 != 0) {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var12 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var12)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var12)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var12)).f(), AY.z(j30VarQ));
                            yu yuVar112 = new yu(jI);
                            yu yuVar113 = new yu(jB);
                            yu yuVar114 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar114) | j30Var.I(yuVar112) | j30Var.I(yuVar113);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var13 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var13)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var13)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var13)).f(), AY.z(j30VarQ));
                            yu yuVar115 = new yu(jI);
                            yu yuVar116 = new yu(jB);
                            yu yuVar117 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar117) | j30Var.I(yuVar115) | j30Var.I(yuVar116);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    }
                    j30Var.S();
                    if (z) {
                        f2 = e / 2;
                        i9 = 0;
                    } else {
                        i9 = 0;
                        f2 = 0;
                    }
                    aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                    is4VarA = th3Var3.a(z4, z, j30Var);
                    j30Var.e(1941632354);
                    if (h81Var != null) {
                        j30 j30Var7 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        j30Var2 = j30Var7;
                        pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var7, 54, 4), z4, new zs3(3), h81Var);
                    } else {
                        j30Var2 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        pg2VarA = qnHx2;
                    }
                    j30Var2.R(z5);
                    if (h81Var != null) {
                        jt4 jt4Var14 = f95.a;
                        pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                    } else {
                        pg2VarA2 = qnHx2;
                    }
                    pg2 pg2VarT5 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                    float f7 = c;
                    wo1.QnHx qnHx7 = wo1.a;
                    pg2 pg2VarY5 = pg2VarT5.y(new lm4(f7, f7, f7, f7, false));
                    j30Var2.e(511388516);
                    zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                    objB2 = j30Var2.b0();
                    if (zI2) {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    } else {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    }
                    j30Var2.R(false);
                    gn.a(pg2VarY5, (j81) objB2, j30Var2, 0);
                    th3Var4 = th3Var3;
                    pg2Var2 = pg2Var3;
                    z6 = z4;
                    ci2Var5 = ci2Var4;
                }
                tk3VarU = j30Var2.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(z, h81Var, pg2Var2, z6, ci2Var5, th3Var4, i, i2);
            }
            i3 |= 24576;
            ci2Var2 = ci2Var;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    th3Var2 = th3Var;
                    if (j30VarQ.I(th3Var2)) {
                    }
                    i3 |= i11;
                } else {
                    th3Var2 = th3Var;
                }
                i3 |= i11;
            } else {
                th3Var2 = th3Var;
            }
            if ((i3 & 374491) == 74898) {
                j30VarQ.t0();
                i8 = i & 1;
                c0132QnHx = g30.QnHx.a;
                qnHx = pg2.QnHx.w;
                if (i8 != 0) {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var15 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var15)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var15)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var15)).f(), AY.z(j30VarQ));
                        yu yuVar118 = new yu(jI);
                        yu yuVar119 = new yu(jB);
                        yu yuVar1110 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar1110) | j30Var.I(yuVar118) | j30Var.I(yuVar119);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var16 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var16)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var16)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var16)).f(), AY.z(j30VarQ));
                        yu yuVar1111 = new yu(jI);
                        yu yuVar1112 = new yu(jB);
                        yu yuVar1113 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar1113) | j30Var.I(yuVar1111) | j30Var.I(yuVar1112);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                }
                j30Var.S();
                if (z) {
                    f2 = e / 2;
                    i9 = 0;
                } else {
                    i9 = 0;
                    f2 = 0;
                }
                aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                is4VarA = th3Var3.a(z4, z, j30Var);
                j30Var.e(1941632354);
                if (h81Var != null) {
                    j30 j30Var8 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    j30Var2 = j30Var8;
                    pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var8, 54, 4), z4, new zs3(3), h81Var);
                } else {
                    j30Var2 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    pg2VarA = qnHx2;
                }
                j30Var2.R(z5);
                if (h81Var != null) {
                    jt4 jt4Var17 = f95.a;
                    pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                } else {
                    pg2VarA2 = qnHx2;
                }
                pg2 pg2VarT6 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                float f8 = c;
                wo1.QnHx qnHx8 = wo1.a;
                pg2 pg2VarY6 = pg2VarT6.y(new lm4(f8, f8, f8, f8, false));
                j30Var2.e(511388516);
                zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                objB2 = j30Var2.b0();
                if (zI2) {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                } else {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                }
                j30Var2.R(false);
                gn.a(pg2VarY6, (j81) objB2, j30Var2, 0);
                th3Var4 = th3Var3;
                pg2Var2 = pg2Var3;
                z6 = z4;
                ci2Var5 = ci2Var4;
            } else {
                j30VarQ.t0();
                i8 = i & 1;
                c0132QnHx = g30.QnHx.a;
                qnHx = pg2.QnHx.w;
                if (i8 != 0) {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var18 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var18)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var18)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var18)).f(), AY.z(j30VarQ));
                        yu yuVar1114 = new yu(jI);
                        yu yuVar1115 = new yu(jB);
                        yu yuVar1116 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar1116) | j30Var.I(yuVar1114) | j30Var.I(yuVar1115);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var19 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var19)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var19)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var19)).f(), AY.z(j30VarQ));
                        yu yuVar1117 = new yu(jI);
                        yu yuVar1118 = new yu(jB);
                        yu yuVar1119 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar1119) | j30Var.I(yuVar1117) | j30Var.I(yuVar1118);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                }
                j30Var.S();
                if (z) {
                    f2 = e / 2;
                    i9 = 0;
                } else {
                    i9 = 0;
                    f2 = 0;
                }
                aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                is4VarA = th3Var3.a(z4, z, j30Var);
                j30Var.e(1941632354);
                if (h81Var != null) {
                    j30 j30Var9 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    j30Var2 = j30Var9;
                    pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var9, 54, 4), z4, new zs3(3), h81Var);
                } else {
                    j30Var2 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    pg2VarA = qnHx2;
                }
                j30Var2.R(z5);
                if (h81Var != null) {
                    jt4 jt4Var110 = f95.a;
                    pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                } else {
                    pg2VarA2 = qnHx2;
                }
                pg2 pg2VarT7 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                float f9 = c;
                wo1.QnHx qnHx9 = wo1.a;
                pg2 pg2VarY7 = pg2VarT7.y(new lm4(f9, f9, f9, f9, false));
                j30Var2.e(511388516);
                zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                objB2 = j30Var2.b0();
                if (zI2) {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                } else {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                }
                j30Var2.R(false);
                gn.a(pg2VarY7, (j81) objB2, j30Var2, 0);
                th3Var4 = th3Var3;
                pg2Var2 = pg2Var3;
                z6 = z4;
                ci2Var5 = ci2Var4;
            }
            tk3VarU = j30Var2.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(z, h81Var, pg2Var2, z6, ci2Var5, th3Var4, i, i2);
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
                    ci2Var2 = ci2Var;
                    if (j30VarQ.I(ci2Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        th3Var2 = th3Var;
                        if (j30VarQ.I(th3Var2)) {
                        }
                        i3 |= i11;
                    } else {
                        th3Var2 = th3Var;
                    }
                    i3 |= i11;
                } else {
                    th3Var2 = th3Var;
                }
                if ((i3 & 374491) == 74898) {
                    j30VarQ.t0();
                    i8 = i & 1;
                    c0132QnHx = g30.QnHx.a;
                    qnHx = pg2.QnHx.w;
                    if (i8 != 0) {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var111 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var111)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var111)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var111)).f(), AY.z(j30VarQ));
                            yu yuVar11110 = new yu(jI);
                            yu yuVar11111 = new yu(jB);
                            yu yuVar11112 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar11112) | j30Var.I(yuVar11110) | j30Var.I(yuVar11111);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var112 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var112)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var112)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var112)).f(), AY.z(j30VarQ));
                            yu yuVar11113 = new yu(jI);
                            yu yuVar11114 = new yu(jB);
                            yu yuVar11115 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar11115) | j30Var.I(yuVar11113) | j30Var.I(yuVar11114);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    }
                    j30Var.S();
                    if (z) {
                        f2 = e / 2;
                        i9 = 0;
                    } else {
                        i9 = 0;
                        f2 = 0;
                    }
                    aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                    is4VarA = th3Var3.a(z4, z, j30Var);
                    j30Var.e(1941632354);
                    if (h81Var != null) {
                        j30 j30Var10 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        j30Var2 = j30Var10;
                        pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var10, 54, 4), z4, new zs3(3), h81Var);
                    } else {
                        j30Var2 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        pg2VarA = qnHx2;
                    }
                    j30Var2.R(z5);
                    if (h81Var != null) {
                        jt4 jt4Var113 = f95.a;
                        pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                    } else {
                        pg2VarA2 = qnHx2;
                    }
                    pg2 pg2VarT8 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                    float f10 = c;
                    wo1.QnHx qnHx10 = wo1.a;
                    pg2 pg2VarY8 = pg2VarT8.y(new lm4(f10, f10, f10, f10, false));
                    j30Var2.e(511388516);
                    zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                    objB2 = j30Var2.b0();
                    if (zI2) {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    } else {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    }
                    j30Var2.R(false);
                    gn.a(pg2VarY8, (j81) objB2, j30Var2, 0);
                    th3Var4 = th3Var3;
                    pg2Var2 = pg2Var3;
                    z6 = z4;
                    ci2Var5 = ci2Var4;
                } else {
                    j30VarQ.t0();
                    i8 = i & 1;
                    c0132QnHx = g30.QnHx.a;
                    qnHx = pg2.QnHx.w;
                    if (i8 != 0) {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var114 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var114)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var114)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var114)).f(), AY.z(j30VarQ));
                            yu yuVar11116 = new yu(jI);
                            yu yuVar11117 = new yu(jB);
                            yu yuVar11118 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar11118) | j30Var.I(yuVar11116) | j30Var.I(yuVar11117);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    } else {
                        if (i10 != 0) {
                            pg2Var2 = qnHx;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            j30VarQ.e(-492369756);
                            objB1 = j30VarQ.b0();
                            if (objB1 == c0132QnHx) {
                                objB1 = new di2();
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB1;
                        } else {
                            ci2Var3 = ci2Var;
                        }
                        if ((i2 & 32) != 0) {
                            j30VarQ.e(1370708026);
                            jt4 jt4Var115 = sv.a;
                            jI = ((rv) j30VarQ.E(jt4Var115)).i();
                            jB = yu.b(((rv) j30VarQ.E(jt4Var115)).f(), 0.6f);
                            jB2 = yu.b(((rv) j30VarQ.E(jt4Var115)).f(), AY.z(j30VarQ));
                            yu yuVar11119 = new yu(jI);
                            yu yuVar111110 = new yu(jB);
                            yu yuVar111111 = new yu(jB2);
                            j30Var = j30VarQ;
                            j30Var.e(1618982084);
                            zI = j30Var.I(yuVar111111) | j30Var.I(yuVar11119) | j30Var.I(yuVar111110);
                            objB0 = j30Var.b0();
                            if (zI) {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            } else {
                                objB0 = new kh0(jI, jB, jB2);
                                j30Var.F0(objB0);
                            }
                            j30Var.R(false);
                            j30Var.R(false);
                            th3Var2 = (kh0) objB0;
                        } else {
                            j30Var = j30VarQ;
                        }
                        ci2Var4 = ci2Var3;
                        z4 = z3;
                        th3Var3 = th3Var2;
                        pg2Var3 = pg2Var2;
                    }
                    j30Var.S();
                    if (z) {
                        f2 = e / 2;
                        i9 = 0;
                    } else {
                        i9 = 0;
                        f2 = 0;
                    }
                    aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                    is4VarA = th3Var3.a(z4, z, j30Var);
                    j30Var.e(1941632354);
                    if (h81Var != null) {
                        j30 j30Var11 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        j30Var2 = j30Var11;
                        pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var11, 54, 4), z4, new zs3(3), h81Var);
                    } else {
                        j30Var2 = j30Var;
                        qnHx2 = qnHx;
                        z5 = false;
                        pg2VarA = qnHx2;
                    }
                    j30Var2.R(z5);
                    if (h81Var != null) {
                        jt4 jt4Var116 = f95.a;
                        pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                    } else {
                        pg2VarA2 = qnHx2;
                    }
                    pg2 pg2VarT9 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                    float f11 = c;
                    wo1.QnHx qnHx11 = wo1.a;
                    pg2 pg2VarY9 = pg2VarT9.y(new lm4(f11, f11, f11, f11, false));
                    j30Var2.e(511388516);
                    zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                    objB2 = j30Var2.b0();
                    if (zI2) {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    } else {
                        objB2 = new QnHx(is4VarA, aOdmA);
                        j30Var2.F0(objB2);
                    }
                    j30Var2.R(false);
                    gn.a(pg2VarY9, (j81) objB2, j30Var2, 0);
                    th3Var4 = th3Var3;
                    pg2Var2 = pg2Var3;
                    z6 = z4;
                    ci2Var5 = ci2Var4;
                }
                tk3VarU = j30Var2.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(z, h81Var, pg2Var2, z6, ci2Var5, th3Var4, i, i2);
            }
            i3 |= 24576;
            ci2Var2 = ci2Var;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    th3Var2 = th3Var;
                    if (j30VarQ.I(th3Var2)) {
                    }
                    i3 |= i11;
                } else {
                    th3Var2 = th3Var;
                }
                i3 |= i11;
            } else {
                th3Var2 = th3Var;
            }
            if ((i3 & 374491) == 74898) {
                j30VarQ.t0();
                i8 = i & 1;
                c0132QnHx = g30.QnHx.a;
                qnHx = pg2.QnHx.w;
                if (i8 != 0) {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var117 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var117)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var117)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var117)).f(), AY.z(j30VarQ));
                        yu yuVar111112 = new yu(jI);
                        yu yuVar111113 = new yu(jB);
                        yu yuVar111114 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar111114) | j30Var.I(yuVar111112) | j30Var.I(yuVar111113);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var118 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var118)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var118)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var118)).f(), AY.z(j30VarQ));
                        yu yuVar111115 = new yu(jI);
                        yu yuVar111116 = new yu(jB);
                        yu yuVar111117 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar111117) | j30Var.I(yuVar111115) | j30Var.I(yuVar111116);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                }
                j30Var.S();
                if (z) {
                    f2 = e / 2;
                    i9 = 0;
                } else {
                    i9 = 0;
                    f2 = 0;
                }
                aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                is4VarA = th3Var3.a(z4, z, j30Var);
                j30Var.e(1941632354);
                if (h81Var != null) {
                    j30 j30Var12 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    j30Var2 = j30Var12;
                    pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var12, 54, 4), z4, new zs3(3), h81Var);
                } else {
                    j30Var2 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    pg2VarA = qnHx2;
                }
                j30Var2.R(z5);
                if (h81Var != null) {
                    jt4 jt4Var119 = f95.a;
                    pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                } else {
                    pg2VarA2 = qnHx2;
                }
                pg2 pg2VarT10 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                float f12 = c;
                wo1.QnHx qnHx12 = wo1.a;
                pg2 pg2VarY10 = pg2VarT10.y(new lm4(f12, f12, f12, f12, false));
                j30Var2.e(511388516);
                zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                objB2 = j30Var2.b0();
                if (zI2) {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                } else {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                }
                j30Var2.R(false);
                gn.a(pg2VarY10, (j81) objB2, j30Var2, 0);
                th3Var4 = th3Var3;
                pg2Var2 = pg2Var3;
                z6 = z4;
                ci2Var5 = ci2Var4;
            } else {
                j30VarQ.t0();
                i8 = i & 1;
                c0132QnHx = g30.QnHx.a;
                qnHx = pg2.QnHx.w;
                if (i8 != 0) {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var1110 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var1110)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var1110)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var1110)).f(), AY.z(j30VarQ));
                        yu yuVar111118 = new yu(jI);
                        yu yuVar111119 = new yu(jB);
                        yu yuVar1111110 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar1111110) | j30Var.I(yuVar111118) | j30Var.I(yuVar111119);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var1111 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var1111)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var1111)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var1111)).f(), AY.z(j30VarQ));
                        yu yuVar1111111 = new yu(jI);
                        yu yuVar1111112 = new yu(jB);
                        yu yuVar1111113 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar1111113) | j30Var.I(yuVar1111111) | j30Var.I(yuVar1111112);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                }
                j30Var.S();
                if (z) {
                    f2 = e / 2;
                    i9 = 0;
                } else {
                    i9 = 0;
                    f2 = 0;
                }
                aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                is4VarA = th3Var3.a(z4, z, j30Var);
                j30Var.e(1941632354);
                if (h81Var != null) {
                    j30 j30Var13 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    j30Var2 = j30Var13;
                    pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var13, 54, 4), z4, new zs3(3), h81Var);
                } else {
                    j30Var2 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    pg2VarA = qnHx2;
                }
                j30Var2.R(z5);
                if (h81Var != null) {
                    jt4 jt4Var1112 = f95.a;
                    pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                } else {
                    pg2VarA2 = qnHx2;
                }
                pg2 pg2VarT11 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                float f13 = c;
                wo1.QnHx qnHx13 = wo1.a;
                pg2 pg2VarY11 = pg2VarT11.y(new lm4(f13, f13, f13, f13, false));
                j30Var2.e(511388516);
                zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                objB2 = j30Var2.b0();
                if (zI2) {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                } else {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                }
                j30Var2.R(false);
                gn.a(pg2VarY11, (j81) objB2, j30Var2, 0);
                th3Var4 = th3Var3;
                pg2Var2 = pg2Var3;
                z6 = z4;
                ci2Var5 = ci2Var4;
            }
            tk3VarU = j30Var2.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(z, h81Var, pg2Var2, z6, ci2Var5, th3Var4, i, i2);
        }
        i3 |= 3072;
        z3 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                ci2Var2 = ci2Var;
                if (j30VarQ.I(ci2Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    th3Var2 = th3Var;
                    if (j30VarQ.I(th3Var2)) {
                    }
                    i3 |= i11;
                } else {
                    th3Var2 = th3Var;
                }
                i3 |= i11;
            } else {
                th3Var2 = th3Var;
            }
            if ((i3 & 374491) == 74898) {
                j30VarQ.t0();
                i8 = i & 1;
                c0132QnHx = g30.QnHx.a;
                qnHx = pg2.QnHx.w;
                if (i8 != 0) {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var1113 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var1113)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var1113)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var1113)).f(), AY.z(j30VarQ));
                        yu yuVar1111114 = new yu(jI);
                        yu yuVar1111115 = new yu(jB);
                        yu yuVar1111116 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar1111116) | j30Var.I(yuVar1111114) | j30Var.I(yuVar1111115);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var1114 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var1114)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var1114)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var1114)).f(), AY.z(j30VarQ));
                        yu yuVar1111117 = new yu(jI);
                        yu yuVar1111118 = new yu(jB);
                        yu yuVar1111119 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar1111119) | j30Var.I(yuVar1111117) | j30Var.I(yuVar1111118);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                }
                j30Var.S();
                if (z) {
                    f2 = e / 2;
                    i9 = 0;
                } else {
                    i9 = 0;
                    f2 = 0;
                }
                aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                is4VarA = th3Var3.a(z4, z, j30Var);
                j30Var.e(1941632354);
                if (h81Var != null) {
                    j30 j30Var14 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    j30Var2 = j30Var14;
                    pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var14, 54, 4), z4, new zs3(3), h81Var);
                } else {
                    j30Var2 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    pg2VarA = qnHx2;
                }
                j30Var2.R(z5);
                if (h81Var != null) {
                    jt4 jt4Var1115 = f95.a;
                    pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                } else {
                    pg2VarA2 = qnHx2;
                }
                pg2 pg2VarT12 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                float f14 = c;
                wo1.QnHx qnHx14 = wo1.a;
                pg2 pg2VarY12 = pg2VarT12.y(new lm4(f14, f14, f14, f14, false));
                j30Var2.e(511388516);
                zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                objB2 = j30Var2.b0();
                if (zI2) {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                } else {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                }
                j30Var2.R(false);
                gn.a(pg2VarY12, (j81) objB2, j30Var2, 0);
                th3Var4 = th3Var3;
                pg2Var2 = pg2Var3;
                z6 = z4;
                ci2Var5 = ci2Var4;
            } else {
                j30VarQ.t0();
                i8 = i & 1;
                c0132QnHx = g30.QnHx.a;
                qnHx = pg2.QnHx.w;
                if (i8 != 0) {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var1116 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var1116)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var1116)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var1116)).f(), AY.z(j30VarQ));
                        yu yuVar11111110 = new yu(jI);
                        yu yuVar11111111 = new yu(jB);
                        yu yuVar11111112 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar11111112) | j30Var.I(yuVar11111110) | j30Var.I(yuVar11111111);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                } else {
                    if (i10 != 0) {
                        pg2Var2 = qnHx;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        if (objB1 == c0132QnHx) {
                            objB1 = new di2();
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB1;
                    } else {
                        ci2Var3 = ci2Var;
                    }
                    if ((i2 & 32) != 0) {
                        j30VarQ.e(1370708026);
                        jt4 jt4Var1117 = sv.a;
                        jI = ((rv) j30VarQ.E(jt4Var1117)).i();
                        jB = yu.b(((rv) j30VarQ.E(jt4Var1117)).f(), 0.6f);
                        jB2 = yu.b(((rv) j30VarQ.E(jt4Var1117)).f(), AY.z(j30VarQ));
                        yu yuVar11111113 = new yu(jI);
                        yu yuVar11111114 = new yu(jB);
                        yu yuVar11111115 = new yu(jB2);
                        j30Var = j30VarQ;
                        j30Var.e(1618982084);
                        zI = j30Var.I(yuVar11111115) | j30Var.I(yuVar11111113) | j30Var.I(yuVar11111114);
                        objB0 = j30Var.b0();
                        if (zI) {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        } else {
                            objB0 = new kh0(jI, jB, jB2);
                            j30Var.F0(objB0);
                        }
                        j30Var.R(false);
                        j30Var.R(false);
                        th3Var2 = (kh0) objB0;
                    } else {
                        j30Var = j30VarQ;
                    }
                    ci2Var4 = ci2Var3;
                    z4 = z3;
                    th3Var3 = th3Var2;
                    pg2Var3 = pg2Var2;
                }
                j30Var.S();
                if (z) {
                    f2 = e / 2;
                    i9 = 0;
                } else {
                    i9 = 0;
                    f2 = 0;
                }
                aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
                is4VarA = th3Var3.a(z4, z, j30Var);
                j30Var.e(1941632354);
                if (h81Var != null) {
                    j30 j30Var15 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    j30Var2 = j30Var15;
                    pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var15, 54, 4), z4, new zs3(3), h81Var);
                } else {
                    j30Var2 = j30Var;
                    qnHx2 = qnHx;
                    z5 = false;
                    pg2VarA = qnHx2;
                }
                j30Var2.R(z5);
                if (h81Var != null) {
                    jt4 jt4Var1118 = f95.a;
                    pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
                } else {
                    pg2VarA2 = qnHx2;
                }
                pg2 pg2VarT13 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
                float f15 = c;
                wo1.QnHx qnHx15 = wo1.a;
                pg2 pg2VarY13 = pg2VarT13.y(new lm4(f15, f15, f15, f15, false));
                j30Var2.e(511388516);
                zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
                objB2 = j30Var2.b0();
                if (zI2) {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                } else {
                    objB2 = new QnHx(is4VarA, aOdmA);
                    j30Var2.F0(objB2);
                }
                j30Var2.R(false);
                gn.a(pg2VarY13, (j81) objB2, j30Var2, 0);
                th3Var4 = th3Var3;
                pg2Var2 = pg2Var3;
                z6 = z4;
                ci2Var5 = ci2Var4;
            }
            tk3VarU = j30Var2.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(z, h81Var, pg2Var2, z6, ci2Var5, th3Var4, i, i2);
        }
        i3 |= 24576;
        ci2Var2 = ci2Var;
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                th3Var2 = th3Var;
                if (j30VarQ.I(th3Var2)) {
                }
                i3 |= i11;
            } else {
                th3Var2 = th3Var;
            }
            i3 |= i11;
        } else {
            th3Var2 = th3Var;
        }
        if ((i3 & 374491) == 74898) {
            j30VarQ.t0();
            i8 = i & 1;
            c0132QnHx = g30.QnHx.a;
            qnHx = pg2.QnHx.w;
            if (i8 != 0) {
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new di2();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB1;
                } else {
                    ci2Var3 = ci2Var;
                }
                if ((i2 & 32) != 0) {
                    j30VarQ.e(1370708026);
                    jt4 jt4Var1119 = sv.a;
                    jI = ((rv) j30VarQ.E(jt4Var1119)).i();
                    jB = yu.b(((rv) j30VarQ.E(jt4Var1119)).f(), 0.6f);
                    jB2 = yu.b(((rv) j30VarQ.E(jt4Var1119)).f(), AY.z(j30VarQ));
                    yu yuVar11111116 = new yu(jI);
                    yu yuVar11111117 = new yu(jB);
                    yu yuVar11111118 = new yu(jB2);
                    j30Var = j30VarQ;
                    j30Var.e(1618982084);
                    zI = j30Var.I(yuVar11111118) | j30Var.I(yuVar11111116) | j30Var.I(yuVar11111117);
                    objB0 = j30Var.b0();
                    if (zI) {
                        objB0 = new kh0(jI, jB, jB2);
                        j30Var.F0(objB0);
                    } else {
                        objB0 = new kh0(jI, jB, jB2);
                        j30Var.F0(objB0);
                    }
                    j30Var.R(false);
                    j30Var.R(false);
                    th3Var2 = (kh0) objB0;
                } else {
                    j30Var = j30VarQ;
                }
                ci2Var4 = ci2Var3;
                z4 = z3;
                th3Var3 = th3Var2;
                pg2Var3 = pg2Var2;
            } else {
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new di2();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB1;
                } else {
                    ci2Var3 = ci2Var;
                }
                if ((i2 & 32) != 0) {
                    j30VarQ.e(1370708026);
                    jt4 jt4Var11110 = sv.a;
                    jI = ((rv) j30VarQ.E(jt4Var11110)).i();
                    jB = yu.b(((rv) j30VarQ.E(jt4Var11110)).f(), 0.6f);
                    jB2 = yu.b(((rv) j30VarQ.E(jt4Var11110)).f(), AY.z(j30VarQ));
                    yu yuVar11111119 = new yu(jI);
                    yu yuVar111111110 = new yu(jB);
                    yu yuVar111111111 = new yu(jB2);
                    j30Var = j30VarQ;
                    j30Var.e(1618982084);
                    zI = j30Var.I(yuVar111111111) | j30Var.I(yuVar11111119) | j30Var.I(yuVar111111110);
                    objB0 = j30Var.b0();
                    if (zI) {
                        objB0 = new kh0(jI, jB, jB2);
                        j30Var.F0(objB0);
                    } else {
                        objB0 = new kh0(jI, jB, jB2);
                        j30Var.F0(objB0);
                    }
                    j30Var.R(false);
                    j30Var.R(false);
                    th3Var2 = (kh0) objB0;
                } else {
                    j30Var = j30VarQ;
                }
                ci2Var4 = ci2Var3;
                z4 = z3;
                th3Var3 = th3Var2;
                pg2Var3 = pg2Var2;
            }
            j30Var.S();
            if (z) {
                f2 = e / 2;
                i9 = 0;
            } else {
                i9 = 0;
                f2 = 0;
            }
            aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
            is4VarA = th3Var3.a(z4, z, j30Var);
            j30Var.e(1941632354);
            if (h81Var != null) {
                j30 j30Var16 = j30Var;
                qnHx2 = qnHx;
                z5 = false;
                j30Var2 = j30Var16;
                pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var16, 54, 4), z4, new zs3(3), h81Var);
            } else {
                j30Var2 = j30Var;
                qnHx2 = qnHx;
                z5 = false;
                pg2VarA = qnHx2;
            }
            j30Var2.R(z5);
            if (h81Var != null) {
                jt4 jt4Var11111 = f95.a;
                pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
            } else {
                pg2VarA2 = qnHx2;
            }
            pg2 pg2VarT14 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
            float f16 = c;
            wo1.QnHx qnHx16 = wo1.a;
            pg2 pg2VarY14 = pg2VarT14.y(new lm4(f16, f16, f16, f16, false));
            j30Var2.e(511388516);
            zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
            objB2 = j30Var2.b0();
            if (zI2) {
                objB2 = new QnHx(is4VarA, aOdmA);
                j30Var2.F0(objB2);
            } else {
                objB2 = new QnHx(is4VarA, aOdmA);
                j30Var2.F0(objB2);
            }
            j30Var2.R(false);
            gn.a(pg2VarY14, (j81) objB2, j30Var2, 0);
            th3Var4 = th3Var3;
            pg2Var2 = pg2Var3;
            z6 = z4;
            ci2Var5 = ci2Var4;
        } else {
            j30VarQ.t0();
            i8 = i & 1;
            c0132QnHx = g30.QnHx.a;
            qnHx = pg2.QnHx.w;
            if (i8 != 0) {
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new di2();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB1;
                } else {
                    ci2Var3 = ci2Var;
                }
                if ((i2 & 32) != 0) {
                    j30VarQ.e(1370708026);
                    jt4 jt4Var11112 = sv.a;
                    jI = ((rv) j30VarQ.E(jt4Var11112)).i();
                    jB = yu.b(((rv) j30VarQ.E(jt4Var11112)).f(), 0.6f);
                    jB2 = yu.b(((rv) j30VarQ.E(jt4Var11112)).f(), AY.z(j30VarQ));
                    yu yuVar111111112 = new yu(jI);
                    yu yuVar111111113 = new yu(jB);
                    yu yuVar111111114 = new yu(jB2);
                    j30Var = j30VarQ;
                    j30Var.e(1618982084);
                    zI = j30Var.I(yuVar111111114) | j30Var.I(yuVar111111112) | j30Var.I(yuVar111111113);
                    objB0 = j30Var.b0();
                    if (zI) {
                        objB0 = new kh0(jI, jB, jB2);
                        j30Var.F0(objB0);
                    } else {
                        objB0 = new kh0(jI, jB, jB2);
                        j30Var.F0(objB0);
                    }
                    j30Var.R(false);
                    j30Var.R(false);
                    th3Var2 = (kh0) objB0;
                } else {
                    j30Var = j30VarQ;
                }
                ci2Var4 = ci2Var3;
                z4 = z3;
                th3Var3 = th3Var2;
                pg2Var3 = pg2Var2;
            } else {
                if (i10 != 0) {
                    pg2Var2 = qnHx;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    if (objB1 == c0132QnHx) {
                        objB1 = new di2();
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB1;
                } else {
                    ci2Var3 = ci2Var;
                }
                if ((i2 & 32) != 0) {
                    j30VarQ.e(1370708026);
                    jt4 jt4Var11113 = sv.a;
                    jI = ((rv) j30VarQ.E(jt4Var11113)).i();
                    jB = yu.b(((rv) j30VarQ.E(jt4Var11113)).f(), 0.6f);
                    jB2 = yu.b(((rv) j30VarQ.E(jt4Var11113)).f(), AY.z(j30VarQ));
                    yu yuVar111111115 = new yu(jI);
                    yu yuVar111111116 = new yu(jB);
                    yu yuVar111111117 = new yu(jB2);
                    j30Var = j30VarQ;
                    j30Var.e(1618982084);
                    zI = j30Var.I(yuVar111111117) | j30Var.I(yuVar111111115) | j30Var.I(yuVar111111116);
                    objB0 = j30Var.b0();
                    if (zI) {
                        objB0 = new kh0(jI, jB, jB2);
                        j30Var.F0(objB0);
                    } else {
                        objB0 = new kh0(jI, jB, jB2);
                        j30Var.F0(objB0);
                    }
                    j30Var.R(false);
                    j30Var.R(false);
                    th3Var2 = (kh0) objB0;
                } else {
                    j30Var = j30VarQ;
                }
                ci2Var4 = ci2Var3;
                z4 = z3;
                th3Var3 = th3Var2;
                pg2Var3 = pg2Var2;
            }
            j30Var.S();
            if (z) {
                f2 = e / 2;
                i9 = 0;
            } else {
                i9 = 0;
                f2 = 0;
            }
            aOdmA = WDjj.a(f2, hH.E(100, i9, null, 6), j30Var, 48, 4);
            is4VarA = th3Var3.a(z4, z, j30Var);
            j30Var.e(1941632354);
            if (h81Var != null) {
                j30 j30Var17 = j30Var;
                qnHx2 = qnHx;
                z5 = false;
                j30Var2 = j30Var17;
                pg2VarA = m74.a(qnHx2, z, ci2Var4, vs3.a(false, a, 0L, j30Var17, 54, 4), z4, new zs3(3), h81Var);
            } else {
                j30Var2 = j30Var;
                qnHx2 = qnHx;
                z5 = false;
                pg2VarA = qnHx2;
            }
            j30Var2.R(z5);
            if (h81Var != null) {
                jt4 jt4Var11114 = f95.a;
                pg2VarA2 = f30.a(qnHx2, wo1.a, g95.w);
            } else {
                pg2VarA2 = qnHx2;
            }
            pg2 pg2VarT15 = ps0.T(gm4.l(pg2Var3.y(pg2VarA2).y(pg2VarA), One.QnHx.e, 2), b);
            float f17 = c;
            wo1.QnHx qnHx17 = wo1.a;
            pg2 pg2VarY15 = pg2VarT15.y(new lm4(f17, f17, f17, f17, false));
            j30Var2.e(511388516);
            zI2 = j30Var2.I(is4VarA) | j30Var2.I(aOdmA);
            objB2 = j30Var2.b0();
            if (zI2) {
                objB2 = new QnHx(is4VarA, aOdmA);
                j30Var2.F0(objB2);
            } else {
                objB2 = new QnHx(is4VarA, aOdmA);
                j30Var2.F0(objB2);
            }
            j30Var2.R(false);
            gn.a(pg2VarY15, (j81) objB2, j30Var2, 0);
            th3Var4 = th3Var3;
            pg2Var2 = pg2Var3;
            z6 = z4;
            ci2Var5 = ci2Var4;
        }
        tk3VarU = j30Var2.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(z, h81Var, pg2Var2, z6, ci2Var5, th3Var4, i, i2);
    }
}
