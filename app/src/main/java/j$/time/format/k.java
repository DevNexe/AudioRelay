package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class k implements g {
    static final String[] c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
    static final k d = new k("+HH:MM:ss", "Z");
    static final k e = new k("+HH:MM:ss", "0");
    private final String a;
    private final int b;

    k(String str, String str2) {
        int i = 0;
        while (true) {
            String[] strArr = c;
            if (i >= 9) {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
            if (strArr[i].equals(str)) {
                this.b = i;
                this.a = str2;
                return;
            }
            i++;
        }
    }

    private boolean a(int[] iArr, int i, CharSequence charSequence, boolean z) {
        int i2 = this.b;
        if ((i2 + 3) / 2 < i) {
            return false;
        }
        int i3 = iArr[0];
        if (i2 % 2 == 0 && i > 1) {
            int i4 = i3 + 1;
            if (i4 > charSequence.length() || charSequence.charAt(i3) != ':') {
                return z;
            }
            i3 = i4;
        }
        if (i3 + 2 > charSequence.length()) {
            return z;
        }
        int i5 = i3 + 1;
        char cCharAt = charSequence.charAt(i3);
        int i6 = i5 + 1;
        char cCharAt2 = charSequence.charAt(i5);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            int i7 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
            if (i7 >= 0 && i7 <= 59) {
                iArr[i] = i7;
                iArr[0] = i6;
                return false;
            }
        }
        return z;
    }

    @Override // j$.time.format.g
    public final boolean j(u uVar, StringBuilder sb) {
        Long lE = uVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int i = (int) jLongValue;
        if (jLongValue != i) {
            throw new ArithmeticException();
        }
        if (i == 0) {
            sb.append(this.a);
        } else {
            int iAbs = Math.abs((i / 3600) % 100);
            int iAbs2 = Math.abs((i / 60) % 60);
            int iAbs3 = Math.abs(i % 60);
            int length = sb.length();
            sb.append(i < 0 ? "-" : "+");
            sb.append((char) ((iAbs / 10) + 48));
            sb.append((char) ((iAbs % 10) + 48));
            int i2 = this.b;
            if (i2 >= 3 || (i2 >= 1 && iAbs2 > 0)) {
                int i3 = i2 % 2;
                sb.append(i3 == 0 ? ":" : "");
                sb.append((char) ((iAbs2 / 10) + 48));
                sb.append((char) ((iAbs2 % 10) + 48));
                iAbs += iAbs2;
                if (i2 >= 7 || (i2 >= 5 && iAbs3 > 0)) {
                    sb.append(i3 != 0 ? "" : ":");
                    sb.append((char) ((iAbs3 / 10) + 48));
                    sb.append((char) ((iAbs3 % 10) + 48));
                    iAbs += iAbs3;
                }
            }
            if (iAbs == 0) {
                sb.setLength(length);
                sb.append(this.a);
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    @Override // j$.time.format.g
    public final int k(s sVar, CharSequence charSequence, int i) {
        int i2;
        long j;
        j$.time.temporal.a aVar;
        j$.time.temporal.a aVar2;
        boolean z;
        int length = charSequence.length();
        int length2 = this.a.length();
        if (length2 == 0) {
            if (i == length) {
                aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                i2 = i;
                j = 0;
            }
            return sVar.n(aVar2, j, i, i2);
        }
        if (i == length) {
            return ~i;
        }
        if (sVar.r(charSequence, i, this.a, 0, length2)) {
            aVar = j$.time.temporal.a.OFFSET_SECONDS;
            i2 = i + length2;
            j = 0;
        }
        aVar2 = aVar;
        return sVar.n(aVar2, j, i, i2);
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            int i3 = cCharAt == '-' ? -1 : 1;
            int[] iArr = new int[4];
            iArr[0] = i + 1;
            if (a(iArr, 1, charSequence, true)) {
                z = true;
            } else {
                if (a(iArr, 2, charSequence, this.b >= 3) || a(iArr, 3, charSequence, false)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                long j2 = ((((long) iArr[2]) * 60) + (((long) iArr[1]) * 3600) + ((long) iArr[3])) * ((long) i3);
                aVar = j$.time.temporal.a.OFFSET_SECONDS;
                int i4 = iArr[0];
                j = j2;
                i2 = i4;
            }
            aVar2 = aVar;
            return sVar.n(aVar2, j, i, i2);
        }
        if (length2 != 0) {
            return ~i;
        }
        aVar = j$.time.temporal.a.OFFSET_SECONDS;
        i2 = i + length2;
        j = 0;
        aVar2 = aVar;
        return sVar.n(aVar2, j, i, i2);
    }

    public final String toString() {
        return "Offset(" + c[this.b] + ",'" + this.a.replace("'", "''") + "')";
    }
}
