package defpackage;

import com.google.android.gms.internal.measurement.T23;
import com.google.android.gms.internal.measurement.YKK;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fd7 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;

    public fd7(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static Boolean d(BigDecimal bigDecimal, YKK ykk, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        oa3.h(ykk);
        if (ykk.x()) {
            if (ykk.C() != 1) {
                if (ykk.C() == 5) {
                    if (!ykk.B() || !ykk.A()) {
                        return null;
                    }
                } else if (!ykk.y()) {
                    return null;
                }
                int iC = ykk.C();
                if (ykk.C() == 5) {
                    if (b37.F(ykk.v()) && b37.F(ykk.u())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(ykk.v());
                            bigDecimal4 = new BigDecimal(ykk.u());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!b37.F(ykk.t())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(ykk.t());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iC == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = iC - 1;
                if (i == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i != 3) {
                    if (i == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    public static Boolean e(String str, T23 t23, bi6 bi6Var) {
        List listV;
        oa3.h(t23);
        if (str == null || !t23.z() || t23.A() == 1) {
            return null;
        }
        if (t23.A() == 7) {
            if (t23.r() == 0) {
                return null;
            }
        } else if (!t23.y()) {
            return null;
        }
        int iA = t23.A();
        boolean zW = t23.w();
        String strU = (zW || iA == 2 || iA == 7) ? t23.u() : t23.u().toUpperCase(Locale.ENGLISH);
        if (t23.r() == 0) {
            listV = null;
        } else {
            listV = t23.v();
            if (!zW) {
                ArrayList arrayList = new ArrayList(listV.size());
                Iterator it = listV.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listV = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = iA == 2 ? strU : null;
        if (iA == 7) {
            if (listV == null || listV.isEmpty()) {
                return null;
            }
        } else if (strU == null) {
            return null;
        }
        if (!zW && iA != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (iA - 1) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, true != zW ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    bi6Var.i.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(strU));
            case 3:
                return Boolean.valueOf(str.endsWith(strU));
            case 4:
                return Boolean.valueOf(str.contains(strU));
            case 5:
                return Boolean.valueOf(str.equals(strU));
            case 6:
                if (listV == null) {
                    return null;
                }
                return Boolean.valueOf(listV.contains(str));
            default:
                return null;
        }
    }

    public static Boolean f(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
