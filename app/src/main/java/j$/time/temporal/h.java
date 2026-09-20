package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.AbstractC1449d;
import j$.time.chrono.AbstractC1450e;
import j$.time.chrono.v;
import j$.time.format.y;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ h[] b;

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final k G(k kVar, long j) {
                long jZ = z(kVar);
                l().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return kVar.c((j - jZ) + kVar.g(aVar), aVar);
            }

            @Override // j$.time.temporal.q
            public final boolean j(l lVar) {
                return lVar.e(a.DAY_OF_YEAR) && lVar.e(a.MONTH_OF_YEAR) && lVar.e(a.YEAR) && h.M(lVar);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.q
            public final u k(l lVar) {
                if (!j(lVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long jG = lVar.g(h.QUARTER_OF_YEAR);
                if (jG == 1) {
                    long jG2 = lVar.g(a.YEAR);
                    v.d.getClass();
                    return v.P(jG2) ? u.j(1L, 91L) : u.j(1L, 90L);
                }
                if (jG == 2) {
                    return u.j(1L, 91L);
                }
                return (jG == 3 || jG == 4) ? u.j(1L, 92L) : l();
            }

            @Override // j$.time.temporal.q
            public final u l() {
                return u.k(90L, 92L);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.q
            public final l p(HashMap map, l lVar, y yVar) {
                long jH;
                j$.time.h hVarE0;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                q qVar = h.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(qVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iM = aVar.M(l.longValue());
                long jLongValue = ((Long) map.get(h.DAY_OF_QUARTER)).longValue();
                h.O(lVar);
                if (yVar == y.LENIENT) {
                    hVarE0 = j$.time.h.Y(iM, 1, 1).e0(j$.time.a.f(j$.time.a.h(l2.longValue(), 1L), 3));
                    jH = j$.time.a.h(jLongValue, 1L);
                } else {
                    j$.time.h hVarY = j$.time.h.Y(iM, ((qVar.l().a(l2.longValue(), qVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        (yVar == y.STRICT ? k(hVarY) : l()).b(jLongValue, this);
                    }
                    jH = jLongValue - 1;
                    hVarE0 = hVarY;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(qVar);
                return hVarE0.d0(jH);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.q
            public final long z(l lVar) {
                if (!j(lVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                int iJ = lVar.j(a.DAY_OF_YEAR);
                int iJ2 = lVar.j(a.MONTH_OF_YEAR);
                long jG = lVar.g(a.YEAR);
                int[] iArr = h.a;
                int i = (iJ2 - 1) / 3;
                v.d.getClass();
                return iJ - iArr[i + (v.P(jG) ? 4 : 0)];
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final k G(k kVar, long j) {
                long jZ = z(kVar);
                l().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return kVar.c(((j - jZ) * 3) + kVar.g(aVar), aVar);
            }

            @Override // j$.time.temporal.q
            public final boolean j(l lVar) {
                return lVar.e(a.MONTH_OF_YEAR) && h.M(lVar);
            }

            @Override // j$.time.temporal.q
            public final u l() {
                return u.j(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.q
            public final long z(l lVar) {
                if (j(lVar)) {
                    return (lVar.g(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new t("Unsupported field: QuarterOfYear");
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final k G(k kVar, long j) {
                l().b(j, this);
                return kVar.d(j$.time.a.h(j, z(kVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.q
            public final boolean j(l lVar) {
                return lVar.e(a.EPOCH_DAY) && h.M(lVar);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.q
            public final u k(l lVar) {
                if (j(lVar)) {
                    return h.P(j$.time.h.O(lVar));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final u l() {
                return u.k(52L, 53L);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.q
            public final l p(HashMap map, l lVar, y yVar) {
                j$.time.h hVarC;
                long j;
                j$.time.h hVarF0;
                long j2;
                q qVar = h.WEEK_BASED_YEAR;
                Long l = (Long) map.get(qVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = qVar.l().a(l.longValue(), qVar);
                long jLongValue = ((Long) map.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                h.O(lVar);
                j$.time.h hVarY = j$.time.h.Y(iA, 1, 4);
                if (yVar == y.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        j2 = jLongValue2 - 1;
                        hVarF0 = hVarY.f0(j2 / 7);
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            hVarF0 = hVarY.f0(j$.time.a.h(jLongValue2, 7L) / 7);
                            j2 = jLongValue2 + 6;
                        }
                        hVarC = hVarY.f0(j$.time.a.h(jLongValue, j)).c(jLongValue2, aVar);
                    }
                    hVarY = hVarF0;
                    j = 1;
                    jLongValue2 = (j2 % 7) + 1;
                    hVarC = hVarY.f0(j$.time.a.h(jLongValue, j)).c(jLongValue2, aVar);
                } else {
                    int iM = aVar.M(l2.longValue());
                    if (jLongValue < 1 || jLongValue > 52) {
                        (yVar == y.STRICT ? h.P(hVarY) : l()).b(jLongValue, this);
                    }
                    hVarC = hVarY.f0(jLongValue - 1).c(iM, aVar);
                }
                map.remove(this);
                map.remove(qVar);
                map.remove(aVar);
                return hVarC;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.q
            public final long z(l lVar) {
                if (j(lVar)) {
                    return h.Q(j$.time.h.O(lVar));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final k G(k kVar, long j) {
                if (!j(kVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int iA = l().a(j, h.WEEK_BASED_YEAR);
                j$.time.h hVarO = j$.time.h.O(kVar);
                a aVar = a.DAY_OF_WEEK;
                int iJ = hVarO.j(aVar);
                int iQ = h.Q(hVarO);
                if (iQ == 53 && h.U(iA) == 52) {
                    iQ = 52;
                }
                j$.time.h hVarY = j$.time.h.Y(iA, 1, 4);
                return kVar.y(hVarY.d0(((iQ - 1) * 7) + (iJ - hVarY.j(aVar))));
            }

            @Override // j$.time.temporal.q
            public final boolean j(l lVar) {
                return lVar.e(a.EPOCH_DAY) && h.M(lVar);
            }

            @Override // j$.time.temporal.q
            public final u l() {
                return a.YEAR.l();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.q
            public final long z(l lVar) {
                if (j(lVar)) {
                    return h.T(j$.time.h.O(lVar));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    h(String str, int i) {
        super(str, i);
    }

    static boolean M(l lVar) {
        return ((AbstractC1449d) AbstractC1450e.s(lVar)).equals(v.d);
    }

    static void O(l lVar) {
        if (!((AbstractC1449d) AbstractC1450e.s(lVar)).equals(v.d)) {
            throw new DateTimeException("Resolve requires IsoChronology");
        }
    }

    static u P(j$.time.h hVar) {
        return u.j(1L, U(T(hVar)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    static int Q(j$.time.h hVar) {
        int i;
        int iOrdinal = hVar.Q().ordinal();
        int iR = hVar.R() - 1;
        int i2 = (3 - iOrdinal) + iR;
        int i3 = (i2 - ((i2 / 7) * 7)) - 3;
        if (i3 < -3) {
            i3 += 7;
        }
        if (iR < i3) {
            return (int) u.j(1L, U(T(hVar.k0(180).g0(-1L)))).d();
        }
        int i4 = ((iR - i3) / 7) + 1;
        if (i4 == 53) {
            i = i3 == -3 || (i3 == -2 && hVar.V()) ? i4 : 1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int T(j$.time.h hVar) {
        int iT = hVar.T();
        int iR = hVar.R();
        if (iR <= 3) {
            return iR - hVar.Q().ordinal() < -2 ? iT - 1 : iT;
        }
        if (iR >= 363) {
            return ((iR - 363) - (hVar.V() ? 1 : 0)) - hVar.Q().ordinal() >= 0 ? iT + 1 : iT;
        }
        return iT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int U(int i) {
        j$.time.h hVarY = j$.time.h.Y(i, 1, 1);
        if (hVarY.Q() != j$.time.d.THURSDAY) {
            return (hVarY.Q() == j$.time.d.WEDNESDAY && hVarY.V()) ? 53 : 52;
        }
        return 53;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.q
    public final boolean isTimeBased() {
        return false;
    }

    public u k(l lVar) {
        return l();
    }

    public /* synthetic */ l p(HashMap map, l lVar, y yVar) {
        return null;
    }
}
