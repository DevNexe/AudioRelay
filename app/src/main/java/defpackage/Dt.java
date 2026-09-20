package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class Dt<T> {
    public final String a;

    public Dt(String str) {
        this.a = str;
        if (str.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ur1.a(nl3.a(Dt.class), nl3.a(obj.getClass())) && ur1.a(this.a, ((Dt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AttributeKey: " + this.a;
    }
}
