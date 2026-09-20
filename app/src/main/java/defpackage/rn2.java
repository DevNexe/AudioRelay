package defpackage;

import com.facebook.ads.AdError;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class rn2 implements ln2 {
    public final xn2 a;
    public final zb4 b;
    public final wn2 c;
    public final nn2 d;
    public final X1GO e;
    public final ry4 f = new ry4(qn2.w);
    public final ry4 g = new ry4(pn2.w);
    public vr0 h;
    public vn2 i;
    public e61 j;

    public static final class QnHx extends cx1 implements j81<n52, sd5> {
        public final /* synthetic */ zt4 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(zt4 zt4Var) {
            super(1);
            this.w = zt4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(n52 n52Var) {
            n52Var.b("reason", this.w.a);
            return sd5.a;
        }
    }

    public rn2(xn2 xn2Var, zb4 zb4Var, nj3 nj3Var, nn2 nn2Var, X1GO x1go) {
        this.a = xn2Var;
        this.b = zb4Var;
        this.c = nj3Var;
        this.d = nn2Var;
        this.e = x1go;
    }

    @Override // defpackage.ln2
    public final void a(String str) {
        boolean zA;
        mn2 mn2VarA = this.d.a(str);
        synchronized (this) {
            xn2 xn2Var = this.a;
            synchronized (xn2Var) {
                zA = ur1.a(xn2Var.b, y73.CQf.b);
            }
            if (zA) {
                this.h = h(mn2VarA);
                sd5 sd5Var = sd5.a;
            } else {
                a62 a62Var = a62.a;
                a62.a.g("called_start_when_not_idle", null);
            }
        }
    }

    @Override // defpackage.ln2
    public final void b(zt4 zt4Var) {
        synchronized (this) {
            a62.a.c("Stopping the player, reason: " + zt4Var.a);
            if (this.a.a()) {
                a62.a.g("called_close_when_idle_or_stopping", null);
            } else {
                i(zt4Var);
                sd5 sd5Var = sd5.a;
            }
        }
    }

    @Override // defpackage.ln2
    public final ds2 c(c54 c54Var) {
        return ((tl3) this.f.getValue()).u(c54Var);
    }

    @Override // defpackage.ln2
    public final ds2 d(c54 c54Var) {
        return ((tl3) this.g.getValue()).u(c54Var);
    }

    @Override // defpackage.ln2
    public final void e(zt4 zt4Var, String str) {
        boolean zA;
        synchronized (this) {
            if (this.a.a()) {
                a62 a62Var = a62.a;
                a62.a.g("called_restart_when_idle_or_stopping", null);
                return;
            }
            b(zt4Var);
            gq0.QnHx qnHx = gq0.x;
            long jG = gq0.g(ps0.o0(4, kq0.SECONDS)) / 100;
            long j = 0;
            if (0 <= jG) {
                while (true) {
                    xn2 xn2Var = this.a;
                    synchronized (xn2Var) {
                        zA = ur1.a(xn2Var.b, y73.CQf.b);
                    }
                    if (zA) {
                        a(str);
                        a62 a62Var2 = a62.a;
                        a62.a.g("successfully_restarted", null);
                        return;
                    } else {
                        try {
                            Thread.sleep(100L);
                            if (j == jG) {
                                break;
                            } else {
                                j++;
                            }
                        } catch (InterruptedException unused) {
                            a62 a62Var3 = a62.a;
                            a62.a.g("thread_interrupted_during_restart", null);
                        }
                    }
                }
            }
            a62 a62Var4 = a62.a;
            a62.a.g("failed_to_restart", null);
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.c83
    public final ds2 f(c54 c54Var) {
        return ((w9) this.a.e.getValue()).u(c54Var);
    }

    @Override // defpackage.ln2
    public final ds2 g(c54 c54Var) {
        return this.b.b(c54Var);
    }

    public final vr0 h(mn2 mn2Var) {
        final int i;
        Object qnHx;
        n52 n52Var;
        a62.a.c("Remotely connecting to " + mn2Var.b.a + "...");
        try {
            this.e.b.f("last_server_address", mn2Var.b.a);
        } catch (Throwable th) {
            a62.a.b("Failed to save address", th);
        }
        e61 e61Var = new e61(mn2Var, new ArrayBlockingQueue(AdError.SERVER_ERROR_CODE), new b73(zs.QnHx.a.c()));
        this.j = e61Var;
        vn2 vn2VarA = this.c.a(e61Var);
        this.i = vn2VarA;
        xn2 xn2Var = this.a;
        synchronized (xn2Var) {
            i = 1;
            xn2Var.a = true;
            xn2Var.c(e61Var, null);
            sd5 sd5Var = sd5.a;
        }
        Iterator<T> it = vn2VarA.a.a().iterator();
        while (it.hasNext()) {
            try {
                ((mf4) it.next()).e();
                qnHx = sd5.a;
            } catch (Throwable th2) {
                qnHx = new fq3.QnHx(th2);
            }
            Throwable thA = fq3.a(qnHx);
            if (thA != null) {
                a62 a62Var = a62.a;
                String message = thA.getMessage();
                if (message != null) {
                    n52Var = new n52();
                    n52Var.b("error", message);
                } else {
                    n52Var = null;
                }
                a62Var.g("session_aware_start_error", n52Var);
                a62.a.d(thA, true);
            }
        }
        Set<c73> setA = vn2VarA.b.a();
        a62 a62Var2 = a62.a;
        Set<c73> set = setA;
        ArrayList arrayList = new ArrayList(mu.w0(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(((c73) it2.next()).b(e61Var));
        }
        vq2<g83> vq2VarA = vn2VarA.d.a((b73) e61Var.c);
        tz4 tz4Var = new tz4(this, 2);
        vq2VarA.getClass();
        ux uxVarI = qw.e(wu.V0(new zr2(new kr2(new jr2(new bt2(vq2VarA, tz4Var), new m70(this) { // from class: on2
            public final /* synthetic */ rn2 x;

            {
                this.x = this;
            }

            @Override // defpackage.m70
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        rn2 rn2Var = this.x;
                        Throwable th3 = (Throwable) obj;
                        if (!rn2Var.a.a) {
                            a62.a.h("errors", "error_after_stopping", th3.getMessage());
                        } else {
                            a62 a62Var3 = a62.a;
                            a62Var3.h("errors", "error_while_playing", th3.getMessage());
                            a62Var3.b("Stopping the player", th3);
                            if (!XTd3.q(th3, nl3.a(SocketTimeoutException.class))) {
                                a62Var3.d(th3, false);
                            }
                            ((tl3) rn2Var.g.getValue()).accept(th3);
                            rn2Var.b(new zt4.LPt8Fixed());
                        }
                        break;
                    default:
                        ((tl3) this.x.f.getValue()).accept((g83) obj);
                        break;
                }
            }
        }, m91.d, m91.c), new rq1(this, 2))), arrayList)).i(j54.b);
        final int i2 = 0;
        return new ox(new ax(uxVarI.c(new m70(this) { // from class: on2
            public final /* synthetic */ rn2 x;

            {
                this.x = this;
            }

            @Override // defpackage.m70
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        rn2 rn2Var = this.x;
                        Throwable th3 = (Throwable) obj;
                        if (!rn2Var.a.a) {
                            a62.a.h("errors", "error_after_stopping", th3.getMessage());
                        } else {
                            a62 a62Var3 = a62.a;
                            a62Var3.h("errors", "error_while_playing", th3.getMessage());
                            a62Var3.b("Stopping the player", th3);
                            if (!XTd3.q(th3, nl3.a(SocketTimeoutException.class))) {
                                a62Var3.d(th3, false);
                            }
                            ((tl3) rn2Var.g.getValue()).accept(th3);
                            rn2Var.b(new zt4.LPt8Fixed());
                        }
                        break;
                    default:
                        ((tl3) this.x.f.getValue()).accept((g83) obj);
                        break;
                }
            }
        }), new pq1(i, this, e61Var))).g();
    }

    public final void i(zt4 zt4Var) {
        a62.a.f("called_stop", new QnHx(zt4Var));
        try {
            vn2 vn2Var = this.i;
            e61 e61Var = this.j;
            xn2 xn2Var = this.a;
            synchronized (xn2Var) {
                xn2Var.a = false;
                xn2Var.c(e61Var, zt4Var);
                sd5 sd5Var = sd5.a;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<mf4> it = vn2Var.a.a().iterator();
            while (it.hasNext()) {
                try {
                    it.next().d(zt4Var);
                } catch (Throwable th) {
                    arrayList.add(th);
                }
            }
            vr0 vr0Var = this.h;
            if (vr0Var != null) {
                bm0.c(vr0Var);
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() <= 1) {
                    throw ((Throwable) arrayList.get(0));
                }
            }
        } catch (Throwable th2) {
            a62.a.h("errors", "error_on_stop_call", th2.getMessage());
            a62.a.d(th2, true);
        }
    }

    @Override // defpackage.ln2
    public final void k() {
        vn2 vn2Var;
        Rm rm;
        Bk bk;
        synchronized (this) {
            if (!this.a.a() && (vn2Var = this.i) != null && (rm = vn2Var.c) != null && (bk = rm.a) != null) {
                a62.a.c("Muting the player...");
                bk.k();
            }
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.ln2
    public final void setVolume(float f) {
        vn2 vn2Var;
        Rm rm;
        Bk bk;
        synchronized (this) {
            if (!this.a.a() && (vn2Var = this.i) != null && (rm = vn2Var.c) != null && (bk = rm.a) != null) {
                a62.a.c("Setting the volume to " + f + "...");
                bk.setVolume(f);
            }
            sd5 sd5Var = sd5.a;
        }
    }
}
