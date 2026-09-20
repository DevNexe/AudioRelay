package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class do0 {

    public static final class QnHx extends cx1 implements y81<pg2, g30, Integer, pg2> {
        public final /* synthetic */ y81<ua0, kt2, z80<? super sd5>, Object> A;
        public final /* synthetic */ y81<ua0, Float, z80<? super sd5>, Object> B;
        public final /* synthetic */ aw2 C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ x81<g30, Integer, x83> w;
        public final /* synthetic */ ci2 x;
        public final /* synthetic */ h81<Boolean> y;
        public final /* synthetic */ j81<d93, Boolean> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(aw2 aw2Var, ci2 ci2Var, h81 h81Var, j81 j81Var, x81 x81Var, y81 y81Var, y81 y81Var2, boolean z, boolean z2) {
            super(3);
            this.w = x81Var;
            this.x = ci2Var;
            this.y = h81Var;
            this.z = j81Var;
            this.A = y81Var;
            this.B = y81Var2;
            this.C = aw2Var;
            this.D = z;
            this.E = z2;
        }

        @Override // defpackage.y81
        public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(-1487259950);
            x83 x83VarInvoke = this.w.invoke(g30Var2, 0);
            g30Var2.e(-492369756);
            Object objF = g30Var2.f();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (objF == c0132QnHx) {
                objF = ps0.R(null);
                g30Var2.B(objF);
            }
            g30Var2.G();
            ri2 ri2Var = (ri2) objF;
            ci2 ci2Var = this.x;
            wq0.a(ci2Var, new ao0(ri2Var, ci2Var), g30Var2);
            g30Var2.e(-492369756);
            Object objF2 = g30Var2.f();
            if (objF2 == c0132QnHx) {
                objF2 = AY.a(Integer.MAX_VALUE, null, 6);
                g30Var2.B(objF2);
            }
            g30Var2.G();
            jo joVar = (jo) objF2;
            ri2 ri2VarF0 = ps0.f0(this.y, g30Var2);
            ri2 ri2VarF1 = ps0.f0(this.z, g30Var2);
            wq0.d(x83VarInvoke, new bo0(joVar, x83VarInvoke, ps0.f0(new pn0(this.A, this.B, ri2Var, ci2Var), g30Var2), null), g30Var2);
            Object[] objArr = {this.C, Boolean.valueOf(this.D), Boolean.valueOf(this.E)};
            co0 co0Var = new co0(this.D, ri2VarF1, ri2VarF0, this.C, joVar, this.E, null);
            y83 y83Var = tx4.a;
            c30 c30Var = new c30(wo1.a, new xx4(objArr, co0Var));
            g30Var2.G();
            return c30Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable a(a5 a5Var, is4 is4Var, is4 is4Var2, oh5 oh5Var, aw2 aw2Var, z80 z80Var) throws Throwable {
        rn0 rn0Var;
        a5 a5Var2;
        oh5 oh5Var2;
        aw2 aw2Var2;
        d93 d93Var;
        gl3 gl3Var;
        sn0 sn0Var;
        gl3 gl3Var2;
        d93 d93Var2;
        if (z80Var instanceof rn0) {
            rn0Var = (rn0) z80Var;
            int i = rn0Var.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                rn0Var.F = i - Integer.MIN_VALUE;
            } else {
                rn0Var = new rn0(z80Var);
            }
        } else {
            rn0Var = new rn0(z80Var);
        }
        rn0 rn0Var2 = rn0Var;
        Object objB = rn0Var2.E;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = rn0Var2.F;
        if (i2 == 0) {
            C0239D.H(objB);
            z83 z83Var = z83.Initial;
            rn0Var2.z = a5Var;
            rn0Var2.A = is4Var;
            rn0Var2.B = is4Var2;
            rn0Var2.C = oh5Var;
            rn0Var2.D = aw2Var;
            rn0Var2.F = 1;
            objB = p05.b(a5Var, z83Var, false, rn0Var2);
            if (objB == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        gl3Var2 = (gl3) rn0Var2.z;
                        C0239D.H(objB);
                        d93Var2 = (d93) objB;
                        if (d93Var2 != null) {
                            return new uy2(d93Var2, new Float(gl3Var2.w));
                        }
                        return null;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gl3Var2 = (gl3) rn0Var2.z;
                    C0239D.H(objB);
                    d93Var2 = (d93) objB;
                    if (d93Var2 != null) {
                        return new uy2(d93Var2, new Float(gl3Var2.w));
                    }
                    return null;
                }
                aw2Var2 = (aw2) rn0Var2.B;
                oh5Var2 = (oh5) rn0Var2.A;
                a5Var2 = (a5) rn0Var2.z;
                C0239D.H(objB);
                d93Var = (d93) objB;
                Cz.f(oh5Var2, d93Var);
                gl3Var = new gl3();
                sn0Var = new sn0(oh5Var2, gl3Var);
                if (aw2Var2 == aw2.Vertical) {
                    long j = d93Var.a;
                    int i3 = d93Var.h;
                    rn0Var2.z = gl3Var;
                    rn0Var2.A = null;
                    rn0Var2.B = null;
                    rn0Var2.F = 3;
                    objB = bn0.e(a5Var2, j, i3, sn0Var, rn0Var2);
                    if (objB == va0Var) {
                        return va0Var;
                    }
                    gl3Var2 = gl3Var;
                    d93Var2 = (d93) objB;
                    if (d93Var2 != null) {
                        return new uy2(d93Var2, new Float(gl3Var2.w));
                    }
                    return null;
                }
                long j2 = d93Var.a;
                int i4 = d93Var.h;
                rn0Var2.z = gl3Var;
                rn0Var2.A = null;
                rn0Var2.B = null;
                rn0Var2.F = 4;
                objB = bn0.c(a5Var2, j2, i4, sn0Var, rn0Var2);
                if (objB == va0Var) {
                    return va0Var;
                }
                gl3Var2 = gl3Var;
                d93Var2 = (d93) objB;
                if (d93Var2 != null) {
                    return new uy2(d93Var2, new Float(gl3Var2.w));
                }
                return null;
            }
            aw2Var = rn0Var2.D;
            oh5Var = rn0Var2.C;
            is4Var2 = (is4) rn0Var2.B;
            is4Var = (is4) rn0Var2.A;
            a5Var = (a5) rn0Var2.z;
            C0239D.H(objB);
        }
        d93 d93Var3 = (d93) objB;
        if (((Boolean) ((j81) is4Var.getValue()).invoke(d93Var3)).booleanValue()) {
            if (((Boolean) ((h81) is4Var2.getValue()).invoke()).booleanValue()) {
                d93Var3.a();
                Cz.f(oh5Var, d93Var3);
                return new uy2(d93Var3, new Float(0.0f));
            }
            rn0Var2.z = a5Var;
            rn0Var2.A = oh5Var;
            rn0Var2.B = aw2Var;
            rn0Var2.C = null;
            rn0Var2.D = null;
            rn0Var2.F = 2;
            objB = p05.b(a5Var, z83.Main, false, rn0Var2);
            if (objB == va0Var) {
                return va0Var;
            }
            a5Var2 = a5Var;
            oh5Var2 = oh5Var;
            aw2Var2 = aw2Var;
            d93Var = (d93) objB;
            Cz.f(oh5Var2, d93Var);
            gl3Var = new gl3();
            sn0Var = new sn0(oh5Var2, gl3Var);
            if (aw2Var2 == aw2.Vertical) {
                long j3 = d93Var.a;
                int i5 = d93Var.h;
                rn0Var2.z = gl3Var;
                rn0Var2.A = null;
                rn0Var2.B = null;
                rn0Var2.F = 3;
                objB = bn0.e(a5Var2, j3, i5, sn0Var, rn0Var2);
                if (objB == va0Var) {
                    return va0Var;
                }
                gl3Var2 = gl3Var;
                d93Var2 = (d93) objB;
                if (d93Var2 != null) {
                    return new uy2(d93Var2, new Float(gl3Var2.w));
                }
            } else {
                long j4 = d93Var.a;
                int i6 = d93Var.h;
                rn0Var2.z = gl3Var;
                rn0Var2.A = null;
                rn0Var2.B = null;
                rn0Var2.F = 4;
                objB = bn0.c(a5Var2, j4, i6, sn0Var, rn0Var2);
                if (objB == va0Var) {
                    return va0Var;
                }
                gl3Var2 = gl3Var;
                d93Var2 = (d93) objB;
                if (d93Var2 != null) {
                    return new uy2(d93Var2, new Float(gl3Var2.w));
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(a5 a5Var, uy2 uy2Var, oh5 oh5Var, jo joVar, boolean z, aw2 aw2Var, co0.QnHx.C0067QnHx c0067QnHx) {
        float fFloatValue = ((Number) uy2Var.x).floatValue();
        d93 d93Var = (d93) uy2Var.w;
        aw2 aw2Var2 = aw2.Vertical;
        long jA = aw2Var == aw2Var2 ? X.a(0.0f, fFloatValue) : X.a(fFloatValue, 0.0f);
        long j = d93Var.c;
        long jF = kt2.f(j, kt2.h(jA, Math.signum(aw2Var == aw2Var2 ? kt2.d(j) : kt2.c(j))));
        joVar.H(new an0.F1(jF));
        if (z) {
            fFloatValue *= -1;
        }
        joVar.H(new an0.CQf(fFloatValue, jF));
        tn0 tn0Var = new tn0(oh5Var, aw2Var, joVar, z);
        long j2 = d93Var.a;
        return aw2Var == aw2Var2 ? bn0.j(a5Var, j2, tn0Var, c0067QnHx) : bn0.g(a5Var, j2, tn0Var, c0067QnHx);
    }

    public static final pg2 c(pg2 pg2Var, x81<? super g30, ? super Integer, ? extends x83> x81Var, j81<? super d93, Boolean> j81Var, aw2 aw2Var, boolean z, ci2 ci2Var, h81<Boolean> h81Var, y81<? super ua0, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, y81<? super ua0, ? super Float, ? super z80<? super sd5>, ? extends Object> y81Var2, boolean z2) {
        return f30.a(pg2Var, wo1.a, new QnHx(aw2Var, ci2Var, h81Var, j81Var, x81Var, y81Var, y81Var2, z, z2));
    }

    public static pg2 d(eo0 eo0Var, aw2 aw2Var, boolean z, ci2 ci2Var, boolean z2, y81 y81Var, boolean z3) {
        return c(pg2.QnHx.w, new vn0(eo0Var), wn0.w, aw2Var, z, ci2Var, new xn0(z2), new un0(null), y81Var, z3);
    }
}
