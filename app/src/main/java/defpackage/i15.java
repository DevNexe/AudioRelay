package defpackage;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class i15 implements Runnable {
    public final /* synthetic */ h15 w;

    public i15(h15 h15Var) {
        this.w = h15Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v05 v05VarC;
        long jA;
        while (true) {
            h15 h15Var = this.w;
            synchronized (h15Var) {
                v05VarC = h15Var.c();
            }
            if (v05VarC == null) {
                return;
            }
            g15 g15Var = v05VarC.c;
            h15 h15Var2 = this.w;
            h15.CQf cQf = h15.h;
            boolean zIsLoggable = h15.j.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jA = g15Var.a.a.a();
                AY.i(v05VarC, g15Var, "starting");
            } else {
                jA = -1;
            }
            try {
                h15.a(h15Var2, v05VarC);
                try {
                    sd5 sd5Var = sd5.a;
                    if (zIsLoggable) {
                        AY.i(v05VarC, g15Var, ur1.d(AY.w(g15Var.a.a.a() - jA), "finished run in "));
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        AY.i(v05VarC, g15Var, ur1.d(AY.w(g15Var.a.a.a() - jA), "failed a run in "));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                h15Var2.a.execute(this);
                throw th2;
            }
        }
    }
}
