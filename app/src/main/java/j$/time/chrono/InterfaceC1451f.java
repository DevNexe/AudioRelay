package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1451f extends j$.time.temporal.k, j$.time.temporal.m, Comparable {
    long E();

    ChronoLocalDateTime F(j$.time.l lVar);

    p H();

    /* JADX INFO: renamed from: K */
    int compareTo(InterfaceC1451f interfaceC1451f);

    o a();

    @Override // j$.time.temporal.k
    InterfaceC1451f c(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.k
    InterfaceC1451f d(long j, j$.time.temporal.s sVar);

    @Override // j$.time.temporal.l
    boolean e(j$.time.temporal.q qVar);

    boolean equals(Object obj);

    int hashCode();

    String toString();

    InterfaceC1451f w(j$.time.s sVar);

    InterfaceC1451f y(j$.time.temporal.m mVar);
}
