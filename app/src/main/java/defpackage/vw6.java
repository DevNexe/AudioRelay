package defpackage;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vw6 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Bundle x;
    public final /* synthetic */ dy6 y;

    public /* synthetic */ vw6(dy6 dy6Var, Bundle bundle, int i) {
        this.w = i;
        this.y = dy6Var;
        this.x = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        Bundle bundle = this.x;
        dy6 dy6Var = this.y;
        switch (i) {
            case 0:
                dq6 dq6Var = dy6Var.a;
                if (bundle == null) {
                    xj6 xj6Var = dq6Var.h;
                    dq6.f(xj6Var);
                    xj6Var.v.b(new Bundle());
                    break;
                } else {
                    xj6 xj6Var2 = dq6Var.h;
                    dq6.f(xj6Var2);
                    Bundle bundleA = xj6Var2.v.a();
                    Iterator<String> it = bundle.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        ta2 ta2Var = dy6Var.p;
                        bi6 bi6Var = dq6Var.i;
                        m37 m37Var = dq6Var.l;
                        if (!zHasNext) {
                            dq6.f(m37Var);
                            int iH = dq6Var.g.h();
                            if (bundleA.size() > iH) {
                                int i2 = 0;
                                for (String str : new TreeSet(bundleA.keySet())) {
                                    i2++;
                                    if (i2 > iH) {
                                        bundleA.remove(str);
                                    }
                                }
                                dq6.f(m37Var);
                                m37Var.getClass();
                                m37.u(ta2Var, null, 26, null, null, 0);
                                dq6.h(bi6Var);
                                bi6Var.k.b("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                            xj6 xj6Var3 = dq6Var.h;
                            dq6.f(xj6Var3);
                            xj6Var3.v.b(bundleA);
                            u07 u07VarQ = dq6Var.q();
                            u07VarQ.e();
                            u07VarQ.f();
                            u07VarQ.q(new px5(u07VarQ, u07VarQ.n(false), bundleA, 4, 0));
                            break;
                        } else {
                            String next = it.next();
                            Object obj = bundle.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                dq6.f(m37Var);
                                m37Var.getClass();
                                if (m37.N(obj)) {
                                    m37.u(ta2Var, null, 27, null, null, 0);
                                }
                                dq6.h(bi6Var);
                                bi6Var.k.d(next, "Invalid default event parameter type. Name, value", obj);
                            } else if (m37.P(next)) {
                                dq6.h(bi6Var);
                                bi6Var.k.c(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundleA.remove(next);
                            } else {
                                dq6.f(m37Var);
                                if (m37Var.J("param", next, 100, obj)) {
                                    m37Var.v(bundleA, next, obj);
                                }
                            }
                        }
                    }
                }
                break;
            default:
                dy6Var.e();
                dy6Var.f();
                oa3.h(bundle);
                String string = bundle.getString(MediationMetaData.KEY_NAME);
                oa3.e(string);
                dq6 dq6Var2 = dy6Var.a;
                if (!dq6Var2.d()) {
                    bi6 bi6Var2 = dq6Var2.i;
                    dq6.h(bi6Var2);
                    bi6Var2.n.b("Conditional property not cleared since app measurement is disabled");
                } else {
                    d37 d37Var = new d37(0L, null, string, "");
                    try {
                        m37 m37Var2 = dq6Var2.l;
                        dq6.f(m37Var2);
                        bundle.getString("app_id");
                        dq6Var2.q().j(new ft5(bundle.getString("app_id"), "", d37Var, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), m37Var2.k0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
        }
    }
}
