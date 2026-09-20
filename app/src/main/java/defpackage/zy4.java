package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zy4 {
    public final String a;

    public zy4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy4) && ur1.a(this.a, ((zy4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i5.b(new StringBuilder("SystemErrorId(value="), this.a, ")");
    }
}
