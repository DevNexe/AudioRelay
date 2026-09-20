package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xk implements xp1 {

    public static final class QnHx {
        public static final xp3 a(xp3 xp3Var) {
            if ((xp3Var == null ? null : xp3Var.C) == null) {
                return xp3Var;
            }
            xp3Var.getClass();
            xp3.QnHx qnHx = new xp3.QnHx(xp3Var);
            qnHx.g = null;
            return qnHx.a();
        }

        public static boolean b(String str) {
            return (iv4.r("Connection", str) || iv4.r("Keep-Alive", str) || iv4.r("Proxy-Authenticate", str) || iv4.r("Proxy-Authorization", str) || iv4.r("TE", str) || iv4.r("Trailers", str) || iv4.r("Transfer-Encoding", str) || iv4.r("Upgrade", str)) ? false : true;
        }
    }

    static {
        new QnHx();
    }

    @Override // defpackage.xp1
    public final xp3 a(kj3 kj3Var) {
        nc1 nc1Var;
        System.currentTimeMillis();
        cp3 cp3Var = kj3Var.e;
        yk ykVar = new yk(cp3Var, null);
        if (cp3Var != null) {
            tk tkVarB = cp3Var.f;
            if (tkVarB == null) {
                int i = tk.n;
                tkVarB = tk.CQf.b(cp3Var.c);
                cp3Var.f = tkVarB;
            }
            if (tkVarB.j) {
                ykVar = new yk(null, null);
            }
        }
        bj3 bj3Var = kj3Var.a;
        if (!(bj3Var instanceof bj3)) {
            bj3Var = null;
        }
        fu0 fu0Var = bj3Var == null ? null : bj3Var.A;
        if (fu0Var == null) {
            fu0Var = fu0.a;
        }
        cp3 cp3Var2 = ykVar.a;
        xp3 xp3Var = ykVar.b;
        if (cp3Var2 == null && xp3Var == null) {
            xp3.QnHx qnHx = new xp3.QnHx();
            qnHx.a = cp3Var;
            qnHx.b = kg3.HTTP_1_1;
            qnHx.c = 504;
            qnHx.d = "Unsatisfiable Request (only-if-cached)";
            qnHx.g = qf5.c;
            qnHx.k = -1L;
            qnHx.l = System.currentTimeMillis();
            xp3 xp3VarA = qnHx.a();
            fu0Var.getClass();
            return xp3VarA;
        }
        if (cp3Var2 == null) {
            xp3.QnHx qnHx2 = new xp3.QnHx(xp3Var);
            xp3 xp3VarA2 = QnHx.a(xp3Var);
            xp3.QnHx.b("cacheResponse", xp3VarA2);
            qnHx2.i = xp3VarA2;
            xp3 xp3VarA3 = qnHx2.a();
            fu0Var.getClass();
            return xp3VarA3;
        }
        if (xp3Var != null) {
            fu0Var.getClass();
        }
        xp3 xp3VarB = kj3Var.b(cp3Var2);
        if (xp3Var != null) {
            if (xp3VarB.z == 304) {
                xp3.QnHx qnHx3 = new xp3.QnHx(xp3Var);
                nc1.QnHx qnHx4 = new nc1.QnHx();
                nc1 nc1Var2 = xp3Var.B;
                int length = nc1Var2.w.length / 2;
                int i2 = 0;
                while (true) {
                    nc1Var = xp3VarB.B;
                    if (i2 >= length) {
                        break;
                    }
                    int i3 = i2 + 1;
                    String strB = nc1Var2.b(i2);
                    String strE = nc1Var2.e(i2);
                    if (!iv4.r("Warning", strB) || !iv4.x(strE, "1", false)) {
                        if ((iv4.r("Content-Length", strB) || iv4.r("Content-Encoding", strB) || iv4.r("Content-Type", strB)) || !QnHx.b(strB) || nc1Var.a(strB) == null) {
                            qnHx4.a(strB, strE);
                        }
                    }
                    i2 = i3;
                }
                int length2 = nc1Var.w.length / 2;
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = i4 + 1;
                    String strB2 = nc1Var.b(i4);
                    if (!(iv4.r("Content-Length", strB2) || iv4.r("Content-Encoding", strB2) || iv4.r("Content-Type", strB2)) && QnHx.b(strB2)) {
                        qnHx4.a(strB2, nc1Var.e(i4));
                    }
                    i4 = i5;
                }
                qnHx3.f = qnHx4.b().c();
                qnHx3.k = xp3VarB.G;
                qnHx3.l = xp3VarB.H;
                xp3 xp3VarA4 = QnHx.a(xp3Var);
                xp3.QnHx.b("cacheResponse", xp3VarA4);
                qnHx3.i = xp3VarA4;
                xp3 xp3VarA5 = QnHx.a(xp3VarB);
                xp3.QnHx.b("networkResponse", xp3VarA5);
                qnHx3.h = xp3VarA5;
                qnHx3.a();
                xp3VarB.C.close();
                throw null;
            }
            zp3 zp3Var = xp3Var.C;
            if (zp3Var != null) {
                qf5.d(zp3Var);
            }
        }
        xp3.QnHx qnHx5 = new xp3.QnHx(xp3VarB);
        xp3 xp3VarA6 = QnHx.a(xp3Var);
        xp3.QnHx.b("cacheResponse", xp3VarA6);
        qnHx5.i = xp3VarA6;
        xp3 xp3VarA7 = QnHx.a(xp3VarB);
        xp3.QnHx.b("networkResponse", xp3VarA7);
        qnHx5.h = xp3VarA7;
        return qnHx5.a();
    }
}
