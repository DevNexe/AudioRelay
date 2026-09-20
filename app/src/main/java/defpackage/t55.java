package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t55 {
    public final long a;
    public final long b;

    public t55(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t55)) {
            return false;
        }
        t55 t55Var = (t55) obj;
        return yu.c(this.a, t55Var.a) && yu.c(this.b, t55Var.b);
    }

    public final int hashCode() {
        int i = yu.i;
        return xc5.a(this.b) + (xc5.a(this.a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) yu.i(this.a)) + ", selectionBackgroundColor=" + ((Object) yu.i(this.b)) + ')';
    }
}
