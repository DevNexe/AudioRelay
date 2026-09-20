package j$.time.chrono;

/* JADX INFO: loaded from: classes2.dex */
public enum u implements p {
    AH;

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object G(j$.time.temporal.r rVar) {
        return AbstractC1450e.o(this, rVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean e(j$.time.temporal.q qVar) {
        return AbstractC1450e.k(this, qVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ long g(j$.time.temporal.q qVar) {
        return AbstractC1450e.i(this, qVar);
    }

    @Override // j$.time.chrono.p
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.q qVar) {
        return AbstractC1450e.h(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.ERA ? j$.time.temporal.u.j(1L, 1L) : j$.time.temporal.p.d(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return AbstractC1450e.c(this, kVar);
    }
}
