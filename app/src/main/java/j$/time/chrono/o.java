package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface o extends Comparable {
    InterfaceC1451f B(j$.time.temporal.l lVar);

    ChronoLocalDateTime C(LocalDateTime localDateTime);

    InterfaceC1451f I(int i, int i2, int i3);

    ChronoZonedDateTime J(Instant instant, ZoneId zoneId);

    String getId();

    InterfaceC1451f i(long j);

    String m();

    InterfaceC1451f n(int i, int i2);

    j$.time.temporal.u r(j$.time.temporal.a aVar);

    List s();

    p t(int i);

    InterfaceC1451f u(HashMap map, j$.time.format.y yVar);

    int v(p pVar, int i);
}
