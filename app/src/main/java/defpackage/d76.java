package defpackage;

import android.app.job.JobParameters;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzgq;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d76 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d76(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.z = obj;
        this.x = obj2;
        this.y = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        o06 o06Var;
        dq6 dq6Var;
        int i = this.w;
        strD = null;
        strD = null;
        String strD = null;
        Object obj = this.y;
        Object obj2 = this.x;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                dd6 dd6Var = (dd6) obj3;
                if (dd6Var.p0 > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) obj2;
                    Bundle bundle = dd6Var.q0;
                    lifecycleCallback.c(bundle != null ? bundle.getBundle((String) obj) : null);
                }
                if (dd6Var.p0 >= 2) {
                    ((LifecycleCallback) obj2).f();
                }
                if (dd6Var.p0 >= 3) {
                    ((LifecycleCallback) obj2).d();
                }
                if (dd6Var.p0 >= 4) {
                    ((LifecycleCallback) obj2).g();
                }
                if (dd6Var.p0 >= 5) {
                    ((LifecycleCallback) obj2).getClass();
                    return;
                }
                return;
            case 1:
                zzgq zzgqVar = (zzgq) obj3;
                zzgqVar.w.a();
                ft5 ft5Var = (ft5) obj2;
                Object objB = ft5Var.y.b();
                r27 r27Var = zzgqVar.w;
                if (objB == null) {
                    r27Var.k(ft5Var, (p97) obj);
                    return;
                } else {
                    r27Var.n(ft5Var, (p97) obj);
                    return;
                }
            case 2:
                zzgq zzgqVar2 = (zzgq) obj3;
                m16 m16Var = (m16) obj2;
                zzgqVar2.getClass();
                boolean zEquals = "_cmp".equals(m16Var.w);
                r27 r27Var2 = zzgqVar2.w;
                if (zEquals && (o06Var = m16Var.x) != null) {
                    Bundle bundle2 = o06Var.w;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            r27Var2.zzay().l.c(m16Var.toString(), "Event has been filtered ");
                            m16Var = new m16("_cmpx", m16Var.x, m16Var.y, m16Var.z);
                        }
                    }
                }
                String str = m16Var.w;
                p97 p97Var = (p97) obj;
                wl6 wl6Var = r27Var2.a;
                b37 b37Var = r27Var2.g;
                r27.E(wl6Var);
                if (!wl6Var.q(p97Var.w)) {
                    zzgqVar2.L0(m16Var, p97Var);
                    return;
                }
                wh6 wh6Var = r27Var2.zzay().n;
                String str2 = p97Var.w;
                wh6Var.c(str2, "EES config found for");
                wl6 wl6Var2 = r27Var2.a;
                r27.E(wl6Var2);
                x66 x66Var = TextUtils.isEmpty(str2) ? null : (x66) wl6Var2.j.b(str2);
                if (x66Var == null) {
                    r27Var2.zzay().n.c(str2, "EES not loaded for");
                    zzgqVar2.L0(m16Var, p97Var);
                    return;
                }
                try {
                    xi5 xi5Var = x66Var.c;
                    r27.E(b37Var);
                    HashMap mapB = b37.B(m16Var.x.b(), true);
                    String strN = C0239D.N(str, v3A.C, v3A.A);
                    if (strN == null) {
                        strN = str;
                    }
                    if (x66Var.b(new ds5(strN, m16Var.z, mapB))) {
                        if (!((ds5) xi5Var.y).equals((ds5) xi5Var.x)) {
                            r27Var2.zzay().n.c(str, "EES edited event");
                            r27.E(b37Var);
                            zzgqVar2.L0(b37.v((ds5) xi5Var.y), p97Var);
                        } else {
                            zzgqVar2.L0(m16Var, p97Var);
                        }
                        if (!((List) xi5Var.z).isEmpty()) {
                            for (ds5 ds5Var : (List) xi5Var.z) {
                                r27Var2.zzay().n.c(ds5Var.a, "EES logging created event");
                                r27.E(b37Var);
                                zzgqVar2.L0(b37.v(ds5Var), p97Var);
                            }
                            return;
                        }
                        return;
                    }
                } catch (zzd unused) {
                    r27Var2.zzay().f.d(p97Var.x, "EES error. appId, eventName", str);
                }
                r27Var2.zzay().n.c(str, "EES was not applied to event");
                zzgqVar2.L0(m16Var, p97Var);
                return;
            case 3:
                zzgq zzgqVar3 = (zzgq) obj3;
                zzgqVar3.w.a();
                d37 d37Var = (d37) obj2;
                Object objB2 = d37Var.b();
                r27 r27Var3 = zzgqVar3.w;
                if (objB2 == null) {
                    r27Var3.l(d37Var, (p97) obj);
                    return;
                } else {
                    r27Var3.p(d37Var, (p97) obj);
                    return;
                }
            case 4:
                try {
                    xj6 xj6Var = ((u07) obj3).a.h;
                    dq6.f(xj6Var);
                    if (xj6Var.k().f(hw5.ANALYTICS_STORAGE)) {
                        u07 u07Var = (u07) obj3;
                        zzee zzeeVar = u07Var.d;
                        if (zzeeVar == null) {
                            bi6 bi6Var = u07Var.a.i;
                            dq6.h(bi6Var);
                            bi6Var.f.b("Failed to get app instance id");
                            dq6Var = ((u07) obj3).a;
                        } else {
                            oa3.h((p97) obj2);
                            strD = zzeeVar.d((p97) obj2);
                            if (strD != null) {
                                dy6 dy6Var = ((u07) obj3).a.p;
                                dq6.g(dy6Var);
                                dy6Var.g.set(strD);
                                xj6 xj6Var2 = ((u07) obj3).a.h;
                                dq6.f(xj6Var2);
                                xj6Var2.f.b(strD);
                            }
                            ((u07) obj3).p();
                            dq6Var = ((u07) obj3).a;
                        }
                    } else {
                        bi6 bi6Var2 = ((u07) obj3).a.i;
                        dq6.h(bi6Var2);
                        bi6Var2.k.b("Analytics storage consent denied; will not get app instance id");
                        dy6 dy6Var2 = ((u07) obj3).a.p;
                        dq6.g(dy6Var2);
                        dy6Var2.g.set(null);
                        xj6 xj6Var3 = ((u07) obj3).a.h;
                        dq6.f(xj6Var3);
                        xj6Var3.f.b(null);
                        dq6Var = ((u07) obj3).a;
                    }
                } catch (RemoteException e) {
                    bi6 bi6Var3 = ((u07) obj3).a.i;
                    dq6.h(bi6Var3);
                    bi6Var3.f.c(e, "Failed to get app instance id");
                    dq6Var = ((u07) obj3).a;
                } finally {
                    m37 m37Var = ((u07) obj3).a.l;
                    dq6.f(m37Var);
                    m37Var.C(null, (zzcf) obj);
                }
                m37 m37Var2 = dq6Var.l;
                return;
            default:
                h17 h17Var = (h17) obj2;
                h17Var.getClass();
                ((bi6) obj).n.b("AppMeasurementJobService processed last upload request.");
                ((f17) h17Var.a).b((JobParameters) obj3);
                return;
        }
    }

    public /* synthetic */ d76(h17 h17Var, bi6 bi6Var, JobParameters jobParameters) {
        this.w = 5;
        this.x = h17Var;
        this.y = bi6Var;
        this.z = jobParameters;
    }
}
