package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1511j {
    private static final C1511j c = new C1511j();
    private final boolean a;
    private final int b;

    private C1511j() {
        this.a = false;
        this.b = 0;
    }

    private C1511j(int i) {
        this.a = true;
        this.b = i;
    }

    public static C1511j a() {
        return c;
    }

    public static C1511j d(int i) {
        return new C1511j(i);
    }

    public final int b() {
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
        if (!(obj instanceof C1511j)) {
            return false;
        }
        C1511j c1511j = (C1511j) obj;
        boolean z = this.a;
        if (z && c1511j.a) {
            if (this.b == c1511j.b) {
                return true;
            }
        } else if (z == c1511j.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final String toString() {
        return this.a ? String.format("OptionalInt[%s]", Integer.valueOf(this.b)) : "OptionalInt.empty";
    }
}
