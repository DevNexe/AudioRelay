package defpackage;

import com.azefsw.audioconnect.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fh {
    public static final List<ng2> a = ps0.M(new ng2(mg.Low, R.string.buffer_size_low_title, R.string.buffer_size_low_description, false), new ng2(mg.Medium, R.string.buffer_size_medium_title, R.string.buffer_size_medium_description, false), new ng2(mg.High, R.string.buffer_size_high_title, R.string.buffer_size_high_description, false), new ng2(mg.Custom, R.string.buffer_size_custom_title, R.string.buffer_size_custom_description, true));

    public static final class CQf extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ ad0 A;
        public final /* synthetic */ ug w;
        public final /* synthetic */ Boolean x;
        public final /* synthetic */ j81<sg, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(ug ugVar, Boolean bool, j81<? super sg, sd5> j81Var, int i, ad0 ad0Var) {
            super(3);
            this.w = ugVar;
            this.x = bool;
            this.y = j81Var;
            this.z = i;
            this.A = ad0Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            j81<sg, sd5> j81Var;
            ug ugVar;
            Boolean bool;
            wv wvVar2 = wvVar;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(wvVar2) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                g30Var2.e(1707102575);
                Iterator<T> it = fh.a.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    j81Var = this.y;
                    ugVar = this.w;
                    bool = this.x;
                    if (!zHasNext) {
                        break;
                    }
                    ng2 ng2Var = (ng2) it.next();
                    String strX = hH.x(ng2Var.b, g30Var2);
                    String strX2 = hH.x(ng2Var.c, g30Var2);
                    boolean z = ng2Var.d && !bool.booleanValue();
                    boolean z2 = !ugVar.b;
                    bd3 bd3Var = bd3.Full;
                    Boolean boolValueOf = Boolean.valueOf(ng2Var.a == ugVar.a);
                    g30Var2.e(511388516);
                    boolean zI = g30Var2.I(ng2Var) | g30Var2.I(j81Var);
                    Object objF = g30Var2.f();
                    if (zI || objF == g30.QnHx.a) {
                        objF = new gh(ng2Var, j81Var);
                        g30Var2.B(objF);
                    }
                    g30Var2.G();
                    xh3.b(strX, boolValueOf, strX2, null, z, bd3Var, z2, (h81) objF, g30Var2, 196608, 8);
                }
                g30Var2.G();
                CO.b(wvVar2, ugVar.a == mg.Custom, null, null, null, null, X.m(g30Var2, 1640266543, new lh(this.z, this.A, bool, j81Var)), g30Var2, (i & 14) | 1572864, 30);
                e40.CQf cQf2 = e40.a;
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ug w;
        public final /* synthetic */ j81<sg, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(ug ugVar, j81<? super sg, sd5> j81Var, int i) {
            super(2);
            this.w = ugVar;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            fh.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<sg, sd5> {
        public final /* synthetic */ uh w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(uh uhVar) {
            super(1);
            this.w = uhVar;
        }

        @Override // defpackage.j81
        public final sd5 invoke(sg sgVar) {
            this.w.g(sgVar);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            fh.b(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ug w;
        public final /* synthetic */ j81<sg, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(ug ugVar, j81<? super sg, sd5> j81Var, int i) {
            super(2);
            this.w = ugVar;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            fh.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ j81<sg, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public T23(boolean z, j81<? super sg, sd5> j81Var, int i) {
            super(2);
            this.w = z;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            fh.c(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<sg, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public YKK(j81<? super sg, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            a62.a.e("clicked_reset");
            this.w.invoke(sg.F1.a);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<sg, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(j81<? super sg, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            a62.a.e("clicked_edit");
            this.w.invoke(sg.LPt8Fixed.a);
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ad0 w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public byN(ad0 ad0Var, int i) {
            super(2);
            this.w = ad0Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            fh.d(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(ug ugVar, j81<? super sg, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        ad0 ad0Var;
        j30 j30Var;
        j30 j30VarQ = g30Var.q(472452832);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(ugVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
            j30Var = j30VarQ;
        } else {
            e40.CQf cQf = e40.a;
            Boolean bool = ugVar.c;
            if (bool == null || (ad0Var = ugVar.d) == null) {
                tk3 tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new QnHx(ugVar, j81Var, i);
                return;
            }
            pg2.QnHx qnHx = pg2.QnHx.w;
            pg2 pg2VarX = ob.x(qnHx, ob.w(0, j30VarQ, 1));
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarX);
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
            j30Var = j30VarQ;
            a_.b(ps0.T(qnHx, 16), 0L, 0, null, 0.0f, X.m(j30VarQ, 635379463, new CQf(ugVar, bool, j81Var, i3, ad0Var)), j30Var, 196998, 26);
            O.g(j30Var, false, false, true, false);
            j30Var.R(false);
        }
        tk3 tk3VarU2 = j30Var.U();
        if (tk3VarU2 == null) {
            return;
        }
        tk3VarU2.d = new F1(ugVar, j81Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(1288230801);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-107372533);
            bm2 bm2Var = (bm2) j30VarQ.E(u42.a);
            ph phVar = ph.w;
            sh shVar = new sh(bm2Var);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(phVar, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(shVar, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(uh.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            uh uhVar = (uh) ((ZUx) obj);
            j30VarQ.R(false);
            ug ugVar = (ug) ps0.t(uhVar.f(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(uhVar);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new LPt8Fixed(uhVar);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            a(ugVar, (j81) objB1, j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(i);
    }

    public static final void c(boolean z, j81<? super sg, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-137110738);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(693286680);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, j30VarQ);
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
            xu3 xu3Var = xu3.a;
            pg2 pg2VarA = xu3Var.a(qnHx, 1.0f, true);
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new YKK(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            int i3 = ((i2 << 6) & 896) | 805306368;
            si.c((h81) objB0, pg2VarA, z, null, l00.c, j30VarQ, i3, 504);
            hH.i(gm4.k(qnHx, 16), j30VarQ, 6);
            pg2 pg2VarA2 = xu3Var.a(qnHx, 1.0f, true);
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(j81Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new auxFixed(j81Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            si.b((h81) objB1, pg2VarA2, z, l00.d, j30VarQ, i3, 504);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new T23(z, j81Var, i);
    }

    public static final void d(ad0 ad0Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(71414383);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(ad0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            q70.a(l00.a, j30VarQ, 6);
            String strValueOf = String.valueOf(ad0Var.a);
            jt4 jt4Var = sc5.a;
            w55 w55Var = ((rc5) j30VarQ.E(jt4Var)).j;
            x41 x41Var = x41.B;
            j55.b(strValueOf, null, 0L, 0L, null, x41Var, null, 0L, null, null, 0L, 0, false, 0, null, w55Var, j30VarQ, 196608, 0, 32734);
            float f = 8;
            wo1.QnHx qnHx = wo1.a;
            hH.i(new lm4(0.0f, f, 0.0f, f, 5), j30VarQ, 6);
            q70.a(l00.b, j30VarQ, 6);
            j55.b(String.valueOf(ad0Var.b), null, 0L, 0L, null, x41Var, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(jt4Var)).j, j30VarQ, 196608, 0, 32734);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new byN(ad0Var, i);
    }

    public static final void e(ad0 ad0Var, boolean z, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1437365343);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(ad0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.c(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            float f = 16;
            wo1.QnHx qnHx = wo1.a;
            zx2 zx2Var = new zx2(f, f, f, f);
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(zx2Var);
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
            d(ad0Var, j30VarQ, (i3 & 14) | 0);
            float f2 = 8;
            hH.i(new lm4(0.0f, f2, 0.0f, f2, 5), j30VarQ, 6);
            int i4 = i3 >> 3;
            c(z, j81Var, j30VarQ, (i4 & 112) | (i4 & 14));
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new mh(ad0Var, z, j81Var, i);
    }

    public static final void f(j81 j81Var, x81 x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30Var;
        j81 j81Var2 = j81Var;
        j30 j30VarQ = g30Var.q(-1713481592);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(j81Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
            j30Var = j30VarQ;
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(733328855);
            pg2.QnHx qnHx = pg2.QnHx.w;
            da daVar = One.QnHx.a;
            rb2 rb2VarC = fe.c(daVar, false, j30VarQ);
            j30VarQ.e(-1323940314);
            jt4 jt4Var = r40.e;
            ij0 ij0Var = (ij0) j30VarQ.E(jt4Var);
            jt4 jt4Var2 = r40.k;
            jy1 jy1Var = (jy1) j30VarQ.E(jt4Var2);
            jt4 jt4Var3 = r40.o;
            ti5 ti5Var = (ti5) j30VarQ.E(jt4Var3);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx);
            jE<?> jEVar = j30VarQ.a;
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
            a30.QnHx.F1 f1 = a30.QnHx.e;
            hH.u(j30VarQ, rb2VarC, f1);
            a30.QnHx.C0012QnHx c0012QnHx = a30.QnHx.d;
            hH.u(j30VarQ, ij0Var, c0012QnHx);
            a30.QnHx.CQf cQf2 = a30.QnHx.f;
            hH.u(j30VarQ, jy1Var, cQf2);
            a30.QnHx.NUlFixed nUl = a30.QnHx.g;
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -2137368960);
            pg2 pg2VarK = hH.k(qnHx, 0.6f);
            j30VarQ.e(733328855);
            rb2 rb2VarC2 = fe.c(daVar, false, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var2 = (ij0) j30VarQ.E(jt4Var);
            jy1 jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
            ti5 ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
            sz szVarJ2 = S12N.j(pg2VarK);
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
            Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarC2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf2, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -2137368960);
            j30Var = j30VarQ;
            fc2.b((i2 >> 3) & 14, x81Var, j30VarQ, false, false, true);
            j30Var.R(false);
            j30Var.R(false);
            da daVar2 = One.QnHx.e;
            wo1.QnHx qnHx3 = wo1.a;
            ee eeVar = new ee(daVar2, false);
            j30Var.e(1157296644);
            j81Var2 = j81Var;
            boolean zI = j30Var.I(j81Var2);
            Object objB0 = j30Var.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new C1639nh(j81Var2);
                j30Var.F0(objB0);
            }
            j30Var.R(false);
            si.a((h81) objB0, eeVar, false, null, null, null, null, null, null, l00.e, j30Var, 805306368, 508);
            O.g(j30Var, false, false, true, false);
            j30Var.R(false);
        }
        tk3 tk3VarU = j30Var.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new oh(j81Var2, x81Var, i);
    }
}
