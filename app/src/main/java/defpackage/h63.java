package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h63 {
    public final i63 a;

    public h63() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h63) && ur1.a(this.a, ((h63) obj).a);
    }

    public final int hashCode() {
        i63 i63Var = this.a;
        if (i63Var == null) {
            return 0;
        }
        return i63Var.hashCode();
    }

    public final String toString() {
        return "State(viewState=" + this.a + ")";
    }

    public h63(i63 i63Var) {
        this.a = i63Var;
    }
}
