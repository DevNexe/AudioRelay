package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class e95 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ou3 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ h81<sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(ou3 ou3Var, String str, h81<sd5> h81Var, int i) {
            super(2);
            this.w = ou3Var;
            this.x = str;
            this.y = h81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            String str = this.x;
            h81<sd5> h81Var = this.y;
            e95.a(this.w, str, h81Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<Boolean, g30, Integer, sd5> {
        public final /* synthetic */ ou3 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ h81<sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ou3 ou3Var, String str, h81<sd5> h81Var, int i) {
            super(3);
            this.w = ou3Var;
            this.x = str;
            this.y = h81Var;
            this.z = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(Boolean bool, g30 g30Var, Integer num) {
            boolean zBooleanValue = bool.booleanValue();
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.c(zBooleanValue) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                int i = this.z;
                h81<sd5> h81Var = this.y;
                if (zBooleanValue) {
                    g30Var2.e(-970946367);
                    ry4 ry4Var = ou3.d;
                    e95.c(this.w, this.x, h81Var, g30Var2, (i & 14) | 0 | (i & 112) | (i & 896));
                    g30Var2.G();
                } else {
                    g30Var2.e(-970946269);
                    e95.b(h81Var, g30Var2, (i >> 6) & 14);
                    g30Var2.G();
                }
            }
            return sd5.a;
        }
    }

    public static final void a(ou3 ou3Var, String str, h81<sd5> h81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-770075895);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(ou3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(h81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pc0.b(Boolean.valueOf(!(ou3Var instanceof ou3.auxFixed)), null, null, X.m(j30VarQ, 106640169, new QnHx(ou3Var, str, h81Var, i2)), j30VarQ, 3072, 6);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(ou3Var, str, h81Var, i);
    }

    public static final void b(h81 h81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1953186664);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(733328855);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
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
            hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
            kp8W.b(o20.b, qnHx, X.m(j30VarQ, 1537735144, new y85(h81Var, i2)), null, ((rv) j30VarQ.E(sv.a)).k(), 0L, 0.0f, j30VarQ, 438, 104);
            String strX = hH.x(R.string.ads_main_title, j30VarQ);
            da daVar = One.QnHx.e;
            wo1.QnHx qnHx3 = wo1.a;
            j55.b(strX, new ee(daVar, false), 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).i, j30VarQ, 196608, 0, 32732);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new z85(h81Var, i);
    }

    public static final void c(ou3 ou3Var, String str, h81 h81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1147955234);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(ou3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(h81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            if (objB0 == g30.QnHx.a) {
                objB0 = X.n(1708538813, new d95(h81Var, i2), true);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            x81 x81Var = (x81) objB0;
            ry4 ry4Var = ou3.d;
            String strA = ou3Var.a(j30VarQ);
            if (strA != null) {
                if (!ou3Var.c) {
                    x81Var = null;
                }
                kp8W.b(X.m(j30VarQ, -1839226558, new b95(strA, str, i2)), null, x81Var, null, 0L, 0L, 0, j30VarQ, 1572870, 58);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new c95(ou3Var, str, h81Var, i);
    }
}
