package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC1451f;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends InterfaceC1451f> extends j$.time.temporal.k, Comparable<ChronoZonedDateTime<?>> {
    ZoneId D();

    long L();

    o a();

    j$.time.l b();

    InterfaceC1451f f();

    @Override // j$.time.temporal.l
    long g(j$.time.temporal.q qVar);

    ZoneOffset h();

    ChronoLocalDateTime q();

    Instant toInstant();

    ChronoZonedDateTime x(ZoneId zoneId);
}
