package j$.time;

import j$.time.chrono.AbstractC1450e;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1451f;
import j$.time.zone.ZoneRules;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.k, ChronoZonedDateTime<h>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    private static ZonedDateTime M(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.getRules().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.W(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime N(Instant instant, ZoneId zoneId) {
        if (instant == null) {
            throw new NullPointerException("instant");
        }
        if (zoneId != null) {
            return M(instant.getEpochSecond(), instant.getNano(), zoneId);
        }
        throw new NullPointerException("zone");
    }

    public static ZonedDateTime O(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        if (localDateTime == null) {
            throw new NullPointerException("localDateTime");
        }
        if (zoneId == null) {
            throw new NullPointerException("zone");
        }
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listG = rules.g(localDateTime);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = rules.f(localDateTime);
            localDateTime = localDateTime.Z(bVarF.l().k());
            zoneOffset = bVarF.p();
        } else if ((zoneOffset == null || !listG.contains(zoneOffset)) && (zoneOffset = (ZoneOffset) listG.get(0)) == null) {
            throw new NullPointerException("offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    static ZonedDateTime Q(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        h hVar = h.d;
        LocalDateTime localDateTimeV = LocalDateTime.V(h.Y(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.c0(objectInput));
        ZoneOffset zoneOffsetW = ZoneOffset.W(objectInput);
        ZoneId zoneId = (ZoneId) t.a(objectInput);
        if (zoneId == null) {
            throw new NullPointerException("zone");
        }
        if (!(zoneId instanceof ZoneOffset) || zoneOffsetW.equals(zoneId)) {
            return new ZonedDateTime(localDateTimeV, zoneId, zoneOffsetW);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private ZonedDateTime R(ZoneOffset zoneOffset) {
        if (!zoneOffset.equals(this.b)) {
            ZoneId zoneId = this.c;
            ZoneRules rules = zoneId.getRules();
            LocalDateTime localDateTime = this.a;
            if (rules.g(localDateTime).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
            }
        }
        return this;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 6, this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId D() {
        return this.c;
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.p.f() ? this.a.b0() : AbstractC1450e.n(this, rVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long L() {
        return AbstractC1450e.q(this);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (ZonedDateTime) sVar.j(this, j);
        }
        boolean zIsDateBased = sVar.isDateBased();
        LocalDateTime localDateTimeD = this.a.d(j, sVar);
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zIsDateBased) {
            return O(localDateTimeD, zoneId, zoneOffset);
        }
        if (localDateTimeD == null) {
            throw new NullPointerException("localDateTime");
        }
        if (zoneOffset == null) {
            throw new NullPointerException("offset");
        }
        if (zoneId != null) {
            return zoneId.getRules().g(localDateTimeD).contains(zoneOffset) ? new ZonedDateTime(localDateTimeD, zoneId, zoneOffset) : M(AbstractC1450e.p(localDateTimeD, zoneOffset), localDateTimeD.O(), zoneId);
        }
        throw new NullPointerException("zone");
    }

    public final LocalDateTime S() {
        return this.a;
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime y(h hVar) {
        return O(LocalDateTime.V(hVar, this.a.b()), this.c, this.b);
    }

    final void U(DataOutput dataOutput) throws IOException {
        this.a.f0(dataOutput);
        this.b.X(dataOutput);
        this.c.P(dataOutput);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.o a() {
        return ((h) f()).a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final l b() {
        return this.a.b();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) qVar.G(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = z.a[aVar.ordinal()];
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? O(localDateTime.c(j, qVar), zoneId, this.b) : R(ZoneOffset.U(aVar.M(j)));
        }
        return M(j, localDateTime.O(), zoneId);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        return (qVar instanceof j$.time.temporal.a) || (qVar != null && qVar.j(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1451f f() {
        return this.a.b0();
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        int i = z.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.g(qVar) : this.b.S();
        }
        return AbstractC1450e.q(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset h() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return AbstractC1450e.g(this, qVar);
        }
        int i = z.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.j(qVar) : this.b.S();
        }
        throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) ? qVar.l() : this.a.l(qVar);
        }
        return qVar.k(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC1450e.f(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime q() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(L(), b().R());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        ZoneOffset zoneOffset = this.b;
        sb.append(zoneOffset.toString());
        String string = sb.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return string;
        }
        return string + '[' + zoneId.toString() + ']';
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime x(ZoneId zoneId) {
        if (zoneId != null) {
            return this.c.equals(zoneId) ? this : O(this.a, zoneId, this.b);
        }
        throw new NullPointerException("zone");
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }
}
