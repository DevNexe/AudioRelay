package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class re0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof re0) {
            return this.a == ((re0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DataIndex(value=" + this.a + ')';
    }
}
