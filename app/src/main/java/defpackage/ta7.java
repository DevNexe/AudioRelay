package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import android.webkit.WebView;
import com.android.billingclient.api.CQf;
import com.android.billingclient.api.NUlFixed;
import com.google.android.gms.internal.ads.zzajm;
import com.google.android.gms.internal.ads.zzaka;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzgq;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta7 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ta7(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0454  */
    /* JADX WARN: Code duplicated, block: B:129:0x048d  */
    /* JADX WARN: Code duplicated, block: B:131:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:149:0x0575  */
    /* JADX WARN: Code duplicated, block: B:151:0x057d  */
    /* JADX WARN: Code duplicated, block: B:152:0x057f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0594  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        ww5 ww5Var;
        String strK;
        String string;
        String str;
        String string2;
        Boolean boolL;
        boolean zD;
        SharedPreferences sharedPreferences;
        boolean zContains;
        Bundle bundle;
        switch (this.w) {
            case 0:
                CQf cQf = (CQf) this.x;
                NUlFixed nUl = (NUlFixed) this.y;
                if (((qw6) cQf.d.y).a != null) {
                    ((qw6) cQf.d.y).a.onPurchasesUpdated(nUl, null);
                    return;
                }
                qw6 qw6Var = (qw6) cQf.d.y;
                int i = qw6.d;
                qw6Var.getClass();
                a36.f("BillingClient", "No valid listener is set in BroadcastManager");
                return;
            case 1:
                Future future = (Future) this.x;
                Runnable runnable = (Runnable) this.y;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                future.cancel(true);
                a36.f("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                try {
                    ((zzajm) this.y).x.put((zzaka) this.x);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 3:
                return;
            case 4:
                ((zzaum) this.x).zza();
                return;
            case 5:
                ((zzbbg) this.y).b.zzn((zzass) this.x);
                return;
            case 6:
                ((zzbbg) this.y).b.zzm((Surface) this.x);
                return;
            case 7:
                ((WebView) this.x).loadUrl((String) this.y);
                return;
            case 8:
                ((gcF) ((r60.QnHx) this.x)).a(((zzj) this.y).a());
                return;
            case 9:
                ((xv6) this.x).zzaw();
                if (sy4.d()) {
                    ((xv6) this.x).zzaz().m(this);
                    return;
                }
                boolean z = ((fz5) this.y).c != 0;
                ((fz5) this.y).c = 0L;
                if (z) {
                    ((fz5) this.y).b();
                    return;
                }
                return;
            case 10:
                dq6 dq6Var = (dq6) this.y;
                sw6 sw6Var = (sw6) this.x;
                ro6 ro6Var = dq6Var.j;
                dq6.h(ro6Var);
                ro6Var.e();
                vv5 vv5Var = dq6Var.g;
                vv5Var.a.getClass();
                nz5 nz5Var = new nz5(dq6Var);
                nz5Var.h();
                dq6Var.v = nz5Var;
                wg6 wg6Var = new wg6(dq6Var, sw6Var.f);
                wg6Var.g();
                dq6Var.w = wg6Var;
                gh6 gh6Var = new gh6(dq6Var);
                gh6Var.g();
                dq6Var.t = gh6Var;
                u07 u07Var = new u07(dq6Var);
                u07Var.g();
                dq6Var.u = u07Var;
                m37 m37Var = dq6Var.l;
                if (m37Var.b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                m37Var.I();
                m37Var.a.a();
                m37Var.b = true;
                xj6 xj6Var = dq6Var.h;
                if (xj6Var.b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                xj6Var.j();
                xj6Var.a.a();
                xj6Var.b = true;
                wg6 wg6Var2 = dq6Var.w;
                if (wg6Var2.b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                wg6Var2.i();
                wg6Var2.a.a();
                wg6Var2.b = true;
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                vv5Var.j();
                wh6 wh6Var = bi6Var.l;
                wh6Var.c(73000L, "App measurement initialized, version");
                dq6.h(bi6Var);
                wh6Var.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                String strJ = wg6Var.j();
                if (TextUtils.isEmpty(dq6Var.b)) {
                    if (TextUtils.isEmpty(strJ) ? false : m37Var.a.g.f("debug.firebase.analytics.app").equals(strJ)) {
                        dq6.h(bi6Var);
                        wh6Var.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        dq6.h(bi6Var);
                        wh6Var.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strJ)));
                    }
                }
                dq6.h(bi6Var);
                bi6Var.m.b("Debug-level message logging enabled");
                int i2 = dq6Var.E;
                AtomicInteger atomicInteger = dq6Var.F;
                if (i2 != atomicInteger.get()) {
                    dq6.h(bi6Var);
                    bi6Var.f.d(Integer.valueOf(dq6Var.E), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                }
                dq6Var.x = true;
                w96 w96Var = sw6Var.g;
                ro6 ro6Var2 = dq6Var.j;
                dq6.h(ro6Var2);
                ro6Var2.e();
                xj6 xj6Var2 = dq6Var.h;
                dq6.f(xj6Var2);
                ww5 ww5VarK = xj6Var2.k();
                xj6Var2.e();
                int i3 = xj6Var2.i().getInt("consent_source", 100);
                vv5 vv5Var2 = dq6Var.g;
                dq6 dq6Var2 = vv5Var2.a;
                Boolean boolM = vv5Var2.m("google_analytics_default_allow_ad_storage");
                Boolean boolM2 = vv5Var2.m("google_analytics_default_allow_analytics_storage");
                long j = dq6Var.G;
                dy6 dy6Var = dq6Var.p;
                int i4 = -10;
                if (!(boolM == null && boolM2 == null) && xj6Var2.p(-10)) {
                    ww5Var = new ww5(boolM, boolM2);
                } else {
                    if (!TextUtils.isEmpty(dq6Var.m().k()) && (i3 == 0 || i3 == 30 || i3 == 10 || i3 == 30 || i3 == 30 || i3 == 40)) {
                        dq6.g(dy6Var);
                        dy6Var.r(ww5.b, -10, j);
                    } else if (TextUtils.isEmpty(dq6Var.m().k()) && w96Var != null && (bundle = w96Var.C) != null && xj6Var2.p(30)) {
                        ww5Var = ww5.a(bundle);
                        if (!ww5Var.equals(ww5.b)) {
                            i4 = 30;
                        }
                    }
                    ww5Var = null;
                    i4 = 100;
                }
                if (ww5Var != null) {
                    dq6.g(dy6Var);
                    dy6Var.r(ww5Var, i4, j);
                    ww5VarK = ww5Var;
                }
                dq6.g(dy6Var);
                dy6Var.s(ww5VarK);
                bj6 bj6Var = xj6Var2.e;
                long jA = bj6Var.a();
                bi6 bi6Var2 = dq6Var.i;
                if (jA == 0) {
                    dq6.h(bi6Var2);
                    bi6Var2.n.c(Long.valueOf(j), "Persisting first open");
                    bj6Var.b(j);
                }
                dq6.g(dy6Var);
                sa7 sa7Var = dy6Var.n;
                if (sa7Var.b() && sa7Var.c()) {
                    xj6 xj6Var3 = sa7Var.a.h;
                    dq6.f(xj6Var3);
                    xj6Var3.t.b(null);
                }
                boolean zE = dq6Var.e();
                m37 m37Var2 = dq6Var.l;
                if (zE) {
                    boolean zIsEmpty = TextUtils.isEmpty(dq6Var.m().k());
                    tj6 tj6Var = xj6Var2.f;
                    if (zIsEmpty) {
                        wg6 wg6VarM = dq6Var.m();
                        wg6VarM.f();
                        if (!TextUtils.isEmpty(wg6VarM.m)) {
                            dq6.f(m37Var2);
                            strK = dq6Var.m().k();
                            xj6Var2.e();
                            string = xj6Var2.i().getString("gmp_app_id", null);
                            wg6 wg6VarM2 = dq6Var.m();
                            wg6VarM2.f();
                            str = wg6VarM2.m;
                            xj6Var2.e();
                            string2 = xj6Var2.i().getString("admob_app_id", null);
                            m37Var2.getClass();
                            if (m37.T(strK, string, str, string2)) {
                                dq6.h(bi6Var2);
                                bi6Var2.l.b("Rechecking which service to use due to a GMP App Id change");
                                xj6Var2.e();
                                boolL = xj6Var2.l();
                                SharedPreferences.Editor editorEdit = xj6Var2.i().edit();
                                editorEdit.clear();
                                editorEdit.apply();
                                if (boolL != null) {
                                    xj6Var2.m(boolL);
                                }
                                dq6Var.n().j();
                                dq6Var.u.u();
                                dq6Var.u.t();
                                bj6Var.b(j);
                                tj6Var.b(null);
                            }
                            String strK2 = dq6Var.m().k();
                            xj6Var2.e();
                            SharedPreferences.Editor editorEdit2 = xj6Var2.i().edit();
                            editorEdit2.putString("gmp_app_id", strK2);
                            editorEdit2.apply();
                            wg6 wg6VarM3 = dq6Var.m();
                            wg6VarM3.f();
                            String str2 = wg6VarM3.m;
                            xj6Var2.e();
                            SharedPreferences.Editor editorEdit3 = xj6Var2.i().edit();
                            editorEdit3.putString("admob_app_id", str2);
                            editorEdit3.apply();
                        }
                    } else {
                        dq6.f(m37Var2);
                        strK = dq6Var.m().k();
                        xj6Var2.e();
                        string = xj6Var2.i().getString("gmp_app_id", null);
                        wg6 wg6VarM4 = dq6Var.m();
                        wg6VarM4.f();
                        str = wg6VarM4.m;
                        xj6Var2.e();
                        string2 = xj6Var2.i().getString("admob_app_id", null);
                        m37Var2.getClass();
                        if (m37.T(strK, string, str, string2)) {
                            dq6.h(bi6Var2);
                            bi6Var2.l.b("Rechecking which service to use due to a GMP App Id change");
                            xj6Var2.e();
                            boolL = xj6Var2.l();
                            SharedPreferences.Editor editorEdit4 = xj6Var2.i().edit();
                            editorEdit4.clear();
                            editorEdit4.apply();
                            if (boolL != null) {
                                xj6Var2.m(boolL);
                            }
                            dq6Var.n().j();
                            dq6Var.u.u();
                            dq6Var.u.t();
                            bj6Var.b(j);
                            tj6Var.b(null);
                        }
                        String strK3 = dq6Var.m().k();
                        xj6Var2.e();
                        SharedPreferences.Editor editorEdit5 = xj6Var2.i().edit();
                        editorEdit5.putString("gmp_app_id", strK3);
                        editorEdit5.apply();
                        wg6 wg6VarM5 = dq6Var.m();
                        wg6VarM5.f();
                        String str3 = wg6VarM5.m;
                        xj6Var2.e();
                        SharedPreferences.Editor editorEdit6 = xj6Var2.i().edit();
                        editorEdit6.putString("admob_app_id", str3);
                        editorEdit6.apply();
                    }
                    if (!xj6Var2.k().f(hw5.ANALYTICS_STORAGE)) {
                        tj6Var.b(null);
                    }
                    dq6.g(dy6Var);
                    dy6Var.g.set(tj6Var.a());
                    ((l67) k67.x.w.zza()).zza();
                    if (vv5Var2.n(null, lg6.d0)) {
                        dq6.f(m37Var2);
                        try {
                            m37Var2.a.a.getClassLoader().loadClass("cy0");
                        } catch (ClassNotFoundException unused2) {
                            tj6 tj6Var2 = xj6Var2.s;
                            if (!TextUtils.isEmpty(tj6Var2.a())) {
                                dq6.h(bi6Var2);
                                bi6Var2.i.b("Remote config removed with active feature rollouts");
                                tj6Var2.b(null);
                            }
                        }
                    }
                    if (TextUtils.isEmpty(dq6Var.m().k())) {
                        wg6 wg6VarM6 = dq6Var.m();
                        wg6VarM6.f();
                        if (!TextUtils.isEmpty(wg6VarM6.m)) {
                            zD = dq6Var.d();
                            sharedPreferences = xj6Var2.c;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains && !vv5Var2.p()) {
                                xj6Var2.n(!zD);
                            }
                            if (zD) {
                                dq6.g(dy6Var);
                                dy6Var.A();
                            }
                            w17 w17Var = dq6Var.k;
                            dq6.g(w17Var);
                            w17Var.d.a();
                            dq6Var.q().v(new AtomicReference());
                            u07 u07VarQ = dq6Var.q();
                            Bundle bundleA = xj6Var2.v.a();
                            u07VarQ.e();
                            u07VarQ.f();
                            u07VarQ.q(new px5(u07VarQ, u07VarQ.n(false), bundleA, 4, 0));
                        }
                    } else {
                        zD = dq6Var.d();
                        sharedPreferences = xj6Var2.c;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            xj6Var2.n(!zD);
                        }
                        if (zD) {
                            dq6.g(dy6Var);
                            dy6Var.A();
                        }
                        w17 w17Var2 = dq6Var.k;
                        dq6.g(w17Var2);
                        w17Var2.d.a();
                        dq6Var.q().v(new AtomicReference());
                        u07 u07VarQ2 = dq6Var.q();
                        Bundle bundleA2 = xj6Var2.v.a();
                        u07VarQ2.e();
                        u07VarQ2.f();
                        u07VarQ2.q(new px5(u07VarQ2, u07VarQ2.n(false), bundleA2, 4, 0));
                    }
                    break;
                } else if (dq6Var.d()) {
                    dq6.f(m37Var2);
                    if (!m37Var2.M("android.permission.INTERNET")) {
                        dq6.h(bi6Var2);
                        bi6Var2.f.b("App is missing INTERNET permission");
                    }
                    if (!m37Var2.M("android.permission.ACCESS_NETWORK_STATE")) {
                        dq6.h(bi6Var2);
                        bi6Var2.f.b("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    Context context = dq6Var.a;
                    if (!so5.a(context).c() && !vv5Var2.r()) {
                        if (!m37.R(context)) {
                            dq6.h(bi6Var2);
                            bi6Var2.f.b("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!m37.S(context)) {
                            dq6.h(bi6Var2);
                            bi6Var2.f.b("AppMeasurementService not registered/enabled");
                        }
                    }
                    dq6.h(bi6Var2);
                    bi6Var2.f.b("Uploading is not possible. App measurement disabled");
                }
                xj6Var2.m.a(true);
                return;
            case 11:
                zzgq zzgqVar = (zzgq) this.y;
                zzgqVar.w.a();
                zzgqVar.w.m((p97) this.x);
                return;
            case 12:
                dy6 dy6Var2 = (dy6) this.y;
                Bundle bundle2 = (Bundle) this.x;
                dy6Var2.e();
                dy6Var2.f();
                oa3.h(bundle2);
                String string3 = bundle2.getString(MediationMetaData.KEY_NAME);
                String string4 = bundle2.getString("origin");
                oa3.e(string3);
                oa3.e(string4);
                oa3.h(bundle2.get("value"));
                dq6 dq6Var3 = dy6Var2.a;
                if (!dq6Var3.d()) {
                    bi6 bi6Var3 = dq6Var3.i;
                    dq6.h(bi6Var3);
                    bi6Var3.n.b("Conditional property not set since app measurement is disabled");
                    return;
                }
                d37 d37Var = new d37(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string3, string4);
                try {
                    m37 m37Var3 = dq6Var3.l;
                    dq6.f(m37Var3);
                    bundle2.getString("app_id");
                    m16 m16VarK0 = m37Var3.k0(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string4, 0L, true);
                    m37 m37Var4 = dq6Var3.l;
                    dq6.f(m37Var4);
                    bundle2.getString("app_id");
                    m16 m16VarK1 = m37Var4.k0(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string4, 0L, true);
                    m37 m37Var5 = dq6Var3.l;
                    dq6.f(m37Var5);
                    bundle2.getString("app_id");
                    dq6Var3.q().j(new ft5(bundle2.getString("app_id"), string4, d37Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), m16VarK1, bundle2.getLong("trigger_timeout"), m16VarK0, bundle2.getLong("time_to_live"), m37Var5.k0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string4, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused3) {
                    return;
                }
            case 13:
                Object obj = this.y;
                u07 u07Var2 = (u07) obj;
                zzee zzeeVar = u07Var2.d;
                dq6 dq6Var4 = u07Var2.a;
                if (zzeeVar == null) {
                    bi6 bi6Var4 = dq6Var4.i;
                    dq6.h(bi6Var4);
                    bi6Var4.f.b("Failed to send current screen to service");
                    return;
                }
                try {
                    qy6 qy6Var = (qy6) this.x;
                    if (qy6Var == null) {
                        zzeeVar.V(0L, null, null, dq6Var4.a.getPackageName());
                    } else {
                        zzeeVar.V(qy6Var.c, qy6Var.a, qy6Var.b, dq6Var4.a.getPackageName());
                    }
                    ((u07) obj).p();
                    return;
                } catch (RemoteException e) {
                    bi6 bi6Var5 = u07Var2.a.i;
                    dq6.h(bi6Var5);
                    bi6Var5.f.c(e, "Failed to send current screen to the service");
                    return;
                }
            case 14:
                Object obj2 = this.x;
                Object obj3 = this.y;
                u07 u07Var3 = (u07) obj3;
                zzee zzeeVar2 = u07Var3.d;
                if (zzeeVar2 == null) {
                    bi6 bi6Var6 = u07Var3.a.i;
                    dq6.h(bi6Var6);
                    bi6Var6.f.b("Failed to send consent settings to service");
                    return;
                }
                try {
                    oa3.h((p97) obj2);
                    zzeeVar2.h0((p97) obj2);
                    ((u07) obj3).p();
                    return;
                } catch (RemoteException e2) {
                    bi6 bi6Var7 = u07Var3.a.i;
                    dq6.h(bi6Var7);
                    bi6Var7.f.c(e2, "Failed to send consent settings to the service");
                    return;
                }
            case 15:
                synchronized (((s07) this.y)) {
                    ((s07) this.y).a = false;
                    if (!((s07) this.y).c.k()) {
                        bi6 bi6Var8 = ((s07) this.y).c.a.i;
                        dq6.h(bi6Var8);
                        bi6Var8.n.b("Connected to service");
                        u07 u07Var4 = ((s07) this.y).c;
                        zzee zzeeVar3 = (zzee) this.x;
                        u07Var4.e();
                        oa3.h(zzeeVar3);
                        u07Var4.d = zzeeVar3;
                        u07Var4.p();
                        u07Var4.o();
                    }
                    break;
                }
                return;
            default:
                synchronized (((n57) this.y).x) {
                    yu2<? super TResult> yu2Var = ((n57) this.y).y;
                    if (yu2Var != 0) {
                        yu2Var.onSuccess((Object) ((w05) this.x).k());
                    }
                    break;
                }
                return;
        }
    }

    public ta7(WebView webView, String str) {
        this.w = 7;
        this.x = webView;
        this.y = str;
    }

    public ta7(zzato zzatoVar, String str) {
        this.w = 3;
        this.y = zzatoVar;
        this.x = str;
    }

    public /* synthetic */ ta7(Object obj, Object obj2, int i) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }
}
