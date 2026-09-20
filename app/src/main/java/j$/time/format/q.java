package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
final class q implements g {
    private static volatile AbstractMap.SimpleImmutableEntry b;
    private static volatile AbstractMap.SimpleImmutableEntry c;
    private final j$.time.temporal.r a;

    q(C1459a c1459a) {
        this.a = c1459a;
    }

    private static int a(s sVar, CharSequence charSequence, int i, int i2, k kVar) {
        String upperCase = charSequence.toString().substring(i, i2).toUpperCase();
        if (i2 >= charSequence.length() || charSequence.charAt(i2) == '0' || sVar.a(charSequence.charAt(i2), 'Z')) {
            sVar.m(ZoneId.of(upperCase));
            return i2;
        }
        s sVarC = sVar.c();
        int iK = kVar.k(sVarC, charSequence, i2);
        try {
            if (iK >= 0) {
                sVar.m(ZoneId.N(upperCase, ZoneOffset.U((int) sVarC.i(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return iK;
            }
            if (kVar == k.d) {
                return ~i;
            }
            sVar.m(ZoneId.of(upperCase));
            return i2;
        } catch (DateTimeException unused) {
            return ~i;
        }
    }

    @Override // j$.time.format.g
    public final boolean j(u uVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) uVar.f(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.g
    public final int k(s sVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return a(sVar, charSequence, i, i, k.d);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (sVar.a(cCharAt, 'U') && sVar.a(cCharAt2, 'T')) {
                int i4 = i + 3;
                return (length < i4 || !sVar.a(charSequence.charAt(i3), 'C')) ? a(sVar, charSequence, i, i3, k.e) : a(sVar, charSequence, i, i4, k.e);
            }
            if (sVar.a(cCharAt, 'G') && length >= (i2 = i + 3) && sVar.a(cCharAt2, 'M') && sVar.a(charSequence.charAt(i3), 'T')) {
                return a(sVar, charSequence, i, i2, k.e);
            }
        }
        HashSet hashSetA = j$.time.zone.i.a();
        int size = hashSetA.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = sVar.j() ? b : c;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = sVar.j() ? b : c;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), m.e(hashSetA, sVar));
                        if (sVar.j()) {
                            b = simpleImmutableEntry;
                        } else {
                            c = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m mVar = (m) simpleImmutableEntry.getValue();
        ParsePosition parsePosition = new ParsePosition(i);
        String strC = mVar.c(charSequence, parsePosition);
        if (strC != null) {
            sVar.m(ZoneId.of(strC));
            return parsePosition.getIndex();
        }
        if (!sVar.a(cCharAt, 'Z')) {
            return ~i;
        }
        sVar.m(ZoneOffset.UTC);
        return i + 1;
    }

    public final String toString() {
        return "ZoneRegionId()";
    }
}
