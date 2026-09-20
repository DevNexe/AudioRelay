package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.zone.ZoneRules;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class n implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient C1455j a;
    private final transient ZoneOffset b;
    private final transient ZoneId c;

    private n(ZoneId zoneId, ZoneOffset zoneOffset, C1455j c1455j) {
        if (c1455j == null) {
            throw new NullPointerException("dateTime");
        }
        this.a = c1455j;
        if (zoneOffset == null) {
            throw new NullPointerException("offset");
        }
        this.b = zoneOffset;
        if (zoneId == null) {
            throw new NullPointerException("zone");
        }
        this.c = zoneId;
    }

    static n M(o oVar, j$.time.temporal.k kVar) {
        n nVar = (n) kVar;
        AbstractC1449d abstractC1449d = (AbstractC1449d) oVar;
        if (abstractC1449d.equals(nVar.a())) {
            return nVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC1449d.getId() + ", actual: " + nVar.a().getId());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    static ChronoZonedDateTime O(ZoneId zoneId, ZoneOffset zoneOffset, C1455j c1455j) {
        if (c1455j == null) {
            throw new NullPointerException("localDateTime");
        }
        if (zoneId == null) {
            throw new NullPointerException("zone");
        }
        if (zoneId instanceof ZoneOffset) {
            return new n(zoneId, (ZoneOffset) zoneId, c1455j);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeN = LocalDateTime.N(c1455j);
        List listG = rules.g(localDateTimeN);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = rules.f(localDateTimeN);
            c1455j = c1455j.Q(bVarF.l().k());
            zoneOffset = bVarF.p();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
        }
        if (zoneOffset != null) {
            return new n(zoneId, zoneOffset, c1455j);
        }
        throw new NullPointerException("offset");
    }

    static n P(o oVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        if (zoneOffsetD != null) {
            return new n(zoneId, zoneOffsetD, (C1455j) oVar.C(LocalDateTime.W(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
        }
        throw new NullPointerException("offset");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new H((byte) 3, this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId D() {
        return this.c;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object G(j$.time.temporal.r rVar) {
        return AbstractC1450e.n(this, rVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long L() {
        return AbstractC1450e.q(this);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final ChronoZonedDateTime z(long j, j$.time.temporal.s sVar) {
        return M(a(), j$.time.temporal.p.b(this, j, (j$.time.temporal.b) sVar));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final ChronoZonedDateTime d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return M(a(), sVar.j(this, j));
        }
        return M(a(), this.a.d(j, sVar).p(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final o a() {
        return f().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.l b() {
        return ((C1455j) q()).b();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return M(a(), qVar.G(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = AbstractC1458m.a[aVar.ordinal()];
        if (i == 1) {
            return d(j - AbstractC1450e.q(this), j$.time.temporal.b.SECONDS);
        }
        ZoneId zoneId = this.c;
        C1455j c1455j = this.a;
        if (i != 2) {
            return O(zoneId, this.b, c1455j.c(j, qVar));
        }
        ZoneOffset zoneOffsetU = ZoneOffset.U(aVar.M(j));
        c1455j.getClass();
        return P(a(), AbstractC1450e.r(c1455j, zoneOffsetU), zoneId);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        return (qVar instanceof j$.time.temporal.a) || (qVar != null && qVar.j(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && AbstractC1450e.f(this, (ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1451f f() {
        return ((C1455j) q()).f();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        int i = AbstractC1457l.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? ((C1455j) q()).g(qVar) : h().S();
        }
        return L();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset h() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.q qVar) {
        return AbstractC1450e.g(this, qVar);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.k y(j$.time.h hVar) {
        return M(a(), hVar.p(this));
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

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime x(ZoneId zoneId) {
        return O(zoneId, this.b, this.a);
    }
}
