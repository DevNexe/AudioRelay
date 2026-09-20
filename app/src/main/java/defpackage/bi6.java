package defpackage;

import android.text.TextUtils;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class bi6 extends sv6 {
    public char c;
    public long d;
    public String e;
    public final wh6 f;
    public final wh6 g;
    public final wh6 h;
    public final wh6 i;
    public final wh6 j;
    public final wh6 k;
    public final wh6 l;
    public final wh6 m;
    public final wh6 n;

    public bi6(dq6 dq6Var) {
        super(dq6Var);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new wh6(this, 6, false, false);
        this.g = new wh6(this, 6, true, false);
        this.h = new wh6(this, 6, false, true);
        this.i = new wh6(this, 5, false, false);
        this.j = new wh6(this, 5, true, false);
        this.k = new wh6(this, 5, false, true);
        this.l = new wh6(this, 4, false, false);
        this.m = new wh6(this, 3, false, false);
        this.n = new wh6(this, 2, false, false);
    }

    public static zh6 n(String str) {
        if (str == null) {
            return null;
        }
        return new zh6(str);
    }

    public static String o(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strP = p(obj, z);
        String strP2 = p(obj2, z);
        String strP3 = p(obj3, z);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strP)) {
            sb.append(str2);
            sb.append(strP);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strP2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strP2);
        }
        if (!TextUtils.isEmpty(strP3)) {
            sb.append(str3);
            sb.append(strP3);
        }
        return sb.toString();
    }

    public static String p(Object obj, boolean z) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            String str = obj.toString().charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof zh6) {
                return ((zh6) obj).a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = dq6.class.getCanonicalName();
        if (TextUtils.isEmpty(canonicalName)) {
            canonicalName = "";
        } else {
            int iLastIndexOf = canonicalName.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                canonicalName = canonicalName.substring(0, iLastIndexOf);
            }
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (TextUtils.isEmpty(className)) {
                    className = "";
                } else {
                    int iLastIndexOf2 = className.lastIndexOf(46);
                    if (iLastIndexOf2 != -1) {
                        className = className.substring(0, iLastIndexOf2);
                    }
                }
                if (className.equals(canonicalName)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb.toString();
    }

    @Override // defpackage.sv6
    public final boolean f() {
        return false;
    }

    public final wh6 i() {
        return this.m;
    }

    public final wh6 j() {
        return this.f;
    }

    public final wh6 k() {
        return this.n;
    }

    public final wh6 l() {
        return this.i;
    }

    public final wh6 m() {
        return this.k;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String q() {
        String str;
        synchronized (this) {
            try {
                if (this.e == null) {
                    dq6 dq6Var = this.a;
                    String str2 = dq6Var.d;
                    if (str2 != null) {
                        this.e = str2;
                    } else {
                        dq6Var.g.a.getClass();
                        this.e = "FA";
                    }
                }
                oa3.h(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void r(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(q(), i)) {
            Log.println(i, q(), o(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        oa3.h(str);
        ro6 ro6Var = this.a.j;
        if (ro6Var == null) {
            Log.println(6, q(), "Scheduler not set. Not logging error/warn");
        } else if (ro6Var.b) {
            ro6Var.m(new th6(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        } else {
            Log.println(6, q(), "Scheduler not initialized. Not logging error/warn");
        }
    }
}
