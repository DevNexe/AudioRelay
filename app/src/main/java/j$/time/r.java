package j$.time;

import j$.time.chrono.AbstractC1450e;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements j$.time.temporal.k, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final l a;
    private final ZoneOffset b;

    static {
        l lVar = l.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        lVar.getClass();
        M(lVar, zoneOffset);
        l lVar2 = l.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        lVar2.getClass();
        M(lVar2, zoneOffset2);
    }

    private r(l lVar, ZoneOffset zoneOffset) {
        if (lVar == null) {
            throw new NullPointerException("time");
        }
        this.a = lVar;
        if (zoneOffset == null) {
            throw new NullPointerException("offset");
        }
        this.b = zoneOffset;
    }

    public static r M(l lVar, ZoneOffset zoneOffset) {
        return new r(lVar, zoneOffset);
    }

    static r O(ObjectInput objectInput) {
        return new r(l.c0(objectInput), ZoneOffset.W(objectInput));
    }

    private r P(l lVar, ZoneOffset zoneOffset) {
        return (this.a == lVar && this.b.equals(zoneOffset)) ? this : new r(lVar, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 9, this);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.h() || rVar == j$.time.temporal.p.j()) {
            return this.b;
        }
        if (((rVar == j$.time.temporal.p.k()) || (rVar == j$.time.temporal.p.e())) || rVar == j$.time.temporal.p.f()) {
            return null;
        }
        if (rVar == j$.time.temporal.p.g()) {
            return this.a;
        }
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.NANOS : rVar.g(this);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final r d(long j, j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.b ? P(this.a.d(j, sVar), this.b) : (r) sVar.j(this, j);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) qVar.G(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        l lVar = this.a;
        return qVar == aVar ? P(lVar, ZoneOffset.U(((j$.time.temporal.a) qVar).M(j))) : P(lVar.c(j, qVar), this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        r rVar = (r) obj;
        ZoneOffset zoneOffset = rVar.b;
        ZoneOffset zoneOffset2 = this.b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        l lVar = this.a;
        l lVar2 = rVar.a;
        return (zEquals || (iCompare = Long.compare(lVar.d0() - (((long) zoneOffset2.S()) * 1000000000), lVar2.d0() - (((long) rVar.b.S()) * 1000000000))) == 0) ? lVar.compareTo(lVar2) : iCompare;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar.isTimeBased() || qVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return qVar != null && qVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && this.b.equals(rVar.b);
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.S() : this.a.g(qVar);
        }
        return qVar.z(this);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        return j$.time.temporal.p.a(this, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.k y(h hVar) {
        Object objA;
        if (hVar instanceof l) {
            return P((l) hVar, this.b);
        }
        if (hVar instanceof ZoneOffset) {
            return P(this.a, (ZoneOffset) hVar);
        }
        if (!(hVar instanceof r)) {
            objA = hVar;
            objA = AbstractC1450e.a(hVar, this);
        }
        objA = hVar;
        return (r) objA;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return qVar.l();
        }
        l lVar = this.a;
        lVar.getClass();
        return j$.time.temporal.p.d(lVar, qVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return kVar.c(this.a.d0(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.S(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        this.a.h0(objectOutput);
        this.b.X(objectOutput);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }
}
