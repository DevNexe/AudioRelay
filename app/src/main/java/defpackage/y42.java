package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y42 {
    public final d53 a;

    public y42(d53 d53Var) {
        this.a = d53Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof y42)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return ur1.a(this.a.a(), ((y42) obj).a.a());
    }

    public final int hashCode() {
        return this.a.a().hashCode();
    }

    public final String toString() {
        return this.a.a();
    }
}
