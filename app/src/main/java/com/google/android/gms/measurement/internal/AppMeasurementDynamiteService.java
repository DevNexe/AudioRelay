package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import defpackage.Bt7j;
import defpackage.C0239D;
import defpackage.bi6;
import defpackage.bx6;
import defpackage.cy6;
import defpackage.d47;
import defpackage.dq6;
import defpackage.dy6;
import defpackage.dz6;
import defpackage.f96;
import defpackage.iq5;
import defpackage.ix6;
import defpackage.kw6;
import defpackage.kx6;
import defpackage.m16;
import defpackage.m37;
import defpackage.o06;
import defpackage.o87;
import defpackage.oa3;
import defpackage.qy6;
import defpackage.ro6;
import defpackage.ss3;
import defpackage.tb7;
import defpackage.vw6;
import defpackage.w96;
import defpackage.xx6;
import defpackage.zx6;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends zzcb {
    public dq6 w = null;
    public final Bt7j x = new Bt7j();

    public final void L0(String str, zzcf zzcfVar) {
        zzb();
        m37 m37Var = this.w.l;
        dq6.f(m37Var);
        m37Var.C(str, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(String str, long j) {
        zzb();
        this.w.j().f(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dy6Var.i(bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dy6Var.f();
        ro6 ro6Var = dy6Var.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new iq5(11, dy6Var, (Object) null));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(String str, long j) {
        zzb();
        this.w.j().g(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(zzcf zzcfVar) {
        zzb();
        m37 m37Var = this.w.l;
        dq6.f(m37Var);
        long jG0 = m37Var.g0();
        zzb();
        m37 m37Var2 = this.w.l;
        dq6.f(m37Var2);
        m37Var2.B(zzcfVar, jG0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(zzcf zzcfVar) {
        zzb();
        ro6 ro6Var = this.w.j;
        dq6.h(ro6Var);
        ro6Var.m(new xx6(this, zzcfVar, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(zzcf zzcfVar) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        L0(dy6Var.x(), zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) {
        zzb();
        ro6 ro6Var = this.w.j;
        dq6.h(ro6Var);
        ro6Var.m(new d47(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(zzcf zzcfVar) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dz6 dz6Var = dy6Var.a.o;
        dq6.g(dz6Var);
        qy6 qy6Var = dz6Var.c;
        L0(qy6Var != null ? qy6Var.b : null, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(zzcf zzcfVar) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dz6 dz6Var = dy6Var.a.o;
        dq6.g(dz6Var);
        qy6 qy6Var = dz6Var.c;
        L0(qy6Var != null ? qy6Var.a : null, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(zzcf zzcfVar) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dq6 dq6Var = dy6Var.a;
        String strO = dq6Var.b;
        if (strO == null) {
            try {
                strO = C0239D.O(dq6Var.a, dq6Var.s);
            } catch (IllegalStateException e) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.f.c(e, "getGoogleAppId failed with exception");
                strO = null;
            }
        }
        L0(strO, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, zzcf zzcfVar) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        oa3.e(str);
        dy6Var.a.getClass();
        zzb();
        m37 m37Var = this.w.l;
        dq6.f(m37Var);
        m37Var.A(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(zzcf zzcfVar, int i) {
        zzb();
        int i2 = 1;
        if (i == 0) {
            m37 m37Var = this.w.l;
            dq6.f(m37Var);
            dy6 dy6Var = this.w.p;
            dq6.g(dy6Var);
            AtomicReference atomicReference = new AtomicReference();
            ro6 ro6Var = dy6Var.a.j;
            dq6.h(ro6Var);
            m37Var.C((String) ro6Var.j(atomicReference, 15000L, "String test flag value", new kx6(dy6Var, atomicReference, i2)), zzcfVar);
            return;
        }
        if (i == 1) {
            m37 m37Var2 = this.w.l;
            dq6.f(m37Var2);
            dy6 dy6Var2 = this.w.p;
            dq6.g(dy6Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            ro6 ro6Var2 = dy6Var2.a.j;
            dq6.h(ro6Var2);
            m37Var2.B(zzcfVar, ((Long) ro6Var2.j(atomicReference2, 15000L, "long test flag value", new iq5(10, dy6Var2, atomicReference2))).longValue());
            return;
        }
        int i3 = 2;
        if (i == 2) {
            m37 m37Var3 = this.w.l;
            dq6.f(m37Var3);
            dy6 dy6Var3 = this.w.p;
            dq6.g(dy6Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            ro6 ro6Var3 = dy6Var3.a.j;
            dq6.h(ro6Var3);
            double dDoubleValue = ((Double) ro6Var3.j(atomicReference3, 15000L, "double test flag value", new kx6(dy6Var3, atomicReference3, i3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                zzcfVar.zzd(bundle);
                return;
            } catch (RemoteException e) {
                bi6 bi6Var = m37Var3.a.i;
                dq6.h(bi6Var);
                bi6Var.i.c(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            m37 m37Var4 = this.w.l;
            dq6.f(m37Var4);
            dy6 dy6Var4 = this.w.p;
            dq6.g(dy6Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            ro6 ro6Var4 = dy6Var4.a.j;
            dq6.h(ro6Var4);
            m37Var4.A(zzcfVar, ((Integer) ro6Var4.j(atomicReference4, 15000L, "int test flag value", new tb7(dy6Var4, atomicReference4, 9))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        m37 m37Var5 = this.w.l;
        dq6.f(m37Var5);
        dy6 dy6Var5 = this.w.p;
        dq6.g(dy6Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        ro6 ro6Var5 = dy6Var5.a.j;
        dq6.h(ro6Var5);
        m37Var5.w(zzcfVar, ((Boolean) ro6Var5.j(atomicReference5, 15000L, "boolean test flag value", new kx6(dy6Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z, zzcf zzcfVar) {
        zzb();
        ro6 ro6Var = this.w.j;
        dq6.h(ro6Var);
        ro6Var.m(new zx6(this, zzcfVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(Map map) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, w96 w96Var, long j) {
        dq6 dq6Var = this.w;
        if (dq6Var == null) {
            Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
            oa3.h(context);
            this.w = dq6.p(context, w96Var, Long.valueOf(j));
        } else {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.i.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(zzcf zzcfVar) {
        zzb();
        ro6 ro6Var = this.w.j;
        dq6.h(ro6Var);
        ro6Var.m(new xx6(this, zzcfVar, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dy6Var.k(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j) {
        zzb();
        oa3.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        m16 m16Var = new m16(str2, new o06(bundle), "app", j);
        ro6 ro6Var = this.w.j;
        dq6.h(ro6Var);
        ro6Var.m(new ix6(this, zzcfVar, m16Var, str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        zzb();
        Object objM0 = iObjectWrapper == null ? null : ObjectWrapper.M0(iObjectWrapper);
        Object objM1 = iObjectWrapper2 == null ? null : ObjectWrapper.M0(iObjectWrapper2);
        Object objM2 = iObjectWrapper3 != null ? ObjectWrapper.M0(iObjectWrapper3) : null;
        bi6 bi6Var = this.w.i;
        dq6.h(bi6Var);
        bi6Var.r(i, true, false, str, objM0, objM1, objM2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        cy6 cy6Var = dy6Var.c;
        if (cy6Var != null) {
            dy6 dy6Var2 = this.w.p;
            dq6.g(dy6Var2);
            dy6Var2.j();
            cy6Var.onActivityCreated((Activity) ObjectWrapper.M0(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        cy6 cy6Var = dy6Var.c;
        if (cy6Var != null) {
            dy6 dy6Var2 = this.w.p;
            dq6.g(dy6Var2);
            dy6Var2.j();
            cy6Var.onActivityDestroyed((Activity) ObjectWrapper.M0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        cy6 cy6Var = dy6Var.c;
        if (cy6Var != null) {
            dy6 dy6Var2 = this.w.p;
            dq6.g(dy6Var2);
            dy6Var2.j();
            cy6Var.onActivityPaused((Activity) ObjectWrapper.M0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        cy6 cy6Var = dy6Var.c;
        if (cy6Var != null) {
            dy6 dy6Var2 = this.w.p;
            dq6.g(dy6Var2);
            dy6Var2.j();
            cy6Var.onActivityResumed((Activity) ObjectWrapper.M0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcfVar, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        cy6 cy6Var = dy6Var.c;
        Bundle bundle = new Bundle();
        if (cy6Var != null) {
            dy6 dy6Var2 = this.w.p;
            dq6.g(dy6Var2);
            dy6Var2.j();
            cy6Var.onActivitySaveInstanceState((Activity) ObjectWrapper.M0(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            bi6 bi6Var = this.w.i;
            dq6.h(bi6Var);
            bi6Var.i.c(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        if (dy6Var.c != null) {
            dy6 dy6Var2 = this.w.p;
            dq6.g(dy6Var2);
            dy6Var2.j();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        if (dy6Var.c != null) {
            dy6 dy6Var2 = this.w.p;
            dq6.g(dy6Var2);
            dy6Var2.j();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, zzcf zzcfVar, long j) {
        zzb();
        zzcfVar.zzd(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(zzci zzciVar) {
        Object o87Var;
        zzb();
        synchronized (this.x) {
            o87Var = (kw6) this.x.getOrDefault(Integer.valueOf(zzciVar.zzd()), null);
            if (o87Var == null) {
                o87Var = new o87(this, zzciVar);
                this.x.put(Integer.valueOf(zzciVar.zzd()), o87Var);
            }
        }
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dy6Var.f();
        if (dy6Var.e.add(o87Var)) {
            return;
        }
        bi6 bi6Var = dy6Var.a.i;
        dq6.h(bi6Var);
        bi6Var.i.b("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dy6Var.g.set(null);
        ro6 ro6Var = dy6Var.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new bx6(dy6Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(Bundle bundle, long j) {
        zzb();
        if (bundle == null) {
            bi6 bi6Var = this.w.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Conditional user property must not be null");
        } else {
            dy6 dy6Var = this.w.p;
            dq6.g(dy6Var);
            dy6Var.p(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(final Bundle bundle, final long j) {
        zzb();
        final dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        ro6 ro6Var = dy6Var.a.j;
        dq6.h(ro6Var);
        ro6Var.n(new Runnable() { // from class: uw6
            @Override // java.lang.Runnable
            public final void run() {
                dy6 dy6Var2 = dy6Var;
                if (TextUtils.isEmpty(dy6Var2.a.m().k())) {
                    dy6Var2.q(bundle, 0, j);
                    return;
                }
                bi6 bi6Var = dy6Var2.a.i;
                dq6.h(bi6Var);
                bi6Var.k.b("Using developer consent only; google app id found");
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(Bundle bundle, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dy6Var.q(bundle, -20, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r4.length() <= 100) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r5.length() <= 100) goto L33;
     */
    @Override // com.google.android.gms.internal.measurement.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper r3, java.lang.String r4, java.lang.String r5, long r6) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dy6Var.f();
        ro6 ro6Var = dy6Var.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new f96(dy6Var, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        ro6 ro6Var = dy6Var.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new vw6(dy6Var, bundle2, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(zzci zzciVar) {
        zzb();
        ss3 ss3Var = new ss3(this, zzciVar, 19, 0 == true ? 1 : 0);
        ro6 ro6Var = this.w.j;
        dq6.h(ro6Var);
        if (!ro6Var.o()) {
            ro6 ro6Var2 = this.w.j;
            dq6.h(ro6Var2);
            ro6Var2.m(new tb7(this, ss3Var, 14));
            return;
        }
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dy6Var.e();
        dy6Var.f();
        ss3 ss3Var2 = dy6Var.d;
        if (ss3Var != ss3Var2) {
            oa3.j("EventInterceptor already set.", ss3Var2 == null);
        }
        dy6Var.d = ss3Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(zzck zzckVar) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        Boolean boolValueOf = Boolean.valueOf(z);
        dy6Var.f();
        ro6 ro6Var = dy6Var.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new iq5(11, dy6Var, boolValueOf));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j) {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        ro6 ro6Var = dy6Var.a.j;
        dq6.h(ro6Var);
        ro6Var.m(new bx6(dy6Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(String str, long j) {
        zzb();
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dq6 dq6Var = dy6Var.a;
        if (str != null && TextUtils.isEmpty(str)) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.i.b("User ID must be non-empty or null");
        } else {
            ro6 ro6Var = dq6Var.j;
            dq6.h(ro6Var);
            ro6Var.m(new tb7(8, dy6Var, str));
            dy6Var.t(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        zzb();
        Object objM0 = ObjectWrapper.M0(iObjectWrapper);
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dy6Var.t(str, str2, objM0, z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(zzci zzciVar) {
        Object o87Var;
        zzb();
        synchronized (this.x) {
            o87Var = (kw6) this.x.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (o87Var == null) {
            o87Var = new o87(this, zzciVar);
        }
        dy6 dy6Var = this.w.p;
        dq6.g(dy6Var);
        dy6Var.f();
        if (dy6Var.e.remove(o87Var)) {
            return;
        }
        bi6 bi6Var = dy6Var.a.i;
        dq6.h(bi6Var);
        bi6Var.i.b("OnEventListener had not been registered");
    }

    @EnsuresNonNull({"scion"})
    public final void zzb() {
        if (this.w == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
