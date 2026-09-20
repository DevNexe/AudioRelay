package defpackage;

import java.io.IOException;
import okhttp3.internal.connection.RouteException;

/* JADX INFO: loaded from: classes3.dex */
public final class q50 implements xp1 {
    public static final q50 a = new q50();

    @Override // defpackage.xp1
    public final xp3 a(kj3 kj3Var) throws IOException {
        bj3 bj3Var = kj3Var.a;
        synchronized (bj3Var) {
            if (!bj3Var.K) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!bj3Var.J)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!bj3Var.I)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            sd5 sd5Var = sd5.a;
        }
        cv0 cv0Var = bj3Var.E;
        rt2 rt2Var = bj3Var.w;
        try {
            av0 av0Var = new av0(bj3Var, bj3Var.A, cv0Var, cv0Var.a(kj3Var.f, kj3Var.g, kj3Var.h, rt2Var.W, rt2Var.B, !ur1.a(kj3Var.e.b, "GET")).j(rt2Var, kj3Var));
            bj3Var.H = av0Var;
            bj3Var.M = av0Var;
            synchronized (bj3Var) {
                bj3Var.I = true;
                bj3Var.J = true;
            }
            if (bj3Var.L) {
                throw new IOException("Canceled");
            }
            return kj3.a(kj3Var, 0, av0Var, null, 61).b(kj3Var.e);
        } catch (IOException e) {
            cv0Var.b(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            cv0Var.b(e2.x);
            throw e2;
        }
    }
}
