package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t50 {
    public final String a;

    public t50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t50) && ur1.a(this.a, ((t50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i5.b(new StringBuilder("Connection(address="), this.a, ")");
    }
}
