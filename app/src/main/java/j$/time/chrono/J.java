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
public final class J extends AbstractC1449d implements Serializable {
    public static final J d = new J();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private J() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f B(j$.time.temporal.l lVar) {
        return lVar instanceof L ? (L) lVar : new L(j$.time.h.O(lVar));
    }

    @Override // j$.time.chrono.AbstractC1449d, j$.time.chrono.o
    public final ChronoLocalDateTime C(LocalDateTime localDateTime) {
        return super.C(localDateTime);
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f I(int i, int i2, int i3) {
        return new L(j$.time.h.Y(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.o
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        return n.P(this, instant, zoneId);
    }

    @Override // j$.time.chrono.o
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f i(long j) {
        return new L(j$.time.h.a0(j));
    }

    @Override // j$.time.chrono.AbstractC1449d
    public final InterfaceC1451f l() {
        j$.time.temporal.l lVarX = j$.time.h.X(Clock.c());
        return lVarX instanceof L ? (L) lVarX : new L(j$.time.h.O(lVarX));
    }

    @Override // j$.time.chrono.o
    public final String m() {
        return "buddhist";
    }

    @Override // j$.time.chrono.o
    public final InterfaceC1451f n(int i, int i2) {
        return new L(j$.time.h.b0(i - 543, i2));
    }

    @Override // j$.time.chrono.o
    public final j$.time.temporal.u r(j$.time.temporal.a aVar) {
        j$.time.temporal.u uVarL;
        long jE;
        long j;
        int i = I.a[aVar.ordinal()];
        if (i != 1) {
            j = 543;
            if (i == 2) {
                j$.time.temporal.u uVarL2 = j$.time.temporal.a.YEAR.l();
                return j$.time.temporal.u.k((-(uVarL2.e() + 543)) + 1, uVarL2.d() + 543);
            }
            if (i != 3) {
                return aVar.l();
            }
            uVarL = j$.time.temporal.a.YEAR.l();
            jE = uVarL.e();
        } else {
            uVarL = j$.time.temporal.a.PROLEPTIC_MONTH.l();
            jE = uVarL.e();
            j = 6516;
        }
        return j$.time.temporal.u.j(jE + j, uVarL.d() + j);
    }

    @Override // j$.time.chrono.o
    public final List s() {
        return Arrays.asList(M.values());
    }

    @Override // j$.time.chrono.o
    public final p t(int i) {
        if (i == 0) {
            return M.BEFORE_BE;
        }
        if (i == 1) {
            return M.BE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.AbstractC1449d, j$.time.chrono.o
    public final InterfaceC1451f u(HashMap map, j$.time.format.y yVar) {
        return (L) super.u(map, yVar);
    }

    @Override // j$.time.chrono.o
    public final int v(p pVar, int i) {
        if (pVar instanceof M) {
            return pVar == M.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    Object writeReplace() {
        return new H((byte) 1, this);
    }
}
