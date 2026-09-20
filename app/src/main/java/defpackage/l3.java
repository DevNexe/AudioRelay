package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l3 extends bc0.NUlFixed.YKK {
    public final String a;

    public l3(String str) {
        this.a = str;
    }

    @Override // bc0.NUlFixed.YKK
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bc0.NUlFixed.YKK) {
            return this.a.equals(((bc0.NUlFixed.YKK) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return i5.b(new StringBuilder("User{identifier="), this.a, "}");
    }
}
