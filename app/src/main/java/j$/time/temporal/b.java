package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public enum b implements s {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");

    private final String a;

    static {
        j$.time.e.l(1L);
        j$.time.e.l(1000L);
        j$.time.e.l(1000000L);
        j$.time.e.z(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // j$.time.temporal.s
    public final k j(k kVar, long j) {
        return kVar.d(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
