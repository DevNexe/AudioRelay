package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Comparable, Serializable {
    public static final e c = new e(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;
    private final long a;
    private final int b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private e(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static e j(long j, int i) {
        return (((long) i) | j) == 0 ? c : new e(j, i);
    }

    public static e l(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return j(j2, i);
    }

    public static e p(long j) {
        return j(j, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 1, this);
    }

    public static e z(long j, long j2) {
        return j(a.d(j, a.g(j2, 1000000000L)), (int) a.e(j2, 1000000000L));
    }

    final void G(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        int iCompare = Long.compare(this.a, eVar.a);
        return iCompare != 0 ? iCompare : this.b - eVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final long k() {
        return this.a;
    }

    public final String toString() {
        if (this == c) {
            return "PT0S";
        }
        long j = this.a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        int i3 = this.b;
        if (i2 == 0 && i3 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || i3 <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (i3 > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - ((long) i3));
            } else {
                sb.append(((long) i3) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
