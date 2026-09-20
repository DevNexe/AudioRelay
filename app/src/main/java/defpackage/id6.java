package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class id6 extends eg6 {
    public final Bt7j b;
    public final Bt7j c;
    public long d;

    public id6(dq6 dq6Var) {
        super(dq6Var);
        this.c = new Bt7j();
        this.b = new Bt7j();
    }

    public final void f(String str, long j) {
        dq6 dq6Var = this.a;
        if (str == null || str.length() == 0) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Ad unit id must be a non-empty string");
        } else {
            ro6 ro6Var = dq6Var.j;
            dq6.h(ro6Var);
            ro6Var.m(new bs5(this, str, j));
        }
    }

    public final void g(String str, long j) {
        dq6 dq6Var = this.a;
        if (str == null || str.length() == 0) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Ad unit id must be a non-empty string");
        } else {
            ro6 ro6Var = dq6Var.j;
            dq6.h(ro6Var);
            ro6Var.m(new qx5(this, str, j, 1));
        }
    }

    public final void h(long j) {
        dz6 dz6Var = this.a.o;
        dq6.g(dz6Var);
        qy6 qy6VarK = dz6Var.k(false);
        Bt7j bt7j = this.b;
        for (String str : (g92.F1) bt7j.keySet()) {
            j(str, j - ((Long) bt7j.getOrDefault(str, null)).longValue(), qy6VarK);
        }
        if (!bt7j.isEmpty()) {
            i(j - this.d, qy6VarK);
        }
        k(j);
    }

    public final void i(long j, qy6 qy6Var) {
        dq6 dq6Var = this.a;
        if (qy6Var == null) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.n.b("Not logging ad exposure. No active activity");
        } else {
            if (j < 1000) {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.n.c(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            m37.r(qy6Var, bundle, true);
            dy6 dy6Var = dq6Var.p;
            dq6.g(dy6Var);
            dy6Var.l(bundle, "am", "_xa");
        }
    }

    public final void j(String str, long j, qy6 qy6Var) {
        dq6 dq6Var = this.a;
        if (qy6Var == null) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.n.b("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.n.c(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            m37.r(qy6Var, bundle, true);
            dy6 dy6Var = dq6Var.p;
            dq6.g(dy6Var);
            dy6Var.l(bundle, "am", "_xu");
        }
    }

    public final void k(long j) {
        Bt7j bt7j = this.b;
        Iterator it = ((g92.F1) bt7j.keySet()).iterator();
        while (it.hasNext()) {
            bt7j.put((String) it.next(), Long.valueOf(j));
        }
        if (bt7j.isEmpty()) {
            return;
        }
        this.d = j;
    }
}
