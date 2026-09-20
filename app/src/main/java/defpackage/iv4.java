package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class iv4 extends hv4 {
    public static final String q(char[] cArr, int i, int i2) {
        int length = cArr.length;
        if (i < 0 || i2 > length) {
            StringBuilder sbA = a42.a("startIndex: ", i, ", endIndex: ", i2, ", size: ");
            sbA.append(length);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i <= i2) {
            return new String(cArr, i, i2 - i);
        }
        throw new IllegalArgumentException(Md5A.e("startIndex: ", i, " > endIndex: ", i2));
    }

    public static final boolean r(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final boolean s(CharSequence charSequence) {
        boolean z;
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable pp1Var = new pp1(0, charSequence.length() - 1);
        if ((pp1Var instanceof Collection) && ((Collection) pp1Var).isEmpty()) {
            z = true;
        } else {
            op1 it = pp1Var.iterator();
            while (it.y) {
                if (!Th.n(charSequence.charAt(it.nextInt()))) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public static final boolean t(int i, int i2, int i3, String str, String str2, boolean z) {
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final String u(int i, String str) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i != 0) {
            if (i == 1) {
                return str.toString();
            }
            int length = str.length();
            if (length != 0) {
                if (length != 1) {
                    StringBuilder sb = new StringBuilder(str.length() * i);
                    op1 it = new pp1(1, i).iterator();
                    while (it.y) {
                        it.nextInt();
                        sb.append((CharSequence) str);
                    }
                    return sb.toString();
                }
                char cCharAt = str.charAt(0);
                char[] cArr = new char[i];
                for (int i2 = 0; i2 < i; i2++) {
                    cArr[i2] = cCharAt;
                }
                return new String(cArr);
            }
        }
        return "";
    }

    public static String v(String str, String str2, String str3) {
        int iC = mv4.C(0, str, str2, false);
        if (iC < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iC);
            sb.append(str3);
            i2 = iC + length;
            if (iC >= str.length()) {
                break;
            }
            iC = mv4.C(iC + i, str, str2, false);
        } while (iC > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static final boolean w(String str, int i, String str2, boolean z) {
        return !z ? str.startsWith(str2, i) : t(i, 0, str2.length(), str, str2, z);
    }

    public static final boolean x(String str, String str2, boolean z) {
        return !z ? str.startsWith(str2) : t(0, 0, str2.length(), str, str2, z);
    }
}
