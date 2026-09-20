package j$.time;

import com.facebook.ads.AdError;
import com.revenuecat.purchases.common.UtilsKt;
import j$.time.chrono.AbstractC1450e;
import j$.time.format.DateTimeFormatter;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.k, j$.time.temporal.m, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;
    public static final Instant c = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Instant M(long j, int i) {
        if ((((long) i) | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant N(j$.time.temporal.l lVar) {
        if (lVar instanceof Instant) {
            return (Instant) lVar;
        }
        if (lVar == null) {
            throw new NullPointerException("temporal");
        }
        try {
            return ofEpochSecond(lVar.g(j$.time.temporal.a.INSTANT_SECONDS), lVar.j(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    public static Instant O(long j) {
        long j2 = AdError.NETWORK_ERROR_CODE;
        return M(a.g(j, j2), ((int) a.e(j, j2)) * UtilsKt.MICROS_MULTIPLIER);
    }

    public static Instant P(long j) {
        return M(j, 0);
    }

    private Instant Q(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(a.d(a.d(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return M(a.d(j, a.g(j2, 1000000000L)), (int) a.e(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 2, this);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.i()) {
            return j$.time.temporal.b.NANOS;
        }
        if (rVar == j$.time.temporal.p.e() || rVar == j$.time.temporal.p.k() || rVar == j$.time.temporal.p.j() || rVar == j$.time.temporal.p.h() || rVar == j$.time.temporal.p.f() || rVar == j$.time.temporal.p.g()) {
            return null;
        }
        return rVar.g(this);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (Instant) sVar.j(this, j);
        }
        switch (f.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return Q(0L, j);
            case 2:
                return Q(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return Q(j / 1000, (j % 1000) * 1000000);
            case 4:
                return Q(j, 0L);
            case 5:
                return Q(a.f(j, 60), 0L);
            case 6:
                return Q(a.f(j, 3600), 0L);
            case 7:
                return Q(a.f(j, 43200), 0L);
            case 8:
                return Q(a.f(j, 86400), 0L);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final long S() {
        long jF;
        int i;
        int i2 = this.b;
        long j = this.a;
        if (j >= 0 || i2 <= 0) {
            jF = a.f(j, AdError.NETWORK_ERROR_CODE);
            i = i2 / UtilsKt.MICROS_MULTIPLIER;
        } else {
            jF = a.f(j + 1, AdError.NETWORK_ERROR_CODE);
            i = (i2 / UtilsKt.MICROS_MULTIPLIER) - AdError.NETWORK_ERROR_CODE;
        }
        return a.d(jF, i);
    }

    final void T(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.O(this, zoneOffset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r7 != r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r7 != r4) goto L26;
     */
    @Override // j$.time.temporal.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.k c(long r6, j$.time.temporal.q r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof j$.time.temporal.a
            if (r0 == 0) goto L53
            r0 = r8
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            r0.N(r6)
            int[] r1 = j$.time.f.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            long r2 = r5.a
            int r4 = r5.b
            if (r0 == r1) goto L46
            r1 = 2
            if (r0 == r1) goto L40
            r1 = 3
            if (r0 == r1) goto L37
            r1 = 4
            if (r0 != r1) goto L2b
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L51
            j$.time.Instant r6 = M(r6, r4)
            goto L59
        L2b:
            j$.time.temporal.t r6 = new j$.time.temporal.t
            java.lang.String r7 = "Unsupported field: "
            java.lang.String r7 = j$.time.c.a(r7, r8)
            r6.<init>(r7)
            throw r6
        L37:
            int r7 = (int) r6
            r6 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r7 * r6
            if (r7 == r4) goto L51
            goto L4c
        L40:
            int r7 = (int) r6
            int r7 = r7 * 1000
            if (r7 == r4) goto L51
            goto L4c
        L46:
            long r0 = (long) r4
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L51
            int r7 = (int) r6
        L4c:
            j$.time.Instant r6 = M(r2, r7)
            goto L59
        L51:
            r6 = r5
            goto L59
        L53:
            j$.time.temporal.k r6 = r8.G(r5, r6)
            j$.time.Instant r6 = (j$.time.Instant) r6
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.c(long, j$.time.temporal.q):j$.time.temporal.k");
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return qVar != null && qVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.a == instant.a && this.b == instant.b;
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        int i2 = f.a[((j$.time.temporal.a) qVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / AdError.NETWORK_ERROR_CODE;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
            }
            i = i3 / UtilsKt.MICROS_MULTIPLIER;
        }
        return i;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.p.d(this, qVar).a(qVar.z(this), qVar);
        }
        int i = f.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / AdError.NETWORK_ERROR_CODE;
        }
        if (i == 3) {
            return i2 / UtilsKt.MICROS_MULTIPLIER;
        }
        if (i == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.M(this.a);
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.k y(h hVar) {
        return (Instant) AbstractC1450e.a(hVar, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        return j$.time.temporal.p.d(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return kVar.c(this.a, j$.time.temporal.a.INSTANT_SECONDS).c(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public String toString() {
        return DateTimeFormatter.j.a(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }
}
