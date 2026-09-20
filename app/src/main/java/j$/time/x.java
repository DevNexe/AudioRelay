package j$.time;

import com.facebook.ads.AdError;
import j$.time.chrono.AbstractC1449d;
import j$.time.chrono.AbstractC1450e;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements j$.time.temporal.k, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    static {
        j$.time.format.r rVar = new j$.time.format.r();
        rVar.j(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.z.EXCEEDS_PAD);
        rVar.e('-');
        rVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        rVar.s();
    }

    private x(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    static x P(DataInput dataInput) throws IOException {
        int i = dataInput.readInt();
        byte b = dataInput.readByte();
        j$.time.temporal.a.YEAR.N(i);
        j$.time.temporal.a.MONTH_OF_YEAR.N(b);
        return new x(i, b);
    }

    private x Q(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new x(i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 12, this);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.e()) {
            return j$.time.chrono.v.d;
        }
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.MONTHS : j$.time.temporal.p.c(this, rVar);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final x d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (x) sVar.j(this, j);
        }
        switch (w.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return N(j);
            case 2:
                return O(j);
            case 3:
                return O(a.f(j, 10));
            case 4:
                return O(a.f(j, 100));
            case 5:
                return O(a.f(j, AdError.NETWORK_ERROR_CODE));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(a.d(g(aVar), j), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final x N(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        long j3 = 12;
        return Q(j$.time.temporal.a.YEAR.M(a.g(j2, j3)), ((int) a.e(j2, j3)) + 1);
    }

    public final x O(long j) {
        return j == 0 ? this : Q(j$.time.temporal.a.YEAR.M(((long) this.a) + j), this.b);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final x c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (x) qVar.G(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.N(j);
        int i = w.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.N(i3);
            return Q(i2, i3);
        }
        int i4 = this.b;
        if (i == 2) {
            return N(j - (((((long) i2) * 12) + ((long) i4)) - 1));
        }
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.N(i5);
            return Q(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.N(i6);
            return Q(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        if (g(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.N(i7);
        return Q(i7, i4);
    }

    final void S(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        int i = this.a - xVar.a;
        return i == 0 ? this.b - xVar.b : i;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA;
        }
        return qVar != null && qVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && this.b == xVar.b;
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        int i = w.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        int i3 = this.a;
        if (i == 2) {
            return ((((long) i3) * 12) + ((long) i2)) - 1;
        }
        if (i == 3) {
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return i3;
        }
        if (i == 4) {
            return i3;
        }
        if (i == 5) {
            return i3 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        return l(qVar).a(g(qVar), qVar);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.k y(h hVar) {
        return (x) AbstractC1450e.a(hVar, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.p.d(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        if (!((AbstractC1449d) AbstractC1450e.s(kVar)).equals(j$.time.chrono.v.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return kVar.c(((((long) this.a) * 12) + ((long) this.b)) - 1, j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final String toString() {
        int i;
        int i2 = this.a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(9);
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
            sb.append(i2);
        }
        int i3 = this.b;
        sb.append(i3 < 10 ? "-0" : "-");
        sb.append(i3);
        return sb.toString();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }
}
