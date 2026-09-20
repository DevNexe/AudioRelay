package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class rh0 implements b54 {
    public static final Logger f = Logger.getLogger(ya5.class.getName());
    public final xn5 a;
    public final Executor b;
    public final g5 c;
    public final mu0 d;
    public final qy4 e;

    public rh0(Executor executor, g5 g5Var, xn5 xn5Var, mu0 mu0Var, qy4 qy4Var) {
        this.b = executor;
        this.c = g5Var;
        this.a = xn5Var;
        this.d = mu0Var;
        this.e = qy4Var;
    }

    @Override // defpackage.b54
    public final void a(Z7O z7o, o3 o3Var, j4 j4Var) {
        this.b.execute(new oh0(this, j4Var, z7o, o3Var, 0));
    }
}
