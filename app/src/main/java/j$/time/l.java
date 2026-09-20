package j$.time;

import com.facebook.ads.AdError;
import com.revenuecat.purchases.common.UtilsKt;
import j$.time.chrono.AbstractC1450e;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements j$.time.temporal.k, j$.time.temporal.m, Comparable, Serializable {
    public static final l e;
    public static final l f;
    public static final l g;
    private static final l[] h = new l[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            l[] lVarArr = h;
            if (i >= lVarArr.length) {
                l lVar = lVarArr[0];
                g = lVar;
                l lVar2 = lVarArr[12];
                e = lVar;
                f = new l(23, 59, 59, 999999999);
                return;
            }
            lVarArr[i] = new l(i, 0, 0, 0);
            i++;
        }
    }

    private l(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    private static l N(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new l(i, i2, i3, i4);
    }

    public static l O(j$.time.temporal.l lVar) {
        if (lVar == null) {
            throw new NullPointerException("temporal");
        }
        l lVar2 = (l) lVar.G(j$.time.temporal.p.g());
        if (lVar2 != null) {
            return lVar2;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    private int P(j$.time.temporal.q qVar) {
        int i = k.a[((j$.time.temporal.a) qVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / AdError.NETWORK_ERROR_CODE;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / UtilsKt.MICROS_MULTIPLIER;
            case 6:
                return (int) (d0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return e0();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    public static l T(int i) {
        j$.time.temporal.a.HOUR_OF_DAY.N(i);
        return h[i];
    }

    public static l U(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.N(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.N(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.N(i3);
        j$.time.temporal.a.NANO_OF_SECOND.N(i4);
        return N(i, i2, i3, i4);
    }

    public static l V(long j) {
        j$.time.temporal.a.NANO_OF_DAY.N(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return N(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static l W(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.N(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return N(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    static l c0(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        int i4 = 0;
        if (i3 >= 0) {
            byte b = dataInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i2 = 0;
                i4 = i5;
                i = 0;
            } else {
                byte b2 = dataInput.readByte();
                if (b2 < 0) {
                    i = ~b2;
                    i4 = b;
                } else {
                    int i6 = dataInput.readInt();
                    i = b2;
                    i2 = i6;
                    i4 = b;
                }
            }
            return U(i3, i4, i, i2);
        }
        i3 = ~i3;
        i = 0;
        i2 = 0;
        return U(i3, i4, i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 4, this);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.e() || rVar == j$.time.temporal.p.k() || rVar == j$.time.temporal.p.j() || rVar == j$.time.temporal.p.h()) {
            return null;
        }
        if (rVar == j$.time.temporal.p.g()) {
            return this;
        }
        if (rVar == j$.time.temporal.p.f()) {
            return null;
        }
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.NANOS : rVar.g(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        int iCompare = Integer.compare(this.a, lVar.a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.b, lVar.b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(this.c, lVar.c);
        return iCompare3 == 0 ? Integer.compare(this.d, lVar.d) : iCompare3;
    }

    public final int Q() {
        return this.a;
    }

    public final int R() {
        return this.d;
    }

    public final int S() {
        return this.c;
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final l d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (l) sVar.j(this, j);
        }
        switch (k.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return a0(j);
            case 2:
                return a0((j % 86400000000L) * 1000);
            case 3:
                return a0((j % 86400000) * 1000000);
            case 4:
                return b0(j);
            case 5:
                return Z(j);
            case 6:
                return Y(j);
            case 7:
                return Y((j % 2) * 12);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final l Y(long j) {
        if (j == 0) {
            return this;
        }
        return N(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final l Z(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : N(i2 / 60, i2 % 60, this.c, this.d);
    }

    public final l a0(long j) {
        if (j == 0) {
            return this;
        }
        long jD0 = d0();
        long j2 = (((j % 86400000000000L) + jD0) + 86400000000000L) % 86400000000000L;
        return jD0 == j2 ? this : N((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    public final l b0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : N(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
    }

    public final long d0() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar.isTimeBased();
        }
        return qVar != null && qVar.j(this);
    }

    public final int e0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b == lVar.b && this.c == lVar.c && this.d == lVar.d;
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final l c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (l) qVar.G(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.N(j);
        int i = k.a[aVar.ordinal()];
        byte b = this.b;
        byte b2 = this.c;
        int i2 = this.d;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return g0((int) j);
            case 2:
                return V(j);
            case 3:
                return g0(((int) j) * AdError.NETWORK_ERROR_CODE);
            case 4:
                return V(j * 1000);
            case 5:
                return g0(((int) j) * UtilsKt.MICROS_MULTIPLIER);
            case 6:
                return V(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b2 == i3) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.N(i3);
                return N(b3, b, i3, i2);
            case 8:
                return b0(j - ((long) e0()));
            case 9:
                int i4 = (int) j;
                if (b == i4) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.N(i4);
                return N(b3, i4, b2, i2);
            case 10:
                return Z(j - ((long) ((b3 * 60) + b)));
            case 11:
                return Y(j - ((long) (b3 % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return Y(j - ((long) (b3 % 12)));
            case 13:
                int i5 = (int) j;
                if (b3 == i5) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.N(i5);
                return N(i5, b, b2, i2);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 == i6) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.N(i6);
                return N(i6, b, b2, i2);
            case 15:
                return Y((j - ((long) (b3 / 12))) * 12);
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        if (qVar == j$.time.temporal.a.NANO_OF_DAY) {
            return d0();
        }
        return qVar == j$.time.temporal.a.MICRO_OF_DAY ? d0() / 1000 : P(qVar);
    }

    public final l g0(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.N(i);
        return N(this.a, this.b, this.c, i);
    }

    final void h0(DataOutput dataOutput) throws IOException {
        int i;
        byte b = this.c;
        byte b2 = this.b;
        byte b3 = this.a;
        int i2 = this.d;
        if (i2 != 0) {
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i2);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b2);
            i = ~b;
        } else if (b2 == 0) {
            i = ~b3;
        } else {
            dataOutput.writeByte(b3);
            i = ~b2;
        }
        dataOutput.writeByte(i);
    }

    public final int hashCode() {
        long jD0 = d0();
        return (int) (jD0 ^ (jD0 >>> 32));
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? P(qVar) : j$.time.temporal.p.a(this, qVar);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.k y(h hVar) {
        boolean z = hVar instanceof l;
        j$.time.temporal.k kVarA = hVar;
        if (!z) {
            kVarA = AbstractC1450e.a(hVar, this);
        }
        return (l) kVarA;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        return j$.time.temporal.p.d(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return kVar.c(d0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i2 = this.d;
        if (b3 > 0 || i2 > 0) {
            sb.append(b3 >= 10 ? ":" : ":0");
            sb.append((int) b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = UtilsKt.MICROS_MULTIPLIER;
                if (i2 % UtilsKt.MICROS_MULTIPLIER == 0) {
                    i = (i2 / UtilsKt.MICROS_MULTIPLIER) + AdError.NETWORK_ERROR_CODE;
                } else {
                    if (i2 % AdError.NETWORK_ERROR_CODE == 0) {
                        i2 /= AdError.NETWORK_ERROR_CODE;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }
}
