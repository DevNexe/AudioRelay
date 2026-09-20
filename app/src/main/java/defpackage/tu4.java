package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tu4 extends LPt9Fixed {
    public final String e;

    public tu4(String str) {
        this.e = str;
    }

    @Override // defpackage.LPt9Fixed
    public final boolean b() {
        int i = this.a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = i;
                return !(((cCharAt == '}' || cCharAt == ']') || cCharAt == ':') || cCharAt == ',');
            }
            i++;
        }
    }

    @Override // defpackage.LPt9Fixed
    public final String e() {
        String string;
        i('\"');
        int i = this.a;
        String str = this.e;
        int iE = mv4.E(str, '\"', i, false, 4);
        if (iE == -1) {
            p((byte) 1);
            throw null;
        }
        int i2 = i;
        while (i2 < iE) {
            if (str.charAt(i2) == '\\') {
                int iT = this.a;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (true) {
                    StringBuilder sb = this.d;
                    if (cCharAt == '\"') {
                        if (z) {
                            sb.append((CharSequence) r(), iT, i2);
                            string = sb.toString();
                            sb.setLength(0);
                        } else {
                            string = r().subSequence(iT, i2).toString();
                        }
                        this.a = i2 + 1;
                        return string;
                    }
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) r(), iT, i2);
                        int iT2 = t(i2 + 1);
                        if (iT2 == -1) {
                            LPt9Fixed.o(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iT2 + 1;
                        char cCharAt2 = str.charAt(iT2);
                        if (cCharAt2 == 'u') {
                            iA = a(iA, str);
                        } else {
                            char c = cCharAt2 < 'u' ? lp.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                LPt9Fixed.o(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iT = t(iA);
                        if (iT == -1) {
                            LPt9Fixed.o(this, "EOF", iT, null, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            sb.append((CharSequence) r(), iT, i2);
                            iT = t(i2);
                            if (iT == -1) {
                                LPt9Fixed.o(this, "EOF", iT, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i2);
                    }
                    i2 = iT;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
            } else {
                i2++;
            }
        }
        this.a = iE + 1;
        return str.substring(i, iE);
    }

    @Override // defpackage.LPt9Fixed
    public final String f(String str, boolean z) {
        int i = this.a;
        try {
            if (g() != 6) {
                return null;
            }
            if (!ur1.a(z ? e() : m(), str)) {
                return null;
            }
            if (g() != 5) {
                return null;
            }
            return z ? k() : m();
        } finally {
            this.a = i;
        }
    }

    @Override // defpackage.LPt9Fixed
    public final byte g() {
        byte bL;
        do {
            int i = this.a;
            if (i == -1) {
                return (byte) 10;
            }
            String str = this.e;
            if (i >= str.length()) {
                return (byte) 10;
            }
            int i2 = this.a;
            this.a = i2 + 1;
            bL = AY.l(str.charAt(i2));
        } while (bL == 3);
        return bL;
    }

    @Override // defpackage.LPt9Fixed
    public final void i(char c) {
        if (this.a == -1) {
            x(c);
            throw null;
        }
        while (true) {
            int i = this.a;
            String str = this.e;
            if (i >= str.length()) {
                x(c);
                throw null;
            }
            int i2 = this.a;
            this.a = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c) {
                    return;
                }
                x(c);
                throw null;
            }
        }
    }

    @Override // defpackage.LPt9Fixed
    public final String r() {
        return this.e;
    }

    @Override // defpackage.LPt9Fixed
    public final int t(int i) {
        if (i < this.e.length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.LPt9Fixed
    public final int u() {
        char cCharAt;
        int i = this.a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.a = i;
        return i;
    }

    @Override // defpackage.LPt9Fixed
    public final boolean v() {
        int iU = u();
        String str = this.e;
        if (iU == str.length() || iU == -1 || str.charAt(iU) != ',') {
            return false;
        }
        this.a++;
        return true;
    }
}
