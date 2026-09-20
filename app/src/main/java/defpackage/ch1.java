package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class ch1 {
    public static final char[] k;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List<String> f;
    public final List<String> g;
    public final String h;
    public final String i;
    public final boolean j;

    public static final class CQf {
        public static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
            int i4 = 0;
            int i5 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z5 = (i3 & 8) != 0 ? false : z;
            boolean z6 = (i3 & 16) != 0 ? false : z2;
            boolean z7 = (i3 & 32) != 0 ? false : z3;
            boolean z8 = (i3 & 64) != 0 ? false : z4;
            int iCharCount = i5;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i6 = 43;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || mv4.z(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !b(iCharCount, length, str)))) || (iCodePointAt == 43 && z7)))) {
                    gg ggVar = new gg();
                    ggVar.T(i5, iCharCount, str);
                    gg ggVar2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == i6 && z7) {
                                String str3 = z5 ? "+" : "%2B";
                                ggVar.T(i4, str3.length(), str3);
                            } else {
                                if (iCodePointAt2 >= 32 && iCodePointAt2 != 127) {
                                    if ((iCodePointAt2 < 128 || z8) && !mv4.z(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z5 && (!z6 || b(iCharCount, length, str))))) {
                                        ggVar.Z(iCodePointAt2);
                                    }
                                }
                                if (ggVar2 == null) {
                                    ggVar2 = new gg();
                                }
                                ggVar2.Z(iCodePointAt2);
                                while (!ggVar2.E()) {
                                    int i7 = ggVar2.readByte() & 255;
                                    ggVar.L(37);
                                    char[] cArr = ch1.k;
                                    ggVar.L(cArr[(i7 >> 4) & 15]);
                                    ggVar.L(cArr[i7 & 15]);
                                }
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i4 = 0;
                        i6 = 43;
                    }
                    return ggVar.A();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            return str.substring(i5, length);
        }

        public static boolean b(int i, int i2, String str) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && qf5.r(str.charAt(i + 1)) != -1 && qf5.r(str.charAt(i3)) != -1;
        }

        public static String c(String str, int i, int i2, boolean z, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            int iCharCount = i;
            while (iCharCount < i2) {
                int i5 = iCharCount + 1;
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    gg ggVar = new gg();
                    ggVar.T(i, iCharCount, str);
                    while (iCharCount < i2) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                            int iR = qf5.r(str.charAt(iCharCount + 1));
                            int iR2 = qf5.r(str.charAt(i4));
                            if (iR == -1 || iR2 == -1) {
                                ggVar.Z(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                ggVar.L((iR << 4) + iR2);
                                iCharCount = Character.charCount(iCodePointAt) + i4;
                            }
                        } else if (iCodePointAt == 43 && z) {
                            ggVar.L(32);
                            iCharCount++;
                        } else {
                            ggVar.Z(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return ggVar.A();
                }
                iCharCount = i5;
            }
            return str.substring(i, i2);
        }

        public static ArrayList d(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iE = mv4.E(str, '&', i, false, 4);
                if (iE == -1) {
                    iE = str.length();
                }
                int iE2 = mv4.E(str, '=', i, false, 4);
                if (iE2 == -1 || iE2 > iE) {
                    arrayList.add(str.substring(i, iE));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i, iE2));
                    arrayList.add(str.substring(iE2 + 1, iE));
                }
                i = iE + 1;
            }
            return arrayList;
        }
    }

    public static final class QnHx {
        public String a;
        public String d;
        public final ArrayList f;
        public List<String> g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;

        public QnHx() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final ch1 a() {
            ArrayList arrayList;
            String str = this.a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strC = CQf.c(this.b, 0, 0, false, 7);
            String strC2 = CQf.c(this.c, 0, 0, false, 7);
            String str2 = this.d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            ArrayList arrayList2 = this.f;
            ArrayList arrayList3 = new ArrayList(mu.w0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(CQf.c((String) it.next(), 0, 0, false, 7));
            }
            List<String> list = this.g;
            if (list == null) {
                arrayList = null;
            } else {
                List<String> list2 = list;
                arrayList = new ArrayList(mu.w0(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 == null ? null : CQf.c(str3, 0, 0, true, 3));
                }
            }
            String str4 = this.h;
            return new ch1(str, strC, strC2, str2, iB, arrayList3, arrayList, str4 != null ? CQf.c(str4, 0, 0, false, 7) : null, toString());
        }

        public final int b() {
            int i = this.e;
            if (i != -1) {
                return i;
            }
            String str = this.a;
            if (ur1.a(str, "http")) {
                return 80;
            }
            return ur1.a(str, "https") ? 443 : -1;
        }

        public final void c(String str) {
            this.g = str == null ? null : CQf.d(CQf.a(str, 0, 0, " \"'<>#", true, false, true, false, 211));
        }

        /* JADX WARN: Code duplicated, block: B:116:0x021f  */
        /* JADX WARN: Code duplicated, block: B:118:0x0227 A[LOOP:5: B:118:0x0227->B:270:?, LOOP_START, PHI: r5
  0x0227: PHI (r5v11 int) = (r5v4 int), (r5v12 int) binds: [B:117:0x0225, B:270:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:120:0x022a  */
        /* JADX WARN: Code duplicated, block: B:123:0x0235  */
        /* JADX WARN: Code duplicated, block: B:130:0x0245  */
        /* JADX WARN: Code duplicated, block: B:138:0x0278  */
        /* JADX WARN: Code duplicated, block: B:143:0x0283  */
        /* JADX WARN: Code duplicated, block: B:146:0x0289  */
        /* JADX WARN: Code duplicated, block: B:147:0x028b  */
        /* JADX WARN: Code duplicated, block: B:149:0x028e  */
        /* JADX WARN: Code duplicated, block: B:150:0x0294  */
        /* JADX WARN: Code duplicated, block: B:152:0x02b7  */
        /* JADX WARN: Code duplicated, block: B:154:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:155:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:157:0x02db  */
        /* JADX WARN: Code duplicated, block: B:158:0x02de  */
        /* JADX WARN: Code duplicated, block: B:162:0x02e5  */
        /* JADX WARN: Code duplicated, block: B:163:0x02e7  */
        /* JADX WARN: Code duplicated, block: B:165:0x02ea  */
        /* JADX WARN: Code duplicated, block: B:234:0x041d  */
        /* JADX WARN: Code duplicated, block: B:264:0x023d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:265:0x0239 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:267:0x023b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:268:0x0232 A[EDGE_INSN: B:268:0x0232->B:122:0x0232 BREAK  A[LOOP:5: B:118:0x0227->B:270:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x009c  */
        /* JADX WARN: Code duplicated, block: B:89:0x013f  */
        /* JADX WARN: Code duplicated, block: B:92:0x014d  */
        /* JADX WARN: Code duplicated, block: B:93:0x0152  */
        /* JADX WARN: Instruction removed from duplicated block: B:150:0x0294, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:234:0x041d, please report this as an issue */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
        public final void d(ch1 ch1Var, String str) {
            int i;
            byte b;
            byte b2;
            int i2;
            int iG;
            byte bCharAt;
            ArrayList arrayList;
            String str2;
            String str3;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            char c;
            String str4;
            int i8;
            boolean z;
            int i9;
            int i10;
            boolean z2;
            boolean z3;
            char cCharAt;
            int i11;
            ArrayList arrayList2;
            boolean z4;
            char c2;
            byte[] bArr = qf5.a;
            int iN = qf5.n(0, str.length(), str);
            int iO = qf5.o(iN, str.length(), str);
            byte b3 = -1;
            if (iO - iN >= 2) {
                char cCharAt2 = str.charAt(iN);
                char c3 = 'a';
                if ((ur1.b(cCharAt2, 97) >= 0 && ur1.b(cCharAt2, 122) <= 0) || (ur1.b(cCharAt2, 65) >= 0 && ur1.b(cCharAt2, 90) <= 0)) {
                    i = iN + 1;
                    while (true) {
                        if (i < iO) {
                            int i12 = i + 1;
                            char cCharAt3 = str.charAt(i);
                            if (!((((((c3 <= cCharAt3 && cCharAt3 < '{') || ('A' <= cCharAt3 && cCharAt3 < '[')) || ('0' <= cCharAt3 && cCharAt3 < ':')) || cCharAt3 == '+') || cCharAt3 == '-') || cCharAt3 == '.')) {
                                if (cCharAt3 == ':') {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                i = i12;
                                c3 = 'a';
                            }
                        }
                        i = -1;
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
            String str5 = "http";
            String str6 = "https";
            if (i != -1) {
                if (iv4.w(str, iN, "https:", true)) {
                    this.a = "https";
                    iN += 6;
                } else {
                    if (!iv4.w(str, iN, "http:", true)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                    }
                    this.a = "http";
                    iN += 5;
                }
            } else {
                if (ch1Var == null) {
                    throw new IllegalArgumentException(ur1.d(str.length() > 6 ? ur1.d("...", pv4.Z(6, str)) : str, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
                }
                this.a = ch1Var.a;
            }
            int i13 = iN;
            int i14 = 0;
            while (true) {
                b = 92;
                b2 = 47;
                if (i13 >= iO) {
                    break;
                }
                int i15 = i13 + 1;
                char cCharAt4 = str.charAt(i13);
                if (cCharAt4 != '\\' && cCharAt4 != '/') {
                    break;
                }
                i14++;
                i13 = i15;
            }
            ArrayList arrayList3 = this.f;
            byte b4 = 63;
            byte b5 = 35;
            if (i14 >= 2 || ch1Var == null) {
                i2 = iN + i14;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    iG = qf5.g(i2, iO, str, "@/\\?#");
                    if (iG != iO) {
                        bCharAt = str.charAt(iG);
                    } else {
                        bCharAt = -1;
                    }
                    if (bCharAt == b3 || bCharAt == b5 || bCharAt == b2 || bCharAt == b || bCharAt == b4) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z5) {
                            i11 = iG;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.c);
                            sb.append("%40");
                            arrayList2 = arrayList3;
                            sb.append(CQf.a(str, i2, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240));
                            this.c = sb.toString();
                        } else {
                            int iF = qf5.f(':', i2, iG, str);
                            int i16 = i2;
                            ArrayList arrayList4 = arrayList3;
                            i11 = iG;
                            String strA = CQf.a(str, i16, iF, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z6) {
                                strA = this.b + "%40" + strA;
                            }
                            this.b = strA;
                            if (iF != i11) {
                                this.c = CQf.a(str, iF + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z4 = true;
                            } else {
                                z4 = z5;
                            }
                            z5 = z4;
                            arrayList2 = arrayList4;
                            z6 = true;
                        }
                        i2 = i11 + 1;
                        arrayList3 = arrayList2;
                        str6 = str6;
                        str5 = str5;
                        b = 92;
                        b5 = 35;
                        b2 = 47;
                        b4 = 63;
                        b3 = -1;
                    }
                }
                arrayList = arrayList3;
                str2 = str6;
                str3 = str5;
                i3 = 1;
                i4 = i2;
                while (true) {
                    if (i4 >= iG) {
                        i5 = iG;
                        break;
                    }
                    cCharAt = str.charAt(i4);
                    if (cCharAt == '[') {
                        do {
                            i4++;
                            if (i4 < iG) {
                                break;
                            }
                        } while (str.charAt(i4) != ']');
                    } else if (cCharAt == ':') {
                        i5 = i4;
                        break;
                    }
                    i4++;
                }
                i6 = i5 + 1;
                if (i6 < iG) {
                    this.d = AY.S(CQf.c(str, i2, i5, false, 4));
                    i9 = i5;
                    try {
                        i10 = Integer.parseInt(CQf.a(str, i6, iG, "", false, false, false, false, 248));
                        if (1 <= i10 || i10 >= 65536) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            i10 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.e = i10;
                    if (i10 != -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        throw new IllegalArgumentException(("Invalid URL port: \"" + str.substring(i6, iG) + '\"').toString());
                    }
                    i7 = i9;
                    c = '\"';
                } else {
                    i7 = i5;
                    c = '\"';
                    this.d = AY.S(CQf.c(str, i2, i7, false, 4));
                    str4 = this.a;
                    if (ur1.a(str4, str3)) {
                        i8 = 80;
                    } else if (ur1.a(str4, str2)) {
                        i8 = 443;
                    } else {
                        i8 = -1;
                    }
                    this.e = i8;
                }
                if (this.d != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    throw new IllegalArgumentException(("Invalid URL host: \"" + str.substring(i2, i7) + c).toString());
                }
                iN = iG;
            } else {
                if (ur1.a(ch1Var.a, this.a)) {
                    this.b = ch1Var.e();
                    this.c = ch1Var.a();
                    this.d = ch1Var.d;
                    this.e = ch1Var.e;
                    arrayList3.clear();
                    arrayList3.addAll(ch1Var.c());
                    if (iN == iO || str.charAt(iN) == '#') {
                        c(ch1Var.d());
                    }
                    arrayList = arrayList3;
                    i3 = 1;
                } else {
                    i2 = iN + i14;
                    boolean z7 = false;
                    boolean z8 = false;
                    while (true) {
                        iG = qf5.g(i2, iO, str, "@/\\?#");
                        if (iG != iO) {
                            bCharAt = str.charAt(iG);
                        } else {
                            bCharAt = -1;
                        }
                        if (bCharAt == b3) {
                            break;
                        } else {
                            break;
                        }
                    }
                    arrayList = arrayList3;
                    str2 = str6;
                    str3 = str5;
                    i3 = 1;
                    i4 = i2;
                    while (true) {
                        if (i4 >= iG) {
                            i5 = iG;
                            break;
                        }
                        cCharAt = str.charAt(i4);
                        if (cCharAt == '[') {
                            do {
                                i4++;
                                if (i4 < iG) {
                                    break;
                                    break;
                                }
                            } while (str.charAt(i4) != ']');
                        } else if (cCharAt == ':') {
                            i5 = i4;
                            break;
                        }
                        i4++;
                    }
                    i6 = i5 + 1;
                    if (i6 < iG) {
                        this.d = AY.S(CQf.c(str, i2, i5, false, 4));
                        i9 = i5;
                        i10 = Integer.parseInt(CQf.a(str, i6, iG, "", false, false, false, false, 248));
                        if (1 <= i10) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            i10 = -1;
                        }
                        this.e = i10;
                        if (i10 != -1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            throw new IllegalArgumentException(("Invalid URL port: \"" + str.substring(i6, iG) + '\"').toString());
                        }
                        i7 = i9;
                        c = '\"';
                    } else {
                        i7 = i5;
                        c = '\"';
                        this.d = AY.S(CQf.c(str, i2, i7, false, 4));
                        str4 = this.a;
                        if (ur1.a(str4, str3)) {
                            i8 = 80;
                        } else if (ur1.a(str4, str2)) {
                            i8 = 443;
                        } else {
                            i8 = -1;
                        }
                        this.e = i8;
                    }
                    if (this.d != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        throw new IllegalArgumentException(("Invalid URL host: \"" + str.substring(i2, i7) + c).toString());
                    }
                    iN = iG;
                }
            }
            int iG2 = qf5.g(iN, iO, str, "?#");
            if (iN != iG2) {
                char cCharAt5 = str.charAt(iN);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    arrayList.clear();
                    arrayList.add("");
                    iN++;
                } else {
                    arrayList.set(arrayList.size() - i3, "");
                }
                while (iN < iG2) {
                    int iG3 = qf5.g(iN, iG2, str, "/\\");
                    boolean z9 = iG3 < iG2;
                    String strA2 = CQf.a(str, iN, iG3, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                    if (!(ur1.a(strA2, ".") || iv4.r(strA2, "%2e"))) {
                        if (ur1.a(strA2, "..") || iv4.r(strA2, "%2e.") || iv4.r(strA2, ".%2e") || iv4.r(strA2, "%2e%2e")) {
                            if (!(((String) arrayList.remove(arrayList.size() - i3)).length() == 0) || (arrayList.isEmpty() ^ i3) == 0) {
                                arrayList.add("");
                            } else {
                                arrayList.set(arrayList.size() - i3, "");
                            }
                        } else {
                            if (((CharSequence) arrayList.get(arrayList.size() - i3)).length() == 0) {
                                arrayList.set(arrayList.size() - i3, strA2);
                            } else {
                                arrayList.add(strA2);
                            }
                            if (z9) {
                                arrayList.add("");
                            }
                        }
                    }
                    iN = z9 ? iG3 + 1 : iG3;
                }
            }
            if (iG2 >= iO || str.charAt(iG2) != '?') {
                c2 = '#';
            } else {
                c2 = '#';
                int iF2 = qf5.f('#', iG2, iO, str);
                this.g = CQf.d(CQf.a(str, iG2 + 1, iF2, " \"'<>#", true, false, true, false, 208));
                iG2 = iF2;
            }
            if (iG2 >= iO || str.charAt(iG2) != c2) {
                return;
            }
            this.h = CQf.a(str, iG2 + 1, iO, "", true, false, false, true, 176);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0035  */
        /* JADX WARN: Code duplicated, block: B:20:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x0046  */
        /* JADX WARN: Code duplicated, block: B:43:0x009a  */
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.b.length() > 0) {
                sb.append(this.b);
                if (this.c.length() > 0) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            } else if (this.c.length() > 0) {
                sb.append(this.b);
                if (this.c.length() > 0) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (mv4.z(str2, ':')) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            int i = -1;
            if (this.e != -1 || this.a != null) {
                int iB = b();
                String str3 = this.a;
                if (str3 == null) {
                    sb.append(':');
                    sb.append(iB);
                } else {
                    if (ur1.a(str3, "http")) {
                        i = 80;
                    } else if (ur1.a(str3, "https")) {
                        i = 443;
                    }
                    if (iB != i) {
                        sb.append(':');
                        sb.append(iB);
                    }
                }
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append((String) arrayList.get(i2));
            }
            if (this.g != null) {
                sb.append('?');
                List<String> list = this.g;
                np1 np1VarM = AY.M(AY.V(0, list.size()), 2);
                int i3 = np1VarM.w;
                int i4 = np1VarM.x;
                int i5 = np1VarM.y;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        int i6 = i3 + i5;
                        String str4 = list.get(i3);
                        String str5 = list.get(i3 + 1);
                        if (i3 > 0) {
                            sb.append('&');
                        }
                        sb.append(str4);
                        if (str5 != null) {
                            sb.append('=');
                            sb.append(str5);
                        }
                        if (i3 == i4) {
                            break;
                        }
                        i3 = i6;
                    }
                }
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    static {
        new CQf();
        k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public ch1(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
        this.j = ur1.a(str, "https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(mv4.E(str, ':', length, false, 4) + 1, mv4.E(str, '@', 0, false, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iE = mv4.E(str, '/', length, false, 4);
        return str.substring(iE, qf5.g(iE, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iE = mv4.E(str, '/', length, false, 4);
        int iG = qf5.g(iE, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iE < iG) {
            int i = iE + 1;
            int iF = qf5.f('/', i, iG, str);
            arrayList.add(str.substring(i, iF));
            iE = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iE = mv4.E(str, '?', 0, false, 6) + 1;
        return str.substring(iE, qf5.f('#', iE, str.length(), str));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, qf5.g(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ch1) && ur1.a(((ch1) obj).i, this.i);
    }

    public final String f() {
        QnHx qnHx;
        try {
            qnHx = new QnHx();
            qnHx.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            qnHx = null;
        }
        qnHx.b = CQf.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        qnHx.c = CQf.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return qnHx.a().i;
    }

    public final URI g() {
        String strSubstring;
        QnHx qnHx = new QnHx();
        String str = this.a;
        qnHx.a = str;
        qnHx.b = e();
        qnHx.c = a();
        qnHx.d = this.d;
        int i = ur1.a(str, "http") ? 80 : ur1.a(str, "https") ? 443 : -1;
        int i2 = this.e;
        qnHx.e = i2 != i ? i2 : -1;
        ArrayList arrayList = qnHx.f;
        arrayList.clear();
        arrayList.addAll(c());
        qnHx.c(d());
        int i3 = 0;
        if (this.h == null) {
            strSubstring = null;
        } else {
            String str2 = this.i;
            strSubstring = str2.substring(mv4.E(str2, '#', 0, false, 6) + 1);
        }
        qnHx.h = strSubstring;
        String str3 = qnHx.d;
        qnHx.d = str3 == null ? null : Pattern.compile("[\"<>^`{|}]").matcher(str3).replaceAll("");
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.set(i4, CQf.a((String) arrayList.get(i4), 0, 0, "[]", true, true, false, false, 227));
        }
        List<String> list = qnHx.g;
        if (list != null) {
            int size2 = list.size();
            while (i3 < size2) {
                int i5 = i3 + 1;
                String str4 = list.get(i3);
                list.set(i3, str4 == null ? null : CQf.a(str4, 0, 0, "\\^`{|}", true, true, true, false, 195));
                i3 = i5;
            }
        }
        String str5 = qnHx.h;
        qnHx.h = str5 != null ? CQf.a(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = qnHx.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
