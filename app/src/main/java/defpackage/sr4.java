package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sr4 {
    public final t50 a;

    public sr4(t50 t50Var) {
        this.a = t50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sr4) && ur1.a(this.a, ((sr4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StartOptions(connection=" + this.a + ")";
    }
}
