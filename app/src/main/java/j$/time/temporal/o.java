package j$.time.temporal;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements m, r {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.r
    public final Object g(l lVar) {
        o oVar = p.a;
        switch (this.a) {
            case 1:
                return (ZoneId) lVar.G(oVar);
            case 2:
                return (j$.time.chrono.o) lVar.G(p.b);
            case 3:
                return (s) lVar.G(p.c);
            case 4:
                a aVar = a.OFFSET_SECONDS;
                if (lVar.e(aVar)) {
                    return ZoneOffset.U(lVar.j(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) lVar.G(oVar);
                return zoneId != null ? zoneId : (ZoneId) lVar.G(p.d);
            case 6:
                a aVar2 = a.EPOCH_DAY;
                if (lVar.e(aVar2)) {
                    return j$.time.h.a0(lVar.g(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (lVar.e(aVar3)) {
                    return j$.time.l.V(lVar.g(aVar3));
                }
                return null;
        }
    }

    @Override // j$.time.temporal.m
    public final k p(k kVar) {
        a aVar = a.DAY_OF_MONTH;
        return kVar.c(kVar.l(aVar).d(), aVar);
    }
}
