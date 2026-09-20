package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC1451f;
import j$.util.AbstractC1514m;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class u {
    private j$.time.temporal.l a;
    private DateTimeFormatter b;
    private int c;

    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00b1, please report this as an issue */
    u(j$.time.temporal.l lVar, DateTimeFormatter dateTimeFormatter) {
        int i;
        j$.time.chrono.o oVarB = dateTimeFormatter.b();
        ZoneId zoneIdE = dateTimeFormatter.e();
        if (oVarB != null || zoneIdE != null) {
            j$.time.chrono.o oVar = (j$.time.chrono.o) lVar.G(j$.time.temporal.p.e());
            ZoneId zoneId = (ZoneId) lVar.G(j$.time.temporal.p.k());
            InterfaceC1451f interfaceC1451fB = null;
            oVarB = AbstractC1514m.p(oVarB, oVar) ? null : oVarB;
            zoneIdE = AbstractC1514m.p(zoneIdE, zoneId) ? null : zoneIdE;
            if (oVarB != null || zoneIdE != null) {
                j$.time.chrono.o oVar2 = oVarB != null ? oVarB : oVar;
                if (zoneIdE == null) {
                    zoneId = zoneIdE != null ? zoneIdE : zoneId;
                    if (oVarB != null) {
                        if (lVar.e(j$.time.temporal.a.EPOCH_DAY)) {
                            interfaceC1451fB = oVar2.B(lVar);
                        } else if (oVarB == j$.time.chrono.v.d || oVar != null) {
                            for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                                if (!aVar.isDateBased() && lVar.e(aVar)) {
                                    throw new DateTimeException("Unable to apply override chronology '" + oVarB + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + lVar);
                                }
                            }
                        }
                    }
                    lVar = new t(interfaceC1451fB, lVar, oVar2, zoneId);
                } else if (lVar.e(j$.time.temporal.a.INSTANT_SECONDS)) {
                    lVar = (oVar2 == null ? j$.time.chrono.v.d : oVar2).J(Instant.N(lVar), zoneIdE);
                } else {
                    if (zoneIdE.normalized() instanceof ZoneOffset) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                        if (lVar.e(aVar2) && lVar.j(aVar2) != zoneIdE.getRules().d(Instant.c).S()) {
                            throw new DateTimeException("Unable to apply override zone '" + zoneIdE + "' because the temporal object being formatted has a different offset but does not represent an instant: " + lVar);
                        }
                    }
                    if (zoneIdE != null) {
                    }
                    if (oVarB != null) {
                        if (lVar.e(j$.time.temporal.a.EPOCH_DAY)) {
                            interfaceC1451fB = oVar2.B(lVar);
                        } else if (oVarB == j$.time.chrono.v.d) {
                            while (i < r2) {
                                if (!aVar.isDateBased()) {
                                }
                            }
                        } else {
                            while (i < r2) {
                                if (!aVar.isDateBased()) {
                                }
                            }
                        }
                    }
                    lVar = new t(interfaceC1451fB, lVar, oVar2, zoneId);
                }
            }
        }
        this.a = lVar;
        this.b = dateTimeFormatter;
    }

    final void a() {
        this.c--;
    }

    final w b() {
        return this.b.c();
    }

    final Locale c() {
        return this.b.d();
    }

    final j$.time.temporal.l d() {
        return this.a;
    }

    final Long e(j$.time.temporal.q qVar) {
        try {
            return Long.valueOf(this.a.g(qVar));
        } catch (DateTimeException e) {
            if (this.c > 0) {
                return null;
            }
            throw e;
        }
    }

    final Object f(j$.time.temporal.r rVar) {
        Object objG = this.a.G(rVar);
        if (objG != null || this.c != 0) {
            return objG;
        }
        throw new DateTimeException("Unable to extract value: " + this.a.getClass());
    }

    final void g() {
        this.c++;
    }

    public final String toString() {
        return this.a.toString();
    }
}
