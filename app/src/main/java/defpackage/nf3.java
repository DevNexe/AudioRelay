package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nf3 extends xl implements qv1 {
    public nf3(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nf3) {
            nf3 nf3Var = (nf3) obj;
            return c().equals(nf3Var.c()) && this.z.equals(nf3Var.z) && this.A.equals(nf3Var.A) && ur1.a(this.x, nf3Var.x);
        }
        if (obj instanceof qv1) {
            return obj.equals(a());
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode() + bl2.a(this.z, c().hashCode() * 31, 31);
    }

    public final String toString() {
        ev1 ev1VarA = a();
        return ev1VarA != this ? ev1VarA.toString() : i5.b(new StringBuilder("property "), this.z, " (Kotlin reflection is not available)");
    }

    public nf3() {
        super(xl.QnHx.w, null, null, null, false);
    }
}
