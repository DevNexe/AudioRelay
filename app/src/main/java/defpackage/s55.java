package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s55 {
    public static final long b = Cz.a(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ s55(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final boolean b(long j) {
        return ((int) (j >> 32)) == c(j);
    }

    public static final int c(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int d(long j) {
        int i = (int) (j >> 32);
        return i > c(j) ? i : c(j);
    }

    public static final int e(long j) {
        int i = (int) (j >> 32);
        return i > c(j) ? c(j) : i;
    }

    public static final boolean f(long j) {
        return ((int) (j >> 32)) > c(j);
    }

    public static String g(long j) {
        return "TextRange(" + ((int) (j >> 32)) + ", " + c(j) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s55) {
            return this.a == ((s55) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return g(this.a);
    }
}
