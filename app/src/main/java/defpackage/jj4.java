package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jj4 {
    public final ga0 a;
    public final ga0 b;
    public final ga0 c;

    public jj4() {
        this(0);
    }

    public jj4(int i) {
        lu3 lu3Var = mu3.a;
        xm0 xm0Var = new xm0(4);
        lu3 lu3Var2 = new lu3(xm0Var, xm0Var, xm0Var, xm0Var);
        xm0 xm0Var2 = new xm0(4);
        lu3 lu3Var3 = new lu3(xm0Var2, xm0Var2, xm0Var2, xm0Var2);
        xm0 xm0Var3 = new xm0(0);
        lu3 lu3Var4 = new lu3(xm0Var3, xm0Var3, xm0Var3, xm0Var3);
        this.a = lu3Var2;
        this.b = lu3Var3;
        this.c = lu3Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj4)) {
            return false;
        }
        jj4 jj4Var = (jj4) obj;
        return ur1.a(this.a, jj4Var.a) && ur1.a(this.b, jj4Var.b) && ur1.a(this.c, jj4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }
}
