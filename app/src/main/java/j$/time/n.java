package j$.time;

import j$.time.chrono.AbstractC1449d;
import j$.time.chrono.AbstractC1450e;

/* JADX INFO: loaded from: classes2.dex */
public enum n implements j$.time.temporal.l, j$.time.temporal.m {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final n[] a = values();

    public static n P(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        throw new DateTimeException("Invalid value for MonthOfYear: " + i);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.e()) {
            return j$.time.chrono.v.d;
        }
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.MONTHS : j$.time.temporal.p.c(this, rVar);
    }

    public final int M(boolean z) {
        switch (m.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int N(boolean z) {
        int i = m.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    public final int O() {
        int i = m.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final n Q() {
        return a[((((int) 1) + 12) + ordinal()) % 12];
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return qVar != null && qVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        return qVar.z(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.p.a(this, qVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.MONTH_OF_YEAR ? qVar.l() : j$.time.temporal.p.d(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        if (!((AbstractC1449d) AbstractC1450e.s(kVar)).equals(j$.time.chrono.v.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return kVar.c(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
