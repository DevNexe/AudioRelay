package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x72 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ky2 w;
        public final /* synthetic */ x81<Integer, z80<? super sd5>, Object> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(ky2 ky2Var, x81<? super Integer, ? super z80<? super sd5>, ? extends Object> x81Var, int i) {
            super(2);
            this.w = ky2Var;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            x72.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class EQ extends cx1 implements a91<iy2, Integer, g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ int x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public EQ(x81<? super g30, ? super Integer, sd5> x81Var, int i, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3) {
            super(4);
            this.w = x81Var;
            this.x = i;
            this.y = x81Var2;
            this.z = x81Var3;
        }

        @Override // defpackage.a91
        public final sd5 I(iy2 iy2Var, Integer num, g30 g30Var, Integer num2) {
            int iIntValue = num.intValue();
            g30 g30Var2 = g30Var;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 112) == 0) {
                iIntValue2 |= g30Var2.i(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 721) == 144 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                hx0 hx0Var = gm4.b;
                g30Var2.e(733328855);
                rb2 rb2VarC = fe.c(One.QnHx.a, false, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx = a30.QnHx.b;
                sz szVarJ = S12N.j(hx0Var);
                if (!(g30Var2.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var2.s();
                if (g30Var2.m()) {
                    g30Var2.l(qnHx);
                } else {
                    g30Var2.A();
                }
                g30Var2.u();
                hH.u(g30Var2, rb2VarC, a30.QnHx.e);
                hH.u(g30Var2, ij0Var, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -2137368960);
                int iOrdinal = l72.a(iIntValue).ordinal();
                int i = this.x;
                if (iOrdinal == 0) {
                    g30Var2.e(-1796218730);
                    this.w.invoke(g30Var2, Integer.valueOf((i >> 6) & 14));
                    g30Var2.G();
                } else if (iOrdinal == 1) {
                    g30Var2.e(-1796218667);
                    this.y.invoke(g30Var2, Integer.valueOf((i >> 9) & 14));
                    g30Var2.G();
                } else if (iOrdinal != 2) {
                    g30Var2.e(-1796218574);
                    g30Var2.G();
                } else {
                    g30Var2.e(-1796218602);
                    this.z.invoke(g30Var2, Integer.valueOf((i >> 12) & 14));
                    g30Var2.G();
                }
                ex0.d(g30Var2);
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<h72, sd5> {
        public final /* synthetic */ d82 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(d82 d82Var) {
            super(1);
            this.w = d82Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(h72 h72Var) {
            this.w.g(h72Var);
            return sd5.a;
        }
    }

    public static final class FJCM extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ kj1<k72> w;
        public final /* synthetic */ ky2 x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FJCM(kj1<k72> kj1Var, ky2 ky2Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3, int i) {
            super(2);
            this.w = kj1Var;
            this.x = ky2Var;
            this.y = x81Var;
            this.z = x81Var2;
            this.A = x81Var3;
            this.B = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            x72.d(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ xv0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(xv0 xv0Var) {
            super(2);
            this.w = xv0Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                this.w.c.a.invoke(g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ xv0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(xv0 xv0Var) {
            super(2);
            this.w = xv0Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                this.w.b.a.invoke(g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class PRnFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ kj1<k72> w;
        public final /* synthetic */ ky2 x;
        public final /* synthetic */ ua0 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PRnFixed(kj1<k72> kj1Var, ky2 ky2Var, ua0 ua0Var) {
            super(2);
            this.w = kj1Var;
            this.x = ky2Var;
            this.y = ua0Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                int i = 0;
                for (Object obj : this.w.w) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ps0.j0();
                        throw null;
                    }
                    k72 k72Var = (k72) obj;
                    ky2 ky2Var = this.x;
                    yz4.a(ky2Var.f() == i, new z72(this.y, ky2Var, i), null, false, null, 0L, 0L, X.m(g30Var2, 438518901, new a82(k72Var)), g30Var2, 12582912, 124);
                    i = i2;
                }
                e40.CQf cQf2 = e40.a;
            }
            return sd5.a;
        }
    }

    @if0(c = "com.azefsw.audioconnect.main.ui.MainViewKt$CollectTabChangesEffect$1", f = "MainView.kt", l = {99}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ x81<Integer, z80<? super sd5>, Object> B;
        public final /* synthetic */ ky2 C;

        /* JADX INFO: renamed from: x72$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0221QnHx extends cx1 implements h81<Integer> {
            public final /* synthetic */ ky2 w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0221QnHx(ky2 ky2Var) {
                super(0);
                this.w = ky2Var;
            }

            @Override // defpackage.h81
            public final Integer invoke() {
                return Integer.valueOf(this.w.f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(x81<? super Integer, ? super z80<? super sd5>, ? extends Object> x81Var, ky2 ky2Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = x81Var;
            this.C = ky2Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                d24 d24VarH0 = ps0.h0(new C0221QnHx(this.C));
                this.A = 1;
                if (kd.e(d24VarH0, this.B, this) == va0Var) {
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
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "com.azefsw.audioconnect.main.ui.MainViewKt$MainView$6$1$1", f = "MainView.kt", l = {}, m = "invokeSuspend")
    public static final class T23 extends px4 implements x81<Integer, z80<? super sd5>, Object> {
        public /* synthetic */ int A;
        public final /* synthetic */ j81<h72, sd5> B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public T23(j81<? super h72, sd5> j81Var, z80<? super T23> z80Var) {
            super(2, z80Var);
            this.B = j81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            T23 t23 = new T23(this.B, z80Var);
            t23.A = ((Number) obj).intValue();
            return t23;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            this.B.invoke(new h72.F1(this.A));
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(Integer num, z80<? super sd5> z80Var) {
            return ((T23) a(Integer.valueOf(num.intValue()), z80Var)).i(sd5.a);
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ xv0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(xv0 xv0Var) {
            super(2);
            this.w = xv0Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                this.w.d.a.invoke(g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ p72 w;
        public final /* synthetic */ xv0 x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(p72 p72Var, xv0 xv0Var, int i) {
            super(2);
            this.w = p72Var;
            this.x = xv0Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            x72.c(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ i72 w;
        public final /* synthetic */ j81<h72, sd5> x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public byN(i72 i72Var, j81<? super h72, sd5> j81Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3, int i) {
            super(2);
            this.w = i72Var;
            this.x = j81Var;
            this.y = x81Var;
            this.z = x81Var2;
            this.A = x81Var3;
            this.B = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            x72.b(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1);
            return sd5.a;
        }
    }

    public static final class y extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ kj1<k72> w;
        public final /* synthetic */ ky2 x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(kj1<k72> kj1Var, ky2 ky2Var, int i) {
            super(2);
            this.w = kj1Var;
            this.x = ky2Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            x72.e(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(ky2 ky2Var, x81<? super Integer, ? super z80<? super sd5>, ? extends Object> x81Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(922653334);
        e40.CQf cQf = e40.a;
        wq0.d(ky2Var, new QnHx(x81Var, ky2Var, null), j30VarQ);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(ky2Var, x81Var, i);
    }

    public static final void b(i72 i72Var, j81<? super h72, sd5> j81Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3, g30 g30Var, int i) {
        int i2;
        boolean z;
        j30 j30VarQ = g30Var.q(-1787852978);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(i72Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(x81Var2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.I(x81Var3) ? 16384 : 8192;
        }
        if ((46811 & i2) == 9362 && j30VarQ.t()) {
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
            p72 p72Var = i72Var.a;
            if (p72Var != null) {
                ky2 ky2VarH = eu.h(p72Var.w, j30VarQ, 0);
                j30VarQ.e(1157296644);
                boolean zI = j30VarQ.I(j81Var);
                Object objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new T23(j81Var, null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                a(ky2VarH, (x81) objB0, j30VarQ, 64);
                e(i72Var.b, ky2VarH, j30VarQ, 0);
                z = false;
                d(i72Var.b, ky2VarH, x81Var, x81Var2, x81Var3, j30VarQ, (i2 & 57344) | (i2 & 896) | (i2 & 7168));
            } else {
                z = false;
            }
            O.g(j30VarQ, z, z, true, z);
            j30VarQ.R(z);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new byN(i72Var, j81Var, x81Var, x81Var2, x81Var3, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(p72 p72Var, xv0 xv0Var, g30 g30Var, int i) {
        int i2;
        Object obj;
        j30 j30VarQ = g30Var.q(1665741768);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(p72Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(xv0Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(773886317);
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(p72Var);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new b82(p72Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            h81 h81Var = (h81) objB0;
            c82 c82Var = c82.w;
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(h81Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(c82Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI2 = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                obj = objB1;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(d82.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            d82 d82Var = (d82) ((ZUx) obj);
            j30VarQ.R(false);
            i72 i72Var = (i72) ps0.t(d82Var.f(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI3 = j30VarQ.I(d82Var);
            Object objB2 = j30VarQ.b0();
            if (zI3 || objB2 == c0132QnHx) {
                objB2 = new F1(d82Var);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            b(i72Var, (j81) objB2, X.m(j30VarQ, -256881445, new LPt8Fixed(xv0Var)), X.m(j30VarQ, 216637498, new NUlFixed(xv0Var)), X.m(j30VarQ, 690156441, new YKK(xv0Var)), j30VarQ, 28032);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new auxFixed(p72Var, xv0Var, i);
    }

    public static final void d(kj1<k72> kj1Var, ky2 ky2Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1305377351);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(kj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(ky2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(x81Var2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.I(x81Var3) ? 16384 : 8192;
        }
        if ((46811 & i2) == 9362 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            dy2.a(kj1Var.size(), null, ky2Var, false, 0.0f, null, One.QnHx.j, null, null, false, X.m(j30VarQ, -1043003564, new EQ(x81Var, i2, x81Var2, x81Var3)), j30VarQ, ((i2 << 3) & 896) | 1572864, 6, 954);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new FJCM(kj1Var, ky2Var, x81Var, x81Var2, x81Var3, i);
    }

    public static final void e(kj1<k72> kj1Var, ky2 ky2Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1178750946);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(kj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(ky2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(773894976);
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            if (objB0 == g30.QnHx.a) {
                s40 s40Var = new s40(wq0.i(j30VarQ));
                j30VarQ.F0(s40Var);
                objB0 = s40Var;
            }
            j30VarQ.R(false);
            ua0 ua0Var = ((s40) objB0).w;
            j30VarQ.R(false);
            e05.a(ky2Var.f(), null, ((rv) j30VarQ.E(sv.a)).k(), 0L, null, null, X.m(j30VarQ, 1464980406, new PRnFixed(kj1Var, ky2Var, ua0Var)), j30VarQ, 1572864, 58);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new y(kj1Var, ky2Var, i);
    }
}
