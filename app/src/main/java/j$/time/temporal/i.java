package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
enum i implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    private final String a;

    static {
        j$.time.e eVar = j$.time.e.c;
    }

    i(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.s
    public final k j(k kVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            q qVar = j.c;
            return kVar.c(j$.time.a.d(kVar.j(qVar), j), qVar);
        }
        if (i == 2) {
            return kVar.d(j / 256, b.YEARS).d((j % 256) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
