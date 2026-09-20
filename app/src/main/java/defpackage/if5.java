package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class if5 implements hf5 {
    public final lKy3 a;
    public final B1Vy b;
    public final ss3 c;
    public final iq1 d;
    public boolean e;

    public if5(lKy3 lky3, B1Vy b1Vy, ss3 ss3Var, iq1 iq1Var) {
        this.a = lky3;
        this.b = b1Vy;
        this.c = ss3Var;
        this.d = iq1Var;
    }

    @Override // defpackage.hf5
    public final void a() {
        if (!(!this.e)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // defpackage.hf5
    public final void b() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            lKy3 lky3 = this.a;
            if (lky3.c(lky3.d(R.string.pref_analytics_key), true)) {
                B1Vy b1Vy = this.b;
                if (!b1Vy.c) {
                    nx0 nx0VarA = b1Vy.a.a();
                    ut0 ut0VarA = b1Vy.b.a();
                    v52 v52Var = ac.b;
                    v52Var.b = nx0VarA;
                    v52Var.c = ut0VarA;
                    b1Vy.c = true;
                }
            }
            c();
            this.d.initialize();
            this.e = true;
            sd5 sd5Var = sd5.a;
        }
    }

    public final void c() {
        ss3 ss3Var = this.c;
        ss3Var.getClass();
        int i = 1;
        db2 db2Var = new db2(new il4(new QE(ss3Var, i)), new n71(i));
        int i2 = 0;
        vk4<gq0> vk4VarT = ((fm3) ss3Var.x).t();
        rq1 rq1Var = new rq1(ss3Var, i);
        vk4VarT.getClass();
        vk4<gq0> vk4VarE = ((fm3) ss3Var.x).e();
        hm3 hm3Var = new hm3(ss3Var, i2);
        vk4VarE.getClass();
        qw.e(ps0.M(qw.e(ps0.M(new eb2(db2Var, new gm3(ss3Var, i2)), new hx(new bl4(vk4VarT, rq1Var)), new hx(new bl4(vk4VarE, hm3Var)), new gl4(new mr2(((lKy3) ss3Var.y).q()), new gm3(ss3Var, i)))), cx.w)).i(j54.b).g();
    }
}
