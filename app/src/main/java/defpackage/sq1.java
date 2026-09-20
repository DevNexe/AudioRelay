package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class sq1 implements oq1, vq1 {
    public final xq1 a;
    public final gR2r b;
    public QnHx c;
    public AtomicReference d;

    public static final class CQf extends cx1 implements j81<Throwable, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            Throwable th2 = th;
            a62 a62Var = a62.a;
            a62.a.d(th2, true);
            a62Var.h("ads", "start_refresh_failed", th2.getMessage());
            return sd5.a;
        }
    }

    public static final class QnHx {
        public final eq1 a;
        public final long b;

        public QnHx(eq1 eq1Var) {
            long jC = zs.QnHx.a.c();
            this.a = eq1Var;
            this.b = jC;
        }
    }

    public sq1(xq1 xq1Var, gR2r gr2r) {
        this.a = xq1Var;
        this.b = gr2r;
    }

    @Override // defpackage.vq1
    public final boolean a() {
        synchronized (this) {
            QnHx qnHx = this.c;
            eq1 eq1Var = qnHx != null ? qnHx.a : null;
            if (eq1Var == null) {
                a62.a.e("no_interstitial_found");
            } else {
                if (eq1Var.isReady()) {
                    eq1Var.a();
                    return true;
                }
                a62.a.e("found_unready_interstitial");
            }
            return false;
        }
    }

    @Override // defpackage.oq1
    public final void b(Activity activity) {
        synchronized (this) {
            QnHx qnHx = this.c;
            if (qnHx == null) {
                d(activity);
            } else {
                a62.a.e("previous_interstitial_too_old");
                c();
                this.d = (AtomicReference) jw4.a(e(activity, qnHx), tq1.w);
            }
            sd5 sd5Var = sd5.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.atomic.AtomicReference, vl0] */
    @Override // defpackage.oq1
    public final void c() {
        synchronized (this) {
            ?? r0 = this.d;
            if (r0 != 0) {
                r0.a();
            }
            this.d = null;
            sd5 sd5Var = sd5.a;
        }
    }

    public final void d(Activity activity) {
        xq1 xq1Var = this.a;
        gR2r gr2r = xq1Var.a;
        ll4 ll4VarG = new kl4(vk4.l(gr2r.c(), gr2r.e(), gr2r.d(), gr2r.a.a(), new NRt()), new NFo7(xq1Var, 3)).g(Po.a());
        c54 c54Var = j54.c;
        if (c54Var == null) {
            throw new NullPointerException("scheduler is null");
        }
        this.d = (AtomicReference) jw4.a(new gl4(new bl4(new kl4(new kl4(new tl4(ll4VarG, c54Var), new qq1(activity, this)), new KnU(6)), new rq1(this, 0)), new qq1(this, activity)), CQf.w);
    }

    public final rx e(Activity activity, QnHx qnHx) {
        long jC = zs.QnHx.a.c() - qnHx.b;
        long jG = gq0.g(this.b.j());
        long j = jC >= jG ? 0L : jG - jC;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c54 c54Var = j54.b;
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (c54Var == null) {
            throw new NullPointerException("scheduler is null");
        }
        wx wxVar = new wx(j, timeUnit, c54Var);
        pq1 pq1Var = new pq1(0, this, activity);
        m91.byN byn = m91.d;
        return new rx(wxVar, byn, byn, pq1Var, m91.c);
    }

    @Override // defpackage.oq1
    public final void stop() {
        synchronized (this) {
            c();
            QnHx qnHx = this.c;
            eq1 eq1Var = qnHx != null ? qnHx.a : null;
            if (eq1Var != null) {
                a62.a.e("destroyed_interstitial");
                eq1Var.destroy();
            }
            this.c = null;
            sd5 sd5Var = sd5.a;
        }
    }
}
