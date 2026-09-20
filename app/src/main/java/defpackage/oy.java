package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oy implements ez {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ oy(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0428  */
    /* JADX WARN: Code duplicated, block: B:114:0x0454  */
    /* JADX WARN: Code duplicated, block: B:56:0x028c  */
    /* JADX WARN: Code duplicated, block: B:68:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x03e1 A[Catch: Exception -> 0x0430, TryCatch #0 {Exception -> 0x0430, blocks: (B:73:0x0365, B:75:0x03af, B:77:0x03bb, B:79:0x03e1, B:84:0x03f0, B:86:0x03fe, B:76:0x03b8, B:74:0x03a9), top: B:122:0x0365, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x0407  */
    /* JADX WARN: Code duplicated, block: B:92:0x040a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0415 A[Catch: Exception -> 0x041d, TryCatch #1 {Exception -> 0x041d, blocks: (B:94:0x040f, B:96:0x0415, B:97:0x0419), top: B:124:0x040f }] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.ez
    public final Object a(cq3 cq3Var) {
        kc7<Void> kc7Var;
        w05 w05VarP;
        boolean z;
        Ncry ncry;
        boolean z2;
        ExecutorService executorService;
        String str;
        boolean z3;
        boolean zExists;
        boolean z4;
        boolean z5;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        qg4 qg4VarA;
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                return obj;
            default:
                ((CrashlyticsRegistrar) obj).getClass();
                qx0 qx0Var = (qx0) cq3Var.d(qx0.class);
                mi0 mi0VarQ0 = cq3Var.q0(yb0.class);
                mi0 mi0VarQ1 = cq3Var.q0(CSv.class);
                yx0 yx0Var = (yx0) cq3Var.d(yx0.class);
                qx0Var.a();
                Context context = qx0Var.a;
                String packageName = context.getPackageName();
                kK kKVar = kK.x;
                String strA = b70.a("Initializing Firebase Crashlytics 18.2.13 for ", packageName);
                if (kKVar.b(4)) {
                    Log.i("FirebaseCrashlytics", strA, null);
                }
                fx0 fx0Var = new fx0(context);
                oe0 oe0Var = new oe0(qx0Var);
                th1 th1Var = new th1(context, packageName, yx0Var, oe0Var);
                ac0 ac0Var = new ac0(mi0VarQ0);
                sm smVar = new sm(mi0VarQ1);
                vb0 vb0Var = new vb0(qx0Var, th1Var, ac0Var, oe0Var, new sn1(smVar, 8), new im3(smVar, 9), fx0Var, kv0.a("Crashlytics Exception Handler"));
                qx0Var.a();
                String str2 = qx0Var.c.b;
                String strE = kw.e(context);
                kKVar.c("Mapping file ID is: " + strE);
                fk0 fk0Var = new fk0(context);
                try {
                    String packageName2 = context.getPackageName();
                    String strD = th1Var.d();
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
                    String string = Integer.toString(packageInfo.versionCode);
                    String str3 = packageInfo.versionName;
                    if (str3 == null) {
                        str3 = "0.0";
                    }
                    String str4 = str3;
                    Ncry ncry2 = new Ncry(str2, strE, strD, packageName2, string, str4, fk0Var);
                    kKVar.h("Installer package name is: " + strD);
                    ExecutorService executorServiceA = kv0.a("com.google.firebase.crashlytics.startup");
                    sy4 sy4Var = new sy4((Object) null);
                    String strD2 = th1Var.d();
                    m57 m57Var = new m57();
                    ta2 ta2Var = new ta2(m57Var, 17);
                    pq2 pq2Var = new pq2(fx0Var);
                    Locale locale = Locale.US;
                    xi5 xi5Var = new xi5(String.format(locale, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str2), sy4Var);
                    String str5 = Build.MANUFACTURER;
                    String str6 = th1.h;
                    String str7 = String.format(locale, "%s/%s", str5.replaceAll(str6, ""), Build.MODEL.replaceAll(str6, ""));
                    String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str6, "");
                    String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str6, "");
                    String[] strArr = {kw.e(context), str2, str4, string};
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    for (int i3 = 4; i2 < i3; i3 = 4) {
                        String str8 = strArr[i2];
                        if (str8 != null) {
                            arrayList.add(str8.replace("-", "").toLowerCase(Locale.US));
                        }
                        i2++;
                    }
                    Collections.sort(arrayList);
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                    }
                    String string2 = sb.toString();
                    xg4 xg4Var = new xg4(context, new sh4(str2, str7, strReplaceAll, strReplaceAll2, th1Var, string2.length() > 0 ? kw.k(string2) : null, str4, string, fj0.b(strD2 != null ? 4 : 1)), m57Var, ta2Var, pq2Var, xi5Var, oe0Var);
                    boolean z6 = !xg4Var.a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(xg4Var.b.f);
                    AtomicReference<z05<qg4>> atomicReference = xg4Var.i;
                    AtomicReference<qg4> atomicReference2 = xg4Var.h;
                    if (z6 || (qg4VarA = xg4Var.a(1)) == null) {
                        qg4 qg4VarA2 = xg4Var.a(3);
                        if (qg4VarA2 != null) {
                            atomicReference2.set(qg4VarA2);
                            atomicReference.get().c(qg4VarA2);
                        }
                        oe0 oe0Var2 = xg4Var.g;
                        kc7<Void> kc7Var2 = oe0Var2.h.a;
                        synchronized (oe0Var2.c) {
                            kc7Var = oe0Var2.d.a;
                            break;
                        }
                        ExecutorService executorService2 = tf5.a;
                        z05 z05Var = new z05();
                        im3 im3Var = new im3(z05Var, 12);
                        kc7Var2.f(executorServiceA, im3Var);
                        kc7Var.f(executorServiceA, im3Var);
                        w05VarP = z05Var.a.p(executorServiceA, new wg4(xg4Var));
                    } else {
                        atomicReference2.set(qg4VarA);
                        atomicReference.get().c(qg4VarA);
                        w05VarP = k15.e(null);
                    }
                    w05VarP.f(executorServiceA, new qLd());
                    db0 db0Var = vb0Var.n;
                    fx0 fx0Var2 = vb0Var.j;
                    Context context2 = vb0Var.a;
                    if (context2 == null || (resources = context2.getResources()) == null) {
                        z = true;
                    } else {
                        int iF = kw.f(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (iF > 0) {
                            z = resources.getBoolean(iF);
                        } else {
                            int iF2 = kw.f(context2, "com.crashlytics.RequireBuildId", "string");
                            if (iF2 > 0) {
                                z = Boolean.parseBoolean(context2.getString(iF2));
                            } else {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        ncry = ncry2;
                        if (TextUtils.isEmpty(ncry.b)) {
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", ".     |  | ");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                            Log.e("FirebaseCrashlytics", ".    \\    /");
                            Log.e("FirebaseCrashlytics", ".     \\  /");
                            Log.e("FirebaseCrashlytics", ".      \\/");
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", ".      /\\");
                            Log.e("FirebaseCrashlytics", ".     /  \\");
                            Log.e("FirebaseCrashlytics", ".    /    \\");
                            Log.e("FirebaseCrashlytics", ".   / |  | \\");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".");
                            z2 = false;
                        }
                        if (z2) {
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                        }
                        new sk(vb0Var.i);
                        String str9 = sk.b;
                        try {
                            int i4 = 20;
                            vb0Var.f = new ss3(i4, "crash_marker", fx0Var2);
                            vb0Var.e = new ss3(i4, "initialization_marker", fx0Var2);
                            gf5 gf5Var = new gf5(str9, fx0Var2, db0Var);
                            m52 m52Var = new m52(fx0Var2);
                            executorService = executorServiceA;
                            try {
                                try {
                                    vb0Var.h = new rb0(vb0Var.a, vb0Var.n, vb0Var.i, vb0Var.b, vb0Var.j, vb0Var.f, ncry, gf5Var, m52Var, dg4.b(vb0Var.a, vb0Var.i, vb0Var.j, ncry, m52Var, gf5Var, new ss5(new nr4[]{new s56()}), xg4Var, vb0Var.c), vb0Var.o, vb0Var.l);
                                    ss3 ss3Var = vb0Var.e;
                                    fx0 fx0Var3 = (fx0) ss3Var.y;
                                    String str10 = (String) ss3Var.x;
                                    fx0Var3.getClass();
                                    zExists = new File(fx0Var3.b, str10).exists();
                                    try {
                                        vb0Var.g = Boolean.TRUE.equals((Boolean) tf5.a(db0Var.a(new wb0(vb0Var))));
                                    } catch (Exception unused) {
                                        vb0Var.g = false;
                                    }
                                    rb0 rb0Var = vb0Var.h;
                                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                    rb0Var.getClass();
                                    rb0Var.e.a(new pb0(rb0Var, str9));
                                    hc0 hc0Var = new hc0(new hb0(rb0Var), xg4Var, defaultUncaughtExceptionHandler, rb0Var.j);
                                    rb0Var.m = hc0Var;
                                    Thread.setDefaultUncaughtExceptionHandler(hc0Var);
                                    if (zExists) {
                                        if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting())) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            str = "FirebaseCrashlytics";
                                            try {
                                                if (Log.isLoggable(str, 3)) {
                                                    Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                                }
                                                vb0Var.b(xg4Var);
                                            } catch (Exception e) {
                                                e = e;
                                                Log.e(str, "Crashlytics was not started due to an exception during initialization", e);
                                                vb0Var.h = null;
                                            }
                                            z3 = false;
                                            break;
                                        }
                                        k15.c(new rx0(z3, vb0Var, xg4Var), executorService);
                                        return new FirebaseCrashlytics(vb0Var);
                                    }
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                                    }
                                    z3 = true;
                                } catch (Exception e2) {
                                    e = e2;
                                    str = "FirebaseCrashlytics";
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str = "FirebaseCrashlytics";
                                Log.e(str, "Crashlytics was not started due to an exception during initialization", e);
                                vb0Var.h = null;
                                z3 = false;
                                k15.c(new rx0(z3, vb0Var, xg4Var), executorService);
                                return new FirebaseCrashlytics(vb0Var);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            executorService = executorServiceA;
                        }
                        k15.c(new rx0(z3, vb0Var, xg4Var), executorService);
                        return new FirebaseCrashlytics(vb0Var);
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                    }
                    ncry = ncry2;
                    z2 = true;
                    if (z2) {
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                    }
                    new sk(vb0Var.i);
                    String str11 = sk.b;
                    int i5 = 20;
                    vb0Var.f = new ss3(i5, "crash_marker", fx0Var2);
                    vb0Var.e = new ss3(i5, "initialization_marker", fx0Var2);
                    gf5 gf5Var2 = new gf5(str11, fx0Var2, db0Var);
                    m52 m52Var2 = new m52(fx0Var2);
                    executorService = executorServiceA;
                    vb0Var.h = new rb0(vb0Var.a, vb0Var.n, vb0Var.i, vb0Var.b, vb0Var.j, vb0Var.f, ncry, gf5Var2, m52Var2, dg4.b(vb0Var.a, vb0Var.i, vb0Var.j, ncry, m52Var2, gf5Var2, new ss5(new nr4[]{new s56()}), xg4Var, vb0Var.c), vb0Var.o, vb0Var.l);
                    ss3 ss3Var2 = vb0Var.e;
                    fx0 fx0Var4 = (fx0) ss3Var2.y;
                    String str12 = (String) ss3Var2.x;
                    fx0Var4.getClass();
                    zExists = new File(fx0Var4.b, str12).exists();
                    vb0Var.g = Boolean.TRUE.equals((Boolean) tf5.a(db0Var.a(new wb0(vb0Var))));
                    rb0 rb0Var2 = vb0Var.h;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    rb0Var2.getClass();
                    rb0Var2.e.a(new pb0(rb0Var2, str11));
                    hc0 hc0Var2 = new hc0(new hb0(rb0Var2), xg4Var, defaultUncaughtExceptionHandler2, rb0Var2.j);
                    rb0Var2.m = hc0Var2;
                    Thread.setDefaultUncaughtExceptionHandler(hc0Var2);
                    if (zExists) {
                        if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            str = "FirebaseCrashlytics";
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            vb0Var.b(xg4Var);
                            z3 = false;
                        }
                        k15.c(new rx0(z3, vb0Var, xg4Var), executorService);
                        return new FirebaseCrashlytics(vb0Var);
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                    }
                    z3 = true;
                    k15.c(new rx0(z3, vb0Var, xg4Var), executorService);
                    return new FirebaseCrashlytics(vb0Var);
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e5);
                    return null;
                }
        }
    }
}
