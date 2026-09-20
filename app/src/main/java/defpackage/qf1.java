package defpackage;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class qf1 {
    static {
        new mk(kd.a("\"\\")).y = "\"\\";
        new mk(kd.a("\t ,=")).y = "\t ,=";
    }

    public static final boolean a(xp3 xp3Var) {
        if (ur1.a(xp3Var.w.b, "HEAD")) {
            return false;
        }
        int i = xp3Var.z;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && qf5.k(xp3Var) == -1) {
            String strA = xp3Var.B.a("Transfer-Encoding");
            if (strA == null) {
                strA = null;
            }
            if (!iv4.r("chunked", strA)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    public static final void b(f90 f90Var, ch1 ch1Var, nc1 nc1Var) {
        String str;
        int i;
        String strSubstring;
        e90 e90Var;
        if (f90Var == f90.g) {
            return;
        }
        Pattern pattern = e90.j;
        List<String> listF = nc1Var.f("Set-Cookie");
        int size = listF.size();
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = null;
        while (i3 < size) {
            int i4 = i3 + 1;
            String str2 = listF.get(i3);
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int iH = qf5.h(str2, ';', i2, i2, 6);
            char c2 = '=';
            int iH2 = qf5.h(str2, '=', i2, iH, 2);
            if (iH2 == iH) {
                e90Var = null;
            } else {
                String strX = qf5.x(i2, iH2, str2);
                boolean z = true;
                if ((strX.length() == 0) || qf5.m(strX) != -1) {
                    e90Var = null;
                } else {
                    String strX2 = qf5.x(iH2 + 1, iH, str2);
                    if (qf5.m(strX2) == -1) {
                        int i5 = iH + 1;
                        int length = str2.length();
                        long j = 253402300799999L;
                        long jB = 253402300799999L;
                        long j2 = -1;
                        String str3 = null;
                        String str4 = null;
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = true;
                        while (true) {
                            if (i5 < length) {
                                int iF = qf5.f(c, i5, length, str2);
                                int iF2 = qf5.f(c2, i5, iF, str2);
                                String strX3 = qf5.x(i5, iF2, str2);
                                String strX4 = iF2 < iF ? qf5.x(iF2 + 1, iF, str2) : "";
                                if (iv4.r(strX3, "expires")) {
                                    try {
                                        jB = e90.QnHx.b(strX4.length(), strX4);
                                        z4 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (iv4.r(strX3, "max-age")) {
                                    try {
                                        long j3 = Long.parseLong(strX4);
                                        j2 = j3 > 0 ? j3 : Long.MIN_VALUE;
                                    } catch (NumberFormatException e) {
                                        if (!Pattern.compile("-?\\d+").matcher(strX4).matches()) {
                                            throw e;
                                        }
                                        j2 = iv4.x(strX4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z4 = true;
                                } else if (iv4.r(strX3, "domain")) {
                                    if (!(!strX4.endsWith("."))) {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                    if (mv4.R(strX4, ".")) {
                                        strX4 = strX4.substring(".".length());
                                    }
                                    String strS = AY.S(strX4);
                                    if (strS == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str4 = strS;
                                    z5 = false;
                                } else if (iv4.r(strX3, "path")) {
                                    str3 = strX4;
                                } else if (iv4.r(strX3, "secure")) {
                                    z2 = true;
                                } else if (iv4.r(strX3, "httponly")) {
                                    z3 = true;
                                }
                                i5 = iF + 1;
                                c = ';';
                                c2 = '=';
                            } else {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j4 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * ((long) AdError.NETWORK_ERROR_CODE) : Long.MAX_VALUE);
                                    if (j4 >= jCurrentTimeMillis && j4 <= 253402300799999L) {
                                        j = j4;
                                    }
                                } else {
                                    j = jB;
                                }
                                String str5 = ch1Var.d;
                                if (str4 == null) {
                                    str = str5;
                                } else {
                                    if (!ur1.a(str5, str4) && (!str5.endsWith(str4) || str5.charAt((str5.length() - str4.length()) - 1) != '.' || qf5.e.w.matcher(str5).matches())) {
                                        z = false;
                                    }
                                    if (z) {
                                        str = str4;
                                    }
                                }
                                if (str5.length() == str.length() || PublicSuffixDatabase.g.a(str) != null) {
                                    if (str3 != null) {
                                        i = 0;
                                        if (iv4.x(str3, "/", false)) {
                                            strSubstring = str3;
                                        }
                                        e90Var = new e90(strX, strX2, j, str, strSubstring, z2, z3, z4, z5);
                                    } else {
                                        i = 0;
                                    }
                                    String strB = ch1Var.b();
                                    int iH3 = mv4.H(strB, '/', i, 6);
                                    strSubstring = iH3 != 0 ? strB.substring(i, iH3) : "/";
                                    e90Var = new e90(strX, strX2, j, str, strSubstring, z2, z3, z4, z5);
                                }
                            }
                        }
                    }
                    e90Var = null;
                }
            }
            if (e90Var != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e90Var);
            }
            i3 = i4;
            i2 = 0;
        }
        if ((arrayList != null ? Collections.unmodifiableList(arrayList) : cs0.w).isEmpty()) {
            return;
        }
        f90Var.c();
    }
}
