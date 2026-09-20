package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC1451f;

/* JADX INFO: loaded from: classes2.dex */
final class t implements j$.time.temporal.l {
    final /* synthetic */ InterfaceC1451f a;
    final /* synthetic */ j$.time.temporal.l b;
    final /* synthetic */ j$.time.chrono.o c;
    final /* synthetic */ ZoneId d;

    t(InterfaceC1451f interfaceC1451f, j$.time.temporal.l lVar, j$.time.chrono.o oVar, ZoneId zoneId) {
        this.a = interfaceC1451f;
        this.b = lVar;
        this.c = oVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.e()) {
            return this.c;
        }
        if (rVar == j$.time.temporal.p.k()) {
            return this.d;
        }
        return rVar == j$.time.temporal.p.i() ? this.b.G(rVar) : rVar.g(this);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        InterfaceC1451f interfaceC1451f = this.a;
        return (interfaceC1451f == null || !qVar.isDateBased()) ? this.b.e(qVar) : interfaceC1451f.e(qVar);
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        InterfaceC1451f interfaceC1451f = this.a;
        return (interfaceC1451f == null || !qVar.isDateBased()) ? this.b.g(qVar) : interfaceC1451f.g(qVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.q qVar) {
        return j$.time.temporal.p.a(this, qVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        InterfaceC1451f interfaceC1451f = this.a;
        return (interfaceC1451f == null || !qVar.isDateBased()) ? this.b.l(qVar) : interfaceC1451f.l(qVar);
    }
}
