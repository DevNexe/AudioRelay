package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes3.dex */
public final class dq6 implements xv6 {
    public static volatile dq6 H;
    public volatile Boolean A;
    public final Boolean B;
    public final Boolean C;
    public volatile boolean D;
    public int E;
    public final long G;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final sy4 f;
    public final vv5 g;
    public final xj6 h;
    public final bi6 i;
    public final ro6 j;
    public final w17 k;
    public final m37 l;
    public final lh6 m;
    public final jg0 n;
    public final dz6 o;
    public final dy6 p;
    public final id6 q;
    public final ly6 r;
    public final String s;
    public gh6 t;
    public u07 u;
    public nz5 v;
    public wg6 w;
    public Boolean y;
    public long z;
    public boolean x = false;
    public final AtomicInteger F = new AtomicInteger(0);

    public dq6(sw6 sw6Var) {
        Context context;
        Bundle bundle;
        int i = 0;
        Context context2 = sw6Var.a;
        sy4 sy4Var = new sy4((qa0) null);
        this.f = sy4Var;
        Th.X = sy4Var;
        this.a = context2;
        this.b = sw6Var.b;
        this.c = sw6Var.c;
        this.d = sw6Var.d;
        this.e = sw6Var.h;
        this.A = sw6Var.e;
        this.s = sw6Var.j;
        this.D = true;
        w96 w96Var = sw6Var.g;
        if (w96Var != null && (bundle = w96Var.C) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = w96Var.C.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        if (ay6.g == null) {
            Object obj3 = ay6.f;
            synchronized (obj3) {
                if (ay6.g == null) {
                    synchronized (obj3) {
                        tw6 tw6Var = ay6.g;
                        Context applicationContext = context2.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context2;
                        }
                        if (tw6Var == null || tw6Var.a != applicationContext) {
                            xw6.c();
                            by6.a();
                            synchronized (gx6.class) {
                                gx6 gx6Var = gx6.c;
                                if (gx6Var != null && (context = gx6Var.a) != null && gx6Var.b != null) {
                                    context.getContentResolver().unregisterContentObserver(gx6.c.b);
                                }
                                gx6.c = null;
                            }
                            ay6.g = new tw6(applicationContext, XTd3.B(new pf4(applicationContext, 3)));
                            ay6.h.incrementAndGet();
                        }
                    }
                }
            }
        }
        this.n = jg0.a;
        Long l = sw6Var.i;
        this.G = l != null ? l.longValue() : System.currentTimeMillis();
        this.g = new vv5(this);
        xj6 xj6Var = new xj6(this);
        xj6Var.h();
        this.h = xj6Var;
        bi6 bi6Var = new bi6(this);
        bi6Var.h();
        this.i = bi6Var;
        m37 m37Var = new m37(this);
        m37Var.h();
        this.l = m37Var;
        this.m = new lh6(new dv6(this, i));
        this.q = new id6(this);
        dz6 dz6Var = new dz6(this);
        dz6Var.g();
        this.o = dz6Var;
        dy6 dy6Var = new dy6(this);
        dy6Var.g();
        this.p = dy6Var;
        w17 w17Var = new w17(this);
        w17Var.g();
        this.k = w17Var;
        ly6 ly6Var = new ly6(this);
        ly6Var.h();
        this.r = ly6Var;
        ro6 ro6Var = new ro6(this);
        ro6Var.h();
        this.j = ro6Var;
        w96 w96Var2 = sw6Var.g;
        i = (w96Var2 == null || w96Var2.x == 0) ? 1 : 0;
        if (context2.getApplicationContext() instanceof Application) {
            g(dy6Var);
            if (dy6Var.a.a.getApplicationContext() instanceof Application) {
                Application application = (Application) dy6Var.a.a.getApplicationContext();
                if (dy6Var.c == null) {
                    dy6Var.c = new cy6(dy6Var);
                }
                if (i != 0) {
                    application.unregisterActivityLifecycleCallbacks(dy6Var.c);
                    application.registerActivityLifecycleCallbacks(dy6Var.c);
                    bi6 bi6Var2 = dy6Var.a.i;
                    h(bi6Var2);
                    bi6Var2.n.b("Registered activity lifecycle callback");
                }
            }
        } else {
            h(bi6Var);
            bi6Var.i.b("Application context is not an Application");
        }
        ro6Var.m(new ta7(this, sw6Var, 10));
    }

    public static final void f(sv6 sv6Var) {
        if (sv6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void g(kj6 kj6Var) {
        if (kj6Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!kj6Var.b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(kj6Var.getClass())));
        }
    }

    public static final void h(sv6 sv6Var) {
        if (sv6Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!sv6Var.b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(sv6Var.getClass())));
        }
    }

    public static dq6 p(Context context, w96 w96Var, Long l) {
        Bundle bundle;
        if (w96Var != null && (w96Var.A == null || w96Var.B == null)) {
            w96Var = new w96(w96Var.w, w96Var.x, w96Var.y, w96Var.z, null, null, w96Var.C, null);
        }
        oa3.h(context);
        oa3.h(context.getApplicationContext());
        if (H == null) {
            synchronized (dq6.class) {
                if (H == null) {
                    H = new dq6(new sw6(context, w96Var, l));
                }
            }
        } else if (w96Var != null && (bundle = w96Var.C) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            oa3.h(H);
            H.A = Boolean.valueOf(w96Var.C.getBoolean("dataCollectionDefaultEnabled"));
        }
        oa3.h(H);
        return H;
    }

    public final void a() {
        this.F.incrementAndGet();
    }

    @Override // defpackage.xv6
    @Pure
    public final ft b() {
        return this.n;
    }

    @Override // defpackage.xv6
    @Pure
    public final Context c() {
        return this.a;
    }

    public final boolean d() {
        return i() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x0034, please report this as an issue */
    public final boolean e() {
        m37 m37Var;
        boolean z;
        Boolean boolValueOf;
        String strK;
        wg6 wg6VarM;
        boolean z2;
        if (!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        ro6 ro6Var = this.j;
        h(ro6Var);
        ro6Var.e();
        Boolean bool = this.y;
        jg0 jg0Var = this.n;
        if (bool == null || this.z == 0) {
            jg0Var.getClass();
            this.z = SystemClock.elapsedRealtime();
            m37Var = this.l;
            f(m37Var);
            if (m37Var.M("android.permission.INTERNET") || !m37Var.M("android.permission.ACCESS_NETWORK_STATE")) {
                z = false;
            } else {
                Context context = this.a;
                if (so5.a(context).c() || this.g.r() || (m37.R(context) && m37.S(context))) {
                    z = true;
                } else {
                    z = false;
                }
            }
            boolValueOf = Boolean.valueOf(z);
            this.y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                strK = m().k();
                wg6VarM = m();
                wg6VarM.f();
                if (!m37Var.E(strK, wg6VarM.m)) {
                    wg6 wg6VarM2 = m();
                    wg6VarM2.f();
                    z2 = TextUtils.isEmpty(wg6VarM2.m) ? false : true;
                }
                this.y = Boolean.valueOf(z2);
            }
        } else if (!bool.booleanValue()) {
            jg0Var.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.z) > 1000) {
                jg0Var.getClass();
                this.z = SystemClock.elapsedRealtime();
                m37Var = this.l;
                f(m37Var);
                if (m37Var.M("android.permission.INTERNET")) {
                    z = false;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
                this.y = boolValueOf;
                if (boolValueOf.booleanValue()) {
                    strK = m().k();
                    wg6VarM = m();
                    wg6VarM.f();
                    if (!m37Var.E(strK, wg6VarM.m)) {
                        wg6 wg6VarM3 = m();
                        wg6VarM3.f();
                        if (TextUtils.isEmpty(wg6VarM3.m)) {
                        }
                    }
                    this.y = Boolean.valueOf(z2);
                }
            }
        }
        return this.y.booleanValue();
    }

    public final int i() {
        ro6 ro6Var = this.j;
        h(ro6Var);
        ro6Var.e();
        if (this.g.p()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        ro6 ro6Var2 = this.j;
        h(ro6Var2);
        ro6Var2.e();
        if (!this.D) {
            return 8;
        }
        xj6 xj6Var = this.h;
        f(xj6Var);
        Boolean boolL = xj6Var.l();
        if (boolL != null) {
            return boolL.booleanValue() ? 0 : 3;
        }
        vv5 vv5Var = this.g;
        sy4 sy4Var = vv5Var.a.f;
        Boolean boolM = vv5Var.m("firebase_analytics_collection_enabled");
        if (boolM != null) {
            return boolM.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    @Pure
    public final id6 j() {
        id6 id6Var = this.q;
        if (id6Var != null) {
            return id6Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final vv5 k() {
        return this.g;
    }

    @Pure
    public final nz5 l() {
        h(this.v);
        return this.v;
    }

    @Pure
    public final wg6 m() {
        g(this.w);
        return this.w;
    }

    @Pure
    public final gh6 n() {
        g(this.t);
        return this.t;
    }

    @Pure
    public final lh6 o() {
        return this.m;
    }

    @Pure
    public final u07 q() {
        g(this.u);
        return this.u;
    }

    @Override // defpackage.xv6
    @Pure
    public final sy4 zzaw() {
        return this.f;
    }

    @Override // defpackage.xv6
    @Pure
    public final bi6 zzay() {
        bi6 bi6Var = this.i;
        h(bi6Var);
        return bi6Var;
    }

    @Override // defpackage.xv6
    @Pure
    public final ro6 zzaz() {
        ro6 ro6Var = this.j;
        h(ro6Var);
        return ro6Var;
    }
}
