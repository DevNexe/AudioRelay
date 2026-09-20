package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends AbstractC1449d implements Serializable {
    public static final v d = new v();
    private static final long serialVersionUID = -1440403870442975015L;

    private v() {
    }

    public static boolean P(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f B(j$.time.temporal.l lVar) {
        return j$.time.h.O(lVar);
    }

    @Override // j$.time.chrono.AbstractC1449d, j$.time.chrono.o
    public final ChronoLocalDateTime C(LocalDateTime localDateTime) {
        return LocalDateTime.N(localDateTime);
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f I(int i, int i2, int i3) {
        return j$.time.h.Y(i, i2, i3);
    }

    @Override // j$.time.chrono.o
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.N(instant, zoneId);
    }

    @Override // j$.time.chrono.AbstractC1449d
    final void M(HashMap map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.N(l.longValue());
            }
            long j = 12;
            AbstractC1449d.j(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.time.a.e(l.longValue(), j)) + 1);
            AbstractC1449d.j(map, j$.time.temporal.a.YEAR, j$.time.a.g(l.longValue(), j));
        }
    }

    @Override // j$.time.chrono.AbstractC1449d
    final InterfaceC1451f N(HashMap map, j$.time.format.y yVar) {
        int iN;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iM = aVar.M(((Long) map.remove(aVar)).longValue());
        boolean z = true;
        if (yVar == j$.time.format.y.LENIENT) {
            return j$.time.h.Y(iM, 1, 1).e0(j$.time.a.h(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).d0(j$.time.a.h(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iM2 = aVar2.M(((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iM3 = aVar3.M(((Long) map.remove(aVar3)).longValue());
        if (yVar == j$.time.format.y.SMART) {
            if (iM2 == 4 || iM2 == 6 || iM2 == 9 || iM2 == 11) {
                iN = 30;
            } else if (iM2 == 2) {
                j$.time.n nVar = j$.time.n.FEBRUARY;
                long j = iM;
                int i = j$.time.v.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iN = nVar.N(z);
            }
            iM3 = Math.min(iM3, iN);
        }
        return j$.time.h.Y(iM, iM2, iM3);
    }

    @Override // j$.time.chrono.AbstractC1449d
    final InterfaceC1451f O(HashMap map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar;
        long jH;
        long jLongValue;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar2);
        if (l == null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar3)) {
                return null;
            }
            aVar3.N(((Long) map.get(aVar3)).longValue());
            return null;
        }
        if (yVar != j$.time.format.y.LENIENT) {
            aVar2.N(l.longValue());
        }
        Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                aVar = j$.time.temporal.a.YEAR;
                jH = l.longValue();
            } else {
                if (l2.longValue() != 0) {
                    throw new DateTimeException("Invalid value for era: " + l2);
                }
                aVar = j$.time.temporal.a.YEAR;
                jH = j$.time.a.h(1L, l.longValue());
            }
            AbstractC1449d.j(map, aVar, jH);
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        Long l3 = (Long) map.get(aVar4);
        if (yVar == j$.time.format.y.STRICT) {
            if (l3 == null) {
                map.put(aVar2, l);
                return null;
            }
            long jLongValue2 = l3.longValue();
            jLongValue = l.longValue();
            if (jLongValue2 <= 0) {
                jLongValue = j$.time.a.h(1L, jLongValue);
            }
        } else if (l3 == null || l3.longValue() > 0) {
            jLongValue = l.longValue();
        } else {
            jLongValue = l.longValue();
            jLongValue = j$.time.a.h(1L, jLongValue);
        }
        AbstractC1449d.j(map, aVar4, jLongValue);
        return null;
    }

    @Override // j$.time.chrono.o
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f i(long j) {
        return j$.time.h.a0(j);
    }

    @Override // j$.time.chrono.AbstractC1449d
    public final InterfaceC1451f l() {
        return j$.time.h.O(j$.time.h.X(Clock.c()));
    }

    @Override // j$.time.chrono.o
    public final String m() {
        return "iso8601";
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f n(int i, int i2) {
        return j$.time.h.b0(i, i2);
    }

    @Override // j$.time.chrono.o
    public final j$.time.temporal.u r(j$.time.temporal.a aVar) {
        return aVar.l();
    }

    @Override // j$.time.chrono.o
    public final List s() {
        return Arrays.asList(w.values());
    }

    @Override // j$.time.chrono.o
    public final p t(int i) {
        if (i == 0) {
            return w.BCE;
        }
        if (i == 1) {
            return w.CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.AbstractC1449d, j$.time.chrono.o
    public final InterfaceC1451f u(HashMap map, j$.time.format.y yVar) {
        return (j$.time.h) super.u(map, yVar);
    }

    @Override // j$.time.chrono.o
    public final int v(p pVar, int i) {
        if (pVar instanceof w) {
            return pVar == w.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    Object writeReplace() {
        return new H((byte) 1, this);
    }
}
