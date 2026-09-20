package defpackage;

import com.facebook.ads.AdError;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bd5 {
    public static final List<String> a = Collections.singletonList("");

    public static final int a(int i, int i2, String str) {
        boolean z = false;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '[') {
                z = true;
            } else if (cCharAt == ']') {
                z = false;
            } else if (cCharAt == ':' && !z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x025d  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    public static final void b(zc5 zc5Var, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        xu4 iz2Var;
        int i8;
        List<String> list;
        List<String> listP;
        int i9;
        int iIntValue;
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!Th.n(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        int length2 = str.length() - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i11 = length2 - 1;
            if (!Th.n(str.charAt(length2))) {
                break;
            }
            if (i11 < 0) {
                length2 = -1;
                break;
            }
            length2 = i11;
        }
        int i12 = length2 + 1;
        char cCharAt = str.charAt(i10);
        if ('a' <= cCharAt && cCharAt < '{') {
            i = -1;
            i2 = i10;
        } else {
            if ('A' <= cCharAt && cCharAt < '[') {
                i = -1;
                i2 = i10;
            } else {
                i = i10;
                i2 = i;
            }
        }
        while (true) {
            if (i2 < i12) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == ':') {
                    if (i != -1) {
                        throw new IllegalArgumentException(GM.a("Illegal character in scheme at position ", i));
                    }
                    i3 = i2 - i10;
                    break;
                } else if (cCharAt2 != '/' && cCharAt2 != '?' && cCharAt2 != '#') {
                    if (i == -1) {
                        if (!('a' <= cCharAt2 && cCharAt2 < '{')) {
                            if (!('A' <= cCharAt2 && cCharAt2 < '[')) {
                                if (!('0' <= cCharAt2 && cCharAt2 < ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-') {
                                    i = i2;
                                }
                            }
                        }
                    }
                    i2++;
                }
            }
            i3 = -1;
            break;
        }
        if (i3 > 0) {
            String strSubstring = str.substring(i10, i10 + i3);
            cd5 cd5Var = cd5.c;
            zc5Var.a = cd5.QnHx.a(strSubstring);
            i10 += i3 + 1;
        }
        int i13 = 0;
        while (true) {
            i4 = i10 + i13;
            if (i4 >= i12 || str.charAt(i4) != '/') {
                break;
            } else {
                i13++;
            }
        }
        if (ur1.a(zc5Var.a.a, "file")) {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalArgumentException("Invalid file url: ".concat(str));
                }
                zc5Var.b = "";
                C0239D.F(zc5Var, "/".concat(str.substring(i4, i12)));
                return;
            }
            int iE = mv4.E(str, '/', i4, false, 4);
            if (iE == -1 || iE == i12) {
                zc5Var.b = str.substring(i4, i12);
                return;
            } else {
                zc5Var.b = str.substring(i4, iE);
                C0239D.F(zc5Var, str.substring(iE, i12));
                return;
            }
        }
        if (ur1.a(zc5Var.a.a, "mailto")) {
            if (!(i13 == 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int iF = mv4.F(str, "@", i4, false, 4);
            if (iF == -1) {
                throw new IllegalArgumentException(fc2.a("Invalid mailto url: ", str, ", it should contain '@'."));
            }
            zc5Var.e = tt.f(tt.d(str.substring(i4, iF)), false);
            zc5Var.b = str.substring(iF + 1, i12);
            return;
        }
        if (i13 >= 2) {
            while (true) {
                Integer numValueOf = Integer.valueOf(mv4.G(i4, str, false, Th.y("@/\\?#")));
                if (!(numValueOf.intValue() > 0)) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i12;
                if (iIntValue >= i12 || str.charAt(iIntValue) != '@') {
                    break;
                }
                int iA = a(i4, iIntValue, str);
                if (iA != -1) {
                    zc5Var.e = str.substring(i4, iA);
                    zc5Var.f = str.substring(iA + 1, iIntValue);
                } else {
                    zc5Var.e = str.substring(i4, iIntValue);
                }
                i4 = iIntValue + 1;
            }
            Integer numValueOf2 = Integer.valueOf(a(i4, iIntValue, str));
            if (!(numValueOf2.intValue() > 0)) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
            zc5Var.b = str.substring(i4, iIntValue2);
            int i14 = iIntValue2 + 1;
            if (i14 < iIntValue) {
                zc5Var.c = Integer.parseInt(str.substring(i14, iIntValue));
            } else {
                zc5Var.c = 0;
            }
            i4 = iIntValue;
        }
        List<String> list2 = cs0.w;
        List<String> list3 = a;
        if (i4 >= i12) {
            if (str.charAt(i12 - 1) == '/') {
                list2 = list3;
            }
            zc5Var.h = list2;
            return;
        }
        zc5Var.h = i13 == 0 ? wu.E0(zc5Var.h) : list2;
        Integer numValueOf3 = Integer.valueOf(mv4.G(i4, str, false, Th.y("?#")));
        if (!(numValueOf3.intValue() > 0)) {
            numValueOf3 = null;
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i12;
        if (iIntValue3 > i4) {
            String strSubstring2 = str.substring(i4, iIntValue3);
            if (zc5Var.h.size() != 1) {
                list = zc5Var.h;
            } else {
                if (((CharSequence) wu.H0(zc5Var.h)).length() == 0) {
                    list = list2;
                } else {
                    list = zc5Var.h;
                }
            }
            if (ur1.a(strSubstring2, "/")) {
                i9 = 1;
                listP = list3;
            } else {
                listP = mv4.P(strSubstring2, new char[]{'/'});
                i9 = 1;
            }
            if (i13 == i9) {
                list2 = list3;
            }
            zc5Var.h = wu.U0(wu.U0(listP, list2), list);
            i4 = iIntValue3;
        }
        if (i4 < i12 && str.charAt(i4) == '?') {
            int i15 = i4 + 1;
            if (i15 == i12) {
                zc5Var.d = true;
                i4 = i12;
            } else {
                int i16 = 0;
                Integer numValueOf4 = Integer.valueOf(mv4.E(str, '#', i15, false, 4));
                if (!(numValueOf4.intValue() > 0)) {
                    numValueOf4 = null;
                }
                int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i12;
                String strSubstring3 = str.substring(i15, iIntValue4);
                if (mv4.B(strSubstring3) < 0) {
                    fz2.b.getClass();
                    iz2Var = fs0.c;
                } else {
                    fz2.QnHx qnHx = fz2.b;
                    hz2 hz2Var = new hz2(8);
                    int iB = mv4.B(strSubstring3);
                    int i17 = AdError.NETWORK_ERROR_CODE;
                    if (iB >= 0) {
                        i6 = 0;
                        i7 = -1;
                        int i18 = 0;
                        while (true) {
                            if (i16 != i17) {
                                char cCharAt3 = strSubstring3.charAt(i18);
                                if (cCharAt3 == '&') {
                                    i8 = i18;
                                    X.i(hz2Var, strSubstring3, i6, i7, i18, false);
                                    i6 = i8 + 1;
                                    i16++;
                                    i7 = -1;
                                } else {
                                    i8 = i18;
                                    if (cCharAt3 == '=' && i7 == -1) {
                                        i7 = i8;
                                    }
                                }
                                if (i8 != iB) {
                                    i18 = i8 + 1;
                                    i17 = AdError.NETWORK_ERROR_CODE;
                                } else {
                                    i5 = AdError.NETWORK_ERROR_CODE;
                                }
                            }
                            iz2Var = new iz2(hz2Var.b);
                        }
                    } else {
                        i5 = AdError.NETWORK_ERROR_CODE;
                        i6 = 0;
                        i7 = -1;
                    }
                    if (i16 != i5) {
                        X.i(hz2Var, strSubstring3, i6, i7, strSubstring3.length(), false);
                    }
                    iz2Var = new iz2(hz2Var.b);
                }
                iz2Var.b(new ad5(zc5Var));
                i4 = iIntValue4;
            }
        }
        if (i4 >= i12 || str.charAt(i4) != '#') {
            return;
        }
        zc5Var.g = str.substring(i4 + 1, i12);
    }
}
