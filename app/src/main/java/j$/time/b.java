package j$.time;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class b extends Clock implements Serializable {
    private static final long serialVersionUID = 6740630888130243051L;
    private final ZoneId a;

    b(ZoneId zoneId) {
        this.a = zoneId;
    }

    @Override // j$.time.Clock
    public final ZoneId a() {
        return this.a;
    }

    @Override // j$.time.Clock
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // j$.time.Clock
    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    @Override // j$.time.Clock
    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    @Override // j$.time.Clock
    public final Instant instant() {
        return Instant.O(System.currentTimeMillis());
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }
}
