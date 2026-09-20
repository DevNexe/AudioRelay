package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sp1 {
    public final long a;

    public /* synthetic */ sp1(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + b(j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sp1) {
            return this.a == ((sp1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return c(this.a);
    }
}
