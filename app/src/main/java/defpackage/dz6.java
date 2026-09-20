package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class dz6 extends kj6 {
    public volatile qy6 c;
    public volatile qy6 d;
    public qy6 e;
    public final ConcurrentHashMap f;
    public Activity g;
    public volatile boolean h;
    public volatile qy6 i;
    public qy6 j;
    public boolean k;
    public final Object l;

    public dz6(dq6 dq6Var) {
        super(dq6Var);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    @Override // defpackage.kj6
    public final boolean h() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    public final void i(qy6 qy6Var, qy6 qy6Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        e();
        boolean z3 = false;
        if (qy6Var2 != null) {
            if (qy6Var2.c == qy6Var.c && Th.T(qy6Var2.b, qy6Var.b) && Th.T(qy6Var2.a, qy6Var.a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.e != null) {
            z3 = true;
        }
        dq6 dq6Var = this.a;
        if (z2) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            m37.r(qy6Var, bundle2, true);
            if (qy6Var2 != null) {
                String str = qy6Var2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = qy6Var2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", qy6Var2.c);
            }
            if (z3) {
                w17 w17Var = dq6Var.k;
                dq6.g(w17Var);
                t17 t17Var = w17Var.e;
                long j3 = j - t17Var.b;
                t17Var.b = j;
                if (j3 > 0) {
                    m37 m37Var = dq6Var.l;
                    dq6.f(m37Var);
                    m37Var.p(bundle2, j3);
                }
            }
            if (!dq6Var.g.o()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != qy6Var.e ? "auto" : "app";
            dq6Var.n.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (qy6Var.e) {
                long j4 = qy6Var.f;
                if (j4 == 0) {
                    j2 = jCurrentTimeMillis;
                } else {
                    j2 = j4;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            dy6 dy6Var = dq6Var.p;
            dq6.g(dy6Var);
            dy6Var.m(j2, bundle2, str3, "_vs");
        }
        if (z3) {
            j(this.e, true, j);
        }
        this.e = qy6Var;
        if (qy6Var.e) {
            this.j = qy6Var;
        }
        u07 u07VarQ = dq6Var.q();
        u07VarQ.e();
        u07VarQ.f();
        u07VarQ.q(new ta7(u07VarQ, qy6Var, 13));
    }

    public final void j(qy6 qy6Var, boolean z, long j) {
        dq6 dq6Var = this.a;
        id6 id6VarJ = dq6Var.j();
        dq6Var.n.getClass();
        id6VarJ.h(SystemClock.elapsedRealtime());
        boolean z2 = qy6Var != null && qy6Var.d;
        w17 w17Var = dq6Var.k;
        dq6.g(w17Var);
        if (!w17Var.e.a(j, z2, z) || qy6Var == null) {
            return;
        }
        qy6Var.d = false;
    }

    public final qy6 k(boolean z) {
        f();
        e();
        if (!z) {
            return this.e;
        }
        qy6 qy6Var = this.e;
        return qy6Var != null ? qy6Var : this.j;
    }

    public final String l(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str.length();
        this.a.getClass();
        return length2 > 100 ? str.substring(0, 100) : str;
    }

    public final void m(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.a.g.o() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new qy6(bundle2.getString(MediationMetaData.KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong(FacebookAdapter.KEY_ID)));
    }

    public final qy6 n(Activity activity) {
        oa3.h(activity);
        qy6 qy6Var = (qy6) this.f.get(activity);
        if (qy6Var == null) {
            String strL = l(activity.getClass());
            m37 m37Var = this.a.l;
            dq6.f(m37Var);
            qy6 qy6Var2 = new qy6(null, strL, m37Var.g0());
            this.f.put(activity, qy6Var2);
            qy6Var = qy6Var2;
        }
        return this.i != null ? this.i : qy6Var;
    }

    public final void o(Activity activity, qy6 qy6Var, boolean z) {
        qy6 qy6Var2;
        qy6 qy6Var3 = this.c == null ? this.d : this.c;
        if (qy6Var.b == null) {
            qy6Var2 = new qy6(qy6Var.a, activity != null ? l(activity.getClass()) : null, qy6Var.c, qy6Var.e, qy6Var.f);
        } else {
            qy6Var2 = qy6Var;
        }
        this.d = this.c;
        this.c = qy6Var2;
        this.a.n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ro6 ro6Var = this.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new ty6(this, qy6Var2, qy6Var3, jElapsedRealtime, z));
    }
}
