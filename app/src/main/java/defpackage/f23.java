package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f23 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof f23) {
            return this.a == ((f23) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return ex0.c(new StringBuilder("PhoneState(value="), this.a, ")");
    }
}
