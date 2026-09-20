package defpackage;

import com.azefsw.audioconnect.R;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hd0 {
    public static final f34 a = NRt.b(new p92(LPt8Fixed.w), new q92(NUlFixed.w));

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ de0 w;
        public final /* synthetic */ is4<dd0> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(de0 de0Var, ri2 ri2Var) {
            super(2);
            this.w = de0Var;
            this.x = ri2Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                float f = (14 & 1) != 0 ? Float.NaN : 280;
                float f2 = (14 & 2) != 0 ? Float.NaN : 0.0f;
                float f3 = (14 & 4) != 0 ? Float.NaN : 0.0f;
                float f4 = (14 & 8) != 0 ? Float.NaN : 0.0f;
                wo1.QnHx qnHx = wo1.a;
                lm4 lm4Var = new lm4(f, f2, f3, f4, true);
                dd0 value = this.x.getValue();
                g30Var2.e(1157296644);
                de0 de0Var = this.w;
                boolean zI = g30Var2.I(de0Var);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new id0(de0Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                hd0.d(lm4Var, value, (j81) objF, g30Var2, 6, 0);
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            hd0.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g34, ce0.CQf, Map<String, ? extends Object>> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final Map<String, ? extends Object> invoke(g34 g34Var, ce0.CQf cQf) {
            ce0.CQf cQf2 = cQf;
            uy2[] uy2VarArr = new uy2[2];
            x45 x45Var = cQf2.a;
            uy2VarArr[0] = new uy2("MIN", x45Var != null ? x45Var.a.w : null);
            x45 x45Var2 = cQf2.b;
            uy2VarArr[1] = new uy2("MAX", x45Var2 != null ? x45Var2.a.w : null);
            return t92.Q(uy2VarArr);
        }
    }

    public static final class NUlFixed extends cx1 implements j81<Map<String, ? extends Object>, ce0.CQf> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final ce0.CQf invoke(Map<String, ? extends Object> map) {
            Map<String, ? extends Object> map2 = map;
            Object obj = map2.get("MIN");
            String str = obj instanceof String ? (String) obj : null;
            x45 x45Var = str != null ? new x45(str, 0L, 6) : null;
            Object obj2 = map2.get("MAX");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            return new ce0.CQf(x45Var, str2 != null ? new x45(str2, 0L, 6) : null);
        }
    }

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ de0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(de0 de0Var) {
            super(0);
            this.w = de0Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.g(cd0.QnHx.a);
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
                j55.b(this.w, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, (this.x >> 3) & 14, 0, 65534);
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements j81<iw1, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ iq4 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(boolean z, iq4 iq4Var) {
            super(1);
            this.w = z;
            this.x = iq4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(iw1 iw1Var) {
            iq4 iq4Var;
            if (this.w && (iq4Var = this.x) != null) {
                iq4Var.a();
            }
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements j81<x45, sd5> {
        public final /* synthetic */ ri2<ce0.CQf> w;
        public final /* synthetic */ j81<x45, ce0.CQf> x;
        public final /* synthetic */ j81<cd0, sd5> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(ri2<ce0.CQf> ri2Var, j81<? super x45, ce0.CQf> j81Var, j81<? super cd0, sd5> j81Var2) {
            super(1);
            this.w = ri2Var;
            this.x = j81Var;
            this.y = j81Var2;
        }

        @Override // defpackage.j81
        public final sd5 invoke(x45 x45Var) {
            ce0.CQf cQfInvoke = this.x.invoke(x45Var);
            ri2<ce0.CQf> ri2Var = this.w;
            ri2Var.setValue(cQfInvoke);
            this.y.invoke(new cd0.LPt8Fixed(ri2Var.getValue()));
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ j81<ce0.CQf, x45> B;
        public final /* synthetic */ j81<x45, ce0.CQf> C;
        public final /* synthetic */ j81<cd0, sd5> D;
        public final /* synthetic */ int E;
        public final /* synthetic */ String w;
        public final /* synthetic */ String x;
        public final /* synthetic */ ri2<ce0.CQf> y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public byN(String str, String str2, ri2<ce0.CQf> ri2Var, boolean z, boolean z2, j81<? super ce0.CQf, x45> j81Var, j81<? super x45, ce0.CQf> j81Var2, j81<? super cd0, sd5> j81Var3, int i) {
            super(2);
            this.w = str;
            this.x = str2;
            this.y = ri2Var;
            this.z = z;
            this.A = z2;
            this.B = j81Var;
            this.C = j81Var2;
            this.D = j81Var3;
            this.E = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            hd0.b(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, g30Var, this.E | 1);
            return sd5.a;
        }
    }

    public static final void a(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(-1252566686);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-280703834);
            bm2 bm2Var = (bm2) j30VarQ.E(u42.a);
            sd0 sd0Var = sd0.w;
            td0 td0Var = new td0(bm2Var);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(sd0Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(td0Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(de0.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            de0 de0Var = (de0) ((ZUx) obj);
            j30VarQ.R(false);
            ri2 ri2VarT = ps0.t(de0Var.f(), j30VarQ);
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(de0Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new QnHx(de0Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            vQgK.a((h81) objB1, null, X.m(j30VarQ, -1659837959, new CQf(de0Var, ri2VarT)), j30VarQ, 384, 2);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(i);
    }

    public static final void b(String str, String str2, ri2<ce0.CQf> ri2Var, boolean z, boolean z2, j81<? super ce0.CQf, x45> j81Var, j81<? super x45, ce0.CQf> j81Var2, j81<? super cd0, sd5> j81Var3, g30 g30Var, int i) {
        int i2;
        j81 j81Var4;
        j30 j30VarQ = g30Var.q(-2053880025);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(str2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(ri2Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.c(z) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.c(z2) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= j30VarQ.I(j81Var2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= j30VarQ.I(j81Var3) ? 8388608 : 4194304;
        }
        if ((23967451 & i2) == 4793490 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-483455358);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
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
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            iq4 iq4VarA = w42.a(j30VarQ);
            j55.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).l, j30VarQ, i2 & 14, 0, 32766);
            hH.i(gm4.g(qnHx, 8), j30VarQ, 6);
            j30VarQ.e(-1974220439);
            x45 x45VarInvoke = j81Var.invoke(ri2Var.getValue());
            pg2 pg2VarB = x45VarInvoke == null ? null : xnX3.b(qnHx, x45VarInvoke, j30VarQ);
            pg2 pg2Var = pg2VarB == null ? qnHx : pg2VarB;
            j30VarQ.R(false);
            x45 x45VarInvoke2 = j81Var.invoke(ri2Var.getValue());
            if (x45VarInvoke2 == null) {
                j81Var4 = null;
                x45VarInvoke2 = new x45((String) null, 0L, 7);
            } else {
                j81Var4 = null;
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(boolValueOf) | j30VarQ.I(iq4VarA);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new YKK(z2, iq4VarA);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            jw1 jw1Var = new jw1((j81) objB0, j81Var4, 62);
            qw1 qw1Var = z2 ? new qw1(3, 7, 3) : new qw1(3, 6, 3);
            j30VarQ.e(1618982084);
            boolean zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2) | j30VarQ.I(j81Var3);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new auxFixed(ri2Var, j81Var2, j81Var3);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            iw2.a(x45VarInvoke2, (j81) objB1, pg2Var, z, false, null, X.m(j30VarQ, 478697111, new T23(str2, i2)), null, null, null, false, null, qw1Var, jw1Var, true, 1, null, null, null, j30VarQ, (i2 & 7168) | 1572864, 221184, 462768);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new byN(str, str2, ri2Var, z, z2, j81Var, j81Var2, j81Var3, i);
    }

    public static final void c(pg2 pg2Var, ce0.CQf cQf, dd0 dd0Var, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1676301056);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(cQf) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(dd0Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 2048 : 1024;
        }
        if ((i2 & 5851) == 1170 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf2 = e40.a;
            int i3 = i2 & 14;
            j30VarQ.e(693286680);
            rb2 rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2Var);
            int i4 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
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
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, Integer.valueOf((i4 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-678309503);
            if (((i4 >> 9) & 14 & 11) == 2 && j30VarQ.t()) {
                j30VarQ.x();
            } else if (((((i3 >> 6) & 112) | 6) & 81) == 16 && j30VarQ.t()) {
                j30VarQ.x();
            } else {
                j30VarQ.e(1157296644);
                boolean zI = j30VarQ.I(j81Var);
                Object objB0 = j30VarQ.b0();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objB0 == c0132QnHx) {
                    objB0 = new ed0(j81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                si.c((h81) objB0, null, false, null, q00.a, j30VarQ, 805306368, 510);
                float f = 16;
                wo1.QnHx qnHx2 = wo1.a;
                hH.i(new lm4(f, 0.0f, f, 0.0f, 10), j30VarQ, 6);
                j30VarQ.e(511388516);
                boolean zI2 = j30VarQ.I(j81Var) | j30VarQ.I(cQf);
                Object objB1 = j30VarQ.b0();
                if (zI2 || objB1 == c0132QnHx) {
                    objB1 = new fd0(j81Var, cQf);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                si.b((h81) objB1, null, dd0Var.d, q00.b, j30VarQ, 805306368, 506);
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new gd0(pg2Var, cQf, dd0Var, j81Var, i);
    }

    public static final void d(pg2 pg2Var, dd0 dd0Var, j81 j81Var, g30 g30Var, int i, int i2) {
        pg2 pg2Var2;
        int i3;
        pg2 pg2Var3;
        j30 j30VarQ = g30Var.q(1473123374);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(dd0Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
            pg2Var3 = pg2Var2;
        } else {
            pg2Var3 = i4 != 0 ? pg2.QnHx.w : pg2Var2;
            e40.CQf cQf = e40.a;
            Object[] objArr = {dd0Var.b};
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(dd0Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new ld0(dd0Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ix4.a(pg2Var3, null, 0L, 0L, null, 0.0f, X.m(j30VarQ, -1356853654, new jd0(g7.e(objArr, a, (h81) objB0, j30VarQ), dd0Var, j81Var, i3)), j30VarQ, (i3 & 14) | 1572864, 62);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new kd0(pg2Var3, dd0Var, j81Var, i, i2);
    }

    public static final void e(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1416141498);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j55.b(hH.x(R.string.custom_buffer_size_editor_title, j30VarQ), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).d, j30VarQ, 0, 0, 32766);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new md0(i);
    }

    public static final void f(ri2 ri2Var, dd0 dd0Var, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(76668997);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(ri2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(dd0Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.custom_buffer_size_editor_minimum_helper, j30VarQ);
            String strX2 = hH.x(R.string.buffer_size_custom_minimum_buffer, j30VarQ);
            boolean z = dd0Var.a;
            nd0 nd0Var = nd0.w;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(ri2Var);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new od0(ri2Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            int i3 = ((i2 << 6) & 896) | 221184 | ((i2 << 15) & 29360128);
            b(strX, strX2, ri2Var, z, false, nd0Var, (j81) objB0, j81Var, j30VarQ, i3);
            float f = 24;
            wo1.QnHx qnHx = wo1.a;
            hH.i(new lm4(0.0f, f, 0.0f, f, 5), j30VarQ, 6);
            String strX3 = hH.x(R.string.custom_buffer_size_editor_maximum_helper, j30VarQ);
            String strX4 = hH.x(R.string.buffer_size_custom_maximum_buffer, j30VarQ);
            boolean z2 = dd0Var.a;
            pd0 pd0Var = pd0.w;
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(ri2Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new qd0(ri2Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            b(strX3, strX4, ri2Var, z2, true, pd0Var, (j81) objB1, j81Var, j30VarQ, i3);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new rd0(ri2Var, dd0Var, j81Var, i);
    }
}
