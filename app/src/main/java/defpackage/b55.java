package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b55 {
    public static final b55 c = new b55(FWT.B(0), FWT.B(0));
    public final long a;
    public final long b;

    public b55(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b55)) {
            return false;
        }
        b55 b55Var = (b55) obj;
        return z55.a(this.a, b55Var.a) && z55.a(this.b, b55Var.b);
    }

    public final int hashCode() {
        return z55.d(this.b) + (z55.d(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) z55.e(this.a)) + ", restLine=" + ((Object) z55.e(this.b)) + ')';
    }
}
