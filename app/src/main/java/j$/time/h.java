package j$.time;

import com.facebook.ads.AdError;
import j$.time.chrono.AbstractC1450e;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.InterfaceC1451f;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements j$.time.temporal.k, j$.time.temporal.m, InterfaceC1451f, Serializable {
    public static final h d = Y(-999999999, 1, 1);
    public static final h e = Y(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;

    private h(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    private static h N(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.v.d.getClass();
                if (j$.time.chrono.v.P(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + n.P(i2).name() + " " + i3 + "'");
            }
        }
        return new h(i, i2, i3);
    }

    public static h O(j$.time.temporal.l lVar) {
        if (lVar == null) {
            throw new NullPointerException("temporal");
        }
        h hVar = (h) lVar.G(j$.time.temporal.p.f());
        if (hVar != null) {
            return hVar;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    private int P(j$.time.temporal.q qVar) {
        int i;
        int i2 = g.a[((j$.time.temporal.a) qVar).ordinal()];
        int i3 = this.a;
        short s = this.c;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return R();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return Q().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((R() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((R() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        return i + 1;
    }

    public static h X(Clock clock) {
        Instant instant = clock.instant();
        return a0(a.g(instant.getEpochSecond() + ((long) clock.a().getRules().d(instant).S()), 86400));
    }

    public static h Y(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.N(i);
        j$.time.temporal.a.MONTH_OF_YEAR.N(i2);
        j$.time.temporal.a.DAY_OF_MONTH.N(i3);
        return N(i, i2, i3);
    }

    public static h Z(int i, n nVar, int i2) {
        j$.time.temporal.a.YEAR.N(i);
        if (nVar == null) {
            throw new NullPointerException("month");
        }
        j$.time.temporal.a.DAY_OF_MONTH.N(i2);
        return N(i, nVar.getValue(), i2);
    }

    public static h a0(long j) {
        long j2;
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new h(j$.time.temporal.a.YEAR.M(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static h b0(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.N(j);
        j$.time.temporal.a.DAY_OF_YEAR.N(i2);
        j$.time.chrono.v.d.getClass();
        boolean zP = j$.time.chrono.v.P(j);
        if (i2 == 366 && !zP) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        n nVarP = n.P(((i2 - 1) / 31) + 1);
        if (i2 > (nVarP.N(zP) + nVarP.M(zP)) - 1) {
            nVarP = nVarP.Q();
        }
        return new h(i, nVarP.getValue(), (i2 - nVarP.M(zP)) + 1);
    }

    private static h h0(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new h(i, i2, i3);
        }
        j$.time.chrono.v.d.getClass();
        i4 = j$.time.chrono.v.P((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new h(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final long E() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5--;
            if (!V()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final ChronoLocalDateTime F(l lVar) {
        return LocalDateTime.V(this, lVar);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.p.f() ? this : AbstractC1450e.l(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final j$.time.chrono.p H() {
        return this.a >= 1 ? j$.time.chrono.w.CE : j$.time.chrono.w.BCE;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC1451f interfaceC1451f) {
        return interfaceC1451f instanceof h ? M((h) interfaceC1451f) : AbstractC1450e.d(this, interfaceC1451f);
    }

    final int M(h hVar) {
        int i = this.a - hVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - hVar.b;
        return i2 == 0 ? this.c - hVar.c : i2;
    }

    public final d Q() {
        return d.M(((int) a.e(E() + 3, 7)) + 1);
    }

    public final int R() {
        return (n.P(this.b).M(V()) + this.c) - 1;
    }

    public final int S() {
        return this.b;
    }

    public final int T() {
        return this.a;
    }

    public final boolean U(h hVar) {
        if (hVar instanceof h) {
            return M(hVar) < 0;
        }
        return E() < hVar.E();
    }

    public final boolean V() {
        j$.time.chrono.v vVar = j$.time.chrono.v.d;
        long j = this.a;
        vVar.getClass();
        return j$.time.chrono.v.P(j);
    }

    public final int W() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return V() ? 29 : 28;
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final j$.time.chrono.o a() {
        return j$.time.chrono.v.d;
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final h d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (h) sVar.j(this, j);
        }
        switch (g.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return d0(j);
            case 2:
                return f0(j);
            case 3:
                return e0(j);
            case 4:
                return g0(j);
            case 5:
                return g0(a.f(j, 10));
            case 6:
                return g0(a.f(j, 100));
            case 7:
                return g0(a.f(j, AdError.NETWORK_ERROR_CODE));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(a.d(g(aVar), j), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final h d0(long j) {
        return j == 0 ? this : a0(a.d(E(), j));
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        return AbstractC1450e.j(this, qVar);
    }

    public final h e0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        long j3 = 12;
        return h0(j$.time.temporal.a.YEAR.M(a.g(j2, j3)), ((int) a.e(j2, j3)) + 1, this.c);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && M((h) obj) == 0;
    }

    public final h f0(long j) {
        return d0(a.f(j, 7));
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        if (qVar == j$.time.temporal.a.EPOCH_DAY) {
            return E();
        }
        return qVar == j$.time.temporal.a.PROLEPTIC_MONTH ? ((((long) this.a) * 12) + ((long) this.b)) - 1 : P(qVar);
    }

    public final h g0(long j) {
        return j == 0 ? this : h0(j$.time.temporal.a.YEAR.M(((long) this.a) + j), this.b, this.c);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final h c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (h) qVar.G(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.N(j);
        int i = g.a[aVar.ordinal()];
        short s = this.b;
        short s2 = this.c;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                return s2 == i3 ? this : Y(i2, s, i3);
            case 2:
                return k0((int) j);
            case 3:
                return f0(j - g(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return l0((int) j);
            case 5:
                return d0(j - ((long) Q().getValue()));
            case 6:
                return d0(j - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return d0(j - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return a0(j);
            case 9:
                return f0(j - g(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i4 = (int) j;
                if (s == i4) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.N(i4);
                return h0(i2, i4, s2);
            case 11:
                return e0(j - (((((long) i2) * 12) + ((long) s)) - 1));
            case 12:
                return l0((int) j);
            case 13:
                return g(j$.time.temporal.a.ERA) == j ? this : l0(1 - i2);
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? P(qVar) : j$.time.temporal.p.a(this, qVar);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h y(j$.time.temporal.m mVar) {
        return mVar instanceof h ? (h) mVar : (h) mVar.p(this);
    }

    public final h k0(int i) {
        return R() == i ? this : b0(this.a, i);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        int iW;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        int i = g.a[aVar.ordinal()];
        if (i == 1) {
            iW = W();
        } else {
            if (i != 2) {
                if (i == 3) {
                    return j$.time.temporal.u.j(1L, (n.P(this.b) != n.FEBRUARY || V()) ? 5L : 4L);
                }
                if (i != 4) {
                    return qVar.l();
                }
                return j$.time.temporal.u.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
            }
            iW = V() ? 366 : 365;
        }
        return j$.time.temporal.u.j(1L, iW);
    }

    public final h l0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.N(i);
        return h0(i, this.b, this.c);
    }

    final void m0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return AbstractC1450e.a(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final String toString() {
        int i;
        int i2 = this.a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 >= 10 ? "-" : "-0");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public final InterfaceC1451f w(s sVar) {
        if (sVar instanceof s) {
            return e0(sVar.e()).d0(sVar.b());
        }
        if (sVar != null) {
            return (h) sVar.a(this);
        }
        throw new NullPointerException("amountToAdd");
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }
}
