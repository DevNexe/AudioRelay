package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LPt9Fixed {
    public int a;
    public String c;
    public final ru1 b = new ru1();
    public final StringBuilder d = new StringBuilder();

    public static /* synthetic */ void o(LPt9Fixed lPt9, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = lPt9.a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        lPt9.n(i, str, str2);
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.d.append((char) (q(i + 3, charSequence) + (q(i, charSequence) << 12) + (q(i + 1, charSequence) << 8) + (q(i + 2, charSequence) << 4)));
            return i2;
        }
        this.a = i;
        if (i2 < charSequence.length()) {
            return a(this.a, charSequence);
        }
        o(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public abstract boolean b();

    public final boolean c(int i) {
        int iT = t(i);
        if (iT >= r().length() || iT == -1) {
            o(this, "EOF", 0, null, 6);
            throw null;
        }
        int i2 = iT + 1;
        int iCharAt = r().charAt(iT) | ' ';
        if (iCharAt == 116) {
            d(i2, "rue");
            return true;
        }
        if (iCharAt == 102) {
            d(i2, "alse");
            return false;
        }
        o(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
        throw null;
    }

    public final void d(int i, String str) {
        if (r().length() - i < str.length()) {
            o(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (r().charAt(i + i2) | ' ')) {
                o(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.a = str.length() + i;
    }

    public abstract String e();

    public abstract String f(String str, boolean z);

    public abstract byte g();

    public final byte h(byte b) {
        byte bG = g();
        if (bG == b) {
            return bG;
        }
        p(b);
        throw null;
    }

    public abstract void i(char c);

    public final long j() {
        boolean z;
        int iT = t(u());
        int i = 6;
        int i2 = 0;
        if (iT >= r().length() || iT == -1) {
            o(this, "EOF", 0, null, 6);
            throw null;
        }
        if (r().charAt(iT) == '\"') {
            iT++;
            if (iT == r().length()) {
                o(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i3 = iT;
        boolean z2 = true;
        boolean z3 = false;
        long j = 0;
        while (z2) {
            char cCharAt = r().charAt(i3);
            if (cCharAt != '-') {
                if (AY.l(cCharAt) != 0) {
                    break;
                }
                i3++;
                z2 = i3 != r().length();
                int i4 = cCharAt - '0';
                if (!(i4 >= 0 && i4 < 10)) {
                    o(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                    throw null;
                }
                j = (j * ((long) 10)) - ((long) i4);
                if (j > 0) {
                    o(this, "Numeric value overflow", 0, null, 6);
                    throw null;
                }
                i = 6;
                i2 = 0;
            } else {
                if (i3 != iT) {
                    o(this, "Unexpected symbol '-' in numeric literal", i2, null, i);
                    throw null;
                }
                i3++;
                z3 = true;
            }
        }
        if (iT == i3 || (z3 && iT == i3 - 1)) {
            o(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z) {
            if (!z2) {
                o(this, "EOF", 0, null, 6);
                throw null;
            }
            if (r().charAt(i3) != '\"') {
                o(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i3++;
        }
        this.a = i3;
        if (z3) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        o(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final String k() {
        String str = this.c;
        if (str == null) {
            return e();
        }
        this.c = null;
        return str;
    }

    public final String l() {
        String string;
        String str = this.c;
        if (str != null) {
            this.c = null;
            return str;
        }
        int iU = u();
        if (iU >= r().length() || iU == -1) {
            o(this, "EOF", iU, null, 4);
            throw null;
        }
        byte bL = AY.l(r().charAt(iU));
        if (bL == 1) {
            return k();
        }
        if (bL != 0) {
            o(this, "Expected beginning of the string, but got " + r().charAt(iU), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (true) {
            byte bL2 = AY.l(r().charAt(iU));
            StringBuilder sb = this.d;
            if (bL2 != 0) {
                if (z) {
                    sb.append((CharSequence) r(), this.a, iU);
                    string = sb.toString();
                    sb.setLength(0);
                } else {
                    string = r().subSequence(this.a, iU).toString();
                }
                this.a = iU;
                return string;
            }
            iU++;
            if (iU >= r().length()) {
                sb.append((CharSequence) r(), this.a, iU);
                int iT = t(iU);
                if (iT == -1) {
                    this.a = iU;
                    sb.append((CharSequence) r(), 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iU = iT;
                z = true;
            }
        }
    }

    public final String m() {
        String strL = l();
        if (ur1.a(strL, "null")) {
            if (r().charAt(this.a - 1) != '\"') {
                o(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return strL;
    }

    public final void n(int i, String str, String str2) {
        throw AY.h(str + " at path: " + this.b.a() + (str2.length() == 0 ? "" : "\n".concat(str2)), r(), i);
    }

    public final void p(byte b) {
        String str;
        if (b == 1) {
            str = "quotation mark '\"'";
        } else if (b == 4) {
            str = "comma ','";
        } else if (b == 5) {
            str = "colon ':'";
        } else if (b == 6) {
            str = "start of the object '{'";
        } else if (b == 7) {
            str = "end of the object '}'";
        } else if (b == 8) {
            str = "start of the array '['";
        } else {
            str = b == 9 ? "end of the array ']'" : "valid token";
        }
        o(this, "Expected " + str + ", but had '" + ((this.a == r().length() || this.a <= 0) ? "EOF" : String.valueOf(r().charAt(this.a - 1))) + "' instead", this.a - 1, null, 4);
        throw null;
    }

    public final int q(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        char c = 'a';
        if (!('a' <= cCharAt && cCharAt < 'g')) {
            c = 'A';
            if (!('A' <= cCharAt && cCharAt < 'G')) {
                o(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
                throw null;
            }
        }
        return (cCharAt - c) + 10;
    }

    public abstract String r();

    public final byte s() {
        String strR = r();
        int i = this.a;
        while (true) {
            int iT = t(i);
            if (iT == -1) {
                this.a = iT;
                return (byte) 10;
            }
            char cCharAt = strR.charAt(iT);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = iT;
                return AY.l(cCharAt);
            }
            i = iT + 1;
        }
    }

    public abstract int t(int i);

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) r());
        sb.append("', currentPosition=");
        return qc0.a(sb, this.a, ')');
    }

    public abstract int u();

    public abstract boolean v();

    public final boolean w() {
        int iT = t(u());
        int length = r().length() - iT;
        if (length < 4 || iT == -1) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != r().charAt(iT + i)) {
                return true;
            }
        }
        if (length > 4 && AY.l(r().charAt(iT + 4)) == 0) {
            return true;
        }
        this.a = iT + 4;
        return false;
    }

    public final void x(char c) {
        int i = this.a - 1;
        this.a = i;
        if (i >= 0 && c == '\"' && ur1.a(l(), "null")) {
            n(this.a - 4, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw null;
        }
        p(AY.l(c));
        throw null;
    }
}
