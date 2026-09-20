package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC1450e;

/* JADX INFO: loaded from: classes2.dex */
final class i implements g {
    i() {
    }

    @Override // j$.time.format.g
    public final boolean j(u uVar, StringBuilder sb) {
        Long lE = uVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.l lVarD = uVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = lVarD.e(aVar) ? Long.valueOf(uVar.d().g(aVar)) : null;
        int i = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iM = aVar.M(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j = (jLongValue - 315569520000L) + 62167219200L;
            long jG = j$.time.a.g(j, 315569520000L) + 1;
            LocalDateTime localDateTimeW = LocalDateTime.W(j$.time.a.e(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jG > 0) {
                sb.append('+');
                sb.append(jG);
            }
            sb.append(localDateTimeW);
            if (localDateTimeW.P() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeW2 = LocalDateTime.W(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeW2);
            if (localDateTimeW2.P() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeW2.Q() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iM > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iM <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iM / i2;
                sb.append((char) (i3 + 48));
                iM -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.g
    public final int k(s sVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        r rVar = new r();
        rVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        rVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        rVar.l(aVar, 2);
        rVar.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        rVar.l(aVar2, 2);
        rVar.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        rVar.l(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        rVar.b(aVar4);
        rVar.e('Z');
        f fVarH = rVar.s().h();
        s sVarC = sVar.c();
        int iK = fVarH.k(sVarC, charSequence, i);
        if (iK < 0) {
            return iK;
        }
        long jLongValue = sVarC.i(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = sVarC.i(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = sVarC.i(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = sVarC.i(aVar).intValue();
        int iIntValue4 = sVarC.i(aVar2).intValue();
        Long lI = sVarC.i(aVar3);
        Long lI2 = sVarC.i(aVar4);
        int i4 = 0;
        int iIntValue5 = lI != null ? lI.intValue() : 0;
        int iIntValue6 = lI2 != null ? lI2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i3 = iIntValue5;
            i4 = 1;
            i2 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            sVar.o();
            i2 = iIntValue3;
            i3 = 59;
        } else {
            i2 = iIntValue3;
            i3 = iIntValue5;
        }
        try {
            return sVar.n(aVar4, iIntValue6, i, sVar.n(j$.time.temporal.a.INSTANT_SECONDS, j$.time.a.f(jLongValue / 10000, 315569520000L) + AbstractC1450e.p(LocalDateTime.U(((int) jLongValue) % 10000, iIntValue, iIntValue2, i2, iIntValue4, i3).Y(i4), ZoneOffset.UTC), i, iK));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
