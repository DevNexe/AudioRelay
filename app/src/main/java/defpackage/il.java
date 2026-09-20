package defpackage;

import av0.CQf;
import av0.QnHx;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
public final class il implements xp1 {
    public final boolean a;

    public il(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xp1
    public final xp3 a(kj3 kj3Var) throws Throwable {
        xp3.QnHx qnHxB;
        Long lValueOf;
        xp3 xp3VarA;
        String str;
        boolean z;
        av0 av0Var = kj3Var.d;
        bv0 bv0Var = av0Var.d;
        fu0 fu0Var = av0Var.b;
        cp3 cp3Var = kj3Var.e;
        B8C b8c = cp3Var.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            fu0Var.getClass();
            bv0Var.g(cp3Var);
            boolean zG = eu.g(cp3Var.b);
            boolean z2 = true;
            bj3 bj3Var = av0Var.a;
            bv0 bv0Var2 = av0Var.d;
            ej3 ej3Var = av0Var.f;
            if (!zG || b8c == null) {
                qnHxB = null;
                bj3Var.k(av0Var, true, false, null);
                lValueOf = null;
            } else {
                if (iv4.r("100-continue", cp3Var.a("Expect"))) {
                    try {
                        bv0Var2.h();
                        qnHxB = av0Var.b(true);
                        fu0Var.getClass();
                        z = false;
                    } catch (IOException e) {
                        fu0Var.getClass();
                        av0Var.c(e);
                        throw e;
                    }
                } else {
                    qnHxB = null;
                    z = true;
                }
                if (qnHxB == null) {
                    av0Var.e = false;
                    long jU0 = cp3Var.d.u0();
                    fu0Var.getClass();
                    zi3 zi3Var = new zi3(av0Var.new QnHx(bv0Var2.c(cp3Var, jU0), jU0));
                    b8c.S0(zi3Var);
                    zi3Var.close();
                } else {
                    bj3Var.k(av0Var, true, false, null);
                    if (!(ej3Var.g != null)) {
                        bv0Var2.f().k();
                    }
                }
                lValueOf = null;
                z2 = z;
            }
            try {
                bv0Var.b();
                if (qnHxB == null) {
                    qnHxB = av0Var.b(false);
                    if (z2) {
                        fu0Var.getClass();
                        z2 = false;
                    }
                }
                qnHxB.a = cp3Var;
                qnHxB.e = ej3Var.e;
                qnHxB.k = jCurrentTimeMillis;
                qnHxB.l = System.currentTimeMillis();
                xp3 xp3VarA2 = qnHxB.a();
                int i = xp3VarA2.z;
                if (i == 100) {
                    xp3.QnHx qnHxB2 = av0Var.b(false);
                    if (z2) {
                        fu0Var.getClass();
                    }
                    qnHxB2.a = cp3Var;
                    qnHxB2.e = ej3Var.e;
                    qnHxB2.k = jCurrentTimeMillis;
                    qnHxB2.l = System.currentTimeMillis();
                    xp3VarA2 = qnHxB2.a();
                    i = xp3VarA2.z;
                }
                if (this.a && i == 101) {
                    xp3.QnHx qnHx = new xp3.QnHx(xp3VarA2);
                    qnHx.g = qf5.c;
                    xp3VarA = qnHx.a();
                } else {
                    xp3.QnHx qnHx2 = new xp3.QnHx(xp3VarA2);
                    try {
                        xp3.b(xp3VarA2, "Content-Type");
                        long jD = bv0Var.d(xp3VarA2);
                        qnHx2.g = new rj3(jD, new aj3(av0Var.new CQf(bv0Var.a(xp3VarA2), jD)));
                        xp3VarA = qnHx2.a();
                    } catch (IOException e2) {
                        av0Var.c(e2);
                        throw e2;
                    }
                }
                if (iv4.r("close", xp3VarA.w.a("Connection"))) {
                    bv0Var2.f().k();
                } else {
                    String strA = xp3VarA.B.a("Connection");
                    if (strA == null) {
                        str = strA;
                        str = lValueOf;
                    }
                    str = strA;
                    if (iv4.r("close", str)) {
                        bv0Var2.f().k();
                    }
                }
                if (i == 204 || i == 205) {
                    zp3 zp3Var = xp3VarA.C;
                    if ((zp3Var == null ? -1L : zp3Var.b()) > 0) {
                        StringBuilder sbC = iZUl.c("HTTP ", i, " had non-zero Content-Length: ");
                        if (zp3Var != null) {
                            lValueOf = Long.valueOf(zp3Var.b());
                        }
                        sbC.append(lValueOf);
                        throw new ProtocolException(sbC.toString());
                    }
                }
                return xp3VarA;
            } catch (IOException e3) {
                av0Var.c(e3);
                throw e3;
            }
        } catch (IOException e4) {
            fu0Var.getClass();
            av0Var.c(e4);
            throw e4;
        }
    }
}
