package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uc4 implements rc4 {
    public final bc4 a;
    public final ef4 b;
    public final nd4 c;
    public final h40 d = new h40();
    public df4 e = df4.QnHx.a;

    public static final class QnHx extends cx1 implements j81<Throwable, sd5> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            Throwable th2 = th;
            uc4 uc4Var = uc4.this;
            if (OW8.r(uc4Var.e)) {
                a62 a62Var = a62.a;
                a62Var.f("server_task_failed", new tc4(th2));
                a62Var.d(th2, false);
                a62Var.b("Server task failure", th2);
                df4.LPt8Fixed lPt8 = new df4.LPt8Fixed(new gf4.QnHx(th2));
                uc4Var.e = lPt8;
                uc4Var.b.a(lPt8);
                uc4Var.d.f();
            } else {
                a62 a62Var2 = a62.a;
                String message = th2.getMessage();
                if (message == null) {
                    message = "";
                }
                a62Var2.e(message);
            }
            return sd5.a;
        }
    }

    public uc4(bc4 bc4Var, ef4 ef4Var, nd4 nd4Var) {
        this.a = bc4Var;
        this.b = ef4Var;
        this.c = nd4Var;
    }

    @Override // defpackage.rc4
    public final void a(gf4 gf4Var) {
        synchronized (this) {
            a62 a62Var = a62.a;
            a62Var.c("Stopping the server, reason: " + gf4Var.a);
            if (!(this.e instanceof df4.CQf)) {
                a62Var.e("tried_to_stop_while_not_running");
                return;
            }
            df4.LPt8Fixed lPt8 = new df4.LPt8Fixed(gf4Var);
            this.e = lPt8;
            this.b.a(lPt8);
            this.d.f();
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.rc4
    public final void b(vb4 vb4Var) {
        synchronized (this) {
            if (!ur1.a(this.e, df4.QnHx.a)) {
                a62.a.e("tried_to_start_while_not_idle");
            } else {
                c(vb4Var);
                sd5 sd5Var = sd5.a;
            }
        }
    }

    public final void c(vb4 vb4Var) {
        a62.a.c("Starting the server...");
        df4.F1 f1 = new df4.F1(vb4Var);
        this.e = f1;
        this.b.a(f1);
        this.d.b(jw4.a(new ax(new ww(new sc4(0, this, vb4Var)), new ec2(1, vb4Var, this)), new QnHx()));
    }
}
