package j$.time;

import j$.time.chrono.AbstractC1450e;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.InterfaceC1451f;
import j$.time.format.DateTimeFormatter;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.k, j$.time.temporal.m, ChronoLocalDateTime<h>, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;
    private final h a;
    private final l b;
    public static final LocalDateTime MIN = V(h.d, l.e);
    public static final LocalDateTime MAX = V(h.e, l.f);

    private LocalDateTime(h hVar, l lVar) {
        this.a = hVar;
        this.b = lVar;
    }

    private int M(LocalDateTime localDateTime) {
        int iM = this.a.M(localDateTime.a);
        return iM == 0 ? this.b.compareTo(localDateTime.b) : iM;
    }

    public static LocalDateTime N(j$.time.temporal.l lVar) {
        if (lVar instanceof LocalDateTime) {
            return (LocalDateTime) lVar;
        }
        if (lVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) lVar).S();
        }
        if (lVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) lVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(h.O(lVar), l.O(lVar));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    public static LocalDateTime T(int i) {
        return new LocalDateTime(h.Y(i, 12, 31), l.T(0));
    }

    public static LocalDateTime U(int i, int i2, int i3, int i4, int i5, int i6) {
        return new LocalDateTime(h.Y(i, i2, i3), l.U(i4, i5, i6, 0));
    }

    public static LocalDateTime V(h hVar, l lVar) {
        if (hVar == null) {
            throw new NullPointerException("date");
        }
        if (lVar != null) {
            return new LocalDateTime(hVar, lVar);
        }
        throw new NullPointerException("time");
    }

    public static LocalDateTime W(long j, int i, ZoneOffset zoneOffset) {
        if (zoneOffset == null) {
            throw new NullPointerException("offset");
        }
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.N(j2);
        long jS = j + ((long) zoneOffset.S());
        long j3 = 86400;
        return new LocalDateTime(h.a0(a.g(jS, j3)), l.V((((long) ((int) a.e(jS, j3))) * 1000000000) + j2));
    }

    private LocalDateTime a0(h hVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        l lVarV = this.b;
        if (j5 == 0) {
            return e0(hVar, lVarV);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jD0 = lVarV.d0();
        long j10 = (j9 * j8) + jD0;
        long jG = a.g(j10, 86400000000000L) + (j7 * j8);
        long jE = a.e(j10, 86400000000000L);
        if (jE != jD0) {
            lVarV = l.V(jE);
        }
        return e0(hVar.d0(jG), lVarV);
    }

    private LocalDateTime e0(h hVar, l lVar) {
        return (this.a == hVar && this.b == lVar) ? this : new LocalDateTime(hVar, lVar);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        if (instant == null) {
            throw new NullPointerException("instant");
        }
        if (zoneId == null) {
            throw new NullPointerException("zone");
        }
        return W(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().d(instant));
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.h;
        if (dateTimeFormatter != null) {
            return (LocalDateTime) dateTimeFormatter.f(charSequence, new i(0));
        }
        throw new NullPointerException("formatter");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 5, this);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.p.f() ? this.a : AbstractC1450e.m(this, rVar);
    }

    public final int O() {
        return this.b.R();
    }

    public final int P() {
        return this.b.S();
    }

    public final int Q() {
        return this.a.T();
    }

    public final boolean R(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return M(localDateTime) > 0;
        }
        long jE = this.a.E();
        long jE2 = localDateTime.a.E();
        if (jE <= jE2) {
            return jE == jE2 && this.b.d0() > localDateTime.b.d0();
        }
        return true;
    }

    public final boolean S(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return M(localDateTime) < 0;
        }
        long jE = this.a.E();
        long jE2 = localDateTime.a.E();
        if (jE >= jE2) {
            return jE == jE2 && this.b.d0() < localDateTime.b.d0();
        }
        return true;
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) sVar.j(this, j);
        }
        switch (j.a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return a0(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeY = Y(j / 86400000000L);
                return localDateTimeY.a0(localDateTimeY.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeY2 = Y(j / 86400000);
                return localDateTimeY2.a0(localDateTimeY2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return Z(j);
            case 5:
                return a0(this.a, 0L, j, 0L, 0L);
            case 6:
                return a0(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeY3 = Y(j / 256);
                return localDateTimeY3.a0(localDateTimeY3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return e0(this.a.d(j, sVar), this.b);
        }
    }

    public final LocalDateTime Y(long j) {
        return e0(this.a.d0(j), this.b);
    }

    public final LocalDateTime Z(long j) {
        return a0(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.o a() {
        return ((h) f()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime A(ZoneId zoneId) {
        return ZonedDateTime.O(this, zoneId, null);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final l b() {
        return this.b;
    }

    public final h b0() {
        return this.a;
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) qVar.G(this, j);
        }
        boolean zIsTimeBased = ((j$.time.temporal.a) qVar).isTimeBased();
        l lVar = this.b;
        h hVar = this.a;
        return zIsTimeBased ? e0(hVar, lVar.c(j, qVar)) : e0(hVar.c(j, qVar), lVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? M((LocalDateTime) chronoLocalDateTime) : AbstractC1450e.e(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime y(h hVar) {
        return e0(hVar, this.b);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.j(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.isDateBased() || aVar.isTimeBased();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC1451f f() {
        return this.a;
    }

    final void f0(DataOutput dataOutput) throws IOException {
        this.a.m0(dataOutput);
        this.b.h0(dataOutput);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.a(this);
        }
        throw new NullPointerException("formatter");
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isTimeBased() ? this.b.g(qVar) : this.a.g(qVar);
        }
        return qVar.z(this);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isTimeBased() ? this.b.j(qVar) : this.a.j(qVar);
        }
        return j$.time.temporal.p.a(this, qVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        if (!((j$.time.temporal.a) qVar).isTimeBased()) {
            return this.a.l(qVar);
        }
        l lVar = this.b;
        lVar.getClass();
        return j$.time.temporal.p.d(lVar, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long o(ZoneOffset zoneOffset) {
        return AbstractC1450e.p(this, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return AbstractC1450e.b(this, kVar);
    }

    public String toString() {
        return this.a.toString() + 'T' + this.b.toString();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }
}
