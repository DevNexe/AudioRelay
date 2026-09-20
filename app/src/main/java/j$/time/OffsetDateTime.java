package j$.time;

import j$.time.chrono.AbstractC1450e;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.k, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime a;
    private final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        N(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        N(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (localDateTime == null) {
            throw new NullPointerException("dateTime");
        }
        this.a = localDateTime;
        if (zoneOffset == null) {
            throw new NullPointerException("offset");
        }
        this.b = zoneOffset;
    }

    public static OffsetDateTime M(j$.time.temporal.l lVar) {
        if (lVar instanceof OffsetDateTime) {
            return (OffsetDateTime) lVar;
        }
        try {
            ZoneOffset zoneOffsetR = ZoneOffset.R(lVar);
            h hVar = (h) lVar.G(j$.time.temporal.p.f());
            l lVar2 = (l) lVar.G(j$.time.temporal.p.g());
            return (hVar == null || lVar2 == null) ? O(Instant.N(lVar), zoneOffsetR) : new OffsetDateTime(LocalDateTime.V(hVar, lVar2), zoneOffsetR);
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    public static OffsetDateTime N(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime O(Instant instant, ZoneId zoneId) {
        if (instant == null) {
            throw new NullPointerException("instant");
        }
        if (zoneId == null) {
            throw new NullPointerException("zone");
        }
        ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        return new OffsetDateTime(LocalDateTime.W(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    static OffsetDateTime Q(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        h hVar = h.d;
        return new OffsetDateTime(LocalDateTime.V(h.Y(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.c0(objectInput)), ZoneOffset.W(objectInput));
    }

    private OffsetDateTime R(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.i;
        if (dateTimeFormatter != null) {
            return (OffsetDateTime) dateTimeFormatter.f(charSequence, new i(1));
        }
        throw new NullPointerException("formatter");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 10, this);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.h() || rVar == j$.time.temporal.p.j()) {
            return this.b;
        }
        if (rVar == j$.time.temporal.p.k()) {
            return null;
        }
        j$.time.temporal.o oVarF = j$.time.temporal.p.f();
        LocalDateTime localDateTime = this.a;
        if (rVar == oVarF) {
            return localDateTime.b0();
        }
        if (rVar == j$.time.temporal.p.g()) {
            return localDateTime.b();
        }
        if (rVar == j$.time.temporal.p.e()) {
            return j$.time.chrono.v.d;
        }
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.NANOS : rVar.g(this);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.b ? R(this.a.d(j, sVar), this.b) : (OffsetDateTime) sVar.j(this, j);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) qVar.G(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = q.a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? R(localDateTime.c(j, qVar), zoneOffset) : R(localDateTime, ZoneOffset.U(aVar.M(j)));
        }
        return O(Instant.ofEpochSecond(j, localDateTime.O()), zoneOffset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iR;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            iR = toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            localDateTime.getClass();
            long jP = AbstractC1450e.p(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            localDateTime2.getClass();
            int iCompare = Long.compare(jP, AbstractC1450e.p(localDateTime2, offsetDateTime2.b));
            iR = iCompare == 0 ? localDateTime.b().R() - localDateTime2.b().R() : iCompare;
        }
        return iR == 0 ? toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime()) : iR;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        return (qVar instanceof j$.time.temporal.a) || (qVar != null && qVar.j(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b);
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        int i = q.a[((j$.time.temporal.a) qVar).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? localDateTime.g(qVar) : zoneOffset.S();
        }
        localDateTime.getClass();
        return AbstractC1450e.p(localDateTime, zoneOffset);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.p.a(this, qVar);
        }
        int i = q.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.j(qVar) : this.b.S();
        }
        throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.k y(h hVar) {
        return R(this.a.y(hVar), this.b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) ? qVar.l() : this.a.l(qVar);
        }
        return qVar.k(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return kVar.c(localDateTime.b0().E(), aVar).c(localDateTime.b().d0(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.S(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public Instant toInstant() {
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return AbstractC1450e.r(localDateTime, this.b);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        this.a.f0(objectOutput);
        this.b.X(objectOutput);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }
}
