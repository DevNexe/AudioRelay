package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.billingclient.api.T23;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzeq;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.internal.ads.zzcgn;
import com.revenuecat.purchases.google.QnHx;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o17 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ o17(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        URL url;
        switch (this.w) {
            case 0:
                ((QnHx) this.x).a(T23.m);
                return;
            case 1:
                ((xg3) this.x).e(T23.m, null);
                return;
            case 2:
                zzbf zzbfVar = ((zzeq) this.x).w;
                if (zzbfVar != null) {
                    try {
                        zzbfVar.zze(1);
                        return;
                    } catch (RemoteException e) {
                        zzcgn.zzk("Could not notify onAdFailedToLoad event.", e);
                        return;
                    }
                }
                return;
            case 3:
                ((tp5) this.x).e();
                return;
            case 4:
                ((wp5) ((zact) this.x).C).b(new z50(4));
                return;
            case 5:
                u27 u27Var = (u27) this.x;
                long j = u27Var.a.getSharedPreferences("app_set_id_storage", 0).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                if (j2 == -1 || System.currentTimeMillis() <= j2) {
                    return;
                }
                Context context = u27Var.a;
                if (!context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 6:
                dy6 dy6Var = (dy6) this.x;
                dy6Var.e();
                dq6 dq6Var = dy6Var.a;
                xj6 xj6Var = dq6Var.h;
                dq6.f(xj6Var);
                if (xj6Var.q.b()) {
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    bi6Var.m.b("Deferred Deep Link already retrieved. Not fetching again.");
                    return;
                }
                xj6 xj6Var2 = dq6Var.h;
                dq6.f(xj6Var2);
                long jA = xj6Var2.r.a();
                xj6 xj6Var3 = dq6Var.h;
                dq6.f(xj6Var3);
                xj6Var3.r.b(1 + jA);
                if (jA >= 5) {
                    bi6 bi6Var2 = dq6Var.i;
                    dq6.h(bi6Var2);
                    bi6Var2.i.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                    xj6 xj6Var4 = dq6Var.h;
                    dq6.f(xj6Var4);
                    xj6Var4.q.a(true);
                    return;
                }
                ro6 ro6Var = dq6Var.j;
                dq6.h(ro6Var);
                ro6Var.e();
                ly6 ly6Var = dq6Var.r;
                dq6.h(ly6Var);
                dq6.h(ly6Var);
                String strJ = dq6Var.m().j();
                xj6 xj6Var5 = dq6Var.h;
                dq6.f(xj6Var5);
                xj6Var5.e();
                dq6 dq6Var2 = xj6Var5.a;
                dq6Var2.n.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String str = xj6Var5.g;
                if (str == null || jElapsedRealtime >= xj6Var5.i) {
                    xj6Var5.i = dq6Var2.g.k(strJ, lg6.c) + jElapsedRealtime;
                    AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(dq6Var2.a);
                        xj6Var5.g = "";
                        String id = advertisingIdInfo.getId();
                        if (id != null) {
                            xj6Var5.g = id;
                        }
                        xj6Var5.h = advertisingIdInfo.isLimitAdTrackingEnabled();
                    } catch (Exception e2) {
                        bi6 bi6Var3 = dq6Var2.i;
                        dq6.h(bi6Var3);
                        bi6Var3.m.c(e2, "Unable to get advertising id");
                        xj6Var5.g = "";
                    }
                    AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                    pair = new Pair(xj6Var5.g, Boolean.valueOf(xj6Var5.h));
                    break;
                } else {
                    pair = new Pair(str, Boolean.valueOf(xj6Var5.h));
                }
                Boolean boolM = dq6Var.g.m("google_analytics_adid_collection_enabled");
                boolean z = boolM == null || boolM.booleanValue();
                bi6 bi6Var4 = dq6Var.i;
                if (!z || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                    dq6.h(bi6Var4);
                    bi6Var4.m.b("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    return;
                }
                dq6.h(ly6Var);
                ly6Var.g();
                dq6 dq6Var3 = ly6Var.a;
                ConnectivityManager connectivityManager = (ConnectivityManager) dq6Var3.a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    } catch (SecurityException unused) {
                        activeNetworkInfo = null;
                    }
                    break;
                } else {
                    activeNetworkInfo = null;
                }
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    dq6.h(bi6Var4);
                    bi6Var4.i.b("Network is not available for Deferred Deep Link request. Skipping");
                    return;
                }
                m37 m37Var = dq6Var.l;
                dq6.f(m37Var);
                dq6Var.m().a.g.j();
                String str2 = (String) pair.first;
                long jA2 = xj6Var5.r.a() - 1;
                dq6 dq6Var4 = m37Var.a;
                try {
                    oa3.e(str2);
                    oa3.e(strJ);
                    String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 73000L, Integer.valueOf(m37Var.e0())), str2, strJ, Long.valueOf(jA2));
                    if (strJ.equals(dq6Var4.g.f("debug.deferred.deeplink"))) {
                        strConcat = strConcat.concat("&ddl_test=1");
                    }
                    url = new URL(strConcat);
                } catch (IllegalArgumentException | MalformedURLException e3) {
                    bi6 bi6Var5 = dq6Var4.i;
                    dq6.h(bi6Var5);
                    bi6Var5.f.c(e3.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                    url = null;
                }
                if (url != null) {
                    dq6.h(ly6Var);
                    ta2 ta2Var = new ta2(dq6Var, 13);
                    ly6Var.e();
                    ly6Var.g();
                    ro6 ro6Var2 = dq6Var3.j;
                    dq6.h(ro6Var2);
                    ro6Var2.l(new jy6(ly6Var, strJ, url, ta2Var));
                    return;
                }
                return;
            case 7:
                s07 s07Var = (s07) this.x;
                u07 u07Var = s07Var.c;
                Context context2 = u07Var.a.a;
                s07Var.c.a.getClass();
                u07.s(u07Var, new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 8:
                r17 r17Var = (r17) this.x;
                cq4 cq4Var = r17Var.y;
                long j3 = r17Var.w;
                ((w17) cq4Var.y).e();
                bi6 bi6Var6 = ((w17) cq4Var.y).a.i;
                dq6.h(bi6Var6);
                bi6Var6.m.b("Application going to the background");
                xj6 xj6Var6 = ((w17) cq4Var.y).a.h;
                dq6.f(xj6Var6);
                xj6Var6.p.a(true);
                Bundle bundle = new Bundle();
                if (!((w17) cq4Var.y).a.g.o()) {
                    t17 t17Var = ((w17) cq4Var.y).e;
                    long j4 = r17Var.x;
                    t17Var.c.a();
                    ((w17) cq4Var.y).e.a(j4, false, false);
                }
                dy6 dy6Var2 = ((w17) cq4Var.y).a.p;
                dq6.g(dy6Var2);
                dy6Var2.m(j3, bundle, "auto", "_ab");
                return;
            default:
                synchronized (((pw6) this.x).x) {
                    ju2 ju2Var = ((pw6) this.x).y;
                    if (ju2Var != null) {
                        ju2Var.c();
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ o17(u27 u27Var) {
        this.w = 5;
        this.x = u27Var;
    }
}
