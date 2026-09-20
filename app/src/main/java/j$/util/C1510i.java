package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1510i {
    private static final C1510i c = new C1510i();
    private final boolean a;
    private final double b;

    private C1510i() {
        this.a = false;
        this.b = Double.NaN;
    }

    private C1510i(double d) {
        this.a = true;
        this.b = d;
    }

    public static C1510i a() {
        return c;
    }

    public static C1510i d(double d) {
        return new C1510i(d);
    }

    public final double b() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1510i)) {
            return false;
        }
        C1510i c1510i = (C1510i) obj;
        boolean z = this.a;
        if (z && c1510i.a) {
            if (Double.compare(this.b, c1510i.b) == 0) {
                return true;
            }
        } else if (z == c1510i.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        return this.a ? String.format("OptionalDouble[%s]", Double.valueOf(this.b)) : "OptionalDouble.empty";
    }
}
