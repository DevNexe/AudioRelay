package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class os0 {
    public final String a;

    public os0(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os0)) {
            return false;
        }
        return this.a.equals(((os0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return i5.b(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
