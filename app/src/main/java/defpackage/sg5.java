package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sg5 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = yu.i;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    public static final List<uz2> a(String str) {
        char c;
        float[] fArr;
        if (str == null) {
            return cs0.w;
        }
        vz2 vz2Var = new vz2();
        ArrayList arrayList = vz2Var.a;
        arrayList.clear();
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            while (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        break;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i2++;
            }
            String strSubstring = str.substring(i3, i2);
            int length = strSubstring.length() - i;
            int i4 = 0;
            boolean z = false;
            while (true) {
                c = ' ';
                if (i4 > length) {
                    break;
                }
                boolean z2 = ur1.b(strSubstring.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            String string = strSubstring.subSequence(i4, length + 1).toString();
            if (string.length() > 0) {
                if (string.charAt(0) == 'z' || string.charAt(0) == 'Z') {
                    fArr = new float[0];
                } else {
                    int length2 = string.length();
                    float[] fArr2 = new float[length2];
                    int length3 = string.length();
                    int i5 = 1;
                    int i6 = 0;
                    while (i5 < length3) {
                        int i7 = i5;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = false;
                        boolean z6 = false;
                        while (i7 < string.length()) {
                            char cCharAt2 = string.charAt(i7);
                            if (cCharAt2 == c || cCharAt2 == ',') {
                                z4 = false;
                                z6 = true;
                            } else if (cCharAt2 != '-') {
                                if (cCharAt2 == '.') {
                                    if (!z3) {
                                        z3 = true;
                                    }
                                    z5 = true;
                                    z4 = false;
                                    z6 = true;
                                } else {
                                    if (cCharAt2 == 'e' || cCharAt2 == 'E') {
                                        z4 = true;
                                    }
                                }
                                z4 = false;
                            } else if (i7 == i5 || z4) {
                                z4 = false;
                            } else {
                                z5 = true;
                                z4 = false;
                                z6 = true;
                            }
                            if (z6) {
                                break;
                            }
                            i7++;
                            c = ' ';
                        }
                        if (i5 < i7) {
                            fArr2[i6] = Float.parseFloat(string.substring(i5, i7));
                            i6++;
                        }
                        if (!z5) {
                            i7++;
                        }
                        i5 = i7;
                        c = ' ';
                    }
                    if (i6 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (length2 < 0) {
                        throw new IndexOutOfBoundsException();
                    }
                    int i8 = i6 + 0;
                    int iMin = Math.min(i8, length2 + 0);
                    fArr = new float[i8];
                    System.arraycopy(fArr2, 0, fArr, 0, (iMin + 0) - 0);
                }
                vz2Var.a(string.charAt(0), fArr);
            }
            i3 = i2;
            i2++;
            i = 1;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            vz2Var.a(str.charAt(i3), new float[0]);
        }
        return arrayList;
    }
}
