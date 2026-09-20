package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mp1 {
    public static final long b = C0239D.d(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ mp1(long j) {
        this.a = j;
    }

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static String b(long j) {
        return "(" + ((int) (j >> 32)) + ", " + a(j) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mp1) {
            return this.a == ((mp1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return b(this.a);
    }
}
