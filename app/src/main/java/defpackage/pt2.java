package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class pt2 implements HostnameVerifier {
    public static final pt2 a = new pt2();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        cs0 cs0Var = cs0.w;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return cs0Var;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && ur1.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return cs0Var;
        }
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (!(length2 >= 0)) {
            throw new IllegalArgumentException(ex0.b("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (!(length2 <= str.length())) {
            StringBuilder sbC = iZUl.c("endIndex > string.length: ", length2, " > ");
            sbC.append(str.length());
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean zA;
        int length;
        if (qf5.e.w.matcher(str).matches()) {
            String strS = AY.S(str);
            List listA = a(x509Certificate, 7);
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (ur1.a(strS, AY.S((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                str = str.toLowerCase(Locale.US);
            }
            List<String> listA2 = a(x509Certificate, 2);
            if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
                for (String lowerCase : listA2) {
                    if ((str.length() == 0) || iv4.x(str, ".", false) || str.endsWith("..")) {
                        zA = false;
                    } else if ((lowerCase == null || lowerCase.length() == 0) || iv4.x(lowerCase, ".", false) || lowerCase.endsWith("..")) {
                        zA = false;
                    } else {
                        String strD = !str.endsWith(".") ? ur1.d(".", str) : str;
                        if (!lowerCase.endsWith(".")) {
                            lowerCase = ur1.d(".", lowerCase);
                        }
                        if (b(lowerCase)) {
                            lowerCase = lowerCase.toLowerCase(Locale.US);
                        }
                        if (!mv4.y(lowerCase, "*", false)) {
                            zA = ur1.a(strD, lowerCase);
                        } else if (!iv4.x(lowerCase, "*.", false) || mv4.E(lowerCase, '*', 1, false, 4) != -1 || strD.length() < lowerCase.length() || ur1.a("*.", lowerCase)) {
                            zA = false;
                        } else {
                            String strSubstring = lowerCase.substring(1);
                            if (strD.endsWith(strSubstring) && ((length = strD.length() - strSubstring.length()) <= 0 || mv4.H(strD, '.', length - 1, 4) == -1)) {
                                zA = true;
                            } else {
                                zA = false;
                            }
                        }
                    }
                    if (zA) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return c(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
