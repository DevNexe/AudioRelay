package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fc4 {
    public final String a;

    public fc4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc4) && ur1.a(this.a, ((fc4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i5.b(new StringBuilder("ServerEndpoint(initialAddress="), this.a, ")");
    }
}
