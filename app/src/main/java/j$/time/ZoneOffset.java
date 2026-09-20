package j$.time;

import j$.time.zone.ZoneRules;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements j$.time.temporal.l, j$.time.temporal.m, Comparable<ZoneOffset> {
    private static final long serialVersionUID = 2357656521762053153L;
    private final int b;
    private final transient String c;
    private static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentHashMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = U(0);
    public static final ZoneOffset f = U(-64800);
    public static final ZoneOffset g = U(64800);

    private ZoneOffset(int i) {
        String string;
        this.b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 >= 10 ? ":" : ":0");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.c = string;
    }

    public static ZoneOffset R(j$.time.temporal.l lVar) {
        if (lVar == null) {
            throw new NullPointerException("temporal");
        }
        ZoneOffset zoneOffset = (ZoneOffset) lVar.G(j$.time.temporal.p.h());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    public static ZoneOffset T(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        return U((i2 * 60) + (i * 3600) + i3);
    }

    public static ZoneOffset U(int i) {
        if (i < -64800 || i > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 != 0) {
            return new ZoneOffset(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = d;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
        e.putIfAbsent(zoneOffset2.c, zoneOffset2);
        return zoneOffset2;
    }

    private static int V(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char cCharAt = charSequence.charAt(i);
        char cCharAt2 = charSequence.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    static ZoneOffset W(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? U(dataInput.readInt()) : U(b * 900);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    public static ZoneOffset of(String str) {
        int iV;
        int iV2;
        int iV3;
        char cCharAt;
        if (str == null) {
            throw new NullPointerException("offsetId");
        }
        ZoneOffset zoneOffset = (ZoneOffset) e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length != 5) {
                    if (length == 6) {
                        iV = V(str, 1, false);
                        iV2 = V(str, 4, true);
                    } else if (length == 7) {
                        iV = V(str, 1, false);
                        iV2 = V(str, 3, false);
                        iV3 = V(str, 5, false);
                    } else {
                        if (length != 9) {
                            throw new DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                        }
                        iV = V(str, 1, false);
                        iV2 = V(str, 4, true);
                        iV3 = V(str, 7, true);
                    }
                    cCharAt = str.charAt(0);
                    if (cCharAt != '+' || cCharAt == '-') {
                        return cCharAt == '-' ? T(-iV, -iV2, -iV3) : T(iV, iV2, iV3);
                    }
                    throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                iV = V(str, 1, false);
                iV2 = V(str, 3, false);
            }
            iV3 = 0;
            cCharAt = str.charAt(0);
            if (cCharAt != '+') {
            }
            if (cCharAt == '-') {
            }
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iV = V(str, 1, false);
        iV2 = 0;
        iV3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 8, this);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        return (rVar == j$.time.temporal.p.h() || rVar == j$.time.temporal.p.j()) ? this : j$.time.temporal.p.c(this, rVar);
    }

    @Override // j$.time.ZoneId
    final void P(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        X(dataOutput);
    }

    public final int Q(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    public final int S() {
        return this.b;
    }

    final void X(DataOutput dataOutput) {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return qVar != null && qVar.j(this);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.b == ((ZoneOffset) obj).b;
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        return qVar.z(this);
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.c;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        return ZoneRules.h(this);
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.b;
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        return j$.time.temporal.p.d(this, qVar).a(g(qVar), qVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        return j$.time.temporal.p.d(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return kVar.c(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.c;
    }
}
