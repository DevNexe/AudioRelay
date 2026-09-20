package j$.time.chrono;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: j$.time.chrono.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1456k implements Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    private final o a;
    final int b;
    final int c;
    final int d;

    static {
        Collections.unmodifiableList(Arrays.asList(j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS));
    }

    C1456k(o oVar, int i, int i2, int i3) {
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.a.getId());
        dataOutput.writeInt(this.b);
        dataOutput.writeInt(this.c);
        dataOutput.writeInt(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1456k)) {
            return false;
        }
        C1456k c1456k = (C1456k) obj;
        if (this.b == c1456k.b && this.c == c1456k.c && this.d == c1456k.d) {
            if (((AbstractC1449d) this.a).equals(c1456k.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC1449d) this.a).hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    public final String toString() {
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        boolean z = i3 == 0 && i2 == 0 && i == 0;
        o oVar = this.a;
        if (z) {
            return ((AbstractC1449d) oVar).getId() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC1449d) oVar).getId());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    protected Object writeReplace() {
        return new H((byte) 9, this);
    }
}
