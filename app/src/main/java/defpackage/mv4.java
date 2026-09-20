package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class mv4 extends iv4 {
    public static boolean A(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : M(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int B(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static final int C(int i, CharSequence charSequence, String str, boolean z) {
        return (z || !(charSequence instanceof String)) ? D(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int D(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        np1 np1Var;
        if (z2) {
            int iB = B(charSequence);
            if (i > iB) {
                i = iB;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            np1Var = new np1(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            np1Var = new pp1(i, i2);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = np1Var.w;
        int i4 = np1Var.y;
        int i5 = np1Var.x;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i4 > 0 && i3 <= i5) || (i4 < 0 && i5 <= i3)) {
                while (!iv4.t(0, i, charSequence2.length(), (String) charSequence2, (String) charSequence, z)) {
                    if (i3 != i5) {
                        i3 += i4;
                    }
                }
                return i3;
            }
        } else if ((i4 > 0 && i3 <= i5) || (i4 < 0 && i5 <= i3)) {
            while (!M(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                if (i3 != i5) {
                    i3 += i4;
                }
            }
            return i3;
        }
        return -1;
    }

    public static int E(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return (z || !(charSequence instanceof String)) ? G(i, charSequence, z, new char[]{c}) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C(i, charSequence, str, z);
    }

    public static final int G(int i, CharSequence charSequence, boolean z, char[] cArr) {
        boolean z2;
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        op1 it = new pp1(i, B(charSequence)).iterator();
        while (it.y) {
            int iNextInt = it.nextInt();
            char cCharAt = charSequence.charAt(iNextInt);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                }
                if (Th.g(cArr[i2], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return iNextInt;
            }
        }
        return -1;
    }

    public static int H(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = B(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        int iB = B(charSequence);
        if (i > iB) {
            i = iB;
        }
        while (-1 < i) {
            if (Th.g(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int I(String str, String str2, int i) {
        int iB = (i & 2) != 0 ? B(str) : 0;
        return !(str instanceof String) ? D(str, str2, iB, 0, false, true) : str.lastIndexOf(str2, iB);
    }

    public static final List<String> J(CharSequence charSequence) {
        return na4.L0(new q95(L(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new lv4(charSequence)));
    }

    public static final String K(String str, int i) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            throw new IllegalArgumentException(ex0.b("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            op1 it = new pp1(1, i - str.length()).iterator();
            while (it.y) {
                it.nextInt();
                sb.append('0');
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static ej0 L(CharSequence charSequence, String[] strArr, boolean z, int i) {
        N(i);
        return new ej0(charSequence, 0, i, new kv4(z, Arrays.asList(strArr)));
    }

    public static final boolean M(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!Th.g(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final void N(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(GM.a("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static final List O(int i, CharSequence charSequence, String str, boolean z) {
        N(i);
        int length = 0;
        int iC = C(0, charSequence, str, z);
        if (iC == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iC).toString());
            length = str.length() + iC;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iC = C(length, charSequence, str, z);
        } while (iC != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List P(CharSequence charSequence, char[] cArr) {
        if (cArr.length == 1) {
            return O(0, charSequence, String.valueOf(cArr[0]), false);
        }
        N(0);
        ga4 ga4Var = new ga4(new ej0(charSequence, 0, 0, new jv4(cArr, false)));
        ArrayList arrayList = new ArrayList(mu.w0(ga4Var, 10));
        Iterator<Object> it = ga4Var.iterator();
        while (it.hasNext()) {
            arrayList.add(S(charSequence, (pp1) it.next()));
        }
        return arrayList;
    }

    public static List Q(String str, String[] strArr) {
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (!(str2.length() == 0)) {
                return O(0, str, str2, false);
            }
        }
        ga4 ga4Var = new ga4(L(str, strArr, false, 0));
        ArrayList arrayList = new ArrayList(mu.w0(ga4Var, 10));
        Iterator<Object> it = ga4Var.iterator();
        while (it.hasNext()) {
            arrayList.add(S(str, (pp1) it.next()));
        }
        return arrayList;
    }

    public static boolean R(CharSequence charSequence, String str) {
        return charSequence instanceof String ? iv4.x((String) charSequence, str, false) : M(charSequence, 0, str, 0, str.length(), false);
    }

    public static final String S(CharSequence charSequence, pp1 pp1Var) {
        return charSequence.subSequence(Integer.valueOf(pp1Var.w).intValue(), Integer.valueOf(pp1Var.x).intValue() + 1).toString();
    }

    public static String T(String str, char c) {
        int iE = E(str, c, 0, false, 6);
        return iE == -1 ? str : str.substring(iE + 1, str.length());
    }

    public static String U(String str, String str2) {
        int iF = F(str, str2, 0, false, 6);
        return iF == -1 ? str : str.substring(str2.length() + iF, str.length());
    }

    public static String V(String str) {
        int iH = H(str, '.', 0, 6);
        return iH == -1 ? str : str.substring(iH + 1, str.length());
    }

    public static final CharSequence W(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zN = Th.n(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zN) {
                    break;
                }
                length--;
            } else if (zN) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final boolean y(CharSequence charSequence, String str, boolean z) {
        return F(charSequence, str, 0, z, 2) >= 0;
    }

    public static boolean z(CharSequence charSequence, char c) {
        return E(charSequence, c, 0, false, 2) >= 0;
    }
}
