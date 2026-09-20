package j$.time.chrono;

import com.facebook.ads.AdError;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1453h implements InterfaceC1451f, j$.time.temporal.k, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    AbstractC1453h() {
    }

    static InterfaceC1451f M(o oVar, j$.time.temporal.k kVar) {
        InterfaceC1451f interfaceC1451f = (InterfaceC1451f) kVar;
        AbstractC1449d abstractC1449d = (AbstractC1449d) oVar;
        if (abstractC1449d.equals(interfaceC1451f.a())) {
            return interfaceC1451f;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + abstractC1449d.getId() + ", actual: " + interfaceC1451f.a().getId());
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public long E() {
        return g(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public ChronoLocalDateTime F(j$.time.l lVar) {
        return C1455j.O(this, lVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object G(j$.time.temporal.r rVar) {
        return AbstractC1450e.l(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public p H() {
        return a().t(j(j$.time.temporal.a.ERA));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int compareTo(InterfaceC1451f interfaceC1451f) {
        return AbstractC1450e.d(this, interfaceC1451f);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public InterfaceC1451f z(long j, j$.time.temporal.b bVar) {
        return M(a(), j$.time.temporal.p.b(this, j, bVar));
    }

    abstract InterfaceC1451f O(long j);

    abstract InterfaceC1451f P(long j);

    abstract InterfaceC1451f Q(long j);

    @Override // j$.time.temporal.k
    public InterfaceC1451f c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
        return M(a(), qVar.G(this, j));
    }

    @Override // j$.time.temporal.k
    public InterfaceC1451f d(long j, j$.time.temporal.s sVar) {
        boolean z = sVar instanceof j$.time.temporal.b;
        if (!z) {
            if (!z) {
                return M(a(), sVar.j(this, j));
            }
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        switch (AbstractC1452g.a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return O(j);
            case 2:
                return O(j$.time.a.f(j, 7));
            case 3:
                return P(j);
            case 4:
                return Q(j);
            case 5:
                return Q(j$.time.a.f(j, 10));
            case 6:
                return Q(j$.time.a.f(j, 100));
            case 7:
                return Q(j$.time.a.f(j, AdError.NETWORK_ERROR_CODE));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.time.a.d(g(aVar), j), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    @Override // j$.time.chrono.InterfaceC1451f, j$.time.temporal.l
    public /* synthetic */ boolean e(j$.time.temporal.q qVar) {
        return AbstractC1450e.j(this, qVar);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1451f) && AbstractC1450e.d(this, (InterfaceC1451f) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public int hashCode() {
        long jE = E();
        return ((AbstractC1449d) a()).hashCode() ^ ((int) (jE ^ (jE >>> 32)));
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.q qVar) {
        return j$.time.temporal.p.a(this, qVar);
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ j$.time.temporal.u l(j$.time.temporal.q qVar) {
        return j$.time.temporal.p.d(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return AbstractC1450e.a(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public String toString() {
        long jG = g(j$.time.temporal.a.YEAR_OF_ERA);
        long jG2 = g(j$.time.temporal.a.MONTH_OF_YEAR);
        long jG3 = g(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(((AbstractC1449d) a()).getId());
        sb.append(" ");
        sb.append(H());
        sb.append(" ");
        sb.append(jG);
        sb.append(jG2 < 10 ? "-0" : "-");
        sb.append(jG2);
        sb.append(jG3 >= 10 ? "-" : "-0");
        sb.append(jG3);
        return sb.toString();
    }

    @Override // j$.time.chrono.InterfaceC1451f
    public InterfaceC1451f w(j$.time.s sVar) {
        return M(a(), sVar.a(this));
    }

    @Override // j$.time.temporal.k
    public InterfaceC1451f y(j$.time.temporal.m mVar) {
        return M(a(), mVar.p(this));
    }
}
