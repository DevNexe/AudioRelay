package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.CQf;
import com.android.billingclient.api.NUlFixed;
import com.android.billingclient.api.T23;
import com.google.android.gms.internal.play_billing.zze;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.NRbR;
import defpackage.a36;
import defpackage.ah3;
import defpackage.bh3;
import defpackage.cq4;
import defpackage.db7;
import defpackage.es5;
import defpackage.ev5;
import defpackage.fa;
import defpackage.gd7;
import defpackage.k70;
import defpackage.nm4;
import defpackage.o17;
import defpackage.p87;
import defpackage.qb7;
import defpackage.qw6;
import defpackage.r36;
import defpackage.ra7;
import defpackage.ta7;
import defpackage.tb7;
import defpackage.v9L;
import defpackage.vt5;
import defpackage.wv5;
import defpackage.xg3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class CQf extends QnHx {
    public volatile int a;
    public final String b;
    public final Handler c;
    public volatile cq4 d;
    public Context e;
    public volatile zze f;
    public volatile auxFixed g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public ExecutorService v;

    public CQf(boolean z, Context context, bh3 bh3Var) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "4.1.0";
        }
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.j = 0;
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.d = new cq4(applicationContext, bh3Var);
        this.t = z;
        this.u = false;
    }

    @Override // com.android.billingclient.api.QnHx
    public final void a(NRbR nRbR, com.revenuecat.purchases.google.QnHx qnHx) {
        if (!e()) {
            qnHx.a(T23.l);
            return;
        }
        if (TextUtils.isEmpty(nRbR.a)) {
            a36.f("BillingClient", "Please provide a valid purchase token.");
            qnHx.a(T23.i);
        } else if (!this.m) {
            qnHx.a(T23.b);
        } else if (o(new vt5(this, nRbR, qnHx, 1), 30000L, new o17(qnHx, 0), k()) == null) {
            qnHx.a(m());
        }
    }

    @Override // com.android.billingclient.api.QnHx
    public final void b(final k70 k70Var, final com.revenuecat.purchases.google.CQf cQf) {
        if (!e()) {
            cQf.a(T23.l, k70Var.a);
        } else if (o(new Callable() { // from class: u67
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int iA;
                String strD;
                CQf cQf2 = this.w;
                k70 k70Var2 = k70Var;
                com.revenuecat.purchases.google.CQf cQf3 = cQf;
                cQf2.getClass();
                String str = k70Var2.a;
                try {
                    String strValueOf = String.valueOf(str);
                    a36.e("BillingClient", strValueOf.length() != 0 ? "Consuming purchase with token: ".concat(strValueOf) : new String("Consuming purchase with token: "));
                    if (cQf2.m) {
                        zze zzeVar = cQf2.f;
                        String packageName = cQf2.e.getPackageName();
                        boolean z = cQf2.m;
                        String str2 = cQf2.b;
                        Bundle bundle = new Bundle();
                        if (z) {
                            bundle.putString("playBillingLibraryVersion", str2);
                        }
                        Bundle bundleH0 = zzeVar.H0(packageName, str, bundle);
                        iA = bundleH0.getInt("RESPONSE_CODE");
                        strD = a36.d(bundleH0, "BillingClient");
                    } else {
                        iA = cQf2.f.a(cQf2.e.getPackageName(), str);
                        strD = "";
                    }
                    NUlFixed nUl = new NUlFixed();
                    nUl.a = iA;
                    nUl.b = strD;
                    if (iA == 0) {
                        a36.e("BillingClient", "Successfully consumed purchase.");
                        cQf3.a(nUl, str);
                        return null;
                    }
                    StringBuilder sb = new StringBuilder(63);
                    sb.append("Error consuming purchase with token. Response code: ");
                    sb.append(iA);
                    a36.f("BillingClient", sb.toString());
                    cQf3.a(nUl, str);
                    return null;
                } catch (Exception e) {
                    a36.g("BillingClient", "Error consuming purchase!", e);
                    cQf3.a(T23.l, str);
                    return null;
                }
            }
        }, 30000L, new tb7(0, cQf, k70Var), k()) == null) {
            cQf.a(m(), k70Var.a);
        }
    }

    @Override // com.android.billingclient.api.QnHx
    public final void c() {
        try {
            try {
                this.d.l();
                if (this.g != null) {
                    auxFixed auxVar = this.g;
                    synchronized (auxVar.a) {
                        auxVar.c = null;
                        auxVar.b = true;
                    }
                }
                if (this.g != null && this.f != null) {
                    a36.e("BillingClient", "Unbinding from service.");
                    this.e.unbindService(this.g);
                    this.g = null;
                }
                this.f = null;
                ExecutorService executorService = this.v;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.v = null;
                }
                this.a = 3;
            } catch (Exception e) {
                a36.g("BillingClient", "There was an exception while ending connection!", e);
                this.a = 3;
            }
        } catch (Throwable th) {
            this.a = 3;
            throw th;
        }
    }

    @Override // com.android.billingclient.api.QnHx
    public final NUlFixed d(String str) {
        // Возвращаем статус поддержки для всех фич (subscriptions, subscriptionsUpdate и т.д.)
        return T23.k;
    }

    @Override // com.android.billingclient.api.QnHx
    public final boolean e() {
        // Всегда говорим, что BillingClient подключен и готов к работе
        return true;
    }

    @Override // com.android.billingclient.api.QnHx
    public final NUlFixed f(Activity activity, final F1 f1) {
        String str;
        Future futureO;
        boolean z;
        String str2;
        qb7 qb7Var;
        LPt8Fixed lPt8;
        JSONObject jSONObject;
        String str3;
        String str4;
        String str5;
        boolean z2;
        String str6;
        final int i;
        CQf cQf = this;
        if (!e()) {
            NUlFixed nUl = T23.l;
            cQf.l(nUl);
            return nUl;
        }
        f1.getClass();
        ArrayList<SkuDetails> arrayList = new ArrayList();
        arrayList.addAll(f1.g);
        qb7 qb7Var2 = f1.f;
        Iterator it = arrayList.iterator();
        SkuDetails skuDetails = (SkuDetails) (it.hasNext() ? it.next() : null);
        Iterator<E> it2 = qb7Var2.iterator();
        LPt8Fixed lPt9 = (LPt8Fixed) (it2.hasNext() ? it2.next() : null);
        skuDetails.getClass();
        JSONObject jSONObject2 = skuDetails.b;
        String strOptString = jSONObject2.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        final String strA = skuDetails.a();
        if (strA.equals("subs") && !cQf.h) {
            a36.f("BillingClient", "Current client doesn't support subscriptions.");
            NUlFixed nUl2 = T23.n;
            cQf.l(nUl2);
            return nUl2;
        }
        if (((!f1.h && f1.b == null && f1.d == null && f1.e == 0 && !f1.a) ? false : true) && !cQf.k) {
            a36.f("BillingClient", "Current client doesn't support extra params for buy intent.");
            NUlFixed nUl3 = T23.h;
            cQf.l(nUl3);
            return nUl3;
        }
        if (arrayList.size() > 1 && !cQf.r) {
            a36.f("BillingClient", "Current client doesn't support multi-item purchases.");
            NUlFixed nUl4 = T23.t;
            cQf.l(nUl4);
            return nUl4;
        }
        if (!qb7Var2.isEmpty() && !cQf.s) {
            a36.f("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            NUlFixed nUl5 = T23.v;
            cQf.l(nUl5);
            return nUl5;
        }
        boolean z3 = cQf.u;
        if (z3 && !cQf.k) {
            a36.f("BillingClient", "Current client doesn't support alternative billing.");
            NUlFixed nUl6 = T23.x;
            cQf.l(nUl6);
            return nUl6;
        }
        boolean z4 = cQf.k;
        Handler handler = cQf.c;
        if (z4) {
            boolean z5 = cQf.m;
            boolean z6 = cQf.t;
            int i2 = a36.a;
            final Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", cQf.b);
            int i3 = f1.e;
            if (i3 != 0) {
                bundle.putInt("prorationMode", i3);
            }
            if (!TextUtils.isEmpty(f1.b)) {
                bundle.putString("accountId", f1.b);
            }
            if (!TextUtils.isEmpty(f1.d)) {
                bundle.putString("obfuscatedProfileId", f1.d);
            }
            if (f1.h) {
                bundle.putBoolean("vr", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(f1.c)) {
                bundle.putString("oldSkuPurchaseToken", f1.c);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("paymentsPurchaseParams", null);
            }
            if (z5 && z6) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z3) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            String str7 = "additionalSkuTypes";
            if (arrayList.isEmpty()) {
                str2 = "proxyPackageVersion";
                qb7Var = qb7Var2;
                lPt8 = lPt9;
                jSONObject = jSONObject2;
                str3 = strOptString;
                str4 = "BillingClient";
                ArrayList<String> arrayList2 = new ArrayList<>(qb7Var.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(qb7Var.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                if (qb7Var.size() > 0) {
                    throw null;
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                ArrayList<String> arrayList6 = new ArrayList<>();
                str3 = strOptString;
                ArrayList<String> arrayList7 = new ArrayList<>();
                ArrayList<String> arrayList8 = new ArrayList<>();
                str2 = "proxyPackageVersion";
                ArrayList<Integer> arrayList9 = new ArrayList<>();
                str4 = "BillingClient";
                ArrayList<String> arrayList10 = new ArrayList<>();
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                for (SkuDetails skuDetails2 : arrayList) {
                    LPt8Fixed lPt10 = lPt9;
                    JSONObject jSONObject3 = jSONObject2;
                    boolean zIsEmpty = skuDetails2.b.optString("skuDetailsToken").isEmpty();
                    JSONObject jSONObject4 = skuDetails2.b;
                    if (!zIsEmpty) {
                        arrayList6.add(jSONObject4.optString("skuDetailsToken"));
                    }
                    String strOptString2 = jSONObject4.optString("offerIdToken");
                    if (strOptString2.isEmpty()) {
                        strOptString2 = jSONObject4.optString("offer_id_token");
                    }
                    String strOptString3 = jSONObject4.optString("offer_id");
                    qb7 qb7Var3 = qb7Var2;
                    int iOptInt = jSONObject4.optInt("offer_type");
                    String str8 = str7;
                    String strOptString4 = jSONObject4.optString("serializedDocid");
                    arrayList7.add(strOptString2);
                    z7 |= !TextUtils.isEmpty(strOptString2);
                    arrayList8.add(strOptString3);
                    z8 |= !TextUtils.isEmpty(strOptString3);
                    arrayList9.add(Integer.valueOf(iOptInt));
                    z9 |= iOptInt != 0;
                    z10 |= !TextUtils.isEmpty(strOptString4);
                    arrayList10.add(strOptString4);
                    jSONObject2 = jSONObject3;
                    lPt9 = lPt10;
                    qb7Var2 = qb7Var3;
                    str7 = str8;
                }
                qb7Var = qb7Var2;
                lPt8 = lPt9;
                String str9 = str7;
                jSONObject = jSONObject2;
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (z7) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                }
                if (z8) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList8);
                }
                if (z9) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList9);
                }
                if (z10) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayList.size() - 1);
                    for (int i4 = 1; i4 < arrayList.size(); i4++) {
                        arrayList11.add(((SkuDetails) arrayList.get(i4)).b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
                        arrayList12.add(((SkuDetails) arrayList.get(i4)).a());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList11);
                    bundle.putStringArrayList(str9, arrayList12);
                }
            }
            cQf = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !cQf.p) {
                NUlFixed nUl7 = T23.u;
                cQf.l(nUl7);
                return nUl7;
            }
            JSONObject jSONObject5 = jSONObject;
            if (!TextUtils.isEmpty(jSONObject5.optString("packageName"))) {
                bundle.putString("skuPackageName", jSONObject5.optString("packageName"));
                str5 = null;
                z2 = true;
            } else {
                if (lPt8 != null) {
                    throw null;
                }
                str5 = null;
                z2 = false;
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("accountName", str5);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                str = str4;
                a36.f(str, "Activity's intent is null.");
            } else {
                str = str4;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        str6 = str2;
                        try {
                            bundle.putString(str6, cQf.e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundle.putString(str6, "package not found");
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str6 = str2;
                    }
                }
            }
            if (cQf.s && !qb7Var.isEmpty()) {
                i = 17;
            } else if (cQf.q && z2) {
                i = 15;
            } else if (cQf.m) {
                i = 9;
            } else {
                i = f1.h ? 7 : 6;
            }
            final String str10 = str3;
            futureO = o(new Callable(i, str10, strA, f1, bundle) { // from class: y27
                public final /* synthetic */ Bundle A;
                public final /* synthetic */ int x;
                public final /* synthetic */ String y;
                public final /* synthetic */ String z;

                {
                    this.A = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    CQf cQf2 = this.w;
                    return cQf2.f.f(this.x, cQf2.e.getPackageName(), this.y, this.z, this.A);
                }
            }, 5000L, null, handler);
        } else {
            str = "BillingClient";
            futureO = o(new vt5(cQf, strOptString, strA, 2), 5000L, null, handler);
        }
        try {
            Bundle bundle2 = (Bundle) futureO.get(5000L, TimeUnit.MILLISECONDS);
            int iA = a36.a(bundle2, str);
            String strD = a36.d(bundle2, str);
            if (iA == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                activity.startActivity(intent2);
                return T23.k;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Unable to buy item, Error response code: ");
            sb.append(iA);
            a36.f(str, sb.toString());
            NUlFixed nUl8 = new NUlFixed();
            nUl8.a = iA;
            nUl8.b = strD;
            cQf.l(nUl8);
            return nUl8;
        } catch (CancellationException e) {
            e = e;
            a36.g(str, "Time out while launching billing flow. Try to reconnect", e);
            NUlFixed nUl9 = T23.m;
            cQf.l(nUl9);
            return nUl9;
        } catch (TimeoutException e2) {
            e = e2;
            a36.g(str, "Time out while launching billing flow. Try to reconnect", e);
            NUlFixed nUl10 = T23.m;
            cQf.l(nUl10);
            return nUl10;
        } catch (Exception e3) {
            a36.g(str, "Exception while launching billing flow. Try to reconnect", e3);
            NUlFixed nUl11 = T23.l;
            cQf.l(nUl11);
            return nUl11;
        }
    }

    @Override // com.android.billingclient.api.QnHx
    public final void g(String str, xg3 xg3Var) {
        if (!e()) {
            xg3Var.e(T23.l, null);
        } else if (o(new vt5(this, str, xg3Var, 0), 30000L, new o17(xg3Var, 1), k()) == null) {
            xg3Var.e(m(), null);
        }
    }

    @Override // com.android.billingclient.api.QnHx
    public final void h(String str, ah3 ah3Var) {
        if (!e()) {
            NUlFixed nUl = T23.l;
            ra7 ra7Var = qb7.x;
            ah3Var.b(nUl, es5.A);
        } else {
            if (TextUtils.isEmpty(str)) {
                a36.f("BillingClient", "Please provide a valid product type.");
                NUlFixed nUl2 = T23.g;
                ra7 ra7Var2 = qb7.x;
                ah3Var.b(nUl2, es5.A);
                return;
            }
            if (o(new YKK(this, str, ah3Var), 30000L, new wv5(ah3Var, 1), k()) == null) {
                NUlFixed nUlM = m();
                ra7 ra7Var3 = qb7.x;
                ah3Var.b(nUlM, es5.A);
            }
        }
    }

    @Override // com.android.billingclient.api.QnHx
    public final void i(nm4 nm4Var, v9L v9l) {
        if (!e()) {
            v9l.a(T23.l, null);
            return;
        }
        String str = nm4Var.a;
        List<String> list = nm4Var.b;
        if (TextUtils.isEmpty(str)) {
            a36.f("BillingClient", "Please fix the input params. SKU type can't be empty.");
            v9l.a(T23.f, null);
            return;
        }
        if (list == null) {
            a36.f("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            v9l.a(T23.e, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("SKU must be set.");
            }
            arrayList.add(new r36(str2));
        }
        if (o(new db7(this, str, arrayList, v9l), 30000L, new gd7(v9l, 0), k()) == null) {
            v9l.a(m(), null);
        }
    }

    @Override // com.android.billingclient.api.QnHx
    public final void j(fa faVar) {
        ServiceInfo serviceInfo;
        if (e()) {
            a36.e("BillingClient", "Service connection is valid. No need to re-initialize.");
            faVar.onBillingSetupFinished(T23.k);
            return;
        }
        if (this.a == 1) {
            a36.f("BillingClient", "Client is already in the process of connecting to billing service.");
            faVar.onBillingSetupFinished(T23.d);
            return;
        }
        if (this.a == 3) {
            a36.f("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            faVar.onBillingSetupFinished(T23.l);
            return;
        }
        this.a = 1;
        cq4 cq4Var = this.d;
        qw6 qw6Var = (qw6) cq4Var.y;
        Context context = (Context) cq4Var.x;
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        if (!qw6Var.b) {
            context.registerReceiver((qw6) qw6Var.c.y, intentFilter);
            qw6Var.b = true;
        }
        a36.e("BillingClient", "Starting in-app billing setup.");
        this.g = new auxFixed(this, faVar);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null) {
                a36.f("BillingClient", "The device doesn't have valid Play Store.");
            } else {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                intent2.putExtra("playBillingLibraryVersion", this.b);
                if (this.e.bindService(intent2, this.g, 1)) {
                    a36.e("BillingClient", "Service was bonded successfully.");
                    return;
                }
                a36.f("BillingClient", "Connection to Billing service is blocked.");
            }
        }
        this.a = 0;
        a36.e("BillingClient", "Billing service unavailable on device.");
        faVar.onBillingSetupFinished(T23.c);
    }

    public final Handler k() {
        return Looper.myLooper() == null ? this.c : new Handler(Looper.myLooper());
    }

    public final void l(NUlFixed nUl) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post(new ta7(0, this, nUl));
    }

    public final NUlFixed m() {
        return (this.a == 0 || this.a == 3) ? T23.l : T23.j;
    }

    public final NUlFixed n(String str) {
        try {
            return ((Integer) o(new p87(0, this, str), 5000L, null, k()).get(5000L, TimeUnit.MILLISECONDS)).intValue() == 0 ? T23.k : T23.r;
        } catch (Exception e) {
            a36.g("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
            return T23.l;
        }
    }

    public final Future o(Callable callable, long j, Runnable runnable, Handler handler) {
        long j2 = (long) (j * 0.95d);
        if (this.v == null) {
            this.v = Executors.newFixedThreadPool(a36.a, new ev5());
        }
        try {
            Future futureSubmit = this.v.submit(callable);
            handler.postDelayed(new ta7(1, futureSubmit, runnable), j2);
            return futureSubmit;
        } catch (Exception e) {
            a36.g("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public CQf(boolean z, Context context) {
        String str;
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.j = 0;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "4.1.0";
        }
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.d = new cq4(applicationContext, 0);
        this.t = z;
    }
}
