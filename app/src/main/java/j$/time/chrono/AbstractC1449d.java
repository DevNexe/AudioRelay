package j$.time.chrono;

import com.google.ads.mediation.facebook.FacebookAdapter;
import j$.time.DateTimeException;
import j$.time.LocalDateTime;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1449d implements o {
    private static final ConcurrentHashMap a;
    private static final ConcurrentHashMap b;
    public static final /* synthetic */ int c = 0;

    static {
        new C1446a();
        new C1447b();
        new C1448c();
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    protected AbstractC1449d() {
    }

    static InterfaceC1451f G(InterfaceC1451f interfaceC1451f, long j, long j2, long j3) {
        long j4;
        InterfaceC1451f interfaceC1451fD = interfaceC1451f.d(j, (j$.time.temporal.s) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        InterfaceC1451f interfaceC1451fD2 = interfaceC1451fD.d(j2, (j$.time.temporal.s) bVar);
        if (j3 <= 7) {
            if (j3 < 1) {
                interfaceC1451fD2 = interfaceC1451fD2.d(j$.time.a.h(j3, 7L) / 7, (j$.time.temporal.s) bVar);
                j4 = j3 + 6;
            }
            return interfaceC1451fD2.y(new j$.time.temporal.n(j$.time.d.M((int) j3).getValue(), 0));
        }
        j4 = j3 - 1;
        interfaceC1451fD2 = interfaceC1451fD2.d(j4 / 7, (j$.time.temporal.s) bVar);
        j3 = (j4 % 7) + 1;
        return interfaceC1451fD2.y(new j$.time.temporal.n(j$.time.d.M((int) j3).getValue(), 0));
    }

    static void j(HashMap map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
    }

    static o p(String str) {
        boolean z;
        if (str == null) {
            throw new NullPointerException(FacebookAdapter.KEY_ID);
        }
        do {
            ConcurrentHashMap concurrentHashMap = a;
            o oVar = (o) concurrentHashMap.get(str);
            if (oVar == null) {
                oVar = (o) b.get(str);
            }
            if (oVar != null) {
                return oVar;
            }
            if (concurrentHashMap.get("ISO") == null) {
                r rVar = r.o;
                z(rVar, rVar.getId());
                y yVar = y.d;
                z(yVar, yVar.getId());
                D d = D.d;
                z(d, d.getId());
                J j = J.d;
                z(j, j.getId());
                for (AbstractC1449d abstractC1449d : ServiceLoader.load(AbstractC1449d.class, null)) {
                    if (!abstractC1449d.getId().equals("ISO")) {
                        z(abstractC1449d, abstractC1449d.getId());
                    }
                }
                v vVar = v.d;
                z(vVar, vVar.getId());
                z = true;
            } else {
                z = false;
            }
        } while (z);
        for (o oVar2 : ServiceLoader.load(o.class)) {
            if (str.equals(oVar2.getId()) || str.equals(oVar2.m())) {
                return oVar2;
            }
        }
        throw new DateTimeException("Unknown chronology: ".concat(str));
    }

    static o z(AbstractC1449d abstractC1449d, String str) {
        String strM;
        o oVar = (o) a.putIfAbsent(str, abstractC1449d);
        if (oVar == null && (strM = abstractC1449d.m()) != null) {
            b.putIfAbsent(strM, abstractC1449d);
        }
        return oVar;
    }

    @Override // j$.time.chrono.o
    public ChronoLocalDateTime C(LocalDateTime localDateTime) {
        try {
            return B(localDateTime).F(j$.time.l.O(localDateTime));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    void M(HashMap map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.N(l.longValue());
            }
            InterfaceC1451f interfaceC1451fC = l().c(1L, (j$.time.temporal.q) j$.time.temporal.a.DAY_OF_MONTH).c(l.longValue(), (j$.time.temporal.q) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            j(map, aVar2, interfaceC1451fC.j(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            j(map, aVar3, interfaceC1451fC.j(aVar3));
        }
    }

    InterfaceC1451f N(HashMap map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = r(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (yVar == j$.time.format.y.LENIENT) {
            long jH = j$.time.a.h(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return I(iA, 1, 1).d(jH, (j$.time.temporal.s) j$.time.temporal.b.MONTHS).d(j$.time.a.h(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = r(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = r(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (yVar != j$.time.format.y.SMART) {
            return I(iA, iA2, iA3);
        }
        try {
            return I(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return I(iA, iA2, 1).y(new j$.time.temporal.o(0));
        }
    }

    InterfaceC1451f O(HashMap map, j$.time.format.y yVar) {
        int iA;
        p pVarH;
        long jV;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            r(aVar2).b(((Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        Long l2 = (Long) map.remove(aVar3);
        if (yVar != j$.time.format.y.LENIENT) {
            iA = r(aVar).a(l.longValue(), aVar);
        } else {
            long jLongValue = l.longValue();
            int i = (int) jLongValue;
            if (jLongValue != i) {
                throw new ArithmeticException();
            }
            iA = i;
        }
        if (l2 != null) {
            j(map, j$.time.temporal.a.YEAR, v(t(r(aVar3).a(l2.longValue(), aVar3)), iA));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar4)) {
            if (yVar == j$.time.format.y.STRICT) {
                map.put(aVar, l);
                return null;
            }
            List listS = s();
            if (listS.isEmpty()) {
                jV = iA;
            } else {
                pVarH = (p) listS.get(listS.size() - 1);
            }
            j(map, aVar4, jV);
            return null;
        }
        pVarH = n(r(aVar4).a(((Long) map.get(aVar4)).longValue(), aVar4), 1).H();
        jV = v(pVarH, iA);
        j(map, aVar4, jV);
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC1449d) && compareTo((AbstractC1449d) obj) == 0;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int compareTo(o oVar) {
        return getId().compareTo(oVar.getId());
    }

    public abstract /* synthetic */ InterfaceC1451f l();

    public final String toString() {
        return getId();
    }

    @Override // j$.time.chrono.o
    public InterfaceC1451f u(HashMap map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return i(((Long) map.remove(aVar)).longValue());
        }
        M(map, yVar);
        InterfaceC1451f interfaceC1451fO = O(map, yVar);
        if (interfaceC1451fO != null) {
            return interfaceC1451fO;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        int i = 0;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return N(map, yVar);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = r(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        long jH = j$.time.a.h(((Long) map.remove(aVar3)).longValue(), 1L);
                        return I(iA, 1, 1).d(jH, (j$.time.temporal.s) j$.time.temporal.b.MONTHS).d(j$.time.a.h(((Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.WEEKS).d(j$.time.a.h(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                    }
                    int iA2 = r(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    InterfaceC1451f interfaceC1451fD = I(iA, iA2, 1).d((r(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((r(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                    if (yVar != j$.time.format.y.STRICT || interfaceC1451fD.j(aVar3) == iA2) {
                        return interfaceC1451fD;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA3 = r(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        return G(I(iA3, 1, 1), j$.time.a.h(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.a.h(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.a.h(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA4 = r(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    InterfaceC1451f interfaceC1451fY = I(iA3, iA4, 1).d((r(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.s) j$.time.temporal.b.DAYS).y(new j$.time.temporal.n(j$.time.d.M(r(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), i));
                    if (yVar != j$.time.format.y.STRICT || interfaceC1451fY.j(aVar3) == iA4) {
                        return interfaceC1451fY;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA5 = r(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (yVar != j$.time.format.y.LENIENT) {
                return n(iA5, r(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return n(iA5, 1).d(j$.time.a.h(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA6 = r(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (yVar == j$.time.format.y.LENIENT) {
                return n(iA6, 1).d(j$.time.a.h(((Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.WEEKS).d(j$.time.a.h(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
            }
            InterfaceC1451f interfaceC1451fD2 = n(iA6, 1).d((r(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((r(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
            if (yVar != j$.time.format.y.STRICT || interfaceC1451fD2.j(aVar2) == iA6) {
                return interfaceC1451fD2;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA7 = r(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (yVar == j$.time.format.y.LENIENT) {
            return G(n(iA7, 1), 0L, j$.time.a.h(((Long) map.remove(aVar8)).longValue(), 1L), j$.time.a.h(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        InterfaceC1451f interfaceC1451fY2 = n(iA7, 1).d((r(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.s) j$.time.temporal.b.DAYS).y(new j$.time.temporal.n(j$.time.d.M(r(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), i));
        if (yVar != j$.time.format.y.STRICT || interfaceC1451fY2.j(aVar2) == iA7) {
            return interfaceC1451fY2;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }
}
