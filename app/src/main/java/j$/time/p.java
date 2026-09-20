package j$.time;

import j$.time.chrono.AbstractC1449d;
import j$.time.chrono.AbstractC1450e;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    static {
        j$.time.format.r rVar = new j$.time.format.r();
        rVar.f("--");
        rVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        rVar.e('-');
        rVar.l(j$.time.temporal.a.DAY_OF_MONTH, 2);
        rVar.s();
    }

    private p(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    static p M(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        byte b2 = dataInput.readByte();
        n nVarP = n.P(b);
        if (nVarP == null) {
            throw new NullPointerException("month");
        }
        j$.time.temporal.a.DAY_OF_MONTH.N(b2);
        if (b2 <= nVarP.O()) {
            return new p(nVarP.getValue(), b2);
        }
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b2) + " is not valid for month " + nVarP.name());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 13, this);
    }

    @Override // j$.time.temporal.l
    public final Object G(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.p.e() ? j$.time.chrono.v.d : j$.time.temporal.p.c(this, rVar);
    }

    final void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        int i = this.a - pVar.a;
        return i == 0 ? this.b - pVar.b : i;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.DAY_OF_MONTH;
        }
        return qVar != null && qVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.b == pVar.b;
    }

    @Override // j$.time.temporal.l
    public final long g(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.z(this);
        }
        int i2 = o.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
            }
            i = this.a;
        }
        return i;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.q qVar) {
        return l(qVar).a(g(qVar), qVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        int i;
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.l();
        }
        if (qVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.p.d(this, qVar);
        }
        int i2 = this.a;
        n nVarP = n.P(i2);
        nVarP.getClass();
        int i3 = m.a[nVarP.ordinal()];
        if (i3 != 1) {
            i = (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return j$.time.temporal.u.k(i, n.P(i2).O());
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k p(j$.time.temporal.k kVar) {
        if (!((AbstractC1449d) AbstractC1450e.s(kVar)).equals(j$.time.chrono.v.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.k kVarC = kVar.c(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return kVarC.c(Math.min(kVarC.l(aVar).d(), this.b), aVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }
}
