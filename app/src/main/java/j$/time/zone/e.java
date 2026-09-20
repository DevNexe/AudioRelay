package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.v;
import j$.time.l;
import j$.time.n;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final n a;
    private final byte b;
    private final j$.time.d c;
    private final l d;
    private final boolean e;
    private final d f;
    private final ZoneOffset g;
    private final ZoneOffset h;
    private final ZoneOffset i;

    e(n nVar, int i, j$.time.d dVar, l lVar, boolean z, d dVar2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = nVar;
        this.b = (byte) i;
        this.c = dVar;
        this.d = lVar;
        this.e = z;
        this.f = dVar2;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    static e b(DataInput dataInput) {
        ZoneOffset zoneOffsetU;
        ZoneOffset zoneOffsetU2;
        int i = dataInput.readInt();
        n nVarP = n.P(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        j$.time.d dVarM = i3 == 0 ? null : j$.time.d.M(i3);
        int i4 = (507904 & i) >>> 14;
        d dVar = d.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        l lVarW = i4 == 31 ? l.W(dataInput.readInt()) : l.T(i4 % 24);
        ZoneOffset zoneOffsetU3 = ZoneOffset.U(i5 == 255 ? dataInput.readInt() : (i5 - 128) * 900);
        if (i6 == 3) {
            zoneOffsetU = ZoneOffset.U(dataInput.readInt());
        } else {
            zoneOffsetU = ZoneOffset.U((i6 * 1800) + zoneOffsetU3.S());
        }
        ZoneOffset zoneOffset = zoneOffsetU;
        if (i7 == 3) {
            zoneOffsetU2 = ZoneOffset.U(dataInput.readInt());
        } else {
            zoneOffsetU2 = ZoneOffset.U((i7 * 1800) + zoneOffsetU3.S());
        }
        boolean z = i4 == 24;
        if (nVarP == null) {
            throw new NullPointerException("month");
        }
        if (lVarW == null) {
            throw new NullPointerException("time");
        }
        if (dVar == null) {
            throw new NullPointerException("timeDefnition");
        }
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (!z || lVarW.equals(l.g)) {
            return new e(nVarP, i2, dVarM, lVarW, z, dVar, zoneOffsetU3, zoneOffset, zoneOffsetU2);
        }
        throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final b a(int i) {
        j$.time.h hVarZ;
        j$.time.temporal.n nVar;
        int iS;
        ZoneOffset zoneOffset;
        j$.time.d dVar = this.c;
        n nVar2 = this.a;
        byte b = this.b;
        if (b < 0) {
            v.d.getClass();
            hVarZ = j$.time.h.Z(i, nVar2, nVar2.N(v.P(i)) + 1 + b);
            if (dVar != null) {
                nVar = new j$.time.temporal.n(dVar.getValue(), 1);
                hVarZ = hVarZ.k(nVar);
            }
        } else {
            hVarZ = j$.time.h.Z(i, nVar2, b);
            if (dVar != null) {
                nVar = new j$.time.temporal.n(dVar.getValue(), 0);
                hVarZ = hVarZ.k(nVar);
            }
        }
        if (this.e) {
            hVarZ = hVarZ.d0(1L);
        }
        LocalDateTime localDateTimeV = LocalDateTime.V(hVarZ, this.d);
        d dVar2 = this.f;
        dVar2.getClass();
        int i2 = c.a[dVar2.ordinal()];
        ZoneOffset zoneOffset2 = this.h;
        if (i2 != 1) {
            if (i2 == 2) {
                iS = zoneOffset2.S();
                zoneOffset = this.g;
            }
            return new b(localDateTimeV, zoneOffset2, this.i);
        }
        iS = zoneOffset2.S();
        zoneOffset = ZoneOffset.UTC;
        localDateTimeV = localDateTimeV.Z(iS - zoneOffset.S());
        return new b(localDateTimeV, zoneOffset2, this.i);
    }

    final void c(DataOutput dataOutput) {
        int iQ;
        l lVar = this.d;
        boolean z = this.e;
        int iE0 = z ? 86400 : lVar.e0();
        int iS = this.g.S();
        ZoneOffset zoneOffset = this.h;
        int iS2 = zoneOffset.S() - iS;
        ZoneOffset zoneOffset2 = this.i;
        int iS3 = zoneOffset2.S() - iS;
        if (iE0 % 3600 == 0) {
            iQ = z ? 24 : lVar.Q();
        } else {
            iQ = 31;
        }
        int i = iS % 900 == 0 ? (iS / 900) + 128 : 255;
        int i2 = (iS2 == 0 || iS2 == 1800 || iS2 == 3600) ? iS2 / 1800 : 3;
        int i3 = (iS3 == 0 || iS3 == 1800 || iS3 == 3600) ? iS3 / 1800 : 3;
        j$.time.d dVar = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dVar == null ? 0 : dVar.getValue()) << 19) + (iQ << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (iQ == 31) {
            dataOutput.writeInt(iE0);
        }
        if (i == 255) {
            dataOutput.writeInt(iS);
        }
        if (i2 == 3) {
            dataOutput.writeInt(zoneOffset.S());
        }
        if (i3 == 3) {
            dataOutput.writeInt(zoneOffset2.S());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int iE0 = ((this.d.e0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.d dVar = this.c;
        return ((this.g.hashCode() ^ (this.f.ordinal() + (iE0 + ((dVar == null ? 7 : dVar.ordinal()) << 2)))) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        sb.append(zoneOffset.Q(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        byte b = this.b;
        n nVar = this.a;
        j$.time.d dVar = this.c;
        if (dVar == null) {
            sb.append(nVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(dVar.name());
            sb.append(" on or before last day of ");
            sb.append(nVar.name());
        } else if (b < 0) {
            sb.append(dVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(nVar.name());
        } else {
            sb.append(dVar.name());
            sb.append(" on or after ");
            sb.append(nVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
