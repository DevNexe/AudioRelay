package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class kk3 implements yl {
    public final /* synthetic */ jk3 a;
    public final /* synthetic */ cp3 b;

    public kk3(jk3 jk3Var, cp3 cp3Var) {
        this.a = jk3Var;
        this.b = cp3Var;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0117 A[PHI: r17 r18
  0x0117: PHI (r17v7 java.lang.Integer) = (r17v5 java.lang.Integer), (r17v5 java.lang.Integer), (r17v8 java.lang.Integer) binds: [B:58:0x0107, B:55:0x00fe, B:37:0x00cf] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r18v8 java.lang.Integer) = (r18v5 java.lang.Integer), (r18v6 java.lang.Integer), (r18v5 java.lang.Integer) binds: [B:58:0x0107, B:55:0x00fe, B:37:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.yl
    public final void a(bj3 bj3Var, xp3 xp3Var) throws NoSuchAlgorithmException {
        String strX;
        av0 av0Var = xp3Var.I;
        int i = 1;
        try {
            this.a.i(xp3Var, av0Var);
            bj3 bj3Var2 = av0Var.a;
            if (!(!bj3Var2.G)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            bj3Var2.G = true;
            bj3Var2.B.j();
            ej3 ej3VarF = av0Var.d.f();
            Socket socket = ej3VarF.d;
            aj3 aj3Var = ej3VarF.h;
            zi3 zi3Var = ej3VarF.i;
            int i2 = 0;
            socket.setSoTimeout(0);
            ej3VarF.k();
            hj3 hj3Var = new hj3(aj3Var, zi3Var, av0Var);
            nc1 nc1Var = xp3Var.B;
            int length = nc1Var.w.length / 2;
            nc1 nc1Var2 = nc1Var;
            int i3 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            Integer num = null;
            Integer num2 = null;
            boolean z4 = false;
            while (i3 < length) {
                int i4 = i3 + 1;
                if (iv4.r(nc1Var2.b(i3), "Sec-WebSocket-Extensions")) {
                    String strE = nc1Var2.e(i3);
                    int i5 = 0;
                    while (i5 < strE.length()) {
                        int iH = qf5.h(strE, ',', i5, i2, 4);
                        char c = ';';
                        int iF = qf5.f(';', i5, iH, strE);
                        String strX2 = qf5.x(i5, iF, strE);
                        int i6 = iF + i;
                        if (iv4.r(strX2, "permessage-deflate")) {
                            if (z) {
                                z4 = true;
                            }
                            while (i6 < iH) {
                                int iF2 = qf5.f(c, i6, iH, strE);
                                int iF3 = qf5.f('=', i6, iF2, strE);
                                String strX3 = qf5.x(i6, iF3, strE);
                                if (iF3 < iF2) {
                                    strX = qf5.x(iF3 + 1, iF2, strE);
                                    if (strX.length() >= 2 && mv4.R(strX, "\"") && mv4.A(strX, "\"")) {
                                        strX = strX.substring(1, strX.length() - 1);
                                    }
                                } else {
                                    strX = null;
                                }
                                int i7 = iF2 + 1;
                                if (iv4.r(strX3, "client_max_window_bits")) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    Integer numO = strX == null ? null : hv4.o(strX);
                                    num = numO;
                                    if (numO == null) {
                                        z4 = true;
                                    }
                                } else if (iv4.r(strX3, "client_no_context_takeover")) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    z4 = strX != null ? true : z4;
                                    z2 = true;
                                } else if (iv4.r(strX3, "server_max_window_bits")) {
                                    if (num2 != null) {
                                        z4 = true;
                                    }
                                    Integer numO2 = strX == null ? null : hv4.o(strX);
                                    num2 = numO2;
                                    if (numO2 == null) {
                                        z4 = true;
                                    }
                                } else if (iv4.r(strX3, "server_no_context_takeover")) {
                                    if (z3) {
                                        z4 = true;
                                    }
                                    z4 = strX != null ? true : z4;
                                    z3 = true;
                                } else {
                                    z4 = true;
                                }
                                i6 = i7;
                                c = ';';
                            }
                            i5 = i6;
                            z = true;
                        } else {
                            i5 = i6;
                            z4 = true;
                        }
                        i = 1;
                        i2 = 0;
                    }
                    nc1Var2 = nc1Var;
                }
                i3 = i4;
                i = 1;
                i2 = 0;
            }
            this.a.d = new pl5(z, num, z2, num2, z3, z4);
            if (!(!z4 && num == null && (num2 == null || new pp1(8, 15).g(num2.intValue())))) {
                jk3 jk3Var = this.a;
                synchronized (jk3Var) {
                    jk3Var.o.clear();
                    jk3Var.e(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.a.k(qf5.f + " WebSocket " + this.b.a.f(), hj3Var);
                this.a.a.i(xp3Var);
                this.a.l();
            } catch (Exception e) {
                this.a.j(e, null);
            }
        } catch (IOException e2) {
            if (av0Var != null) {
                av0Var.a(true, true, null);
            }
            this.a.j(e2, xp3Var);
            qf5.d(xp3Var);
        }
    }

    @Override // defpackage.yl
    public final void b(IOException iOException) {
        this.a.j(iOException, null);
    }
}
