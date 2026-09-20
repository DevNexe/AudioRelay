package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC1451f;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends InterfaceC1451f> extends j$.time.temporal.k, j$.time.temporal.m, Comparable<ChronoLocalDateTime<?>> {
    ChronoZonedDateTime A(ZoneId zoneId);

    o a();

    j$.time.l b();

    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    InterfaceC1451f f();

    long o(ZoneOffset zoneOffset);
}
