package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cf implements xp1 {
    public final f90 a;

    public cf(f90 f90Var) {
        this.a = f90Var;
    }

    @Override // defpackage.xp1
    public final xp3 a(kj3 kj3Var) {
        boolean z;
        zp3 zp3Var;
        cp3 cp3Var = kj3Var.e;
        cp3Var.getClass();
        cp3.QnHx qnHx = new cp3.QnHx(cp3Var);
        B8C b8c = cp3Var.d;
        if (b8c != null) {
            b8c.v0();
            long jU0 = b8c.u0();
            if (jU0 != -1) {
                qnHx.b("Content-Length", String.valueOf(jU0));
                qnHx.d("Transfer-Encoding");
            } else {
                qnHx.b("Transfer-Encoding", "chunked");
                qnHx.d("Content-Length");
            }
        }
        String strA = cp3Var.a("Host");
        int i = 0;
        ch1 ch1Var = cp3Var.a;
        if (strA == null) {
            qnHx.b("Host", qf5.u(ch1Var, false));
        }
        if (cp3Var.a("Connection") == null) {
            qnHx.b("Connection", "Keep-Alive");
        }
        if (cp3Var.a("Accept-Encoding") == null && cp3Var.a("Range") == null) {
            qnHx.b("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        f90 f90Var = this.a;
        f90Var.b();
        if (!true) {
            StringBuilder sb = new StringBuilder();
            as0 as0Var = as0.w;
            while (as0Var.hasNext()) {
                Object next = as0Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    ps0.j0();
                    throw null;
                }
                e90 e90Var = (e90) next;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(e90Var.a);
                sb.append('=');
                sb.append(e90Var.b);
                i = i2;
            }
            qnHx.b("Cookie", sb.toString());
        }
        if (cp3Var.a("User-Agent") == null) {
            qnHx.b("User-Agent", "okhttp/4.10.0");
        }
        xp3 xp3VarB = kj3Var.b(qnHx.a());
        nc1 nc1Var = xp3VarB.B;
        qf1.b(f90Var, ch1Var, nc1Var);
        xp3.QnHx qnHx2 = new xp3.QnHx(xp3VarB);
        qnHx2.a = cp3Var;
        if (z) {
            String strA2 = nc1Var.a("Content-Encoding");
            if (iv4.r("gzip", strA2 != null ? strA2 : null) && qf1.a(xp3VarB) && (zp3Var = xp3VarB.C) != null) {
                db1 db1Var = new db1(zp3Var.c());
                nc1.QnHx qnHxC = nc1Var.c();
                qnHxC.c("Content-Encoding");
                qnHxC.c("Content-Length");
                qnHx2.f = qnHxC.b().c();
                xp3.b(xp3VarB, "Content-Type");
                qnHx2.g = new rj3(-1L, new aj3(db1Var));
            }
        }
        return qnHx2.a();
    }
}
