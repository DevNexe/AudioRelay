package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u74 {
    public final eb1 a;
    public final long b;

    public u74(eb1 eb1Var, long j) {
        this.a = eb1Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u74)) {
            return false;
        }
        u74 u74Var = (u74) obj;
        return this.a == u74Var.a && kt2.a(this.b, u74Var.b);
    }

    public final int hashCode() {
        return kt2.e(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) kt2.i(this.b)) + ')';
    }
}
