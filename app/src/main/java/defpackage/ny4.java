package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ny4 {
    public static final float a;
    public static final float c;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float b = 14;
    public static final float d = 24;
    public static final float e = 2;
    public static final nb5<Float> i = new nb5<>(100, (mq0) null, 6);
    public static final float j = 1;
    public static final float k = 6;

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ci2 A;
        public final /* synthetic */ my4 B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ j81<Boolean, sd5> x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(boolean z, j81<? super Boolean, sd5> j81Var, pg2 pg2Var, boolean z2, ci2 ci2Var, my4 my4Var, int i, int i2) {
            super(2);
            this.w = z;
            this.x = j81Var;
            this.y = pg2Var;
            this.z = z2;
            this.A = ci2Var;
            this.B = my4Var;
            this.C = i;
            this.D = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ny4.a(this.w, this.x, this.y, this.z, this.A, this.B, g30Var, this.C | 1, this.D);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<Boolean, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(Boolean bool) {
            bool.booleanValue();
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", l = {185}, m = "invokeSuspend")
    public static final class LPt8Fixed extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ wp1 B;
        public final /* synthetic */ wp4<vp1> C;

        public static final class QnHx implements nz0<vp1> {
            public final /* synthetic */ wp4<vp1> w;

            public QnHx(wp4<vp1> wp4Var) {
                this.w = wp4Var;
            }

            @Override // defpackage.nz0
            public final Object f(vp1 vp1Var, z80 z80Var) {
                vp1 vp1Var2 = vp1Var;
                boolean z = vp1Var2 instanceof qd3;
                wp4<vp1> wp4Var = this.w;
                if (z) {
                    wp4Var.add(vp1Var2);
                } else if (vp1Var2 instanceof rd3) {
                    wp4Var.remove(((rd3) vp1Var2).a);
                } else if (vp1Var2 instanceof pd3) {
                    wp4Var.remove(((pd3) vp1Var2).a);
                } else if (vp1Var2 instanceof nn0) {
                    wp4Var.add(vp1Var2);
                } else if (vp1Var2 instanceof on0) {
                    wp4Var.remove(((on0) vp1Var2).a);
                } else if (vp1Var2 instanceof mn0) {
                    wp4Var.remove(((mn0) vp1Var2).a);
                }
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(wp1 wp1Var, wp4<vp1> wp4Var, z80<? super LPt8Fixed> z80Var) {
            super(2, z80Var);
            this.B = wp1Var;
            this.C = wp4Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new LPt8Fixed(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                nj4 nj4VarA = this.B.a();
                QnHx qnHx = new QnHx(this.C);
                this.A = 1;
                nj4VarA.getClass();
                if (nj4.n(nj4VarA, qnHx, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((LPt8Fixed) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class NUlFixed extends cx1 implements j81<ro0, sd5> {
        public final /* synthetic */ is4<yu> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(is4<yu> is4Var) {
            super(1);
            this.w = is4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(ro0 ro0Var) {
            ro0 ro0Var2 = ro0Var;
            long j = this.w.getValue().a;
            float fB0 = ro0Var2.b0(ny4.a);
            float fB1 = ro0Var2.b0(ny4.b);
            float f = fB1 / 2;
            ro0Var2.E(j, X.a(f, kt2.d(ro0Var2.t0())), X.a(fB0 - f, kt2.d(ro0Var2.t0())), (496 & 8) != 0 ? 0.0f : fB1, (496 & 16) != 0 ? 0 : 1, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, (496 & 256) != 0 ? 3 : 0);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<Boolean, Boolean, m75> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final m75 invoke(Boolean bool, Boolean bool2) {
            bool.booleanValue();
            bool2.booleanValue();
            return new r51();
        }
    }

    public static final class YKK extends cx1 implements j81<ij0, mp1> {
        public final /* synthetic */ is4<Float> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(is4<Float> is4Var) {
            super(1);
            this.w = is4Var;
        }

        @Override // defpackage.j81
        public final mp1 invoke(ij0 ij0Var) {
            return new mp1(C0239D.d(sy4.c(this.w.getValue().floatValue()), 0));
        }
    }

    public static final class auxFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ is4<Float> A;
        public final /* synthetic */ wp1 B;
        public final /* synthetic */ int C;
        public final /* synthetic */ ke w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ my4 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(ke keVar, boolean z, boolean z2, my4 my4Var, is4<Float> is4Var, wp1 wp1Var, int i) {
            super(2);
            this.w = keVar;
            this.x = z;
            this.y = z2;
            this.z = my4Var;
            this.A = is4Var;
            this.B = wp1Var;
            this.C = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ny4.b(this.w, this.x, this.y, this.z, this.A, this.B, g30Var, this.C | 1);
            return sd5.a;
        }
    }

    static {
        float f2 = 34;
        a = f2;
        float f3 = 20;
        c = f3;
        f = f2;
        g = f3;
        h = f2 - f3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:105:0x0202  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:111:0x0259  */
    /* JADX WARN: Code duplicated, block: B:112:0x025d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0262  */
    /* JADX WARN: Code duplicated, block: B:116:0x026e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0271  */
    /* JADX WARN: Code duplicated, block: B:119:0x0295  */
    /* JADX WARN: Code duplicated, block: B:121:0x029b  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:129:0x0346  */
    /* JADX WARN: Code duplicated, block: B:131:0x034d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0351  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:139:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
    public static final void a(boolean z, j81<? super Boolean, sd5> j81Var, pg2 pg2Var, boolean z2, ci2 ci2Var, my4 my4Var, g30 g30Var, int i2, int i3) {
        int i4;
        pg2 pg2Var2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        ci2 ci2Var2;
        int i8;
        my4 my4Var2;
        int i9;
        g30.QnHx.C0132QnHx c0132QnHx;
        pg2 pg2VarA;
        boolean z4;
        ci2 ci2Var3;
        pg2 pg2Var3;
        boolean z5;
        ci2 ci2Var4;
        my4 my4Var3;
        Object objB0;
        int i10;
        Boolean boolValueOf;
        j81<? super Boolean, sd5> j81Var2;
        Object objB1;
        g30.QnHx.C0132QnHx c0132QnHx2;
        iy4 iy4Var;
        Object objB2;
        my4 my4Var4;
        jt4 jt4Var;
        boolean z6;
        pg2 pg2VarA2;
        boolean z7;
        rb2 rb2VarC;
        ij0 ij0Var;
        jy1 jy1Var;
        ti5 ti5Var;
        yy1.QnHx qnHx;
        sz szVarJ;
        ci2 ci2Var5;
        my4 my4Var5;
        pg2 pg2Var4;
        q85 q85Var;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(25866825);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (j30VarQ.c(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 == 0) {
            if ((i2 & 896) == 0) {
                pg2Var2 = pg2Var;
                i4 |= j30VarQ.I(pg2Var2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    z3 = z2;
                    if (j30VarQ.c(z3)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((57344 & i2) == 0) {
                        ci2Var2 = ci2Var;
                        if (j30VarQ.I(ci2Var2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((458752 & i2) == 0) {
                        if ((i3 & 32) == 0) {
                            my4Var2 = my4Var;
                            int i12 = j30VarQ.I(my4Var2) ? 131072 : 65536;
                            i4 |= i12;
                        } else {
                            my4Var2 = my4Var;
                        }
                        i4 |= i12;
                    } else {
                        my4Var2 = my4Var;
                    }
                    if ((374491 & i4) == 74898 || !j30VarQ.t()) {
                        j30VarQ.t0();
                        i9 = i2 & 1;
                        c0132QnHx = g30.QnHx.a;
                        pg2VarA = pg2.QnHx.w;
                        if (i9 != 0 || j30VarQ.Y()) {
                            if (i11 != 0) {
                                pg2Var2 = pg2VarA;
                            }
                            if (i5 != 0) {
                                z4 = true;
                            } else {
                                z4 = z3;
                            }
                            if (i7 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == c0132QnHx) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var3 = (ci2) objB0;
                            } else {
                                ci2Var3 = ci2Var2;
                            }
                            if ((i3 & 32) != 0) {
                                j30VarQ.e(-1032127534);
                                jt4 jt4Var2 = sv.a;
                                long j2 = ((rv) j30VarQ.E(jt4Var2)).j();
                                long jK = ((rv) j30VarQ.E(jt4Var2)).k();
                                long jF = ((rv) j30VarQ.E(jt4Var2)).f();
                                xh0 xh0Var = new xh0(j2, yu.b(j2, 0.54f), jK, yu.b(jF, 0.38f), hH.l(yu.b(j2, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var2)).k()), yu.b(hH.l(yu.b(j2, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var2)).k()), 0.54f), hH.l(yu.b(jK, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var2)).k()), yu.b(hH.l(yu.b(jF, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var2)).k()), 0.38f));
                                j30VarQ.R(false);
                                i4 &= -458753;
                                my4Var2 = xh0Var;
                            }
                            pg2Var3 = pg2Var2;
                            z5 = z4;
                            ci2Var4 = ci2Var3;
                            my4Var3 = my4Var2;
                        } else {
                            j30VarQ.x();
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            pg2Var3 = pg2Var2;
                            z5 = z3;
                            ci2Var4 = ci2Var2;
                            my4Var3 = my4Var2;
                            c0132QnHx = c0132QnHx;
                        }
                        i10 = i4;
                        j30VarQ.S();
                        jt4 jt4Var3 = r40.e;
                        float fB0 = ((ij0) j30VarQ.E(jt4Var3)).b0(h);
                        boolValueOf = Boolean.valueOf(z);
                        if (j81Var == null) {
                            j81Var2 = F1.w;
                        } else {
                            j81Var2 = j81Var;
                        }
                        j30VarQ.e(1156387078);
                        j30VarQ.e(-492369756);
                        objB1 = j30VarQ.b0();
                        c0132QnHx2 = c0132QnHx;
                        if (objB1 == c0132QnHx2) {
                            objB1 = new iy4(boolValueOf, i, dy4.w);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        iy4Var = (iy4) objB1;
                        j30VarQ.e(-492369756);
                        objB2 = j30VarQ.b0();
                        if (objB2 == c0132QnHx2) {
                            objB2 = ps0.R(Boolean.FALSE);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        ri2 ri2Var = (ri2) objB2;
                        my4Var4 = my4Var3;
                        wq0.e(boolValueOf, ri2Var.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                        wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var), j30VarQ);
                        j30VarQ.R(false);
                        jt4Var = r40.k;
                        if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j81Var != null) {
                            zs3 zs3Var = new zs3(2);
                            wo1.QnHx qnHx2 = wo1.a;
                            if (z) {
                                q85Var = q85.On;
                            } else {
                                q85Var = q85.Off;
                            }
                            pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var, q85Var)));
                        } else {
                            pg2VarA2 = pg2VarA;
                        }
                        if (j81Var != null) {
                            jt4 jt4Var4 = f95.a;
                            pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                        }
                        pg2 pg2VarY = pg2Var3.y(pg2VarA).y(pg2VarA2);
                        Map mapQ = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB0), Boolean.TRUE));
                        if (z5 || j81Var == null) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        pg2 pg2VarT = ps0.T(gm4.l(fXUx.e(pg2VarY, iy4Var, mapQ, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                        float f2 = f;
                        float f3 = g;
                        wo1.QnHx qnHx3 = wo1.a;
                        pg2 pg2VarY2 = pg2VarT.y(new lm4(f2, f3, f2, f3, false));
                        j30VarQ.e(733328855);
                        rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                        j30VarQ.e(-1323940314);
                        ij0Var = (ij0) j30VarQ.E(jt4Var3);
                        jy1Var = (jy1) j30VarQ.E(jt4Var);
                        ti5Var = (ti5) j30VarQ.E(r40.o);
                        a30.e.getClass();
                        qnHx = a30.QnHx.b;
                        szVarJ = S12N.j(pg2VarY2);
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
                        le leVar = le.a;
                        j30VarQ.e(1571176015);
                        int i13 = i10 << 3;
                        ci2Var5 = ci2Var4;
                        b(leVar, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i13 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i13 & 458752));
                        O.g(j30VarQ, false, false, false, true);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        my4Var5 = my4Var4;
                        pg2Var4 = pg2Var3;
                        z3 = z5;
                    } else {
                        j30VarQ.x();
                        pg2Var4 = pg2Var2;
                        ci2Var5 = ci2Var2;
                        my4Var5 = my4Var2;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(z, j81Var, pg2Var4, z3, ci2Var5, my4Var5, i2, i3);
                }
                i4 |= 24576;
                ci2Var2 = ci2Var;
                if ((458752 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        my4Var2 = my4Var;
                        if (j30VarQ.I(my4Var2)) {
                        }
                        i4 |= i12;
                    } else {
                        my4Var2 = my4Var;
                    }
                    i4 |= i12;
                } else {
                    my4Var2 = my4Var;
                }
                if ((374491 & i4) == 74898) {
                    j30VarQ.t0();
                    i9 = i2 & 1;
                    c0132QnHx = g30.QnHx.a;
                    pg2VarA = pg2.QnHx.w;
                    if (i9 != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var5 = sv.a;
                            long j3 = ((rv) j30VarQ.E(jt4Var5)).j();
                            long jK2 = ((rv) j30VarQ.E(jt4Var5)).k();
                            long jF2 = ((rv) j30VarQ.E(jt4Var5)).f();
                            xh0 xh0Var2 = new xh0(j3, yu.b(j3, 0.54f), jK2, yu.b(jF2, 0.38f), hH.l(yu.b(j3, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var5)).k()), yu.b(hH.l(yu.b(j3, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var5)).k()), 0.54f), hH.l(yu.b(jK2, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var5)).k()), yu.b(hH.l(yu.b(jF2, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var5)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var2;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var6 = sv.a;
                            long j4 = ((rv) j30VarQ.E(jt4Var6)).j();
                            long jK3 = ((rv) j30VarQ.E(jt4Var6)).k();
                            long jF3 = ((rv) j30VarQ.E(jt4Var6)).f();
                            xh0 xh0Var3 = new xh0(j4, yu.b(j4, 0.54f), jK3, yu.b(jF3, 0.38f), hH.l(yu.b(j4, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var6)).k()), yu.b(hH.l(yu.b(j4, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var6)).k()), 0.54f), hH.l(yu.b(jK3, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var6)).k()), yu.b(hH.l(yu.b(jF3, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var6)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var3;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    }
                    i10 = i4;
                    j30VarQ.S();
                    jt4 jt4Var7 = r40.e;
                    float fB1 = ((ij0) j30VarQ.E(jt4Var7)).b0(h);
                    boolValueOf = Boolean.valueOf(z);
                    if (j81Var == null) {
                        j81Var2 = F1.w;
                    } else {
                        j81Var2 = j81Var;
                    }
                    j30VarQ.e(1156387078);
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    c0132QnHx2 = c0132QnHx;
                    if (objB1 == c0132QnHx2) {
                        objB1 = new iy4(boolValueOf, i, dy4.w);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    iy4Var = (iy4) objB1;
                    j30VarQ.e(-492369756);
                    objB2 = j30VarQ.b0();
                    if (objB2 == c0132QnHx2) {
                        objB2 = ps0.R(Boolean.FALSE);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    ri2 ri2Var2 = (ri2) objB2;
                    my4Var4 = my4Var3;
                    wq0.e(boolValueOf, ri2Var2.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                    wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var2), j30VarQ);
                    j30VarQ.R(false);
                    jt4Var = r40.k;
                    if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j81Var != null) {
                        zs3 zs3Var2 = new zs3(2);
                        wo1.QnHx qnHx4 = wo1.a;
                        if (z) {
                            q85Var = q85.On;
                        } else {
                            q85Var = q85.Off;
                        }
                        pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var2, q85Var)));
                    } else {
                        pg2VarA2 = pg2VarA;
                    }
                    if (j81Var != null) {
                        jt4 jt4Var8 = f95.a;
                        pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                    }
                    pg2 pg2VarY3 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                    Map mapQ2 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB1), Boolean.TRUE));
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    pg2 pg2VarT2 = ps0.T(gm4.l(fXUx.e(pg2VarY3, iy4Var, mapQ2, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                    float f4 = f;
                    float f5 = g;
                    wo1.QnHx qnHx5 = wo1.a;
                    pg2 pg2VarY4 = pg2VarT2.y(new lm4(f4, f5, f4, f5, false));
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(jt4Var7);
                    jy1Var = (jy1) j30VarQ.E(jt4Var);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarY4);
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
                    le leVar2 = le.a;
                    j30VarQ.e(1571176015);
                    int i14 = i10 << 3;
                    ci2Var5 = ci2Var4;
                    b(leVar2, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i14 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i14 & 458752));
                    O.g(j30VarQ, false, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    my4Var5 = my4Var4;
                    pg2Var4 = pg2Var3;
                    z3 = z5;
                } else {
                    j30VarQ.t0();
                    i9 = i2 & 1;
                    c0132QnHx = g30.QnHx.a;
                    pg2VarA = pg2.QnHx.w;
                    if (i9 != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var9 = sv.a;
                            long j5 = ((rv) j30VarQ.E(jt4Var9)).j();
                            long jK4 = ((rv) j30VarQ.E(jt4Var9)).k();
                            long jF4 = ((rv) j30VarQ.E(jt4Var9)).f();
                            xh0 xh0Var4 = new xh0(j5, yu.b(j5, 0.54f), jK4, yu.b(jF4, 0.38f), hH.l(yu.b(j5, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var9)).k()), yu.b(hH.l(yu.b(j5, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var9)).k()), 0.54f), hH.l(yu.b(jK4, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var9)).k()), yu.b(hH.l(yu.b(jF4, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var9)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var4;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var10 = sv.a;
                            long j6 = ((rv) j30VarQ.E(jt4Var10)).j();
                            long jK5 = ((rv) j30VarQ.E(jt4Var10)).k();
                            long jF5 = ((rv) j30VarQ.E(jt4Var10)).f();
                            xh0 xh0Var5 = new xh0(j6, yu.b(j6, 0.54f), jK5, yu.b(jF5, 0.38f), hH.l(yu.b(j6, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var10)).k()), yu.b(hH.l(yu.b(j6, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var10)).k()), 0.54f), hH.l(yu.b(jK5, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var10)).k()), yu.b(hH.l(yu.b(jF5, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var10)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var5;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    }
                    i10 = i4;
                    j30VarQ.S();
                    jt4 jt4Var11 = r40.e;
                    float fB2 = ((ij0) j30VarQ.E(jt4Var11)).b0(h);
                    boolValueOf = Boolean.valueOf(z);
                    if (j81Var == null) {
                        j81Var2 = F1.w;
                    } else {
                        j81Var2 = j81Var;
                    }
                    j30VarQ.e(1156387078);
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    c0132QnHx2 = c0132QnHx;
                    if (objB1 == c0132QnHx2) {
                        objB1 = new iy4(boolValueOf, i, dy4.w);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    iy4Var = (iy4) objB1;
                    j30VarQ.e(-492369756);
                    objB2 = j30VarQ.b0();
                    if (objB2 == c0132QnHx2) {
                        objB2 = ps0.R(Boolean.FALSE);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    ri2 ri2Var3 = (ri2) objB2;
                    my4Var4 = my4Var3;
                    wq0.e(boolValueOf, ri2Var3.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                    wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var3), j30VarQ);
                    j30VarQ.R(false);
                    jt4Var = r40.k;
                    if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j81Var != null) {
                        zs3 zs3Var3 = new zs3(2);
                        wo1.QnHx qnHx6 = wo1.a;
                        if (z) {
                            q85Var = q85.On;
                        } else {
                            q85Var = q85.Off;
                        }
                        pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var3, q85Var)));
                    } else {
                        pg2VarA2 = pg2VarA;
                    }
                    if (j81Var != null) {
                        jt4 jt4Var12 = f95.a;
                        pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                    }
                    pg2 pg2VarY5 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                    Map mapQ3 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB2), Boolean.TRUE));
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    pg2 pg2VarT3 = ps0.T(gm4.l(fXUx.e(pg2VarY5, iy4Var, mapQ3, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                    float f6 = f;
                    float f7 = g;
                    wo1.QnHx qnHx7 = wo1.a;
                    pg2 pg2VarY6 = pg2VarT3.y(new lm4(f6, f7, f6, f7, false));
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(jt4Var11);
                    jy1Var = (jy1) j30VarQ.E(jt4Var);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarY6);
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
                    le leVar3 = le.a;
                    j30VarQ.e(1571176015);
                    int i15 = i10 << 3;
                    ci2Var5 = ci2Var4;
                    b(leVar3, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i15 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i15 & 458752));
                    O.g(j30VarQ, false, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    my4Var5 = my4Var4;
                    pg2Var4 = pg2Var3;
                    z3 = z5;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(z, j81Var, pg2Var4, z3, ci2Var5, my4Var5, i2, i3);
            }
            i4 |= 3072;
            z3 = z2;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((57344 & i2) == 0) {
                    ci2Var2 = ci2Var;
                    if (j30VarQ.I(ci2Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((458752 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        my4Var2 = my4Var;
                        if (j30VarQ.I(my4Var2)) {
                        }
                        i4 |= i12;
                    } else {
                        my4Var2 = my4Var;
                    }
                    i4 |= i12;
                } else {
                    my4Var2 = my4Var;
                }
                if ((374491 & i4) == 74898) {
                    j30VarQ.t0();
                    i9 = i2 & 1;
                    c0132QnHx = g30.QnHx.a;
                    pg2VarA = pg2.QnHx.w;
                    if (i9 != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var13 = sv.a;
                            long j7 = ((rv) j30VarQ.E(jt4Var13)).j();
                            long jK6 = ((rv) j30VarQ.E(jt4Var13)).k();
                            long jF6 = ((rv) j30VarQ.E(jt4Var13)).f();
                            xh0 xh0Var6 = new xh0(j7, yu.b(j7, 0.54f), jK6, yu.b(jF6, 0.38f), hH.l(yu.b(j7, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var13)).k()), yu.b(hH.l(yu.b(j7, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var13)).k()), 0.54f), hH.l(yu.b(jK6, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var13)).k()), yu.b(hH.l(yu.b(jF6, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var13)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var6;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var14 = sv.a;
                            long j8 = ((rv) j30VarQ.E(jt4Var14)).j();
                            long jK7 = ((rv) j30VarQ.E(jt4Var14)).k();
                            long jF7 = ((rv) j30VarQ.E(jt4Var14)).f();
                            xh0 xh0Var7 = new xh0(j8, yu.b(j8, 0.54f), jK7, yu.b(jF7, 0.38f), hH.l(yu.b(j8, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var14)).k()), yu.b(hH.l(yu.b(j8, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var14)).k()), 0.54f), hH.l(yu.b(jK7, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var14)).k()), yu.b(hH.l(yu.b(jF7, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var14)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var7;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    }
                    i10 = i4;
                    j30VarQ.S();
                    jt4 jt4Var15 = r40.e;
                    float fB3 = ((ij0) j30VarQ.E(jt4Var15)).b0(h);
                    boolValueOf = Boolean.valueOf(z);
                    if (j81Var == null) {
                        j81Var2 = F1.w;
                    } else {
                        j81Var2 = j81Var;
                    }
                    j30VarQ.e(1156387078);
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    c0132QnHx2 = c0132QnHx;
                    if (objB1 == c0132QnHx2) {
                        objB1 = new iy4(boolValueOf, i, dy4.w);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    iy4Var = (iy4) objB1;
                    j30VarQ.e(-492369756);
                    objB2 = j30VarQ.b0();
                    if (objB2 == c0132QnHx2) {
                        objB2 = ps0.R(Boolean.FALSE);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    ri2 ri2Var4 = (ri2) objB2;
                    my4Var4 = my4Var3;
                    wq0.e(boolValueOf, ri2Var4.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                    wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var4), j30VarQ);
                    j30VarQ.R(false);
                    jt4Var = r40.k;
                    if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j81Var != null) {
                        zs3 zs3Var4 = new zs3(2);
                        wo1.QnHx qnHx8 = wo1.a;
                        if (z) {
                            q85Var = q85.On;
                        } else {
                            q85Var = q85.Off;
                        }
                        pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var4, q85Var)));
                    } else {
                        pg2VarA2 = pg2VarA;
                    }
                    if (j81Var != null) {
                        jt4 jt4Var16 = f95.a;
                        pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                    }
                    pg2 pg2VarY7 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                    Map mapQ4 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB3), Boolean.TRUE));
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    pg2 pg2VarT4 = ps0.T(gm4.l(fXUx.e(pg2VarY7, iy4Var, mapQ4, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                    float f8 = f;
                    float f9 = g;
                    wo1.QnHx qnHx9 = wo1.a;
                    pg2 pg2VarY8 = pg2VarT4.y(new lm4(f8, f9, f8, f9, false));
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(jt4Var15);
                    jy1Var = (jy1) j30VarQ.E(jt4Var);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarY8);
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
                    le leVar4 = le.a;
                    j30VarQ.e(1571176015);
                    int i16 = i10 << 3;
                    ci2Var5 = ci2Var4;
                    b(leVar4, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i16 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i16 & 458752));
                    O.g(j30VarQ, false, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    my4Var5 = my4Var4;
                    pg2Var4 = pg2Var3;
                    z3 = z5;
                } else {
                    j30VarQ.t0();
                    i9 = i2 & 1;
                    c0132QnHx = g30.QnHx.a;
                    pg2VarA = pg2.QnHx.w;
                    if (i9 != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var17 = sv.a;
                            long j9 = ((rv) j30VarQ.E(jt4Var17)).j();
                            long jK8 = ((rv) j30VarQ.E(jt4Var17)).k();
                            long jF8 = ((rv) j30VarQ.E(jt4Var17)).f();
                            xh0 xh0Var8 = new xh0(j9, yu.b(j9, 0.54f), jK8, yu.b(jF8, 0.38f), hH.l(yu.b(j9, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var17)).k()), yu.b(hH.l(yu.b(j9, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var17)).k()), 0.54f), hH.l(yu.b(jK8, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var17)).k()), yu.b(hH.l(yu.b(jF8, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var17)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var8;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var18 = sv.a;
                            long j10 = ((rv) j30VarQ.E(jt4Var18)).j();
                            long jK9 = ((rv) j30VarQ.E(jt4Var18)).k();
                            long jF9 = ((rv) j30VarQ.E(jt4Var18)).f();
                            xh0 xh0Var9 = new xh0(j10, yu.b(j10, 0.54f), jK9, yu.b(jF9, 0.38f), hH.l(yu.b(j10, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var18)).k()), yu.b(hH.l(yu.b(j10, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var18)).k()), 0.54f), hH.l(yu.b(jK9, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var18)).k()), yu.b(hH.l(yu.b(jF9, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var18)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var9;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    }
                    i10 = i4;
                    j30VarQ.S();
                    jt4 jt4Var19 = r40.e;
                    float fB4 = ((ij0) j30VarQ.E(jt4Var19)).b0(h);
                    boolValueOf = Boolean.valueOf(z);
                    if (j81Var == null) {
                        j81Var2 = F1.w;
                    } else {
                        j81Var2 = j81Var;
                    }
                    j30VarQ.e(1156387078);
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    c0132QnHx2 = c0132QnHx;
                    if (objB1 == c0132QnHx2) {
                        objB1 = new iy4(boolValueOf, i, dy4.w);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    iy4Var = (iy4) objB1;
                    j30VarQ.e(-492369756);
                    objB2 = j30VarQ.b0();
                    if (objB2 == c0132QnHx2) {
                        objB2 = ps0.R(Boolean.FALSE);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    ri2 ri2Var5 = (ri2) objB2;
                    my4Var4 = my4Var3;
                    wq0.e(boolValueOf, ri2Var5.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                    wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var5), j30VarQ);
                    j30VarQ.R(false);
                    jt4Var = r40.k;
                    if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j81Var != null) {
                        zs3 zs3Var5 = new zs3(2);
                        wo1.QnHx qnHx10 = wo1.a;
                        if (z) {
                            q85Var = q85.On;
                        } else {
                            q85Var = q85.Off;
                        }
                        pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var5, q85Var)));
                    } else {
                        pg2VarA2 = pg2VarA;
                    }
                    if (j81Var != null) {
                        jt4 jt4Var110 = f95.a;
                        pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                    }
                    pg2 pg2VarY9 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                    Map mapQ5 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB4), Boolean.TRUE));
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    pg2 pg2VarT5 = ps0.T(gm4.l(fXUx.e(pg2VarY9, iy4Var, mapQ5, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                    float f10 = f;
                    float f11 = g;
                    wo1.QnHx qnHx11 = wo1.a;
                    pg2 pg2VarY10 = pg2VarT5.y(new lm4(f10, f11, f10, f11, false));
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(jt4Var19);
                    jy1Var = (jy1) j30VarQ.E(jt4Var);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarY10);
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
                    le leVar5 = le.a;
                    j30VarQ.e(1571176015);
                    int i17 = i10 << 3;
                    ci2Var5 = ci2Var4;
                    b(leVar5, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i17 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i17 & 458752));
                    O.g(j30VarQ, false, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    my4Var5 = my4Var4;
                    pg2Var4 = pg2Var3;
                    z3 = z5;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(z, j81Var, pg2Var4, z3, ci2Var5, my4Var5, i2, i3);
            }
            i4 |= 24576;
            ci2Var2 = ci2Var;
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    my4Var2 = my4Var;
                    if (j30VarQ.I(my4Var2)) {
                    }
                    i4 |= i12;
                } else {
                    my4Var2 = my4Var;
                }
                i4 |= i12;
            } else {
                my4Var2 = my4Var;
            }
            if ((374491 & i4) == 74898) {
                j30VarQ.t0();
                i9 = i2 & 1;
                c0132QnHx = g30.QnHx.a;
                pg2VarA = pg2.QnHx.w;
                if (i9 != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var111 = sv.a;
                        long j11 = ((rv) j30VarQ.E(jt4Var111)).j();
                        long jK10 = ((rv) j30VarQ.E(jt4Var111)).k();
                        long jF10 = ((rv) j30VarQ.E(jt4Var111)).f();
                        xh0 xh0Var10 = new xh0(j11, yu.b(j11, 0.54f), jK10, yu.b(jF10, 0.38f), hH.l(yu.b(j11, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111)).k()), yu.b(hH.l(yu.b(j11, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111)).k()), 0.54f), hH.l(yu.b(jK10, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111)).k()), yu.b(hH.l(yu.b(jF10, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var10;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var112 = sv.a;
                        long j12 = ((rv) j30VarQ.E(jt4Var112)).j();
                        long jK11 = ((rv) j30VarQ.E(jt4Var112)).k();
                        long jF11 = ((rv) j30VarQ.E(jt4Var112)).f();
                        xh0 xh0Var11 = new xh0(j12, yu.b(j12, 0.54f), jK11, yu.b(jF11, 0.38f), hH.l(yu.b(j12, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var112)).k()), yu.b(hH.l(yu.b(j12, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var112)).k()), 0.54f), hH.l(yu.b(jK11, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var112)).k()), yu.b(hH.l(yu.b(jF11, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var112)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var11;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                }
                i10 = i4;
                j30VarQ.S();
                jt4 jt4Var113 = r40.e;
                float fB5 = ((ij0) j30VarQ.E(jt4Var113)).b0(h);
                boolValueOf = Boolean.valueOf(z);
                if (j81Var == null) {
                    j81Var2 = F1.w;
                } else {
                    j81Var2 = j81Var;
                }
                j30VarQ.e(1156387078);
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                c0132QnHx2 = c0132QnHx;
                if (objB1 == c0132QnHx2) {
                    objB1 = new iy4(boolValueOf, i, dy4.w);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                iy4Var = (iy4) objB1;
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx2) {
                    objB2 = ps0.R(Boolean.FALSE);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                ri2 ri2Var6 = (ri2) objB2;
                my4Var4 = my4Var3;
                wq0.e(boolValueOf, ri2Var6.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var6), j30VarQ);
                j30VarQ.R(false);
                jt4Var = r40.k;
                if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (j81Var != null) {
                    zs3 zs3Var6 = new zs3(2);
                    wo1.QnHx qnHx12 = wo1.a;
                    if (z) {
                        q85Var = q85.On;
                    } else {
                        q85Var = q85.Off;
                    }
                    pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var6, q85Var)));
                } else {
                    pg2VarA2 = pg2VarA;
                }
                if (j81Var != null) {
                    jt4 jt4Var114 = f95.a;
                    pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                }
                pg2 pg2VarY11 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                Map mapQ6 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB5), Boolean.TRUE));
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                pg2 pg2VarT6 = ps0.T(gm4.l(fXUx.e(pg2VarY11, iy4Var, mapQ6, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                float f12 = f;
                float f13 = g;
                wo1.QnHx qnHx13 = wo1.a;
                pg2 pg2VarY12 = pg2VarT6.y(new lm4(f12, f13, f12, f13, false));
                j30VarQ.e(733328855);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(jt4Var113);
                jy1Var = (jy1) j30VarQ.E(jt4Var);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarY12);
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
                le leVar6 = le.a;
                j30VarQ.e(1571176015);
                int i18 = i10 << 3;
                ci2Var5 = ci2Var4;
                b(leVar6, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i18 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i18 & 458752));
                O.g(j30VarQ, false, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                my4Var5 = my4Var4;
                pg2Var4 = pg2Var3;
                z3 = z5;
            } else {
                j30VarQ.t0();
                i9 = i2 & 1;
                c0132QnHx = g30.QnHx.a;
                pg2VarA = pg2.QnHx.w;
                if (i9 != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var115 = sv.a;
                        long j13 = ((rv) j30VarQ.E(jt4Var115)).j();
                        long jK12 = ((rv) j30VarQ.E(jt4Var115)).k();
                        long jF12 = ((rv) j30VarQ.E(jt4Var115)).f();
                        xh0 xh0Var12 = new xh0(j13, yu.b(j13, 0.54f), jK12, yu.b(jF12, 0.38f), hH.l(yu.b(j13, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var115)).k()), yu.b(hH.l(yu.b(j13, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var115)).k()), 0.54f), hH.l(yu.b(jK12, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var115)).k()), yu.b(hH.l(yu.b(jF12, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var115)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var12;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var116 = sv.a;
                        long j14 = ((rv) j30VarQ.E(jt4Var116)).j();
                        long jK13 = ((rv) j30VarQ.E(jt4Var116)).k();
                        long jF13 = ((rv) j30VarQ.E(jt4Var116)).f();
                        xh0 xh0Var13 = new xh0(j14, yu.b(j14, 0.54f), jK13, yu.b(jF13, 0.38f), hH.l(yu.b(j14, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var116)).k()), yu.b(hH.l(yu.b(j14, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var116)).k()), 0.54f), hH.l(yu.b(jK13, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var116)).k()), yu.b(hH.l(yu.b(jF13, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var116)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var13;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                }
                i10 = i4;
                j30VarQ.S();
                jt4 jt4Var117 = r40.e;
                float fB6 = ((ij0) j30VarQ.E(jt4Var117)).b0(h);
                boolValueOf = Boolean.valueOf(z);
                if (j81Var == null) {
                    j81Var2 = F1.w;
                } else {
                    j81Var2 = j81Var;
                }
                j30VarQ.e(1156387078);
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                c0132QnHx2 = c0132QnHx;
                if (objB1 == c0132QnHx2) {
                    objB1 = new iy4(boolValueOf, i, dy4.w);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                iy4Var = (iy4) objB1;
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx2) {
                    objB2 = ps0.R(Boolean.FALSE);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                ri2 ri2Var7 = (ri2) objB2;
                my4Var4 = my4Var3;
                wq0.e(boolValueOf, ri2Var7.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var7), j30VarQ);
                j30VarQ.R(false);
                jt4Var = r40.k;
                if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (j81Var != null) {
                    zs3 zs3Var7 = new zs3(2);
                    wo1.QnHx qnHx14 = wo1.a;
                    if (z) {
                        q85Var = q85.On;
                    } else {
                        q85Var = q85.Off;
                    }
                    pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var7, q85Var)));
                } else {
                    pg2VarA2 = pg2VarA;
                }
                if (j81Var != null) {
                    jt4 jt4Var118 = f95.a;
                    pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                }
                pg2 pg2VarY13 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                Map mapQ7 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB6), Boolean.TRUE));
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                pg2 pg2VarT7 = ps0.T(gm4.l(fXUx.e(pg2VarY13, iy4Var, mapQ7, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                float f14 = f;
                float f15 = g;
                wo1.QnHx qnHx15 = wo1.a;
                pg2 pg2VarY14 = pg2VarT7.y(new lm4(f14, f15, f14, f15, false));
                j30VarQ.e(733328855);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(jt4Var117);
                jy1Var = (jy1) j30VarQ.E(jt4Var);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarY14);
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
                le leVar7 = le.a;
                j30VarQ.e(1571176015);
                int i19 = i10 << 3;
                ci2Var5 = ci2Var4;
                b(leVar7, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i19 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i19 & 458752));
                O.g(j30VarQ, false, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                my4Var5 = my4Var4;
                pg2Var4 = pg2Var3;
                z3 = z5;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(z, j81Var, pg2Var4, z3, ci2Var5, my4Var5, i2, i3);
        }
        i4 |= 384;
        pg2Var2 = pg2Var;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                z3 = z2;
                if (j30VarQ.c(z3)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((57344 & i2) == 0) {
                    ci2Var2 = ci2Var;
                    if (j30VarQ.I(ci2Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((458752 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        my4Var2 = my4Var;
                        if (j30VarQ.I(my4Var2)) {
                        }
                        i4 |= i12;
                    } else {
                        my4Var2 = my4Var;
                    }
                    i4 |= i12;
                } else {
                    my4Var2 = my4Var;
                }
                if ((374491 & i4) == 74898) {
                    j30VarQ.t0();
                    i9 = i2 & 1;
                    c0132QnHx = g30.QnHx.a;
                    pg2VarA = pg2.QnHx.w;
                    if (i9 != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var119 = sv.a;
                            long j15 = ((rv) j30VarQ.E(jt4Var119)).j();
                            long jK14 = ((rv) j30VarQ.E(jt4Var119)).k();
                            long jF14 = ((rv) j30VarQ.E(jt4Var119)).f();
                            xh0 xh0Var14 = new xh0(j15, yu.b(j15, 0.54f), jK14, yu.b(jF14, 0.38f), hH.l(yu.b(j15, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var119)).k()), yu.b(hH.l(yu.b(j15, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var119)).k()), 0.54f), hH.l(yu.b(jK14, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var119)).k()), yu.b(hH.l(yu.b(jF14, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var119)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var14;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var1110 = sv.a;
                            long j16 = ((rv) j30VarQ.E(jt4Var1110)).j();
                            long jK15 = ((rv) j30VarQ.E(jt4Var1110)).k();
                            long jF15 = ((rv) j30VarQ.E(jt4Var1110)).f();
                            xh0 xh0Var15 = new xh0(j16, yu.b(j16, 0.54f), jK15, yu.b(jF15, 0.38f), hH.l(yu.b(j16, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1110)).k()), yu.b(hH.l(yu.b(j16, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1110)).k()), 0.54f), hH.l(yu.b(jK15, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1110)).k()), yu.b(hH.l(yu.b(jF15, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1110)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var15;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    }
                    i10 = i4;
                    j30VarQ.S();
                    jt4 jt4Var1111 = r40.e;
                    float fB7 = ((ij0) j30VarQ.E(jt4Var1111)).b0(h);
                    boolValueOf = Boolean.valueOf(z);
                    if (j81Var == null) {
                        j81Var2 = F1.w;
                    } else {
                        j81Var2 = j81Var;
                    }
                    j30VarQ.e(1156387078);
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    c0132QnHx2 = c0132QnHx;
                    if (objB1 == c0132QnHx2) {
                        objB1 = new iy4(boolValueOf, i, dy4.w);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    iy4Var = (iy4) objB1;
                    j30VarQ.e(-492369756);
                    objB2 = j30VarQ.b0();
                    if (objB2 == c0132QnHx2) {
                        objB2 = ps0.R(Boolean.FALSE);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    ri2 ri2Var8 = (ri2) objB2;
                    my4Var4 = my4Var3;
                    wq0.e(boolValueOf, ri2Var8.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                    wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var8), j30VarQ);
                    j30VarQ.R(false);
                    jt4Var = r40.k;
                    if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j81Var != null) {
                        zs3 zs3Var8 = new zs3(2);
                        wo1.QnHx qnHx16 = wo1.a;
                        if (z) {
                            q85Var = q85.On;
                        } else {
                            q85Var = q85.Off;
                        }
                        pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var8, q85Var)));
                    } else {
                        pg2VarA2 = pg2VarA;
                    }
                    if (j81Var != null) {
                        jt4 jt4Var1112 = f95.a;
                        pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                    }
                    pg2 pg2VarY15 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                    Map mapQ8 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB7), Boolean.TRUE));
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    pg2 pg2VarT8 = ps0.T(gm4.l(fXUx.e(pg2VarY15, iy4Var, mapQ8, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                    float f16 = f;
                    float f17 = g;
                    wo1.QnHx qnHx17 = wo1.a;
                    pg2 pg2VarY16 = pg2VarT8.y(new lm4(f16, f17, f16, f17, false));
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(jt4Var1111);
                    jy1Var = (jy1) j30VarQ.E(jt4Var);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarY16);
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
                    le leVar8 = le.a;
                    j30VarQ.e(1571176015);
                    int i110 = i10 << 3;
                    ci2Var5 = ci2Var4;
                    b(leVar8, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i110 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i110 & 458752));
                    O.g(j30VarQ, false, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    my4Var5 = my4Var4;
                    pg2Var4 = pg2Var3;
                    z3 = z5;
                } else {
                    j30VarQ.t0();
                    i9 = i2 & 1;
                    c0132QnHx = g30.QnHx.a;
                    pg2VarA = pg2.QnHx.w;
                    if (i9 != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var1113 = sv.a;
                            long j17 = ((rv) j30VarQ.E(jt4Var1113)).j();
                            long jK16 = ((rv) j30VarQ.E(jt4Var1113)).k();
                            long jF16 = ((rv) j30VarQ.E(jt4Var1113)).f();
                            xh0 xh0Var16 = new xh0(j17, yu.b(j17, 0.54f), jK16, yu.b(jF16, 0.38f), hH.l(yu.b(j17, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1113)).k()), yu.b(hH.l(yu.b(j17, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1113)).k()), 0.54f), hH.l(yu.b(jK16, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1113)).k()), yu.b(hH.l(yu.b(jF16, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1113)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var16;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2VarA;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i7 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == c0132QnHx) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var3 = (ci2) objB0;
                        } else {
                            ci2Var3 = ci2Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j30VarQ.e(-1032127534);
                            jt4 jt4Var1114 = sv.a;
                            long j18 = ((rv) j30VarQ.E(jt4Var1114)).j();
                            long jK17 = ((rv) j30VarQ.E(jt4Var1114)).k();
                            long jF17 = ((rv) j30VarQ.E(jt4Var1114)).f();
                            xh0 xh0Var17 = new xh0(j18, yu.b(j18, 0.54f), jK17, yu.b(jF17, 0.38f), hH.l(yu.b(j18, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1114)).k()), yu.b(hH.l(yu.b(j18, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1114)).k()), 0.54f), hH.l(yu.b(jK17, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1114)).k()), yu.b(hH.l(yu.b(jF17, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1114)).k()), 0.38f));
                            j30VarQ.R(false);
                            i4 &= -458753;
                            my4Var2 = xh0Var17;
                        }
                        pg2Var3 = pg2Var2;
                        z5 = z4;
                        ci2Var4 = ci2Var3;
                        my4Var3 = my4Var2;
                    }
                    i10 = i4;
                    j30VarQ.S();
                    jt4 jt4Var1115 = r40.e;
                    float fB8 = ((ij0) j30VarQ.E(jt4Var1115)).b0(h);
                    boolValueOf = Boolean.valueOf(z);
                    if (j81Var == null) {
                        j81Var2 = F1.w;
                    } else {
                        j81Var2 = j81Var;
                    }
                    j30VarQ.e(1156387078);
                    j30VarQ.e(-492369756);
                    objB1 = j30VarQ.b0();
                    c0132QnHx2 = c0132QnHx;
                    if (objB1 == c0132QnHx2) {
                        objB1 = new iy4(boolValueOf, i, dy4.w);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    iy4Var = (iy4) objB1;
                    j30VarQ.e(-492369756);
                    objB2 = j30VarQ.b0();
                    if (objB2 == c0132QnHx2) {
                        objB2 = ps0.R(Boolean.FALSE);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    ri2 ri2Var9 = (ri2) objB2;
                    my4Var4 = my4Var3;
                    wq0.e(boolValueOf, ri2Var9.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                    wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var9), j30VarQ);
                    j30VarQ.R(false);
                    jt4Var = r40.k;
                    if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j81Var != null) {
                        zs3 zs3Var9 = new zs3(2);
                        wo1.QnHx qnHx18 = wo1.a;
                        if (z) {
                            q85Var = q85.On;
                        } else {
                            q85Var = q85.Off;
                        }
                        pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var9, q85Var)));
                    } else {
                        pg2VarA2 = pg2VarA;
                    }
                    if (j81Var != null) {
                        jt4 jt4Var1116 = f95.a;
                        pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                    }
                    pg2 pg2VarY17 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                    Map mapQ9 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB8), Boolean.TRUE));
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    pg2 pg2VarT9 = ps0.T(gm4.l(fXUx.e(pg2VarY17, iy4Var, mapQ9, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                    float f18 = f;
                    float f19 = g;
                    wo1.QnHx qnHx19 = wo1.a;
                    pg2 pg2VarY18 = pg2VarT9.y(new lm4(f18, f19, f18, f19, false));
                    j30VarQ.e(733328855);
                    rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(jt4Var1115);
                    jy1Var = (jy1) j30VarQ.E(jt4Var);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarY18);
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
                    le leVar9 = le.a;
                    j30VarQ.e(1571176015);
                    int i111 = i10 << 3;
                    ci2Var5 = ci2Var4;
                    b(leVar9, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i111 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i111 & 458752));
                    O.g(j30VarQ, false, false, false, true);
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    my4Var5 = my4Var4;
                    pg2Var4 = pg2Var3;
                    z3 = z5;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(z, j81Var, pg2Var4, z3, ci2Var5, my4Var5, i2, i3);
            }
            i4 |= 24576;
            ci2Var2 = ci2Var;
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    my4Var2 = my4Var;
                    if (j30VarQ.I(my4Var2)) {
                    }
                    i4 |= i12;
                } else {
                    my4Var2 = my4Var;
                }
                i4 |= i12;
            } else {
                my4Var2 = my4Var;
            }
            if ((374491 & i4) == 74898) {
                j30VarQ.t0();
                i9 = i2 & 1;
                c0132QnHx = g30.QnHx.a;
                pg2VarA = pg2.QnHx.w;
                if (i9 != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var1117 = sv.a;
                        long j19 = ((rv) j30VarQ.E(jt4Var1117)).j();
                        long jK18 = ((rv) j30VarQ.E(jt4Var1117)).k();
                        long jF18 = ((rv) j30VarQ.E(jt4Var1117)).f();
                        xh0 xh0Var18 = new xh0(j19, yu.b(j19, 0.54f), jK18, yu.b(jF18, 0.38f), hH.l(yu.b(j19, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1117)).k()), yu.b(hH.l(yu.b(j19, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1117)).k()), 0.54f), hH.l(yu.b(jK18, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1117)).k()), yu.b(hH.l(yu.b(jF18, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1117)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var18;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var1118 = sv.a;
                        long j110 = ((rv) j30VarQ.E(jt4Var1118)).j();
                        long jK19 = ((rv) j30VarQ.E(jt4Var1118)).k();
                        long jF19 = ((rv) j30VarQ.E(jt4Var1118)).f();
                        xh0 xh0Var19 = new xh0(j110, yu.b(j110, 0.54f), jK19, yu.b(jF19, 0.38f), hH.l(yu.b(j110, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1118)).k()), yu.b(hH.l(yu.b(j110, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1118)).k()), 0.54f), hH.l(yu.b(jK19, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1118)).k()), yu.b(hH.l(yu.b(jF19, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var1118)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var19;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                }
                i10 = i4;
                j30VarQ.S();
                jt4 jt4Var1119 = r40.e;
                float fB9 = ((ij0) j30VarQ.E(jt4Var1119)).b0(h);
                boolValueOf = Boolean.valueOf(z);
                if (j81Var == null) {
                    j81Var2 = F1.w;
                } else {
                    j81Var2 = j81Var;
                }
                j30VarQ.e(1156387078);
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                c0132QnHx2 = c0132QnHx;
                if (objB1 == c0132QnHx2) {
                    objB1 = new iy4(boolValueOf, i, dy4.w);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                iy4Var = (iy4) objB1;
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx2) {
                    objB2 = ps0.R(Boolean.FALSE);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                ri2 ri2Var10 = (ri2) objB2;
                my4Var4 = my4Var3;
                wq0.e(boolValueOf, ri2Var10.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var10), j30VarQ);
                j30VarQ.R(false);
                jt4Var = r40.k;
                if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (j81Var != null) {
                    zs3 zs3Var10 = new zs3(2);
                    wo1.QnHx qnHx110 = wo1.a;
                    if (z) {
                        q85Var = q85.On;
                    } else {
                        q85Var = q85.Off;
                    }
                    pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var10, q85Var)));
                } else {
                    pg2VarA2 = pg2VarA;
                }
                if (j81Var != null) {
                    jt4 jt4Var11110 = f95.a;
                    pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                }
                pg2 pg2VarY19 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                Map mapQ10 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB9), Boolean.TRUE));
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                pg2 pg2VarT10 = ps0.T(gm4.l(fXUx.e(pg2VarY19, iy4Var, mapQ10, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                float f110 = f;
                float f111 = g;
                wo1.QnHx qnHx111 = wo1.a;
                pg2 pg2VarY110 = pg2VarT10.y(new lm4(f110, f111, f110, f111, false));
                j30VarQ.e(733328855);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(jt4Var1119);
                jy1Var = (jy1) j30VarQ.E(jt4Var);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarY110);
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
                le leVar10 = le.a;
                j30VarQ.e(1571176015);
                int i112 = i10 << 3;
                ci2Var5 = ci2Var4;
                b(leVar10, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i112 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i112 & 458752));
                O.g(j30VarQ, false, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                my4Var5 = my4Var4;
                pg2Var4 = pg2Var3;
                z3 = z5;
            } else {
                j30VarQ.t0();
                i9 = i2 & 1;
                c0132QnHx = g30.QnHx.a;
                pg2VarA = pg2.QnHx.w;
                if (i9 != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var11111 = sv.a;
                        long j111 = ((rv) j30VarQ.E(jt4Var11111)).j();
                        long jK110 = ((rv) j30VarQ.E(jt4Var11111)).k();
                        long jF110 = ((rv) j30VarQ.E(jt4Var11111)).f();
                        xh0 xh0Var110 = new xh0(j111, yu.b(j111, 0.54f), jK110, yu.b(jF110, 0.38f), hH.l(yu.b(j111, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11111)).k()), yu.b(hH.l(yu.b(j111, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11111)).k()), 0.54f), hH.l(yu.b(jK110, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11111)).k()), yu.b(hH.l(yu.b(jF110, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11111)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var110;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var11112 = sv.a;
                        long j112 = ((rv) j30VarQ.E(jt4Var11112)).j();
                        long jK111 = ((rv) j30VarQ.E(jt4Var11112)).k();
                        long jF111 = ((rv) j30VarQ.E(jt4Var11112)).f();
                        xh0 xh0Var111 = new xh0(j112, yu.b(j112, 0.54f), jK111, yu.b(jF111, 0.38f), hH.l(yu.b(j112, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11112)).k()), yu.b(hH.l(yu.b(j112, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11112)).k()), 0.54f), hH.l(yu.b(jK111, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11112)).k()), yu.b(hH.l(yu.b(jF111, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11112)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var111;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                }
                i10 = i4;
                j30VarQ.S();
                jt4 jt4Var11113 = r40.e;
                float fB10 = ((ij0) j30VarQ.E(jt4Var11113)).b0(h);
                boolValueOf = Boolean.valueOf(z);
                if (j81Var == null) {
                    j81Var2 = F1.w;
                } else {
                    j81Var2 = j81Var;
                }
                j30VarQ.e(1156387078);
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                c0132QnHx2 = c0132QnHx;
                if (objB1 == c0132QnHx2) {
                    objB1 = new iy4(boolValueOf, i, dy4.w);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                iy4Var = (iy4) objB1;
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx2) {
                    objB2 = ps0.R(Boolean.FALSE);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                ri2 ri2Var11 = (ri2) objB2;
                my4Var4 = my4Var3;
                wq0.e(boolValueOf, ri2Var11.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var11), j30VarQ);
                j30VarQ.R(false);
                jt4Var = r40.k;
                if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (j81Var != null) {
                    zs3 zs3Var11 = new zs3(2);
                    wo1.QnHx qnHx112 = wo1.a;
                    if (z) {
                        q85Var = q85.On;
                    } else {
                        q85Var = q85.Off;
                    }
                    pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var11, q85Var)));
                } else {
                    pg2VarA2 = pg2VarA;
                }
                if (j81Var != null) {
                    jt4 jt4Var11114 = f95.a;
                    pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                }
                pg2 pg2VarY111 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                Map mapQ11 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB10), Boolean.TRUE));
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                pg2 pg2VarT11 = ps0.T(gm4.l(fXUx.e(pg2VarY111, iy4Var, mapQ11, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                float f112 = f;
                float f113 = g;
                wo1.QnHx qnHx113 = wo1.a;
                pg2 pg2VarY112 = pg2VarT11.y(new lm4(f112, f113, f112, f113, false));
                j30VarQ.e(733328855);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(jt4Var11113);
                jy1Var = (jy1) j30VarQ.E(jt4Var);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarY112);
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
                le leVar11 = le.a;
                j30VarQ.e(1571176015);
                int i113 = i10 << 3;
                ci2Var5 = ci2Var4;
                b(leVar11, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i113 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i113 & 458752));
                O.g(j30VarQ, false, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                my4Var5 = my4Var4;
                pg2Var4 = pg2Var3;
                z3 = z5;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(z, j81Var, pg2Var4, z3, ci2Var5, my4Var5, i2, i3);
        }
        i4 |= 3072;
        z3 = z2;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((57344 & i2) == 0) {
                ci2Var2 = ci2Var;
                if (j30VarQ.I(ci2Var2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    my4Var2 = my4Var;
                    if (j30VarQ.I(my4Var2)) {
                    }
                    i4 |= i12;
                } else {
                    my4Var2 = my4Var;
                }
                i4 |= i12;
            } else {
                my4Var2 = my4Var;
            }
            if ((374491 & i4) == 74898) {
                j30VarQ.t0();
                i9 = i2 & 1;
                c0132QnHx = g30.QnHx.a;
                pg2VarA = pg2.QnHx.w;
                if (i9 != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var11115 = sv.a;
                        long j113 = ((rv) j30VarQ.E(jt4Var11115)).j();
                        long jK112 = ((rv) j30VarQ.E(jt4Var11115)).k();
                        long jF112 = ((rv) j30VarQ.E(jt4Var11115)).f();
                        xh0 xh0Var112 = new xh0(j113, yu.b(j113, 0.54f), jK112, yu.b(jF112, 0.38f), hH.l(yu.b(j113, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11115)).k()), yu.b(hH.l(yu.b(j113, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11115)).k()), 0.54f), hH.l(yu.b(jK112, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11115)).k()), yu.b(hH.l(yu.b(jF112, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11115)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var112;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var11116 = sv.a;
                        long j114 = ((rv) j30VarQ.E(jt4Var11116)).j();
                        long jK113 = ((rv) j30VarQ.E(jt4Var11116)).k();
                        long jF113 = ((rv) j30VarQ.E(jt4Var11116)).f();
                        xh0 xh0Var113 = new xh0(j114, yu.b(j114, 0.54f), jK113, yu.b(jF113, 0.38f), hH.l(yu.b(j114, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11116)).k()), yu.b(hH.l(yu.b(j114, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11116)).k()), 0.54f), hH.l(yu.b(jK113, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11116)).k()), yu.b(hH.l(yu.b(jF113, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11116)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var113;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                }
                i10 = i4;
                j30VarQ.S();
                jt4 jt4Var11117 = r40.e;
                float fB11 = ((ij0) j30VarQ.E(jt4Var11117)).b0(h);
                boolValueOf = Boolean.valueOf(z);
                if (j81Var == null) {
                    j81Var2 = F1.w;
                } else {
                    j81Var2 = j81Var;
                }
                j30VarQ.e(1156387078);
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                c0132QnHx2 = c0132QnHx;
                if (objB1 == c0132QnHx2) {
                    objB1 = new iy4(boolValueOf, i, dy4.w);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                iy4Var = (iy4) objB1;
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx2) {
                    objB2 = ps0.R(Boolean.FALSE);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                ri2 ri2Var12 = (ri2) objB2;
                my4Var4 = my4Var3;
                wq0.e(boolValueOf, ri2Var12.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var12), j30VarQ);
                j30VarQ.R(false);
                jt4Var = r40.k;
                if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (j81Var != null) {
                    zs3 zs3Var12 = new zs3(2);
                    wo1.QnHx qnHx114 = wo1.a;
                    if (z) {
                        q85Var = q85.On;
                    } else {
                        q85Var = q85.Off;
                    }
                    pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var12, q85Var)));
                } else {
                    pg2VarA2 = pg2VarA;
                }
                if (j81Var != null) {
                    jt4 jt4Var11118 = f95.a;
                    pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                }
                pg2 pg2VarY113 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                Map mapQ12 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB11), Boolean.TRUE));
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                pg2 pg2VarT12 = ps0.T(gm4.l(fXUx.e(pg2VarY113, iy4Var, mapQ12, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                float f114 = f;
                float f115 = g;
                wo1.QnHx qnHx115 = wo1.a;
                pg2 pg2VarY114 = pg2VarT12.y(new lm4(f114, f115, f114, f115, false));
                j30VarQ.e(733328855);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(jt4Var11117);
                jy1Var = (jy1) j30VarQ.E(jt4Var);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarY114);
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
                le leVar12 = le.a;
                j30VarQ.e(1571176015);
                int i114 = i10 << 3;
                ci2Var5 = ci2Var4;
                b(leVar12, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i114 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i114 & 458752));
                O.g(j30VarQ, false, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                my4Var5 = my4Var4;
                pg2Var4 = pg2Var3;
                z3 = z5;
            } else {
                j30VarQ.t0();
                i9 = i2 & 1;
                c0132QnHx = g30.QnHx.a;
                pg2VarA = pg2.QnHx.w;
                if (i9 != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var11119 = sv.a;
                        long j115 = ((rv) j30VarQ.E(jt4Var11119)).j();
                        long jK114 = ((rv) j30VarQ.E(jt4Var11119)).k();
                        long jF114 = ((rv) j30VarQ.E(jt4Var11119)).f();
                        xh0 xh0Var114 = new xh0(j115, yu.b(j115, 0.54f), jK114, yu.b(jF114, 0.38f), hH.l(yu.b(j115, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11119)).k()), yu.b(hH.l(yu.b(j115, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11119)).k()), 0.54f), hH.l(yu.b(jK114, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11119)).k()), yu.b(hH.l(yu.b(jF114, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var11119)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var114;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2VarA;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i7 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == c0132QnHx) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var3 = (ci2) objB0;
                    } else {
                        ci2Var3 = ci2Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j30VarQ.e(-1032127534);
                        jt4 jt4Var111110 = sv.a;
                        long j116 = ((rv) j30VarQ.E(jt4Var111110)).j();
                        long jK115 = ((rv) j30VarQ.E(jt4Var111110)).k();
                        long jF115 = ((rv) j30VarQ.E(jt4Var111110)).f();
                        xh0 xh0Var115 = new xh0(j116, yu.b(j116, 0.54f), jK115, yu.b(jF115, 0.38f), hH.l(yu.b(j116, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111110)).k()), yu.b(hH.l(yu.b(j116, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111110)).k()), 0.54f), hH.l(yu.b(jK115, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111110)).k()), yu.b(hH.l(yu.b(jF115, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111110)).k()), 0.38f));
                        j30VarQ.R(false);
                        i4 &= -458753;
                        my4Var2 = xh0Var115;
                    }
                    pg2Var3 = pg2Var2;
                    z5 = z4;
                    ci2Var4 = ci2Var3;
                    my4Var3 = my4Var2;
                }
                i10 = i4;
                j30VarQ.S();
                jt4 jt4Var111111 = r40.e;
                float fB12 = ((ij0) j30VarQ.E(jt4Var111111)).b0(h);
                boolValueOf = Boolean.valueOf(z);
                if (j81Var == null) {
                    j81Var2 = F1.w;
                } else {
                    j81Var2 = j81Var;
                }
                j30VarQ.e(1156387078);
                j30VarQ.e(-492369756);
                objB1 = j30VarQ.b0();
                c0132QnHx2 = c0132QnHx;
                if (objB1 == c0132QnHx2) {
                    objB1 = new iy4(boolValueOf, i, dy4.w);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                iy4Var = (iy4) objB1;
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx2) {
                    objB2 = ps0.R(Boolean.FALSE);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                ri2 ri2Var13 = (ri2) objB2;
                my4Var4 = my4Var3;
                wq0.e(boolValueOf, ri2Var13.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
                wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var13), j30VarQ);
                j30VarQ.R(false);
                jt4Var = r40.k;
                if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (j81Var != null) {
                    zs3 zs3Var13 = new zs3(2);
                    wo1.QnHx qnHx116 = wo1.a;
                    if (z) {
                        q85Var = q85.On;
                    } else {
                        q85Var = q85.Off;
                    }
                    pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var13, q85Var)));
                } else {
                    pg2VarA2 = pg2VarA;
                }
                if (j81Var != null) {
                    jt4 jt4Var111112 = f95.a;
                    pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
                }
                pg2 pg2VarY115 = pg2Var3.y(pg2VarA).y(pg2VarA2);
                Map mapQ13 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB12), Boolean.TRUE));
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                pg2 pg2VarT13 = ps0.T(gm4.l(fXUx.e(pg2VarY115, iy4Var, mapQ13, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
                float f116 = f;
                float f117 = g;
                wo1.QnHx qnHx117 = wo1.a;
                pg2 pg2VarY116 = pg2VarT13.y(new lm4(f116, f117, f116, f117, false));
                j30VarQ.e(733328855);
                rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(jt4Var111111);
                jy1Var = (jy1) j30VarQ.E(jt4Var);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarY116);
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
                le leVar13 = le.a;
                j30VarQ.e(1571176015);
                int i115 = i10 << 3;
                ci2Var5 = ci2Var4;
                b(leVar13, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i115 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i115 & 458752));
                O.g(j30VarQ, false, false, false, true);
                j30VarQ.R(false);
                j30VarQ.R(false);
                my4Var5 = my4Var4;
                pg2Var4 = pg2Var3;
                z3 = z5;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(z, j81Var, pg2Var4, z3, ci2Var5, my4Var5, i2, i3);
        }
        i4 |= 24576;
        ci2Var2 = ci2Var;
        if ((458752 & i2) == 0) {
            if ((i3 & 32) == 0) {
                my4Var2 = my4Var;
                if (j30VarQ.I(my4Var2)) {
                }
                i4 |= i12;
            } else {
                my4Var2 = my4Var;
            }
            i4 |= i12;
        } else {
            my4Var2 = my4Var;
        }
        if ((374491 & i4) == 74898) {
            j30VarQ.t0();
            i9 = i2 & 1;
            c0132QnHx = g30.QnHx.a;
            pg2VarA = pg2.QnHx.w;
            if (i9 != 0) {
                if (i11 != 0) {
                    pg2Var2 = pg2VarA;
                }
                if (i5 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i7 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == c0132QnHx) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB0;
                } else {
                    ci2Var3 = ci2Var2;
                }
                if ((i3 & 32) != 0) {
                    j30VarQ.e(-1032127534);
                    jt4 jt4Var111113 = sv.a;
                    long j117 = ((rv) j30VarQ.E(jt4Var111113)).j();
                    long jK116 = ((rv) j30VarQ.E(jt4Var111113)).k();
                    long jF116 = ((rv) j30VarQ.E(jt4Var111113)).f();
                    xh0 xh0Var116 = new xh0(j117, yu.b(j117, 0.54f), jK116, yu.b(jF116, 0.38f), hH.l(yu.b(j117, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111113)).k()), yu.b(hH.l(yu.b(j117, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111113)).k()), 0.54f), hH.l(yu.b(jK116, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111113)).k()), yu.b(hH.l(yu.b(jF116, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111113)).k()), 0.38f));
                    j30VarQ.R(false);
                    i4 &= -458753;
                    my4Var2 = xh0Var116;
                }
                pg2Var3 = pg2Var2;
                z5 = z4;
                ci2Var4 = ci2Var3;
                my4Var3 = my4Var2;
            } else {
                if (i11 != 0) {
                    pg2Var2 = pg2VarA;
                }
                if (i5 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i7 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == c0132QnHx) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB0;
                } else {
                    ci2Var3 = ci2Var2;
                }
                if ((i3 & 32) != 0) {
                    j30VarQ.e(-1032127534);
                    jt4 jt4Var111114 = sv.a;
                    long j118 = ((rv) j30VarQ.E(jt4Var111114)).j();
                    long jK117 = ((rv) j30VarQ.E(jt4Var111114)).k();
                    long jF117 = ((rv) j30VarQ.E(jt4Var111114)).f();
                    xh0 xh0Var117 = new xh0(j118, yu.b(j118, 0.54f), jK117, yu.b(jF117, 0.38f), hH.l(yu.b(j118, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111114)).k()), yu.b(hH.l(yu.b(j118, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111114)).k()), 0.54f), hH.l(yu.b(jK117, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111114)).k()), yu.b(hH.l(yu.b(jF117, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111114)).k()), 0.38f));
                    j30VarQ.R(false);
                    i4 &= -458753;
                    my4Var2 = xh0Var117;
                }
                pg2Var3 = pg2Var2;
                z5 = z4;
                ci2Var4 = ci2Var3;
                my4Var3 = my4Var2;
            }
            i10 = i4;
            j30VarQ.S();
            jt4 jt4Var111115 = r40.e;
            float fB13 = ((ij0) j30VarQ.E(jt4Var111115)).b0(h);
            boolValueOf = Boolean.valueOf(z);
            if (j81Var == null) {
                j81Var2 = F1.w;
            } else {
                j81Var2 = j81Var;
            }
            j30VarQ.e(1156387078);
            j30VarQ.e(-492369756);
            objB1 = j30VarQ.b0();
            c0132QnHx2 = c0132QnHx;
            if (objB1 == c0132QnHx2) {
                objB1 = new iy4(boolValueOf, i, dy4.w);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            iy4Var = (iy4) objB1;
            j30VarQ.e(-492369756);
            objB2 = j30VarQ.b0();
            if (objB2 == c0132QnHx2) {
                objB2 = ps0.R(Boolean.FALSE);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            ri2 ri2Var14 = (ri2) objB2;
            my4Var4 = my4Var3;
            wq0.e(boolValueOf, ri2Var14.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
            wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var14), j30VarQ);
            j30VarQ.R(false);
            jt4Var = r40.k;
            if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (j81Var != null) {
                zs3 zs3Var14 = new zs3(2);
                wo1.QnHx qnHx118 = wo1.a;
                if (z) {
                    q85Var = q85.On;
                } else {
                    q85Var = q85.Off;
                }
                pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var14, q85Var)));
            } else {
                pg2VarA2 = pg2VarA;
            }
            if (j81Var != null) {
                jt4 jt4Var111116 = f95.a;
                pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
            }
            pg2 pg2VarY117 = pg2Var3.y(pg2VarA).y(pg2VarA2);
            Map mapQ14 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB13), Boolean.TRUE));
            if (z5) {
                z7 = false;
            } else {
                z7 = false;
            }
            pg2 pg2VarT14 = ps0.T(gm4.l(fXUx.e(pg2VarY117, iy4Var, mapQ14, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
            float f118 = f;
            float f119 = g;
            wo1.QnHx qnHx119 = wo1.a;
            pg2 pg2VarY118 = pg2VarT14.y(new lm4(f118, f119, f118, f119, false));
            j30VarQ.e(733328855);
            rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var = (ij0) j30VarQ.E(jt4Var111115);
            jy1Var = (jy1) j30VarQ.E(jt4Var);
            ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            qnHx = a30.QnHx.b;
            szVarJ = S12N.j(pg2VarY118);
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
            le leVar14 = le.a;
            j30VarQ.e(1571176015);
            int i116 = i10 << 3;
            ci2Var5 = ci2Var4;
            b(leVar14, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i116 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i116 & 458752));
            O.g(j30VarQ, false, false, false, true);
            j30VarQ.R(false);
            j30VarQ.R(false);
            my4Var5 = my4Var4;
            pg2Var4 = pg2Var3;
            z3 = z5;
        } else {
            j30VarQ.t0();
            i9 = i2 & 1;
            c0132QnHx = g30.QnHx.a;
            pg2VarA = pg2.QnHx.w;
            if (i9 != 0) {
                if (i11 != 0) {
                    pg2Var2 = pg2VarA;
                }
                if (i5 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i7 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == c0132QnHx) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB0;
                } else {
                    ci2Var3 = ci2Var2;
                }
                if ((i3 & 32) != 0) {
                    j30VarQ.e(-1032127534);
                    jt4 jt4Var111117 = sv.a;
                    long j119 = ((rv) j30VarQ.E(jt4Var111117)).j();
                    long jK118 = ((rv) j30VarQ.E(jt4Var111117)).k();
                    long jF118 = ((rv) j30VarQ.E(jt4Var111117)).f();
                    xh0 xh0Var118 = new xh0(j119, yu.b(j119, 0.54f), jK118, yu.b(jF118, 0.38f), hH.l(yu.b(j119, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111117)).k()), yu.b(hH.l(yu.b(j119, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111117)).k()), 0.54f), hH.l(yu.b(jK118, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111117)).k()), yu.b(hH.l(yu.b(jF118, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111117)).k()), 0.38f));
                    j30VarQ.R(false);
                    i4 &= -458753;
                    my4Var2 = xh0Var118;
                }
                pg2Var3 = pg2Var2;
                z5 = z4;
                ci2Var4 = ci2Var3;
                my4Var3 = my4Var2;
            } else {
                if (i11 != 0) {
                    pg2Var2 = pg2VarA;
                }
                if (i5 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i7 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == c0132QnHx) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var3 = (ci2) objB0;
                } else {
                    ci2Var3 = ci2Var2;
                }
                if ((i3 & 32) != 0) {
                    j30VarQ.e(-1032127534);
                    jt4 jt4Var111118 = sv.a;
                    long j1110 = ((rv) j30VarQ.E(jt4Var111118)).j();
                    long jK119 = ((rv) j30VarQ.E(jt4Var111118)).k();
                    long jF119 = ((rv) j30VarQ.E(jt4Var111118)).f();
                    xh0 xh0Var119 = new xh0(j1110, yu.b(j1110, 0.54f), jK119, yu.b(jF119, 0.38f), hH.l(yu.b(j1110, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111118)).k()), yu.b(hH.l(yu.b(j1110, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111118)).k()), 0.54f), hH.l(yu.b(jK119, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111118)).k()), yu.b(hH.l(yu.b(jF119, AY.z(j30VarQ)), ((rv) j30VarQ.E(jt4Var111118)).k()), 0.38f));
                    j30VarQ.R(false);
                    i4 &= -458753;
                    my4Var2 = xh0Var119;
                }
                pg2Var3 = pg2Var2;
                z5 = z4;
                ci2Var4 = ci2Var3;
                my4Var3 = my4Var2;
            }
            i10 = i4;
            j30VarQ.S();
            jt4 jt4Var111119 = r40.e;
            float fB14 = ((ij0) j30VarQ.E(jt4Var111119)).b0(h);
            boolValueOf = Boolean.valueOf(z);
            if (j81Var == null) {
                j81Var2 = F1.w;
            } else {
                j81Var2 = j81Var;
            }
            j30VarQ.e(1156387078);
            j30VarQ.e(-492369756);
            objB1 = j30VarQ.b0();
            c0132QnHx2 = c0132QnHx;
            if (objB1 == c0132QnHx2) {
                objB1 = new iy4(boolValueOf, i, dy4.w);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            iy4Var = (iy4) objB1;
            j30VarQ.e(-492369756);
            objB2 = j30VarQ.b0();
            if (objB2 == c0132QnHx2) {
                objB2 = ps0.R(Boolean.FALSE);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            ri2 ri2Var15 = (ri2) objB2;
            my4Var4 = my4Var3;
            wq0.e(boolValueOf, ri2Var15.getValue(), new ay4(boolValueOf, iy4Var, null), j30VarQ);
            wq0.a(iy4Var.b(), new cy4(boolValueOf, iy4Var, j81Var2, ri2Var15), j30VarQ);
            j30VarQ.R(false);
            jt4Var = r40.k;
            if (j30VarQ.E(jt4Var) == jy1.Rtl) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (j81Var != null) {
                zs3 zs3Var15 = new zs3(2);
                wo1.QnHx qnHx1110 = wo1.a;
                if (z) {
                    q85Var = q85.On;
                } else {
                    q85Var = q85.Off;
                }
                pg2VarA2 = wo1.a(pg2VarA, f30.a(pg2VarA, wo1.a, new p85(new j85(j81Var, z), z5, ci2Var4, zs3Var15, q85Var)));
            } else {
                pg2VarA2 = pg2VarA;
            }
            if (j81Var != null) {
                jt4 jt4Var1111110 = f95.a;
                pg2VarA = f30.a(pg2VarA, wo1.a, g95.w);
            }
            pg2 pg2VarY119 = pg2Var3.y(pg2VarA).y(pg2VarA2);
            Map mapQ15 = t92.Q(new uy2(Float.valueOf(0.0f), Boolean.FALSE), new uy2(Float.valueOf(fB14), Boolean.TRUE));
            if (z5) {
                z7 = false;
            } else {
                z7 = false;
            }
            pg2 pg2VarT15 = ps0.T(gm4.l(fXUx.e(pg2VarY119, iy4Var, mapQ15, z7, z6, ci2Var4, QnHx.w, 0.0f, 256), One.QnHx.e, 2), e);
            float f1110 = f;
            float f1111 = g;
            wo1.QnHx qnHx1111 = wo1.a;
            pg2 pg2VarY1110 = pg2VarT15.y(new lm4(f1110, f1111, f1110, f1111, false));
            j30VarQ.e(733328855);
            rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var = (ij0) j30VarQ.E(jt4Var111119);
            jy1Var = (jy1) j30VarQ.E(jt4Var);
            ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            qnHx = a30.QnHx.b;
            szVarJ = S12N.j(pg2VarY1110);
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
            le leVar15 = le.a;
            j30VarQ.e(1571176015);
            int i117 = i10 << 3;
            ci2Var5 = ci2Var4;
            b(leVar15, z, z5, my4Var4, iy4Var.e, ci2Var5, j30VarQ, (i117 & 112) | 6 | ((i10 >> 3) & 896) | ((i10 >> 6) & 7168) | (i117 & 458752));
            O.g(j30VarQ, false, false, false, true);
            j30VarQ.R(false);
            j30VarQ.R(false);
            my4Var5 = my4Var4;
            pg2Var4 = pg2Var3;
            z3 = z5;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(z, j81Var, pg2Var4, z3, ci2Var5, my4Var5, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ke keVar, boolean z, boolean z2, my4 my4Var, is4<Float> is4Var, wp1 wp1Var, g30 g30Var, int i2) {
        int i3;
        int i4;
        long jA;
        j30 j30VarQ = g30Var.q(-1834839253);
        if ((i2 & 14) == 0) {
            i3 = (j30VarQ.I(keVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= j30VarQ.c(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= j30VarQ.c(z2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= j30VarQ.I(my4Var) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= j30VarQ.I(is4Var) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= j30VarQ.I(wp1Var) ? 131072 : 65536;
        }
        if ((i3 & 374491) == 74898 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = new wp4();
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            wp4 wp4Var = (wp4) objB0;
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(wp1Var) | j30VarQ.I(wp4Var);
            Object objB1 = j30VarQ.b0();
            if (zI || objB1 == c0132QnHx) {
                objB1 = new LPt8Fixed(wp1Var, wp4Var, null);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            wq0.d(wp1Var, (x81) objB1, j30VarQ);
            float f2 = wp4Var.isEmpty() ^ true ? k : j;
            ri2 ri2VarA = my4Var.a(z2, z, j30VarQ);
            pg2.QnHx qnHx = pg2.QnHx.w;
            pg2 pg2VarE = gm4.e(keVar.b(qnHx, One.QnHx.e));
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(ri2VarA);
            Object objB2 = j30VarQ.b0();
            if (zI2 || objB2 == c0132QnHx) {
                objB2 = new NUlFixed(ri2VarA);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            gn.a(pg2VarE, (j81) objB2, j30VarQ, 0);
            ri2 ri2VarB = my4Var.b(z2, z, j30VarQ);
            ar0 ar0Var = (ar0) j30VarQ.E(br0.a);
            float f3 = ((wm0) j30VarQ.E(br0.b)).w + f2;
            j30VarQ.e(-539245361);
            if (!yu.c(((yu) ri2VarB.getValue()).a, ((rv) j30VarQ.E(sv.a)).k()) || ar0Var == null) {
                i4 = 1157296644;
                jA = ((yu) ri2VarB.getValue()).a;
            } else {
                i4 = 1157296644;
                jA = ar0Var.a(((yu) ri2VarB.getValue()).a, f3, j30VarQ, 0);
            }
            long j2 = jA;
            j30VarQ.R(false);
            pg2 pg2VarB = keVar.b(qnHx, One.QnHx.d);
            j30VarQ.e(i4);
            boolean zI3 = j30VarQ.I(is4Var);
            Object objB3 = j30VarQ.b0();
            if (zI3 || objB3 == c0132QnHx) {
                objB3 = new YKK(is4Var);
                j30VarQ.F0(objB3);
            }
            j30VarQ.R(false);
            wo1.QnHx qnHx2 = wo1.a;
            pg2 pg2VarA = wj1.a(pg2VarB.y(new ot2((j81) objB3)), wp1Var, vs3.a(false, d, 0L, j30VarQ, 54, 4));
            float f4 = c;
            pg2 pg2VarY = pg2VarA.y(new lm4(f4, f4, f4, f4, false));
            lu3 lu3Var = mu3.a;
            hH.i(ps0.k(JUCk.d(pg2VarY, f2, lu3Var), j2, lu3Var), j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new auxFixed(keVar, z, z2, my4Var, is4Var, wp1Var, i2);
    }
}
