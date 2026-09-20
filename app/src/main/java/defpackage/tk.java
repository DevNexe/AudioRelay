package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class tk {
    public static final /* synthetic */ int n = 0;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    public static final class CQf {
        public static int a(int i, String str, String str2) {
            int length = str.length();
            while (i < length) {
                int i2 = i + 1;
                if (mv4.z(str2, str.charAt(i))) {
                    return i;
                }
                i = i2;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0045  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:41:0x00db  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:50:0x0100  */
        /* JADX WARN: Code duplicated, block: B:51:0x0105  */
        /* JADX WARN: Code duplicated, block: B:53:0x010d  */
        /* JADX WARN: Code duplicated, block: B:54:0x0110  */
        /* JADX WARN: Code duplicated, block: B:56:0x0118  */
        /* JADX WARN: Code duplicated, block: B:57:0x011b  */
        /* JADX WARN: Code duplicated, block: B:59:0x0123  */
        /* JADX WARN: Code duplicated, block: B:60:0x0127  */
        /* JADX WARN: Code duplicated, block: B:62:0x012f  */
        /* JADX WARN: Code duplicated, block: B:63:0x0137  */
        /* JADX WARN: Code duplicated, block: B:65:0x013f  */
        /* JADX WARN: Code duplicated, block: B:66:0x0145  */
        /* JADX WARN: Code duplicated, block: B:68:0x014e  */
        /* JADX WARN: Code duplicated, block: B:69:0x0151  */
        /* JADX WARN: Code duplicated, block: B:71:0x0159  */
        /* JADX WARN: Code duplicated, block: B:72:0x015c  */
        /* JADX WARN: Code duplicated, block: B:74:0x0164  */
        /* JADX WARN: Code duplicated, block: B:95:0x0166 A[SYNTHETIC] */
        public static tk b(nc1 nc1Var) {
            int i;
            int iA;
            String string;
            int i2;
            int iA2;
            String string2;
            nc1 nc1Var2 = nc1Var;
            int length = nc1Var2.w.length / 2;
            int i3 = 0;
            boolean z = true;
            String str = null;
            boolean z2 = false;
            boolean z3 = false;
            int iW = -1;
            int iW2 = -1;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            int iW3 = -1;
            int iW4 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            while (i3 < length) {
                int i4 = i3 + 1;
                String strB = nc1Var2.b(i3);
                String strE = nc1Var2.e(i3);
                if (iv4.r(strB, "Cache-Control")) {
                    if (str == null) {
                        str = strE;
                    }
                    i = 0;
                    while (i < strE.length()) {
                        iA = a(i, strE, "=,;");
                        string = mv4.W(strE.substring(i, iA)).toString();
                        if (iA != strE.length() || strE.charAt(iA) == ',' || strE.charAt(iA) == ';') {
                            i2 = length;
                            iA2 = iA + 1;
                            string2 = null;
                        } else {
                            int length2 = iA + 1;
                            byte[] bArr = qf5.a;
                            int length3 = strE.length();
                            while (true) {
                                if (length2 >= length3) {
                                    i2 = length;
                                    length2 = strE.length();
                                    break;
                                }
                                int i5 = length2 + 1;
                                char cCharAt = strE.charAt(length2);
                                i2 = length;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length2 = i5;
                                length = i2;
                            }
                            if (length2 >= strE.length() || strE.charAt(length2) != '\"') {
                                iA2 = a(length2, strE, ",;");
                                string2 = mv4.W(strE.substring(length2, iA2)).toString();
                            } else {
                                int i6 = length2 + 1;
                                int iE = mv4.E(strE, '\"', i6, false, 4);
                                string2 = strE.substring(i6, iE);
                                iA2 = iE + 1;
                            }
                        }
                        if (iv4.r("no-cache", string)) {
                            z2 = true;
                        } else if (iv4.r("no-store", string)) {
                            z3 = true;
                        } else if (iv4.r("max-age", string)) {
                            iW = qf5.w(-1, string2);
                        } else if (iv4.r("s-maxage", string)) {
                            iW2 = qf5.w(-1, string2);
                        } else if (iv4.r("private", string)) {
                            z4 = true;
                        } else if (iv4.r("public", string)) {
                            z5 = true;
                        } else if (iv4.r("must-revalidate", string)) {
                            z6 = true;
                        } else if (iv4.r("max-stale", string)) {
                            iW3 = qf5.w(Integer.MAX_VALUE, string2);
                        } else if (iv4.r("min-fresh", string)) {
                            iW4 = qf5.w(-1, string2);
                        } else if (iv4.r("only-if-cached", string)) {
                            z7 = true;
                        } else if (iv4.r("no-transform", string)) {
                            z8 = true;
                        } else if (iv4.r("immutable", string)) {
                            z9 = true;
                        }
                        i = iA2;
                        length = i2;
                    }
                    nc1Var2 = nc1Var;
                    i3 = i4;
                    length = length;
                } else {
                    if (iv4.r(strB, "Pragma")) {
                    }
                    nc1Var2 = nc1Var;
                    i3 = i4;
                    length = length;
                }
                z = false;
                i = 0;
                while (i < strE.length()) {
                    iA = a(i, strE, "=,;");
                    string = mv4.W(strE.substring(i, iA)).toString();
                    if (iA != strE.length()) {
                        i2 = length;
                        iA2 = iA + 1;
                        string2 = null;
                    } else {
                        i2 = length;
                        iA2 = iA + 1;
                        string2 = null;
                    }
                    if (iv4.r("no-cache", string)) {
                        z2 = true;
                    } else if (iv4.r("no-store", string)) {
                        z3 = true;
                    } else if (iv4.r("max-age", string)) {
                        iW = qf5.w(-1, string2);
                    } else if (iv4.r("s-maxage", string)) {
                        iW2 = qf5.w(-1, string2);
                    } else if (iv4.r("private", string)) {
                        z4 = true;
                    } else if (iv4.r("public", string)) {
                        z5 = true;
                    } else if (iv4.r("must-revalidate", string)) {
                        z6 = true;
                    } else if (iv4.r("max-stale", string)) {
                        iW3 = qf5.w(Integer.MAX_VALUE, string2);
                    } else if (iv4.r("min-fresh", string)) {
                        iW4 = qf5.w(-1, string2);
                    } else if (iv4.r("only-if-cached", string)) {
                        z7 = true;
                    } else if (iv4.r("no-transform", string)) {
                        z8 = true;
                    } else if (iv4.r("immutable", string)) {
                        z9 = true;
                    }
                    i = iA2;
                    length = i2;
                }
                nc1Var2 = nc1Var;
                i3 = i4;
                length = length;
            }
            return new tk(z2, z3, iW, iW2, z4, z5, z6, iW3, iW4, z7, z8, z9, !z ? null : str);
        }
    }

    public static final class QnHx {
    }

    static {
        new QnHx();
        new QnHx();
        TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
    }

    public tk(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        this.m = string;
        return string;
    }
}
