package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class wg6 extends kj6 {
    public String c;
    public String d;
    public int e;
    public String f;
    public long g;
    public final long h;
    public List i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public long o;
    public String p;

    public wg6(dq6 dq6Var, long j) {
        super(dq6Var);
        this.o = 0L;
        this.p = null;
        this.h = j;
    }

    @Override // defpackage.kj6
    public final boolean h() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0206  */
    /* JADX WARN: Code duplicated, block: B:103:0x020d  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:84:0x01be A[Catch: NotFoundException -> 0x01c3, TRY_LEAVE, TryCatch #5 {NotFoundException -> 0x01c3, blocks: (B:81:0x01ad, B:84:0x01be), top: B:116:0x01ad }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:99:0x0202  */
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    public final void i() {
        String str;
        Integer numValueOf;
        String[] stringArray;
        Iterator it;
        String str2;
        m37 m37Var;
        String string;
        dq6 dq6Var = this.a;
        Context context = dq6Var.a;
        String strA = dq6Var.s;
        String packageName = context.getPackageName();
        Context context2 = dq6Var.a;
        PackageManager packageManager = context2.getPackageManager();
        bi6 bi6Var = dq6Var.i;
        String str3 = "Unknown";
        int i = Integer.MIN_VALUE;
        String installerPackageName = "unknown";
        if (packageManager == null) {
            dq6.h(bi6Var);
            bi6Var.f.c(bi6.n(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                dq6.h(bi6Var);
                bi6Var.f.c(bi6.n(packageName), "Error retrieving app installer package name. appId");
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String string2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        str3 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str3;
                        str3 = string2;
                        dq6.h(bi6Var);
                        bi6Var.f.d(bi6.n(packageName), "Error retrieving package info. appId, appName", str3);
                        str3 = str;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
        }
        this.c = packageName;
        this.f = installerPackageName;
        this.d = str3;
        this.e = i;
        this.g = 0L;
        String str4 = dq6Var.b;
        boolean z = !TextUtils.isEmpty(str4) && "am".equals(dq6Var.c);
        int i2 = dq6Var.i();
        switch (i2) {
            case 0:
                dq6.h(bi6Var);
                bi6Var.n.b("App measurement collection enabled");
                break;
            case 1:
                dq6.h(bi6Var);
                bi6Var.l.b("App measurement deactivated via the manifest");
                break;
            case 2:
                dq6.h(bi6Var);
                bi6Var.n.b("App measurement deactivated via the init parameters");
                break;
            case 3:
                dq6.h(bi6Var);
                bi6Var.l.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                dq6.h(bi6Var);
                bi6Var.l.b("App measurement disabled via the manifest");
                break;
            case 5:
                dq6.h(bi6Var);
                bi6Var.n.b("App measurement disabled via the init parameters");
                break;
            case 6:
                dq6.h(bi6Var);
                bi6Var.k.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                dq6.h(bi6Var);
                bi6Var.l.b("App measurement disabled via the global data collection setting");
                break;
            default:
                dq6.h(bi6Var);
                bi6Var.l.b("App measurement disabled due to denied storage consent");
                break;
        }
        this.l = "";
        this.m = "";
        if (z) {
            this.m = str4;
        }
        List listAsList = null;
        try {
            String strO = C0239D.O(context2, strA);
            this.l = true != TextUtils.isEmpty(strO) ? strO : "";
            if (!TextUtils.isEmpty(strO)) {
                oa3.h(context2);
                Resources resources = context2.getResources();
                if (TextUtils.isEmpty(strA)) {
                    strA = hm6.a(context2);
                }
                int identifier = resources.getIdentifier("admob_app_id", "string", strA);
                if (identifier == 0) {
                    string = null;
                } else {
                    try {
                        string = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused4) {
                        string = null;
                    }
                }
                this.m = string;
            }
            if (i2 == 0) {
                dq6.h(bi6Var);
                bi6Var.n.d(this.c, "App measurement enabled for app package, google app id", TextUtils.isEmpty(this.l) ? this.m : this.l);
            }
        } catch (IllegalStateException e) {
            dq6.h(bi6Var);
            bi6Var.f.d(bi6.n(packageName), "Fetching Google App Id failed with exception. appId", e);
        }
        this.i = null;
        vv5 vv5Var = dq6Var.g;
        vv5Var.getClass();
        oa3.e("analytics.safelisted_events");
        Bundle bundleL = vv5Var.l();
        dq6 dq6Var2 = vv5Var.a;
        if (bundleL != null) {
            if (bundleL.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleL.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = dq6Var2.a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    }
                } catch (Resources.NotFoundException e2) {
                    bi6 bi6Var2 = dq6Var2.i;
                    dq6.h(bi6Var2);
                    bi6Var2.f.c(e2, "Failed to load string array from metadata: resource not found");
                }
            }
            if (listAsList != null) {
                this.i = listAsList;
            } else if (listAsList.isEmpty()) {
                dq6.h(bi6Var);
                bi6Var.k.b("Safelisted event list is empty. Ignoring");
            } else {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        str2 = (String) it.next();
                        m37Var = dq6Var.l;
                        dq6.f(m37Var);
                    } else {
                        this.i = listAsList;
                    }
                } while (m37Var.K("safelisted event", str2));
            }
            if (packageManager != null) {
                this.k = fp1.h0(context2) ? 1 : 0;
            } else {
                this.k = 0;
            }
        }
        bi6 bi6Var3 = dq6Var2.i;
        dq6.h(bi6Var3);
        bi6Var3.f.b("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = dq6Var2.a.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList != null) {
            this.i = listAsList;
        } else if (listAsList.isEmpty()) {
            dq6.h(bi6Var);
            bi6Var.k.b("Safelisted event list is empty. Ignoring");
        } else {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    str2 = (String) it.next();
                    m37Var = dq6Var.l;
                    dq6.f(m37Var);
                } else {
                    this.i = listAsList;
                }
            } while (m37Var.K("safelisted event", str2));
        }
        if (packageManager != null) {
            this.k = fp1.h0(context2) ? 1 : 0;
        } else {
            this.k = 0;
        }
    }

    public final String j() {
        f();
        oa3.h(this.c);
        return this.c;
    }

    public final String k() {
        e();
        f();
        oa3.h(this.l);
        return this.l;
    }

    public final void l() {
        String str;
        e();
        dq6 dq6Var = this.a;
        xj6 xj6Var = dq6Var.h;
        dq6.f(xj6Var);
        boolean zF = xj6Var.k().f(hw5.ANALYTICS_STORAGE);
        bi6 bi6Var = dq6Var.i;
        if (zF) {
            byte[] bArr = new byte[16];
            m37 m37Var = dq6Var.l;
            dq6.f(m37Var);
            m37Var.n().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            dq6.h(bi6Var);
            bi6Var.m.b("Analytics Storage consent is not granted");
            str = null;
        }
        dq6.h(bi6Var);
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        bi6Var.m.b(String.format("Resetting session stitching token to %s", objArr));
        this.n = str;
        dq6Var.n.getClass();
        this.o = System.currentTimeMillis();
    }
}
