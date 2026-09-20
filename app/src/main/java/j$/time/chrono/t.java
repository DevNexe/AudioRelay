package j$.time.chrono;

import j$.time.DateTimeException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC1453h {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient r a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    private t(r rVar, int i, int i2, int i3) {
        rVar.S(i, i2, i3);
        this.a = rVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private t(r rVar, long j) {
        int[] iArrT = rVar.T((int) j);
        this.a = rVar;
        this.b = iArrT[0];
        this.c = iArrT[1];
        this.d = iArrT[2];
    }

    private int R() {
        return ((int) j$.time.a.e(E() + 3, 7)) + 1;
    }

    private int S() {
        return this.a.R(this.b, this.c) + this.d;
    }

    static t U(r rVar, int i, int i2, int i3) {
        return new t(rVar, i, i2, i3);
    }

    static t V(r rVar, long j) {
        return new t(rVar, j);
    }

    private t Y(int i, int i2, int i3) {
        r rVar = this.a;
        int iW = rVar.W(i, i2);
        if (i3 > iW) {
            i3 = iW;
        }
        return new t(rVar, i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new H((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final long E() {
        return this.a.S(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final ChronoLocalDateTime F(j$.time.l lVar) {
        return C1455j.O(this, lVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final p H() {
        return u.AH;
    }

    @Override // j$.time.chrono.AbstractC1453h
    /* JADX INFO: renamed from: N */
    public final InterfaceC1451f z(long j, j$.time.temporal.b bVar) {
        return (t) super.z(j, bVar);
    }

    @Override // j$.time.chrono.AbstractC1453h
    final InterfaceC1451f Q(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return Y(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    public final int T() {
        return this.a.X(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC1453h
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final t O(long j) {
        return new t(this.a, E() + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC1453h
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final t P(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        long jG = j$.time.a.g(j2, 12L);
        r rVar = this.a;
        if (jG >= rVar.V() && jG <= rVar.U()) {
            return Y((int) jG, ((int) j$.time.a.e(j2, 12L)) + 1, this.d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + jG);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final t c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (t) super.c(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        r rVar = this.a;
        rVar.r(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = s.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return Y(i5, i4, i);
            case 2:
                return O(Math.min(i, T()) - S());
            case 3:
                return O((j - g(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return O(j - ((long) R()));
            case 5:
                return O(j - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return O(j - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new t(rVar, j);
            case 8:
                return O((j - g(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return Y(i5, i, i3);
            case 10:
                return P(j - (((((long) i5) * 12) + ((long) i4)) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return Y(i, i4, i3);
            case 12:
                return Y(i, i4, i3);
            case 13:
                return Y(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final o a() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f, j$.time.temporal.k
    public final InterfaceC1451f d(long j, j$.time.temporal.s sVar) {
        return (t) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    public final j$.time.temporal.k d(long j, j$.time.temporal.s sVar) {
        return (t) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.b == tVar.b && this.c == tVar.c && this.d == tVar.d && this.a.equals(tVar.a);
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        int i = s.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return S();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return R();
            case 5:
                return ((R() - 1) % 7) + 1;
            case 6:
                return ((S() - 1) % 7) + 1;
            case 7:
                return E();
            case 8:
                return ((S() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((((long) i4) * 12) + ((long) i2)) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final int hashCode() {
        int iHashCode = this.a.getId().hashCode();
        int i = this.b;
        return (iHashCode ^ (i & (-2048))) ^ (((i << 11) + (this.c << 6)) + this.d);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.k y(j$.time.h hVar) {
        return (t) super.y(hVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        int iW;
        long j;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        if (!AbstractC1450e.j(this, qVar)) {
            throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = s.a[aVar.ordinal()];
        r rVar = this.a;
        if (i != 1) {
            if (i == 2) {
                iW = T();
            } else {
                if (i != 3) {
                    return rVar.r(aVar);
                }
                j = 5;
            }
            return j$.time.temporal.u.j(1L, j);
        }
        iW = rVar.W(this.b, this.c);
        j = iW;
        return j$.time.temporal.u.j(1L, j);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final InterfaceC1451f w(j$.time.s sVar) {
        return (t) super.w(sVar);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(j$.time.temporal.p.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.p.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.p.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final InterfaceC1451f y(j$.time.temporal.m mVar) {
        return (t) super.y(mVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return (t) super.z(j, bVar);
    }
}
