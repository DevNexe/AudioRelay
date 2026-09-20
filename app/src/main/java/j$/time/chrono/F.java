package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends AbstractC1453h {
    private static final long serialVersionUID = 1300372329181994526L;
    private final transient j$.time.h a;

    F(j$.time.h hVar) {
        if (hVar == null) {
            throw new NullPointerException("isoDate");
        }
        this.a = hVar;
    }

    private int R() {
        return this.a.T() - 1911;
    }

    private F T(j$.time.h hVar) {
        return hVar.equals(this.a) ? this : new F(hVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new H((byte) 7, this);
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
        return R() >= 1 ? G.ROC : G.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC1453h
    /* JADX INFO: renamed from: N */
    public final InterfaceC1451f z(long j, j$.time.temporal.b bVar) {
        return (F) super.z(j, bVar);
    }

    @Override // j$.time.chrono.AbstractC1453h
    final InterfaceC1451f O(long j) {
        return T(this.a.d0(j));
    }

    @Override // j$.time.chrono.AbstractC1453h
    final InterfaceC1451f P(long j) {
        return T(this.a.e0(j));
    }

    @Override // j$.time.chrono.AbstractC1453h
    final InterfaceC1451f Q(long j) {
        return T(this.a.g0(j));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final F c(long j, j$.time.temporal.q qVar) {
        int iA;
        int i;
        int i2;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (F) super.c(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (g(aVar) == j) {
            return this;
        }
        int[] iArr = E.a;
        int i3 = iArr[aVar.ordinal()];
        j$.time.h hVar = this.a;
        if (i3 == 4) {
            iA = D.d.r(aVar).a(j, aVar);
            i = iArr[aVar.ordinal()];
            if (i != 4) {
                if (R() >= 1) {
                    i2 = iA + 1911;
                } else {
                    i2 = (1 - iA) + 1911;
                }
                return T(hVar.l0(i2));
            }
            if (i != 6) {
                return T(hVar.l0(iA + 1911));
            }
            if (i == 7) {
                return T(hVar.l0((1 - R()) + 1911));
            }
        } else {
            if (i3 == 5) {
                D.d.r(aVar).b(j, aVar);
                return T(hVar.e0(j - (((((long) R()) * 12) + ((long) hVar.S())) - 1)));
            }
            if (i3 == 6 || i3 == 7) {
                iA = D.d.r(aVar).a(j, aVar);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    if (R() >= 1) {
                        i2 = iA + 1911;
                    } else {
                        i2 = (1 - iA) + 1911;
                    }
                    return T(hVar.l0(i2));
                }
                if (i != 6) {
                    return T(hVar.l0(iA + 1911));
                }
                if (i == 7) {
                    return T(hVar.l0((1 - R()) + 1911));
                }
            }
        }
        return T(hVar.c(j, qVar));
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final o a() {
        return D.d;
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f, j$.time.temporal.k
    public final InterfaceC1451f d(long j, j$.time.temporal.s sVar) {
        return (F) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    public final j$.time.temporal.k d(long j, j$.time.temporal.s sVar) {
        return (F) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return this.a.equals(((F) obj).a);
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        int i = E.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 4) {
            int iR = R();
            if (iR < 1) {
                iR = 1 - iR;
            }
            return iR;
        }
        j$.time.h hVar = this.a;
        if (i == 5) {
            return ((((long) R()) * 12) + ((long) hVar.S())) - 1;
        }
        if (i == 6) {
            return R();
        }
        if (i != 7) {
            return hVar.g(qVar);
        }
        return R() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final int hashCode() {
        D.d.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.k y(j$.time.h hVar) {
        return (F) super.y(hVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        if (!AbstractC1450e.j(this, qVar)) {
            throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = E.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(qVar);
        }
        if (i != 4) {
            return D.d.r(aVar);
        }
        j$.time.temporal.u uVarL = j$.time.temporal.a.YEAR.l();
        return j$.time.temporal.u.j(1L, R() <= 0 ? (-uVarL.e()) + 1 + 1911 : uVarL.d() - 1911);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final InterfaceC1451f w(j$.time.s sVar) {
        return (F) super.w(sVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.chrono.InterfaceC1451f
    public final InterfaceC1451f y(j$.time.temporal.m mVar) {
        return (F) super.y(mVar);
    }

    @Override // j$.time.chrono.AbstractC1453h, j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return (F) super.z(j, bVar);
    }
}
