package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends AbstractC1449d implements Serializable {
    public static final y d = new y();
    private static final long serialVersionUID = 459996390165777884L;

    private y() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f B(j$.time.temporal.l lVar) {
        return lVar instanceof A ? (A) lVar : new A(j$.time.h.O(lVar));
    }

    @Override // j$.time.chrono.AbstractC1449d, j$.time.chrono.o
    public final ChronoLocalDateTime C(LocalDateTime localDateTime) {
        return super.C(localDateTime);
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f I(int i, int i2, int i3) {
        return new A(j$.time.h.Y(i, i2, i3));
    }

    @Override // j$.time.chrono.o
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        return n.P(this, instant, zoneId);
    }

    @Override // j$.time.chrono.AbstractC1449d
    final InterfaceC1451f O(HashMap map, j$.time.format.y yVar) {
        A aY;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l = (Long) map.get(aVar);
        B bS = l != null ? B.s(r(aVar).a(l.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(aVar2);
        int iA = l2 != null ? r(aVar2).a(l2.longValue(), aVar2) : 0;
        if (bS == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && yVar != j$.time.format.y.STRICT) {
            bS = B.v()[B.v().length - 1];
        }
        if (l2 != null && bS != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        return new A(j$.time.h.Y((bS.n().T() + iA) - 1, 1, 1)).d(j$.time.a.h(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).d(j$.time.a.h(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int iA2 = r(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = r(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (yVar != j$.time.format.y.SMART) {
                        j$.time.h hVar = A.d;
                        j$.time.h hVarY = j$.time.h.Y((bS.n().T() + iA) - 1, iA2, iA3);
                        if (hVarY.U(bS.n()) || bS != B.i(hVarY)) {
                            throw new DateTimeException("year, month, and day not valid for Era");
                        }
                        return new A(bS, iA, hVarY);
                    }
                    if (iA < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + iA);
                    }
                    int iT = (bS.n().T() + iA) - 1;
                    try {
                        aY = new A(j$.time.h.Y(iT, iA2, iA3));
                    } catch (DateTimeException unused) {
                        aY = new A(j$.time.h.Y(iT, iA2, 1)).y(new j$.time.temporal.o(0));
                    }
                    if (aY.R() == bS || j$.time.temporal.p.a(aY, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return aY;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + bS + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (yVar == j$.time.format.y.LENIENT) {
                    return new A(j$.time.h.b0((bS.n().T() + iA) - 1, 1)).d(j$.time.a.h(((Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int iA4 = r(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.h hVar2 = A.d;
                int iT2 = bS.n().T();
                j$.time.h hVarB0 = iA == 1 ? j$.time.h.b0(iT2, (bS.n().R() + iA4) - 1) : j$.time.h.b0((iT2 + iA) - 1, iA4);
                if (hVarB0.U(bS.n()) || bS != B.i(hVarB0)) {
                    throw new DateTimeException("Invalid parameters");
                }
                return new A(bS, iA, hVarB0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.o
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f i(long j) {
        return new A(j$.time.h.a0(j));
    }

    @Override // j$.time.chrono.AbstractC1449d
    public final InterfaceC1451f l() {
        j$.time.temporal.l lVarX = j$.time.h.X(Clock.c());
        return lVarX instanceof A ? (A) lVarX : new A(j$.time.h.O(lVarX));
    }

    @Override // j$.time.chrono.o
    public final String m() {
        return "japanese";
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f n(int i, int i2) {
        return new A(j$.time.h.b0(i, i2));
    }

    @Override // j$.time.chrono.o
    public final j$.time.temporal.u r(j$.time.temporal.a aVar) {
        long jT;
        long value;
        switch (x.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.t("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.u.k(B.u(), 999999999 - B.m().n().T());
            case 6:
                return j$.time.temporal.u.k(B.t(), j$.time.temporal.a.DAY_OF_YEAR.l().d());
            case 7:
                jT = A.d.T();
                value = 999999999;
                break;
            case 8:
                jT = B.d.getValue();
                value = B.m().getValue();
                break;
            default:
                return aVar.l();
        }
        return j$.time.temporal.u.j(jT, value);
    }

    @Override // j$.time.chrono.o
    public final List s() {
        return Arrays.asList(B.v());
    }

    @Override // j$.time.chrono.o
    public final p t(int i) {
        return B.s(i);
    }

    @Override // j$.time.chrono.AbstractC1449d, j$.time.chrono.o
    public final InterfaceC1451f u(HashMap map, j$.time.format.y yVar) {
        return (A) super.u(map, yVar);
    }

    @Override // j$.time.chrono.o
    public final int v(p pVar, int i) {
        if (!(pVar instanceof B)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        B b = (B) pVar;
        int iT = (b.n().T() + i) - 1;
        if (i == 1) {
            return iT;
        }
        if (iT < -999999999 || iT > 999999999 || iT < b.n().T() || pVar != B.i(j$.time.h.Y(iT, 1, 1))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return iT;
    }

    Object writeReplace() {
        return new H((byte) 1, this);
    }
}
