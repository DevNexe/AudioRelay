package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;

/* JADX INFO: renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1450e {
    public static j$.time.temporal.k a(InterfaceC1451f interfaceC1451f, j$.time.temporal.k kVar) {
        return kVar.c(interfaceC1451f.E(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static j$.time.temporal.k b(ChronoLocalDateTime chronoLocalDateTime, j$.time.temporal.k kVar) {
        return kVar.c(chronoLocalDateTime.f().E(), j$.time.temporal.a.EPOCH_DAY).c(chronoLocalDateTime.b().d0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static j$.time.temporal.k c(p pVar, j$.time.temporal.k kVar) {
        return kVar.c(pVar.getValue(), j$.time.temporal.a.ERA);
    }

    public static int d(InterfaceC1451f interfaceC1451f, InterfaceC1451f interfaceC1451f2) {
        int iCompare = Long.compare(interfaceC1451f.E(), interfaceC1451f2.E());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC1449d) interfaceC1451f.a()).compareTo(interfaceC1451f2.a());
    }

    public static int e(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int iCompareTo = chronoLocalDateTime.f().compareTo(chronoLocalDateTime2.f());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return ((AbstractC1449d) chronoLocalDateTime.a()).compareTo(chronoLocalDateTime2.a());
    }

    public static int f(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int iCompare = Long.compare(chronoZonedDateTime.L(), chronoZonedDateTime2.L());
        if (iCompare != 0) {
            return iCompare;
        }
        int iR = chronoZonedDateTime.b().R() - chronoZonedDateTime2.b().R();
        if (iR != 0) {
            return iR;
        }
        int iCompareTo = chronoZonedDateTime.q().compareTo(chronoZonedDateTime2.q());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = chronoZonedDateTime.D().getId().compareTo(chronoZonedDateTime2.D().getId());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return ((AbstractC1449d) chronoZonedDateTime.a()).compareTo(chronoZonedDateTime2.a());
    }

    public static int g(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.p.a(chronoZonedDateTime, qVar);
        }
        int i = AbstractC1457l.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? chronoZonedDateTime.q().j(qVar) : chronoZonedDateTime.h().S();
        }
        throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int h(p pVar, j$.time.temporal.a aVar) {
        return aVar == j$.time.temporal.a.ERA ? pVar.getValue() : j$.time.temporal.p.a(pVar, aVar);
    }

    public static long i(p pVar, j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return pVar.getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
        return qVar.z(pVar);
    }

    public static boolean j(InterfaceC1451f interfaceC1451f, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar.isDateBased();
        }
        return qVar != null && qVar.j(interfaceC1451f);
    }

    public static boolean k(p pVar, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.ERA;
        }
        return qVar != null && qVar.j(pVar);
    }

    public static Object l(InterfaceC1451f interfaceC1451f, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.k() || rVar == j$.time.temporal.p.j() || rVar == j$.time.temporal.p.h() || rVar == j$.time.temporal.p.g()) {
            return null;
        }
        if (rVar == j$.time.temporal.p.e()) {
            return interfaceC1451f.a();
        }
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.DAYS : rVar.g(interfaceC1451f);
    }

    public static Object m(ChronoLocalDateTime chronoLocalDateTime, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.k() || rVar == j$.time.temporal.p.j() || rVar == j$.time.temporal.p.h()) {
            return null;
        }
        if (rVar == j$.time.temporal.p.g()) {
            return chronoLocalDateTime.b();
        }
        if (rVar == j$.time.temporal.p.e()) {
            return chronoLocalDateTime.a();
        }
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.NANOS : rVar.g(chronoLocalDateTime);
    }

    public static Object n(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.j() || rVar == j$.time.temporal.p.k()) {
            return chronoZonedDateTime.D();
        }
        if (rVar == j$.time.temporal.p.h()) {
            return chronoZonedDateTime.h();
        }
        if (rVar == j$.time.temporal.p.g()) {
            return chronoZonedDateTime.b();
        }
        if (rVar == j$.time.temporal.p.e()) {
            return chronoZonedDateTime.a();
        }
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.NANOS : rVar.g(chronoZonedDateTime);
    }

    public static Object o(p pVar, j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.ERAS : j$.time.temporal.p.c(pVar, rVar);
    }

    public static long p(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return ((chronoLocalDateTime.f().E() * 86400) + ((long) chronoLocalDateTime.b().e0())) - ((long) zoneOffset.S());
        }
        throw new NullPointerException("offset");
    }

    public static long q(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.f().E() * 86400) + ((long) chronoZonedDateTime.b().e0())) - ((long) chronoZonedDateTime.h().S());
    }

    public static Instant r(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(chronoLocalDateTime.o(zoneOffset), chronoLocalDateTime.b().R());
    }

    public static o s(j$.time.temporal.l lVar) {
        if (lVar == null) {
            throw new NullPointerException("temporal");
        }
        o oVar = (o) lVar.G(j$.time.temporal.p.e());
        return oVar != null ? oVar : v.d;
    }
}
