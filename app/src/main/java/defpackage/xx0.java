package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class xx0 implements yx0 {
    public static final Object m = new Object();
    public static final QnHx n = new QnHx();
    public final qx0 a;
    public final ux0 b;
    public final w03 c;
    public final sf5 d;
    public final nz1<aj1> e;
    public final zh3 f;
    public final Object g;
    public final ExecutorService h;
    public final ThreadPoolExecutor i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    public class QnHx implements ThreadFactory {
        public final AtomicInteger w = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.w.getAndIncrement())));
        }
    }

    public xx0() {
        throw null;
    }

    public xx0(qx0 qx0Var, pg3<sc1> pg3Var) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        QnHx qnHx = n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, qnHx);
        qx0Var.a();
        ux0 ux0Var = new ux0(qx0Var.a, pg3Var);
        w03 w03Var = new w03(qx0Var);
        if (lf0.w == null) {
            lf0.w = new lf0();
        }
        lf0 lf0Var = lf0.w;
        if (sf5.d == null) {
            sf5.d = new sf5(lf0Var);
        }
        sf5 sf5Var = sf5.d;
        nz1<aj1> nz1Var = new nz1<>(new az(qx0Var, 1));
        zh3 zh3Var = new zh3();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = qx0Var;
        this.b = ux0Var;
        this.c = w03Var;
        this.d = sf5Var;
        this.e = nz1Var;
        this.f = zh3Var;
        this.h = threadPoolExecutor;
        this.i = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), qnHx);
    }

    @Override // defpackage.yx0
    public final kc7 a() {
        d();
        z05 z05Var = new z05();
        ca1 ca1Var = new ca1(this.d, z05Var);
        synchronized (this.g) {
            this.l.add(ca1Var);
        }
        this.h.execute(new Runnable() { // from class: wx0
            public final /* synthetic */ boolean x = false;

            @Override // java.lang.Runnable
            public final void run() {
                this.w.b(this.x);
            }
        });
        return z05Var.a;
    }

    public final void b(final boolean z) {
        z3 z3VarC;
        synchronized (m) {
            qx0 qx0Var = this.a;
            qx0Var.a();
            ss3 ss3VarC = ss3.c(qx0Var.a);
            try {
                z3VarC = this.c.c();
                int i = z3VarC.c;
                boolean z2 = true;
                if (i != 2 && i != 1) {
                    z2 = false;
                }
                if (z2) {
                    String strE = e(z3VarC);
                    w03 w03Var = this.c;
                    z3.QnHx qnHx = new z3.QnHx(z3VarC);
                    qnHx.a = strE;
                    qnHx.b(3);
                    z3VarC = qnHx.a();
                    w03Var.b(z3VarC);
                }
                if (ss3VarC != null) {
                    ss3VarC.f();
                }
            } catch (Throwable th) {
                if (ss3VarC != null) {
                    ss3VarC.f();
                }
                throw th;
            }
        }
        if (z) {
            z3.QnHx qnHx2 = new z3.QnHx(z3VarC);
            qnHx2.c = null;
            z3VarC = qnHx2.a();
        }
        h(z3VarC);
        this.i.execute(new Runnable() { // from class: vx0
            @Override // java.lang.Runnable
            public final void run() {
                z3 z3VarC2;
                z3 z3VarF;
                xx0 xx0Var = this.w;
                boolean z3 = z;
                xx0Var.getClass();
                Object obj = xx0.m;
                synchronized (obj) {
                    qx0 qx0Var2 = xx0Var.a;
                    qx0Var2.a();
                    ss3 ss3VarC2 = ss3.c(qx0Var2.a);
                    try {
                        z3VarC2 = xx0Var.c.c();
                        if (ss3VarC2 != null) {
                            ss3VarC2.f();
                        }
                    } catch (Throwable th2) {
                        if (ss3VarC2 != null) {
                            ss3VarC2.f();
                        }
                        throw th2;
                    }
                }
                try {
                    boolean z4 = true;
                    if (z3VarC2.f() == 5) {
                        z3VarF = xx0Var.f(z3VarC2);
                    } else {
                        if (z3VarC2.f() == 3) {
                            z3VarF = xx0Var.f(z3VarC2);
                        } else {
                            if (!z3 && !xx0Var.d.a(z3VarC2)) {
                                return;
                            }
                            z3VarF = xx0Var.c(z3VarC2);
                        }
                    }
                    synchronized (obj) {
                        qx0 qx0Var3 = xx0Var.a;
                        qx0Var3.a();
                        ss3 ss3VarC3 = ss3.c(qx0Var3.a);
                        try {
                            xx0Var.c.b(z3VarF);
                            if (ss3VarC3 != null) {
                                ss3VarC3.f();
                            }
                        } catch (Throwable th3) {
                            if (ss3VarC3 != null) {
                                ss3VarC3.f();
                            }
                            throw th3;
                        }
                    }
                    synchronized (xx0Var) {
                        if (xx0Var.k.size() != 0 && !TextUtils.equals(z3VarC2.b, z3VarF.b)) {
                            Iterator it = xx0Var.k.iterator();
                            while (it.hasNext()) {
                                ((xw0) it.next()).a();
                            }
                        }
                    }
                    if (z3VarF.f() == 4) {
                        String str = z3VarF.b;
                        synchronized (xx0Var) {
                            xx0Var.j = str;
                        }
                    }
                    if (z3VarF.f() == 5) {
                        xx0Var.g(new FirebaseInstallationsException());
                        return;
                    }
                    int i2 = z3VarF.c;
                    if (i2 != 2 && i2 != 1) {
                        z4 = false;
                    }
                    if (z4) {
                        xx0Var.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    } else {
                        xx0Var.h(z3VarF);
                    }
                } catch (FirebaseInstallationsException e) {
                    xx0Var.g(e);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r2v15, types: [i4] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
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
    public final z3 c(z3 z3Var) throws FirebaseInstallationsException {
        ?? r10;
        boolean z;
        i4 i4Var;
        HttpURLConnection httpURLConnectionC;
        String str;
        qx0 qx0Var = this.a;
        qx0Var.a();
        String str2 = qx0Var.c.a;
        String str3 = z3Var.b;
        qx0 qx0Var2 = this.a;
        qx0Var2.a();
        String str4 = qx0Var2.c.g;
        String str5 = z3Var.e;
        ux0 ux0Var = this.b;
        jp3 jp3Var = ux0Var.c;
        synchronized (jp3Var) {
            r10 = 1;
            if (jp3Var.c != 0) {
                jp3Var.a.a.getClass();
                if (System.currentTimeMillis() > jp3Var.b) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
        }
        String str6 = "Firebase Installations Service is unavailable. Please try again later.";
        if (!z) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        int i = 2;
        URL urlA = ux0.a(String.format("projects/%s/installations/%s/authTokens:generate", str4, str3));
        int i2 = 0;
        while (true) {
            if (i2 > r10) {
                i4Var = str2;
                throw new FirebaseInstallationsException(str6);
            }
            i4Var = str2;
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = ux0Var.c(urlA, i4Var);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    httpURLConnectionC.setDoOutput(r10);
                    ux0.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    jp3Var.a(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        i4Var = ux0.f(httpURLConnectionC);
                        str = str6;
                        break;
                    }
                    ux0.b(httpURLConnectionC, null, i4Var, str4);
                    if (responseCode == 401 || responseCode == 404) {
                        try {
                            str = str6;
                            Long l = 0L;
                            String str7 = l == null ? " tokenExpirationTimestamp" : "";
                            if (str7.isEmpty()) {
                                i4Var = new i4(null, l.longValue(), 3);
                                break;
                            }
                            str6 = str;
                            try {
                                throw new IllegalStateException("Missing required properties:".concat(str7));
                            } catch (IOException | AssertionError unused) {
                                continue;
                            }
                        } catch (IOException | AssertionError unused2) {
                            str6 = str;
                        }
                    } else {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            try {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                Long l2 = 0L;
                                String str8 = l2 == null ? " tokenExpirationTimestamp" : "";
                                if (!str8.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str8));
                                }
                                str = str6;
                                i4Var = new i4(null, l2.longValue(), i);
                                break;
                            } catch (IOException | AssertionError unused3) {
                                str = str6;
                                str6 = str;
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i2++;
                                i = 2;
                                r10 = 1;
                                i4Var = i4Var;
                            }
                        }
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    i = 2;
                    r10 = 1;
                    i4Var = i4Var;
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused4) {
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iH = O.h(i4Var.c);
        if (iH == 0) {
            sf5 sf5Var = this.d;
            sf5Var.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            sf5Var.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            z3.QnHx qnHx = new z3.QnHx(z3Var);
            qnHx.c = i4Var.a;
            qnHx.e = Long.valueOf(i4Var.b);
            qnHx.f = Long.valueOf(seconds);
            return qnHx.a();
        }
        if (iH == 1) {
            z3.QnHx qnHxH = z3Var.h();
            qnHxH.g = "BAD CONFIG";
            qnHxH.b(5);
            return qnHxH.a();
        }
        if (iH != 2) {
            throw new FirebaseInstallationsException(str);
        }
        synchronized (this) {
            this.j = null;
        }
        z3.QnHx qnHx2 = new z3.QnHx(z3Var);
        qnHx2.b(2);
        return qnHx2.a();
    }

    public final void d() {
        qx0 qx0Var = this.a;
        qx0Var.a();
        oa3.f("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", qx0Var.c.b);
        qx0Var.a();
        oa3.f("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", qx0Var.c.g);
        qx0Var.a();
        oa3.f("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", qx0Var.c.a);
        qx0Var.a();
        String str = qx0Var.c.b;
        Pattern pattern = sf5.c;
        oa3.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        qx0Var.a();
        oa3.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", sf5.c.matcher(qx0Var.c.a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[Catch: all -> 0x0065, DONT_GENERATE, TRY_ENTER, TryCatch #1 {, blocks: (B:15:0x003c, B:16:0x003e, B:20:0x004b, B:22:0x004d, B:23:0x0051, B:30:0x0064, B:17:0x003f, B:18:0x0048), top: B:36:0x003c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[Catch: all -> 0x0065, TryCatch #1 {, blocks: (B:15:0x003c, B:16:0x003e, B:20:0x004b, B:22:0x004d, B:23:0x0051, B:30:0x0064, B:17:0x003f, B:18:0x0048), top: B:36:0x003c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    /* JADX WARN: Instruction removed from duplicated block: B:6:0x001e, please report this as an issue */
    public final String e(z3 z3Var) {
        aj1 aj1Var;
        String string;
        qx0 qx0Var = this.a;
        qx0Var.a();
        if (qx0Var.b.equals("CHIME_ANDROID_SDK")) {
            if (z3Var.c == 1) {
                aj1Var = this.e.get();
                synchronized (aj1Var.a) {
                    synchronized (aj1Var.a) {
                        string = aj1Var.a.getString("|S|id", null);
                        if (string != null) {
                            string = aj1Var.a();
                        }
                        if (TextUtils.isEmpty(string)) {
                            return string;
                        }
                        this.f.getClass();
                        return zh3.a();
                    }
                }
            }
        } else {
            qx0 qx0Var2 = this.a;
            qx0Var2.a();
            if ("[DEFAULT]".equals(qx0Var2.b)) {
                if (z3Var.c == 1) {
                    aj1Var = this.e.get();
                    synchronized (aj1Var.a) {
                        synchronized (aj1Var.a) {
                            string = aj1Var.a.getString("|S|id", null);
                        }
                        if (string != null) {
                            string = aj1Var.a();
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return zh3.a();
                }
            }
        }
        this.f.getClass();
        return zh3.a();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    public final z3 f(z3 z3Var) throws FirebaseInstallationsException {
        boolean z;
        r3 r3VarE;
        String str = z3Var.b;
        String string = null;
        if (str != null && str.length() == 11) {
            aj1 aj1Var = this.e.get();
            synchronized (aj1Var.a) {
                String[] strArr = aj1.c;
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        break;
                    }
                    String str2 = strArr[i];
                    String string2 = aj1Var.a.getString("|T|" + aj1Var.b + "|" + str2, null);
                    if (string2 != null && !string2.isEmpty()) {
                        if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString("token");
                            } catch (JSONException unused) {
                            }
                        } else {
                            string = string2;
                        }
                        break;
                    }
                    i++;
                }
            }
        }
        ux0 ux0Var = this.b;
        qx0 qx0Var = this.a;
        qx0Var.a();
        String str3 = qx0Var.c.a;
        String str4 = z3Var.b;
        qx0 qx0Var2 = this.a;
        qx0Var2.a();
        String str5 = qx0Var2.c.g;
        qx0 qx0Var3 = this.a;
        qx0Var3.a();
        String str6 = qx0Var3.c.b;
        jp3 jp3Var = ux0Var.c;
        synchronized (jp3Var) {
            if (jp3Var.c != 0) {
                jp3Var.a.a.getClass();
                if (System.currentTimeMillis() > jp3Var.b) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
        }
        if (!z) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = ux0.a(String.format("projects/%s/installations", str5));
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = ux0Var.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    ux0.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    jp3Var.a(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        r3VarE = ux0.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    ux0.b(httpURLConnectionC, str6, str3, str5);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        try {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            r3 r3Var = new r3(null, null, null, null, 2);
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            r3VarE = r3Var;
                            break;
                        } catch (IOException | AssertionError unused2) {
                        }
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused3) {
            }
        }
        int iH = O.h(r3VarE.e);
        if (iH != 0) {
            if (iH != 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            z3.QnHx qnHxH = z3Var.h();
            qnHxH.g = "BAD CONFIG";
            qnHxH.b(5);
            return qnHxH.a();
        }
        String str7 = r3VarE.b;
        String str8 = r3VarE.c;
        sf5 sf5Var = this.d;
        sf5Var.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sf5Var.a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        String strB = r3VarE.d.b();
        long jC = r3VarE.d.c();
        z3.QnHx qnHx = new z3.QnHx(z3Var);
        qnHx.a = str7;
        qnHx.b(4);
        qnHx.c = strB;
        qnHx.d = str8;
        qnHx.e = Long.valueOf(jC);
        qnHx.f = Long.valueOf(seconds);
        return qnHx.a();
    }

    public final void g(Exception exc) {
        synchronized (this.g) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                if (((qs4) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    @Override // defpackage.yx0
    public final kc7 getId() {
        String str;
        d();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return k15.e(str);
        }
        z05 z05Var = new z05();
        da1 da1Var = new da1(z05Var);
        synchronized (this.g) {
            this.l.add(da1Var);
        }
        kc7<TResult> kc7Var = z05Var.a;
        this.h.execute(new u85(this, 6));
        return kc7Var;
    }

    public final void h(z3 z3Var) {
        synchronized (this.g) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                if (((qs4) it.next()).b(z3Var)) {
                    it.remove();
                }
            }
        }
    }
}
