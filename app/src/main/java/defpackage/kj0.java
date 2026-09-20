package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kj0 {
    public final Class<?> a;
    public final int b;
    public final int c;

    public kj0(int i, int i2, Class cls) {
        this.a = cls;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kj0)) {
            return false;
        }
        kj0 kj0Var = (kj0) obj;
        return this.a == kj0Var.a && this.b == kj0Var.b && this.c == kj0Var.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(GM.a("Unsupported injection: ", i2));
            }
            str2 = "deferred";
        }
        return i5.b(sb, str2, "}");
    }
}
