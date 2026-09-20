package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC1450e;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneOffset c;

    b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.a = LocalDateTime.W(j, 0, zoneOffset);
        this.b = zoneOffset;
        this.c = zoneOffset2;
    }

    b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    final List G() {
        return M() ? Collections.emptyList() : Arrays.asList(this.b, this.c);
    }

    public final long L() {
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return AbstractC1450e.p(localDateTime, this.b);
    }

    public final boolean M() {
        return this.c.S() > this.b.S();
    }

    final void N(DataOutput dataOutput) {
        a.c(L(), dataOutput);
        a.d(this.b, dataOutput);
        a.d(this.c, dataOutput);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        Instant instantR = AbstractC1450e.r(localDateTime, this.b);
        LocalDateTime localDateTime2 = bVar.a;
        localDateTime2.getClass();
        return instantR.compareTo(AbstractC1450e.r(localDateTime2, bVar.b));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 16);
    }

    public final LocalDateTime j() {
        return this.a.Z(this.c.S() - this.b.S());
    }

    public final LocalDateTime k() {
        return this.a;
    }

    public final j$.time.e l() {
        return j$.time.e.p(this.c.S() - this.b.S());
    }

    public final ZoneOffset p() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(M() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.a);
        sb.append(this.b);
        sb.append(" to ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }

    public final ZoneOffset z() {
        return this.b;
    }
}
