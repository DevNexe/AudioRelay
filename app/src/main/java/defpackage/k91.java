package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class k91 extends xl implements j91, iv1 {
    public final int D;
    public final int E;

    public k91(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.D = i;
        this.E = i2 >> 1;
    }

    @Override // defpackage.xl
    public final ev1 b() {
        nl3.a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k91) {
            k91 k91Var = (k91) obj;
            return this.z.equals(k91Var.z) && this.A.equals(k91Var.A) && this.E == k91Var.E && this.D == k91Var.D && ur1.a(this.x, k91Var.x) && ur1.a(c(), k91Var.c());
        }
        if (obj instanceof iv1) {
            return obj.equals(a());
        }
        return false;
    }

    @Override // defpackage.j91
    public final int getArity() {
        return this.D;
    }

    public final int hashCode() {
        return this.A.hashCode() + bl2.a(this.z, c() == null ? 0 : c().hashCode() * 31, 31);
    }

    public final String toString() {
        ev1 ev1VarA = a();
        if (ev1VarA != this) {
            return ev1VarA.toString();
        }
        String str = this.z;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : fc2.a("function ", str, " (Kotlin reflection is not available)");
    }
}
