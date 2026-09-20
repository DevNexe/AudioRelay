package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public enum d implements j$.time.temporal.l, j$.time.temporal.m {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private static final d[] a = values();

    public static d M(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        throw new DateTimeException("Invalid value for DayOfWeek: " + i);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.DAYS : j$.time.temporal.p.c(this, rVar);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.DAY_OF_WEEK;
        }
        return qVar != null && qVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
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
        return qVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.p.a(this, qVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.DAY_OF_WEEK ? qVar.l() : j$.time.temporal.p.d(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return kVar.c(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
