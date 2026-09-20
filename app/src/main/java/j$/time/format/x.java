package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC1449d;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1451f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class x implements j$.time.temporal.l {
    ZoneId b;
    j$.time.chrono.o c;
    private y d;
    private InterfaceC1451f e;
    private j$.time.l f;
    final HashMap a = new HashMap();
    j$.time.s g = j$.time.s.d;

    x() {
    }

    private void i(j$.time.temporal.l lVar) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.q qVar = (j$.time.temporal.q) entry.getKey();
            if (lVar.e(qVar)) {
                try {
                    long jG = lVar.g(qVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jG != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + qVar + " " + jG + " differs from " + qVar + " " + jLongValue + " derived from " + lVar);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private void n() {
        HashMap map = this.a;
        if (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                p(zoneId);
                return;
            }
            Long l = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                p(ZoneOffset.U(l.intValue()));
            }
        }
    }

    private void p(ZoneId zoneId) {
        HashMap map = this.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        ChronoZonedDateTime chronoZonedDateTimeJ = this.c.J(Instant.P(((Long) map.remove(aVar)).longValue()), zoneId);
        u(chronoZonedDateTimeJ.f());
        v(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(chronoZonedDateTimeJ.b().e0()));
    }

    private void r(long j, long j2, long j3, long j4) {
        j$.time.l lVarU;
        j$.time.s sVarC;
        if (this.d == y.LENIENT) {
            long jD = j$.time.a.d(j$.time.a.d(j$.time.a.d(j$.time.a.f(j, 3600000000000L), j$.time.a.f(j2, 60000000000L)), j$.time.a.f(j3, 1000000000L)), j4);
            int iG = (int) j$.time.a.g(jD, 86400000000000L);
            lVarU = j$.time.l.V(j$.time.a.e(jD, 86400000000000L));
            sVarC = j$.time.s.c(iG);
        } else {
            int iM = j$.time.temporal.a.MINUTE_OF_HOUR.M(j2);
            int iM2 = j$.time.temporal.a.NANO_OF_SECOND.M(j4);
            if (this.d == y.SMART && j == 24 && iM == 0 && j3 == 0 && iM2 == 0) {
                lVarU = j$.time.l.g;
                sVarC = j$.time.s.c(1);
            } else {
                lVarU = j$.time.l.U(j$.time.temporal.a.HOUR_OF_DAY.M(j), iM, j$.time.temporal.a.SECOND_OF_MINUTE.M(j3), iM2);
                sVarC = j$.time.s.d;
            }
        }
        t(lVarU, sVarC);
    }

    private void s() {
        j$.time.temporal.a aVar;
        long jD;
        HashMap map = this.a;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar2)) {
            long jLongValue = ((Long) map.remove(aVar2)).longValue();
            y yVar = this.d;
            if (yVar == y.STRICT || (yVar == y.SMART && jLongValue != 0)) {
                aVar2.N(jLongValue);
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            v(aVar2, aVar3, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar4)) {
            long jLongValue2 = ((Long) map.remove(aVar4)).longValue();
            y yVar2 = this.d;
            if (yVar2 == y.STRICT || (yVar2 == y.SMART && jLongValue2 != 0)) {
                aVar4.N(jLongValue2);
            }
            v(aVar4, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar5 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar5)) {
            j$.time.temporal.a aVar6 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar6)) {
                long jLongValue3 = ((Long) map.remove(aVar5)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar6)).longValue();
                if (this.d == y.LENIENT) {
                    aVar = j$.time.temporal.a.HOUR_OF_DAY;
                    jD = j$.time.a.d(j$.time.a.f(jLongValue3, 12), jLongValue4);
                } else {
                    aVar5.N(jLongValue3);
                    aVar6.N(jLongValue3);
                    aVar = j$.time.temporal.a.HOUR_OF_DAY;
                    jD = (jLongValue3 * 12) + jLongValue4;
                }
                v(aVar5, aVar, Long.valueOf(jD));
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue5 = ((Long) map.remove(aVar7)).longValue();
            if (this.d != y.LENIENT) {
                aVar7.N(jLongValue5);
            }
            v(aVar7, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            v(aVar7, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            v(aVar7, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            v(aVar7, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue6 = ((Long) map.remove(aVar8)).longValue();
            if (this.d != y.LENIENT) {
                aVar8.N(jLongValue6);
            }
            v(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            v(aVar8, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue7 = ((Long) map.remove(aVar9)).longValue();
            if (this.d != y.LENIENT) {
                aVar9.N(jLongValue7);
            }
            v(aVar9, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            v(aVar9, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue8 = ((Long) map.remove(aVar10)).longValue();
            if (this.d != y.LENIENT) {
                aVar10.N(jLongValue8);
            }
            v(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            v(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            v(aVar10, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar11)) {
            long jLongValue9 = ((Long) map.remove(aVar11)).longValue();
            if (this.d != y.LENIENT) {
                aVar11.N(jLongValue9);
            }
            v(aVar11, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            v(aVar11, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar12 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar12)) {
            long jLongValue10 = ((Long) map.get(aVar12)).longValue();
            y yVar3 = this.d;
            y yVar4 = y.LENIENT;
            if (yVar3 != yVar4) {
                aVar12.N(jLongValue10);
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue11 = ((Long) map.remove(aVar13)).longValue();
                if (this.d != yVar4) {
                    aVar13.N(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                v(aVar13, aVar12, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar14 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar14)) {
                long jLongValue12 = ((Long) map.remove(aVar14)).longValue();
                if (this.d != yVar4) {
                    aVar14.N(jLongValue12);
                }
                v(aVar14, aVar12, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar15 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar15)) {
            j$.time.temporal.a aVar16 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar16)) {
                j$.time.temporal.a aVar17 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar17) && map.containsKey(aVar12)) {
                    r(((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar17)).longValue(), ((Long) map.remove(aVar12)).longValue());
                }
            }
        }
    }

    private void t(j$.time.l lVar, j$.time.s sVar) {
        j$.time.l lVar2 = this.f;
        if (lVar2 == null) {
            this.f = lVar;
        } else {
            if (!lVar2.equals(lVar)) {
                throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.f + " " + lVar);
            }
            j$.time.s sVar2 = this.g;
            sVar2.getClass();
            j$.time.s sVar3 = j$.time.s.d;
            if (!(sVar2 == sVar3)) {
                if (!(sVar == sVar3) && !this.g.equals(sVar)) {
                    throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.g + " " + sVar);
                }
            }
        }
        this.g = sVar;
    }

    private void u(InterfaceC1451f interfaceC1451f) {
        InterfaceC1451f interfaceC1451f2 = this.e;
        if (interfaceC1451f2 != null) {
            if (interfaceC1451f == null || interfaceC1451f2.equals(interfaceC1451f)) {
                return;
            }
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.e + " " + interfaceC1451f);
        }
        if (interfaceC1451f != null) {
            if (((AbstractC1449d) this.c).equals(interfaceC1451f.a())) {
                this.e = interfaceC1451f;
            } else {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.c);
            }
        }
    }

    private void v(j$.time.temporal.a aVar, j$.time.temporal.a aVar2, Long l) {
        Long l2 = (Long) this.a.put(aVar2, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + aVar2 + " " + l2 + " differs from " + aVar2 + " " + l + " while resolving  " + aVar);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.p.k()) {
            return this.b;
        }
        if (rVar == j$.time.temporal.p.e()) {
            return this.c;
        }
        if (rVar == j$.time.temporal.p.f()) {
            InterfaceC1451f interfaceC1451f = this.e;
            if (interfaceC1451f != null) {
                return j$.time.h.O(interfaceC1451f);
            }
            return null;
        }
        if (rVar == j$.time.temporal.p.g()) {
            return this.f;
        }
        if (rVar == j$.time.temporal.p.j() || rVar == j$.time.temporal.p.h()) {
            return rVar.g(this);
        }
        if (rVar == j$.time.temporal.p.i()) {
            return null;
        }
        return rVar.g(this);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        InterfaceC1451f interfaceC1451f;
        j$.time.l lVar;
        return this.a.containsKey(qVar) || ((interfaceC1451f = this.e) != null && interfaceC1451f.e(qVar)) || (((lVar = this.f) != null && lVar.e(qVar)) || !(qVar == null || (qVar instanceof j$.time.temporal.a) || !qVar.j(this)));
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (qVar == null) {
            throw new NullPointerException("field");
        }
        Long l = (Long) this.a.get(qVar);
        if (l != null) {
            return l.longValue();
        }
        InterfaceC1451f interfaceC1451f = this.e;
        if (interfaceC1451f != null && interfaceC1451f.e(qVar)) {
            return this.e.g(qVar);
        }
        j$.time.l lVar = this.f;
        if (lVar != null && lVar.e(qVar)) {
            return this.f.g(qVar);
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
        return qVar.z(this);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.q qVar) {
        return j$.time.temporal.p.a(this, qVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ j$.time.temporal.u l(j$.time.temporal.q qVar) {
        return j$.time.temporal.p.d(this, qVar);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x01d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01db  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final void m(y yVar, Set set) {
        j$.time.temporal.q qVar;
        j$.time.l lVar;
        ChronoZonedDateTime chronoZonedDateTimeA;
        j$.time.temporal.a aVar;
        j$.time.temporal.a aVar2;
        Long lValueOf;
        j$.time.temporal.q qVar2;
        HashMap map = this.a;
        if (set != null) {
            map.keySet().retainAll(set);
        }
        this.d = yVar;
        n();
        u(this.c.u(map, this.d));
        s();
        if (map.size() > 0) {
            int i = 0;
            loop0: while (i < 50) {
                Iterator it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    qVar2 = (j$.time.temporal.q) ((Map.Entry) it.next()).getKey();
                    j$.time.temporal.l lVarP = qVar2.p(map, this, this.d);
                    if (lVarP != null) {
                        if (lVarP instanceof ChronoZonedDateTime) {
                            ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) lVarP;
                            ZoneId zoneId = this.b;
                            if (zoneId == null) {
                                this.b = chronoZonedDateTime.D();
                            } else if (!zoneId.equals(chronoZonedDateTime.D())) {
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.b);
                            }
                            lVarP = chronoZonedDateTime.q();
                        }
                        if (!(lVarP instanceof ChronoLocalDateTime)) {
                            if (!(lVarP instanceof InterfaceC1451f)) {
                                if (!(lVarP instanceof j$.time.l)) {
                                    throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                                }
                                t((j$.time.l) lVarP, j$.time.s.d);
                                break;
                            }
                            u((InterfaceC1451f) lVarP);
                            break;
                        }
                        ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) lVarP;
                        t(chronoLocalDateTime.b(), j$.time.s.d);
                        u(chronoLocalDateTime.f());
                        break;
                    }
                } while (map.containsKey(qVar2));
                i++;
            }
            if (i == 50) {
                throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i > 0) {
                n();
                u(this.c.u(map, this.d));
                s();
            }
        }
        long j = 0;
        if (this.f == null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar3)) {
                long jLongValue = ((Long) map.remove(aVar3)).longValue();
                j$.time.temporal.a aVar4 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(aVar4)) {
                    long jLongValue2 = (((Long) map.get(aVar4)).longValue() % 1000) + (jLongValue * 1000);
                    v(aVar3, aVar4, Long.valueOf(jLongValue2));
                    map.remove(aVar4);
                    aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                    lValueOf = Long.valueOf(jLongValue2 * 1000);
                } else {
                    aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                    lValueOf = Long.valueOf(jLongValue * 1000000);
                }
                map.put(aVar2, lValueOf);
            } else {
                Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(obj)) {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) map.remove(obj)).longValue() * 1000));
                }
            }
            Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l = (Long) map.get(obj2);
            if (l != null) {
                Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l2 = (Long) map.get(obj3);
                Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l3 = (Long) map.get(obj4);
                Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l4 = (Long) map.get(obj5);
                if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                    r(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                    map.remove(obj2);
                    map.remove(obj3);
                    map.remove(obj4);
                    map.remove(obj5);
                    if (this.d != y.LENIENT && map.size() > 0) {
                        for (Map.Entry entry : map.entrySet()) {
                            qVar = (j$.time.temporal.q) entry.getKey();
                            if (!(qVar instanceof j$.time.temporal.a) && qVar.isTimeBased()) {
                                ((j$.time.temporal.a) qVar).N(((Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
            } else if (this.d != y.LENIENT) {
                while (r0.hasNext()) {
                    qVar = (j$.time.temporal.q) entry.getKey();
                    if (!(qVar instanceof j$.time.temporal.a)) {
                    }
                }
            }
        } else if (this.d != y.LENIENT) {
            while (r0.hasNext()) {
                qVar = (j$.time.temporal.q) entry.getKey();
                if (!(qVar instanceof j$.time.temporal.a)) {
                }
            }
        }
        InterfaceC1451f interfaceC1451f = this.e;
        if (interfaceC1451f != null) {
            i(interfaceC1451f);
        }
        j$.time.l lVar2 = this.f;
        if (lVar2 != null) {
            i(lVar2);
            if (this.e != null && map.size() > 0) {
                i(this.e.F(this.f));
            }
        }
        if (this.e != null && this.f != null) {
            j$.time.s sVar = this.g;
            sVar.getClass();
            j$.time.s sVar2 = j$.time.s.d;
            if (!(sVar == sVar2)) {
                this.e = this.e.w(this.g);
                this.g = sVar2;
            }
        }
        if (this.f == null && (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || map.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || map.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.NANO_OF_SECOND;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.get(aVar5)).longValue();
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                aVar = j$.time.temporal.a.MILLI_OF_SECOND;
                j = jLongValue3 / 1000000;
            } else {
                map.put(aVar5, 0L);
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                aVar = j$.time.temporal.a.MILLI_OF_SECOND;
            }
            map.put(aVar, Long.valueOf(j));
        }
        InterfaceC1451f interfaceC1451f2 = this.e;
        if (interfaceC1451f2 == null || (lVar = this.f) == null) {
            return;
        }
        if (this.b != null) {
            chronoZonedDateTimeA = interfaceC1451f2.F(lVar).A(this.b);
        } else {
            Long l5 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l5 == null) {
                return;
            } else {
                chronoZonedDateTimeA = this.e.F(this.f).A(ZoneOffset.U(l5.intValue()));
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.INSTANT_SECONDS;
        map.put(aVar6, Long.valueOf(chronoZonedDateTimeA.g(aVar6)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.e != null || this.f != null) {
            sb.append(" resolved to ");
            InterfaceC1451f interfaceC1451f = this.e;
            if (interfaceC1451f != null) {
                sb.append(interfaceC1451f);
                if (this.f != null) {
                    sb.append('T');
                    sb.append(this.f);
                }
            } else {
                sb.append(this.f);
            }
        }
        return sb.toString();
    }
}
