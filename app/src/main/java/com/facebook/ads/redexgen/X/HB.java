package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HB {
    public static byte[] A01;
    public static String[] A02 = {"BH2zNHpX", "Dnuq9wFIL2", "vBkvmD9EAd5t9FTNthVuCuoibAfWrGUa", "Nhu3hv03L3KjBzyMucsPwsjdroL1", "9TVwE8RhMB8DaYr8DWqJ6OPYy1", "9JupfOkL4WUcaojH", "ecCz7RACP0dYyLgy5uflHn", "VPA8JBGLf77hbCQNqSGQ8FIxNIe4WZlE"};
    public static final Pattern A03;
    public static final Pattern A04;
    public final StringBuilder A00 = new StringBuilder();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 22, 48, 76, 56, 55, 79, 91, 77, 94, 76, 56, 55, 79, 77, 66, 54, 42, 35, 4, 28, 11, 6, 3, 14, 74, 11, 6, 3, 13, 4, 7, 15, 4, 30, 74, 28, 11, 6, 31, 15, 80, 74, 106, 77, 85, 66, 79, 74, 71, 3, 66, 77, 64, 75, 76, 81, 3, 85, 66, 79, 86, 70, 25, 3, 42, 18, 16, 9, 9, 16, 23, 30, 89, 27, 24, 29, 89, 26, 12, 28, 89, 10, 28, 13, 13, 16, 23, 30, 67, 89, 118, 78, 76, 85, 85, 76, 75, 66, 5, 70, 80, 64, 5, 82, 76, 81, 77, 5, 71, 68, 65, 5, 77, 64, 68, 65, 64, 87, 31, 5, 22, 45, 40, 45, 44, 52, 45, 99, 32, 54, 38, 99, 48, 38, 55, 55, 42, 45, 36, 99, 51, 1, 6, 18, 16, 16, 39, 17, 1, 52, 5, 22, 23, 1, 22, 36, 95, 35, 81, 34, 59, 77, 57, 54, 78, 76, 57, 22, 78, 72, 72, 91, 57, 22, 78, 77, 57, 54, 78, 76, 77, 75, 79, 76, 90, 65, 41, 36, 33, 47, 38, 120, 116, 105, 82, 18, 19, 21, 30, 4, 21, 2, 91, 80, 90, 103, 116, 99, 56, 54, 63, 62, 35, 56, 63, 54, 113, 36, 63, 34, 36, 33, 33, 62, 35, 37, 52, 53, 113, 52, 63, 37, 56, 37, 40, 107, 113, 118, 119, 33, 44, 35, 42, 44, 37, 38, 52, 23, 18, 21, 30, 49, 41, 74, 78, 67, 67, 75, 66, 7, 11, 26, 25, 11, 20, 8, 18, 15, 18, 20, 21, 67, 88, 86, 89, 69, 109, 119, 100, 123, 121, 126, 107, 120, 126, 99, 52};
    }

    static {
        A05();
        A03 = Pattern.compile(A03(161, 26, 61));
        A04 = Pattern.compile(A03(3, 12, 60));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0010 A[ADDED_TO_REGION] */
    public static int A00(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A03(197, 6, 40))) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    return 0;
                }
                if (b != 1 || b == 2) {
                    return 1;
                }
                if (b == 3) {
                    return 2;
                }
                Log.w(A03(141, 15, 60), A03(43, 22, 123) + str);
                return Integer.MIN_VALUE;
            case -1074341483:
                boolean zEquals = str.equals(A03(254, 6, 127));
                if (A02[3].length() == 10) {
                    throw new RuntimeException();
                }
                A02[5] = "MJ40TcK0DidUTvS4";
                if (zEquals) {
                    b = 2;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    return 0;
                }
                if (b != 1) {
                }
                return 1;
            case 100571:
                if (str.equals(A03(203, 3, 102))) {
                    b = 3;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    return 0;
                }
                if (b != 1) {
                }
                return 1;
            case 109757538:
                if (str.equals(A03(281, 5, 82))) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    return 0;
                }
                if (b != 1) {
                }
                return 1;
            default:
                b = -1;
                if (b == 0) {
                    return 0;
                }
                if (b != 1) {
                }
                return 1;
        }
    }

    public static int A01(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    public static Layout.Alignment A02(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1364013995:
                if (!str.equals(A03(197, 6, 40))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1074341483:
                if (!str.equals(A03(254, 6, 127))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 100571:
                if (!str.equals(A03(203, 3, 102))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 3317767:
                if (!str.equals(A03(244, 4, 24))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 108511772:
                if (!str.equals(A03(272, 5, 105))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 109757538:
                if (!str.equals(A03(281, 5, 82))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (b == 2 || b == 3) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (b != 4 && b != 5) {
            Log.w(A03(141, 15, 60), A03(18, 25, 50) + str);
            return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static String A04(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return C0695Iz.A0m(strTrim, A03(156, 5, 39))[0];
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    public static void A06(SpannableStringBuilder spannableStringBuilder, H6 h6, int i, int i2) {
        if (h6 == null) {
            return;
        }
        int iA08 = h6.A08();
        if (A02[3].length() == 10) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "Ny9QBL6T";
        strArr[6] = "KFko697awYGF5JioqkD8Fp";
        if (iA08 != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(h6.A08()), i, i2, 33);
        }
        boolean zA0O = h6.A0O();
        if (A02[2].charAt(8) != 'y') {
            A02[3] = "U9AYrt";
            if (zA0O) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        } else {
            A02[5] = "BCFo0CwtxewMjRes";
            if (zA0O) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (h6.A0P()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (h6.A0N()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(h6.A06()), i, i2, 33);
        }
        boolean zA0M = h6.A0M();
        if (A02[2].charAt(8) != 'y') {
            A02[3] = "V2wLbBmXpgkEOhtSXmoT1";
            if (zA0M) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(h6.A05()), i, i2, 33);
            }
        } else {
            String[] strArr2 = A02;
            strArr2[0] = "Zhb0mUGg";
            strArr2[6] = "DqzbmkeRFCAudTa8qvbD1E";
            if (zA0M) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(h6.A05()), i, i2, 33);
            }
        }
        String strA0H = h6.A0H();
        String[] strArr3 = A02;
        if (strArr3[0].length() == strArr3[6].length()) {
            throw new RuntimeException();
        }
        A02[3] = "i3U";
        if (strA0H != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(h6.A0H()), i, i2, 33);
        }
        if (h6.A0A() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(h6.A0A()), i, i2, 33);
        }
        int iA07 = h6.A07();
        if (iA07 == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) h6.A04(), true), i, i2, 33);
        } else if (iA07 == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(h6.A04()), i, i2, 33);
        } else {
            if (iA07 != 3) {
                return;
            }
            spannableStringBuilder.setSpan(new RelativeSizeSpan(h6.A04() / 100.0f), i, i2, 33);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    public static void A07(String str, SpannableStringBuilder spannableStringBuilder) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != 3309) {
            if (iHashCode != 3464) {
                if (iHashCode != 96708) {
                    if (iHashCode == 3374865 && str.equals(A03(260, 4, 49))) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(A03(192, 3, 65))) {
                    b = 3;
                } else {
                    b = -1;
                }
            } else if (str.equals(A03(252, 2, 5))) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals(A03(206, 2, 88))) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            spannableStringBuilder.append('<');
            return;
        }
        if (b == 1) {
            spannableStringBuilder.append('>');
            return;
        }
        if (b == 2) {
            spannableStringBuilder.append(' ');
            return;
        }
        if (b != 3) {
            Log.w(A03(141, 15, 60), A03(209, 31, 9) + str + A03(16, 2, 85));
            return;
        }
        spannableStringBuilder.append('&');
    }

    public static void A08(String str, H8 h8) {
        String strA03 = A03(141, 15, 60);
        Matcher matcher = A04.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            try {
                if (A03(248, 4, 35).equals(strGroup)) {
                    A09(strGroup2, h8);
                } else if (A03(187, 5, 16).equals(strGroup)) {
                    h8.A0B(A02(strGroup2));
                } else if (A03(264, 8, 35).equals(strGroup)) {
                    A0A(strGroup2, h8);
                } else if (A03(277, 4, 70).equals(strGroup)) {
                    h8.A05(HC.A00(strGroup2));
                } else {
                    Log.w(strA03, A03(121, 20, 27) + strGroup + A03(15, 1, 32) + strGroup2);
                }
            } catch (NumberFormatException unused) {
                Log.w(strA03, A03(65, 26, 33) + matcher.group());
            }
        }
    }

    public static void A09(String str, H8 h8) throws NumberFormatException {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            h8.A06(A00(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        } else {
            h8.A06(Integer.MIN_VALUE);
        }
        if (str.endsWith(A03(2, 1, 77))) {
            h8.A03(HC.A00(str)).A07(0);
            return;
        }
        int i = Integer.parseInt(str);
        if (i < 0) {
            i--;
        }
        H8 h8A03 = h8.A03(i);
        String[] strArr = A02;
        if (strArr[0].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "nfwpqDM6";
        strArr2[6] = "ldPC0GHiWge259aJMdVkFd";
        h8A03.A07(1);
    }

    public static void A0A(String str, H8 h8) throws NumberFormatException {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            h8.A08(A00(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        } else {
            h8.A08(Integer.MIN_VALUE);
        }
        h8.A04(HC.A00(str));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    public static void A0B(String str, H9 h9, SpannableStringBuilder spannableStringBuilder, List<H6> list, List<HA> list2) {
        byte b;
        int i = h9.A00;
        int length = spannableStringBuilder.length();
        String str2 = h9.A01;
        int iHashCode = str2.hashCode();
        if (iHashCode != 0) {
            if (iHashCode == 105) {
                String[] strArr = A02;
                if (strArr[0].length() != strArr[6].length()) {
                    String[] strArr2 = A02;
                    strArr2[0] = "yJm7VGyE";
                    strArr2[6] = "ntBBgOdztc05yiWRpthqz9";
                    if (str2.equals(A03(208, 1, 82))) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                }
                throw new RuntimeException();
            }
            if (iHashCode != 3314158) {
                if (iHashCode == 98) {
                    String strA03 = A03(195, 1, 104);
                    String[] strArr3 = A02;
                    if (strArr3[0].length() != strArr3[6].length()) {
                        A02[3] = "i60gfkl";
                        if (str2.equals(strA03)) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    }
                    throw new RuntimeException();
                }
                if (iHashCode != 99) {
                    String[] strArr4 = A02;
                    if (strArr4[0].length() != strArr4[6].length()) {
                        String[] strArr5 = A02;
                        strArr5[1] = "ltHV0yT78X";
                        strArr5[4] = "DsRTdIPJp1zaSNw1phhgrckLmu";
                        if (iHashCode != 117) {
                            if (iHashCode == 118 && str2.equals(A03(287, 1, 26))) {
                                b = 5;
                            } else {
                                b = -1;
                            }
                        } else if (str2.equals(A03(286, 1, 78))) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    }
                    throw new RuntimeException();
                }
                if (str2.equals(A03(196, 1, 41))) {
                    b = 3;
                } else {
                    b = -1;
                }
            } else if (str2.equals(A03(240, 4, 21))) {
                b = 4;
            } else {
                b = -1;
            }
        } else if (str2.equals(A03(0, 0, 62))) {
            b = 6;
        } else {
            b = -1;
        }
        switch (b) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 2:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                return;
        }
        list2.clear();
        A0D(list, str, h9, list2);
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            A06(spannableStringBuilder, list2.get(i2).A01, i, length);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    public static void A0C(String str, String str2, H8 h8, List<H6> list) {
        H9 startTag;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int iA01 = 0;
        while (iA01 < str2.length()) {
            char cCharAt = str2.charAt(iA01);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, iA01 + 1);
                int iIndexOf2 = str2.indexOf(32, iA01 + 1);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    int entityEndIndex = iA01 + 1;
                    A07(str2.substring(entityEndIndex, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) A03(1, 1, 110));
                    }
                    iA01 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                    iA01++;
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                iA01++;
            } else {
                int i = iA01 + 1;
                int length = str2.length();
                if (A02[3].length() == 10) {
                    throw new RuntimeException();
                }
                A02[7] = "huABVhch9erSIKd70DjqaQjDgv4JUQcV";
                if (i >= length) {
                    iA01++;
                } else {
                    int i2 = iA01;
                    boolean z = str2.charAt(i2 + 1) == '/';
                    iA01 = A01(str2, i2 + 1);
                    boolean z2 = str2.charAt(iA01 + (-2)) == '/';
                    String strSubstring = str2.substring((z ? 2 : 1) + i2, z2 ? iA01 - 2 : iA01 - 1);
                    String tagName = A04(strSubstring);
                    if (tagName != null && A0E(tagName)) {
                        if (z) {
                            do {
                                boolean zIsEmpty = arrayDeque.isEmpty();
                                String fullTagExpression = A02[5];
                                if (fullTagExpression.length() != 16) {
                                    String[] strArr = A02;
                                    strArr[0] = "eUUkvlij";
                                    strArr[6] = "fkUA9DE8mZusd0jqihcBtc";
                                    if (zIsEmpty) {
                                        break;
                                    }
                                    startTag = (H9) arrayDeque.pop();
                                    A0B(str, startTag, spannableStringBuilder, list, arrayList);
                                } else {
                                    A02[7] = "xjA9LPEJe2T86ajW2mUni2naxM9TfZ4G";
                                    if (zIsEmpty) {
                                        break;
                                    }
                                    startTag = (H9) arrayDeque.pop();
                                    A0B(str, startTag, spannableStringBuilder, list, arrayList);
                                }
                            } while (!startTag.A01.equals(tagName));
                        } else if (!z2) {
                            arrayDeque.push(H9.A01(strSubstring, spannableStringBuilder.length()));
                        }
                    }
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            A0B(str, (H9) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        A0B(str, H9.A00(), spannableStringBuilder, list, arrayList);
        h8.A0C(spannableStringBuilder);
    }

    public static void A0D(List<H6> list, String str, H9 h9, List<HA> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            H6 h6 = list.get(i);
            int iA09 = h6.A09(str, h9.A01, h9.A03, h9.A02);
            if (iA09 > 0) {
                list2.add(new HA(iA09, h6));
            }
        }
        Collections.sort(list2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public static boolean A0E(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != 98) {
            if (iHashCode != 99) {
                if (iHashCode == 105) {
                    boolean zEquals = str.equals(A03(208, 1, 82));
                    if (A02[3].length() == 10) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[0] = "tlO5iwEB";
                    strArr[6] = "pEnQwZlkHTTTq7cfdXWDKW";
                    if (zEquals) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (iHashCode != 3314158) {
                    if (iHashCode != 117) {
                        if (iHashCode == 118 && str.equals(A03(287, 1, 26))) {
                            b = 5;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals(A03(286, 1, 78))) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(A03(240, 4, 21))) {
                    b = 3;
                } else {
                    b = -1;
                }
            } else if (str.equals(A03(196, 1, 41))) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals(A03(195, 1, 104))) {
            b = 0;
        } else {
            b = -1;
        }
        return b == 0 || b == 1 || b == 2 || b == 3 || b == 4 || b == 5;
    }

    public static boolean A0F(String str, Matcher matcher, C0679Ij c0679Ij, H8 h8, StringBuilder sb, List<H6> list) {
        try {
            h8.A0A(HC.A01(matcher.group(1))).A09(HC.A01(matcher.group(2)));
            A08(matcher.group(3), h8);
            sb.setLength(0);
            while (true) {
                String strA0P = c0679Ij.A0P();
                if (!TextUtils.isEmpty(strA0P)) {
                    if (sb.length() > 0) {
                        sb.append(A03(0, 1, 38));
                    }
                    sb.append(strA0P.trim());
                } else {
                    A0C(str, sb.toString(), h8, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            Log.w(A03(141, 15, 60), A03(91, 30, 125) + matcher.group());
            return false;
        }
    }

    public final boolean A0G(C0679Ij c0679Ij, H8 h8, List<H6> list) {
        String strA0P = c0679Ij.A0P();
        if (strA0P == null) {
            return false;
        }
        Matcher matcher = A03.matcher(strA0P);
        if (matcher.matches()) {
            return A0F(null, matcher, c0679Ij, h8, this.A00, list);
        }
        String strA0P2 = c0679Ij.A0P();
        if (strA0P2 == null) {
            return false;
        }
        Matcher matcher2 = A03.matcher(strA0P2);
        if (matcher2.matches()) {
            return A0F(strA0P.trim(), matcher2, c0679Ij, h8, this.A00, list);
        }
        return false;
    }
}
