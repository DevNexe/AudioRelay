package defpackage;

import android.view.View;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class vQgK {

    public static final class CQf extends cx1 implements h81<sd5> {
        public final /* synthetic */ yk0 w;
        public final /* synthetic */ h81<sd5> x;
        public final /* synthetic */ wk0 y;
        public final /* synthetic */ jy1 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(yk0 yk0Var, h81<sd5> h81Var, wk0 wk0Var, jy1 jy1Var) {
            super(0);
            this.w = yk0Var;
            this.x = h81Var;
            this.y = wk0Var;
            this.z = jy1Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.b(this.x, this.y, this.z);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ wk0 x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(h81<sd5> h81Var, wk0 wk0Var, x81<? super g30, ? super Integer, sd5> x81Var, int i, int i2) {
            super(2);
            this.w = h81Var;
            this.x = wk0Var;
            this.y = x81Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            vQgK.a(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ is4<x81<g30, Integer, sd5>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(ri2 ri2Var) {
            super(2);
            this.w = ri2Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                vQgK.b(c94.a(pg2.QnHx.w, false, kuUV.w), X.m(g30Var2, -533674951, new ju(this.w)), g30Var2, 48, 0);
            }
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements h81<UUID> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class QnHx extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ yk0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(yk0 yk0Var) {
            super(1);
            this.w = yk0Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            yk0 yk0Var = this.w;
            yk0Var.show();
            return new snd(yk0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    public static final void a(h81<sd5> h81Var, wk0 wk0Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i, int i2) {
        int i3;
        wk0 wk0Var2;
        wk0 wk0Var3;
        wk0 wk0Var4;
        wk0 wk0Var5;
        j30 j30VarQ = g30Var.q(-2032877254);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                wk0Var2 = wk0Var;
                int i4 = j30VarQ.I(wk0Var2) ? 32 : 16;
                i3 |= i4;
            } else {
                wk0Var2 = wk0Var;
            }
            i3 |= i4;
        } else {
            wk0Var2 = wk0Var;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= j30VarQ.I(x81Var) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
            wk0Var5 = wk0Var2;
        } else {
            j30VarQ.t0();
            if ((i & 1) != 0 && !j30VarQ.Y()) {
                j30VarQ.x();
                if ((i2 & 2) != 0) {
                    wk0Var3 = wk0Var2;
                    wk0Var4 = wk0Var3;
                } else {
                    wk0Var4 = wk0Var2;
                }
            } else if ((i2 & 2) != 0) {
                wk0Var3 = new wk0(0);
                wk0Var4 = wk0Var3;
            } else {
                wk0Var4 = wk0Var2;
            }
            j30VarQ.S();
            View view = (View) j30VarQ.E(Ll.f);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            l40 l40VarR0 = fp1.r0(j30VarQ);
            ri2 ri2VarF0 = ps0.f0(x81Var, j30VarQ);
            UUID uuid = (UUID) g7.f(new Object[0], null, null, NUlFixed.w, j30VarQ, 6);
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(view) | j30VarQ.I(ij0Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                yk0 yk0Var = new yk0(h81Var, wk0Var4, view, jy1Var, ij0Var, uuid);
                sz szVarN = X.n(488261145, new LPt8Fixed(ri2VarF0), true);
                uk0 uk0Var = yk0Var.z;
                uk0Var.setParentCompositionContext(l40VarR0);
                uk0Var.E.setValue(szVarN);
                uk0Var.G = true;
                uk0Var.c();
                j30VarQ.F0(yk0Var);
                objB0 = yk0Var;
            }
            j30VarQ.R(false);
            yk0 yk0Var2 = (yk0) objB0;
            wq0.a(yk0Var2, new QnHx(yk0Var2), j30VarQ);
            wq0.h(new CQf(yk0Var2, h81Var, wk0Var4, jy1Var), j30VarQ);
            wk0Var5 = wk0Var4;
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(h81Var, wk0Var5, x81Var, i, i2);
    }

    public static final void b(pg2 pg2Var, x81 x81Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(-1177876616);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(x81Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            FV0w fV0w = FV0w.a;
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2Var);
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
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
            hH.u(j30VarQ, fV0w, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, Integer.valueOf((i5 >> 3) & 112));
            j30VarQ.e(2058660585);
            fc2.b((i5 >> 9) & 14, x81Var, j30VarQ, false, true, false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new peo(pg2Var, x81Var, i, i2);
    }
}
