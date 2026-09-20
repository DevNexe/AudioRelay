package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1512k {
    private static final C1512k c = new C1512k();
    private final boolean a;
    private final long b;

    private C1512k() {
        this.a = false;
        this.b = 0L;
    }

    private C1512k(long j) {
        this.a = true;
        this.b = j;
    }

    public static C1512k a() {
        return c;
    }

    public static C1512k d(long j) {
        return new C1512k(j);
    }

    public final long b() {
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
        if (!(obj instanceof C1512k)) {
            return false;
        }
        C1512k c1512k = (C1512k) obj;
        boolean z = this.a;
        if (z && c1512k.a) {
            if (this.b == c1512k.b) {
                return true;
            }
        } else if (z == c1512k.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return this.a ? String.format("OptionalLong[%s]", Long.valueOf(this.b)) : "OptionalLong.empty";
    }
}
