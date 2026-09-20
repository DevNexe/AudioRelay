package j$.time.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class h implements g {
    private final j$.time.temporal.q a;
    private final int b;
    private final int c;
    private final boolean d;

    h(j$.time.temporal.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("field");
        }
        if (!aVar.l().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
        this.a = aVar;
        this.b = 0;
        this.c = 9;
        this.d = true;
    }

    @Override // j$.time.format.g
    public final boolean j(u uVar, StringBuilder sb) {
        j$.time.temporal.q qVar = this.a;
        Long lE = uVar.e(qVar);
        if (lE == null) {
            return false;
        }
        w wVarB = uVar.b();
        long jLongValue = lE.longValue();
        j$.time.temporal.u uVarL = qVar.l();
        uVarL.b(jLongValue, qVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(uVarL.e());
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf).divide(BigDecimal.valueOf(uVarL.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal bigDecimalStripTrailingZeros = bigDecimalDivide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : bigDecimalDivide.stripTrailingZeros();
        int iScale = bigDecimalStripTrailingZeros.scale();
        boolean z = this.d;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimalStripTrailingZeros.setScale(Math.min(Math.max(bigDecimalStripTrailingZeros.scale(), i), this.c), RoundingMode.FLOOR).toPlainString().substring(2);
            wVarB.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z) {
            wVarB.getClass();
            sb.append('.');
        }
        for (int i2 = 0; i2 < i; i2++) {
            wVarB.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.g
    public final int k(s sVar, CharSequence charSequence, int i) {
        int i2;
        int i3 = sVar.k() ? this.b : 0;
        int i4 = sVar.k() ? this.c : 9;
        int length = charSequence.length();
        if (i == length) {
            return i3 > 0 ? ~i : i;
        }
        if (this.d) {
            char cCharAt = charSequence.charAt(i);
            sVar.f().getClass();
            if (cCharAt != '.') {
                return i3 > 0 ? ~i : i;
            }
            i++;
        }
        int i5 = i;
        int i6 = i3 + i5;
        if (i6 > length) {
            return ~i5;
        }
        int iMin = Math.min(i4 + i5, length);
        int i7 = i5;
        int i8 = 0;
        while (i7 < iMin) {
            int i9 = i7 + 1;
            int iA = sVar.f().a(charSequence.charAt(i7));
            if (iA < 0) {
                if (i9 < i6) {
                    return ~i5;
                }
                i2 = i9 - 1;
                BigDecimal bigDecimalMovePointLeft = new BigDecimal(i8).movePointLeft(i2 - i5);
                j$.time.temporal.u uVarL = this.a.l();
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(uVarL.e());
                return sVar.n(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(uVarL.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i5, i2);
            }
            i8 = (i8 * 10) + iA;
            i7 = i9;
        }
        i2 = i7;
        BigDecimal bigDecimalMovePointLeft2 = new BigDecimal(i8).movePointLeft(i2 - i5);
        j$.time.temporal.u uVarL2 = this.a.l();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(uVarL2.e());
        return sVar.n(this.a, bigDecimalMovePointLeft2.multiply(BigDecimal.valueOf(uVarL2.d()).subtract(bigDecimalValueOf2).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf2).longValueExact(), i5, i2);
    }

    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.d ? ",DecimalPoint" : "") + ")";
    }
}
