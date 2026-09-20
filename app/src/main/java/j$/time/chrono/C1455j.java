package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1455j implements ChronoLocalDateTime, j$.time.temporal.k, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient InterfaceC1451f a;
    private final transient j$.time.l b;

    private C1455j(InterfaceC1451f interfaceC1451f, j$.time.l lVar) {
        if (interfaceC1451f == null) {
            throw new NullPointerException("date");
        }
        if (lVar == null) {
            throw new NullPointerException("time");
        }
        this.a = interfaceC1451f;
        this.b = lVar;
    }

    static C1455j M(o oVar, j$.time.temporal.k kVar) {
        C1455j c1455j = (C1455j) kVar;
        AbstractC1449d abstractC1449d = (AbstractC1449d) oVar;
        if (abstractC1449d.equals(c1455j.a())) {
            return c1455j;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC1449d.getId() + ", actual: " + c1455j.a().getId());
    }

    static C1455j O(InterfaceC1451f interfaceC1451f, j$.time.l lVar) {
        return new C1455j(interfaceC1451f, lVar);
    }

    private C1455j R(InterfaceC1451f interfaceC1451f, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.l lVarV = this.b;
        if (j5 == 0) {
            return T(interfaceC1451f, lVarV);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jD0 = lVarV.d0();
        long j10 = j9 + jD0;
        long jG = j$.time.a.g(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jE = j$.time.a.e(j10, 86400000000000L);
        if (jE != jD0) {
            lVarV = j$.time.l.V(jE);
        }
        return T(interfaceC1451f.d(jG, (j$.time.temporal.s) j$.time.temporal.b.DAYS), lVarV);
    }

    private C1455j T(j$.time.temporal.k kVar, j$.time.l lVar) {
        InterfaceC1451f interfaceC1451f = this.a;
        return (interfaceC1451f == kVar && this.b == lVar) ? this : new C1455j(AbstractC1453h.M(interfaceC1451f.a(), kVar), lVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new H((byte) 2, this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime A(ZoneId zoneId) {
        return n.O(zoneId, null, this);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object G(j$.time.temporal.r rVar) {
        return AbstractC1450e.m(this, rVar);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final ChronoLocalDateTime z(long j, j$.time.temporal.s sVar) {
        return M(a(), j$.time.temporal.p.b(this, j, (j$.time.temporal.b) sVar));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final C1455j d(long j, j$.time.temporal.s sVar) {
        boolean z = sVar instanceof j$.time.temporal.b;
        InterfaceC1451f interfaceC1451f = this.a;
        if (!z) {
            return M(interfaceC1451f.a(), sVar.j(this, j));
        }
        int i = AbstractC1454i.a[((j$.time.temporal.b) sVar).ordinal()];
        j$.time.l lVar = this.b;
        switch (i) {
            case 1:
                return R(this.a, 0L, 0L, 0L, j);
            case 2:
                C1455j c1455jT = T(interfaceC1451f.d(j / 86400000000L, (j$.time.temporal.s) j$.time.temporal.b.DAYS), lVar);
                return c1455jT.R(c1455jT.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C1455j c1455jT2 = T(interfaceC1451f.d(j / 86400000, (j$.time.temporal.s) j$.time.temporal.b.DAYS), lVar);
                return c1455jT2.R(c1455jT2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return Q(j);
            case 5:
                return R(this.a, 0L, j, 0L, 0L);
            case 6:
                return R(this.a, j, 0L, 0L, 0L);
            case 7:
                C1455j c1455jT3 = T(interfaceC1451f.d(j / 256, (j$.time.temporal.s) j$.time.temporal.b.DAYS), lVar);
                return c1455jT3.R(c1455jT3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return T(interfaceC1451f.d(j, sVar), lVar);
        }
    }

    final C1455j Q(long j) {
        return R(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final C1455j c(long j, j$.time.temporal.q qVar) {
        boolean z = qVar instanceof j$.time.temporal.a;
        InterfaceC1451f interfaceC1451f = this.a;
        if (!z) {
            return M(interfaceC1451f.a(), qVar.G(this, j));
        }
        boolean zIsTimeBased = ((j$.time.temporal.a) qVar).isTimeBased();
        j$.time.l lVar = this.b;
        return zIsTimeBased ? T(interfaceC1451f, lVar.c(j, qVar)) : T(interfaceC1451f.c(j, qVar), lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final o a() {
        return f().a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.l b() {
        return this.b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return AbstractC1450e.e(this, chronoLocalDateTime);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return compareTo((ChronoLocalDateTime) chronoLocalDateTime);
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
        return (obj instanceof ChronoLocalDateTime) && AbstractC1450e.e(this, (ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC1451f f() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isTimeBased() ? this.b.g(qVar) : this.a.g(qVar);
        }
        return qVar.z(this);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isTimeBased() ? this.b.j(qVar) : this.a.j(qVar);
        }
        return l(qVar).a(g(qVar), qVar);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.k y(j$.time.h hVar) {
        return T(hVar, this.b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        if (!((j$.time.temporal.a) qVar).isTimeBased()) {
            return this.a.l(qVar);
        }
        j$.time.l lVar = this.b;
        lVar.getClass();
        return j$.time.temporal.p.d(lVar, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long o(ZoneOffset zoneOffset) {
        return AbstractC1450e.p(this, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return AbstractC1450e.b(this, kVar);
    }

    public final String toString() {
        return this.a.toString() + 'T' + this.b.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }
}
