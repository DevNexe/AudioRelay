package j$.time;

import j$.time.chrono.InterfaceC1451f;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Serializable {
    public static final s d = new s(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    private final int a;
    private final int b;
    private final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Collections.unmodifiableList(Arrays.asList(j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS));
    }

    private s(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static s c(int i) {
        return (0 | i) == 0 ? d : new s(0, 0, i);
    }

    static s d(DataInput dataInput) throws IOException {
        int i = dataInput.readInt();
        int i2 = dataInput.readInt();
        int i3 = dataInput.readInt();
        return ((i | i2) | i3) == 0 ? d : new s(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 14, this);
    }

    public final j$.time.temporal.k a(InterfaceC1451f interfaceC1451f) {
        long jE;
        j$.time.temporal.b bVar;
        InterfaceC1451f interfaceC1451fD;
        if (interfaceC1451f == null) {
            throw new NullPointerException("temporal");
        }
        j$.time.chrono.o oVar = (j$.time.chrono.o) interfaceC1451f.G(j$.time.temporal.p.e());
        if (oVar != null && !j$.time.chrono.v.d.equals(oVar)) {
            throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + oVar.getId());
        }
        if (this.b == 0) {
            int i = this.a;
            if (i != 0) {
                interfaceC1451fD = interfaceC1451f;
                jE = i;
                bVar = j$.time.temporal.b.YEARS;
                interfaceC1451fD = interfaceC1451f.d(jE, (j$.time.temporal.s) bVar);
            }
        } else {
            jE = e();
            if (jE != 0) {
                interfaceC1451fD = interfaceC1451f;
                bVar = j$.time.temporal.b.MONTHS;
                interfaceC1451fD = interfaceC1451f.d(jE, (j$.time.temporal.s) bVar);
            }
        }
        interfaceC1451fD = interfaceC1451f;
        interfaceC1451fD = interfaceC1451f;
        int i2 = this.c;
        return i2 != 0 ? interfaceC1451fD.d(i2, (j$.time.temporal.s) j$.time.temporal.b.DAYS) : interfaceC1451fD;
    }

    public final int b() {
        return this.c;
    }

    public final long e() {
        return (((long) this.a) * 12) + ((long) this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.b == sVar.b && this.c == sVar.c;
    }

    final void f(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a);
        dataOutput.writeInt(this.b);
        dataOutput.writeInt(this.c);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
