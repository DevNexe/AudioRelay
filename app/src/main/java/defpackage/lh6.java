package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class lh6 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final dv6 a;

    public lh6(dv6 dv6Var) {
        this.a = dv6Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        oa3.h(atomicReference);
        oa3.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            Object obj = strArr[i];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbG = Md5A.g("[");
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sbG.length() != 1) {
                    sbG.append(", ");
                }
                sbG.append(strB);
            }
        }
        sbG.append("]");
        return sbG.toString();
    }

    public final String b(Bundle bundle) {
        String strA;
        if (bundle == null) {
            return null;
        }
        if (!this.a.d()) {
            return bundle.toString();
        }
        StringBuilder sbG = Md5A.g("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbG.length() != 8) {
                sbG.append(", ");
            }
            sbG.append(e(str));
            sbG.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strA = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strA = a((Object[]) obj);
            } else {
                strA = obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbG.append(strA);
        }
        sbG.append("}]");
        return sbG.toString();
    }

    public final String c(m16 m16Var) {
        String string;
        dv6 dv6Var = this.a;
        if (!dv6Var.d()) {
            return m16Var.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(m16Var.y);
        sb.append(",name=");
        sb.append(d(m16Var.w));
        sb.append(",params=");
        o06 o06Var = m16Var.x;
        if (o06Var == null) {
            string = null;
        } else {
            string = !dv6Var.d() ? o06Var.toString() : b(o06Var.b());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.d() ? str : g(str, v3A.C, v3A.A, b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.d() ? str : g(str, NRt.B, NRt.A, c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.d()) {
            return str.startsWith("_exp_") ? fc2.a("experiment_id(", str, ")") : g(str, fXUx.C, fXUx.B, d);
        }
        return str;
    }
}
