package j$.time.chrono;

import j$.time.DateTimeException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC1453h {
    static final j$.time.h d = j$.time.h.Y(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final transient j$.time.h a;
    private transient B b;
    private transient int c;

    A(B b, int i, j$.time.h hVar) {
        if (hVar.U(d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = b;
        this.c = i;
        this.a = hVar;
    }

    A(j$.time.h hVar) {
        if (hVar.U(d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = B.i(hVar);
        this.c = (hVar.T() - this.b.n().T()) + 1;
        this.a = hVar;
    }

    private A U(j$.time.h hVar) {
        return hVar.equals(this.a) ? this : new A(hVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new H((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final long E() {
        return this.a.E();
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final ChronoLocalDateTime F(j$.time.l lVar) {
        return C1455j.O(this, lVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final p H() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC1453h
    /* JADX INFO: renamed from: N */
    public final InterfaceC1451f z(long j, j$.time.temporal.b bVar) {
        return (A) super.z(j, bVar);
    }

    @Override // j$.time.chrono.AbstractC1453h
    final InterfaceC1451f O(long j) {
        return U(this.a.d0(j));
    }

    @Override // j$.time.chrono.AbstractC1453h
    final InterfaceC1451f P(long j) {
        return U(this.a.e0(j));
    }

    @Override // j$.time.chrono.AbstractC1453h
    final InterfaceC1451f Q(long j) {
        return U(this.a.g0(j));
    }

    public final B R() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final A d(long j, j$.time.temporal.s sVar) {
        return (A) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final A c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (A) super.c(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (g(aVar) == j) {
            return this;
        }
        int[] iArr = z.a;
        int i = iArr[aVar.ordinal()];
        j$.time.h hVar = this.a;
        if (i == 3 || i == 8 || i == 9) {
            y yVar = y.d;
            int iA = yVar.r(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return U(hVar.l0(yVar.v(this.b, iA)));
            }
            if (i2 == 8) {
                return U(hVar.l0(yVar.v(B.s(iA), this.c)));
            }
            if (i2 == 9) {
                return U(hVar.l0(iA));
            }
        }
        return U(hVar.c(j, qVar));
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final A y(j$.time.temporal.m mVar) {
        return (A) super.y(mVar);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final o a() {
        return y.d;
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f, j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (qVar instanceof j$.time.temporal.a) {
            return qVar.isDateBased();
        }
        return qVar != null && qVar.j(this);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return this.a.equals(((A) obj).a);
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        int iR;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        int i = z.a[((j$.time.temporal.a) qVar).ordinal()];
        j$.time.h hVar = this.a;
        switch (i) {
            case 2:
                iR = this.c != 1 ? hVar.R() : (hVar.R() - this.b.n().R()) + 1;
                break;
            case 3:
                iR = this.c;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
            case 8:
                iR = this.b.getValue();
                break;
            default:
                return hVar.g(qVar);
        }
        return iR;
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final int hashCode() {
        y.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        int iW;
        long jT;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        if (!e(qVar)) {
            throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = z.a[aVar.ordinal()];
        j$.time.h hVar = this.a;
        if (i != 1) {
            if (i == 2) {
                B bR = this.b.r();
                if (bR == null || bR.n().T() != hVar.T()) {
                    iW = hVar.V() ? 366 : 365;
                } else {
                    iW = bR.n().R() - 1;
                }
                if (this.c == 1) {
                    iW -= this.b.n().R() - 1;
                }
            } else {
                if (i != 3) {
                    return y.d.r(aVar);
                }
                int iT = this.b.n().T();
                B bR2 = this.b.r();
                jT = bR2 != null ? (bR2.n().T() - iT) + 1 : 999999999 - iT;
            }
            return j$.time.temporal.u.j(1L, jT);
        }
        iW = hVar.W();
        jT = iW;
        return j$.time.temporal.u.j(1L, jT);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final InterfaceC1451f w(j$.time.s sVar) {
        return (A) super.w(sVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return (A) super.z(j, bVar);
    }
}
