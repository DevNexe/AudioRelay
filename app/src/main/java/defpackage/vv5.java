package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class vv5 extends dv6 {
    public Boolean b;
    public cv5 c;
    public Boolean d;

    public vv5(dq6 dq6Var) {
        super(dq6Var);
        this.c = ac.d;
    }

    public final String f(String str) {
        dq6 dq6Var = this.a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            oa3.h(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.c(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.f.c(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            bi6 bi6Var3 = dq6Var.i;
            dq6.h(bi6Var3);
            bi6Var3.f.c(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            bi6 bi6Var4 = dq6Var.i;
            dq6.h(bi6Var4);
            bi6Var4.f.c(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final double g(String str, jg6 jg6Var) {
        if (str == null) {
            return ((Double) jg6Var.a(null)).doubleValue();
        }
        String strA = this.c.a(str, jg6Var.a);
        if (TextUtils.isEmpty(strA)) {
            return ((Double) jg6Var.a(null)).doubleValue();
        }
        try {
            return ((Double) jg6Var.a(Double.valueOf(Double.parseDouble(strA)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) jg6Var.a(null)).doubleValue();
        }
    }

    public final int h() {
        m37 m37Var = this.a.l;
        dq6.f(m37Var);
        Boolean bool = m37Var.a.q().e;
        if (m37Var.e0() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int i(String str, jg6 jg6Var) {
        if (str == null) {
            return ((Integer) jg6Var.a(null)).intValue();
        }
        String strA = this.c.a(str, jg6Var.a);
        if (TextUtils.isEmpty(strA)) {
            return ((Integer) jg6Var.a(null)).intValue();
        }
        try {
            return ((Integer) jg6Var.a(Integer.valueOf(Integer.parseInt(strA)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) jg6Var.a(null)).intValue();
        }
    }

    public final void j() {
        this.a.getClass();
    }

    public final long k(String str, jg6 jg6Var) {
        if (str == null) {
            return ((Long) jg6Var.a(null)).longValue();
        }
        String strA = this.c.a(str, jg6Var.a);
        if (TextUtils.isEmpty(strA)) {
            return ((Long) jg6Var.a(null)).longValue();
        }
        try {
            return ((Long) jg6Var.a(Long.valueOf(Long.parseLong(strA)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) jg6Var.a(null)).longValue();
        }
    }

    public final Bundle l() {
        dq6 dq6Var = this.a;
        try {
            if (dq6Var.a.getPackageManager() == null) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.f.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = so5.a(dq6Var.a).a(128, dq6Var.a.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.f.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            bi6 bi6Var3 = dq6Var.i;
            dq6.h(bi6Var3);
            bi6Var3.f.c(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean m(String str) {
        oa3.e(str);
        Bundle bundleL = l();
        if (bundleL != null) {
            if (bundleL.containsKey(str)) {
                return Boolean.valueOf(bundleL.getBoolean(str));
            }
            return null;
        }
        bi6 bi6Var = this.a.i;
        dq6.h(bi6Var);
        bi6Var.f.b("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean n(String str, jg6 jg6Var) {
        if (str == null) {
            return ((Boolean) jg6Var.a(null)).booleanValue();
        }
        String strA = this.c.a(str, jg6Var.a);
        return TextUtils.isEmpty(strA) ? ((Boolean) jg6Var.a(null)).booleanValue() : ((Boolean) jg6Var.a(Boolean.valueOf("1".equals(strA)))).booleanValue();
    }

    public final boolean o() {
        Boolean boolM = m("google_analytics_automatic_screen_reporting_enabled");
        return boolM == null || boolM.booleanValue();
    }

    public final boolean p() {
        this.a.getClass();
        Boolean boolM = m("firebase_analytics_collection_deactivated");
        return boolM != null && boolM.booleanValue();
    }

    public final boolean q(String str) {
        return "1".equals(this.c.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean r() {
        if (this.b == null) {
            Boolean boolM = m("app_measurement_lite");
            this.b = boolM;
            if (boolM == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.e;
    }
}
