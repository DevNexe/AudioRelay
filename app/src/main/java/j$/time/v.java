package j$.time;

import com.facebook.ads.AdError;
import j$.time.chrono.AbstractC1449d;
import j$.time.chrono.AbstractC1450e;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements j$.time.temporal.k, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    static {
        new j$.time.format.r().j(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.z.EXCEEDS_PAD).s();
    }

    private v(int i) {
        this.a = i;
    }

    public static v M(int i) {
        j$.time.temporal.a.YEAR.N(i);
        return new v(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 11, this);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.e()) {
            return j$.time.chrono.v.d;
        }
        return rVar == j$.time.temporal.p.i() ? j$.time.temporal.b.YEARS : j$.time.temporal.p.c(this, rVar);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final v d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (v) sVar.j(this, j);
        }
        int i = u.b[((j$.time.temporal.b) sVar).ordinal()];
        if (i == 1) {
            return O(j);
        }
        if (i == 2) {
            return O(a.f(j, 10));
        }
        if (i == 3) {
            return O(a.f(j, 100));
        }
        if (i == 4) {
            return O(a.f(j, AdError.NETWORK_ERROR_CODE));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return c(a.d(g(aVar), j), aVar);
        }
        throw new j$.time.temporal.t("Unsupported unit: " + sVar);
    }

    public final v O(long j) {
        return j == 0 ? this : M(j$.time.temporal.a.YEAR.M(((long) this.a) + j));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final v c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (v) qVar.G(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.N(j);
        int i = u.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return M((int) j);
        }
        if (i == 2) {
            return M((int) j);
        }
        if (i == 3) {
            return g(j$.time.temporal.a.ERA) == j ? this : M(1 - i2);
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    final void Q(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((v) obj).a;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA;
        }
        return qVar != null && qVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.a == ((v) obj).a;
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        int i = u.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        return l(qVar).a(g(qVar), qVar);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.k y(h hVar) {
        return (v) AbstractC1450e.a(hVar, this);
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
        return kVar.c(this.a, j$.time.temporal.a.YEAR);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k z(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }
}
