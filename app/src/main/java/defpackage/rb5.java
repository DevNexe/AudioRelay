package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class rb5 {
    public final fv1<?> a;
    public final Type b;
    public final sv1 c;

    public rb5(Type type, ar arVar, xb5 xb5Var) {
        this.a = arVar;
        this.b = type;
        this.c = xb5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb5)) {
            return false;
        }
        rb5 rb5Var = (rb5) obj;
        return ur1.a(this.a, rb5Var.a) && ur1.a(this.b, rb5Var.b) && ur1.a(this.c, rb5Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        sv1 sv1Var = this.c;
        return iHashCode + (sv1Var == null ? 0 : sv1Var.hashCode());
    }

    public final String toString() {
        return "TypeInfo(type=" + this.a + ", reifiedType=" + this.b + ", kotlinType=" + this.c + ')';
    }
}
